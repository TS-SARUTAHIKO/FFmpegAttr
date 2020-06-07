package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.GenericAttributes
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes.NoSpecifierAdapter

/*
 * Generic Options
 *
 * [Documents](https://ffmpeg.org/ffmpeg.html#Generic-options)
 *
 */


/**
 *
 * ------ Official Documents ------
 *
 * -L
 *
 * Show license.
 * */
var GenericAttributes.L : Boolean?
    get() = L_[""]
    set(value) { L_[""] = value }
private val GenericAttributes.L_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "L")

/**
 *
 * ------ Official Documents ------
 *
 * -h, -?, -help, --help [arg]
 *
 * Show help. An optional parameter may be specified to print help about a specific item. If no argument is specified, only basic (non advanced) tool options are shown.
 *
 * Possible values of arg are:
 *
 * long
 *
 * Print advanced tool options in addition to the basic tool options.
 *
 * full
 *
 * Print complete list of options, including shared and private options for encoders, decoders, demuxers, muxers, filters, etc.
 *
 * decoder=decoder_name
 *
 * Print detailed information about the decoder named decoder_name. Use the -decoders option to get a list of all decoders.
 *
 * encoder=encoder_name
 *
 * Print detailed information about the encoder named encoder_name. Use the -encoders option to get a list of all encoders.
 *
 * demuxer=demuxer_name
 *
 * Print detailed information about the demuxer named demuxer_name. Use the -formats option to get a list of all demuxers and muxers.
 *
 * muxer=muxer_name
 *
 * Print detailed information about the muxer named muxer_name. Use the -formats option to get a list of all muxers and demuxers.
 *
 * filter=filter_name
 *
 * Print detailed information about the filter name filter_name. Use the -filters option to get a list of all filters.
 *
 * bsf=bitstream_filter_name
 *
 * Print detailed information about the bitstream filter name bitstream_filter_name. Use the -bsfs option to get a list of all bitstream filters.
 * */
var GenericAttributes.h : Boolean?
    get() = h_[""]
    set(value) { h_[""] = value }
private val GenericAttributes.h_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "h")

/**
 *
 * ------ Official Documents ------
 *
 * -h, -?, -help, --help [arg]
 *
 * Show help. An optional parameter may be specified to print help about a specific item. If no argument is specified, only basic (non advanced) tool options are shown.
 *
 * Possible values of arg are:
 *
 * long
 *
 * Print advanced tool options in addition to the basic tool options.
 *
 * full
 *
 * Print complete list of options, including shared and private options for encoders, decoders, demuxers, muxers, filters, etc.
 *
 * decoder=decoder_name
 *
 * Print detailed information about the decoder named decoder_name. Use the -decoders option to get a list of all decoders.
 *
 * encoder=encoder_name
 *
 * Print detailed information about the encoder named encoder_name. Use the -encoders option to get a list of all encoders.
 *
 * demuxer=demuxer_name
 *
 * Print detailed information about the demuxer named demuxer_name. Use the -formats option to get a list of all demuxers and muxers.
 *
 * muxer=muxer_name
 *
 * Print detailed information about the muxer named muxer_name. Use the -formats option to get a list of all muxers and demuxers.
 *
 * filter=filter_name
 *
 * Print detailed information about the filter name filter_name. Use the -filters option to get a list of all filters.
 *
 * bsf=bitstream_filter_name
 *
 * Print detailed information about the bitstream filter name bitstream_filter_name. Use the -bsfs option to get a list of all bitstream filters.
 * */
var GenericAttributes.help : Boolean?
    get() = h_[""]
    set(value) { h_[""] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -version
 *
 * Show version.
 * */
var GenericAttributes.version : Boolean?
    get() = version_[""]
    set(value) { version_[""] = value }
private val GenericAttributes.version_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "version")

/**
 *
 * ------ Official Documents ------
 *
 * -formats
 *
 * Show available formats (including devices).
 * */
var GenericAttributes.formats : Boolean?
    get() = formats_[""]
    set(value) { formats_[""] = value }
private val GenericAttributes.formats_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "formats")

/**
 *
 * ------ Official Documents ------
 *
 * -demuxers
 *
 * Show available demuxers.
 * */
var GenericAttributes.demuxers : Boolean?
    get() = demuxers_[""]
    set(value) { demuxers_[""] = value }
private val GenericAttributes.demuxers_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "demuxers")

/**
 *
 * ------ Official Documents ------
 *
 * -muxers
 *
 * Show available muxers.
 * */
