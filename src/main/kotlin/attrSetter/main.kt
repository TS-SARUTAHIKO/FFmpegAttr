package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterGenerator
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterMixer
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterOrComplex

/*
* Main Options
*
* [Documents](https://ffmpeg.org/ffmpeg.html#Main-options)
*
* */



/**
 * フォーマット指定
 *
 * 通常はファイル形式から推測されるので使用しない
 *
 * ------ Official Documents ------
 *
 * -f fmt (input/output)
 *
 * Force input or output file format. The format is normally auto detected for input files and guessed from the file extension for output files, so this option is not needed in most cases.
 * */
var IOAttributes.f : String?
    get() = f_[""]
    set(value) { f_[""] = value }
private val IOAttributes.f_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "f")

/**
 * 上書き保存の許可
 *
 * 出力ファイルが存在する場合は上書き保存する
 *
 * ------ Official Documents ------
 *
 * -y (global)
 *
 * Overwrite output files without asking.
 * */
var BaseAttributes.y : Boolean?
    get() = y_[""]
    set(value) { y_[""] = value }
private val BaseAttributes.y_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "y")

/**
 * 上書き設定
 *
 * 出力ファイルが存在する場合は直ちに処理を終了する
 *
 * ------ Official Documents ------
 *
 * -n (global)
 *
 * Do not overwrite output files, and exit immediately if a specified output file already exists.
 * */
var BaseAttributes.n : Boolean?
    get() = n_[""]
    set(value) { n_[""] = value }
private val BaseAttributes.n_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "n")

/**
 * ループ設定
 *
 * ループ入力として使用するための設定
 *
 * 0 : ループ入力を使用しない
 *
 * -1 : 無制限にループ入力する
 *
 * Int : 指定した回数だけループ入力を使用する
 *
 * ------ Official Documents ------
 *
 * -stream_loop number (input)
 *
 * Set number of times input stream shall be looped. Loop 0 means no loop, loop -1 means infinite loop.
 * */
var InputAttributes.stream_loop : String?
    get() = stream_loop_[""]
    set(value) { stream_loop_[""] = value }
private val InputAttributes.stream_loop_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "stream_loop")

/**
 * コーデック指定
 *
 * ------ Official Documents ------
 *
 * -c[:stream_specifier] codec (input/output,per-stream)
 *
 * -codec[:stream_specifier] codec (input/output,per-stream)
 *
 * Select an encoder (when used before an output file) or a decoder (when used before an input file) for one or more streams. codec is the name of a decoder/encoder or a special value copy (output only) to indicate that the stream is not to be re-encoded.
 *
 * For example
 *
 * ffmpeg -i INPUT -map 0 -c:v libx264 -c:a copy OUTPUT
 *
 * encodes all video streams with libx264 and copies all audio streams.
 *
 * For each stream, the last matching c option is applied, so
 *
 * ffmpeg -i INPUT -map 0 -c copy -c:v:1 libx264 -c:a:137 libvorbis OUTPUT
 *
 * will copy all the streams except the second video, which will be encoded with libx264, and the 138th audio, which will be encoded with libvorbis.
 * */
var IOAttributes.c : String?
    get() = c_[""]
    set(value) { c_[""] = value }
/**
 * コーデック指定(アダプター)
 *
 * ------ Official Documents ------
 *
 * -c[:stream_specifier] codec (input/output,per-stream)
 *
 * -codec[:stream_specifier] codec (input/output,per-stream)
 *
 * Select an encoder (when used before an output file) or a decoder (when used before an input file) for one or more streams. codec is the name of a decoder/encoder or a special value copy (output only) to indicate that the stream is not to be re-encoded.
 *
 * For example
 *
 * ffmpeg -i INPUT -map 0 -c:v libx264 -c:a copy OUTPUT
 *
 * encodes all video streams with libx264 and copies all audio streams.
 *
 * For each stream, the last matching c option is applied, so
 *
 * ffmpeg -i INPUT -map 0 -c copy -c:v:1 libx264 -c:a:137 libvorbis OUTPUT
 *
 * will copy all the streams except the second video, which will be encoded with libx264, and the 138th audio, which will be encoded with libvorbis.
 * */
