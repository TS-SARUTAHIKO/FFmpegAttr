package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.*
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterGenerator
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterMixer
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters.FilterOrComplex

/*
 * Advanced Options
 *
 * [Documents](https://ffmpeg.org/ffmpeg.html#Advanced-options)
 *
 */

/**
 *
 * ------ Official Documents ------
 *
 * -map [-]input_file_id[:stream_specifier][?][,sync_file_id[:stream_specifier]] | [linklabel] (output)
 *
 * Designate one or more input streams as a source for the output file. Each input stream is identified by the input file index input_file_id and the input stream index input_stream_id within the input file. Both indices start at 0. If specified, sync_file_id:stream_specifier sets which input stream is used as a presentation sync reference.
 *
 * The first -map option on the command line specifies the source for output stream 0, the second -map option specifies the source for output stream 1, etc.
 *
 * A - character before the stream identifier creates a "negative" mapping. It disables matching streams from already created mappings.
 *
 * A trailing ? after the stream index will allow the map to be optional: if the map matches no streams the map will be ignored instead of failing. Note the map will still fail if an invalid input file index is used; such as if the map refers to a non-existent input.
 *
 * An alternative [linklabel] form will map outputs from complex filter graphs (see the -filter_complex option) to the output file. linklabel must correspond to a defined output link label in the graph.
 *
 * For example, to map ALL streams from the first input file to output
 *
 * ffmpeg -i INPUT -map 0 output
 *
 * For example, if you have two audio streams in the first input file, these streams are identified by "0:0" and "0:1". You can use -map to select which streams to place in an output file. For example:
 *
 * ffmpeg -i INPUT -map 0:1 out.wav
 *
 * will map the input stream in INPUT identified by "0:1" to the (single) output stream in out.wav.
 *
 * For example, to select the stream with index 2 from input file a.mov (specified by the identifier "0:2"), and stream with index 6 from input b.mov (specified by the identifier "1:6"), and copy them to the output file out.mov:
 *
 * ffmpeg -i a.mov -i b.mov -c copy -map 0:2 -map 1:6 out.mov
 *
 * To select all video and the third audio stream from an input file:
 *
 * ffmpeg -i INPUT -map 0:v -map 0:a:2 OUTPUT
 *
 * To map all the streams except the second audio, use negative mappings
 *
 * ffmpeg -i INPUT -map 0 -map -0:a:1 OUTPUT
 *
 * To map the video and audio streams from the first input, and using the trailing ?, ignore the audio mapping if no audio streams exist in the first input:
 *
 * ffmpeg -i INPUT -map 0:v -map 0:a? OUTPUT
 *
 * To pick the English audio stream:
 *
 * ffmpeg -i INPUT -map 0:m:language:eng OUTPUT
 *
 * Note that using this option disables the default mappings for this output file.
 * */
var OutputAttributes.map : String?
    get() = map_[""]
    set(value) { map_[""] = value }
private val OutputAttributes.map_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "map")

/**
 *
 * ------ Official Documents ------
 *
 * -ignore_unknown
 *
 * Ignore input streams with unknown type instead of failing if copying such streams is attempted.
 * */
var OutputAttributes.ignore_unknown : Boolean?
    get() = ignore_unknown_[""]
    set(value) { ignore_unknown_[""] = value }
private val OutputAttributes.ignore_unknown_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "ignore_unknown")

/**
 *
 * ------ Official Documents ------
 *
 * -copy_unknown
 *
 * Allow input streams with unknown type to be copied instead of failing if copying such streams is attempted.
 * */
var OutputAttributes.copy_unknown : Boolean?
    get() = copy_unknown_[""]
    set(value) { copy_unknown_[""] = value }
private val OutputAttributes.copy_unknown_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "copy_unknown")