var GenericAttributes.muxers : Boolean?
    get() = muxers_[""]
    set(value) { muxers_[""] = value }
private val GenericAttributes.muxers_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "muxers")

/**
 *
 * ------ Official Documents ------
 *
 * -devices
 *
 * Show available devices.
 * */
var GenericAttributes.devices : Boolean?
    get() = devices_[""]
    set(value) { devices_[""] = value }
private val GenericAttributes.devices_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "devices")

/**
 *
 * ------ Official Documents ------
 *
 * -codecs
 *
 * Show all codecs known to libavcodec.
 *
 * Note that the term ’codec’ is used throughout this documentation as a shortcut for what is more correctly called a media bitstream format.
 * */
var GenericAttributes.codecs : Boolean?
    get() = codecs_[""]
    set(value) { codecs_[""] = value }
private val GenericAttributes.codecs_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "codecs")

/**
 *
 * ------ Official Documents ------
 *
 * -decoders
 *
 * Show available decoders.
 * */
var GenericAttributes.decoders : Boolean?
    get() = decoders_[""]
    set(value) { decoders_[""] = value }
private val GenericAttributes.decoders_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "decoders")

/**
 *
 * ------ Official Documents ------
 *
 * -encoders
 *
 * Show all available encoders.
 * */
var GenericAttributes.encoders : Boolean?
    get() = encoders_[""]
    set(value) { encoders_[""] = value }
private val GenericAttributes.encoders_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "encoders")

/**
 *
 * ------ Official Documents ------
 *
 * -bsfs
 *
 * Show available bitstream filters.
 * */
var GenericAttributes.bsfs : Boolean?
    get() = bsfs_[""]
    set(value) { bsfs_[""] = value }
private val GenericAttributes.bsfs_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "bsfs")

/**
 *
 * ------ Official Documents ------
 *
 * -protocols
 *
 * Show available protocols.
 * */
var GenericAttributes.protocols : Boolean?
    get() = protocols_[""]
    set(value) { protocols_[""] = value }
private val GenericAttributes.protocols_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "protocols")

/**
 *
 * ------ Official Documents ------
 *
 * -filters
 *
 * Show available libavfilter filters.
 * */
var GenericAttributes.filters : Boolean?
    get() = filters_[""]
    set(value) { filters_[""] = value }
private val GenericAttributes.filters_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "filters")

/**
 *
 * ------ Official Documents ------
 *
 * -pix_fmts
 *
 * Show available pixel formats.
 * */
var GenericAttributes.pix_fmts : Boolean?
    get() = pix_fmts_[""]
    set(value) { pix_fmts_[""] = value }
private val GenericAttributes.pix_fmts_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "pix_fmts")

/**
 *
 * ------ Official Documents ------
 *
 * -sample_fmts
 *
 * Show available sample formats.
 * */
var GenericAttributes.sample_fmts : Boolean?
    get() = sample_fmts_[""]
    set(value) { sample_fmts_[""] = value }
private val GenericAttributes.sample_fmts_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "sample_fmts")

/**
 *
 * ------ Official Documents ------
 *
 * -layouts
 *
 * Show channel names and standard channel layouts.
 * */
var GenericAttributes.layouts : Boolean?
    get() = layouts_[""]
    set(value) { layouts_[""] = value }
private val GenericAttributes.layouts_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "layouts")

/**
 *
 * ------ Official Documents ------
 *
 * -colors
 *
 * Show recognized color names.
 * */
var GenericAttributes.colors : Boolean?
    get() = colors_[""]
    set(value) { colors_[""] = value }
private val GenericAttributes.colors_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "colors")

/**
 *
 * ------ Official Documents ------
 *
 * -sources device[,opt1=val1[,opt2=val2]...]
 *
 * Show autodetected sources of the input device. Some devices may provide system-dependent source names that cannot be autodetected. The returned list cannot be assumed to be always complete.
 *
 * ffmpeg -sources pulse,server=192.168.0.4
 * */
var GenericAttributes.sources : String?
    get() = sources_[""]
    set(value) { sources_[""] = value }
private val GenericAttributes.sources_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "sources")

/**
 *
 * ------ Official Documents ------
 *
 * -sinks device[,opt1=val1[,opt2=val2]...]
 *
 * Show autodetected sinks of the output device. Some devices may provide system-dependent sink names that cannot be autodetected. The returned list cannot be assumed to be always complete.
 *
 * ffmpeg -sinks pulse,server=192.168.0.4
 * */
