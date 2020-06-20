package filters

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter.filter_complex_
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter.y
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.IOAttributes
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.aiAttr
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.aoAttr
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.gAttr
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor.FFmpeg
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor.ffmpeg
import java.io.File


/** 音声ファイルの合成 */
fun FFmpeg.Companion.amerge(outfile : File, infiles : List<File>){

    val map : MutableMap<IOAttributes, File> = mutableMapOf()
    infiles.forEach {
        map[ aiAttr {  } ] = it
    }
    map[ aoAttr {
        filter_complex_ { com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.amerge( infiles.size ) }
    } ] = outfile


    FFmpeg.ffmpeg(
        gAttr { y = true },
        map,
        true
    )
}
