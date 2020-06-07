package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterMixer
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterOrComplex

/*
 * Audio Options
 *
 * [Documents](https://ffmpeg.org/ffmpeg.html#Audio-Options)
 *
 */



/**
 *
 * ------ Official Documents ------
 *
 * -aframes number (output)
 *
 * Set the number of audio frames to output. This is an obsolete alias for -frames:a, which you should use instead.
 * */
@Deprecated("This is an obsolete alias for -frames:a, which you should use instead.")
var AudioOutputAttributes.aframes : String?
    get() = frames_["a"]
    set(value) { frames_["a"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -ar[:stream_specifier] freq (input/output,per-stream)
 *
 * Set the audio sampling frequency. For output streams it is set by default to the frequency of the corresponding input stream. For input streams this option only makes sense for audio grabbing devices and raw demuxers and is mapped to the corresponding demuxer options.
 * */
var AudioIOAttributes.ar : String?
    get() = ar_[""]
    set(value) { ar_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -ar[:stream_specifier] freq (input/output,per-stream)
 *
 * Set the audio sampling frequency. For output streams it is set by default to the frequency of the corresponding input stream. For input streams this option only makes sense for audio grabbing devices and raw demuxers and is mapped to the corresponding demuxer options.
 * */
val AudioIOAttributes.ar_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "ar")

/**
 *
 * ------ Official Documents ------
 *
 * -aq q (output)
 *
 * Set the audio quality (codec-specific, VBR). This is an alias for -q:a.
 * */
var AudioOutputAttributes.aq : String?
    get() = q_["a"]
    set(value) { q_["a"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -ac[:stream_specifier] channels (input/output,per-stream)
 *
 * Set the number of audio channels. For output streams it is set by default to the number of input audio channels. For input streams this option only makes sense for audio grabbing devices and raw demuxers and is mapped to the corresponding demuxer options.
 * */
var AudioIOAttributes.ac : String?
    get() = ac_[""]
    set(value) { ac_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -ac[:stream_specifier] channels (input/output,per-stream)
 *
 * Set the number of audio channels. For output streams it is set by default to the number of input audio channels. For input streams this option only makes sense for audio grabbing devices and raw demuxers and is mapped to the corresponding demuxer options.
 * */
val AudioIOAttributes.ac_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "ac")

/**
 *
 * ------ Official Documents ------
 *
 * -an (input/output)
 *
 * As an input option, blocks all audio streams of a file from being filtered or being automatically selected or mapped for any output. See -discard option to disable streams individually.
 *
 * As an output option, disables audio recording i.e. automatic selection or mapping of any audio stream. For full manual control see the -map option.
 * */
var AudioIOAttributes.an : Boolean?
    get() = an_[""]
    set(value) { an_[""] = value }
private val AudioIOAttributes.an_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "an")

/**
 *
 * ------ Official Documents ------
 *
 * -acodec codec (input/output)
 *
 * Set the audio codec. This is an alias for -codec:a.
 * */
var AudioIOAttributes.acodec : String?
    get() = codec_["a"]
    set(value) { codec_["a"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -sample_fmt[:stream_specifier] sample_fmt (output,per-stream)
 *
 * Set the audio sample format. Use -sample_fmts to get a list of supported sample formats.
 * */
var AudioOutputAttributes.sample_fmt : String?
    get() = sample_fmt_[""]
    set(value) { sample_fmt_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -sample_fmt[:stream_specifier] sample_fmt (output,per-stream)
 *
 * Set the audio sample format. Use -sample_fmts to get a list of supported sample formats.
 * */
val AudioOutputAttributes.sample_fmt_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "sample_fmt")

/**
 *
 * ------ Official Documents ------
 *
 * -af filtergraph (output)
 *
 * Create the filtergraph specified by filtergraph and use it to filter the stream.
 *
 * This is an alias for -filter:a, see the -filter option.
 * */
var AudioOutputAttributes.af : String?
    get() = filter_["a"]
    set(value) { filter_["a"] = value }

fun AudioOutputAttributes.af_( specifier : String = "", generator : FilterMixer.()->(FilterOrComplex) ){
    val specifier = if( specifier.isEmpty() ) "" else ":$specifier"

    filter_("a$specifier", generator)
}


// [Advanced Audio options](https://ffmpeg.org/ffmpeg.html#Advanced-Audio-options)

/**
 *
 * ------ Official Documents ------
 *
 * -atag fourcc/tag (output)
 *
 * Force audio tag/fourcc. This is an alias for -tag:a.
 * */
var AudioOutputAttributes.atag : String?
    get() = tag_["a"]
    set(value) { tag_["a"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -absf bitstream_filter
 *
 * Deprecated, see -bsf
 * */
@Deprecated("Deprecated, see -bsf")
var AudioOutputAttributes.absf : String?
    get() = bsf_["a"]
    set(value) { bsf_["a"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -guess_layout_max channels (input,per-stream)
 *
 * If some input channel layout is not known, try to guess only if it corresponds to at most the specified number of channels. For example, 2 tells to ffmpeg to recognize 1 channel as mono and 2 channels as stereo but not 6 channels as 5.1. The default is to always try to guess. Use 0 to disable all guessing.
 * */
var AudioInputAttributes.guess_layout_max : String?
    get() = guess_layout_max_[""]
    set(value) { guess_layout_max_[""] = value }
private val AudioInputAttributes.guess_layout_max_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "guess_layout_max")
