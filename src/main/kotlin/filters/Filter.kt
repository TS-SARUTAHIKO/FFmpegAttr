package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters

import java.lang.RuntimeException

/**
 * Filter と FilterComplex を共通で扱うための親クラス
 * */
interface FilterOrComplex

interface Filter : FilterOrComplex {
    val inLabels : List<String>
    val outLabels : List<String>

    val code : String get(){
        val name = this.javaClass.simpleName.toLowerCase().removePrefix("_").removeSuffix("_")

        val fields = this.javaClass.declaredFields.mapNotNull {
            it.isAccessible = true
            val pName = it.name.removePrefix("_").removeSuffix("_").replace("__", "-")
            val value = it.get(this)

            if( value == null ) null else "$pName=$value"
        }.joinToString(":").run {
            if( isEmpty() ) "" else "=$this"
        }

        return "${ 
            inLabels.joinToString(""){ "[$it]" } 
        }$name$fields${ 
            outLabels.joinToString(""){ "[$it]" }
        }"
    }

    fun setInputs(inputs : String){
        (this.inLabels as MutableList<String>).apply {
            clear()
            addAll( inputs.toLabels )
        }
    }
    fun setOutputs(outputs : String){
        (this.outLabels as MutableList<String>).apply {
            clear()
            addAll( outputs.toLabels )
        }
    }

    operator fun invoke(vararg outputs : String) : Filter {
        setOutputs(outputs.joinToString(","))
        return this
    }

}
open class FilterImpl private constructor(
    override val inLabels : List<String>,
    override val outLabels : List<String>
) : Filter {
    constructor(inputs : String, outputs : String) : this(inputs.toLabels.toMutableList(), outputs.toLabels.toMutableList())
}


/**
 * 複合フィルターの管理用クラス
 *
 * 前方のフィルターへの接続方法(Boolean?)とフィルター([Filter])のペアを持つ
 *
 * 接続方法が null なら 先頭のフィルターである
 *
 * 接続方法が true なら グラフ接続 (;)
 *
 * 接続方法が false なら チェーン接続 (,)
 *
 * */
class FilterComplex(filter : Filter) : FilterOrComplex, MutableMap<Boolean?, Filter> by mutableMapOf( null to filter ) {
    val code : String get(){
        val ret = entries.joinToString(""){
            val type = when( it.key ){
                true -> ";"
                false -> ","
                null -> ""
            }
            "${type}${it.value.code}"
        }
        return "\"$ret\""
    }

    fun graph(filter : Filter) = put(true, filter)
    fun chain(filter : Filter) = put(false, filter)
}

/**
 * フィルター合成関数の土台クラス
 * */
object FilterMixer {
    infix fun Filter.graph(filter : Filter) : FilterComplex {
        return FilterComplex(this).apply { graph(filter) }
    }
    infix fun Filter.chain(filter : Filter) : FilterComplex {
        return FilterComplex(this).apply { chain(filter) }
    }

    infix fun FilterComplex.graph(filter : Filter) : FilterComplex {
        return this.apply { graph(filter) }
    }
    infix fun FilterComplex.chain(filter : Filter) : FilterComplex {
        return this.apply { chain(filter) }
    }

    infix fun FilterComplex.graph(complex : FilterComplex) : FilterComplex {
        return this.apply {
            complex.entries.map {
                when( it.key ){
                    true -> this.graph(it.value)
                    false -> this.chain(it.value)
                    null -> this.graph(it.value)
                }
            }
        }
    }
    infix fun FilterComplex.chain(complex : FilterComplex) : FilterComplex {
        return this.apply {
            complex.entries.map {
                when( it.key ){
                    true -> this.graph(it.value)
                    false -> this.chain(it.value)
                    null -> this.chain(it.value)
                }
            }
        }
    }

    infix fun Filter.graph(complex : FilterComplex) : FilterComplex {
        return FilterComplex(this).apply {
            complex.entries.map {
                when( it.key ){
                    true -> this.graph(it.value)
                    false -> this.chain(it.value)
                    null -> this.graph(it.value)
                }
            }
        }
    }
    infix fun Filter.chain(complex : FilterComplex) : FilterComplex {
        return FilterComplex(this).apply {
            complex.entries.map {
                when( it.key ){
                    true -> this.graph(it.value)
                    false -> this.chain(it.value)
                    null -> this.chain(it.value)
                }
            }
        }
    }

    operator fun Filter.plus(filter : Filter) : FilterComplex = this graph filter
    operator fun Filter.times(filter : Filter) : FilterComplex = this chain filter

    operator fun FilterComplex.plus(filter : Filter) : FilterComplex = this graph filter
    operator fun FilterComplex.times(filter : Filter) : FilterComplex = this chain filter

    operator fun FilterComplex.plus(filter : FilterComplex) : FilterComplex = this graph filter
    operator fun FilterComplex.times(filter : FilterComplex) : FilterComplex = this chain filter

    operator fun Filter.plus(filter : FilterComplex) : FilterComplex = this graph filter
    operator fun Filter.times(filter : FilterComplex) : FilterComplex = this chain filter
}



/** フィルターのラベルの表示方法に合わせた変換 */
private val String.toLabels : List<String> get(){
    return (this as CharSequence).split(",")
        .map { (it.removePrefix(" ").removeSuffix(" ") as CharSequence).split("]") }.flatten()
        .map { (it.removePrefix(" ").removeSuffix(" ") as CharSequence).split("[") }.flatten()
        .map { it.removePrefix(" ").removeSuffix(" ") }
        .filter { it.isNotEmpty() }
}

/**
 * FilterComplex のファクトリ関数
 * */
fun FilterGenerator(func : FilterMixer.()->(FilterOrComplex) ) : FilterComplex {
    return when( val value = FilterMixer.func() ){
        is FilterComplex -> value
        is Filter -> FilterComplex(
            value
        )
        else -> throw RuntimeException("不明なフィルター要素が検出されました $value")
    }
}