/**
 *
 * ------ Official Documents ------
 *
 * -map_channel [input_file_id.stream_specifier.channel_id|-1][?][:output_file_id.stream_specifier]
 *
 * Map an audio channel from a given input to an output. If output_file_id.stream_specifier is not set, the audio channel will be mapped on all the audio streams.
 *
 * Using "-1" instead of input_file_id.stream_specifier.channel_id will map a muted channel.
 *
 * A trailing ? will allow the map_channel to be optional: if the map_channel matches no channel the map_channel will be ignored instead of failing.
 *
 * For example, assuming INPUT is a stereo audio file, you can switch the two audio channels with the following command:
 *
 * ffmpeg -i INPUT -map_channel 0.0.1 -map_channel 0.0.0 OUTPUT
 *
 * If you want to mute the first channel and keep the second:
 *
 * ffmpeg -i INPUT -map_channel -1 -map_channel 0.0.1 OUTPUT
 *
 * The order of the "-map_channel" option specifies the order of the channels in the output stream. The output channel layout is guessed from the number of channels mapped (mono if one "-map_channel", stereo if two, etc.). Using "-ac" in combination of "-map_channel" makes the channel gain levels to be updated if input and output channel layouts don’t match (for instance two "-map_channel" options and "-ac 6").
 *
 * You can also extract each channel of an input to specific outputs; the following command extracts two channels of the INPUT audio stream (file 0, stream 0) to the respective OUTPUT_CH0 and OUTPUT_CH1 outputs:
 *
 * ffmpeg -i INPUT -map_channel 0.0.0 OUTPUT_CH0 -map_channel 0.0.1 OUTPUT_CH1
 *
 * The following example splits the channels of a stereo input into two separate streams, which are put into the same output file:
 *
 * ffmpeg -i stereo.wav -map 0:0 -map 0:0 -map_channel 0.0.0:0.0 -map_channel 0.0.1:0.1 -y out.ogg
 *
 * Note that currently each output stream can only contain channels from a single input stream; you can’t for example use "-map_channel" to pick multiple input audio channels contained in different streams (from the same or different files) and merge them into a single output stream. It is therefore not currently possible, for example, to turn two separate mono streams into a single stereo stream. However splitting a stereo stream into two single channel mono streams is possible.
 *
 * If you need this feature, a possible workaround is to use the amerge filter. For example, if you need to merge a media (here input.mkv) with 2 mono audio streams into one single stereo channel audio stream (and keep the video stream), you can use the following command:
 *
 * ffmpeg -i input.mkv -filter_complex "[0:1] [0:2] amerge" -c:a pcm_s16le -c:v copy output.mkv
 *
 * To map the first two audio channels from the first input, and using the trailing ?, ignore the audio channel mapping if the first input is mono instead of stereo:
 *
 * ffmpeg -i INPUT -map_channel 0.0.0 -map_channel 0.0.1? OUTPUT
 * */
var OutputAttributes.map_channel : String?
    get() = map_channel_[""]
    set(value) { map_channel_[""] = value }
private val OutputAttributes.map_channel_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "map_channel")

/**
 *
 * ------ Official Documents ------
 *
 * -map_metadata[:metadata_spec_out] infile[:metadata_spec_in] (output,per-metadata)
 *
 * Set metadata information of the next output file from infile. Note that those are file indices (zero-based), not filenames. Optional metadata_spec_in/out parameters specify, which metadata to copy. A metadata specifier can have the following forms:
 *
 * g
 *
 * global metadata, i.e. metadata that applies to the whole file
 *
 * s[:stream_spec]
 *
 * per-stream metadata. stream_spec is a stream specifier as described in the Stream specifiers chapter. In an input metadata specifier, the first matching stream is copied from. In an output metadata specifier, all matching streams are copied to.
 *
 * c:chapter_index
 *
 * per-chapter metadata. chapter_index is the zero-based chapter index.
 *
 * p:program_index
 *
 * per-program metadata. program_index is the zero-based program index.
 *
 * If metadata specifier is omitted, it defaults to global.
 *
 * By default, global metadata is copied from the first input file, per-stream and per-chapter metadata is copied along with streams/chapters. These default mappings are disabled by creating any mapping of the relevant type. A negative file index can be used to create a dummy mapping that just disables automatic copying.
 *
 * For example to copy metadata from the first stream of the input file to global metadata of the output file:
 *
 * ffmpeg -i in.ogg -map_metadata 0:s:0 out.mp3
 *
 * To do the reverse, i.e. copy global metadata to all audio streams:
 *
 * ffmpeg -i in.mkv -map_metadata:s:a 0:g out.mkv
 *
 * Note that simple 0 would work as well in this example, since global metadata is assumed by default.
 * */
