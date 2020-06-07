package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attributes

import com.xxxsarutahikoxxx.kotlin.FFmpegAttr.attrSetter.y


private fun BaseAttributesImpl() =
    object : BaseAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun GenericAttributesImpl() =
    object : GenericAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun InputAttributesImpl() =
    object : InputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun OutputAttributesImpl() =
    object : OutputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}

private fun AudioInputAttributesImpl() =
    object : AudioInputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun AudioOutputAttributesImpl() =
    object : AudioOutputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun VideoInputAttributesImpl() =
    object : VideoInputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun VideoOutputAttributesImpl() =
    object : VideoOutputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun SubtitleInputAttributesImpl() =
    object : SubtitleInputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}
private fun SubtitleOutputAttributesImpl() =
    object : SubtitleOutputAttributes, MutableMap<String, MutableList<Any>> by mutableMapOf() {}


private fun bAttr(init : BaseAttributes.()->(Unit) ) : BaseAttributes {
    return BaseAttributesImpl()
        .apply(bInitializer)
        .apply(init)
}
fun gAttr(init : GenericAttributes.()->(Unit) ) : GenericAttributes {
    return GenericAttributesImpl()
        .apply(bInitializer)
        .apply(gInitializer)
        .apply(init)
}
fun iAttr(init : InputAttributes.()->(Unit) ) : InputAttributes {
    return InputAttributesImpl()
        .apply(bInitializer)
        .apply(iInitializer)
        .apply(init)
}
fun oAttr(init : OutputAttributes.()->(Unit) ) : OutputAttributes {
    return OutputAttributesImpl()
        .apply(bInitializer)
        .apply(oInitializer)
        .apply(init)
}

fun aiAttr(init : AudioInputAttributes.()->(Unit) ) : AudioInputAttributes {
    return AudioInputAttributesImpl()
        .apply(init)
}
fun aoAttr(init : AudioOutputAttributes.()->(Unit) ) : AudioOutputAttributes {
    return AudioOutputAttributesImpl()
        .apply(init)
}
fun viAttr(init : VideoInputAttributes.()->(Unit) ) : VideoInputAttributes {
    return VideoInputAttributesImpl()
        .apply(init)
}
fun voAttr(init : VideoOutputAttributes.()->(Unit) ) : VideoOutputAttributes {
    return VideoOutputAttributesImpl()
        .apply(init)
}
fun siAttr(init : SubtitleInputAttributes.()->(Unit) ) : SubtitleInputAttributes {
    return SubtitleInputAttributesImpl()
        .apply(init)
}
fun soAttr(init : SubtitleOutputAttributes.()->(Unit) ) : SubtitleOutputAttributes {
    return SubtitleOutputAttributesImpl()
        .apply(init)
}



private var bInitializer : BaseAttributes.()->(Unit) = {

}
/**
 * [BaseAttributes] の初期化関数を設定する
 *
 * [bAttr]で生成された[BaseAttributes]は[bInitializer] を実行した属性を持つ
 * */
fun bInitializer( init : BaseAttributes.()->(Unit) ){ bInitializer = init }

private var gInitializer : GenericAttributes.()->(Unit) = {
    y  = true
}
/**
 * [GenericAttributes] の初期化関数を設定する
 *
 * [gAttr]で生成された[GenericAttributes]は[bInitializer] [gInitializer]を順に実行した属性を持つ
 * */
fun gInitializer( init : GenericAttributes.()->(Unit) ){ gInitializer = init }

private var iInitializer : InputAttributes.()->(Unit) = {

}
/**
 * [InputAttributes] の初期化関数を設定する
 *
 * [iAttr]で生成された[InputAttributes]は[bInitializer] [iInitializer]を順に実行した属性を持つ
 * */
fun iInitializer( init : InputAttributes.()->(Unit) ){ iInitializer = init }

private var oInitializer : OutputAttributes.()->(Unit) = {

}
/**
 * [OutputAttributes] の初期化関数を設定する
 *
 * [oAttr]で生成された[OutputAttributes]は[bInitializer] [oInitializer]を順に実行した属性を持つ
 * */
fun oInitializer( init : OutputAttributes.()->(Unit) ){ oInitializer = init }