val IOAttributes.c_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "c")
/**
 * コーデック指定(中継)
 *
 * ------ Official Documents ------
 *
 * -c[:stream_specifier] codec (input/output,per-stream)
 *
 * -codec[:stream_specifier] codec (input/output,per-stream)
 *
 * Select an encoder (when used before an output file) or a decoder (when used before an input file) for one or more streams. codec is the name of a decoder/encoder or a special value copy (output only) to indicate that the stream is not to be re-encoded.
 *
 * For example
 *
 * ffmpeg -i INPUT -map 0 -c:v libx264 -c:a copy OUTPUT
 *
 * encodes all video streams with libx264 and copies all audio streams.
 *
 * For each stream, the last matching c option is applied, so
 *
 * ffmpeg -i INPUT -map 0 -c copy -c:v:1 libx264 -c:a:137 libvorbis OUTPUT
 *
 * will copy all the streams except the second video, which will be encoded with libx264, and the 138th audio, which will be encoded with libvorbis.
 * */
var IOAttributes.codec : String?
    get() = this.c
    set(value) { this.c = value }
/**
 * コーデック指定(アダプター中継)
 *
 * ------ Official Documents ------
 *
 * -c[:stream_specifier] codec (input/output,per-stream)
 *
 * -codec[:stream_specifier] codec (input/output,per-stream)
 *
 * Select an encoder (when used before an output file) or a decoder (when used before an input file) for one or more streams. codec is the name of a decoder/encoder or a special value copy (output only) to indicate that the stream is not to be re-encoded.
 *
 * For example
 *
 * ffmpeg -i INPUT -map 0 -c:v libx264 -c:a copy OUTPUT
 *
 * encodes all video streams with libx264 and copies all audio streams.
 *
 * For each stream, the last matching c option is applied, so
 *
 * ffmpeg -i INPUT -map 0 -c copy -c:v:1 libx264 -c:a:137 libvorbis OUTPUT
 *
 * will copy all the streams except the second video, which will be encoded with libx264, and the 138th audio, which will be encoded with libvorbis.
 * */
val IOAttributes.codec_ : StreamSpecifierAdapter<String> get() = c_

/**
 * 継続時間指定
 *
 * ------ Official Documents ------
 *
 * -t duration (input/output)
 *
 * When used as an input option (before -i), limit the duration of data read from the input file.
 *
 * When used as an output option (before an output url), stop writing the output after its duration reaches duration.
 *
 * duration must be a time duration specification, see (ffmpeg-utils)the Time duration section in the ffmpeg-utils(1) manual.
 *
 * -to and -t are mutually exclusive and -t has priority.
 *
 * */
var IOAttributes.t : String?
    get() = t_[""]
    set(value) { t_[""] = value }
private val IOAttributes.t_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "t")

/**
 * 終了時間指定
 *
 * ------ Official Documents ------
 *
 * -to position (input/output)
 *
 * Stop writing the output or reading the input at position. position must be a time duration specification, see (ffmpeg-utils)the Time duration section in the ffmpeg-utils(1) manual.
 *
 * -to and -t are mutually exclusive and -t has priority.
 *
 * */
var IOAttributes.to : String?
    get() = to_[""]
    set(value) { to_[""] = value }
private val IOAttributes.to_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "to")

/**
 *
 *
 * ------ Official Documents ------
 *
 * -fs limit_size (output)
 *
 * Set the file size limit, expressed in bytes. No further chunk of bytes is written after the limit is exceeded. The size of the output file is slightly more than the requested file size.
 *
 * */
var OutputAttributes.fs : String?
    get() = fs_[""]
    set(value) { fs_[""] = value }
private val OutputAttributes.fs_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "fs")

