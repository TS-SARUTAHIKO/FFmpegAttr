package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*
import java.io.File


/**
 * FFprobe を用いて入力ファイルを解析しその結果を返す関数
 *
 * 単一ファイルの検査のためのシンタックス・シュガー
 *
 * 複数ファイルを処理する場合や属性設定を行う場合は FFmpeg().ffprobe() を実行した後に FFmpeg.error から読み込みを行ってください
 * */
fun FFmpeg.Companion.ffprobe(infile : File) : String {
    return FFmpeg( mode = ffprobeMode, waitFor = true).run {
        invoke( infile.absolutePath )
        errorStream
    }
}

/**
 * シンプルな型変換
 *
 * 入力ファイルから出力ファイルに変換する
 *
 * 必要な情報はファイル形式から推測される
 *
 * オプションは [gInitializer] などで初期化したデフォルト属性が使用される
 * */
fun FFmpeg.Companion.convert(infile : File, outfile : File, waitFor: Boolean = true) : FFmpeg {
    return FFmpeg( mode = ffmpegMode, waitFor = waitFor ).apply {
        invoke( infiles = mapOf(iAttr {  } to infile), outfiles = mapOf(oAttr {  } to outfile) )
    }
}

/**
 * 文字列を引数にした実行関数
 * */
fun FFmpeg.Companion.command(command : String, waitFor: Boolean = true) : FFmpeg {
    return FFmpeg( mode = ffmpegMode, waitFor = waitFor ).apply {
        invoke(command)
    }
}

/**
 *
 * */
fun FFmpeg.Companion.ffmpeg(gAttr : GenericAttributes = gAttr { }, ioArguments : Map<IOAttributes, File>, waitFor: Boolean = true) : FFmpeg {
    return FFmpeg( mode = ffmpegMode, waitFor = waitFor ).apply {
        invoke(
            gAttr = gAttr,
            infiles = ioArguments.filterKeys { it is InputAttributes } as Map<InputAttributes, File>,
            outfiles = ioArguments.filterKeys { it is OutputAttributes } as Map<OutputAttributes, File>
        )
    }
}