var OutputAttributes.map_metadata : String?
    get() = map_metadata_[""]
    set(value) { map_metadata_[""] = value }
/**
 *
 * ------ Official Documents ------
 *
 * -map_metadata[:metadata_spec_out] infile[:metadata_spec_in] (output,per-metadata)
 *
 * Set metadata information of the next output file from infile. Note that those are file indices (zero-based), not filenames. Optional metadata_spec_in/out parameters specify, which metadata to copy. A metadata specifier can have the following forms:
 *
 * g
 *
 * global metadata, i.e. metadata that applies to the whole file
 *
 * s[:stream_spec]
 *
 * per-stream metadata. stream_spec is a stream specifier as described in the Stream specifiers chapter. In an input metadata specifier, the first matching stream is copied from. In an output metadata specifier, all matching streams are copied to.
 *
 * c:chapter_index
 *
 * per-chapter metadata. chapter_index is the zero-based chapter index.
 *
 * p:program_index
 *
 * per-program metadata. program_index is the zero-based program index.
 *
 * If metadata specifier is omitted, it defaults to global.
 *
 * By default, global metadata is copied from the first input file, per-stream and per-chapter metadata is copied along with streams/chapters. These default mappings are disabled by creating any mapping of the relevant type. A negative file index can be used to create a dummy mapping that just disables automatic copying.
 *
 * For example to copy metadata from the first stream of the input file to global metadata of the output file:
 *
 * ffmpeg -i in.ogg -map_metadata 0:s:0 out.mp3
 *
 * To do the reverse, i.e. copy global metadata to all audio streams:
 *
 * ffmpeg -i in.mkv -map_metadata:s:a 0:g out.mkv
 *
 * Note that simple 0 would work as well in this example, since global metadata is assumed by default.
 * */
val OutputAttributes.map_metadata_ : MetadataSpecifierAdapter<String> get() = MetadataSpecifierAdapter(this, "map_metadata")

/**
 *
 * ------ Official Documents ------
 *
 * */
var OutputAttributes.map_chapters : String?
    get() = map_chapters_[""]
    set(value) { map_chapters_[""] = value }
private val OutputAttributes.map_chapters_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "map_chapters")

/**
 *
 * ------ Official Documents ------
 *
 * -benchmark (global)
 *
 * Show benchmarking information at the end of an encode. Shows real, system and user time used and maximum memory consumption. Maximum memory consumption is not supported on all systems, it will usually display as 0 if not supported.
 * */
var BaseAttributes.benchmark : Boolean?
    get() = benchmark_[""]
    set(value) { benchmark_[""] = value }
private val BaseAttributes.benchmark_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "benchmark")

/**
 *
 * ------ Official Documents ------
 *
 * -benchmark_all (global)
 *
 * Show benchmarking information during the encode. Shows real, system and user time used in various steps (audio/video encode/decode).
 * */
var BaseAttributes.benchmark_all  : Boolean?
    get() = benchmark_all_[""]
    set(value) { benchmark_all_[""] = value }
private val BaseAttributes.benchmark_all_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "benchmark_all ")

/**
 *
 * ------ Official Documents ------
 *
 * -timelimit duration (global)
 *
 * Exit after ffmpeg has been running for duration seconds in CPU user time.
 * */