/**
 * 開始時間指定
 *
 * ------ Official Documents ------
 *
 * -ss position (input/output)
 *
 * When used as an input option (before -i), seeks in this input file to position. Note that in most formats it is not possible to seek exactly, so ffmpeg will seek to the closest seek point before position. When transcoding and -accurate_seek is enabled (the default), this extra segment between the seek point and position will be decoded and discarded. When doing stream copy or when -noaccurate_seek is used, it will be preserved.
 *
 * When used as an output option (before an output url), decodes but discards input until the timestamps reach position.
 *
 * position must be a time duration specification, see (ffmpeg-utils)the Time duration section in the ffmpeg-utils(1) manual.
 *
 * */
var IOAttributes.ss : String?
    get() = ss_[""]
    set(value) { ss_[""] = value }
private val IOAttributes.ss_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "ss")

/**
 * 開始時間の終了時間からの指定
 *
 * 開始時刻(start)をファイルの末尾(end)から(sseof)の位置に指定する
 *
 * ※ sseof の値はマイナスの値にすること
 *
 * ------ Official Documents ------
 *
 * -sseof position (input)
 *
 * Like the -ss option but relative to the "end of file". That is negative values are earlier in the file, 0 is at EOF.
 *
 * */
var InputAttributes.sseof : String?
    get() = sseof_[""]
    set(value) { sseof_[""] = value }
private val InputAttributes.sseof_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "sseof")

/**
 *
 *
 * ------ Official Documents ------
 *
 * -itsoffset offset (input)
 *
 * Set the input time offset.
 *
 * offset must be a time duration specification, see (ffmpeg-utils)the Time duration section in the ffmpeg-utils(1) manual.
 *
 * The offset is added to the timestamps of the input files. Specifying a positive offset means that the corresponding streams are delayed by the time duration specified in offset.
 *
 * */
var InputAttributes.itsoffset : String?
    get() = itsoffset_[""]
    set(value) { itsoffset_[""] = value }
private val InputAttributes.itsoffset_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "itsoffset")

/**
 *
 *
 * ------ Official Documents ------
 *
 * -itsscale scale (input,per-stream)
 *
 * Rescale input timestamps. scale should be a floating point number.
 *
 * */
var InputAttributes.itsscale : String?
    get() = itsscale_[""]
    set(value) { itsscale_[""] = value }
private val InputAttributes.itsscale_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "itsscale")

/**
 * タイムスタンプ
 *
 * ------ Official Documents ------
 *
 * -timestamp date (output)
 *
 * Set the recording timestamp in the container.
 *
 * date must be a date specification, see (ffmpeg-utils)the Date section in the ffmpeg-utils(1) manual.
 *
 * */
var OutputAttributes.timestamp : String?
    get() = timestamp_[""]
    set(value) { timestamp_[""] = value }
private val OutputAttributes.timestamp_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "timestamp")

/**
 * メタデータ
 *
 * TODO : metadata_specifier
 *
 * ------ Official Documents ------
 *
 * -metadata[:metadata_specifier] key=value (output,per-metadata)
 *
 * Set a metadata key/value pair.
 *
 * An optional metadata_specifier may be given to set metadata on streams, chapters or programs. See -map_metadata documentation for details.
 *
 * This option overrides metadata set with -map_metadata. It is also possible to delete metadata by using an empty value.
 *
 * For example, for setting the title in the output file:
 *
 * ffmpeg -i in.avi -metadata title="my title" out.flv
 *
 * To set the language of the first audio stream:
 *
 * ffmpeg -i INPUT -metadata:s:a:0 language=eng OUTPUT
 * */
var OutputAttributes.metadata : String?
    get() = metadata_[""]
    set(value) { metadata_[""] = value }
/**
 * メタデータ(アダプター)
 *
 * ------ Official Documents ------
 *
 * -metadata[:metadata_specifier] key=value (output,per-metadata)
 *
 * Set a metadata key/value pair.
 *
 * An optional metadata_specifier may be given to set metadata on streams, chapters or programs. See -map_metadata documentation for details.
 *
 * This option overrides metadata set with -map_metadata. It is also possible to delete metadata by using an empty value.
 *
 * For example, for setting the title in the output file:
 *
 * ffmpeg -i in.avi -metadata title="my title" out.flv
 *
 * To set the language of the first audio stream:
 *
 * ffmpeg -i INPUT -metadata:s:a:0 language=eng OUTPUT
 * */
