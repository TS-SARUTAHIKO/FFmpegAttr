package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterMixer
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterOrComplex


/*
* Video Options
*
* [Documents](https://ffmpeg.org/ffmpeg.html#Video-Options)
*
* */


/**
 *
 * ------ Official Documents ------
 *
 * -vframes number (output)
 *
 * Set the number of video frames to output. This is an obsolete alias for -frames:v, which you should use instead.
 * */
@Deprecated("This is an obsolete alias for -frames:v, which you should use instead.")
var VideoOutputAttributes.vframes : String?
    get() = frames_["v"]
    set(value) { frames_["v"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -r[:stream_specifier] fps (input/output,per-stream)
 *
 * Set frame rate (Hz value, fraction or abbreviation).
 *
 * As an input option, ignore any timestamps stored in the file and instead generate timestamps assuming constant frame rate fps. This is not the same as the -framerate option used for some input formats like image2 or v4l2 (it used to be the same in older versions of FFmpeg). If in doubt use -framerate instead of the input option -r.
 *
 * As an output option, duplicate or drop input frames to achieve constant output frame rate fps.
 * */
var VideoIOAttributes.r : String?
    get() = r_[""]
    set(value) { r_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -r[:stream_specifier] fps (input/output,per-stream)
 *
 * Set frame rate (Hz value, fraction or abbreviation).
 *
 * As an input option, ignore any timestamps stored in the file and instead generate timestamps assuming constant frame rate fps. This is not the same as the -framerate option used for some input formats like image2 or v4l2 (it used to be the same in older versions of FFmpeg). If in doubt use -framerate instead of the input option -r.
 *
 * As an output option, duplicate or drop input frames to achieve constant output frame rate fps.
 * */
val VideoIOAttributes.r_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "r")

/**
 *
 * ------ Official Documents ------
 *
 * -s[:stream_specifier] size (input/output,per-stream)
 *
 * Set frame size.
 *
 * As an input option, this is a shortcut for the video_size private option, recognized by some demuxers for which the frame size is either not stored in the file or is configurable – e.g. raw video or video grabbers.
 *
 * As an output option, this inserts the scale video filter to the end of the corresponding filtergraph. Please use the scale filter directly to insert it at the beginning or some other place.
 *
 * The format is ‘wxh’ (default - same as source).
 * */
var VideoIOAttributes.s : String?
    get() = s_[""]
    set(value) { s_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -s[:stream_specifier] size (input/output,per-stream)
 *
 * Set frame size.
 *
 * As an input option, this is a shortcut for the video_size private option, recognized by some demuxers for which the frame size is either not stored in the file or is configurable – e.g. raw video or video grabbers.
 *
 * As an output option, this inserts the scale video filter to the end of the corresponding filtergraph. Please use the scale filter directly to insert it at the beginning or some other place.
 *
 * The format is ‘wxh’ (default - same as source).
 * */
val VideoIOAttributes.s_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "s")

/**
 *
 * ------ Official Documents ------
 *
 * -aspect[:stream_specifier] aspect (output,per-stream)
 *
 * Set the video display aspect ratio specified by aspect.
 *
 * aspect can be a floating point number string, or a string of the form num:den, where num and den are the numerator and denominator of the aspect ratio. For example "4:3", "16:9", "1.3333", and "1.7777" are valid argument values.
 *
 * If used together with -vcodec copy, it will affect the aspect ratio stored at container level, but not the aspect ratio stored in encoded frames, if it exists.
 * */
var VideoOutputAttributes.aspect : String?
    get() = aspect_[""]
    set(value) { aspect_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -aspect[:stream_specifier] aspect (output,per-stream)
 *
 * Set the video display aspect ratio specified by aspect.
 *
 * aspect can be a floating point number string, or a string of the form num:den, where num and den are the numerator and denominator of the aspect ratio. For example "4:3", "16:9", "1.3333", and "1.7777" are valid argument values.
 *
 * If used together with -vcodec copy, it will affect the aspect ratio stored at container level, but not the aspect ratio stored in encoded frames, if it exists.
 * */
val VideoOutputAttributes.aspect_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "aspect")

/**
 *
 * ------ Official Documents ------
 *
 * -vn (input/output)
 *
 * As an input option, blocks all video streams of a file from being filtered or being automatically selected or mapped for any output. See -discard option to disable streams individually.
 *
 * As an output option, disables video recording i.e. automatic selection or mapping of any video stream. For full manual control see the -map option.
 * */
var VideoIOAttributes.vn : Boolean?
    get() = vn_[""]
    set(value) { vn_[""] = value }
private val VideoIOAttributes.vn_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "vn")

/**
 *
 * ------ Official Documents ------
 *
 * -vcodec codec (output)
 *
 * Set the video codec. This is an alias for -codec:v.
 * */
var VideoOutputAttributes.vcodec : String?
    get() = codec_["v"]
    set(value) { codec_["v"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -pass[:stream_specifier] n (output,per-stream)
 *
 * Select the pass number (1 or 2). It is used to do two-pass video encoding. The statistics of the video are recorded in the first pass into a log file (see also the option -passlogfile), and in the second pass that log file is used to generate the video at the exact requested bitrate. On pass 1, you may just deactivate audio and set output to null, examples for Windows and Unix:
 *
 * ffmpeg -i foo.mov -c:v libxvid -pass 1 -an -f rawvideo -y NUL
 *
 * ffmpeg -i foo.mov -c:v libxvid -pass 1 -an -f rawvideo -y /dev/null
 * */
var VideoOutputAttributes.pass : String?
    get() = pass_[""]
    set(value) { pass_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -pass[:stream_specifier] n (output,per-stream)
 *
 * Select the pass number (1 or 2). It is used to do two-pass video encoding. The statistics of the video are recorded in the first pass into a log file (see also the option -passlogfile), and in the second pass that log file is used to generate the video at the exact requested bitrate. On pass 1, you may just deactivate audio and set output to null, examples for Windows and Unix:
 *
 * ffmpeg -i foo.mov -c:v libxvid -pass 1 -an -f rawvideo -y NUL
 *
 * ffmpeg -i foo.mov -c:v libxvid -pass 1 -an -f rawvideo -y /dev/null
 * */
val VideoOutputAttributes.pass_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "pass")

/**
 *
 * ------ Official Documents ------
 *
 * -passlogfile[:stream_specifier] prefix (output,per-stream)
 *
 * Set two-pass log file name prefix to prefix, the default file name prefix is “ffmpeg2pass”. The complete file name will be PREFIX-N.log, where N is a number specific to the output stream
 * */
var VideoOutputAttributes.passlogfile : String?
    get() = passlogfile_[""]
    set(value) { passlogfile_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -passlogfile[:stream_specifier] prefix (output,per-stream)
 *
 * Set two-pass log file name prefix to prefix, the default file name prefix is “ffmpeg2pass”. The complete file name will be PREFIX-N.log, where N is a number specific to the output stream
 * */
val VideoOutputAttributes.passlogfile_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "passlogfile")

/**
 *
 * ------ Official Documents ------
 *
 * -vf filtergraph (output)
 *
 * Create the filtergraph specified by filtergraph and use it to filter the stream.
 *
 * This is an alias for -filter:v, see the -filter option.
 * */
var VideoOutputAttributes.vf : String?
    get() = filter_["v"]
    set(value) { filter_["v"] = value }

fun VideoOutputAttributes.vf_( specifier : String = "", generator : FilterMixer.()->(FilterOrComplex) ){
    val specifier = if( specifier.isEmpty() ) "" else ":$specifier"

    filter_("v$specifier", generator)
}


// TODO : [Advanced Video options](https://ffmpeg.org/ffmpeg.html#Advanced-Video-options) のオプション関数を作る