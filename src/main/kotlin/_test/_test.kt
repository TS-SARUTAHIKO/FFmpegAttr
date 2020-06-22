package _test

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter.filter_complex_
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.aiAttr
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.aoAttr
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.gAttr
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor.FFmpeg
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor.command
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor.ffmpeg
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.aresample
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.loudnorm
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.pan
import java.io.File


fun main(args: Array<String>) {

    val dir = "C:/Users/tshom_000/Downloads"

    FFmpeg.command("-y -i $dir/bgm.wav -filter_complex \"aresample=48000\" $dir/output.wav")


    FFmpeg.ffmpeg(
        gAttr {  },
        mapOf(
            aiAttr {  } to File(""),
            aoAttr {
                filter_complex_ { loudnorm() chain pan() chain aresample() }
            } to File("")
        ),
        true
    )

}