val OutputAttributes.metadata_ : MetadataSpecifierAdapter<String> get() = MetadataSpecifierAdapter(this, "metadata")

/**
 * Disposition
 *
 * ------ Official Documents ------
 *
 * -disposition[:stream_specifier] value (output,per-stream)
 *
 * Sets the disposition for a stream.
 *
 * This option overrides the disposition copied from the input stream. It is also possible to delete the disposition by setting it to 0.
 *
 * The following dispositions are recognized:
 *
 * default,
 * dub,
 * original,
 * comment,
 * lyrics,
 * karaoke,
 * forced,
 * hearing_impaired,
 * visual_impaired,
 * clean_effects,
 * attached_pic,
 * captions,
 * descriptions,
 * dependent,
 * metadata
 *
 * For example, to make the second audio stream the default stream:
 *
 * ffmpeg -i in.mkv -c copy -disposition:a:1 default out.mkv
 *
 * To make the second subtitle stream the default stream and remove the default disposition from the first subtitle stream:
 *
 * ffmpeg -i in.mkv -c copy -disposition:s:0 0 -disposition:s:1 default out.mkv
 *
 * To add an embedded cover/thumbnail:
 *
 * ffmpeg -i in.mp4 -i IMAGE -map 0 -map 1 -c copy -c:v:1 png -disposition:v:1 attached_pic out.mp4
 *
 * Not all muxers support embedded thumbnails, and those who do, only support a few formats, like JPEG or PNG.
 *
 * */
var OutputAttributes.disposition : String?
    get() = disposition_[""]
    set(value) { disposition_[""] = value }
/**
 * Disposition (アダプター)
 *
 * ------ Official Documents ------
 *
 * -disposition[:stream_specifier] value (output,per-stream)
 *
 * Sets the disposition for a stream.
 *
 * This option overrides the disposition copied from the input stream. It is also possible to delete the disposition by setting it to 0.
 *
 * The following dispositions are recognized:
 *
 * default,
 * dub,
 * original,
 * comment,
 * lyrics,
 * karaoke,
 * forced,
 * hearing_impaired,
 * visual_impaired,
 * clean_effects,
 * attached_pic,
 * captions,
 * descriptions,
 * dependent,
 * metadata
 *
 * For example, to make the second audio stream the default stream:
 *
 * ffmpeg -i in.mkv -c copy -disposition:a:1 default out.mkv
 *
 * To make the second subtitle stream the default stream and remove the default disposition from the first subtitle stream:
 *
 * ffmpeg -i in.mkv -c copy -disposition:s:0 0 -disposition:s:1 default out.mkv
 *
 * To add an embedded cover/thumbnail:
 *
 * ffmpeg -i in.mp4 -i IMAGE -map 0 -map 1 -c copy -c:v:1 png -disposition:v:1 attached_pic out.mp4
 *
 * Not all muxers support embedded thumbnails, and those who do, only support a few formats, like JPEG or PNG.
 *
 * */
val OutputAttributes.disposition_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "disposition")

/**
 * Program
 *
 * ------ Official Documents ------
 *
 * -program [title=title:][program_num=program_num:]st=stream[:st=stream...] (output)
 *
 * Creates a program with the specified title, program_num and adds the specified stream(s) to it.
 * */
var OutputAttributes.program : String?
    get() = program_[""]
    set(value) { program_[""] = value }
/**
 * Program (アダプター)
 *
 * ------ Official Documents ------
 *
 * -program [title=title:][program_num=program_num:]st=stream[:st=stream...] (output)
 *
 * Creates a program with the specified title, program_num and adds the specified stream(s) to it.
 * */
private val OutputAttributes.program_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "program")

