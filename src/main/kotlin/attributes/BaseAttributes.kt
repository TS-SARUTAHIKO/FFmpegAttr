package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility.ifMetadataSpecifier
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility.ifStreamSpecifier


/**
 *
 * key に対応した値の保持方法は key が真偽型の場合と非真偽型の場合で異なる
 *
 * 非真偽型の場合
 *
 * 対応したリストの要素として追加される。リストは最低でも１つの要素をもつ。
 *
 * 真偽型の場合
 *
 * key = true と設定する場合は、key に対応したリストが要素数＝０で保存され、nokey に対応したリストが除去される。
 *
 * key = false と設定する場合は、nokey に対応したリストが要素数＝０で保存され、key に対応したリストが除去される。
 *
 * key = null と設定すると、key と nokey に対応したリストが除去される。
 *
 * */
interface BaseAttributes : MutableMap<String, MutableList<Any>> {
    val code : List<String> get(){
        return entries
            .map {
                val key = it.key

                if( it.value.isEmpty() ){
                    listOf<Any>( "-$key" )
                }else{
                    it.value.map { listOf("-$key", it) }.flatten()
                }
            }
            .flatten()
            .map { "$it" }
    }

    /**
     *　key に対応したリストに value の値を追加する
     * */
    fun addValue(key : String, value : Any){
        val key = key.removePrefix("-")

        getOrPut(key, { mutableListOf<Any>() }).add( value )
    }
    /**
     * 真偽型の key の値を設定する
     *
     * 値が true の場合は -key が設定され -nokey が除去される
     *
     * 値が false の場合は -nokey が設定され -key が除去される
     *
     * 値が null の場合は -key, -nokey が除去される
     * */
    fun setValue(key : String, value : Boolean?){
        val key = key.removePrefix("-")

        when( value ){
            true -> {
                set(key, mutableListOf())
                remove("no$key")
            }
            false -> {
                remove(key)
                set("no$key", mutableListOf())
            }
            null -> {
                remove(key)
                remove("no$key")
            }
        }
    }

    /**
     * key に対応したリストに保存された先頭の値を返す
     *
     * 対応したリストが存在しないなら null を返す
     * */
    fun getValue(key : String) : Any? {
        val key = key.removePrefix("-")

        val list = get(key)
        val nolist = get("no$key")

        return when {
            nolist?.isEmpty() ?: false -> false
            list?.isEmpty() ?: false -> true
            else -> list?.first()
        }
    }


    /**
     * 属性を文字列で直接追加するためのオペレーター
     * */
    operator fun String.rangeTo(value : Any) : Unit {
        addValue(this, value)
    }
}


/**
 * BaseAttributes への中継クラス
 * */
open class AttributesAdapter<Type>(val base : BaseAttributes, val key : String)

/**
 * Specifier を持つオプション用のアダプター
 * */
abstract class SpecifierAdapter<Type>(base : BaseAttributes, key : String) : AttributesAdapter<Type>(base, key) {
    open operator fun set(specifier : String, value : Type?){
        val key = "$key${ if( specifier.isEmpty() ) "" else ":$specifier" }"

        when {
            value is Boolean? -> base.setValue(key, value as Boolean?)

            else -> base.addValue(key, value as Any)
        }
    }
    open operator fun get(specifier : String) : Type? {
        val key = "$key${ if( specifier.isEmpty() ) "" else ":$specifier" }"

        return base.getValue(key) as Type?
    }
}

/**
 * Specifier を持たないオプション用のアダプター
 * */
class NoSpecifierAdapter<Type>(base : BaseAttributes, key : String) : SpecifierAdapter<Type>(base, key) {
    override operator fun set(specifier : String, value : Type?) = super.set("", value)
    override operator fun get(specifier : String) : Type? = super.get("")
}

/**
 * Stream Specifier を持つオプション用のアダプター
 * */
class StreamSpecifierAdapter<Type>(base : BaseAttributes, key : String) : SpecifierAdapter<Type>(base, key) {
    override operator fun set(specifier : String, value : Type?) {
        specifier.ifStreamSpecifier { super.set(specifier, value) }
    }
    override operator fun get(specifier : String) : Type? {
        return specifier.ifStreamSpecifier { super.get(specifier) }
    }

    operator fun set(specifier : StreamSpecifier, value : Type?){
        set(specifier.code, value)
    }
    operator fun get(specifier : StreamSpecifier) : Type? {
        return get(specifier.code)
    }
}
/**
 * Metadata Specifier を持つオプション用のアダプター
 * */
class MetadataSpecifierAdapter<Type>(base : BaseAttributes, key : String) : SpecifierAdapter<Type>(base, key) {
    override operator fun set(specifier : String, value : Type?) {
        specifier.ifMetadataSpecifier { super.set(specifier, value) }
    }
    override operator fun get(specifier : String) : Type? {
        return specifier.ifMetadataSpecifier { super.get(specifier) }
    }

    operator fun set(specifier : MetadataSpecifier, value : Type?){
        set(specifier.code, value)
    }
    operator fun get(specifier : MetadataSpecifier) : Type? {
        return get(specifier.code)
    }
}