var BaseAttributes.timelimit  : String?
    get() = timelimit_[""]
    set(value) { timelimit_[""] = value }
private val BaseAttributes.timelimit_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "timelimit ")

/**
 *
 * ------ Official Documents ------
 *
 * -dump (global)
 *
 * Dump each input packet to stderr.
 * */
var BaseAttributes.dump  : Boolean?
    get() = dump_[""]
    set(value) { dump_[""] = value }
private val BaseAttributes.dump_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "dump ")

/**
 *
 * ------ Official Documents ------
 *
 * -hex (global)
 *
 * When dumping packets, also dump the payload.
 * */
var BaseAttributes.hex  : Boolean?
    get() = hex_[""]
    set(value) { hex_[""] = value }
private val BaseAttributes.hex_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "hex ")

/**
 *
 * ------ Official Documents ------
 *
 * -re (input)
 *
 * Read input at native frame rate. Mainly used to simulate a grab device, or live input stream (e.g. when reading from a file). Should not be used with actual grab devices or live input streams (where it can cause packet loss). By default ffmpeg attempts to read the input(s) as fast as possible. This option will slow down the reading of the input(s) to the native frame rate of the input(s). It is useful for real-time output (e.g. live streaming).
 * */
var InputAttributes.re  : Boolean?
    get() = re_[""]
    set(value) { re_[""] = value }
private val InputAttributes.re_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "re ")

/**
 *
 * ------ Official Documents ------
 *
 * -vsync parameter
 *
 * Video sync method. For compatibility reasons old values can be specified as numbers. Newly added values will have to be specified as strings always.
 *
 * 0, passthrough
 *
 * Each frame is passed with its timestamp from the demuxer to the muxer.
 *
 * 1, cfr
 *
 * Frames will be duplicated and dropped to achieve exactly the requested constant frame rate.
 *
 * 2, vfr
 *
 * Frames are passed through with their timestamp or dropped so as to prevent 2 frames from having the same timestamp.
 *
 * drop
 *
 * As passthrough but destroys all timestamps, making the muxer generate fresh timestamps based on frame-rate.
 *
 * -1, auto
 *
 * Chooses between 1 and 2 depending on muxer capabilities. This is the default method.
 *
 * Note that the timestamps may be further modified by the muxer, after this. For example, in the case that the format option avoid_negative_ts is enabled.
 *
 * With -map you can select from which stream the timestamps should be taken. You can leave either video or audio unchanged and sync the remaining stream(s) to the unchanged one.
 * */
var OutputAttributes.vsync  : String?
    get() = vsync_[""]
    set(value) { vsync_[""] = value }
private val OutputAttributes.vsync_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "vsync ")

/**
 *
 * ------ Official Documents ------
 *
 * -frame_drop_threshold parameter
 *
 * Frame drop threshold, which specifies how much behind video frames can be before they are dropped. In frame rate units, so 1.0 is one frame. The default is -1.1. One possible usecase is to avoid framedrops in case of noisy timestamps or to increase frame drop precision in case of exact timestamps.
 * */
var OutputAttributes.frame_drop_threshold  : String?
    get() = frame_drop_threshold_[""]
    set(value) { frame_drop_threshold_[""] = value }
private val OutputAttributes.frame_drop_threshold_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "frame_drop_threshold ")

/**
 *
 * ------ Official Documents ------
 *
 * -async samples_per_second
 *
 * Audio sync method. "Stretches/squeezes" the audio stream to match the timestamps, the parameter is the maximum samples per second by which the audio is changed. -async 1 is a special case where only the start of the audio stream is corrected without any later correction.
 *
 * Note that the timestamps may be further modified by the muxer, after this. For example, in the case that the format option avoid_negative_ts is enabled.
 *
 * This option has been deprecated. Use the aresample audio filter instead.
 * */
var OutputAttributes.async  : String?
    get() = async_[""]
    set(value) { async_[""] = value }