/**
 *
 * ------ Official Documents ------
 *
 * -target type (output)
 *
 * Specify target file type (vcd, svcd, dvd, dv, dv50). type may be prefixed with pal-, ntsc- or film- to use the corresponding standard. All the format options (bitrate, codecs, buffer sizes) are then set automatically. You can just type:
 *
 * ffmpeg -i myfile.avi -target vcd /tmp/vcd.mpg
 *
 * Nevertheless you can specify additional options as long as you know they do not conflict with the standard, as in:
 *
 * ffmpeg -i myfile.avi -target vcd -bf 2 /tmp/vcd.mpg
 * */
var OutputAttributes.target : String?
    get() = target_[""]
    set(value) { target_[""] = value }
private val OutputAttributes.target_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "target")

/**
 *
 * ------ Official Documents ------
 *
 * -dn (input/output)
 *
 * As an input option, blocks all data streams of a file from being filtered or being automatically selected or mapped for any output. See -discard option to disable streams individually.
 *
 * As an output option, disables data recording i.e. automatic selection or mapping of any data stream. For full manual control see the -map option.
 * */
var IOAttributes.dn : String?
    get() = dn_[""]
    set(value) { dn_[""] = value }
private val IOAttributes.dn_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "dn")

/**
 *
 * ------ Official Documents ------
 *
 * -dframes number (output)
 *
 * Set the number of data frames to output. This is an obsolete alias for -frames:d, which you should use instead.
 * */
