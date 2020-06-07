package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility.getResourceAsStream
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility.out
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream
import kotlin.concurrent.thread

class FFmpeg(
    pathDir : File? = null,
    val mode : FFmpegMode = ffmpegMode,
    val waitFor : Boolean = false
){
    /** OS アーキテクチャに対応した接頭文字 (e.g. win32, win64) */
    var prefix : String
    /** OS アーキテクチャに対応した接尾文字 (e.g. .exe, -osx) */
    var suffix  : String

    /** 実行ファイルが存在するフォルダ */
    var pathDir : File
    /** 実行ファイルのパス */
    val path : String get(){
        return when( mode ){
            FFmpegMode.FFmpeg  -> File(pathDir, "ffmpeg$suffix").absolutePath
            FFmpegMode.FFplay  -> File(pathDir, "ffplay$suffix").absolutePath
            FFmpegMode.FFprobe -> File(pathDir, "ffprobe$suffix").absolutePath
        }
    }

    /** FFmpeg プロセスからの標準出力 */
    var normalStream : String = ""
    /** FFmpeg プロセスからのエラー出力 */
    var errorStream : String = ""


    init {
        // OS と アーキテクチャ を取得します
        val os = System.getProperty("os.name")
        val arch = System.getProperty("os.arch")

        // prefix と suffix を決定します
        when {
            os.contains("windows", true) && arch.contains("86") -> "win32" to ".exe"
            os.contains("windows", true) && arch.contains("64") -> "win64" to ".exe"
            else -> throw RuntimeException("OS : $os  Architecture : $arch は未対応" )
        }.apply {
            prefix = first
            suffix = second
        }


        // 実行ファイルが存在するフォルダを決定する
        if( pathDir != null ){
            this.pathDir = pathDir
        }else {
            // 一時ファイルの保存場所に専用領域を作成します
            this.pathDir = File(System.getProperty("java.io.tmpdir"), "FFmpegAttr/").apply {
                if( ! exists() ) mkdirs()
            }
        }

        // 実行ファイルが存在しない場合は resources からコピーします
        val (file, stream) = when( mode ){
            FFmpegMode.FFmpeg -> File(this.pathDir, "ffmpeg$suffix") to getResourceAsStream("$prefix/ffmpeg$suffix")
            FFmpegMode.FFplay -> File(this.pathDir, "ffplay$suffix") to getResourceAsStream("$prefix/ffplay$suffix")
            FFmpegMode.FFprobe -> File(this.pathDir, "ffprobe$suffix") to getResourceAsStream("$prefix/ffprobe$suffix")
        }
        stream.use{
            if( ! file.exists() ){
                FileOutputStream(file).use { stream.copyTo(it) }
            }
        }
    }

    /** 指定された引数で実行する */
    fun invoke(command : String, reader : FFmpeg.(InputStream, OutputStream, InputStream)->(Unit) = defreader ){
        // 実行する
        val process = Runtime.getRuntime().exec("$path $command")
        reader(process.inputStream, process.outputStream, process.errorStream)

        // プロセスの終了を待機する
        if( waitFor ) process.waitFor()
    }
    /** 指定された引数で実行する */
    fun invoke( gAttr : GenericAttributes = gAttr {  }, infiles : Map<InputAttributes, File> = mapOf(), outfiles : Map<OutputAttributes, File> = mapOf(), reader : FFmpeg.(InputStream, OutputStream, InputStream)->(Unit) = defreader ){
        invoke( Triple(gAttr, infiles, outfiles).toArguments.joinToString(" "), reader)
    }


    companion object {
        val ffmpegMode get() = FFmpegMode.FFmpeg
        val ffplayMode get() = FFmpegMode.FFplay
        val ffprobeMode get() = FFmpegMode.FFprobe

        /**
         * [invoke]関数を実行する際のデフォルトの defreader 関数
         *
         * 標準出力を [normalStream] エラー出力を [errorStream] に保存する
         * */
        private val defreader : FFmpeg.(InputStream, OutputStream, InputStream)->(Unit) = { input, _, error ->
            thread {
                input.bufferedReader().use {
                    do {
                        val line = it.readLine()
                        if( line != null ) normalStream += line + "\n"
                    }while ( line != null )
                }
                input.close()
            }
            thread {
                error.bufferedReader().use {
                    do {
                        val line = it.readLine()
                        if( line != null ) errorStream += line + "\n"
                    }while ( line != null )
                }
                error.close()
            }
        }
    }

    enum class FFmpegMode { FFmpeg, FFplay, FFprobe }
}
