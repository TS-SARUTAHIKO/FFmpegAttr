package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes


/**
 * ストリームのセレクタ
 *
 * [Stream specifiers](https://ffmpeg.org/ffmpeg.html#Stream-specifiers-1)
 *
 * ------ Official Documents ------
 *
 * Some options are applied per-stream, e.g. bitrate or codec. Stream specifiers are used to precisely specify which stream(s) a given option belongs to.
 *
 * A stream specifier is a string generally appended to the option name and separated from it by a colon. E.g. -codec:a:1 ac3 contains the a:1 stream specifier, which matches the second audio stream. Therefore, it would select the ac3 codec for the second audio stream.
 *
 * A stream specifier can match several streams, so that the option is applied to all of them. E.g. the stream specifier in -b:a 128k matches all audio streams.
 *
 * An empty stream specifier matches all streams. For example, -codec copy or -codec: copy would copy all the streams without reencoding.
 *
 * Possible forms of stream specifiers are:
 * */
sealed class StreamSpecifier(val code : String)  {
    open class FactorySpecifier(code : String) : StreamSpecifier(code),
        StreamSpecifierFactoryInterface

    class Index(value : Int) : StreamSpecifier("$value")
    class Type(type : StreamSpecifierType) : FactorySpecifier("${type.name}")
    class Program_id(id : String) : FactorySpecifier("p:$id")
    class Stream_id(id : String) : StreamSpecifier("i:$id")
    class Map(key : String, value : String? = null) : StreamSpecifier("m:$key${ value?.run { ":$value" }?:"" }")
    class U : StreamSpecifier("u")

    class SpecifierContainer( specifiers : List<StreamSpecifier> ) : StreamSpecifier( specifiers.joinToString(":"){it.code} )
    class FactorySpecifierContainer( specifiers : List<StreamSpecifier> ) : FactorySpecifier( specifiers.joinToString(":"){it.code} )
}

/**
 * ストリームのタイプをを指定するための列挙型クラス
 *
 * ------ Official Documents ------
 *
 * stream_type is one of following: ’v’ or ’V’ for video, ’a’ for audio, ’s’ for subtitle, ’d’ for data, and ’t’ for attachments. ’v’ matches all video streams, ’V’ only matches video streams which are not attached pictures, video thumbnails or cover arts. If additional_stream_specifier is used, then it matches streams which both have this type and match the additional_stream_specifier. Otherwise, it matches all streams of the specified type.
 * */
enum class StreamSpecifierType {
    /** video */
    v,
    /**
     * Video
     *
     * video streams which are not attached pictures, video thumbnails or cover arts.
     * */
    V,
    /** audio */
    a,
    /** subtitle */
    s,
    /** data */
    d,
    /** attachments */
    t
}

/**
 *
 * */
interface StreamSpecifierFactoryInterface {
    fun Index(value : Int) : StreamSpecifier {
        val spec = StreamSpecifier.Index(value)

        return when( this ){
            is StreamSpecifier -> StreamSpecifier.SpecifierContainer(
                listOf(this, spec)
            )
            else -> spec
        }
    }
    fun i(value : Int) : StreamSpecifier = Index(value)

    fun Type(type : StreamSpecifierType) : StreamSpecifier.FactorySpecifier {
        val spec = StreamSpecifier.Type(type)

        return when( this ){
            is StreamSpecifier -> StreamSpecifier.FactorySpecifierContainer(
                listOf(this, spec)
            )
            else -> spec
        }
    }
    val v get() = Type(StreamSpecifierType.v)
    val vUpper get() = Type(StreamSpecifierType.V)
    val a get() = Type(StreamSpecifierType.a)
    val s get() = Type(StreamSpecifierType.s)
    val d get() = Type(StreamSpecifierType.d)
    val t get() = Type(StreamSpecifierType.t)

    fun Program_id(id : String) : StreamSpecifier.FactorySpecifier {
        val spec = StreamSpecifier.Program_id(id)

        return when( this ){
            is StreamSpecifier -> StreamSpecifier.FactorySpecifierContainer(
                listOf(this, spec)
            )
            else -> spec
        }
    }
    fun p(id : String) : StreamSpecifier.FactorySpecifier = Program_id(id)

    fun Stream_id(id : String) : StreamSpecifier {
        val spec = StreamSpecifier.Stream_id(id)

        return when( this ){
            is StreamSpecifier -> StreamSpecifier.SpecifierContainer(
                listOf(this, spec)
            )
            else -> spec
        }
    }
    fun s(id : String) : StreamSpecifier = Stream_id(id)

    fun Map(key : String, value : String? = null) : StreamSpecifier {
        val spec = StreamSpecifier.Map(key, value)

        return when( this ){
            is StreamSpecifier -> StreamSpecifier.SpecifierContainer(
                listOf(this, spec)
            )
            else -> spec
        }
    }
    fun m(key : String, value : String? = null) : StreamSpecifier = Map(key, value)

    fun U() : StreamSpecifier {
        val spec = StreamSpecifier.U()

        return when( this ){
            is StreamSpecifier -> StreamSpecifier.SpecifierContainer(
                listOf(this, spec)
            )
            else -> spec
        }
    }
    val u get() = U()
}


private object Factory :
    StreamSpecifierFactoryInterface
fun <T> T.spec( func : StreamSpecifierFactoryInterface.(T)->(StreamSpecifier) ) : StreamSpecifier {
    return Factory.func(this)
}


enum class StreamType {
    /** video */
    v,
    /** video (not attached pictures,video thumbnails or cover arts) */
    V,
    /** audio */
    a,
    /** subtitle */
    s,
    /** data */
    d,
    /** attachments */
    t ;
}