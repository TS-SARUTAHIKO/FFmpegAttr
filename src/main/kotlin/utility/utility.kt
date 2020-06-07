package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility

import java.io.InputStream
import java.lang.RuntimeException


/** 標準出力 */
internal var out : Any?
    get() = throw RuntimeException("入力専用")
    set(value) { println(value) }

/** 標準エラー出力 */
internal var error : Any?
    get() = throw RuntimeException("入力専用")
    set(value) { value?.let{ RuntimeException("$value").printStackTrace() } }

/**  */
private class Loader {
    companion object {
        fun getResourceAsStream(name : String) : InputStream =
            Loader::class.java.getResourceAsStream("/$name")
    }
}
internal fun getResourceAsStream(name : String) = Loader.getResourceAsStream(name)



/** 指定した文字列が正規表現を満たす場合は引数関数を実行する */
fun <R> String.ifMatches(regexes : List<String>, noMatch : (String)->R? = { null }, match: (String) -> R): R? {
    return if( regexes.any { this.matches(Regex(it)) } ){
        match(this)
    }else{
        noMatch ?. invoke(this)
        null
    }
}
/** 指定した文字列が正規表現を満たす場合は引数関数を実行する */
fun <R> String.ifMatches(regex : String, noMatch : (String)->R? = { null }, match: (String) -> R): R? = this.ifMatches(listOf(regex), noMatch, match)

/** 文字列が時間表現( [-][HH:]MM:SS[.m...] or [-]S+[.m...] )になっているなら引数関数を実行する */
fun <R> String.ifTime(noMatch : (String) -> R? = { error = "$this は時間表現の形式と一致しません" ; null }, match: (String) -> R? ) : R? {
    return ifMatches(listOf("-?[0-9]+(\\.[0-9]+)?", "-?([0-9]+:)?[0-9]+:[0-9]+(\\.[0-9]+)?"), noMatch, match)
}

/** 文字列が日付表現( [(YYYY-MM-DD|YYYYMMDD)[T|t| ]]((HH:MM:SS[.m...]]])|(HHMMSS[.m...]]]))[Z] or now )になっているなら引数関数を実行する */
fun <R> String.ifDate(noMatch : (String) -> R? = { error = "$this は日付表現の形式と一致しません" ; null }, match: (String) -> R? ) : R? {
    return ifMatches(listOf(".", "now"), noMatch, match)

    // TODO : 時間表現の形式確認
}

/**
 * 文字列が [Stream Specifiers](https://ffmpeg.org/ffmpeg.html#Stream-specifiers-1) の規格を満たしているなら引数関数を実行する
 */
fun <R> String.ifStreamSpecifier(noMatch : (String)->(R?) = { error = "$this は Stream Specifiers 表現の形式と一致しません" ; null }, match : (String)->R?) : R? {
    return ifMatches(listOf(".", ""), noMatch, match)

    // TODO : Stream Specifier 表現の形式確認
}

/**
 * 文字列がメタデータの規格を満たしているなら引数関数を実行する
 */
fun <R> String.ifMetadataSpecifier(noMatch : (String)->(R?) = { error = "$this はメタデータ表現の形式と一致しません" ; null }, match : (String)->R?) : R? {
    return ifMatches(listOf(".", ""), noMatch, match)

    // TODO : Stream Specifier 表現の形式確認
}



val String.isReserved : Boolean get(){
    return this in listOf("is", "as", "null", "object", "in", "if" ,"when", "else", "format")
}
fun String.isReserved( instead : String ) : String {
    return if( isReserved ) instead else this
}