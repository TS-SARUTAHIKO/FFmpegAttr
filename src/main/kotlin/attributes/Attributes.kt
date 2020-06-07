package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes

import java.io.File


interface IOAttributes : BaseAttributes
interface InputAttributes : IOAttributes
interface OutputAttributes : IOAttributes

interface AudioAttributes : BaseAttributes
interface VideoAttributes : BaseAttributes
interface SubtitleAttributes : BaseAttributes


interface GenericAttributes : BaseAttributes, AudioAttributes, VideoAttributes, SubtitleAttributes

interface AudioIOAttributes : AudioAttributes, IOAttributes
interface VideoIOAttributes : VideoAttributes, IOAttributes
interface SubtitleIOAttributes : SubtitleAttributes, IOAttributes

interface AudioInputAttributes : AudioIOAttributes, InputAttributes
interface AudioOutputAttributes : AudioIOAttributes, OutputAttributes
interface VideoInputAttributes : VideoIOAttributes, InputAttributes
interface VideoOutputAttributes : VideoIOAttributes, OutputAttributes
interface SubtitleInputAttributes : SubtitleIOAttributes, InputAttributes
interface SubtitleOutputAttributes : SubtitleIOAttributes, OutputAttributes



/** 属性からFFmpeg用の引数に変換する */
val Triple<GenericAttributes, Map<InputAttributes, File>, Map<OutputAttributes, File>>.toArguments : List<String> get(){
    val gAttr = first
    val infiles = second
    val outfiles = third

    return listOf<String>(
        *gAttr.code.toTypedArray(),
        *infiles.map {
            listOf<String>( *it.key.code.toTypedArray(), "-i", it.value.absolutePath )
        }.flatten().toTypedArray(),
        *outfiles.map {
            listOf<String>( *it.key.code.toTypedArray(), it.value.absolutePath )
        }.flatten().toTypedArray()
    )
}
/** 属性からFFmpeg用の引数に変換する */
val Pair<GenericAttributes, Map<IOAttributes, File>>.toArguments : List<String> get(){
    val gAttr = first
    val infiles = second.filterKeys { it is InputAttributes } as Map<InputAttributes, File>
    val outfiles = second.filterKeys { it is OutputAttributes } as Map<OutputAttributes, File>

    return Triple(gAttr, infiles, outfiles).toArguments
}