@Deprecated("This is an obsolete alias for -frames:d, which you should use instead.")
var OutputAttributes.dframes : String?
    get() = frames_["d"]
    set(value) { frames_["d"] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -frames[:stream_specifier] framecount (output,per-stream)
 *
 * Stop writing to the stream after framecount frames.
 * */
var OutputAttributes.frames : String?
    get() = frames_[""]
    set(value) { frames_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -frames[:stream_specifier] framecount (output,per-stream)
 *
 * Stop writing to the stream after framecount frames.
 * */
val OutputAttributes.frames_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "frames")

/**
 *
 * ------ Official Documents ------
 *
 * -q[:stream_specifier] q (output,per-stream)
 *
 * -qscale[:stream_specifier] q (output,per-stream)
 *
 * Use fixed quality scale (VBR). The meaning of q/qscale is codec-dependent. If qscale is used without a stream_specifier then it applies only to the video stream, this is to maintain compatibility with previous behavior and as specifying the same codec specific value to 2 different codecs that is audio and video generally is not what is intended when no stream_specifier is used.
 * */
var OutputAttributes.q : String?
    get() = q_[""]
    set(value) { q_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -q[:stream_specifier] q (output,per-stream)
 *
 * -qscale[:stream_specifier] q (output,per-stream)
 *
 * Use fixed quality scale (VBR). The meaning of q/qscale is codec-dependent. If qscale is used without a stream_specifier then it applies only to the video stream, this is to maintain compatibility with previous behavior and as specifying the same codec specific value to 2 different codecs that is audio and video generally is not what is intended when no stream_specifier is used.
 * */
val OutputAttributes.q_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "q")
/**
 *
 * ------ Official Documents ------
 *
 * -q[:stream_specifier] q (output,per-stream)
 *
 * -qscale[:stream_specifier] q (output,per-stream)
 *
 * Use fixed quality scale (VBR). The meaning of q/qscale is codec-dependent. If qscale is used without a stream_specifier then it applies only to the video stream, this is to maintain compatibility with previous behavior and as specifying the same codec specific value to 2 different codecs that is audio and video generally is not what is intended when no stream_specifier is used.
 * */
var OutputAttributes.qscale : String?
    get() = this.qscale
    set(value) { this.qscale = value }
/**
 *
 * ------ Official Documents ------
 *
 * -q[:stream_specifier] q (output,per-stream)
 *
 * -qscale[:stream_specifier] q (output,per-stream)
 *
 * Use fixed quality scale (VBR). The meaning of q/qscale is codec-dependent. If qscale is used without a stream_specifier then it applies only to the video stream, this is to maintain compatibility with previous behavior and as specifying the same codec specific value to 2 different codecs that is audio and video generally is not what is intended when no stream_specifier is used.
 * */
val OutputAttributes.qscale_ : StreamSpecifierAdapter<String> get() = qscale_


/**
 *
 * ------ Official Documents ------
 *
 * -filter[:stream_specifier] filtergraph (output,per-stream)
 *
 * Create the filtergraph specified by filtergraph and use it to filter the stream.
 *
 * filtergraph is a description of the filtergraph to apply to the stream, and must have a single input and a single output of the same type of the stream. In the filtergraph, the input is associated to the label in, and the output to the label out. See the ffmpeg-filters manual for more information about the filtergraph syntax.
 *
 * See the -filter_complex option if you want to create filtergraphs with multiple inputs and/or outputs.
 * */
var OutputAttributes.filter : String?
    get() = filter_[""]
    set(value) { filter_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -filter[:stream_specifier] filtergraph (output,per-stream)
 *
 * Create the filtergraph specified by filtergraph and use it to filter the stream.
 *
 * filtergraph is a description of the filtergraph to apply to the stream, and must have a single input and a single output of the same type of the stream. In the filtergraph, the input is associated to the label in, and the output to the label out. See the ffmpeg-filters manual for more information about the filtergraph syntax.
 *
 * See the -filter_complex option if you want to create filtergraphs with multiple inputs and/or outputs.
 * */
val OutputAttributes.filter_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "filter")

fun OutputAttributes.filter_( specifier : String = "", generator : FilterMixer.()->(FilterOrComplex) ){
    filter_[specifier] = FilterGenerator(generator).code
}

/**
 *
 * ------ Official Documents ------
 *
 * -filter_script[:stream_specifier] filename (output,per-stream)
 *
 * This option is similar to -filter, the only difference is that its argument is the name of the file from which a filtergraph description is to be read.
 * */
var OutputAttributes.filter_script : String?
    get() = filter_script_[""]
    set(value) { filter_script_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -filter_script[:stream_specifier] filename (output,per-stream)
 *
 * This option is similar to -filter, the only difference is that its argument is the name of the file from which a filtergraph description is to be read.
 * */
val OutputAttributes.filter_script_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "filter_script")

/**
 *
 * ------ Official Documents ------
 *
 * -filter_threads nb_threads (global)
 *
 * Defines how many threads are used to process a filter pipeline. Each pipeline will produce a thread pool with this many threads available for parallel processing. The default is the number of available CPUs.
 * */
var BaseAttributes.filter_threads : String?
    get() = filter_threads_[""]
    set(value) { filter_threads_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -filter_threads nb_threads (global)
 *
 * Defines how many threads are used to process a filter pipeline. Each pipeline will produce a thread pool with this many threads available for parallel processing. The default is the number of available CPUs.
 * */
private val BaseAttributes.filter_threads_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "filter_threads")

/**
 *
 * ------ Official Documents ------
 *
 * -pre[:stream_specifier] preset_name (output,per-stream)
 *
 * Specify the preset for matching stream(s).
 * */
var OutputAttributes.pre : String?
    get() = pre_[""]
    set(value) { pre_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -pre[:stream_specifier] preset_name (output,per-stream)
 *
 * Specify the preset for matching stream(s).
 * */
val OutputAttributes.pre_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "pre")

/**
 *
 * ------ Official Documents ------
 *
 * -stats (global)
 *
 * Print encoding progress/statistics. It is on by default, to explicitly disable it you need to specify -nostats.
*/
var BaseAttributes.stats : String?
    get() = stats_[""]
    set(value) { stats_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -stats (global)
 *
 * Print encoding progress/statistics. It is on by default, to explicitly disable it you need to specify -nostats.
 * */
private val BaseAttributes.stats_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "stats")

/**
 *
 * ------ Official Documents ------
 *
 * -progress url (global)
 *
 * Send program-friendly progress information to url.
 *
 * Progress information is written approximately every second and at the end of the encoding process. It is made of "key=value" lines. key consists of only alphanumeric characters. The last key of a sequence of progress information is always "progress".
 */
var BaseAttributes.progress : String?
    get() = progress_[""]
    set(value) { progress_[""] = value }
private val BaseAttributes.progress_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "progress")

