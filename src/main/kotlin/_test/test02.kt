package com.xxxsarutahikoxxx.kotlin.FFmpegAttr._test

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor.*

fun main(args: Array<String>) {
    val dir = "C:/Users/tshom_000/Downloads"

//    FFmpeg.ffmpeg(
//        gAttr {
//            y = true
//        },
//        mapOf(
//            aiAttr {  } to File("$dir/input.mp3"),
//
//            aoAttr {
//                metadata = "title=\"The Beatles\""
//                c = "copy"
//            } to File("$dir/output.mp3")
//        )
//    )

    FFmpeg.command("-y -i $dir/input.mp3 -metadata title=\"The Beatles\" $dir/output.mp3")
}