var GenericAttributes.sinks : String?
    get() = sinks_[""]
    set(value) { sinks_[""] = value }
private val GenericAttributes.sinks_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "sinks")

/**
 *
 * ------ Official Documents ------
 *
 * -loglevel [flags+]loglevel
 *
 * -v [flags+]loglevel
 *
 * Set logging level and flags used by the library.
 *
 * The optional flags prefix can consist of the following values:
 *
 * ‘repeat’
 *
 * Indicates that repeated log output should not be compressed to the first line and the "Last message repeated n times" line will be omitted.
 * ‘level’
 *
 * Indicates that log output should add a [level] prefix to each message line. This can be used as an alternative to log coloring, e.g. when dumping the log to file.
 *
 * Flags can also be used alone by adding a ’+’/’-’ prefix to set/reset a single flag without affecting other flags or changing loglevel. When setting both flags and loglevel, a ’+’ separator is expected between the last flags value and before loglevel.
 *
 * loglevel is a string or a number containing one of the following values:
 *
 * ‘quiet, -8’
 *
 * Show nothing at all; be silent.
 *
 * ‘panic, 0’
 *
 * Only show fatal errors which could lead the process to crash, such as an assertion failure. This is not currently used for anything.
 *
 * ‘fatal, 8’
 *
 * Only show fatal errors. These are errors after which the process absolutely cannot continue.
 *
 * ‘error, 16’
 *
 * Show all errors, including ones which can be recovered from.
 *
 * ‘warning, 24’
 *
 * Show all warnings and errors. Any message related to possibly incorrect or unexpected events will be shown.
 *
 * ‘info, 32’
 *
 * Show informative messages during processing. This is in addition to warnings and errors. This is the default value.
 *
 * ‘verbose, 40’
 *
 * Same as info, except more verbose.
 *
 * ‘debug, 48’
 *
 * Show everything, including debugging information.
 *
 * ‘trace, 56’
 *
 * For example to enable repeated log output, add the level prefix, and set loglevel to verbose:
 *
 * ffmpeg -loglevel repeat+level+verbose -i input output
 *
 * Another example that enables repeated log output without affecting current state of level prefix flag or loglevel:
 *
 * ffmpeg [...] -loglevel +repeat
 *
 * By default the program logs to stderr. If coloring is supported by the terminal, colors are used to mark errors and warnings. Log coloring can be disabled setting the environment variable AV_LOG_FORCE_NOCOLOR, or can be forced setting the environment variable AV_LOG_FORCE_COLOR.
 * */
var GenericAttributes.loglevel : String?
    get() = loglevel_[""]
    set(value) { loglevel_[""] = value }
private val GenericAttributes.loglevel_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "loglevel")

/**
 *
 * ------ Official Documents ------
 *
 * -loglevel [flags+]loglevel
 *
 * -v [flags+]loglevel
 *
 * Set logging level and flags used by the library.
 *
 * The optional flags prefix can consist of the following values:
 *
 * ‘repeat’
 *
 * Indicates that repeated log output should not be compressed to the first line and the "Last message repeated n times" line will be omitted.
 * ‘level’
 *
 * Indicates that log output should add a [level] prefix to each message line. This can be used as an alternative to log coloring, e.g. when dumping the log to file.
 *
 * Flags can also be used alone by adding a ’+’/’-’ prefix to set/reset a single flag without affecting other flags or changing loglevel. When setting both flags and loglevel, a ’+’ separator is expected between the last flags value and before loglevel.
 *
 * loglevel is a string or a number containing one of the following values:
 *
 * ‘quiet, -8’
 *
 * Show nothing at all; be silent.
 *
 * ‘panic, 0’
 *
 * Only show fatal errors which could lead the process to crash, such as an assertion failure. This is not currently used for anything.
 *
 * ‘fatal, 8’
 *
 * Only show fatal errors. These are errors after which the process absolutely cannot continue.
 *
 * ‘error, 16’
 *
 * Show all errors, including ones which can be recovered from.
 *
 * ‘warning, 24’
 *
 * Show all warnings and errors. Any message related to possibly incorrect or unexpected events will be shown.
 *
 * ‘info, 32’
 *
 * Show informative messages during processing. This is in addition to warnings and errors. This is the default value.
 *
 * ‘verbose, 40’
 *
 * Same as info, except more verbose.
 *
 * ‘debug, 48’
 *
 * Show everything, including debugging information.
 *
 * ‘trace, 56’
 *
 * For example to enable repeated log output, add the level prefix, and set loglevel to verbose:
 *
 * ffmpeg -loglevel repeat+level+verbose -i input output
 *
 * Another example that enables repeated log output without affecting current state of level prefix flag or loglevel:
 *
 * ffmpeg [...] -loglevel +repeat
 *
 * By default the program logs to stderr. If coloring is supported by the terminal, colors are used to mark errors and warnings. Log coloring can be disabled setting the environment variable AV_LOG_FORCE_NOCOLOR, or can be forced setting the environment variable AV_LOG_FORCE_COLOR.
 * */