private val OutputAttributes.async_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "async ")

/**
 *
 * ------ Official Documents ------
 *
 * -copyts
 *
 * Do not process input timestamps, but keep their values without trying to sanitize them. In particular, do not remove the initial start time offset value.
 *
 * Note that, depending on the vsync option or on specific muxer processing (e.g. in case the format option avoid_negative_ts is enabled) the output timestamps may mismatch with the input timestamps even when this option is selected.
 * */
var OutputAttributes.copyts  : Boolean?
    get() = copyts_[""]
    set(value) { copyts_[""] = value }
private val OutputAttributes.copyts_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "copyts ")

/**
 *
 * ------ Official Documents ------
 *
 * -start_at_zero
 *
 * When used with copyts, shift input timestamps so they start at zero.
 *
 * This means that using e.g. -ss 50 will make output timestamps start at 50 seconds, regardless of what timestamp the input file started at.
 * */
var OutputAttributes.start_at_zero  : Boolean?
    get() = start_at_zero_[""]
    set(value) { start_at_zero_[""] = value }
private val OutputAttributes.start_at_zero_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "start_at_zero ")

/**
 *
 * ------ Official Documents ------
 *
 * -copytb mode
 *
 * Specify how to set the encoder timebase when stream copying. mode is an integer numeric value, and can assume one of the following values:
 *
 * 1
 *
 * Use the demuxer timebase.
 *
 * The time base is copied to the output encoder from the corresponding input demuxer. This is sometimes required to avoid non monotonically increasing timestamps when copying video streams with variable frame rate.
 *
 * 0
 *
 * Use the decoder timebase.
 *
 * The time base is copied to the output encoder from the corresponding input decoder.
 *
 * -1
 *
 * Try to make the choice automatically, in order to generate a sane output.
 *
 * Default value is -1.
 * */
var OutputAttributes.copytb  : String?
    get() = copytb_[""]
    set(value) { copytb_[""] = value }
private val OutputAttributes.copytb_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "copytb ")


/**
 *
 * ------ Official Documents ------
 *
 * -enc_time_base[:stream_specifier] timebase (output,per-stream)
 *
 * Set the encoder timebase. timebase is a floating point number, and can assume one of the following values:
 *
 * 0
 *
 * Assign a default value according to the media type.
 *
 * For video - use 1/framerate, for audio - use 1/samplerate.
 *
 * -1
 *
 * Use the input stream timebase when possible.
 *
 * If an input stream is not available, the default timebase will be used.
 *
 * >0
 *
 * Use the provided number as the timebase.
 *
 * This field can be provided as a ratio of two integers (e.g. 1:24, 1:48000) or as a floating point number (e.g. 0.04166, 2.0833e-5)
 *
 * Default value is 0.
 * */
var OutputAttributes.enc_time_base  : String?
    get() = enc_time_base_[""]
    set(value) { enc_time_base_[""] = value }
val OutputAttributes.enc_time_base_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "enc_time_base ")

/**
 *
 * ------ Official Documents ------
 *
 * -bitexact (input/output)
 *
 * Enable bitexact mode for (de)muxer and (de/en)coder
 * */
var IOAttributes.bitexact  : Boolean?
    get() = bitexact_[""]
    set(value) { bitexact_[""] = value }
private val IOAttributes.bitexact_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "bitexact ")

/**
 *
 * ------ Official Documents ------
 *
 * -shortest (output)
 *
 * Finish encoding when the shortest input stream ends.
 * */
var OutputAttributes.shortest  : Boolean?
    get() = shortest_[""]
    set(value) { shortest_[""] = value }
private val OutputAttributes.shortest_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "shortest ")

/**
 *
 * ------ Official Documents ------
 *
 * -dts_delta_threshold
 *
 * Timestamp discontinuity delta threshold.
 * */