/**
 * 標準入力設定
 *
 * ------ Official Documents ------
 *
 * -stdin
 *
 * Enable interaction on standard input. On by default unless standard input is used as an input. To explicitly disable interaction you need to specify -nostdin.
 *
 * Disabling interaction on standard input is useful, for example, if ffmpeg is in the background process group. Roughly the same result can be achieved with ffmpeg ... < /dev/null but it requires a shell.
 * */
var BaseAttributes.stdin : Boolean?
    get() = stdin_[""]
    set(value) { stdin_[""] = value }
private val BaseAttributes.stdin_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "stdin")

/**
 *
 * ------ Official Documents ------
 *
 * -debug_ts (global)
 *
 * Print timestamp information. It is off by default. This option is mostly useful for testing and debugging purposes, and the output format may change from one version to another, so it should not be employed by portable scripts.
 *
 * See also the option -fdebug ts.
 * */
var BaseAttributes.debug_ts : Boolean?
    get() = debug_ts_[""]
    set(value) { debug_ts_[""] = value }
private val BaseAttributes.debug_ts_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "debug_ts")

/**
 *
 * ------ Official Documents ------
 *
 * -attach filename (output)
 *
 * Add an attachment to the output file. This is supported by a few formats like Matroska for e.g. fonts used in rendering subtitles. Attachments are implemented as a specific type of stream, so this option will add a new stream to the file. It is then possible to use per-stream options on this stream in the usual way. Attachment streams created with this option will be created after all the other streams (i.e. those created with -map or automatic mappings).
 *
 * Note that for Matroska you also have to set the mimetype metadata tag:
 *
 * ffmpeg -i INPUT -attach DejaVuSans.ttf -metadata:s:2 mimetype=application/x-truetype-font out.mkv
 *
 * (assuming that the attachment stream will be third in the output file).
 */
var OutputAttributes.attach : String?
    get() = attach_[""]
    set(value) { attach_[""] = value }
private val OutputAttributes.attach_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "attach")

/**
 *
 * ------ Official Documents ------
 *
 * -dump_attachment[:stream_specifier] filename (input,per-stream)
 *
 * Extract the matching attachment stream into a file named filename. If filename is empty, then the value of the filename metadata tag will be used.
 *
 * E.g. to extract the first attachment to a file named ’out.ttf’:
 *
 * ffmpeg -dump_attachment:t:0 out.ttf -i INPUT
 *
 * To extract all attachments to files determined by the filename tag:
 *
 * ffmpeg -dump_attachment:t "" -i INPUT
 *
 * Technical note – attachments are implemented as codec extradata, so this option can actually be used to extract extradata from any stream, not just attachments.
 * */
var InputAttributes.dump_attachment : String?
    get() = dump_attachment_[""]
    set(value) { dump_attachment_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -dump_attachment[:stream_specifier] filename (input,per-stream)
 *
 * Extract the matching attachment stream into a file named filename. If filename is empty, then the value of the filename metadata tag will be used.
 *
 * E.g. to extract the first attachment to a file named ’out.ttf’:
 *
 * ffmpeg -dump_attachment:t:0 out.ttf -i INPUT
 *
 * To extract all attachments to files determined by the filename tag:
 *
 * ffmpeg -dump_attachment:t "" -i INPUT
 *
 * Technical note – attachments are implemented as codec extradata, so this option can actually be used to extract extradata from any stream, not just attachments.
 * */
val InputAttributes.dump_attachment_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "dump_attachment")

/**
 *
 * ------ Official Documents ------
 *
 * -noautorotate
 *
 * Disable automatically rotating video based on file metadata.
 * */
var BaseAttributes.noautorotate : Boolean?
    get() = noautorotate_[""]
    set(value) { noautorotate_[""] = value }
private val BaseAttributes.noautorotate_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "noautorotate")


