package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.executor

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility.isReserved
import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.utility.out


/** FFmpeg プロセスを起動して -filters により フィルターリストを取得する */
val FFmpeg.Companion.filters : List<String> get(){
    FFmpeg(waitFor = true).apply {
        invoke("-filters")

        return normalStream.split("\n").filter { it.contains("->") }.map {
            it.split(" ")[2]
        }
    }
}

/** FFmpeg プロセスを起動して -h filter=name により フィルターのドキュメントを取得する */
fun FFmpeg.Companion.filter(name : String) : String {
    FFmpeg(waitFor = true).apply {
        invoke("-h filter=$name")
        return normalStream
    }
}



/**
 * FFmpeg プロセスを起動して -filters により フィルターリストを取得する
 *
 * ※ 注意
 *
 * 1. 関数名がKotlinの予約語と衝突する -> 名の後ろにアンダーバーを付ける
 *
 * 2. 引数が数字から始まる -> 名の前にアンダーバーを付ける
 *
 * 3. 引数に大文字・小文字の違いしかない同一引数名が使われている -> 後者の引数の名の前にアンダーバーを付ける
 *
 * 4. 引数に - が使われて理宇 -> アンダーバーに置換する
 *
 * */
internal fun FFmpeg.Companion.printFilterInfo(name : String){
    val (arguments, subArguments, normal)  = FFmpeg(waitFor = true).run {
        invoke("-h filter=$name")

        // in out 情報の取得
        val inputs =  normalStream.split("Inputs:\n")[1].split("\n    Outputs:")[0].split("\n").map { it.trim() }
        val outputs =  normalStream.split("Outputs:\n")[1].split("\nafade AVOptions:")[0].split("\n").map { it.trim() }


        // 引数情報の取得
        class info(val name : String, val type : String, val des : String, val def : String?, val values : MutableList<String>)

        val arguments = mutableListOf<info>()
        val subArguments = mutableListOf<info>()

        if( normalStream.contains("AVOptions:\n") ){
            val args = normalStream.split("AVOptions:\n")[1].run {
                if( ! startsWith("\n") ) split("\n\n")[0].split("\n") else listOf()
            }

            args.forEach {
                val list = it.split(" ").filter { it.isNotEmpty() }

                when {
                    list[1].run { contains("<") && contains(">") } -> {
                        val name = list[0].replace("-", "__")
                        val type = list[1].removeSurrounding("<", ">")
                        val des = list.run { subList(3, size) }.joinToString(" ")
                        val def = if( it.contains("(default ") ) it.split("(default ")[1].split(")")[0] else null

                        val info = info(name, type, des, def, mutableListOf())

                        // 省略表記用だった場合は (second -> s)　sub に保存する
                        if( arguments.isNotEmpty() && (arguments.lastOrNull()?.des == des) && name.length <= 2 ){
                            subArguments.add( info )
                        }else{
                            arguments.add( info )
                        }
                    }
                    else -> {
                        val name = list[0]

                        when( list.size ){
                            2 -> {}
                            4 -> {
                                val value = list[1]
                                val des = list.run { subList(3, size) }.joinToString(" ")
                            }
                        }

                        arguments.last().values.add(name)
                    }
                }
            }
        }

        Triple(arguments, subArguments, normalStream)
    }


    val name = name.isReserved("${name}_")
    val combined = listOf(*arguments.toTypedArray(), *subArguments.toTypedArray())
    val argNames = combined.map{
        val aName = it.name
        if( aName.matches(Regex("^[0-9].+")) || it.name.isReserved ) "_${aName}" else aName
    }


    out = """
/**
 * 
 * 
 *

  ---------- Official Document ----------
 
 [Document ( ${name.removeSuffix("_")} )](https://ffmpeg.org/ffmpeg-filters.html#${name.removeSuffix("_")})
 
```
 ${normal}
```
 * */
class ${name}(
${ argNames.joinToString(""){ "    val $it : Any? = null,\n" } }
    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [${name}] を参照してください */
fun String.${name}(${ argNames.joinToString(", ") { "$it : Any? = null" } }) : ${name} {
    return ${name}(${ argNames.joinToString("") { "$it, " } }"", "").apply { setInputs(this@${name}) }
}


    """.trimIndent()

}