var OutputAttributes.dts_delta_threshold  : Boolean?
    get() = dts_delta_threshold_[""]
    set(value) { dts_delta_threshold_[""] = value }
private val OutputAttributes.dts_delta_threshold_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "dts_delta_threshold ")

/**
 *
 * ------ Official Documents ------
 *
 * -dts_error_threshold seconds
 *
 * Timestamp error delta threshold. This threshold use to discard crazy/damaged timestamps and the default is 30 hours which is arbitrarily picked and quite conservative.
 * */
var OutputAttributes.dts_error_threshold  : String?
    get() = dts_error_threshold_[""]
    set(value) { dts_error_threshold_[""] = value }
private val OutputAttributes.dts_error_threshold_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "dts_error_threshold ")

/**
 *
 * ------ Official Documents ------
 *
 * -muxdelay seconds (output)
 *
 * Set the maximum demux-decode delay.
 * */
var OutputAttributes.muxdelay  : String?
    get() = muxdelay_[""]
    set(value) { muxdelay_[""] = value }
private val OutputAttributes.muxdelay_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "muxdelay ")

/**
 *
 * ------ Official Documents ------
 *
 * -muxpreload seconds (output)
 *
 * Set the initial demux-decode delay.
 * */
var OutputAttributes.muxpreload  : String?
    get() = muxpreload_[""]
    set(value) { muxpreload_[""] = value }
private val OutputAttributes.muxpreload_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "muxpreload ")

/**
 *
 * ------ Official Documents ------
 *
 * -streamid output-stream-index:new-value (output)
 *
 * Assign a new stream-id value to an output stream. This option should be specified prior to the output filename to which it applies. For the situation where multiple output files exist, a streamid may be reassigned to a different value.
 *
 * For example, to set the stream 0 PID to 33 and the stream 1 PID to 36 for an output mpegts file:
 *
 * ffmpeg -i inurl -streamid 0:33 -streamid 1:36 out.ts
 * */
var OutputAttributes.streamid  : String?
    get() = streamid_[""]
    set(value) { streamid_[""] = value }
private val OutputAttributes.streamid_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "streamid ")

/**
 *
 * ------ Official Documents ------
 *
 * -bsf[:stream_specifier] bitstream_filters (output,per-stream)
 *
 * Set bitstream filters for matching streams. bitstream_filters is a comma-separated list of bitstream filters. Use the -bsfs option to get the list of bitstream filters.
 *
 * ffmpeg -i h264.mp4 -c:v copy -bsf:v h264_mp4toannexb -an out.h264
 *
 * ffmpeg -i file.mov -an -vn -bsf:s mov2textsub -c:s copy -f rawvideo sub.txt
 * */
var OutputAttributes.bsf  : String?
    get() = bsf_[""]
    set(value) { bsf_[""] = value }
val OutputAttributes.bsf_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "bsf ")

/**
 *
 * ------ Official Documents ------
 *
 * -tag[:stream_specifier] codec_tag (input/output,per-stream)
 *
 * Force a tag/fourcc for matching streams.
 * */
var IOAttributes.tag  : String?
    get() = tag_[""]
    set(value) { tag_[""] = value }
val IOAttributes.tag_ : StreamSpecifierAdapter<String> get() = StreamSpecifierAdapter(this, "tag ")

/**
 *
 * ------ Official Documents ------
 *
 * -timecode hh:mm:ssSEPff
 *
 * Specify Timecode for writing. SEP is ’:’ for non drop timecode and ’;’ (or ’.’) for drop.
 *
 * ffmpeg -i input.mpg -timecode 01:02:03.04 -r 30000/1001 -s ntsc output.mpg
 * */
var OutputAttributes.timecode  : String?
    get() = timecode_[""]
    set(value) { timecode_[""] = value }
private val OutputAttributes.timecode_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "timecode ")

