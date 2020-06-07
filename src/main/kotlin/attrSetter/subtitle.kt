package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*


/*
* Subtitle Options
*
* [Documents](https://ffmpeg.org/ffmpeg.html#Subtitle-options)
*
* */


/**
 *
 * ------ Official Documents ------
 *
 * -scodec codec (input/output)
 *
 * Set the subtitle codec. This is an alias for -codec:s.
 * */
var SubtitleIOAttributes.scodec : String?
    get() = codec_["s"]
    set(value) { codec_["s"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -sn (input/output)
 *
 * As an input option, blocks all subtitle streams of a file from being filtered or being automatically selected or mapped for any output. See -discard option to disable streams individually.
 *
 * As an output option, disables subtitle recording i.e. automatic selection or mapping of any subtitle stream. For full manual control see the -map option.
 * */
var SubtitleIOAttributes.sn : Boolean?
    get() = sn_[""]
    set(value) { sn_[""] = value }
private val SubtitleIOAttributes.sn_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "sn")

/**
 *
 * ------ Official Documents ------
 *
 * -sbsf bitstream_filter
 *
 * Deprecated, see -bsf
 * */
@Deprecated("Deprecated, see -bsf")
var SubtitleOutputAttributes.sbsf : String?
    get() = bsf_["s"]
    set(value) { bsf_["s"] = value }



// [Advanced Audio options](https://ffmpeg.org/ffmpeg.html#Advanced-Audio-options)

/**
 *
 * ------ Official Documents ------
 *
 * -fix_sub_duration
 *
 * Fix subtitles durations. For each subtitle, wait for the next packet in the same stream and adjust the duration of the first to avoid overlap. This is necessary with some subtitles codecs, especially DVB subtitles, because the duration in the original packet is only a rough estimate and the end is actually marked by an empty subtitle frame. Failing to use this option when necessary can result in exaggerated durations or muxing failures due to non-monotonic timestamps.
 *
 * Note that this option will delay the output of all data until the next subtitle packet is decoded: it may increase memory consumption and latency a lot.
 * */
var SubtitleAttributes.fix_sub_duration : Boolean?
    get() = fix_sub_duration_[""]
    set(value) { fix_sub_duration_[""] = value }
private val SubtitleAttributes.fix_sub_duration_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "fix_sub_duration")

/**
 *
 * ------ Official Documents ------
 *
 * -canvas_size size
 *
 * Set the size of the canvas used to render subtitles.
 * */
var SubtitleAttributes.canvas_size : String?
    get() = canvas_size_[""]
    set(value) { canvas_size_[""] = value }
private val SubtitleAttributes.canvas_size_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "canvas_size")