var GenericAttributes.v : String?
    get() = loglevel_[""]
    set(value) { loglevel_[""] = value }

/**
 *
 * ------ Official Documents ------
 *
 * -report
 *
 * Dump full command line and log output to a file named program-YYYYMMDD-HHMMSS.log in the current directory. This file can be useful for bug reports. It also implies -loglevel debug.
 *
 * Setting the environment variable FFREPORT to any value has the same effect. If the value is a ’:’-separated key=value sequence, these options will affect the report; option values must be escaped if they contain special characters or the options delimiter ’:’ (see the “Quoting and escaping” section in the ffmpeg-utils manual).
 *
 * The following options are recognized:
 *
 * file
 *
 * set the file name to use for the report; %p is expanded to the name of the program, %t is expanded to a timestamp, %% is expanded to a plain %
 *
 * level
 *
 * set the log verbosity level using a numerical value (see -loglevel).
 *
 * For example, to output a report to a file named ffreport.log using a log level of 32 (alias for log level info):
 *
 * FFREPORT=file=ffreport.log:level=32 ffmpeg -i input output
 *
 * Errors in parsing the environment variable are not fatal, and will not appear in the report.
 * */
var GenericAttributes.report : Boolean?
    get() = report_[""]
    set(value) { report_[""] = value }
private val GenericAttributes.report_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "report")

/**
 *
 * ------ Official Documents ------
 *
 * -hide_banner
 *
 * Suppress printing banner.
 *
 * All FFmpeg tools will normally show a copyright notice, build options and library versions. This option can be used to suppress printing this information.
 * */
var GenericAttributes.hide_banner : Boolean?
    get() = hide_banner_[""]
    set(value) { hide_banner_[""] = value }
private val GenericAttributes.hide_banner_ : NoSpecifierAdapter<Boolean> get() = NoSpecifierAdapter(this, "hide_banner")

/**
 *
 * ------ Official Documents ------
 *
 * -cpuflags flags (global)
 *
 * Allows setting and clearing cpu flags. This option is intended for testing. Do not use it unless you know what you’re doing.
 *
 * ffmpeg -cpuflags -sse+mmx ...
 *
 * ffmpeg -cpuflags mmx ...
 *
 * ffmpeg -cpuflags 0 ...
 *
 * Possible flags for this option are:
 *
 * ‘x86’
 *
 * ‘mmx’
 * ‘mmxext’
 * ‘sse’
 * ‘sse2’
 * ‘sse2slow’
 * ‘sse3’
 * ‘sse3slow’
 * ‘ssse3’
 * ‘atom’
 * ‘sse4.1’
 * ‘sse4.2’
 * ‘avx’
 * ‘avx2’
 * ‘xop’
 * ‘fma3’
 * ‘fma4’
 * ‘3dnow’
 * ‘3dnowext’
 * ‘bmi1’
 * ‘bmi2’
 * ‘cmov’
 *
 * ‘ARM’
 *
 * ‘armv5te’
 * ‘armv6’
 * ‘armv6t2’
 * ‘vfp’
 * ‘vfpv3’
 * ‘neon’
 * ‘setend’
 *
 * ‘AArch64’
 *
 * ‘armv8’
 * ‘vfp’
 * ‘neon’
 *
 * ‘PowerPC’
 *
 * ‘altivec’
 *
 * ‘Specific Processors’
 *
 * ‘pentium2’
 * ‘pentium3’
 * ‘pentium4’
 * ‘k6’
 * ‘k62’
 * ‘athlon’
 * ‘athlonxp’
 * ‘k8’
 * */
var GenericAttributes.cpuflags : String?
    get() = cpuflags_[""]
    set(value) { cpuflags_[""] = value }
private val GenericAttributes.cpuflags_ : NoSpecifierAdapter<String> get() = NoSpecifierAdapter(this, "cpuflags")