/**
 *
 * ------ Official Documents ------
 *
 * -filter_complex filtergraph (global)
 *
 * Define a complex filtergraph, i.e. one with arbitrary number of inputs and/or outputs. For simple graphs – those with one input and one output of the same type – see the -filter options. filtergraph is a description of the filtergraph, as described in the “Filtergraph syntax” section of the ffmpeg-filters manual.
 *
 * Input link labels must refer to input streams using the [file_index:stream_specifier] syntax (i.e. the same as -map uses). If stream_specifier matches multiple streams, the first one will be used. An unlabeled input will be connected to the first unused input stream of the matching type.
 *
 * Output link labels are referred to with -map. Unlabeled outputs are added to the first output file.
 *
 * Note that with this option it is possible to use only lavfi sources without normal input files.
 *
 * For example, to overlay an image over video
 *
 * ffmpeg -i video.mkv -i image.png -filter_complex '[0:v][1:v]overlay[out]' -map
 *
 * '[out]' out.mkv
 *
 * Here [0:v] refers to the first video stream in the first input file, which is linked to the first (main) input of the overlay filter. Similarly the first video stream in the second input is linked to the second (overlay) input of overlay.
 *
 * Assuming there is only one video stream in each input file, we can omit input labels, so the above is equivalent to
 *
 * ffmpeg -i video.mkv -i image.png -filter_complex 'overlay[out]' -map
 *
 * '[out]' out.mkv
 *
 * Furthermore we can omit the output label and the single output from the filter graph will be added to the output file automatically, so we can simply write
 *
 * ffmpeg -i video.mkv -i image.png -filter_complex 'overlay' out.mkv
 *
 * To generate 5 seconds of pure red video using lavfi color source:
 *
 * ffmpeg -filter_complex 'color=c=red' -t 5 out.mkv
 * */
var BaseAttributes.filter_complex  : String?
    get() = filter_complex_[""]
    set(value) { filter_complex_[""] = value }
private val BaseAttributes.filter_complex_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "filter_complex ")

fun BaseAttributes.filter_complex_(generator : FilterMixer.()->(FilterOrComplex) ){
    filter_complex = FilterGenerator(generator).code
}

/**
 *
 * ------ Official Documents ------
 *
 * -filter_complex_threads nb_threads (global)
 *
 * Defines how many threads are used to process a filter_complex graph. Similar to filter_threads but used for -filter_complex graphs only. The default is the number of available CPUs.
 * */
var BaseAttributes.filter_complex_threads  : String?
    get() = filter_complex_threads_[""]
    set(value) { filter_complex_threads_[""] = value }
private val BaseAttributes.filter_complex_threads_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "filter_complex_threads ")

/**
 *
 * ------ Official Documents ------
 *
 * -lavfi filtergraph (global)
 *
 * Define a complex filtergraph, i.e. one with arbitrary number of inputs and/or outputs. Equivalent to -filter_complex.
 * */
var BaseAttributes.lavfi  : String?
    get() = lavfi_[""]
    set(value) { lavfi_[""] = value }
private val BaseAttributes.lavfi_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "lavfi ")

/**
 *
 * ------ Official Documents ------
 *
 * -filter_complex_script filename (global)
 *
 * This option is similar to -filter_complex, the only difference is that its argument is the name of the file from which a complex filtergraph description is to be read.
 * */
var BaseAttributes.filter_complex_script  : String?
    get() = filter_complex_script_[""]
    set(value) { filter_complex_script_[""] = value }
private val BaseAttributes.filter_complex_script_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "filter_complex_script ")

/**
 *
 * ------ Official Documents ------
 *
 * -accurate_seek (input)
 *
 * This option enables or disables accurate seeking in input files with the -ss option. It is enabled by default, so seeking is accurate when transcoding. Use -noaccurate_seek to disable it, which may be useful e.g. when copying some streams and transcoding the others.
 * */
var InputAttributes.accurate_seek  : Boolean?
    get() = accurate_seek_[""]
    set(value) { accurate_seek_[""] = value }
private val InputAttributes.accurate_seek_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "accurate_seek ")

/**
 *
 * ------ Official Documents ------
 *
 * -seek_timestamp (input)
 *
 * This option enables or disables seeking by timestamp in input files with the -ss option. It is disabled by default. If enabled, the argument to the -ss option is considered an actual timestamp, and is not offset by the start time of the file. This matters only for files which do not start from timestamp 0, such as transport streams.
 * */
var InputAttributes.seek_timestamp  : Boolean?
    get() = seek_timestamp_[""]
    set(value) { seek_timestamp_[""] = value }
private val InputAttributes.seek_timestamp_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "seek_timestamp ")

/**
 *
 * ------ Official Documents ------
 *
 * -thread_queue_size size (input)
 *
 * This option sets the maximum number of queued packets when reading from the file or device. With low latency / high rate live streams, packets may be discarded if they are not read in a timely manner; raising this value can avoid it.
 * */
var InputAttributes.thread_queue_size  : String?
    get() = thread_queue_size_[""]
    set(value) { thread_queue_size_[""] = value }
private val InputAttributes.thread_queue_size_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "thread_queue_size ")

/**
 *
 * ------ Official Documents ------
 *
 * -sdp_file file (global)
 *
 * Print sdp information for an output stream to file. This allows dumping sdp information when at least one output isn’t an rtp stream. (Requires at least one of the output formats to be rtp).
 * */
var BaseAttributes.sdp_file  : String?
    get() = sdp_file_[""]
    set(value) { sdp_file_[""] = value }
private val BaseAttributes.sdp_file_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "sdp_file")

/**
 *
 * ※ Official Documents は間違っていると思われる。-discard は引数を一つ取ると思われる。
 *
 * ------ Official Documents ------
 *
 * -discard (input)
 *
 * Allows discarding specific streams or frames from streams. Any input stream can be fully discarded, using value all whereas selective discarding of frames from a stream occurs at the demuxer and is not supported by all demuxers.
 *
 * none
 *
 * Discard no frame.
 *
 * default
 *
 * Default, which discards no frames.
 *
 * noref
 *
 * Discard all non-reference frames.
 *
 * bidir
 *
 * Discard all bidirectional frames.
 *
 * nokey
 *
 * Discard all frames excepts keyframes.
 *
 * all
 *
 * Discard all frames.
*/
var InputAttributes.discard  : String?
    get() = discard_[""]
    set(value) { discard_[""] = value }
private val InputAttributes.discard_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "discard")

/**
 *
 * ------ Official Documents ------
 *
 * -abort_on flags (global)
 *
 * Stop and abort on various conditions. The following flags are available:
 *
 * empty_output
 *
 * No packets were passed to the muxer, the output is empty.
 */
var BaseAttributes.abort_on  : String?
    get() = abort_on_[""]
    set(value) { abort_on_[""] = value }
private val BaseAttributes.abort_on_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "abort_on")

/**
 *
 * ------ Official Documents ------
 *
 * -xerror (global)
 *
 * Stop and exit on error
 */
var BaseAttributes.xerror  : Boolean?
    get() = xerror_[""]
    set(value) { xerror_[""] = value }
private val BaseAttributes.xerror_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "xerror")

/**
 *
 * ------ Official Documents ------
 *
 * -max_muxing_queue_size packets (output,per-stream)
 *
 * When transcoding audio and/or video streams, ffmpeg will not begin writing into the output until it has one packet for each such stream. While waiting for that to happen, packets for other streams are buffered. This option sets the size of this buffer, in packets, for the matching output stream.
 *
 * The default value of this option should be high enough for most uses, so only touch this option if you are sure that you need it.
 */
var OutputAttributes.max_muxing_queue_size  : String?
    get() = max_muxing_queue_size_[""]
    set(value) { max_muxing_queue_size_[""] = value }
private val OutputAttributes.max_muxing_queue_size_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "max_muxing_queue_size")
