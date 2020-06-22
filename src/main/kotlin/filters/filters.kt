package com.xxxsarutahikoxxx.kotlin.FFmpegAttr.filters


/**
 *
 *
 *

---------- Official Document ----------

[Document ( abench )](https://ffmpeg.org/ffmpeg-filters.html#abench)

```
Filter abench
Benchmark part of a filtergraph.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
abench AVOptions:
action            <int>        ..F.A..... set action (from 0 to 1) (default start)
start           0            ..F.A..... start timer
stop            1            ..F.A..... stop timer


```
 * */
class abench(
    val action : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [abench] を参照してください */
fun String.abench(action : Any? = null) : abench {
    return abench(action, "", "").apply { setInputs(this@abench) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acompressor )](https://ffmpeg.org/ffmpeg-filters.html#acompressor)

```
Filter acompressor
Audio compressor.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
acompressor AVOptions:
level_in          <double>     ..F.A....T set input gain (from 0.015625 to 64) (default 1)
mode              <int>        ..F.A....T set mode (from 0 to 1) (default downward)
downward        0            ..F.A....T
upward          1            ..F.A....T
threshold         <double>     ..F.A....T set threshold (from 0.000976563 to 1) (default 0.125)
ratio             <double>     ..F.A....T set ratio (from 1 to 20) (default 2)
attack            <double>     ..F.A....T set attack (from 0.01 to 2000) (default 20)
release           <double>     ..F.A....T set release (from 0.01 to 9000) (default 250)
makeup            <double>     ..F.A....T set make up gain (from 1 to 64) (default 1)
knee              <double>     ..F.A....T set knee (from 1 to 8) (default 2.82843)
link              <int>        ..F.A....T set link type (from 0 to 1) (default average)
average         0            ..F.A....T
maximum         1            ..F.A....T
detection         <int>        ..F.A....T set detection (from 0 to 1) (default rms)
peak            0            ..F.A....T
rms             1            ..F.A....T
level_sc          <double>     ..F.A....T set sidechain gain (from 0.015625 to 64) (default 1)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)


```
 * */
class acompressor(
    val level_in : Any? = null,
    val mode : Any? = null,
    val threshold : Any? = null,
    val ratio : Any? = null,
    val attack : Any? = null,
    val release : Any? = null,
    val makeup : Any? = null,
    val knee : Any? = null,
    val link : Any? = null,
    val detection : Any? = null,
    val level_sc : Any? = null,
    val mix : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acompressor] を参照してください */
fun String.acompressor(level_in : Any? = null, mode : Any? = null, threshold : Any? = null, ratio : Any? = null, attack : Any? = null, release : Any? = null, makeup : Any? = null, knee : Any? = null, link : Any? = null, detection : Any? = null, level_sc : Any? = null, mix : Any? = null) : acompressor {
    return acompressor(level_in, mode, threshold, ratio, attack, release, makeup, knee, link, detection, level_sc, mix, "", "").apply { setInputs(this@acompressor) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acontrast )](https://ffmpeg.org/ffmpeg-filters.html#acontrast)

```
Filter acontrast
Simple audio dynamic range compression/expansion filter.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
acontrast AVOptions:
contrast          <float>      ..F.A..... set contrast (from 0 to 100) (default 33)


```
 * */
class acontrast(
    val contrast : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acontrast] を参照してください */
fun String.acontrast(contrast : Any? = null) : acontrast {
    return acontrast(contrast, "", "").apply { setInputs(this@acontrast) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acopy )](https://ffmpeg.org/ffmpeg-filters.html#acopy)

```
Filter acopy
Copy the input audio unchanged to the output.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class acopy(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acopy] を参照してください */
fun String.acopy() : acopy {
    return acopy("", "").apply { setInputs(this@acopy) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acue )](https://ffmpeg.org/ffmpeg-filters.html#acue)

```
Filter acue
Delay filtering to match a cue.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
acue AVOptions:
cue               <int64>      ..FVA..... cue unix timestamp in microseconds (from 0 to I64_MAX) (default 0)
preroll           <duration>   ..FVA..... preroll duration in seconds (default 0)
buffer            <duration>   ..FVA..... buffer duration in seconds (default 0)


```
 * */
class acue(
    val cue : Any? = null,
    val preroll : Any? = null,
    val buffer : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acue] を参照してください */
fun String.acue(cue : Any? = null, preroll : Any? = null, buffer : Any? = null) : acue {
    return acue(cue, preroll, buffer, "", "").apply { setInputs(this@acue) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acrossfade )](https://ffmpeg.org/ffmpeg-filters.html#acrossfade)

```
Filter acrossfade
Cross fade two input audio streams.
Inputs:
#0: crossfade0 (audio)
#1: crossfade1 (audio)
Outputs:
#0: default (audio)
acrossfade AVOptions:
nb_samples        <int>        ..F.A..... set number of samples for cross fade duration (from 1 to 2.14748e+08) (default 44100)
ns                <int>        ..F.A..... set number of samples for cross fade duration (from 1 to 2.14748e+08) (default 44100)
duration          <duration>   ..F.A..... set cross fade duration (default 0)
d                 <duration>   ..F.A..... set cross fade duration (default 0)
overlap           <boolean>    ..F.A..... overlap 1st stream end with 2nd stream start (default true)
o                 <boolean>    ..F.A..... overlap 1st stream end with 2nd stream start (default true)
curve1            <int>        ..F.A..... set fade curve type for 1st stream (from 0 to 17) (default tri)
tri             0            ..F.A..... linear slope
qsin            1            ..F.A..... quarter of sine wave
esin            2            ..F.A..... exponential sine wave
hsin            3            ..F.A..... half of sine wave
log             4            ..F.A..... logarithmic
ipar            5            ..F.A..... inverted parabola
qua             6            ..F.A..... quadratic
cub             7            ..F.A..... cubic
squ             8            ..F.A..... square root
cbr             9            ..F.A..... cubic root
par             10           ..F.A..... parabola
exp             11           ..F.A..... exponential
iqsin           12           ..F.A..... inverted quarter of sine wave
ihsin           13           ..F.A..... inverted half of sine wave
dese            14           ..F.A..... double-exponential seat
desi            15           ..F.A..... double-exponential sigmoid
losi            16           ..F.A..... logistic sigmoid
nofade          17           ..F.A..... no fade; keep audio as-is
c1                <int>        ..F.A..... set fade curve type for 1st stream (from 0 to 17) (default tri)
tri             0            ..F.A..... linear slope
qsin            1            ..F.A..... quarter of sine wave
esin            2            ..F.A..... exponential sine wave
hsin            3            ..F.A..... half of sine wave
log             4            ..F.A..... logarithmic
ipar            5            ..F.A..... inverted parabola
qua             6            ..F.A..... quadratic
cub             7            ..F.A..... cubic
squ             8            ..F.A..... square root
cbr             9            ..F.A..... cubic root
par             10           ..F.A..... parabola
exp             11           ..F.A..... exponential
iqsin           12           ..F.A..... inverted quarter of sine wave
ihsin           13           ..F.A..... inverted half of sine wave
dese            14           ..F.A..... double-exponential seat
desi            15           ..F.A..... double-exponential sigmoid
losi            16           ..F.A..... logistic sigmoid
nofade          17           ..F.A..... no fade; keep audio as-is
curve2            <int>        ..F.A..... set fade curve type for 2nd stream (from 0 to 17) (default tri)
tri             0            ..F.A..... linear slope
qsin            1            ..F.A..... quarter of sine wave
esin            2            ..F.A..... exponential sine wave
hsin            3            ..F.A..... half of sine wave
log             4            ..F.A..... logarithmic
ipar            5            ..F.A..... inverted parabola
qua             6            ..F.A..... quadratic
cub             7            ..F.A..... cubic
squ             8            ..F.A..... square root
cbr             9            ..F.A..... cubic root
par             10           ..F.A..... parabola
exp             11           ..F.A..... exponential
iqsin           12           ..F.A..... inverted quarter of sine wave
ihsin           13           ..F.A..... inverted half of sine wave
dese            14           ..F.A..... double-exponential seat
desi            15           ..F.A..... double-exponential sigmoid
losi            16           ..F.A..... logistic sigmoid
nofade          17           ..F.A..... no fade; keep audio as-is
c2                <int>        ..F.A..... set fade curve type for 2nd stream (from 0 to 17) (default tri)
tri             0            ..F.A..... linear slope
qsin            1            ..F.A..... quarter of sine wave
esin            2            ..F.A..... exponential sine wave
hsin            3            ..F.A..... half of sine wave
log             4            ..F.A..... logarithmic
ipar            5            ..F.A..... inverted parabola
qua             6            ..F.A..... quadratic
cub             7            ..F.A..... cubic
squ             8            ..F.A..... square root
cbr             9            ..F.A..... cubic root
par             10           ..F.A..... parabola
exp             11           ..F.A..... exponential
iqsin           12           ..F.A..... inverted quarter of sine wave
ihsin           13           ..F.A..... inverted half of sine wave
dese            14           ..F.A..... double-exponential seat
desi            15           ..F.A..... double-exponential sigmoid
losi            16           ..F.A..... logistic sigmoid
nofade          17           ..F.A..... no fade; keep audio as-is


```
 * */
class acrossfade(
    val nb_samples : Any? = null,
    val duration : Any? = null,
    val overlap : Any? = null,
    val curve1 : Any? = null,
    val curve2 : Any? = null,
    val ns : Any? = null,
    val d : Any? = null,
    val o : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acrossfade] を参照してください */
fun String.acrossfade(nb_samples : Any? = null, duration : Any? = null, overlap : Any? = null, curve1 : Any? = null, curve2 : Any? = null, ns : Any? = null, d : Any? = null, o : Any? = null, c1 : Any? = null, c2 : Any? = null) : acrossfade {
    return acrossfade(nb_samples, duration, overlap, curve1, curve2, ns, d, o, c1, c2, "", "").apply { setInputs(this@acrossfade) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acrossover )](https://ffmpeg.org/ffmpeg-filters.html#acrossover)

```
Filter acrossover
Split audio into per-bands streams.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
acrossover AVOptions:
split             <string>     ..F.A..... set split frequencies (default "500")
order             <int>        ..F.A..... set order (from 0 to 2) (default 4th)
2nd             0            ..F.A..... 2nd order
4th             1            ..F.A..... 4th order
8th             2            ..F.A..... 8th order


```
 * */
class acrossover(
    val split : Any? = null,
    val order : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acrossover] を参照してください */
fun String.acrossover(split : Any? = null, order : Any? = null) : acrossover {
    return acrossover(split, order, "", "").apply { setInputs(this@acrossover) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( acrusher )](https://ffmpeg.org/ffmpeg-filters.html#acrusher)

```
Filter acrusher
Reduce audio bit resolution.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
acrusher AVOptions:
level_in          <double>     ..F.A..... set level in (from 0.015625 to 64) (default 1)
level_out         <double>     ..F.A..... set level out (from 0.015625 to 64) (default 1)
bits              <double>     ..F.A..... set bit reduction (from 1 to 64) (default 8)
mix               <double>     ..F.A..... set mix (from 0 to 1) (default 0.5)
mode              <int>        ..F.A..... set mode (from 0 to 1) (default lin)
lin             0            ..F.A..... linear
log             1            ..F.A..... logarithmic
dc                <double>     ..F.A..... set DC (from 0.25 to 4) (default 1)
aa                <double>     ..F.A..... set anti-aliasing (from 0 to 1) (default 0.5)
samples           <double>     ..F.A..... set sample reduction (from 1 to 250) (default 1)
lfo               <boolean>    ..F.A..... enable LFO (default false)
lforange          <double>     ..F.A..... set LFO depth (from 1 to 250) (default 20)
lforate           <double>     ..F.A..... set LFO rate (from 0.01 to 200) (default 0.3)


```
 * */
class acrusher(
    val level_in : Any? = null,
    val level_out : Any? = null,
    val bits : Any? = null,
    val mix : Any? = null,
    val mode : Any? = null,
    val dc : Any? = null,
    val aa : Any? = null,
    val samples : Any? = null,
    val lfo : Any? = null,
    val lforange : Any? = null,
    val lforate : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [acrusher] を参照してください */
fun String.acrusher(level_in : Any? = null, level_out : Any? = null, bits : Any? = null, mix : Any? = null, mode : Any? = null, dc : Any? = null, aa : Any? = null, samples : Any? = null, lfo : Any? = null, lforange : Any? = null, lforate : Any? = null) : acrusher {
    return acrusher(level_in, level_out, bits, mix, mode, dc, aa, samples, lfo, lforange, lforate, "", "").apply { setInputs(this@acrusher) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( adeclick )](https://ffmpeg.org/ffmpeg-filters.html#adeclick)

```
Filter adeclick
Remove impulsive noise from input audio.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
adeclick AVOptions:
w                 <double>     ..F.A..... set window size (from 10 to 100) (default 55)
o                 <double>     ..F.A..... set window overlap (from 50 to 95) (default 75)
a                 <double>     ..F.A..... set autoregression order (from 0 to 25) (default 2)
t                 <double>     ..F.A..... set threshold (from 1 to 100) (default 2)
b                 <double>     ..F.A..... set burst fusion (from 0 to 10) (default 2)
m                 <int>        ..F.A..... set overlap method (from 0 to 1) (default a)
a               0            ..F.A..... overlap-add
s               1            ..F.A..... overlap-save

This filter has support for timeline through the 'enable' option.

```
 * */
class adeclick(
    val w : Any? = null,
    val o : Any? = null,
    val a : Any? = null,
    val t : Any? = null,
    val b : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [adeclick] を参照してください */
fun String.adeclick(w : Any? = null, o : Any? = null, a : Any? = null, t : Any? = null, b : Any? = null, m : Any? = null) : adeclick {
    return adeclick(w, o, a, t, b, m, "", "").apply { setInputs(this@adeclick) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( adeclip )](https://ffmpeg.org/ffmpeg-filters.html#adeclip)

```
Filter adeclip
Remove clipping from input audio.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
adeclip AVOptions:
w                 <double>     ..F.A..... set window size (from 10 to 100) (default 55)
o                 <double>     ..F.A..... set window overlap (from 50 to 95) (default 75)
a                 <double>     ..F.A..... set autoregression order (from 0 to 25) (default 8)
t                 <double>     ..F.A..... set threshold (from 1 to 100) (default 10)
n                 <int>        ..F.A..... set histogram size (from 100 to 9999) (default 1000)
m                 <int>        ..F.A..... set overlap method (from 0 to 1) (default a)
a               0            ..F.A..... overlap-add
s               1            ..F.A..... overlap-save

This filter has support for timeline through the 'enable' option.

```
 * */
class adeclip(
    val w : Any? = null,
    val o : Any? = null,
    val a : Any? = null,
    val t : Any? = null,
    val n : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [adeclip] を参照してください */
fun String.adeclip(w : Any? = null, o : Any? = null, a : Any? = null, t : Any? = null, n : Any? = null, m : Any? = null) : adeclip {
    return adeclip(w, o, a, t, n, m, "", "").apply { setInputs(this@adeclip) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( adelay )](https://ffmpeg.org/ffmpeg-filters.html#adelay)

```
Filter adelay
Delay one or more audio channels.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
adelay AVOptions:
delays            <string>     ..F.A..... set list of delays for each channel
all               <boolean>    ..F.A..... use last available delay for remained channels (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class adelay(
    val delays : Any? = null,
    val all : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [adelay] を参照してください */
fun String.adelay(delays : Any? = null, all : Any? = null) : adelay {
    return adelay(delays, all, "", "").apply { setInputs(this@adelay) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aderivative )](https://ffmpeg.org/ffmpeg-filters.html#aderivative)

```
Filter aderivative
Compute derivative of input audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class aderivative(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aderivative] を参照してください */
fun String.aderivative() : aderivative {
    return aderivative("", "").apply { setInputs(this@aderivative) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aecho )](https://ffmpeg.org/ffmpeg-filters.html#aecho)

```
Filter aecho
Add echoing to the audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aecho AVOptions:
in_gain           <float>      ..F.A..... set signal input gain (from 0 to 1) (default 0.6)
out_gain          <float>      ..F.A..... set signal output gain (from 0 to 1) (default 0.3)
delays            <string>     ..F.A..... set list of signal delays (default "1000")
decays            <string>     ..F.A..... set list of signal decays (default "0.5")


```
 * */
class aecho(
    val in_gain : Any? = null,
    val out_gain : Any? = null,
    val delays : Any? = null,
    val decays : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aecho] を参照してください */
fun String.aecho(in_gain : Any? = null, out_gain : Any? = null, delays : Any? = null, decays : Any? = null) : aecho {
    return aecho(in_gain, out_gain, delays, decays, "", "").apply { setInputs(this@aecho) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aemphasis )](https://ffmpeg.org/ffmpeg-filters.html#aemphasis)

```
Filter aemphasis
Audio emphasis.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aemphasis AVOptions:
level_in          <double>     ..F.A..... set input gain (from 0 to 64) (default 1)
level_out         <double>     ..F.A..... set output gain (from 0 to 64) (default 1)
mode              <int>        ..F.A..... set filter mode (from 0 to 1) (default reproduction)
reproduction    0            ..F.A.....
production      1            ..F.A.....
type              <int>        ..F.A..... set filter type (from 0 to 8) (default cd)
col             0            ..F.A..... Columbia
emi             1            ..F.A..... EMI
bsi             2            ..F.A..... BSI (78RPM)
riaa            3            ..F.A..... RIAA
cd              4            ..F.A..... Compact Disc (CD)
50fm            5            ..F.A..... 50µs (FM)
75fm            6            ..F.A..... 75µs (FM)
50kf            7            ..F.A..... 50µs (FM-KF)
75kf            8            ..F.A..... 75µs (FM-KF)


```
 * */
class aemphasis(
    val level_in : Any? = null,
    val level_out : Any? = null,
    val mode : Any? = null,
    val type : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aemphasis] を参照してください */
fun String.aemphasis(level_in : Any? = null, level_out : Any? = null, mode : Any? = null, type : Any? = null) : aemphasis {
    return aemphasis(level_in, level_out, mode, type, "", "").apply { setInputs(this@aemphasis) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aeval )](https://ffmpeg.org/ffmpeg-filters.html#aeval)

```
Filter aeval
Filter audio signal according to a specified expression.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aeval AVOptions:
exprs             <string>     ..F.A..... set the '|'-separated list of channels expressions
channel_layout    <string>     ..F.A..... set channel layout
c                 <string>     ..F.A..... set channel layout


```
 * */
class aeval(
    val exprs : Any? = null,
    val channel_layout : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aeval] を参照してください */
fun String.aeval(exprs : Any? = null, channel_layout : Any? = null, c : Any? = null) : aeval {
    return aeval(exprs, channel_layout, c, "", "").apply { setInputs(this@aeval) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( afade )](https://ffmpeg.org/ffmpeg-filters.html#afade)

```
Filter afade
Fade in/out input audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
afade AVOptions:
type              <int>        ..F.A..... set the fade direction (from 0 to 1) (default in)
in              0            ..F.A..... fade-in
out             1            ..F.A..... fade-out
t                 <int>        ..F.A..... set the fade direction (from 0 to 1) (default in)
in              0            ..F.A..... fade-in
out             1            ..F.A..... fade-out
start_sample      <int64>      ..F.A..... set number of first sample to start fading (from 0 to I64_MAX) (default 0)
ss                <int64>      ..F.A..... set number of first sample to start fading (from 0 to I64_MAX) (default 0)
nb_samples        <int64>      ..F.A..... set number of samples for fade duration (from 1 to I64_MAX) (default 44100)
ns                <int64>      ..F.A..... set number of samples for fade duration (from 1 to I64_MAX) (default 44100)
start_time        <duration>   ..F.A..... set time to start fading (default 0)
st                <duration>   ..F.A..... set time to start fading (default 0)
duration          <duration>   ..F.A..... set fade duration (default 0)
d                 <duration>   ..F.A..... set fade duration (default 0)
curve             <int>        ..F.A..... set fade curve type (from 0 to 17) (default tri)
tri             0            ..F.A..... linear slope
qsin            1            ..F.A..... quarter of sine wave
esin            2            ..F.A..... exponential sine wave
hsin            3            ..F.A..... half of sine wave
log             4            ..F.A..... logarithmic
ipar            5            ..F.A..... inverted parabola
qua             6            ..F.A..... quadratic
cub             7            ..F.A..... cubic
squ             8            ..F.A..... square root
cbr             9            ..F.A..... cubic root
par             10           ..F.A..... parabola
exp             11           ..F.A..... exponential
iqsin           12           ..F.A..... inverted quarter of sine wave
ihsin           13           ..F.A..... inverted half of sine wave
dese            14           ..F.A..... double-exponential seat
desi            15           ..F.A..... double-exponential sigmoid
losi            16           ..F.A..... logistic sigmoid
nofade          17           ..F.A..... no fade; keep audio as-is
c                 <int>        ..F.A..... set fade curve type (from 0 to 17) (default tri)
tri             0            ..F.A..... linear slope
qsin            1            ..F.A..... quarter of sine wave
esin            2            ..F.A..... exponential sine wave
hsin            3            ..F.A..... half of sine wave
log             4            ..F.A..... logarithmic
ipar            5            ..F.A..... inverted parabola
qua             6            ..F.A..... quadratic
cub             7            ..F.A..... cubic
squ             8            ..F.A..... square root
cbr             9            ..F.A..... cubic root
par             10           ..F.A..... parabola
exp             11           ..F.A..... exponential
iqsin           12           ..F.A..... inverted quarter of sine wave
ihsin           13           ..F.A..... inverted half of sine wave
dese            14           ..F.A..... double-exponential seat
desi            15           ..F.A..... double-exponential sigmoid
losi            16           ..F.A..... logistic sigmoid
nofade          17           ..F.A..... no fade; keep audio as-is

This filter has support for timeline through the 'enable' option.

```
 * */
class afade(
    val type : Any? = null,
    val start_sample : Any? = null,
    val nb_samples : Any? = null,
    val start_time : Any? = null,
    val duration : Any? = null,
    val curve : Any? = null,
    val t : Any? = null,
    val ss : Any? = null,
    val ns : Any? = null,
    val st : Any? = null,
    val d : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [afade] を参照してください */
fun String.afade(type : Any? = null, start_sample : Any? = null, nb_samples : Any? = null, start_time : Any? = null, duration : Any? = null, curve : Any? = null, t : Any? = null, ss : Any? = null, ns : Any? = null, st : Any? = null, d : Any? = null, c : Any? = null) : afade {
    return afade(type, start_sample, nb_samples, start_time, duration, curve, t, ss, ns, st, d, c, "", "").apply { setInputs(this@afade) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( afftdn )](https://ffmpeg.org/ffmpeg-filters.html#afftdn)

```
Filter afftdn
Denoise audio samples using FFT.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
afftdn AVOptions:
nr                <float>      ..F.A....T set the noise reduction (from 0.01 to 97) (default 12)
nf                <float>      ..F.A....T set the noise floor (from -80 to -20) (default -50)
nt                <int>        ..F.A..... set the noise type (from 0 to 3) (default w)
w               0            ..F.A..... white noise
v               1            ..F.A..... vinyl noise
s               2            ..F.A..... shellac noise
c               3            ..F.A..... custom noise
bn                <string>     ..F.A..... set the custom bands noise
rf                <float>      ..F.A....T set the residual floor (from -80 to -20) (default -38)
tn                <boolean>    ..F.A....T track noise (default false)
tr                <boolean>    ..F.A....T track residual (default false)
om                <int>        ..F.A....T set output mode (from 0 to 2) (default o)
i               0            ..F.A....T input
o               1            ..F.A....T output
n               2            ..F.A....T noise

This filter has support for timeline through the 'enable' option.

```
 * */
class afftdn(
    val nr : Any? = null,
    val nf : Any? = null,
    val nt : Any? = null,
    val bn : Any? = null,
    val rf : Any? = null,
    val tn : Any? = null,
    val tr : Any? = null,
    val om : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [afftdn] を参照してください */
fun String.afftdn(nr : Any? = null, nf : Any? = null, nt : Any? = null, bn : Any? = null, rf : Any? = null, tn : Any? = null, tr : Any? = null, om : Any? = null) : afftdn {
    return afftdn(nr, nf, nt, bn, rf, tn, tr, om, "", "").apply { setInputs(this@afftdn) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( afftfilt )](https://ffmpeg.org/ffmpeg-filters.html#afftfilt)

```
Filter afftfilt
Apply arbitrary expressions to samples in frequency domain.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
afftfilt AVOptions:
real              <string>     ..F.A..... set channels real expressions (default "re")
imag              <string>     ..F.A..... set channels imaginary expressions (default "im")
win_size          <int>        ..F.A..... set window size (from 16 to 131072) (default 4096)
win_func          <int>        ..F.A..... set window function (from 0 to 19) (default hann)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hann            1            ..F.A..... Hann
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
blackman        3            ..F.A..... Blackman
welch           5            ..F.A..... Welch
flattop         6            ..F.A..... Flat-top
bharris         7            ..F.A..... Blackman-Harris
bnuttall        8            ..F.A..... Blackman-Nuttall
bhann           11           ..F.A..... Bartlett-Hann
sine            9            ..F.A..... Sine
nuttall         10           ..F.A..... Nuttall
lanczos         12           ..F.A..... Lanczos
gauss           13           ..F.A..... Gauss
tukey           14           ..F.A..... Tukey
dolph           15           ..F.A..... Dolph-Chebyshev
cauchy          16           ..F.A..... Cauchy
parzen          17           ..F.A..... Parzen
poisson         18           ..F.A..... Poisson
bohman          19           ..F.A..... Bohman
overlap           <float>      ..F.A..... set window overlap (from 0 to 1) (default 0.75)


```
 * */
class afftfilt(
    val real : Any? = null,
    val imag : Any? = null,
    val win_size : Any? = null,
    val win_func : Any? = null,
    val overlap : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [afftfilt] を参照してください */
fun String.afftfilt(real : Any? = null, imag : Any? = null, win_size : Any? = null, win_func : Any? = null, overlap : Any? = null) : afftfilt {
    return afftfilt(real, imag, win_size, win_func, overlap, "", "").apply { setInputs(this@afftfilt) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( afir )](https://ffmpeg.org/ffmpeg-filters.html#afir)

```
Filter afir
Apply Finite Impulse Response filter with supplied coefficients in additional stream(s).
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
dynamic (depending on the options)
afir AVOptions:
dry               <float>      ..F.A..... set dry gain (from 0 to 10) (default 1)
wet               <float>      ..F.A..... set wet gain (from 0 to 10) (default 1)
length            <float>      ..F.A..... set IR length (from 0 to 1) (default 1)
gtype             <int>        ..F.A..... set IR auto gain type (from -1 to 2) (default peak)
none            -1           ..F.A..... without auto gain
peak            0            ..F.A..... peak gain
dc              1            ..F.A..... DC gain
gn              2            ..F.A..... gain to noise
irgain            <float>      ..F.A..... set IR gain (from 0 to 1) (default 1)
irfmt             <int>        ..F.A..... set IR format (from 0 to 1) (default input)
mono            0            ..F.A..... single channel
input           1            ..F.A..... same as input
maxir             <float>      ..F.A..... set max IR length (from 0.1 to 60) (default 30)
response          <boolean>    ..FV...... show IR frequency response (default false)
channel           <int>        ..FV...... set IR channel to display frequency response (from 0 to 1024) (default 0)
size              <image_size> ..FV...... set video size (default "hd720")
rate              <video_rate> ..FV...... set video rate (default "25")
minp              <int>        ..F.A..... set min partition size (from 1 to 32768) (default 8192)
maxp              <int>        ..F.A..... set max partition size (from 8 to 32768) (default 8192)
nbirs             <int>        ..F.A..... set number of input IRs (from 1 to 32) (default 1)
ir                <int>        ..F.A....T select IR (from 0 to 31) (default 0)


```
 * */
class afir(
    val dry : Any? = null,
    val wet : Any? = null,
    val length : Any? = null,
    val gtype : Any? = null,
    val irgain : Any? = null,
    val irfmt : Any? = null,
    val maxir : Any? = null,
    val response : Any? = null,
    val channel : Any? = null,
    val size : Any? = null,
    val rate : Any? = null,
    val minp : Any? = null,
    val maxp : Any? = null,
    val nbirs : Any? = null,
    val ir : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [afir] を参照してください */
fun String.afir(dry : Any? = null, wet : Any? = null, length : Any? = null, gtype : Any? = null, irgain : Any? = null, irfmt : Any? = null, maxir : Any? = null, response : Any? = null, channel : Any? = null, size : Any? = null, rate : Any? = null, minp : Any? = null, maxp : Any? = null, nbirs : Any? = null, ir : Any? = null) : afir {
    return afir(dry, wet, length, gtype, irgain, irfmt, maxir, response, channel, size, rate, minp, maxp, nbirs, ir, "", "").apply { setInputs(this@afir) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aformat )](https://ffmpeg.org/ffmpeg-filters.html#aformat)

```
Filter aformat
Convert the input audio to one of the specified formats.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aformat AVOptions:
sample_fmts       <string>     ..F.A..... A '|'-separated list of sample formats.
f                 <string>     ..F.A..... A '|'-separated list of sample formats.
sample_rates      <string>     ..F.A..... A '|'-separated list of sample rates.
r                 <string>     ..F.A..... A '|'-separated list of sample rates.
channel_layouts   <string>     ..F.A..... A '|'-separated list of channel layouts.
cl                <string>     ..F.A..... A '|'-separated list of channel layouts.


```
 * */
class aformat(
    val sample_fmts : Any? = null,
    val sample_rates : Any? = null,
    val channel_layouts : Any? = null,
    val f : Any? = null,
    val r : Any? = null,
    val cl : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aformat] を参照してください */
fun String.aformat(sample_fmts : Any? = null, sample_rates : Any? = null, channel_layouts : Any? = null, f : Any? = null, r : Any? = null, cl : Any? = null) : aformat {
    return aformat(sample_fmts, sample_rates, channel_layouts, f, r, cl, "", "").apply { setInputs(this@aformat) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( agate )](https://ffmpeg.org/ffmpeg-filters.html#agate)

```
Filter agate
Audio gate.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
agate AVOptions:
level_in          <double>     ..F.A..... set input level (from 0.015625 to 64) (default 1)
mode              <int>        ..F.A..... set mode (from 0 to 1) (default downward)
downward        0            ..F.A.....
upward          1            ..F.A.....
range             <double>     ..F.A..... set max gain reduction (from 0 to 1) (default 0.06125)
threshold         <double>     ..F.A..... set threshold (from 0 to 1) (default 0.125)
ratio             <double>     ..F.A..... set ratio (from 1 to 9000) (default 2)
attack            <double>     ..F.A..... set attack (from 0.01 to 9000) (default 20)
release           <double>     ..F.A..... set release (from 0.01 to 9000) (default 250)
makeup            <double>     ..F.A..... set makeup gain (from 1 to 64) (default 1)
knee              <double>     ..F.A..... set knee (from 1 to 8) (default 2.82843)
detection         <int>        ..F.A..... set detection (from 0 to 1) (default rms)
peak            0            ..F.A.....
rms             1            ..F.A.....
link              <int>        ..F.A..... set link (from 0 to 1) (default average)
average         0            ..F.A.....
maximum         1            ..F.A.....
level_sc          <double>     ..F.A..... set sidechain gain (from 0.015625 to 64) (default 1)


```
 * */
class agate(
    val level_in : Any? = null,
    val mode : Any? = null,
    val range : Any? = null,
    val threshold : Any? = null,
    val ratio : Any? = null,
    val attack : Any? = null,
    val release : Any? = null,
    val makeup : Any? = null,
    val knee : Any? = null,
    val detection : Any? = null,
    val link : Any? = null,
    val level_sc : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [agate] を参照してください */
fun String.agate(level_in : Any? = null, mode : Any? = null, range : Any? = null, threshold : Any? = null, ratio : Any? = null, attack : Any? = null, release : Any? = null, makeup : Any? = null, knee : Any? = null, detection : Any? = null, link : Any? = null, level_sc : Any? = null) : agate {
    return agate(level_in, mode, range, threshold, ratio, attack, release, makeup, knee, detection, link, level_sc, "", "").apply { setInputs(this@agate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aiir )](https://ffmpeg.org/ffmpeg-filters.html#aiir)

```
Filter aiir
Apply Infinite Impulse Response filter with supplied coefficients.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
aiir AVOptions:
z                 <string>     ..F.A..... set B/numerator/zeros coefficients (default "1+0i 1-0i")
p                 <string>     ..F.A..... set A/denominator/poles coefficients (default "1+0i 1-0i")
k                 <string>     ..F.A..... set channels gains (default "1|1")
dry               <double>     ..F.A..... set dry gain (from 0 to 1) (default 1)
wet               <double>     ..F.A..... set wet gain (from 0 to 1) (default 1)
f                 <int>        ..F.A..... set coefficients format (from 0 to 3) (default zp)
tf              0            ..F.A..... transfer function
zp              1            ..F.A..... Z-plane zeros/poles
pr              2            ..F.A..... Z-plane zeros/poles (polar radians)
pd              3            ..F.A..... Z-plane zeros/poles (polar degrees)
r                 <int>        ..F.A..... set kind of processing (from 0 to 1) (default s)
d               0            ..F.A..... direct
s               1            ..F.A..... serial cascading
e                 <int>        ..F.A..... set precision (from 0 to 3) (default dbl)
dbl             0            ..F.A..... double-precision floating-point
flt             1            ..F.A..... single-precision floating-point
i32             2            ..F.A..... 32-bit integers
i16             3            ..F.A..... 16-bit integers
mix               <double>     ..F.A..... set mix (from 0 to 1) (default 1)
response          <boolean>    ..FV...... show IR frequency response (default false)
channel           <int>        ..FV...... set IR channel to display frequency response (from 0 to 1024) (default 0)
size              <image_size> ..FV...... set video size (default "hd720")
rate              <video_rate> ..FV...... set video rate (default "25")


```
 * */
class aiir(
    val z : Any? = null,
    val p : Any? = null,
    val k : Any? = null,
    val dry : Any? = null,
    val wet : Any? = null,
    val f : Any? = null,
    val r : Any? = null,
    val e : Any? = null,
    val mix : Any? = null,
    val response : Any? = null,
    val channel : Any? = null,
    val size : Any? = null,
    val rate : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aiir] を参照してください */
fun String.aiir(z : Any? = null, p : Any? = null, k : Any? = null, dry : Any? = null, wet : Any? = null, f : Any? = null, r : Any? = null, e : Any? = null, mix : Any? = null, response : Any? = null, channel : Any? = null, size : Any? = null, rate : Any? = null) : aiir {
    return aiir(z, p, k, dry, wet, f, r, e, mix, response, channel, size, rate, "", "").apply { setInputs(this@aiir) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aintegral )](https://ffmpeg.org/ffmpeg-filters.html#aintegral)

```
Filter aintegral
Compute integral of input audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class aintegral(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aintegral] を参照してください */
fun String.aintegral() : aintegral {
    return aintegral("", "").apply { setInputs(this@aintegral) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ainterleave )](https://ffmpeg.org/ffmpeg-filters.html#ainterleave)

```
Filter ainterleave
Temporally interleave audio inputs.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (audio)
ainterleave AVOptions:
nb_inputs         <int>        ..F.A..... set number of inputs (from 1 to INT_MAX) (default 2)
n                 <int>        ..F.A..... set number of inputs (from 1 to INT_MAX) (default 2)
duration          <int>        ..F.A..... how to determine the end-of-stream (from 0 to 2) (default longest)
longest         0            ..F.A..... Duration of longest input
shortest        1            ..F.A..... Duration of shortest input
first           2            ..F.A..... Duration of first input


```
 * */
class ainterleave(
    val nb_inputs : Any? = null,
    val duration : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ainterleave] を参照してください */
fun String.ainterleave(nb_inputs : Any? = null, duration : Any? = null, n : Any? = null) : ainterleave {
    return ainterleave(nb_inputs, duration, n, "", "").apply { setInputs(this@ainterleave) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( alimiter )](https://ffmpeg.org/ffmpeg-filters.html#alimiter)

```
Filter alimiter
Audio lookahead limiter.
Inputs:
#0: main (audio)
Outputs:
#0: default (audio)
alimiter AVOptions:
level_in          <double>     ..F.A..... set input level (from 0.015625 to 64) (default 1)
level_out         <double>     ..F.A..... set output level (from 0.015625 to 64) (default 1)
limit             <double>     ..F.A..... set limit (from 0.0625 to 1) (default 1)
attack            <double>     ..F.A..... set attack (from 0.1 to 80) (default 5)
release           <double>     ..F.A..... set release (from 1 to 8000) (default 50)
asc               <boolean>    ..F.A..... enable asc (default false)
asc_level         <double>     ..F.A..... set asc level (from 0 to 1) (default 0.5)
level             <boolean>    ..F.A..... auto level (default true)


```
 * */
class alimiter(
    val level_in : Any? = null,
    val level_out : Any? = null,
    val limit : Any? = null,
    val attack : Any? = null,
    val release : Any? = null,
    val asc : Any? = null,
    val asc_level : Any? = null,
    val level : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [alimiter] を参照してください */
fun String.alimiter(level_in : Any? = null, level_out : Any? = null, limit : Any? = null, attack : Any? = null, release : Any? = null, asc : Any? = null, asc_level : Any? = null, level : Any? = null) : alimiter {
    return alimiter(level_in, level_out, limit, attack, release, asc, asc_level, level, "", "").apply { setInputs(this@alimiter) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( allpass )](https://ffmpeg.org/ffmpeg-filters.html#allpass)

```
Filter allpass
Apply a two-pole all-pass filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
allpass AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default h)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default h)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set filter-width (from 0 to 99999) (default 707.1)
w                 <double>     ..F.A....T set filter-width (from 0 to 99999) (default 707.1)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class allpass(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [allpass] を参照してください */
fun String.allpass(frequency : Any? = null, width_type : Any? = null, width : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : allpass {
    return allpass(frequency, width_type, width, mix, channels, normalize, f, t, w, m, c, n, "", "").apply { setInputs(this@allpass) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aloop )](https://ffmpeg.org/ffmpeg-filters.html#aloop)

```
Filter aloop
Loop audio samples.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aloop AVOptions:
loop              <int>        ..F.A..... number of loops (from -1 to INT_MAX) (default 0)
size              <int64>      ..F.A..... max number of samples to loop (from 0 to INT_MAX) (default 0)
start             <int64>      ..F.A..... set the loop start sample (from 0 to I64_MAX) (default 0)


```
 * */
class aloop(
    val loop : Any? = null,
    val size : Any? = null,
    val start : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aloop] を参照してください */
fun String.aloop(loop : Any? = null, size : Any? = null, start : Any? = null) : aloop {
    return aloop(loop, size, start, "", "").apply { setInputs(this@aloop) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( amerge )](https://ffmpeg.org/ffmpeg-filters.html#amerge)

```
Filter amerge
Merge two or more audio streams into a single multi-channel stream.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (audio)
amerge AVOptions:
inputs            <int>        ..F.A..... specify the number of inputs (from 1 to 64) (default 2)


```
 * */
class amerge(
    val inputs : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [amerge] を参照してください */
fun String.amerge(inputs : Any? = null) : amerge {
    return amerge(inputs, "", "").apply { setInputs(this@amerge) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ametadata )](https://ffmpeg.org/ffmpeg-filters.html#ametadata)

```
Filter ametadata
Manipulate audio frame metadata.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
ametadata AVOptions:
mode              <int>        ..F.A..... set a mode of operation (from 0 to 4) (default select)
select          0            ..F.A..... select frame
add             1            ..F.A..... add new metadata
modify          2            ..F.A..... modify metadata
delete          3            ..F.A..... delete metadata
print           4            ..F.A..... print metadata
key               <string>     ..F.A..... set metadata key
value             <string>     ..F.A..... set metadata value
function          <int>        ..F.A..... function for comparing values (from 0 to 6) (default same_str)
same_str        0            ..F.A.....
starts_with     1            ..F.A.....
less            2            ..F.A.....
equal           3            ..F.A.....
greater         4            ..F.A.....
expr            5            ..F.A.....
ends_with       6            ..F.A.....
expr              <string>     ..F.A..... set expression for expr function
file              <string>     ..F.A..... set file where to print metadata information
direct            <boolean>    ..F.A..... reduce buffering when printing to user-set file or pipe (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class ametadata(
    val mode : Any? = null,
    val key : Any? = null,
    val value : Any? = null,
    val function : Any? = null,
    val expr : Any? = null,
    val file : Any? = null,
    val direct : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ametadata] を参照してください */
fun String.ametadata(mode : Any? = null, key : Any? = null, value : Any? = null, function : Any? = null, expr : Any? = null, file : Any? = null, direct : Any? = null) : ametadata {
    return ametadata(mode, key, value, function, expr, file, direct, "", "").apply { setInputs(this@ametadata) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( amix )](https://ffmpeg.org/ffmpeg-filters.html#amix)

```
Filter amix
Audio mixing.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (audio)
amix AVOptions:
inputs            <int>        ..F.A..... Number of inputs. (from 1 to 32767) (default 2)
duration          <int>        ..F.A..... How to determine the end-of-stream. (from 0 to 2) (default longest)
longest         0            ..F.A..... Duration of longest input.
shortest        1            ..F.A..... Duration of shortest input.
first           2            ..F.A..... Duration of first input.
dropout_transition <float>      ..F.A..... Transition time, in seconds, for volume renormalization when an input stream ends. (from 0 to INT_MAX) (default 2)
weights           <string>     ..F.A....T Set weight for each input. (default "1 1")


```
 * */
class amix(
    val inputs : Any? = null,
    val duration : Any? = null,
    val dropout_transition : Any? = null,
    val weights : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [amix] を参照してください */
fun String.amix(inputs : Any? = null, duration : Any? = null, dropout_transition : Any? = null, weights : Any? = null) : amix {
    return amix(inputs, duration, dropout_transition, weights, "", "").apply { setInputs(this@amix) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( amultiply )](https://ffmpeg.org/ffmpeg-filters.html#amultiply)

```
Filter amultiply
Multiply two audio streams.
Inputs:
#0: multiply0 (audio)
#1: multiply1 (audio)
Outputs:
#0: default (audio)

```
 * */
class amultiply(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [amultiply] を参照してください */
fun String.amultiply() : amultiply {
    return amultiply("", "").apply { setInputs(this@amultiply) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anequalizer )](https://ffmpeg.org/ffmpeg-filters.html#anequalizer)

```
Filter anequalizer
Apply high-order audio parametric multi band equalizer.
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
anequalizer AVOptions:
params            <string>     ..F.A..... (default "")
curves            <boolean>    ..FV...... draw frequency response curves (default false)
size              <image_size> ..FV...... set video size (default "hd720")
mgain             <double>     ..FV...... set max gain (from -900 to 900) (default 60)
fscale            <int>        ..FV...... set frequency scale (from 0 to 1) (default log)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
colors            <string>     ..FV...... set channels curves colors (default "red|green|blue|yellow|orange|lime|pink|magenta|brown")


```
 * */
class anequalizer(
    val params : Any? = null,
    val curves : Any? = null,
    val size : Any? = null,
    val mgain : Any? = null,
    val fscale : Any? = null,
    val colors : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anequalizer] を参照してください */
fun String.anequalizer(params : Any? = null, curves : Any? = null, size : Any? = null, mgain : Any? = null, fscale : Any? = null, colors : Any? = null) : anequalizer {
    return anequalizer(params, curves, size, mgain, fscale, colors, "", "").apply { setInputs(this@anequalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anlmdn )](https://ffmpeg.org/ffmpeg-filters.html#anlmdn)

```
Filter anlmdn
Reduce broadband noise from stream using Non-Local Means.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
anlmdn AVOptions:
s                 <float>      ..F.A....T set denoising strength (from 1e-05 to 10) (default 1e-05)
p                 <duration>   ..F.A..... set patch duration (default 0.002)
r                 <duration>   ..F.A..... set research duration (default 0.006)
o                 <int>        ..F.A....T set output mode (from 0 to 2) (default o)
i               0            ..F.A....T input
o               1            ..F.A....T output
n               2            ..F.A....T noise
m                 <float>      ..F.A..... set smooth factor (from 1 to 15) (default 11)

This filter has support for timeline through the 'enable' option.

```
 * */
class anlmdn(
    val s : Any? = null,
    val p : Any? = null,
    val r : Any? = null,
    val o : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anlmdn] を参照してください */
fun String.anlmdn(s : Any? = null, p : Any? = null, r : Any? = null, o : Any? = null, m : Any? = null) : anlmdn {
    return anlmdn(s, p, r, o, m, "", "").apply { setInputs(this@anlmdn) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anlms )](https://ffmpeg.org/ffmpeg-filters.html#anlms)

```
Filter anlms
Apply Normalized Least-Mean-Squares algorithm to first audio stream.
slice threading supported
Inputs:
#0: input (audio)
#1: desired (audio)
Outputs:
#0: default (audio)
anlms AVOptions:
order             <int>        ..F.A..... set the filter order (from 1 to 32767) (default 256)
mu                <float>      ..F.A....T set the filter mu (from 0 to 2) (default 0.75)
eps               <float>      ..F.A....T set the filter eps (from 0 to 1) (default 1)
leakage           <float>      ..F.A....T set the filter leakage (from 0 to 1) (default 0)
out_mode          <int>        ..F.A....T set output mode (from 0 to 3) (default o)
i               0            ..F.A....T input
d               1            ..F.A....T desired
o               2            ..F.A....T output
n               3            ..F.A....T noise


```
 * */
class anlms(
    val order : Any? = null,
    val mu : Any? = null,
    val eps : Any? = null,
    val leakage : Any? = null,
    val out_mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anlms] を参照してください */
fun String.anlms(order : Any? = null, mu : Any? = null, eps : Any? = null, leakage : Any? = null, out_mode : Any? = null) : anlms {
    return anlms(order, mu, eps, leakage, out_mode, "", "").apply { setInputs(this@anlms) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anull )](https://ffmpeg.org/ffmpeg-filters.html#anull)

```
Filter anull
Pass the source unchanged to the output.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class anull(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anull] を参照してください */
fun String.anull() : anull {
    return anull("", "").apply { setInputs(this@anull) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( apad )](https://ffmpeg.org/ffmpeg-filters.html#apad)

```
Filter apad
Pad audio with silence.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
apad AVOptions:
packet_size       <int>        ..F.A..... set silence packet size (from 0 to INT_MAX) (default 4096)
pad_len           <int64>      ..F.A..... set number of samples of silence to add (from -1 to I64_MAX) (default -1)
whole_len         <int64>      ..F.A..... set minimum target number of samples in the audio stream (from -1 to I64_MAX) (default -1)
pad_dur           <duration>   ..F.A..... set duration of silence to add (default 0)
whole_dur         <duration>   ..F.A..... set minimum target duration in the audio stream (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class apad(
    val packet_size : Any? = null,
    val pad_len : Any? = null,
    val whole_len : Any? = null,
    val pad_dur : Any? = null,
    val whole_dur : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [apad] を参照してください */
fun String.apad(packet_size : Any? = null, pad_len : Any? = null, whole_len : Any? = null, pad_dur : Any? = null, whole_dur : Any? = null) : apad {
    return apad(packet_size, pad_len, whole_len, pad_dur, whole_dur, "", "").apply { setInputs(this@apad) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aperms )](https://ffmpeg.org/ffmpeg-filters.html#aperms)

```
Filter aperms
Set permissions for the output audio frame.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aperms AVOptions:
mode              <int>        ..FVA..... select permissions mode (from 0 to 4) (default none)
none            0            ..FVA..... do nothing
ro              1            ..FVA..... set all output frames read-only
rw              2            ..FVA..... set all output frames writable
toggle          3            ..FVA..... switch permissions
random          4            ..FVA..... set permissions randomly
seed              <int64>      ..FVA..... set the seed for the random mode (from -1 to UINT32_MAX) (default -1)


```
 * */
class aperms(
    val mode : Any? = null,
    val seed : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aperms] を参照してください */
fun String.aperms(mode : Any? = null, seed : Any? = null) : aperms {
    return aperms(mode, seed, "", "").apply { setInputs(this@aperms) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aphaser )](https://ffmpeg.org/ffmpeg-filters.html#aphaser)

```
Filter aphaser
Add a phasing effect to the audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aphaser AVOptions:
in_gain           <double>     ..F.A..... set input gain (from 0 to 1) (default 0.4)
out_gain          <double>     ..F.A..... set output gain (from 0 to 1e+09) (default 0.74)
delay             <double>     ..F.A..... set delay in milliseconds (from 0 to 5) (default 3)
decay             <double>     ..F.A..... set decay (from 0 to 0.99) (default 0.4)
speed             <double>     ..F.A..... set modulation speed (from 0.1 to 2) (default 0.5)
type              <int>        ..F.A..... set modulation type (from 0 to 1) (default triangular)
triangular      1            ..F.A.....
t               1            ..F.A.....
sinusoidal      0            ..F.A.....
s               0            ..F.A.....


```
 * */
class aphaser(
    val in_gain : Any? = null,
    val out_gain : Any? = null,
    val delay : Any? = null,
    val decay : Any? = null,
    val speed : Any? = null,
    val type : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aphaser] を参照してください */
fun String.aphaser(in_gain : Any? = null, out_gain : Any? = null, delay : Any? = null, decay : Any? = null, speed : Any? = null, type : Any? = null) : aphaser {
    return aphaser(in_gain, out_gain, delay, decay, speed, type, "", "").apply { setInputs(this@aphaser) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( apulsator )](https://ffmpeg.org/ffmpeg-filters.html#apulsator)

```
Filter apulsator
Audio pulsator.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
apulsator AVOptions:
level_in          <double>     ..F.A..... set input gain (from 0.015625 to 64) (default 1)
level_out         <double>     ..F.A..... set output gain (from 0.015625 to 64) (default 1)
mode              <int>        ..F.A..... set mode (from 0 to 4) (default sine)
sine            0            ..F.A.....
triangle        1            ..F.A.....
square          2            ..F.A.....
sawup           3            ..F.A.....
sawdown         4            ..F.A.....
amount            <double>     ..F.A..... set modulation (from 0 to 1) (default 1)
offset_l          <double>     ..F.A..... set offset L (from 0 to 1) (default 0)
offset_r          <double>     ..F.A..... set offset R (from 0 to 1) (default 0.5)
width             <double>     ..F.A..... set pulse width (from 0 to 2) (default 1)
timing            <int>        ..F.A..... set timing (from 0 to 2) (default hz)
bpm             0            ..F.A.....
ms              1            ..F.A.....
hz              2            ..F.A.....
bpm               <double>     ..F.A..... set BPM (from 30 to 300) (default 120)
ms                <int>        ..F.A..... set ms (from 10 to 2000) (default 500)
hz                <double>     ..F.A..... set frequency (from 0.01 to 100) (default 2)


```
 * */
class apulsator(
    val level_in : Any? = null,
    val level_out : Any? = null,
    val mode : Any? = null,
    val amount : Any? = null,
    val offset_l : Any? = null,
    val offset_r : Any? = null,
    val width : Any? = null,
    val timing : Any? = null,
    val bpm : Any? = null,
    val ms : Any? = null,
    val hz : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [apulsator] を参照してください */
fun String.apulsator(level_in : Any? = null, level_out : Any? = null, mode : Any? = null, amount : Any? = null, offset_l : Any? = null, offset_r : Any? = null, width : Any? = null, timing : Any? = null, bpm : Any? = null, ms : Any? = null, hz : Any? = null) : apulsator {
    return apulsator(level_in, level_out, mode, amount, offset_l, offset_r, width, timing, bpm, ms, hz, "", "").apply { setInputs(this@apulsator) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( arealtime )](https://ffmpeg.org/ffmpeg-filters.html#arealtime)

```
Filter arealtime
Slow down filtering to match realtime.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
arealtime AVOptions:
limit             <duration>   ..FVA..... sleep time limit (default 2)
speed             <double>     ..FVA..... speed factor (from DBL_MIN to DBL_MAX) (default 1)


```
 * */
class arealtime(
    val limit : Any? = null,
    val speed : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [arealtime] を参照してください */
fun String.arealtime(limit : Any? = null, speed : Any? = null) : arealtime {
    return arealtime(limit, speed, "", "").apply { setInputs(this@arealtime) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aresample )](https://ffmpeg.org/ffmpeg-filters.html#aresample)

```
Filter aresample
Resample audio data.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
aresample AVOptions:
sample_rate       <int>        ..F.A..... (from 0 to INT_MAX) (default 0)

SWResampler AVOptions:
-ich               <int>        ....A..... set input channel count (from 0 to 64) (default 0)
-in_channel_count  <int>        ....A..... set input channel count (from 0 to 64) (default 0)
-och               <int>        ....A..... set output channel count (from 0 to 64) (default 0)
-out_channel_count <int>        ....A..... set output channel count (from 0 to 64) (default 0)
-uch               <int>        ....A..... set used channel count (from 0 to 64) (default 0)
-used_channel_count <int>        ....A..... set used channel count (from 0 to 64) (default 0)
-isr               <int>        ....A..... set input sample rate (from 0 to INT_MAX) (default 0)
-in_sample_rate    <int>        ....A..... set input sample rate (from 0 to INT_MAX) (default 0)
-osr               <int>        ....A..... set output sample rate (from 0 to INT_MAX) (default 0)
-out_sample_rate   <int>        ....A..... set output sample rate (from 0 to INT_MAX) (default 0)
-isf               <sample_fmt> ....A..... set input sample format (default none)
-in_sample_fmt     <sample_fmt> ....A..... set input sample format (default none)
-osf               <sample_fmt> ....A..... set output sample format (default none)
-out_sample_fmt    <sample_fmt> ....A..... set output sample format (default none)
-tsf               <sample_fmt> ....A..... set internal sample format (default none)
-internal_sample_fmt <sample_fmt> ....A..... set internal sample format (default none)
-icl               <channel_layout> ....A..... set input channel layout (default 0x0)
-in_channel_layout <channel_layout> ....A..... set input channel layout (default 0x0)
-ocl               <channel_layout> ....A..... set output channel layout (default 0x0)
-out_channel_layout <channel_layout> ....A..... set output channel layout (default 0x0)
-clev              <float>      ....A..... set center mix level (from -32 to 32) (default 0.707107)
-center_mix_level  <float>      ....A..... set center mix level (from -32 to 32) (default 0.707107)
-slev              <float>      ....A..... set surround mix level (from -32 to 32) (default 0.707107)
-surround_mix_level <float>      ....A..... set surround mix Level (from -32 to 32) (default 0.707107)
-lfe_mix_level     <float>      ....A..... set LFE mix level (from -32 to 32) (default 0)
-rmvol             <float>      ....A..... set rematrix volume (from -1000 to 1000) (default 1)
-rematrix_volume   <float>      ....A..... set rematrix volume (from -1000 to 1000) (default 1)
-rematrix_maxval   <float>      ....A..... set rematrix maxval (from 0 to 1000) (default 0)
-flags             <flags>      ....A..... set flags (default 0)
res                          ....A..... force resampling
-swr_flags         <flags>      ....A..... set flags (default 0)
res                          ....A..... force resampling
-dither_scale      <float>      ....A..... set dither scale (from 0 to INT_MAX) (default 1)
-dither_method     <int>        ....A..... set dither method (from 0 to 71) (default 0)
rectangular     1            ....A..... select rectangular dither
triangular      2            ....A..... select triangular dither
triangular_hp   3            ....A..... select triangular dither with high pass
lipshitz        65           ....A..... select Lipshitz noise shaping dither
shibata         69           ....A..... select Shibata noise shaping dither
low_shibata     70           ....A..... select low Shibata noise shaping dither
high_shibata    71           ....A..... select high Shibata noise shaping dither
f_weighted      66           ....A..... select f-weighted noise shaping dither
modified_e_weighted 67           ....A..... select modified-e-weighted noise shaping dither
improved_e_weighted 68           ....A..... select improved-e-weighted noise shaping dither
-filter_size       <int>        ....A..... set swr resampling filter size (from 0 to INT_MAX) (default 32)
-phase_shift       <int>        ....A..... set swr resampling phase shift (from 0 to 24) (default 10)
-linear_interp     <boolean>    ....A..... enable linear interpolation (default true)
-exact_rational    <boolean>    ....A..... enable exact rational (default true)
-cutoff            <double>     ....A..... set cutoff frequency ratio (from 0 to 1) (default 0)
-resample_cutoff   <double>     ....A..... set cutoff frequency ratio (from 0 to 1) (default 0)
-resampler         <int>        ....A..... set resampling Engine (from 0 to 1) (default swr)
swr             0            ....A..... select SW Resampler
soxr            1            ....A..... select SoX Resampler
-precision         <double>     ....A..... set soxr resampling precision (in bits) (from 15 to 33) (default 20)
-cheby             <boolean>    ....A..... enable soxr Chebyshev passband & higher-precision irrational ratio approximation (default false)
-min_comp          <float>      ....A..... set minimum difference between timestamps and audio data (in seconds) below which no timestamp compensation of either kind is applied (from 0 to FLT_MAX) (default FLT_MAX)
-min_hard_comp     <float>      ....A..... set minimum difference between timestamps and audio data (in seconds) to trigger padding/trimming the data. (from 0 to INT_MAX) (default 0.1)
-comp_duration     <float>      ....A..... set duration (in seconds) over which data is stretched/squeezed to make it match the timestamps. (from 0 to INT_MAX) (default 1)
-max_soft_comp     <float>      ....A..... set maximum factor by which data is stretched/squeezed to make it match the timestamps. (from INT_MIN to INT_MAX) (default 0)
-async             <float>      ....A..... simplified 1 parameter audio timestamp matching, 0(disabled), 1(filling and trimming), >1(maximum stretch/squeeze in samples per second) (from INT_MIN to INT_MAX) (default 0)
-first_pts         <int64>      ....A..... Assume the first pts should be this value (in samples). (from I64_MIN to I64_MAX) (default I64_MIN)
-matrix_encoding   <int>        ....A..... set matrixed stereo encoding (from 0 to 6) (default none)
none            0            ....A..... select none
dolby           1            ....A..... select Dolby
dplii           2            ....A..... select Dolby Pro Logic II
-filter_type       <int>        ....A..... select swr filter type (from 0 to 2) (default kaiser)
cubic           0            ....A..... select cubic
blackman_nuttall 1            ....A..... select Blackman Nuttall windowed sinc
kaiser          2            ....A..... select Kaiser windowed sinc
-kaiser_beta       <double>     ....A..... set swr Kaiser window beta (from 2 to 16) (default 9)
-output_sample_bits <int>        ....A..... set swr number of output sample bits (from 0 to 64) (default 0)


```
 * */
class aresample(
    val sample_rate : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aresample] を参照してください */
fun String.aresample(sample_rate : Any? = null) : aresample {
    return aresample(sample_rate, "", "").apply { setInputs(this@aresample) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( areverse )](https://ffmpeg.org/ffmpeg-filters.html#areverse)

```
Filter areverse
Reverse an audio clip.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class areverse(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [areverse] を参照してください */
fun String.areverse() : areverse {
    return areverse("", "").apply { setInputs(this@areverse) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( arnndn )](https://ffmpeg.org/ffmpeg-filters.html#arnndn)

```
Filter arnndn
Reduce noise from speech using Recurrent Neural Networks.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
arnndn AVOptions:
model             <string>     ..F.A..... set model name
m                 <string>     ..F.A..... set model name


```
 * */
class arnndn(
    val model : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [arnndn] を参照してください */
fun String.arnndn(model : Any? = null, m : Any? = null) : arnndn {
    return arnndn(model, m, "", "").apply { setInputs(this@arnndn) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aselect )](https://ffmpeg.org/ffmpeg-filters.html#aselect)

```
Filter aselect
Select audio frames to pass in output.
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
aselect AVOptions:
expr              <string>     ..F.A..... set an expression to use for selecting frames (default "1")
e                 <string>     ..F.A..... set an expression to use for selecting frames (default "1")
outputs           <int>        ..F.A..... set the number of outputs (from 1 to INT_MAX) (default 1)
n                 <int>        ..F.A..... set the number of outputs (from 1 to INT_MAX) (default 1)


```
 * */
class aselect(
    val expr : Any? = null,
    val outputs : Any? = null,
    val e : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aselect] を参照してください */
fun String.aselect(expr : Any? = null, outputs : Any? = null, e : Any? = null, n : Any? = null) : aselect {
    return aselect(expr, outputs, e, n, "", "").apply { setInputs(this@aselect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asendcmd )](https://ffmpeg.org/ffmpeg-filters.html#asendcmd)

```
Filter asendcmd
Send commands to filters.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asendcmd AVOptions:
commands          <string>     ..FVA..... set commands
c                 <string>     ..FVA..... set commands
filename          <string>     ..FVA..... set commands file
f                 <string>     ..FVA..... set commands file


```
 * */
class asendcmd(
    val commands : Any? = null,
    val filename : Any? = null,
    val c : Any? = null,
    val f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asendcmd] を参照してください */
fun String.asendcmd(commands : Any? = null, filename : Any? = null, c : Any? = null, f : Any? = null) : asendcmd {
    return asendcmd(commands, filename, c, f, "", "").apply { setInputs(this@asendcmd) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asetnsamples )](https://ffmpeg.org/ffmpeg-filters.html#asetnsamples)

```
Filter asetnsamples
Set the number of samples for each output audio frames.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asetnsamples AVOptions:
nb_out_samples    <int>        ..F.A..... set the number of per-frame output samples (from 1 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of per-frame output samples (from 1 to INT_MAX) (default 1024)
pad               <boolean>    ..F.A..... pad last frame with zeros (default true)
p                 <boolean>    ..F.A..... pad last frame with zeros (default true)


```
 * */
class asetnsamples(
    val nb_out_samples : Any? = null,
    val pad : Any? = null,
    val n : Any? = null,
    val p : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asetnsamples] を参照してください */
fun String.asetnsamples(nb_out_samples : Any? = null, pad : Any? = null, n : Any? = null, p : Any? = null) : asetnsamples {
    return asetnsamples(nb_out_samples, pad, n, p, "", "").apply { setInputs(this@asetnsamples) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asetpts )](https://ffmpeg.org/ffmpeg-filters.html#asetpts)

```
Filter asetpts
Set PTS for the output audio frame.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asetpts AVOptions:
expr              <string>     ..FVA..... Expression determining the frame timestamp (default "PTS")


```
 * */
class asetpts(
    val expr : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asetpts] を参照してください */
fun String.asetpts(expr : Any? = null) : asetpts {
    return asetpts(expr, "", "").apply { setInputs(this@asetpts) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asetrate )](https://ffmpeg.org/ffmpeg-filters.html#asetrate)

```
Filter asetrate
Change the sample rate without altering the data.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asetrate AVOptions:
sample_rate       <int>        ..F.A..... set the sample rate (from 1 to INT_MAX) (default 44100)
r                 <int>        ..F.A..... set the sample rate (from 1 to INT_MAX) (default 44100)


```
 * */
class asetrate(
    val sample_rate : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asetrate] を参照してください */
fun String.asetrate(sample_rate : Any? = null, r : Any? = null) : asetrate {
    return asetrate(sample_rate, r, "", "").apply { setInputs(this@asetrate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asettb )](https://ffmpeg.org/ffmpeg-filters.html#asettb)

```
Filter asettb
Set timebase for the audio output link.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asettb AVOptions:
expr              <string>     ..F.A..... set expression determining the output timebase (default "intb")
tb                <string>     ..F.A..... set expression determining the output timebase (default "intb")


```
 * */
class asettb(
    val expr : Any? = null,
    val tb : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asettb] を参照してください */
fun String.asettb(expr : Any? = null, tb : Any? = null) : asettb {
    return asettb(expr, tb, "", "").apply { setInputs(this@asettb) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ashowinfo )](https://ffmpeg.org/ffmpeg-filters.html#ashowinfo)

```
Filter ashowinfo
Show textual information for each audio frame.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class ashowinfo(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ashowinfo] を参照してください */
fun String.ashowinfo() : ashowinfo {
    return ashowinfo("", "").apply { setInputs(this@ashowinfo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asidedata )](https://ffmpeg.org/ffmpeg-filters.html#asidedata)

```
Filter asidedata
Manipulate audio frame side data.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asidedata AVOptions:
mode              <int>        ..F.A..... set a mode of operation (from 0 to 1) (default select)
select          0            ..F.A..... select frame
delete          1            ..F.A..... delete side data
type              <int>        ..F.A..... set side data type (from -1 to INT_MAX) (default -1)
PANSCAN         0            ..F.A.....
A53_CC          1            ..F.A.....
STEREO3D        2            ..F.A.....
MATRIXENCODING  3            ..F.A.....
DOWNMIX_INFO    4            ..F.A.....
REPLAYGAIN      5            ..F.A.....
DISPLAYMATRIX   6            ..F.A.....
AFD             7            ..F.A.....
MOTION_VECTORS  8            ..F.A.....
SKIP_SAMPLES    9            ..F.A.....
AUDIO_SERVICE_TYPE 10           ..F.A.....
MASTERING_DISPLAY_METADATA 11           ..F.A.....
GOP_TIMECODE    12           ..F.A.....
SPHERICAL       13           ..F.A.....
CONTENT_LIGHT_LEVEL 14           ..F.A.....
ICC_PROFILE     15           ..F.A.....
QP_TABLE_PROPERTIES 16           ..F.A.....
QP_TABLE_DATA   17           ..F.A.....
S12M_TIMECOD    18           ..F.A.....
DYNAMIC_HDR_PLUS 19           ..F.A.....
REGIONS_OF_INTEREST 20           ..F.A.....

This filter has support for timeline through the 'enable' option.

```
 * */
class asidedata(
    val mode : Any? = null,
    val type : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asidedata] を参照してください */
fun String.asidedata(mode : Any? = null, type : Any? = null) : asidedata {
    return asidedata(mode, type, "", "").apply { setInputs(this@asidedata) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asoftclip )](https://ffmpeg.org/ffmpeg-filters.html#asoftclip)

```
Filter asoftclip
Audio Soft Clipper.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asoftclip AVOptions:
type              <int>        ..F.A....T set softclip type (from 0 to 6) (default tanh)
tanh            0            ..F.A....T
atan            1            ..F.A....T
cubic           2            ..F.A....T
exp             3            ..F.A....T
alg             4            ..F.A....T
quintic         5            ..F.A....T
sin             6            ..F.A....T
param             <double>     ..F.A....T set softclip parameter (from 0.01 to 3) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class asoftclip(
    val type : Any? = null,
    val param : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asoftclip] を参照してください */
fun String.asoftclip(type : Any? = null, param : Any? = null) : asoftclip {
    return asoftclip(type, param, "", "").apply { setInputs(this@asoftclip) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asplit )](https://ffmpeg.org/ffmpeg-filters.html#asplit)

```
Filter asplit
Pass on the audio input to N audio outputs.
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
asplit AVOptions:
outputs           <int>        ..FVA..... set number of outputs (from 1 to INT_MAX) (default 2)


```
 * */
class asplit(
    val outputs : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asplit] を参照してください */
fun String.asplit(outputs : Any? = null) : asplit {
    return asplit(outputs, "", "").apply { setInputs(this@asplit) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( astats )](https://ffmpeg.org/ffmpeg-filters.html#astats)

```
Filter astats
Show time domain statistics about audio frames.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
astats AVOptions:
length            <double>     ..F.A..... set the window length (from 0.01 to 10) (default 0.05)
metadata          <boolean>    ..F.A..... inject metadata in the filtergraph (default false)
reset             <int>        ..F.A..... recalculate stats after this many frames (from 0 to INT_MAX) (default 0)
measure_perchannel <flags>      ..F.A..... only measure_perchannel these per-channel statistics (default all+DC_offset+Min_level+Max_level+Min_difference+Max_difference+Mean_difference+RMS_difference+Peak_level+RMS_level+RMS_peak+RMS_trough+Crest_factor+Flat_factor+Peak_count+Bit_depth+Dynamic_range+Zero_crossings+Zero_crossings_rate+Noise_floor+Noise_floor_count+Number_of_samples+Number_of_NaNs+Number_of_Infs+Number_of_denormals)
none                         ..F.A.....
all                          ..F.A.....
DC_offset                    ..F.A.....
Min_level                    ..F.A.....
Max_level                    ..F.A.....
Min_difference               ..F.A.....
Max_difference               ..F.A.....
Mean_difference              ..F.A.....
RMS_difference               ..F.A.....
Peak_level                   ..F.A.....
RMS_level                    ..F.A.....
RMS_peak                     ..F.A.....
RMS_trough                   ..F.A.....
Crest_factor                 ..F.A.....
Flat_factor                  ..F.A.....
Peak_count                   ..F.A.....
Bit_depth                    ..F.A.....
Dynamic_range                ..F.A.....
Zero_crossings               ..F.A.....
Zero_crossings_rate              ..F.A.....
Noise_floor                  ..F.A.....
Noise_floor_count              ..F.A.....
Number_of_samples              ..F.A.....
Number_of_NaNs               ..F.A.....
Number_of_Infs               ..F.A.....
Number_of_denormals              ..F.A.....
measure_overall   <flags>      ..F.A..... only measure_perchannel these overall statistics (default all+DC_offset+Min_level+Max_level+Min_difference+Max_difference+Mean_difference+RMS_difference+Peak_level+RMS_level+RMS_peak+RMS_trough+Crest_factor+Flat_factor+Peak_count+Bit_depth+Dynamic_range+Zero_crossings+Zero_crossings_rate+Noise_floor+Noise_floor_count+Number_of_samples+Number_of_NaNs+Number_of_Infs+Number_of_denormals)
none                         ..F.A.....
all                          ..F.A.....
DC_offset                    ..F.A.....
Min_level                    ..F.A.....
Max_level                    ..F.A.....
Min_difference               ..F.A.....
Max_difference               ..F.A.....
Mean_difference              ..F.A.....
RMS_difference               ..F.A.....
Peak_level                   ..F.A.....
RMS_level                    ..F.A.....
RMS_peak                     ..F.A.....
RMS_trough                   ..F.A.....
Crest_factor                 ..F.A.....
Flat_factor                  ..F.A.....
Peak_count                   ..F.A.....
Bit_depth                    ..F.A.....
Dynamic_range                ..F.A.....
Zero_crossings               ..F.A.....
Zero_crossings_rate              ..F.A.....
Noise_floor                  ..F.A.....
Noise_floor_count              ..F.A.....
Number_of_samples              ..F.A.....
Number_of_NaNs               ..F.A.....
Number_of_Infs               ..F.A.....
Number_of_denormals              ..F.A.....


```
 * */
class astats(
    val length : Any? = null,
    val metadata : Any? = null,
    val reset : Any? = null,
    val measure_perchannel : Any? = null,
    val measure_overall : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [astats] を参照してください */
fun String.astats(length : Any? = null, metadata : Any? = null, reset : Any? = null, measure_perchannel : Any? = null, measure_overall : Any? = null) : astats {
    return astats(length, metadata, reset, measure_perchannel, measure_overall, "", "").apply { setInputs(this@astats) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( astreamselect )](https://ffmpeg.org/ffmpeg-filters.html#astreamselect)

```
Filter astreamselect
Select audio streams
Inputs:
dynamic (depending on the options)
Outputs:
dynamic (depending on the options)
astreamselect AVOptions:
inputs            <int>        ..FVA..... number of input streams (from 2 to INT_MAX) (default 2)
map               <string>     ..FVA....T input indexes to remap to outputs


```
 * */
class astreamselect(
    val inputs : Any? = null,
    val map : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [astreamselect] を参照してください */
fun String.astreamselect(inputs : Any? = null, map : Any? = null) : astreamselect {
    return astreamselect(inputs, map, "", "").apply { setInputs(this@astreamselect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( asubboost )](https://ffmpeg.org/ffmpeg-filters.html#asubboost)

```
Filter asubboost
Boost subwoofer frequencies.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
asubboost AVOptions:
dry               <double>     ..F.A....T set dry gain (from 0 to 1) (default 0.5)
wet               <double>     ..F.A....T set wet gain (from 0 to 1) (default 0.8)
decay             <double>     ..F.A....T set decay (from 0 to 1) (default 0.7)
feedback          <double>     ..F.A....T set feedback (from 0 to 1) (default 0.5)
cutoff            <double>     ..F.A....T set cutoff (from 50 to 900) (default 100)
slope             <double>     ..F.A....T set slope (from 0.0001 to 1) (default 0.5)
delay             <double>     ..F.A....T set delay (from 1 to 100) (default 20)


```
 * */
class asubboost(
    val dry : Any? = null,
    val wet : Any? = null,
    val decay : Any? = null,
    val feedback : Any? = null,
    val cutoff : Any? = null,
    val slope : Any? = null,
    val delay : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [asubboost] を参照してください */
fun String.asubboost(dry : Any? = null, wet : Any? = null, decay : Any? = null, feedback : Any? = null, cutoff : Any? = null, slope : Any? = null, delay : Any? = null) : asubboost {
    return asubboost(dry, wet, decay, feedback, cutoff, slope, delay, "", "").apply { setInputs(this@asubboost) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( atempo )](https://ffmpeg.org/ffmpeg-filters.html#atempo)

```
Filter atempo
Adjust audio tempo.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
atempo AVOptions:
tempo             <double>     ..F.A....T set tempo scale factor (from 0.5 to 100) (default 1)


```
 * */
class atempo(
    val tempo : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [atempo] を参照してください */
fun String.atempo(tempo : Any? = null) : atempo {
    return atempo(tempo, "", "").apply { setInputs(this@atempo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( atrim )](https://ffmpeg.org/ffmpeg-filters.html#atrim)

```
Filter atrim
Pick one continuous section from the input, drop the rest.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
atrim AVOptions:
start             <duration>   ..F.A..... Timestamp of the first frame that should be passed (default INT64_MAX)
starti            <duration>   ..F.A..... Timestamp of the first frame that should be passed (default INT64_MAX)
end               <duration>   ..F.A..... Timestamp of the first frame that should be dropped again (default INT64_MAX)
endi              <duration>   ..F.A..... Timestamp of the first frame that should be dropped again (default INT64_MAX)
start_pts         <int64>      ..F.A..... Timestamp of the first frame that should be  passed (from I64_MIN to I64_MAX) (default I64_MIN)
end_pts           <int64>      ..F.A..... Timestamp of the first frame that should be dropped again (from I64_MIN to I64_MAX) (default I64_MIN)
duration          <duration>   ..F.A..... Maximum duration of the output (default 0)
durationi         <duration>   ..F.A..... Maximum duration of the output (default 0)
start_sample      <int64>      ..F.A..... Number of the first audio sample that should be passed to the output (from -1 to I64_MAX) (default -1)
end_sample        <int64>      ..F.A..... Number of the first audio sample that should be dropped again (from 0 to I64_MAX) (default I64_MAX)


```
 * */
class atrim(
    val start : Any? = null,
    val starti : Any? = null,
    val end : Any? = null,
    val endi : Any? = null,
    val start_pts : Any? = null,
    val end_pts : Any? = null,
    val duration : Any? = null,
    val durationi : Any? = null,
    val start_sample : Any? = null,
    val end_sample : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [atrim] を参照してください */
fun String.atrim(start : Any? = null, starti : Any? = null, end : Any? = null, endi : Any? = null, start_pts : Any? = null, end_pts : Any? = null, duration : Any? = null, durationi : Any? = null, start_sample : Any? = null, end_sample : Any? = null) : atrim {
    return atrim(start, starti, end, endi, start_pts, end_pts, duration, durationi, start_sample, end_sample, "", "").apply { setInputs(this@atrim) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( axcorrelate )](https://ffmpeg.org/ffmpeg-filters.html#axcorrelate)

```
Filter axcorrelate
Cross-correlate two audio streams.
Inputs:
#0: axcorrelate0 (audio)
#1: axcorrelate1 (audio)
Outputs:
#0: default (audio)
axcorrelate AVOptions:
size              <int>        ..F.A..... set segment size (from 2 to 131072) (default 256)
algo              <int>        ..F.A..... set alghorithm (from 0 to 1) (default slow)
slow            0            ..F.A..... slow algorithm
fast            1            ..F.A..... fast algorithm


```
 * */
class axcorrelate(
    val size : Any? = null,
    val algo : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [axcorrelate] を参照してください */
fun String.axcorrelate(size : Any? = null, algo : Any? = null) : axcorrelate {
    return axcorrelate(size, algo, "", "").apply { setInputs(this@axcorrelate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bandpass )](https://ffmpeg.org/ffmpeg-filters.html#bandpass)

```
Filter bandpass
Apply a two-pole Butterworth band-pass filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
bandpass AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set band-width (from 0 to 99999) (default 0.5)
w                 <double>     ..F.A....T set band-width (from 0 to 99999) (default 0.5)
csg               <boolean>    ..F.A....T use constant skirt gain (default false)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class bandpass(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val csg : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bandpass] を参照してください */
fun String.bandpass(frequency : Any? = null, width_type : Any? = null, width : Any? = null, csg : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : bandpass {
    return bandpass(frequency, width_type, width, csg, mix, channels, normalize, f, t, w, m, c, n, "", "").apply { setInputs(this@bandpass) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bandreject )](https://ffmpeg.org/ffmpeg-filters.html#bandreject)

```
Filter bandreject
Apply a two-pole Butterworth band-reject filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
bandreject AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set band-width (from 0 to 99999) (default 0.5)
w                 <double>     ..F.A....T set band-width (from 0 to 99999) (default 0.5)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class bandreject(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bandreject] を参照してください */
fun String.bandreject(frequency : Any? = null, width_type : Any? = null, width : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : bandreject {
    return bandreject(frequency, width_type, width, mix, channels, normalize, f, t, w, m, c, n, "", "").apply { setInputs(this@bandreject) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bass )](https://ffmpeg.org/ffmpeg-filters.html#bass)

```
Filter bass
Boost or cut lower frequencies.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
bass AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 100)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 100)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
w                 <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
gain              <double>     ..F.A....T set gain (from -900 to 900) (default 0)
g                 <double>     ..F.A....T set gain (from -900 to 900) (default 0)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class bass(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val gain : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val g : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bass] を参照してください */
fun String.bass(frequency : Any? = null, width_type : Any? = null, width : Any? = null, gain : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, g : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : bass {
    return bass(frequency, width_type, width, gain, mix, channels, normalize, f, t, w, g, m, c, n, "", "").apply { setInputs(this@bass) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( biquad )](https://ffmpeg.org/ffmpeg-filters.html#biquad)

```
Filter biquad
Apply a biquad IIR filter with the given coefficients.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
biquad AVOptions:
a0                <double>     ..F.A....T (from INT_MIN to INT_MAX) (default 1)
a1                <double>     ..F.A....T (from INT_MIN to INT_MAX) (default 0)
a2                <double>     ..F.A....T (from INT_MIN to INT_MAX) (default 0)
b0                <double>     ..F.A....T (from INT_MIN to INT_MAX) (default 0)
b1                <double>     ..F.A....T (from INT_MIN to INT_MAX) (default 0)
b2                <double>     ..F.A....T (from INT_MIN to INT_MAX) (default 0)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class biquad(
    val a0 : Any? = null,
    val a1 : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val a2 : Any? = null,
    val b0 : Any? = null,
    val b1 : Any? = null,
    val b2 : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [biquad] を参照してください */
fun String.biquad(a0 : Any? = null, a1 : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, a2 : Any? = null, b0 : Any? = null, b1 : Any? = null, b2 : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : biquad {
    return biquad(a0, a1, mix, channels, normalize, a2, b0, b1, b2, m, c, n, "", "").apply { setInputs(this@biquad) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( channelmap )](https://ffmpeg.org/ffmpeg-filters.html#channelmap)

```
Filter channelmap
Remap audio channels.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
channelmap AVOptions:
map               <string>     ..F.A..... A comma-separated list of input channel numbers in output order.
channel_layout    <string>     ..F.A..... Output channel layout.


```
 * */
class channelmap(
    val map : Any? = null,
    val channel_layout : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [channelmap] を参照してください */
fun String.channelmap(map : Any? = null, channel_layout : Any? = null) : channelmap {
    return channelmap(map, channel_layout, "", "").apply { setInputs(this@channelmap) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( channelsplit )](https://ffmpeg.org/ffmpeg-filters.html#channelsplit)

```
Filter channelsplit
Split audio into per-channel streams.
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
channelsplit AVOptions:
channel_layout    <string>     ..F.A..... Input channel layout. (default "stereo")
channels          <string>     ..F.A..... Channels to extract. (default "all")


```
 * */
class channelsplit(
    val channel_layout : Any? = null,
    val channels : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [channelsplit] を参照してください */
fun String.channelsplit(channel_layout : Any? = null, channels : Any? = null) : channelsplit {
    return channelsplit(channel_layout, channels, "", "").apply { setInputs(this@channelsplit) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( chorus )](https://ffmpeg.org/ffmpeg-filters.html#chorus)

```
Filter chorus
Add a chorus effect to the audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
chorus AVOptions:
in_gain           <float>      ..F.A..... set input gain (from 0 to 1) (default 0.4)
out_gain          <float>      ..F.A..... set output gain (from 0 to 1) (default 0.4)
delays            <string>     ..F.A..... set delays
decays            <string>     ..F.A..... set decays
speeds            <string>     ..F.A..... set speeds
depths            <string>     ..F.A..... set depths


```
 * */
class chorus(
    val in_gain : Any? = null,
    val out_gain : Any? = null,
    val delays : Any? = null,
    val decays : Any? = null,
    val speeds : Any? = null,
    val depths : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [chorus] を参照してください */
fun String.chorus(in_gain : Any? = null, out_gain : Any? = null, delays : Any? = null, decays : Any? = null, speeds : Any? = null, depths : Any? = null) : chorus {
    return chorus(in_gain, out_gain, delays, decays, speeds, depths, "", "").apply { setInputs(this@chorus) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( compand )](https://ffmpeg.org/ffmpeg-filters.html#compand)

```
Filter compand
Compress or expand audio dynamic range.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
compand AVOptions:
attacks           <string>     ..F.A..... set time over which increase of volume is determined (default "0")
decays            <string>     ..F.A..... set time over which decrease of volume is determined (default "0.8")
points            <string>     ..F.A..... set points of transfer function (default "-70/-70|-60/-20|1/0")
soft-knee         <double>     ..F.A..... set soft-knee (from 0.01 to 900) (default 0.01)
gain              <double>     ..F.A..... set output gain (from -900 to 900) (default 0)
volume            <double>     ..F.A..... set initial volume (from -900 to 0) (default 0)
delay             <double>     ..F.A..... set delay for samples before sending them to volume adjuster (from 0 to 20) (default 0)


```
 * */
class compand(
    val attacks : Any? = null,
    val decays : Any? = null,
    val points : Any? = null,
    val soft__knee : Any? = null,
    val gain : Any? = null,
    val volume : Any? = null,
    val delay : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [compand] を参照してください */
fun String.compand(attacks : Any? = null, decays : Any? = null, points : Any? = null, soft__knee : Any? = null, gain : Any? = null, volume : Any? = null, delay : Any? = null) : compand {
    return compand(attacks, decays, points, soft__knee, gain, volume, delay, "", "").apply { setInputs(this@compand) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( compensationdelay )](https://ffmpeg.org/ffmpeg-filters.html#compensationdelay)

```
Filter compensationdelay
Audio Compensation Delay Line.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
compensationdelay AVOptions:
mm                <int>        ..F.A..... set mm distance (from 0 to 10) (default 0)
cm                <int>        ..F.A..... set cm distance (from 0 to 100) (default 0)
m                 <int>        ..F.A..... set meter distance (from 0 to 100) (default 0)
dry               <double>     ..F.A..... set dry amount (from 0 to 1) (default 0)
wet               <double>     ..F.A..... set wet amount (from 0 to 1) (default 1)
temp              <int>        ..F.A..... set temperature °C (from -50 to 50) (default 20)


```
 * */
class compensationdelay(
    val mm : Any? = null,
    val cm : Any? = null,
    val m : Any? = null,
    val dry : Any? = null,
    val wet : Any? = null,
    val temp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [compensationdelay] を参照してください */
fun String.compensationdelay(mm : Any? = null, cm : Any? = null, m : Any? = null, dry : Any? = null, wet : Any? = null, temp : Any? = null) : compensationdelay {
    return compensationdelay(mm, cm, m, dry, wet, temp, "", "").apply { setInputs(this@compensationdelay) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( crossfeed )](https://ffmpeg.org/ffmpeg-filters.html#crossfeed)

```
Filter crossfeed
Apply headphone crossfeed filter.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
crossfeed AVOptions:
strength          <double>     ..F.A....T set crossfeed strength (from 0 to 1) (default 0.2)
range             <double>     ..F.A....T set soundstage wideness (from 0 to 1) (default 0.5)
slope             <double>     ..F.A....T set curve slope (from 0.01 to 1) (default 0.5)
level_in          <double>     ..F.A....T set level in (from 0 to 1) (default 0.9)
level_out         <double>     ..F.A....T set level out (from 0 to 1) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class crossfeed(
    val strength : Any? = null,
    val range : Any? = null,
    val slope : Any? = null,
    val level_in : Any? = null,
    val level_out : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [crossfeed] を参照してください */
fun String.crossfeed(strength : Any? = null, range : Any? = null, slope : Any? = null, level_in : Any? = null, level_out : Any? = null) : crossfeed {
    return crossfeed(strength, range, slope, level_in, level_out, "", "").apply { setInputs(this@crossfeed) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( crystalizer )](https://ffmpeg.org/ffmpeg-filters.html#crystalizer)

```
Filter crystalizer
Simple expand audio dynamic range filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
crystalizer AVOptions:
i                 <float>      ..F.A....T set intensity (from 0 to 10) (default 2)
c                 <boolean>    ..F.A....T enable clipping (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class crystalizer(
    val i : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [crystalizer] を参照してください */
fun String.crystalizer(i : Any? = null, c : Any? = null) : crystalizer {
    return crystalizer(i, c, "", "").apply { setInputs(this@crystalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dcshift )](https://ffmpeg.org/ffmpeg-filters.html#dcshift)

```
Filter dcshift
Apply a DC shift to the audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
dcshift AVOptions:
shift             <double>     ..F.A..... set DC shift (from -1 to 1) (default 0)
limitergain       <double>     ..F.A..... set limiter gain (from 0 to 1) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class dcshift(
    val shift : Any? = null,
    val limitergain : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dcshift] を参照してください */
fun String.dcshift(shift : Any? = null, limitergain : Any? = null) : dcshift {
    return dcshift(shift, limitergain, "", "").apply { setInputs(this@dcshift) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deesser )](https://ffmpeg.org/ffmpeg-filters.html#deesser)

```
Filter deesser
Apply de-essing to the audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
deesser AVOptions:
i                 <double>     ..F.A..... set intensity (from 0 to 1) (default 0)
m                 <double>     ..F.A..... set max deessing (from 0 to 1) (default 0.5)
f                 <double>     ..F.A..... set frequency (from 0 to 1) (default 0.5)
s                 <int>        ..F.A..... set output mode (from 0 to 2) (default o)
i               0            ..F.A..... input
o               1            ..F.A..... output
e               2            ..F.A..... ess

This filter has support for timeline through the 'enable' option.

```
 * */
class deesser(
    val i : Any? = null,
    val m : Any? = null,
    val f : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deesser] を参照してください */
fun String.deesser(i : Any? = null, m : Any? = null, f : Any? = null, s : Any? = null) : deesser {
    return deesser(i, m, f, s, "", "").apply { setInputs(this@deesser) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( drmeter )](https://ffmpeg.org/ffmpeg-filters.html#drmeter)

```
Filter drmeter
Measure audio dynamic range.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
drmeter AVOptions:
length            <double>     ..F.A..... set the window length (from 0.01 to 10) (default 3)


```
 * */
class drmeter(
    val length : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [drmeter] を参照してください */
fun String.drmeter(length : Any? = null) : drmeter {
    return drmeter(length, "", "").apply { setInputs(this@drmeter) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dynaudnorm )](https://ffmpeg.org/ffmpeg-filters.html#dynaudnorm)

```
Filter dynaudnorm
Dynamic Audio Normalizer.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
dynaudnorm AVOptions:
framelen          <int>        ..F.A....T set the frame length in msec (from 10 to 8000) (default 500)
f                 <int>        ..F.A....T set the frame length in msec (from 10 to 8000) (default 500)
gausssize         <int>        ..F.A....T set the filter size (from 3 to 301) (default 31)
g                 <int>        ..F.A....T set the filter size (from 3 to 301) (default 31)
peak              <double>     ..F.A....T set the peak value (from 0 to 1) (default 0.95)
p                 <double>     ..F.A....T set the peak value (from 0 to 1) (default 0.95)
maxgain           <double>     ..F.A....T set the max amplification (from 1 to 100) (default 10)
m                 <double>     ..F.A....T set the max amplification (from 1 to 100) (default 10)
targetrms         <double>     ..F.A....T set the target RMS (from 0 to 1) (default 0)
r                 <double>     ..F.A....T set the target RMS (from 0 to 1) (default 0)
coupling          <boolean>    ..F.A....T set channel coupling (default true)
n                 <boolean>    ..F.A....T set channel coupling (default true)
correctdc         <boolean>    ..F.A....T set DC correction (default false)
c                 <boolean>    ..F.A....T set DC correction (default false)
altboundary       <boolean>    ..F.A....T set alternative boundary mode (default false)
b                 <boolean>    ..F.A....T set alternative boundary mode (default false)
compress          <double>     ..F.A....T set the compress factor (from 0 to 30) (default 0)
s                 <double>     ..F.A....T set the compress factor (from 0 to 30) (default 0)
threshold         <double>     ..F.A....T set the threshold value (from 0 to 1) (default 0)
t                 <double>     ..F.A....T set the threshold value (from 0 to 1) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class dynaudnorm(
    val framelen : Any? = null,
    val gausssize : Any? = null,
    val peak : Any? = null,
    val maxgain : Any? = null,
    val targetrms : Any? = null,
    val coupling : Any? = null,
    val correctdc : Any? = null,
    val altboundary : Any? = null,
    val compress : Any? = null,
    val threshold : Any? = null,
    val f : Any? = null,
    val g : Any? = null,
    val p : Any? = null,
    val m : Any? = null,
    val r : Any? = null,
    val n : Any? = null,
    val c : Any? = null,
    val b : Any? = null,
    val s : Any? = null,
    val t : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dynaudnorm] を参照してください */
fun String.dynaudnorm(framelen : Any? = null, gausssize : Any? = null, peak : Any? = null, maxgain : Any? = null, targetrms : Any? = null, coupling : Any? = null, correctdc : Any? = null, altboundary : Any? = null, compress : Any? = null, threshold : Any? = null, f : Any? = null, g : Any? = null, p : Any? = null, m : Any? = null, r : Any? = null, n : Any? = null, c : Any? = null, b : Any? = null, s : Any? = null, t : Any? = null) : dynaudnorm {
    return dynaudnorm(framelen, gausssize, peak, maxgain, targetrms, coupling, correctdc, altboundary, compress, threshold, f, g, p, m, r, n, c, b, s, t, "", "").apply { setInputs(this@dynaudnorm) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( earwax )](https://ffmpeg.org/ffmpeg-filters.html#earwax)

```
Filter earwax
Widen the stereo image.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class earwax(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [earwax] を参照してください */
fun String.earwax() : earwax {
    return earwax("", "").apply { setInputs(this@earwax) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ebur128 )](https://ffmpeg.org/ffmpeg-filters.html#ebur128)

```
Filter ebur128
EBU R128 scanner.
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
ebur128 AVOptions:
video             <boolean>    ..FV...... set video output (default false)
size              <image_size> ..FV...... set video size (default "640x480")
meter             <int>        ..FV...... set scale meter (+9 to +18) (from 9 to 18) (default 9)
framelog          <int>        ..FVA..... force frame logging level (from INT_MIN to INT_MAX) (default -1)
info            32           ..FVA..... information logging level
verbose         40           ..FVA..... verbose logging level
metadata          <boolean>    ..FVA..... inject metadata in the filtergraph (default false)
peak              <flags>      ..F.A..... set peak mode (default 0)
none                         ..F.A..... disable any peak mode
sample                       ..F.A..... enable peak-sample mode
true                         ..F.A..... enable true-peak mode
dualmono          <boolean>    ..F.A..... treat mono input files as dual-mono (default false)
panlaw            <double>     ..F.A..... set a specific pan law for dual-mono files (from -10 to 0) (default -3.0103)
target            <int>        ..FV...... set a specific target level in LUFS (-23 to 0) (from -23 to 0) (default -23)
gauge             <int>        ..FV...... set gauge display type (from 0 to 1) (default momentary)
momentary       0            ..FV...... display momentary value
m               0            ..FV...... display momentary value
shortterm       1            ..FV...... display short-term value
s               1            ..FV...... display short-term value
scale             <int>        ..FV...... sets display method for the stats (from 0 to 1) (default absolute)
absolute        0            ..FV...... display absolute values (LUFS)
LUFS            0            ..FV...... display absolute values (LUFS)
relative        1            ..FV...... display values relative to target (LU)
LU              1            ..FV...... display values relative to target (LU)


```
 * */
class ebur128(
    val video : Any? = null,
    val size : Any? = null,
    val meter : Any? = null,
    val framelog : Any? = null,
    val metadata : Any? = null,
    val peak : Any? = null,
    val dualmono : Any? = null,
    val panlaw : Any? = null,
    val target : Any? = null,
    val gauge : Any? = null,
    val scale : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ebur128] を参照してください */
fun String.ebur128(video : Any? = null, size : Any? = null, meter : Any? = null, framelog : Any? = null, metadata : Any? = null, peak : Any? = null, dualmono : Any? = null, panlaw : Any? = null, target : Any? = null, gauge : Any? = null, scale : Any? = null) : ebur128 {
    return ebur128(video, size, meter, framelog, metadata, peak, dualmono, panlaw, target, gauge, scale, "", "").apply { setInputs(this@ebur128) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( equalizer )](https://ffmpeg.org/ffmpeg-filters.html#equalizer)

```
Filter equalizer
Apply two-pole peaking equalization (EQ) filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
equalizer AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 0)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 0)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set band-width (from 0 to 99999) (default 1)
w                 <double>     ..F.A....T set band-width (from 0 to 99999) (default 1)
gain              <double>     ..F.A....T set gain (from -900 to 900) (default 0)
g                 <double>     ..F.A....T set gain (from -900 to 900) (default 0)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class equalizer(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val gain : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val g : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [equalizer] を参照してください */
fun String.equalizer(frequency : Any? = null, width_type : Any? = null, width : Any? = null, gain : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, g : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : equalizer {
    return equalizer(frequency, width_type, width, gain, mix, channels, normalize, f, t, w, g, m, c, n, "", "").apply { setInputs(this@equalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( extrastereo )](https://ffmpeg.org/ffmpeg-filters.html#extrastereo)

```
Filter extrastereo
Increase difference between stereo audio channels.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
extrastereo AVOptions:
m                 <float>      ..F.A....T set the difference coefficient (from -10 to 10) (default 2.5)
c                 <boolean>    ..F.A....T enable clipping (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class extrastereo(
    val m : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [extrastereo] を参照してください */
fun String.extrastereo(m : Any? = null, c : Any? = null) : extrastereo {
    return extrastereo(m, c, "", "").apply { setInputs(this@extrastereo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( firequalizer )](https://ffmpeg.org/ffmpeg-filters.html#firequalizer)

```
Filter firequalizer
Finite Impulse Response Equalizer.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
firequalizer AVOptions:
gain              <string>     ..F.A....T set gain curve (default "gain_interpolate(f)")
gain_entry        <string>     ..F.A....T set gain entry
delay             <double>     ..F.A..... set delay (from 0 to 1e+10) (default 0.01)
accuracy          <double>     ..F.A..... set accuracy (from 0 to 1e+10) (default 5)
wfunc             <int>        ..F.A..... set window function (from 0 to 9) (default hann)
rectangular     0            ..F.A..... rectangular window
hann            1            ..F.A..... hann window
hamming         2            ..F.A..... hamming window
blackman        3            ..F.A..... blackman window
nuttall3        4            ..F.A..... 3-term nuttall window
mnuttall3       5            ..F.A..... minimum 3-term nuttall window
nuttall         6            ..F.A..... nuttall window
bnuttall        7            ..F.A..... blackman-nuttall window
bharris         8            ..F.A..... blackman-harris window
tukey           9            ..F.A..... tukey window
fixed             <boolean>    ..F.A..... set fixed frame samples (default false)
multi             <boolean>    ..F.A..... set multi channels mode (default false)
zero_phase        <boolean>    ..F.A..... set zero phase mode (default false)
scale             <int>        ..F.A..... set gain scale (from 0 to 3) (default linlog)
linlin          0            ..F.A..... linear-freq linear-gain
linlog          1            ..F.A..... linear-freq logarithmic-gain
loglin          2            ..F.A..... logarithmic-freq linear-gain
loglog          3            ..F.A..... logarithmic-freq logarithmic-gain
dumpfile          <string>     ..F.A..... set dump file
dumpscale         <int>        ..F.A..... set dump scale (from 0 to 3) (default linlog)
linlin          0            ..F.A..... linear-freq linear-gain
linlog          1            ..F.A..... linear-freq logarithmic-gain
loglin          2            ..F.A..... logarithmic-freq linear-gain
loglog          3            ..F.A..... logarithmic-freq logarithmic-gain
fft2              <boolean>    ..F.A..... set 2-channels fft (default false)
min_phase         <boolean>    ..F.A..... set minimum phase mode (default false)


```
 * */
class firequalizer(
    val gain : Any? = null,
    val gain_entry : Any? = null,
    val delay : Any? = null,
    val accuracy : Any? = null,
    val wfunc : Any? = null,
    val fixed : Any? = null,
    val multi : Any? = null,
    val zero_phase : Any? = null,
    val scale : Any? = null,
    val dumpfile : Any? = null,
    val dumpscale : Any? = null,
    val fft2 : Any? = null,
    val min_phase : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [firequalizer] を参照してください */
fun String.firequalizer(gain : Any? = null, gain_entry : Any? = null, delay : Any? = null, accuracy : Any? = null, wfunc : Any? = null, fixed : Any? = null, multi : Any? = null, zero_phase : Any? = null, scale : Any? = null, dumpfile : Any? = null, dumpscale : Any? = null, fft2 : Any? = null, min_phase : Any? = null) : firequalizer {
    return firequalizer(gain, gain_entry, delay, accuracy, wfunc, fixed, multi, zero_phase, scale, dumpfile, dumpscale, fft2, min_phase, "", "").apply { setInputs(this@firequalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( flanger )](https://ffmpeg.org/ffmpeg-filters.html#flanger)

```
Filter flanger
Apply a flanging effect to the audio.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
flanger AVOptions:
delay             <double>     ..F.A..... base delay in milliseconds (from 0 to 30) (default 0)
depth             <double>     ..F.A..... added swept delay in milliseconds (from 0 to 10) (default 2)
regen             <double>     ..F.A..... percentage regeneration (delayed signal feedback) (from -95 to 95) (default 0)
width             <double>     ..F.A..... percentage of delayed signal mixed with original (from 0 to 100) (default 71)
speed             <double>     ..F.A..... sweeps per second (Hz) (from 0.1 to 10) (default 0.5)
shape             <int>        ..F.A..... swept wave shape (from 0 to 1) (default sinusoidal)
triangular      1            ..F.A.....
t               1            ..F.A.....
sinusoidal      0            ..F.A.....
s               0            ..F.A.....
phase             <double>     ..F.A..... swept wave percentage phase-shift for multi-channel (from 0 to 100) (default 25)
interp            <int>        ..F.A..... delay-line interpolation (from 0 to 1) (default linear)
linear          0            ..F.A.....
quadratic       1            ..F.A.....


```
 * */
class flanger(
    val delay : Any? = null,
    val depth : Any? = null,
    val regen : Any? = null,
    val width : Any? = null,
    val speed : Any? = null,
    val shape : Any? = null,
    val phase : Any? = null,
    val interp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [flanger] を参照してください */
fun String.flanger(delay : Any? = null, depth : Any? = null, regen : Any? = null, width : Any? = null, speed : Any? = null, shape : Any? = null, phase : Any? = null, interp : Any? = null) : flanger {
    return flanger(delay, depth, regen, width, speed, shape, phase, interp, "", "").apply { setInputs(this@flanger) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( haas )](https://ffmpeg.org/ffmpeg-filters.html#haas)

```
Filter haas
Apply Haas Stereo Enhancer.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
haas AVOptions:
level_in          <double>     ..F.A..... set level in (from 0.015625 to 64) (default 1)
level_out         <double>     ..F.A..... set level out (from 0.015625 to 64) (default 1)
side_gain         <double>     ..F.A..... set side gain (from 0.015625 to 64) (default 1)
middle_source     <int>        ..F.A..... set middle source (from 0 to 3) (default mid)
left            0            ..F.A.....
right           1            ..F.A.....
mid             2            ..F.A..... L+R
side            3            ..F.A..... L-R
middle_phase      <boolean>    ..F.A..... set middle phase (default false)
left_delay        <double>     ..F.A..... set left delay (from 0 to 40) (default 2.05)
left_balance      <double>     ..F.A..... set left balance (from -1 to 1) (default -1)
left_gain         <double>     ..F.A..... set left gain (from 0.015625 to 64) (default 1)
left_phase        <boolean>    ..F.A..... set left phase (default false)
right_delay       <double>     ..F.A..... set right delay (from 0 to 40) (default 2.12)
right_balance     <double>     ..F.A..... set right balance (from -1 to 1) (default 1)
right_gain        <double>     ..F.A..... set right gain (from 0.015625 to 64) (default 1)
right_phase       <boolean>    ..F.A..... set right phase (default true)


```
 * */
class haas(
    val level_in : Any? = null,
    val level_out : Any? = null,
    val side_gain : Any? = null,
    val middle_source : Any? = null,
    val middle_phase : Any? = null,
    val left_delay : Any? = null,
    val left_balance : Any? = null,
    val left_gain : Any? = null,
    val left_phase : Any? = null,
    val right_delay : Any? = null,
    val right_balance : Any? = null,
    val right_gain : Any? = null,
    val right_phase : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [haas] を参照してください */
fun String.haas(level_in : Any? = null, level_out : Any? = null, side_gain : Any? = null, middle_source : Any? = null, middle_phase : Any? = null, left_delay : Any? = null, left_balance : Any? = null, left_gain : Any? = null, left_phase : Any? = null, right_delay : Any? = null, right_balance : Any? = null, right_gain : Any? = null, right_phase : Any? = null) : haas {
    return haas(level_in, level_out, side_gain, middle_source, middle_phase, left_delay, left_balance, left_gain, left_phase, right_delay, right_balance, right_gain, right_phase, "", "").apply { setInputs(this@haas) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hdcd )](https://ffmpeg.org/ffmpeg-filters.html#hdcd)

```
Filter hdcd
Apply High Definition Compatible Digital (HDCD) decoding.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
hdcd AVOptions:
disable_autoconvert <boolean>    ..F.A..... Disable any format conversion or resampling in the filter graph. (default true)
process_stereo    <boolean>    ..F.A..... Process stereo channels together. Only apply target_gain when both channels match. (default true)
cdt_ms            <int>        ..F.A..... Code detect timer period in ms. (from 100 to 60000) (default 2000)
force_pe          <boolean>    ..F.A..... Always extend peaks above -3dBFS even when PE is not signaled. (default false)
analyze_mode      <int>        ..F.A..... Replace audio with solid tone and signal some processing aspect in the amplitude. (from 0 to 4) (default off)
off             0            ..F.A..... disabled
lle             1            ..F.A..... gain adjustment level at each sample
pe              2            ..F.A..... samples where peak extend occurs
cdt             3            ..F.A..... samples where the code detect timer is active
tgm             4            ..F.A..... samples where the target gain does not match between channels
bits_per_sample   <int>        ..F.A..... Valid bits per sample (location of the true LSB). (from 16 to 24) (default 16)
16              16           ..F.A..... 16-bit (in s32 or s16)
20              20           ..F.A..... 20-bit (in s32)
24              24           ..F.A..... 24-bit (in s32)


```
 * */
class hdcd(
    val disable_autoconvert : Any? = null,
    val process_stereo : Any? = null,
    val cdt_ms : Any? = null,
    val force_pe : Any? = null,
    val analyze_mode : Any? = null,
    val bits_per_sample : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hdcd] を参照してください */
fun String.hdcd(disable_autoconvert : Any? = null, process_stereo : Any? = null, cdt_ms : Any? = null, force_pe : Any? = null, analyze_mode : Any? = null, bits_per_sample : Any? = null) : hdcd {
    return hdcd(disable_autoconvert, process_stereo, cdt_ms, force_pe, analyze_mode, bits_per_sample, "", "").apply { setInputs(this@hdcd) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( headphone )](https://ffmpeg.org/ffmpeg-filters.html#headphone)

```
Filter headphone
Apply headphone binaural spatialization with HRTFs in additional streams.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (audio)
headphone AVOptions:
map               <string>     ..F.A..... set channels convolution mappings
gain              <float>      ..F.A..... set gain in dB (from -20 to 40) (default 0)
lfe               <float>      ..F.A..... set lfe gain in dB (from -20 to 40) (default 0)
type              <int>        ..F.A..... set processing (from 0 to 1) (default freq)
time            0            ..F.A..... time domain
freq            1            ..F.A..... frequency domain
size              <int>        ..F.A..... set frame size (from 1024 to 96000) (default 1024)
hrir              <int>        ..F.A..... set hrir format (from 0 to 1) (default stereo)
stereo          0            ..F.A..... hrir files have exactly 2 channels
multich         1            ..F.A..... single multichannel hrir file


```
 * */
class headphone(
    val map : Any? = null,
    val gain : Any? = null,
    val lfe : Any? = null,
    val type : Any? = null,
    val size : Any? = null,
    val hrir : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [headphone] を参照してください */
fun String.headphone(map : Any? = null, gain : Any? = null, lfe : Any? = null, type : Any? = null, size : Any? = null, hrir : Any? = null) : headphone {
    return headphone(map, gain, lfe, type, size, hrir, "", "").apply { setInputs(this@headphone) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( highpass )](https://ffmpeg.org/ffmpeg-filters.html#highpass)

```
Filter highpass
Apply a high-pass filter with 3dB point frequency.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
highpass AVOptions:
frequency         <double>     ..F.A....T set frequency (from 0 to 999999) (default 3000)
f                 <double>     ..F.A....T set frequency (from 0 to 999999) (default 3000)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set width (from 0 to 99999) (default 0.707)
w                 <double>     ..F.A....T set width (from 0 to 99999) (default 0.707)
poles             <int>        ..F.A..... set number of poles (from 1 to 2) (default 2)
p                 <int>        ..F.A..... set number of poles (from 1 to 2) (default 2)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class highpass(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val poles : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val p : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [highpass] を参照してください */
fun String.highpass(frequency : Any? = null, width_type : Any? = null, width : Any? = null, poles : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, p : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : highpass {
    return highpass(frequency, width_type, width, poles, mix, channels, normalize, f, t, w, p, m, c, n, "", "").apply { setInputs(this@highpass) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( highshelf )](https://ffmpeg.org/ffmpeg-filters.html#highshelf)

```
Filter highshelf
Apply a high shelf filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
highshelf AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
w                 <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
gain              <double>     ..F.A....T set gain (from -900 to 900) (default 0)
g                 <double>     ..F.A....T set gain (from -900 to 900) (default 0)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class highshelf(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val gain : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val g : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [highshelf] を参照してください */
fun String.highshelf(frequency : Any? = null, width_type : Any? = null, width : Any? = null, gain : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, g : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : highshelf {
    return highshelf(frequency, width_type, width, gain, mix, channels, normalize, f, t, w, g, m, c, n, "", "").apply { setInputs(this@highshelf) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( join )](https://ffmpeg.org/ffmpeg-filters.html#join)

```
Filter join
Join multiple audio streams into multi-channel output.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (audio)
join AVOptions:
inputs            <int>        ..F.A..... Number of input streams. (from 1 to INT_MAX) (default 2)
channel_layout    <string>     ..F.A..... Channel layout of the output stream. (default "stereo")
map               <string>     ..F.A..... A comma-separated list of channels maps in the format 'input_stream.input_channel-output_channel.


```
 * */
class join(
    val inputs : Any? = null,
    val channel_layout : Any? = null,
    val map : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [join] を参照してください */
fun String.join(inputs : Any? = null, channel_layout : Any? = null, map : Any? = null) : join {
    return join(inputs, channel_layout, map, "", "").apply { setInputs(this@join) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( loudnorm )](https://ffmpeg.org/ffmpeg-filters.html#loudnorm)

```
Filter loudnorm
EBU R128 loudness normalization
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
loudnorm AVOptions:
I                 <double>     ..F.A..... set integrated loudness target (from -70 to -5) (default -24)
i                 <double>     ..F.A..... set integrated loudness target (from -70 to -5) (default -24)
LRA               <double>     ..F.A..... set loudness range target (from 1 to 20) (default 7)
lra               <double>     ..F.A..... set loudness range target (from 1 to 20) (default 7)
TP                <double>     ..F.A..... set maximum true peak (from -9 to 0) (default -2)
tp                <double>     ..F.A..... set maximum true peak (from -9 to 0) (default -2)
measured_I        <double>     ..F.A..... measured IL of input file (from -99 to 0) (default 0)
measured_i        <double>     ..F.A..... measured IL of input file (from -99 to 0) (default 0)
measured_LRA      <double>     ..F.A..... measured LRA of input file (from 0 to 99) (default 0)
measured_lra      <double>     ..F.A..... measured LRA of input file (from 0 to 99) (default 0)
measured_TP       <double>     ..F.A..... measured true peak of input file (from -99 to 99) (default 99)
measured_tp       <double>     ..F.A..... measured true peak of input file (from -99 to 99) (default 99)
measured_thresh   <double>     ..F.A..... measured threshold of input file (from -99 to 0) (default -70)
offset            <double>     ..F.A..... set offset gain (from -99 to 99) (default 0)
linear            <boolean>    ..F.A..... normalize linearly if possible (default true)
dual_mono         <boolean>    ..F.A..... treat mono input as dual-mono (default false)
print_format      <int>        ..F.A..... set print format for stats (from 0 to 2) (default none)
none            0            ..F.A.....
json            1            ..F.A.....
summary         2            ..F.A.....


```
 * */
class loudnorm(
    val I : Any? = null,
    val LRA : Any? = null,
    val TP : Any? = null,
    val measured_I : Any? = null,
    val measured_i : Any? = null,
    val measured_LRA : Any? = null,
    val measured_lra : Any? = null,
    val measured_TP : Any? = null,
    val measured_tp : Any? = null,
    val measured_thresh : Any? = null,
    val offset : Any? = null,
    val linear : Any? = null,
    val dual_mono : Any? = null,
    val print_format : Any? = null,
    val _i : Any? = null,
    val lra : Any? = null,
    val tp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [loudnorm] を参照してください */
fun String.loudnorm(I : Any? = null, LRA : Any? = null, lra : Any? = null, TP : Any? = null, measured_I : Any? = null, measured_i : Any? = null, measured_LRA : Any? = null, measured_lra : Any? = null, measured_TP : Any? = null, measured_tp : Any? = null, measured_thresh : Any? = null, offset : Any? = null, linear : Any? = null, dual_mono : Any? = null, print_format : Any? = null, _i : Any? = null, tp : Any? = null) : loudnorm {
    return loudnorm(I, LRA, lra, TP, measured_I, measured_i, measured_LRA, measured_lra, measured_TP, measured_tp, measured_thresh, offset, linear, dual_mono, print_format, _i, tp, "", "").apply { setInputs(this@loudnorm) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lowpass )](https://ffmpeg.org/ffmpeg-filters.html#lowpass)

```
Filter lowpass
Apply a low-pass filter with 3dB point frequency.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
lowpass AVOptions:
frequency         <double>     ..F.A....T set frequency (from 0 to 999999) (default 500)
f                 <double>     ..F.A....T set frequency (from 0 to 999999) (default 500)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set width (from 0 to 99999) (default 0.707)
w                 <double>     ..F.A....T set width (from 0 to 99999) (default 0.707)
poles             <int>        ..F.A..... set number of poles (from 1 to 2) (default 2)
p                 <int>        ..F.A..... set number of poles (from 1 to 2) (default 2)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class lowpass(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val poles : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val p : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lowpass] を参照してください */
fun String.lowpass(frequency : Any? = null, width_type : Any? = null, width : Any? = null, poles : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, p : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : lowpass {
    return lowpass(frequency, width_type, width, poles, mix, channels, normalize, f, t, w, p, m, c, n, "", "").apply { setInputs(this@lowpass) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lowshelf )](https://ffmpeg.org/ffmpeg-filters.html#lowshelf)

```
Filter lowshelf
Apply a low shelf filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
lowshelf AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 100)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 100)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
w                 <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
gain              <double>     ..F.A....T set gain (from -900 to 900) (default 0)
g                 <double>     ..F.A....T set gain (from -900 to 900) (default 0)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class lowshelf(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val gain : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val g : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lowshelf] を参照してください */
fun String.lowshelf(frequency : Any? = null, width_type : Any? = null, width : Any? = null, gain : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, g : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : lowshelf {
    return lowshelf(frequency, width_type, width, gain, mix, channels, normalize, f, t, w, g, m, c, n, "", "").apply { setInputs(this@lowshelf) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mcompand )](https://ffmpeg.org/ffmpeg-filters.html#mcompand)

```
Filter mcompand
Multiband Compress or expand audio dynamic range.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
mcompand AVOptions:
args              <string>     ..F.A..... set parameters for each band (default "0.005,0.1 6 -47/-40,-34/-34,-17/-33 100 | 0.003,0.05 6 -47/-40,-34/-34,-17/-33 400 | 0.000625,0.0125 6 -47/-40,-34/-34,-15/-33 1600 | 0.0001,0.025 6 -47/-40,-34/-34,-31/-31,-0/-30 6400 | 0,0.025 6 -38/-31,-28/-28,-0/-25 22000")


```
 * */
class mcompand(
    val args : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mcompand] を参照してください */
fun String.mcompand(args : Any? = null) : mcompand {
    return mcompand(args, "", "").apply { setInputs(this@mcompand) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pan )](https://ffmpeg.org/ffmpeg-filters.html#pan)

```
Filter pan
Remix channels with coefficients (panning).
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
pan AVOptions:
args              <string>     ..F.A.....


```
 * */
class pan(
    val args : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pan] を参照してください */
fun String.pan(args : Any? = null) : pan {
    return pan(args, "", "").apply { setInputs(this@pan) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( replaygain )](https://ffmpeg.org/ffmpeg-filters.html#replaygain)

```
Filter replaygain
ReplayGain scanner.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class replaygain(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [replaygain] を参照してください */
fun String.replaygain() : replaygain {
    return replaygain("", "").apply { setInputs(this@replaygain) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sidechaincompress )](https://ffmpeg.org/ffmpeg-filters.html#sidechaincompress)

```
Filter sidechaincompress
Sidechain compressor.
Inputs:
#0: main (audio)
#1: sidechain (audio)
Outputs:
#0: default (audio)
sidechaincompress AVOptions:
level_in          <double>     ..F.A....T set input gain (from 0.015625 to 64) (default 1)
mode              <int>        ..F.A....T set mode (from 0 to 1) (default downward)
downward        0            ..F.A....T
upward          1            ..F.A....T
threshold         <double>     ..F.A....T set threshold (from 0.000976563 to 1) (default 0.125)
ratio             <double>     ..F.A....T set ratio (from 1 to 20) (default 2)
attack            <double>     ..F.A....T set attack (from 0.01 to 2000) (default 20)
release           <double>     ..F.A....T set release (from 0.01 to 9000) (default 250)
makeup            <double>     ..F.A....T set make up gain (from 1 to 64) (default 1)
knee              <double>     ..F.A....T set knee (from 1 to 8) (default 2.82843)
link              <int>        ..F.A....T set link type (from 0 to 1) (default average)
average         0            ..F.A....T
maximum         1            ..F.A....T
detection         <int>        ..F.A....T set detection (from 0 to 1) (default rms)
peak            0            ..F.A....T
rms             1            ..F.A....T
level_sc          <double>     ..F.A....T set sidechain gain (from 0.015625 to 64) (default 1)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)


```
 * */
class sidechaincompress(
    val level_in : Any? = null,
    val mode : Any? = null,
    val threshold : Any? = null,
    val ratio : Any? = null,
    val attack : Any? = null,
    val release : Any? = null,
    val makeup : Any? = null,
    val knee : Any? = null,
    val link : Any? = null,
    val detection : Any? = null,
    val level_sc : Any? = null,
    val mix : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sidechaincompress] を参照してください */
fun String.sidechaincompress(level_in : Any? = null, mode : Any? = null, threshold : Any? = null, ratio : Any? = null, attack : Any? = null, release : Any? = null, makeup : Any? = null, knee : Any? = null, link : Any? = null, detection : Any? = null, level_sc : Any? = null, mix : Any? = null) : sidechaincompress {
    return sidechaincompress(level_in, mode, threshold, ratio, attack, release, makeup, knee, link, detection, level_sc, mix, "", "").apply { setInputs(this@sidechaincompress) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sidechaingate )](https://ffmpeg.org/ffmpeg-filters.html#sidechaingate)

```
Filter sidechaingate
Audio sidechain gate.
Inputs:
#0: main (audio)
#1: sidechain (audio)
Outputs:
#0: default (audio)
sidechaingate AVOptions:
level_in          <double>     ..F.A..... set input level (from 0.015625 to 64) (default 1)
mode              <int>        ..F.A..... set mode (from 0 to 1) (default downward)
downward        0            ..F.A.....
upward          1            ..F.A.....
range             <double>     ..F.A..... set max gain reduction (from 0 to 1) (default 0.06125)
threshold         <double>     ..F.A..... set threshold (from 0 to 1) (default 0.125)
ratio             <double>     ..F.A..... set ratio (from 1 to 9000) (default 2)
attack            <double>     ..F.A..... set attack (from 0.01 to 9000) (default 20)
release           <double>     ..F.A..... set release (from 0.01 to 9000) (default 250)
makeup            <double>     ..F.A..... set makeup gain (from 1 to 64) (default 1)
knee              <double>     ..F.A..... set knee (from 1 to 8) (default 2.82843)
detection         <int>        ..F.A..... set detection (from 0 to 1) (default rms)
peak            0            ..F.A.....
rms             1            ..F.A.....
link              <int>        ..F.A..... set link (from 0 to 1) (default average)
average         0            ..F.A.....
maximum         1            ..F.A.....
level_sc          <double>     ..F.A..... set sidechain gain (from 0.015625 to 64) (default 1)


```
 * */
class sidechaingate(
    val level_in : Any? = null,
    val mode : Any? = null,
    val range : Any? = null,
    val threshold : Any? = null,
    val ratio : Any? = null,
    val attack : Any? = null,
    val release : Any? = null,
    val makeup : Any? = null,
    val knee : Any? = null,
    val detection : Any? = null,
    val link : Any? = null,
    val level_sc : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sidechaingate] を参照してください */
fun String.sidechaingate(level_in : Any? = null, mode : Any? = null, range : Any? = null, threshold : Any? = null, ratio : Any? = null, attack : Any? = null, release : Any? = null, makeup : Any? = null, knee : Any? = null, detection : Any? = null, link : Any? = null, level_sc : Any? = null) : sidechaingate {
    return sidechaingate(level_in, mode, range, threshold, ratio, attack, release, makeup, knee, detection, link, level_sc, "", "").apply { setInputs(this@sidechaingate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( silencedetect )](https://ffmpeg.org/ffmpeg-filters.html#silencedetect)

```
Filter silencedetect
Detect silence.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
silencedetect AVOptions:
n                 <double>     ..F.A..... set noise tolerance (from 0 to DBL_MAX) (default 0.001)
noise             <double>     ..F.A..... set noise tolerance (from 0 to DBL_MAX) (default 0.001)
d                 <duration>   ..F.A..... set minimum duration in seconds (default 2)
duration          <duration>   ..F.A..... set minimum duration in seconds (default 2)
mono              <boolean>    ..F.A..... check each channel separately (default false)
m                 <boolean>    ..F.A..... check each channel separately (default false)


```
 * */
class silencedetect(
    val n : Any? = null,
    val noise : Any? = null,
    val d : Any? = null,
    val duration : Any? = null,
    val mono : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [silencedetect] を参照してください */
fun String.silencedetect(n : Any? = null, noise : Any? = null, d : Any? = null, duration : Any? = null, mono : Any? = null, m : Any? = null) : silencedetect {
    return silencedetect(n, noise, d, duration, mono, m, "", "").apply { setInputs(this@silencedetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( silenceremove )](https://ffmpeg.org/ffmpeg-filters.html#silenceremove)

```
Filter silenceremove
Remove silence.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
silenceremove AVOptions:
start_periods     <int>        ..F.A..... (from 0 to 9000) (default 0)
start_duration    <duration>   ..F.A..... set start duration of non-silence part (default 0)
start_threshold   <double>     ..F.A..... set threshold for start silence detection (from 0 to DBL_MAX) (default 0)
start_silence     <duration>   ..F.A..... set start duration of silence part to keep (default 0)
start_mode        <int>        ..F.A..... set which channel will trigger trimming from start (from 0 to 1) (default any)
any             0            ..F.A.....
all             1            ..F.A.....
stop_periods      <int>        ..F.A..... (from -9000 to 9000) (default 0)
stop_duration     <duration>   ..F.A..... set stop duration of non-silence part (default 0)
stop_threshold    <double>     ..F.A..... set threshold for stop silence detection (from 0 to DBL_MAX) (default 0)
stop_silence      <duration>   ..F.A..... set stop duration of silence part to keep (default 0)
stop_mode         <int>        ..F.A..... set which channel will trigger trimming from end (from 0 to 1) (default any)
any             0            ..F.A.....
all             1            ..F.A.....
detection         <int>        ..F.A..... set how silence is detected (from 0 to 1) (default rms)
peak            0            ..F.A..... use absolute values of samples
rms             1            ..F.A..... use squared values of samples
window            <double>     ..F.A..... set duration of window in seconds (from 0 to 10) (default 0.02)


```
 * */
class silenceremove(
    val start_periods : Any? = null,
    val start_duration : Any? = null,
    val start_threshold : Any? = null,
    val start_silence : Any? = null,
    val start_mode : Any? = null,
    val stop_periods : Any? = null,
    val stop_duration : Any? = null,
    val stop_threshold : Any? = null,
    val stop_silence : Any? = null,
    val stop_mode : Any? = null,
    val detection : Any? = null,
    val window : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [silenceremove] を参照してください */
fun String.silenceremove(start_periods : Any? = null, start_duration : Any? = null, start_threshold : Any? = null, start_silence : Any? = null, start_mode : Any? = null, stop_periods : Any? = null, stop_duration : Any? = null, stop_threshold : Any? = null, stop_silence : Any? = null, stop_mode : Any? = null, detection : Any? = null, window : Any? = null) : silenceremove {
    return silenceremove(start_periods, start_duration, start_threshold, start_silence, start_mode, stop_periods, stop_duration, stop_threshold, stop_silence, stop_mode, detection, window, "", "").apply { setInputs(this@silenceremove) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sofalizer )](https://ffmpeg.org/ffmpeg-filters.html#sofalizer)

```
Filter sofalizer
SOFAlizer (Spatially Oriented Format for Acoustics).
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
sofalizer AVOptions:
sofa              <string>     ..F.A..... sofa filename
gain              <float>      ..F.A..... set gain in dB (from -20 to 40) (default 0)
rotation          <float>      ..F.A..... set rotation (from -360 to 360) (default 0)
elevation         <float>      ..F.A..... set elevation (from -90 to 90) (default 0)
radius            <float>      ..F.A..... set radius (from 0 to 5) (default 1)
type              <int>        ..F.A..... set processing (from 0 to 1) (default freq)
time            0            ..F.A..... time domain
freq            1            ..F.A..... frequency domain
speakers          <string>     ..F.A..... set speaker custom positions
lfegain           <float>      ..F.A..... set lfe gain (from -20 to 40) (default 0)
framesize         <int>        ..F.A..... set frame size (from 1024 to 96000) (default 1024)
normalize         <boolean>    ..F.A..... normalize IRs (default true)
interpolate       <boolean>    ..F.A..... interpolate IRs from neighbors (default false)
minphase          <boolean>    ..F.A..... minphase IRs (default false)
anglestep         <float>      ..F.A..... set neighbor search angle step (from 0.01 to 10) (default 0.5)
radstep           <float>      ..F.A..... set neighbor search radius step (from 0.01 to 1) (default 0.01)


```
 * */
class sofalizer(
    val sofa : Any? = null,
    val gain : Any? = null,
    val rotation : Any? = null,
    val elevation : Any? = null,
    val radius : Any? = null,
    val type : Any? = null,
    val speakers : Any? = null,
    val lfegain : Any? = null,
    val framesize : Any? = null,
    val normalize : Any? = null,
    val interpolate : Any? = null,
    val minphase : Any? = null,
    val anglestep : Any? = null,
    val radstep : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sofalizer] を参照してください */
fun String.sofalizer(sofa : Any? = null, gain : Any? = null, rotation : Any? = null, elevation : Any? = null, radius : Any? = null, type : Any? = null, speakers : Any? = null, lfegain : Any? = null, framesize : Any? = null, normalize : Any? = null, interpolate : Any? = null, minphase : Any? = null, anglestep : Any? = null, radstep : Any? = null) : sofalizer {
    return sofalizer(sofa, gain, rotation, elevation, radius, type, speakers, lfegain, framesize, normalize, interpolate, minphase, anglestep, radstep, "", "").apply { setInputs(this@sofalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( stereotools )](https://ffmpeg.org/ffmpeg-filters.html#stereotools)

```
Filter stereotools
Apply various stereo tools.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
stereotools AVOptions:
level_in          <double>     ..F.A..... set level in (from 0.015625 to 64) (default 1)
level_out         <double>     ..F.A..... set level out (from 0.015625 to 64) (default 1)
balance_in        <double>     ..F.A..... set balance in (from -1 to 1) (default 0)
balance_out       <double>     ..F.A..... set balance out (from -1 to 1) (default 0)
softclip          <boolean>    ..F.A..... enable softclip (default false)
mutel             <boolean>    ..F.A..... mute L (default false)
muter             <boolean>    ..F.A..... mute R (default false)
phasel            <boolean>    ..F.A..... phase L (default false)
phaser            <boolean>    ..F.A..... phase R (default false)
mode              <int>        ..F.A..... set stereo mode (from 0 to 8) (default lr>lr)
lr>lr           0            ..F.A.....
lr>ms           1            ..F.A.....
ms>lr           2            ..F.A.....
lr>ll           3            ..F.A.....
lr>rr           4            ..F.A.....
lr>l+r          5            ..F.A.....
lr>rl           6            ..F.A.....
ms>ll           7            ..F.A.....
ms>rr           8            ..F.A.....
slev              <double>     ..F.A..... set side level (from 0.015625 to 64) (default 1)
sbal              <double>     ..F.A..... set side balance (from -1 to 1) (default 0)
mlev              <double>     ..F.A..... set middle level (from 0.015625 to 64) (default 1)
mpan              <double>     ..F.A..... set middle pan (from -1 to 1) (default 0)
base              <double>     ..F.A..... set stereo base (from -1 to 1) (default 0)
delay             <double>     ..F.A..... set delay (from -20 to 20) (default 0)
sclevel           <double>     ..F.A..... set S/C level (from 1 to 100) (default 1)
phase             <double>     ..F.A..... set stereo phase (from 0 to 360) (default 0)
bmode_in          <int>        ..F.A..... set balance in mode (from 0 to 2) (default balance)
balance         0            ..F.A.....
amplitude       1            ..F.A.....
power           2            ..F.A.....
bmode_out         <int>        ..F.A..... set balance out mode (from 0 to 2) (default balance)
balance         0            ..F.A.....
amplitude       1            ..F.A.....
power           2            ..F.A.....


```
 * */
class stereotools(
    val level_in : Any? = null,
    val level_out : Any? = null,
    val balance_in : Any? = null,
    val balance_out : Any? = null,
    val softclip : Any? = null,
    val mutel : Any? = null,
    val muter : Any? = null,
    val phasel : Any? = null,
    val phaser : Any? = null,
    val mode : Any? = null,
    val slev : Any? = null,
    val sbal : Any? = null,
    val mlev : Any? = null,
    val mpan : Any? = null,
    val base : Any? = null,
    val delay : Any? = null,
    val sclevel : Any? = null,
    val phase : Any? = null,
    val bmode_in : Any? = null,
    val bmode_out : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [stereotools] を参照してください */
fun String.stereotools(level_in : Any? = null, level_out : Any? = null, balance_in : Any? = null, balance_out : Any? = null, softclip : Any? = null, mutel : Any? = null, muter : Any? = null, phasel : Any? = null, phaser : Any? = null, mode : Any? = null, slev : Any? = null, sbal : Any? = null, mlev : Any? = null, mpan : Any? = null, base : Any? = null, delay : Any? = null, sclevel : Any? = null, phase : Any? = null, bmode_in : Any? = null, bmode_out : Any? = null) : stereotools {
    return stereotools(level_in, level_out, balance_in, balance_out, softclip, mutel, muter, phasel, phaser, mode, slev, sbal, mlev, mpan, base, delay, sclevel, phase, bmode_in, bmode_out, "", "").apply { setInputs(this@stereotools) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( stereowiden )](https://ffmpeg.org/ffmpeg-filters.html#stereowiden)

```
Filter stereowiden
Apply stereo widening effect.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
stereowiden AVOptions:
delay             <float>      ..F.A..... set delay time (from 1 to 100) (default 20)
feedback          <float>      ..F.A....T set feedback gain (from 0 to 0.9) (default 0.3)
crossfeed         <float>      ..F.A....T set cross feed (from 0 to 0.8) (default 0.3)
drymix            <float>      ..F.A....T set dry-mix (from 0 to 1) (default 0.8)

This filter has support for timeline through the 'enable' option.

```
 * */
class stereowiden(
    val delay : Any? = null,
    val feedback : Any? = null,
    val crossfeed : Any? = null,
    val drymix : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [stereowiden] を参照してください */
fun String.stereowiden(delay : Any? = null, feedback : Any? = null, crossfeed : Any? = null, drymix : Any? = null) : stereowiden {
    return stereowiden(delay, feedback, crossfeed, drymix, "", "").apply { setInputs(this@stereowiden) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( superequalizer )](https://ffmpeg.org/ffmpeg-filters.html#superequalizer)

```
Filter superequalizer
Apply 18 band equalization filter.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
superequalizer AVOptions:
1b                <float>      ..F.A..... set 65Hz band gain (from 0 to 20) (default 1)
2b                <float>      ..F.A..... set 92Hz band gain (from 0 to 20) (default 1)
3b                <float>      ..F.A..... set 131Hz band gain (from 0 to 20) (default 1)
4b                <float>      ..F.A..... set 185Hz band gain (from 0 to 20) (default 1)
5b                <float>      ..F.A..... set 262Hz band gain (from 0 to 20) (default 1)
6b                <float>      ..F.A..... set 370Hz band gain (from 0 to 20) (default 1)
7b                <float>      ..F.A..... set 523Hz band gain (from 0 to 20) (default 1)
8b                <float>      ..F.A..... set 740Hz band gain (from 0 to 20) (default 1)
9b                <float>      ..F.A..... set 1047Hz band gain (from 0 to 20) (default 1)
10b               <float>      ..F.A..... set 1480Hz band gain (from 0 to 20) (default 1)
11b               <float>      ..F.A..... set 2093Hz band gain (from 0 to 20) (default 1)
12b               <float>      ..F.A..... set 2960Hz band gain (from 0 to 20) (default 1)
13b               <float>      ..F.A..... set 4186Hz band gain (from 0 to 20) (default 1)
14b               <float>      ..F.A..... set 5920Hz band gain (from 0 to 20) (default 1)
15b               <float>      ..F.A..... set 8372Hz band gain (from 0 to 20) (default 1)
16b               <float>      ..F.A..... set 11840Hz band gain (from 0 to 20) (default 1)
17b               <float>      ..F.A..... set 16744Hz band gain (from 0 to 20) (default 1)
18b               <float>      ..F.A..... set 20000Hz band gain (from 0 to 20) (default 1)


```
 * */
class superequalizer(
    val _1b : Any? = null,
    val _2b : Any? = null,
    val _3b : Any? = null,
    val _4b : Any? = null,
    val _5b : Any? = null,
    val _6b : Any? = null,
    val _7b : Any? = null,
    val _8b : Any? = null,
    val _9b : Any? = null,
    val _10b : Any? = null,
    val _11b : Any? = null,
    val _12b : Any? = null,
    val _13b : Any? = null,
    val _14b : Any? = null,
    val _15b : Any? = null,
    val _16b : Any? = null,
    val _17b : Any? = null,
    val _18b : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [superequalizer] を参照してください */
fun String.superequalizer(_1b : Any? = null, _2b : Any? = null, _3b : Any? = null, _4b : Any? = null, _5b : Any? = null, _6b : Any? = null, _7b : Any? = null, _8b : Any? = null, _9b : Any? = null, _10b : Any? = null, _11b : Any? = null, _12b : Any? = null, _13b : Any? = null, _14b : Any? = null, _15b : Any? = null, _16b : Any? = null, _17b : Any? = null, _18b : Any? = null) : superequalizer {
    return superequalizer(_1b, _2b, _3b, _4b, _5b, _6b, _7b, _8b, _9b, _10b, _11b, _12b, _13b, _14b, _15b, _16b, _17b, _18b, "", "").apply { setInputs(this@superequalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( surround )](https://ffmpeg.org/ffmpeg-filters.html#surround)

```
Filter surround
Apply audio surround upmix filter.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
surround AVOptions:
chl_out           <string>     ..F.A..... set output channel layout (default "5.1")
chl_in            <string>     ..F.A..... set input channel layout (default "stereo")
level_in          <float>      ..F.A..... set input level (from 0 to 10) (default 1)
level_out         <float>      ..F.A..... set output level (from 0 to 10) (default 1)
lfe               <boolean>    ..F.A..... output LFE (default true)
lfe_low           <int>        ..F.A..... LFE low cut off (from 0 to 256) (default 128)
lfe_high          <int>        ..F.A..... LFE high cut off (from 0 to 512) (default 256)
lfe_mode          <int>        ..F.A..... set LFE channel mode (from 0 to 1) (default add)
add             0            ..F.A..... just add LFE channel
sub             1            ..F.A..... substract LFE channel with others
angle             <float>      ..F.A..... set soundfield transform angle (from 0 to 360) (default 90)
fc_in             <float>      ..F.A..... set front center channel input level (from 0 to 10) (default 1)
fc_out            <float>      ..F.A..... set front center channel output level (from 0 to 10) (default 1)
fl_in             <float>      ..F.A..... set front left channel input level (from 0 to 10) (default 1)
fl_out            <float>      ..F.A..... set front left channel output level (from 0 to 10) (default 1)
fr_in             <float>      ..F.A..... set front right channel input level (from 0 to 10) (default 1)
fr_out            <float>      ..F.A..... set front right channel output level (from 0 to 10) (default 1)
sl_in             <float>      ..F.A..... set side left channel input level (from 0 to 10) (default 1)
sl_out            <float>      ..F.A..... set side left channel output level (from 0 to 10) (default 1)
sr_in             <float>      ..F.A..... set side right channel input level (from 0 to 10) (default 1)
sr_out            <float>      ..F.A..... set side right channel output level (from 0 to 10) (default 1)
bl_in             <float>      ..F.A..... set back left channel input level (from 0 to 10) (default 1)
bl_out            <float>      ..F.A..... set back left channel output level (from 0 to 10) (default 1)
br_in             <float>      ..F.A..... set back right channel input level (from 0 to 10) (default 1)
br_out            <float>      ..F.A..... set back right channel output level (from 0 to 10) (default 1)
bc_in             <float>      ..F.A..... set back center channel input level (from 0 to 10) (default 1)
bc_out            <float>      ..F.A..... set back center channel output level (from 0 to 10) (default 1)
lfe_in            <float>      ..F.A..... set lfe channel input level (from 0 to 10) (default 1)
lfe_out           <float>      ..F.A..... set lfe channel output level (from 0 to 10) (default 1)
allx              <float>      ..F.A..... set all channel's x spread (from -1 to 15) (default -1)
ally              <float>      ..F.A..... set all channel's y spread (from -1 to 15) (default -1)
fcx               <float>      ..F.A..... set front center channel x spread (from 0 to 15) (default 1)
flx               <float>      ..F.A..... set front left channel x spread (from 0 to 15) (default 1)
frx               <float>      ..F.A..... set front right channel x spread (from 0 to 15) (default 1)
blx               <float>      ..F.A..... set back left channel x spread (from 0 to 15) (default 1)
brx               <float>      ..F.A..... set back right channel x spread (from 0 to 15) (default 1)
slx               <float>      ..F.A..... set side left channel x spread (from 0 to 15) (default 1)
srx               <float>      ..F.A..... set side right channel x spread (from 0 to 15) (default 1)
bcx               <float>      ..F.A..... set back center channel x spread (from 0 to 15) (default 1)
fcy               <float>      ..F.A..... set front center channel y spread (from 0 to 15) (default 1)
fly               <float>      ..F.A..... set front left channel y spread (from 0 to 15) (default 1)
fry               <float>      ..F.A..... set front right channel y spread (from 0 to 15) (default 1)
bly               <float>      ..F.A..... set back left channel y spread (from 0 to 15) (default 1)
bry               <float>      ..F.A..... set back right channel y spread (from 0 to 15) (default 1)
sly               <float>      ..F.A..... set side left channel y spread (from 0 to 15) (default 1)
sry               <float>      ..F.A..... set side right channel y spread (from 0 to 15) (default 1)
bcy               <float>      ..F.A..... set back center channel y spread (from 0 to 15) (default 1)
win_size          <int>        ..F.A..... set window size (from 1024 to 65536) (default 4096)
win_func          <int>        ..F.A..... set window function (from 0 to 19) (default hann)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hann            1            ..F.A..... Hann
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
blackman        3            ..F.A..... Blackman
welch           5            ..F.A..... Welch
flattop         6            ..F.A..... Flat-top
bharris         7            ..F.A..... Blackman-Harris
bnuttall        8            ..F.A..... Blackman-Nuttall
bhann           11           ..F.A..... Bartlett-Hann
sine            9            ..F.A..... Sine
nuttall         10           ..F.A..... Nuttall
lanczos         12           ..F.A..... Lanczos
gauss           13           ..F.A..... Gauss
tukey           14           ..F.A..... Tukey
dolph           15           ..F.A..... Dolph-Chebyshev
cauchy          16           ..F.A..... Cauchy
parzen          17           ..F.A..... Parzen
poisson         18           ..F.A..... Poisson
bohman          19           ..F.A..... Bohman
overlap           <float>      ..F.A..... set window overlap (from 0 to 1) (default 0.5)


```
 * */
class surround(
    val chl_out : Any? = null,
    val chl_in : Any? = null,
    val level_in : Any? = null,
    val level_out : Any? = null,
    val lfe : Any? = null,
    val lfe_low : Any? = null,
    val lfe_high : Any? = null,
    val lfe_mode : Any? = null,
    val angle : Any? = null,
    val fc_in : Any? = null,
    val fc_out : Any? = null,
    val fl_in : Any? = null,
    val fl_out : Any? = null,
    val fr_in : Any? = null,
    val fr_out : Any? = null,
    val sl_in : Any? = null,
    val sl_out : Any? = null,
    val sr_in : Any? = null,
    val sr_out : Any? = null,
    val bl_in : Any? = null,
    val bl_out : Any? = null,
    val br_in : Any? = null,
    val br_out : Any? = null,
    val bc_in : Any? = null,
    val bc_out : Any? = null,
    val lfe_in : Any? = null,
    val lfe_out : Any? = null,
    val allx : Any? = null,
    val ally : Any? = null,
    val fcx : Any? = null,
    val flx : Any? = null,
    val frx : Any? = null,
    val blx : Any? = null,
    val brx : Any? = null,
    val slx : Any? = null,
    val srx : Any? = null,
    val bcx : Any? = null,
    val fcy : Any? = null,
    val fly : Any? = null,
    val fry : Any? = null,
    val bly : Any? = null,
    val bry : Any? = null,
    val sly : Any? = null,
    val sry : Any? = null,
    val bcy : Any? = null,
    val win_size : Any? = null,
    val win_func : Any? = null,
    val overlap : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [surround] を参照してください */
fun String.surround(chl_out : Any? = null, chl_in : Any? = null, level_in : Any? = null, level_out : Any? = null, lfe : Any? = null, lfe_low : Any? = null, lfe_high : Any? = null, lfe_mode : Any? = null, angle : Any? = null, fc_in : Any? = null, fc_out : Any? = null, fl_in : Any? = null, fl_out : Any? = null, fr_in : Any? = null, fr_out : Any? = null, sl_in : Any? = null, sl_out : Any? = null, sr_in : Any? = null, sr_out : Any? = null, bl_in : Any? = null, bl_out : Any? = null, br_in : Any? = null, br_out : Any? = null, bc_in : Any? = null, bc_out : Any? = null, lfe_in : Any? = null, lfe_out : Any? = null, allx : Any? = null, ally : Any? = null, fcx : Any? = null, flx : Any? = null, frx : Any? = null, blx : Any? = null, brx : Any? = null, slx : Any? = null, srx : Any? = null, bcx : Any? = null, fcy : Any? = null, fly : Any? = null, fry : Any? = null, bly : Any? = null, bry : Any? = null, sly : Any? = null, sry : Any? = null, bcy : Any? = null, win_size : Any? = null, win_func : Any? = null, overlap : Any? = null) : surround {
    return surround(chl_out, chl_in, level_in, level_out, lfe, lfe_low, lfe_high, lfe_mode, angle, fc_in, fc_out, fl_in, fl_out, fr_in, fr_out, sl_in, sl_out, sr_in, sr_out, bl_in, bl_out, br_in, br_out, bc_in, bc_out, lfe_in, lfe_out, allx, ally, fcx, flx, frx, blx, brx, slx, srx, bcx, fcy, fly, fry, bly, bry, sly, sry, bcy, win_size, win_func, overlap, "", "").apply { setInputs(this@surround) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( treble )](https://ffmpeg.org/ffmpeg-filters.html#treble)

```
Filter treble
Boost or cut upper frequencies.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
treble AVOptions:
frequency         <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
f                 <double>     ..F.A....T set central frequency (from 0 to 999999) (default 3000)
width_type        <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
t                 <int>        ..F.A....T set filter-width type (from 1 to 5) (default q)
h               1            ..F.A....T Hz
q               3            ..F.A....T Q-Factor
o               2            ..F.A....T octave
s               4            ..F.A....T slope
k               5            ..F.A....T kHz
width             <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
w                 <double>     ..F.A....T set shelf transition steep (from 0 to 99999) (default 0.5)
gain              <double>     ..F.A....T set gain (from -900 to 900) (default 0)
g                 <double>     ..F.A....T set gain (from -900 to 900) (default 0)
mix               <double>     ..F.A....T set mix (from 0 to 1) (default 1)
m                 <double>     ..F.A....T set mix (from 0 to 1) (default 1)
channels          <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
c                 <channel_layout> ..F.A....T set channels to filter (default 0xffffffffffffffff)
normalize         <boolean>    ..F.A....T normalize coefficients (default false)
n                 <boolean>    ..F.A....T normalize coefficients (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class treble(
    val frequency : Any? = null,
    val width_type : Any? = null,
    val width : Any? = null,
    val gain : Any? = null,
    val mix : Any? = null,
    val channels : Any? = null,
    val normalize : Any? = null,
    val f : Any? = null,
    val t : Any? = null,
    val w : Any? = null,
    val g : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [treble] を参照してください */
fun String.treble(frequency : Any? = null, width_type : Any? = null, width : Any? = null, gain : Any? = null, mix : Any? = null, channels : Any? = null, normalize : Any? = null, f : Any? = null, t : Any? = null, w : Any? = null, g : Any? = null, m : Any? = null, c : Any? = null, n : Any? = null) : treble {
    return treble(frequency, width_type, width, gain, mix, channels, normalize, f, t, w, g, m, c, n, "", "").apply { setInputs(this@treble) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tremolo )](https://ffmpeg.org/ffmpeg-filters.html#tremolo)

```
Filter tremolo
Apply tremolo effect.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
tremolo AVOptions:
f                 <double>     ..F.A..... set frequency in hertz (from 0.1 to 20000) (default 5)
d                 <double>     ..F.A..... set depth as percentage (from 0 to 1) (default 0.5)


```
 * */
class tremolo(
    val f : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tremolo] を参照してください */
fun String.tremolo(f : Any? = null, d : Any? = null) : tremolo {
    return tremolo(f, d, "", "").apply { setInputs(this@tremolo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vibrato )](https://ffmpeg.org/ffmpeg-filters.html#vibrato)

```
Filter vibrato
Apply vibrato effect.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
vibrato AVOptions:
f                 <double>     ..F.A..... set frequency in hertz (from 0.1 to 20000) (default 5)
d                 <double>     ..F.A..... set depth as percentage (from 0 to 1) (default 0.5)


```
 * */
class vibrato(
    val f : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vibrato] を参照してください */
fun String.vibrato(f : Any? = null, d : Any? = null) : vibrato {
    return vibrato(f, d, "", "").apply { setInputs(this@vibrato) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( volume )](https://ffmpeg.org/ffmpeg-filters.html#volume)

```
Filter volume
Change input volume.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)
volume AVOptions:
volume            <string>     ..F.A....T set volume adjustment expression (default "1.0")
precision         <int>        ..F.A..... select mathematical precision (from 0 to 2) (default float)
fixed           0            ..F.A..... select 8-bit fixed-point
float           1            ..F.A..... select 32-bit floating-point
double          2            ..F.A..... select 64-bit floating-point
eval              <int>        ..F.A..... specify when to evaluate expressions (from 0 to 1) (default once)
once            0            ..F.A..... eval volume expression once
frame           1            ..F.A..... eval volume expression per-frame
replaygain        <int>        ..F.A..... Apply replaygain side data when present (from 0 to 3) (default drop)
drop            0            ..F.A..... replaygain side data is dropped
ignore          1            ..F.A..... replaygain side data is ignored
track           2            ..F.A..... track gain is preferred
album           3            ..F.A..... album gain is preferred
replaygain_preamp <double>     ..F.A..... Apply replaygain pre-amplification (from -15 to 15) (default 0)
replaygain_noclip <boolean>    ..F.A..... Apply replaygain clipping prevention (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class volume(
    val volume : Any? = null,
    val precision : Any? = null,
    val eval : Any? = null,
    val replaygain : Any? = null,
    val replaygain_preamp : Any? = null,
    val replaygain_noclip : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [volume] を参照してください */
fun String.volume(volume : Any? = null, precision : Any? = null, eval : Any? = null, replaygain : Any? = null, replaygain_preamp : Any? = null, replaygain_noclip : Any? = null) : volume {
    return volume(volume, precision, eval, replaygain, replaygain_preamp, replaygain_noclip, "", "").apply { setInputs(this@volume) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( volumedetect )](https://ffmpeg.org/ffmpeg-filters.html#volumedetect)

```
Filter volumedetect
Detect audio volume.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class volumedetect(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [volumedetect] を参照してください */
fun String.volumedetect() : volumedetect {
    return volumedetect("", "").apply { setInputs(this@volumedetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aevalsrc )](https://ffmpeg.org/ffmpeg-filters.html#aevalsrc)

```
Filter aevalsrc
Generate an audio signal generated by an expression.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
aevalsrc AVOptions:
exprs             <string>     ..F.A..... set the '|'-separated list of channels expressions
nb_samples        <int>        ..F.A..... set the number of samples per requested frame (from 0 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of samples per requested frame (from 0 to INT_MAX) (default 1024)
sample_rate       <string>     ..F.A..... set the sample rate (default "44100")
s                 <string>     ..F.A..... set the sample rate (default "44100")
duration          <duration>   ..F.A..... set audio duration (default -0.000001)
d                 <duration>   ..F.A..... set audio duration (default -0.000001)
channel_layout    <string>     ..F.A..... set channel layout
c                 <string>     ..F.A..... set channel layout


```
 * */
class aevalsrc(
    val exprs : Any? = null,
    val nb_samples : Any? = null,
    val sample_rate : Any? = null,
    val duration : Any? = null,
    val channel_layout : Any? = null,
    val n : Any? = null,
    val s : Any? = null,
    val d : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aevalsrc] を参照してください */
fun String.aevalsrc(exprs : Any? = null, nb_samples : Any? = null, sample_rate : Any? = null, duration : Any? = null, channel_layout : Any? = null, n : Any? = null, s : Any? = null, d : Any? = null, c : Any? = null) : aevalsrc {
    return aevalsrc(exprs, nb_samples, sample_rate, duration, channel_layout, n, s, d, c, "", "").apply { setInputs(this@aevalsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( afirsrc )](https://ffmpeg.org/ffmpeg-filters.html#afirsrc)

```
Filter afirsrc
Generate a FIR coefficients audio stream.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
afirsrc AVOptions:
taps              <int>        ..F.A..... set number of taps (from 9 to 65535) (default 1025)
t                 <int>        ..F.A..... set number of taps (from 9 to 65535) (default 1025)
frequency         <string>     ..F.A..... set frequency points (default "0 1")
f                 <string>     ..F.A..... set frequency points (default "0 1")
magnitude         <string>     ..F.A..... set magnitude values (default "1 1")
m                 <string>     ..F.A..... set magnitude values (default "1 1")
phase             <string>     ..F.A..... set phase values (default "0 0")
p                 <string>     ..F.A..... set phase values (default "0 0")
sample_rate       <int>        ..F.A..... set sample rate (from 1 to INT_MAX) (default 44100)
r                 <int>        ..F.A..... set sample rate (from 1 to INT_MAX) (default 44100)
nb_samples        <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
win_func          <int>        ..F.A..... set window function (from 0 to 19) (default blackman)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
blackman        3            ..F.A..... Blackman
welch           5            ..F.A..... Welch
flattop         6            ..F.A..... Flat-top
bharris         7            ..F.A..... Blackman-Harris
bnuttall        8            ..F.A..... Blackman-Nuttall
bhann           11           ..F.A..... Bartlett-Hann
sine            9            ..F.A..... Sine
nuttall         10           ..F.A..... Nuttall
lanczos         12           ..F.A..... Lanczos
gauss           13           ..F.A..... Gauss
tukey           14           ..F.A..... Tukey
dolph           15           ..F.A..... Dolph-Chebyshev
cauchy          16           ..F.A..... Cauchy
parzen          17           ..F.A..... Parzen
poisson         18           ..F.A..... Poisson
bohman          19           ..F.A..... Bohman
w                 <int>        ..F.A..... set window function (from 0 to 19) (default blackman)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
blackman        3            ..F.A..... Blackman
welch           5            ..F.A..... Welch
flattop         6            ..F.A..... Flat-top
bharris         7            ..F.A..... Blackman-Harris
bnuttall        8            ..F.A..... Blackman-Nuttall
bhann           11           ..F.A..... Bartlett-Hann
sine            9            ..F.A..... Sine
nuttall         10           ..F.A..... Nuttall
lanczos         12           ..F.A..... Lanczos
gauss           13           ..F.A..... Gauss
tukey           14           ..F.A..... Tukey
dolph           15           ..F.A..... Dolph-Chebyshev
cauchy          16           ..F.A..... Cauchy
parzen          17           ..F.A..... Parzen
poisson         18           ..F.A..... Poisson
bohman          19           ..F.A..... Bohman


```
 * */
class afirsrc(
    val taps : Any? = null,
    val frequency : Any? = null,
    val magnitude : Any? = null,
    val phase : Any? = null,
    val sample_rate : Any? = null,
    val nb_samples : Any? = null,
    val win_func : Any? = null,
    val t : Any? = null,
    val f : Any? = null,
    val m : Any? = null,
    val p : Any? = null,
    val r : Any? = null,
    val n : Any? = null,
    val w : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [afirsrc] を参照してください */
fun String.afirsrc(taps : Any? = null, frequency : Any? = null, magnitude : Any? = null, phase : Any? = null, sample_rate : Any? = null, nb_samples : Any? = null, win_func : Any? = null, t : Any? = null, f : Any? = null, m : Any? = null, p : Any? = null, r : Any? = null, n : Any? = null, w : Any? = null) : afirsrc {
    return afirsrc(taps, frequency, magnitude, phase, sample_rate, nb_samples, win_func, t, f, m, p, r, n, w, "", "").apply { setInputs(this@afirsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anoisesrc )](https://ffmpeg.org/ffmpeg-filters.html#anoisesrc)

```
Filter anoisesrc
Generate a noise audio signal.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
anoisesrc AVOptions:
sample_rate       <int>        ..F.A..... set sample rate (from 15 to INT_MAX) (default 48000)
r                 <int>        ..F.A..... set sample rate (from 15 to INT_MAX) (default 48000)
amplitude         <double>     ..F.A..... set amplitude (from 0 to 1) (default 1)
a                 <double>     ..F.A..... set amplitude (from 0 to 1) (default 1)
duration          <duration>   ..F.A..... set duration (default 0)
d                 <duration>   ..F.A..... set duration (default 0)
color             <int>        ..F.A..... set noise color (from 0 to 5) (default white)
white           0            ..F.A.....
pink            1            ..F.A.....
brown           2            ..F.A.....
blue            3            ..F.A.....
violet          4            ..F.A.....
velvet          5            ..F.A.....
colour            <int>        ..F.A..... set noise color (from 0 to 5) (default white)
white           0            ..F.A.....
pink            1            ..F.A.....
brown           2            ..F.A.....
blue            3            ..F.A.....
violet          4            ..F.A.....
velvet          5            ..F.A.....
c                 <int>        ..F.A..... set noise color (from 0 to 5) (default white)
white           0            ..F.A.....
pink            1            ..F.A.....
brown           2            ..F.A.....
blue            3            ..F.A.....
violet          4            ..F.A.....
velvet          5            ..F.A.....
seed              <int64>      ..F.A..... set random seed (from -1 to UINT32_MAX) (default -1)
s                 <int64>      ..F.A..... set random seed (from -1 to UINT32_MAX) (default -1)
nb_samples        <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)


```
 * */
class anoisesrc(
    val sample_rate : Any? = null,
    val amplitude : Any? = null,
    val duration : Any? = null,
    val color : Any? = null,
    val colour : Any? = null,
    val seed : Any? = null,
    val nb_samples : Any? = null,
    val r : Any? = null,
    val a : Any? = null,
    val d : Any? = null,
    val c : Any? = null,
    val s : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anoisesrc] を参照してください */
fun String.anoisesrc(sample_rate : Any? = null, amplitude : Any? = null, duration : Any? = null, color : Any? = null, colour : Any? = null, seed : Any? = null, nb_samples : Any? = null, r : Any? = null, a : Any? = null, d : Any? = null, c : Any? = null, s : Any? = null, n : Any? = null) : anoisesrc {
    return anoisesrc(sample_rate, amplitude, duration, color, colour, seed, nb_samples, r, a, d, c, s, n, "", "").apply { setInputs(this@anoisesrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anullsrc )](https://ffmpeg.org/ffmpeg-filters.html#anullsrc)

```
Filter anullsrc
Null audio source, return empty audio frames.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
anullsrc AVOptions:
channel_layout    <string>     ..F.A..... set channel_layout (default "stereo")
cl                <string>     ..F.A..... set channel_layout (default "stereo")
sample_rate       <string>     ..F.A..... set sample rate (default "44100")
r                 <string>     ..F.A..... set sample rate (default "44100")
nb_samples        <int>        ..F.A..... set the number of samples per requested frame (from 0 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of samples per requested frame (from 0 to INT_MAX) (default 1024)


```
 * */
class anullsrc(
    val channel_layout : Any? = null,
    val sample_rate : Any? = null,
    val nb_samples : Any? = null,
    val cl : Any? = null,
    val r : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anullsrc] を参照してください */
fun String.anullsrc(channel_layout : Any? = null, sample_rate : Any? = null, nb_samples : Any? = null, cl : Any? = null, r : Any? = null, n : Any? = null) : anullsrc {
    return anullsrc(channel_layout, sample_rate, nb_samples, cl, r, n, "", "").apply { setInputs(this@anullsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hilbert )](https://ffmpeg.org/ffmpeg-filters.html#hilbert)

```
Filter hilbert
Generate a Hilbert transform FIR coefficients.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
hilbert AVOptions:
sample_rate       <int>        ..F.A..... set sample rate (from 1 to INT_MAX) (default 44100)
r                 <int>        ..F.A..... set sample rate (from 1 to INT_MAX) (default 44100)
taps              <int>        ..F.A..... set number of taps (from 11 to 65535) (default 22051)
t                 <int>        ..F.A..... set number of taps (from 11 to 65535) (default 22051)
nb_samples        <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
win_func          <int>        ..F.A..... set window function (from 0 to 19) (default blackman)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
blackman        3            ..F.A..... Blackman
welch           5            ..F.A..... Welch
flattop         6            ..F.A..... Flat-top
bharris         7            ..F.A..... Blackman-Harris
bnuttall        8            ..F.A..... Blackman-Nuttall
bhann           11           ..F.A..... Bartlett-Hann
sine            9            ..F.A..... Sine
nuttall         10           ..F.A..... Nuttall
lanczos         12           ..F.A..... Lanczos
gauss           13           ..F.A..... Gauss
tukey           14           ..F.A..... Tukey
dolph           15           ..F.A..... Dolph-Chebyshev
cauchy          16           ..F.A..... Cauchy
parzen          17           ..F.A..... Parzen
poisson         18           ..F.A..... Poisson
bohman          19           ..F.A..... Bohman
w                 <int>        ..F.A..... set window function (from 0 to 19) (default blackman)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
blackman        3            ..F.A..... Blackman
welch           5            ..F.A..... Welch
flattop         6            ..F.A..... Flat-top
bharris         7            ..F.A..... Blackman-Harris
bnuttall        8            ..F.A..... Blackman-Nuttall
bhann           11           ..F.A..... Bartlett-Hann
sine            9            ..F.A..... Sine
nuttall         10           ..F.A..... Nuttall
lanczos         12           ..F.A..... Lanczos
gauss           13           ..F.A..... Gauss
tukey           14           ..F.A..... Tukey
dolph           15           ..F.A..... Dolph-Chebyshev
cauchy          16           ..F.A..... Cauchy
parzen          17           ..F.A..... Parzen
poisson         18           ..F.A..... Poisson
bohman          19           ..F.A..... Bohman


```
 * */
class hilbert(
    val sample_rate : Any? = null,
    val taps : Any? = null,
    val nb_samples : Any? = null,
    val win_func : Any? = null,
    val r : Any? = null,
    val t : Any? = null,
    val n : Any? = null,
    val w : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hilbert] を参照してください */
fun String.hilbert(sample_rate : Any? = null, taps : Any? = null, nb_samples : Any? = null, win_func : Any? = null, r : Any? = null, t : Any? = null, n : Any? = null, w : Any? = null) : hilbert {
    return hilbert(sample_rate, taps, nb_samples, win_func, r, t, n, w, "", "").apply { setInputs(this@hilbert) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sinc )](https://ffmpeg.org/ffmpeg-filters.html#sinc)

```
Filter sinc
Generate a sinc kaiser-windowed low-pass, high-pass, band-pass, or band-reject FIR coefficients.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
sinc AVOptions:
sample_rate       <int>        ..F.A..... set sample rate (from 1 to INT_MAX) (default 44100)
r                 <int>        ..F.A..... set sample rate (from 1 to INT_MAX) (default 44100)
nb_samples        <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
n                 <int>        ..F.A..... set the number of samples per requested frame (from 1 to INT_MAX) (default 1024)
hp                <float>      ..F.A..... set high-pass filter frequency (from 0 to INT_MAX) (default 0)
lp                <float>      ..F.A..... set low-pass filter frequency (from 0 to INT_MAX) (default 0)
phase             <float>      ..F.A..... set filter phase response (from 0 to 100) (default 50)
beta              <float>      ..F.A..... set kaiser window beta (from -1 to 256) (default -1)
att               <float>      ..F.A..... set stop-band attenuation (from 40 to 180) (default 120)
round             <boolean>    ..F.A..... enable rounding (default false)
hptaps            <int>        ..F.A..... set number of taps for high-pass filter (from 0 to 32768) (default 0)
lptaps            <int>        ..F.A..... set number of taps for low-pass filter (from 0 to 32768) (default 0)


```
 * */
class sinc(
    val sample_rate : Any? = null,
    val nb_samples : Any? = null,
    val hp : Any? = null,
    val lp : Any? = null,
    val phase : Any? = null,
    val beta : Any? = null,
    val att : Any? = null,
    val round : Any? = null,
    val hptaps : Any? = null,
    val lptaps : Any? = null,
    val r : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sinc] を参照してください */
fun String.sinc(sample_rate : Any? = null, nb_samples : Any? = null, hp : Any? = null, lp : Any? = null, phase : Any? = null, beta : Any? = null, att : Any? = null, round : Any? = null, hptaps : Any? = null, lptaps : Any? = null, r : Any? = null, n : Any? = null) : sinc {
    return sinc(sample_rate, nb_samples, hp, lp, phase, beta, att, round, hptaps, lptaps, r, n, "", "").apply { setInputs(this@sinc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sine )](https://ffmpeg.org/ffmpeg-filters.html#sine)

```
Filter sine
Generate sine wave audio signal.
Inputs:
none (source filter)
Outputs:
#0: default (audio)
sine AVOptions:
frequency         <double>     ..F.A..... set the sine frequency (from 0 to DBL_MAX) (default 440)
f                 <double>     ..F.A..... set the sine frequency (from 0 to DBL_MAX) (default 440)
beep_factor       <double>     ..F.A..... set the beep frequency factor (from 0 to DBL_MAX) (default 0)
b                 <double>     ..F.A..... set the beep frequency factor (from 0 to DBL_MAX) (default 0)
sample_rate       <int>        ..F.A..... set the sample rate (from 1 to INT_MAX) (default 44100)
r                 <int>        ..F.A..... set the sample rate (from 1 to INT_MAX) (default 44100)
duration          <duration>   ..F.A..... set the audio duration (default 0)
d                 <duration>   ..F.A..... set the audio duration (default 0)
samples_per_frame <string>     ..F.A..... set the number of samples per frame (default "1024")


```
 * */
class sine(
    val frequency : Any? = null,
    val beep_factor : Any? = null,
    val sample_rate : Any? = null,
    val duration : Any? = null,
    val samples_per_frame : Any? = null,
    val f : Any? = null,
    val b : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sine] を参照してください */
fun String.sine(frequency : Any? = null, beep_factor : Any? = null, sample_rate : Any? = null, duration : Any? = null, samples_per_frame : Any? = null, f : Any? = null, b : Any? = null, r : Any? = null, d : Any? = null) : sine {
    return sine(frequency, beep_factor, sample_rate, duration, samples_per_frame, f, b, r, d, "", "").apply { setInputs(this@sine) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( anullsink )](https://ffmpeg.org/ffmpeg-filters.html#anullsink)

```
Filter anullsink
Do absolutely nothing with the input audio.
Inputs:
#0: default (audio)
Outputs:
none (sink filter)

```
 * */
class anullsink(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [anullsink] を参照してください */
fun String.anullsink() : anullsink {
    return anullsink("", "").apply { setInputs(this@anullsink) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( addroi )](https://ffmpeg.org/ffmpeg-filters.html#addroi)

```
Filter addroi
Add region of interest to frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
addroi AVOptions:
x                 <string>     ..FV...... Region distance from left edge of frame. (default "0")
y                 <string>     ..FV...... Region distance from top edge of frame. (default "0")
w                 <string>     ..FV...... Region width. (default "0")
h                 <string>     ..FV...... Region height. (default "0")
qoffset           <rational>   ..FV...... Quantisation offset to apply in the region. (from -1 to 1) (default -1/10)
clear             <boolean>    ..FV...... Remove any existing regions of interest before adding the new one. (default false)


```
 * */
class addroi(
    val x : Any? = null,
    val y : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val qoffset : Any? = null,
    val clear : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [addroi] を参照してください */
fun String.addroi(x : Any? = null, y : Any? = null, w : Any? = null, h : Any? = null, qoffset : Any? = null, clear : Any? = null) : addroi {
    return addroi(x, y, w, h, qoffset, clear, "", "").apply { setInputs(this@addroi) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( alphaextract )](https://ffmpeg.org/ffmpeg-filters.html#alphaextract)

```
Filter alphaextract
Extract an alpha channel as a grayscale image component.
Inputs:
#0: default (video)
Outputs:
dynamic (depending on the options)

```
 * */
class alphaextract(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [alphaextract] を参照してください */
fun String.alphaextract() : alphaextract {
    return alphaextract("", "").apply { setInputs(this@alphaextract) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( alphamerge )](https://ffmpeg.org/ffmpeg-filters.html#alphamerge)

```
Filter alphamerge
Copy the luma value of the second input into the alpha channel of the first input.
Inputs:
#0: main (video)
#1: alpha (video)
Outputs:
#0: default (video)
alphamerge AVOptions:

This filter has support for timeline through the 'enable' option.

```
 * */
class alphamerge(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [alphamerge] を参照してください */
fun String.alphamerge() : alphamerge {
    return alphamerge("", "").apply { setInputs(this@alphamerge) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( amplify )](https://ffmpeg.org/ffmpeg-filters.html#amplify)

```
Filter amplify
Amplify changes between successive video frames.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
amplify AVOptions:
radius            <int>        ..FV...... set radius (from 1 to 63) (default 2)
factor            <float>      ..FV.....T set factor (from 0 to 65535) (default 2)
threshold         <float>      ..FV.....T set threshold (from 0 to 65535) (default 10)
tolerance         <float>      ..FV.....T set tolerance (from 0 to 65535) (default 0)
low               <int>        ..FV.....T set low limit for amplification (from 0 to 65535) (default 65535)
high              <int>        ..FV.....T set high limit for amplification (from 0 to 65535) (default 65535)
planes            <flags>      ..FV.....T set what planes to filter (default 7)

This filter has support for timeline through the 'enable' option.

```
 * */
class amplify(
    val radius : Any? = null,
    val factor : Any? = null,
    val threshold : Any? = null,
    val tolerance : Any? = null,
    val low : Any? = null,
    val high : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [amplify] を参照してください */
fun String.amplify(radius : Any? = null, factor : Any? = null, threshold : Any? = null, tolerance : Any? = null, low : Any? = null, high : Any? = null, planes : Any? = null) : amplify {
    return amplify(radius, factor, threshold, tolerance, low, high, planes, "", "").apply { setInputs(this@amplify) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ass )](https://ffmpeg.org/ffmpeg-filters.html#ass)

```
Filter ass
Render ASS subtitles onto input video using the libass library.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
ass AVOptions:
filename          <string>     ..FV...... set the filename of file to read
f                 <string>     ..FV...... set the filename of file to read
original_size     <image_size> ..FV...... set the size of the original video (used to scale fonts)
fontsdir          <string>     ..FV...... set the directory containing the fonts to read
alpha             <boolean>    ..FV...... enable processing of alpha channel (default false)
shaping           <int>        ..FV...... set shaping engine (from -1 to 1) (default auto)
auto            -1           ..FV......
simple          0            ..FV...... simple shaping
complex         1            ..FV...... complex shaping


```
 * */
class ass(
    val filename : Any? = null,
    val original_size : Any? = null,
    val fontsdir : Any? = null,
    val alpha : Any? = null,
    val shaping : Any? = null,
    val f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ass] を参照してください */
fun String.ass(filename : Any? = null, original_size : Any? = null, fontsdir : Any? = null, alpha : Any? = null, shaping : Any? = null, f : Any? = null) : ass {
    return ass(filename, original_size, fontsdir, alpha, shaping, f, "", "").apply { setInputs(this@ass) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( atadenoise )](https://ffmpeg.org/ffmpeg-filters.html#atadenoise)

```
Filter atadenoise
Apply an Adaptive Temporal Averaging Denoiser.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
atadenoise AVOptions:
0a                <float>      ..FV.....T set threshold A for 1st plane (from 0 to 0.3) (default 0.02)
0b                <float>      ..FV.....T set threshold B for 1st plane (from 0 to 5) (default 0.04)
1a                <float>      ..FV.....T set threshold A for 2nd plane (from 0 to 0.3) (default 0.02)
1b                <float>      ..FV.....T set threshold B for 2nd plane (from 0 to 5) (default 0.04)
2a                <float>      ..FV.....T set threshold A for 3rd plane (from 0 to 0.3) (default 0.02)
2b                <float>      ..FV.....T set threshold B for 3rd plane (from 0 to 5) (default 0.04)
s                 <int>        ..FV...... set how many frames to use (from 5 to 129) (default 9)
p                 <flags>      ..FV.....T set what planes to filter (default 7)
a                 <int>        ..FV.....T set variant of algorithm (from 0 to 1) (default p)
p               0            ..FV.....T parallel
s               1            ..FV.....T serial

This filter has support for timeline through the 'enable' option.

```
 * */
class atadenoise(
    val _0a : Any? = null,
    val _0b : Any? = null,
    val _1a : Any? = null,
    val _1b : Any? = null,
    val _2a : Any? = null,
    val _2b : Any? = null,
    val s : Any? = null,
    val p : Any? = null,
    val a : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [atadenoise] を参照してください */
fun String.atadenoise(_0a : Any? = null, _0b : Any? = null, _1a : Any? = null, _1b : Any? = null, _2a : Any? = null, _2b : Any? = null, s : Any? = null, p : Any? = null, a : Any? = null) : atadenoise {
    return atadenoise(_0a, _0b, _1a, _1b, _2a, _2b, s, p, a, "", "").apply { setInputs(this@atadenoise) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( avgblur )](https://ffmpeg.org/ffmpeg-filters.html#avgblur)

```
Filter avgblur
Apply Average Blur filter.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
avgblur AVOptions:
sizeX             <int>        ..FV.....T set horizontal size (from 1 to 1024) (default 1)
planes            <int>        ..FV.....T set planes to filter (from 0 to 15) (default 15)
sizeY             <int>        ..FV.....T set vertical size (from 0 to 1024) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class avgblur(
    val sizeX : Any? = null,
    val planes : Any? = null,
    val sizeY : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [avgblur] を参照してください */
fun String.avgblur(sizeX : Any? = null, planes : Any? = null, sizeY : Any? = null) : avgblur {
    return avgblur(sizeX, planes, sizeY, "", "").apply { setInputs(this@avgblur) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bbox )](https://ffmpeg.org/ffmpeg-filters.html#bbox)

```
Filter bbox
Compute bounding box for each frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
bbox AVOptions:
min_val           <int>        ..FV...... set minimum luminance value for bounding box (from 0 to 254) (default 16)

This filter has support for timeline through the 'enable' option.

```
 * */
class bbox(
    val min_val : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bbox] を参照してください */
fun String.bbox(min_val : Any? = null) : bbox {
    return bbox(min_val, "", "").apply { setInputs(this@bbox) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bench )](https://ffmpeg.org/ffmpeg-filters.html#bench)

```
Filter bench
Benchmark part of a filtergraph.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
bench AVOptions:
action            <int>        ..FV...... set action (from 0 to 1) (default start)
start           0            ..FV...... start timer
stop            1            ..FV...... stop timer


```
 * */
class bench(
    val action : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bench] を参照してください */
fun String.bench(action : Any? = null) : bench {
    return bench(action, "", "").apply { setInputs(this@bench) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bilateral )](https://ffmpeg.org/ffmpeg-filters.html#bilateral)

```
Filter bilateral
Apply Bilateral filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
bilateral AVOptions:
sigmaS            <float>      ..FV...... set spatial sigma (from 0 to 10) (default 0.1)
sigmaR            <float>      ..FV...... set range sigma (from 0 to 1) (default 0.1)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class bilateral(
    val sigmaS : Any? = null,
    val sigmaR : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bilateral] を参照してください */
fun String.bilateral(sigmaS : Any? = null, sigmaR : Any? = null, planes : Any? = null) : bilateral {
    return bilateral(sigmaS, sigmaR, planes, "", "").apply { setInputs(this@bilateral) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bitplanenoise )](https://ffmpeg.org/ffmpeg-filters.html#bitplanenoise)

```
Filter bitplanenoise
Measure bit plane noise.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
bitplanenoise AVOptions:
bitplane          <int>        ..FV...... set bit plane to use for measuring noise (from 1 to 16) (default 1)
filter            <boolean>    ..FV...... show noisy pixels (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class bitplanenoise(
    val bitplane : Any? = null,
    val filter : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bitplanenoise] を参照してください */
fun String.bitplanenoise(bitplane : Any? = null, filter : Any? = null) : bitplanenoise {
    return bitplanenoise(bitplane, filter, "", "").apply { setInputs(this@bitplanenoise) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( blackdetect )](https://ffmpeg.org/ffmpeg-filters.html#blackdetect)

```
Filter blackdetect
Detect video intervals that are (almost) black.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
blackdetect AVOptions:
d                 <double>     ..FV...... set minimum detected black duration in seconds (from 0 to DBL_MAX) (default 2)
black_min_duration <double>     ..FV...... set minimum detected black duration in seconds (from 0 to DBL_MAX) (default 2)
picture_black_ratio_th <double>     ..FV...... set the picture black ratio threshold (from 0 to 1) (default 0.98)
pic_th            <double>     ..FV...... set the picture black ratio threshold (from 0 to 1) (default 0.98)
pixel_black_th    <double>     ..FV...... set the pixel black threshold (from 0 to 1) (default 0.1)
pix_th            <double>     ..FV...... set the pixel black threshold (from 0 to 1) (default 0.1)


```
 * */
class blackdetect(
    val d : Any? = null,
    val black_min_duration : Any? = null,
    val picture_black_ratio_th : Any? = null,
    val pic_th : Any? = null,
    val pixel_black_th : Any? = null,
    val pix_th : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [blackdetect] を参照してください */
fun String.blackdetect(d : Any? = null, black_min_duration : Any? = null, picture_black_ratio_th : Any? = null, pic_th : Any? = null, pixel_black_th : Any? = null, pix_th : Any? = null) : blackdetect {
    return blackdetect(d, black_min_duration, picture_black_ratio_th, pic_th, pixel_black_th, pix_th, "", "").apply { setInputs(this@blackdetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( blackframe )](https://ffmpeg.org/ffmpeg-filters.html#blackframe)

```
Filter blackframe
Detect frames that are (almost) black.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
blackframe AVOptions:
amount            <int>        ..FV...... percentage of the pixels that have to be below the threshold for the frame to be considered black (from 0 to 100) (default 98)
threshold         <int>        ..FV...... threshold below which a pixel value is considered black (from 0 to 255) (default 32)
thresh            <int>        ..FV...... threshold below which a pixel value is considered black (from 0 to 255) (default 32)


```
 * */
class blackframe(
    val amount : Any? = null,
    val threshold : Any? = null,
    val thresh : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [blackframe] を参照してください */
fun String.blackframe(amount : Any? = null, threshold : Any? = null, thresh : Any? = null) : blackframe {
    return blackframe(amount, threshold, thresh, "", "").apply { setInputs(this@blackframe) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( blend )](https://ffmpeg.org/ffmpeg-filters.html#blend)

```
Filter blend
Blend two video frames into each other.
slice threading supported
Inputs:
#0: top (video)
#1: bottom (video)
Outputs:
#0: default (video)
blend AVOptions:
c0_mode           <int>        ..FV...... set component #0 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c1_mode           <int>        ..FV...... set component #1 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c2_mode           <int>        ..FV...... set component #2 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c3_mode           <int>        ..FV...... set component #3 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
all_mode          <int>        ..FV...... set blend mode for all components (from -1 to 32) (default -1)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c0_expr           <string>     ..FV...... set color component #0 expression
c1_expr           <string>     ..FV...... set color component #1 expression
c2_expr           <string>     ..FV...... set color component #2 expression
c3_expr           <string>     ..FV...... set color component #3 expression
all_expr          <string>     ..FV...... set expression for all color components
c0_opacity        <double>     ..FV...... set color component #0 opacity (from 0 to 1) (default 1)
c1_opacity        <double>     ..FV...... set color component #1 opacity (from 0 to 1) (default 1)
c2_opacity        <double>     ..FV...... set color component #2 opacity (from 0 to 1) (default 1)
c3_opacity        <double>     ..FV...... set color component #3 opacity (from 0 to 1) (default 1)
all_opacity       <double>     ..FV...... set opacity for all color components (from 0 to 1) (default 1)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class blend(
    val c0_mode : Any? = null,
    val c1_mode : Any? = null,
    val c2_mode : Any? = null,
    val c3_mode : Any? = null,
    val all_mode : Any? = null,
    val c0_expr : Any? = null,
    val c1_expr : Any? = null,
    val c2_expr : Any? = null,
    val c3_expr : Any? = null,
    val all_expr : Any? = null,
    val c0_opacity : Any? = null,
    val c1_opacity : Any? = null,
    val c2_opacity : Any? = null,
    val c3_opacity : Any? = null,
    val all_opacity : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [blend] を参照してください */
fun String.blend(c0_mode : Any? = null, c1_mode : Any? = null, c2_mode : Any? = null, c3_mode : Any? = null, all_mode : Any? = null, c0_expr : Any? = null, c1_expr : Any? = null, c2_expr : Any? = null, c3_expr : Any? = null, all_expr : Any? = null, c0_opacity : Any? = null, c1_opacity : Any? = null, c2_opacity : Any? = null, c3_opacity : Any? = null, all_opacity : Any? = null) : blend {
    return blend(c0_mode, c1_mode, c2_mode, c3_mode, all_mode, c0_expr, c1_expr, c2_expr, c3_expr, all_expr, c0_opacity, c1_opacity, c2_opacity, c3_opacity, all_opacity, "", "").apply { setInputs(this@blend) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bm3d )](https://ffmpeg.org/ffmpeg-filters.html#bm3d)

```
Filter bm3d
Block-Matching 3D denoiser.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
bm3d AVOptions:
sigma             <float>      ..FV...... set denoising strength (from 0 to 99999.9) (default 1)
block             <int>        ..FV...... set log2(size) of local patch (from 4 to 6) (default 4)
bstep             <int>        ..FV...... set sliding step for processing blocks (from 1 to 64) (default 4)
group             <int>        ..FV...... set maximal number of similar blocks (from 1 to 256) (default 1)
range             <int>        ..FV...... set block matching range (from 1 to INT_MAX) (default 9)
mstep             <int>        ..FV...... set step for block matching (from 1 to 64) (default 1)
thmse             <float>      ..FV...... set threshold of mean square error for block matching (from 0 to INT_MAX) (default 0)
hdthr             <float>      ..FV...... set hard threshold for 3D transfer domain (from 0 to INT_MAX) (default 2.7)
estim             <int>        ..FV...... set filtering estimation mode (from 0 to 1) (default basic)
basic           0            ..FV...... basic estimate
final           1            ..FV...... final estimate
ref               <boolean>    ..FV...... have reference stream (default false)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 7)

This filter has support for timeline through the 'enable' option.

```
 * */
class bm3d(
    val sigma : Any? = null,
    val block : Any? = null,
    val bstep : Any? = null,
    val group : Any? = null,
    val range : Any? = null,
    val mstep : Any? = null,
    val thmse : Any? = null,
    val hdthr : Any? = null,
    val estim : Any? = null,
    val ref : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bm3d] を参照してください */
fun String.bm3d(sigma : Any? = null, block : Any? = null, bstep : Any? = null, group : Any? = null, range : Any? = null, mstep : Any? = null, thmse : Any? = null, hdthr : Any? = null, estim : Any? = null, ref : Any? = null, planes : Any? = null) : bm3d {
    return bm3d(sigma, block, bstep, group, range, mstep, thmse, hdthr, estim, ref, planes, "", "").apply { setInputs(this@bm3d) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( boxblur )](https://ffmpeg.org/ffmpeg-filters.html#boxblur)

```
Filter boxblur
Blur the input.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
boxblur AVOptions:
luma_radius       <string>     ..FV...... Radius of the luma blurring box (default "2")
lr                <string>     ..FV...... Radius of the luma blurring box (default "2")
luma_power        <int>        ..FV...... How many times should the boxblur be applied to luma (from 0 to INT_MAX) (default 2)
lp                <int>        ..FV...... How many times should the boxblur be applied to luma (from 0 to INT_MAX) (default 2)
chroma_radius     <string>     ..FV...... Radius of the chroma blurring box
cr                <string>     ..FV...... Radius of the chroma blurring box
chroma_power      <int>        ..FV...... How many times should the boxblur be applied to chroma (from -1 to INT_MAX) (default -1)
cp                <int>        ..FV...... How many times should the boxblur be applied to chroma (from -1 to INT_MAX) (default -1)
alpha_radius      <string>     ..FV...... Radius of the alpha blurring box
ar                <string>     ..FV...... Radius of the alpha blurring box
alpha_power       <int>        ..FV...... How many times should the boxblur be applied to alpha (from -1 to INT_MAX) (default -1)
ap                <int>        ..FV...... How many times should the boxblur be applied to alpha (from -1 to INT_MAX) (default -1)

This filter has support for timeline through the 'enable' option.

```
 * */
class boxblur(
    val luma_radius : Any? = null,
    val luma_power : Any? = null,
    val chroma_radius : Any? = null,
    val chroma_power : Any? = null,
    val alpha_radius : Any? = null,
    val alpha_power : Any? = null,
    val lr : Any? = null,
    val lp : Any? = null,
    val cr : Any? = null,
    val cp : Any? = null,
    val ar : Any? = null,
    val ap : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [boxblur] を参照してください */
fun String.boxblur(luma_radius : Any? = null, luma_power : Any? = null, chroma_radius : Any? = null, chroma_power : Any? = null, alpha_radius : Any? = null, alpha_power : Any? = null, lr : Any? = null, lp : Any? = null, cr : Any? = null, cp : Any? = null, ar : Any? = null, ap : Any? = null) : boxblur {
    return boxblur(luma_radius, luma_power, chroma_radius, chroma_power, alpha_radius, alpha_power, lr, lp, cr, cp, ar, ap, "", "").apply { setInputs(this@boxblur) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( bwdif )](https://ffmpeg.org/ffmpeg-filters.html#bwdif)

```
Filter bwdif
Deinterlace the input image.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
bwdif AVOptions:
mode              <int>        ..FV...... specify the interlacing mode (from 0 to 1) (default send_field)
send_frame      0            ..FV...... send one frame for each frame
send_field      1            ..FV...... send one frame for each field
parity            <int>        ..FV...... specify the assumed picture field parity (from -1 to 1) (default auto)
tff             0            ..FV...... assume top field first
bff             1            ..FV...... assume bottom field first
auto            -1           ..FV...... auto detect parity
deint             <int>        ..FV...... specify which frames to deinterlace (from 0 to 1) (default all)
all             0            ..FV...... deinterlace all frames
interlaced      1            ..FV...... only deinterlace frames marked as interlaced

This filter has support for timeline through the 'enable' option.

```
 * */
class bwdif(
    val mode : Any? = null,
    val parity : Any? = null,
    val deint : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [bwdif] を参照してください */
fun String.bwdif(mode : Any? = null, parity : Any? = null, deint : Any? = null) : bwdif {
    return bwdif(mode, parity, deint, "", "").apply { setInputs(this@bwdif) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( cas )](https://ffmpeg.org/ffmpeg-filters.html#cas)

```
Filter cas
Contrast Adaptive Sharpen.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
cas AVOptions:
strength          <float>      ..FV.....T set the sharpening strength (from 0 to 1) (default 0)
planes            <flags>      ..FV.....T set what planes to filter (default 7)

This filter has support for timeline through the 'enable' option.

```
 * */
class cas(
    val strength : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [cas] を参照してください */
fun String.cas(strength : Any? = null, planes : Any? = null) : cas {
    return cas(strength, planes, "", "").apply { setInputs(this@cas) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( chromahold )](https://ffmpeg.org/ffmpeg-filters.html#chromahold)

```
Filter chromahold
Turns a certain color range into gray.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
chromahold AVOptions:
color             <color>      ..FV.....T set the chromahold key color (default "black")
similarity        <float>      ..FV.....T set the chromahold similarity value (from 0.01 to 1) (default 0.01)
blend             <float>      ..FV.....T set the chromahold blend value (from 0 to 1) (default 0)
yuv               <boolean>    ..FV.....T color parameter is in yuv instead of rgb (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class chromahold(
    val color : Any? = null,
    val similarity : Any? = null,
    val blend : Any? = null,
    val yuv : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [chromahold] を参照してください */
fun String.chromahold(color : Any? = null, similarity : Any? = null, blend : Any? = null, yuv : Any? = null) : chromahold {
    return chromahold(color, similarity, blend, yuv, "", "").apply { setInputs(this@chromahold) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( chromakey )](https://ffmpeg.org/ffmpeg-filters.html#chromakey)

```
Filter chromakey
Turns a certain color into transparency. Operates on YUV colors.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
chromakey AVOptions:
color             <color>      ..FV.....T set the chromakey key color (default "black")
similarity        <float>      ..FV.....T set the chromakey similarity value (from 0.01 to 1) (default 0.01)
blend             <float>      ..FV.....T set the chromakey key blend value (from 0 to 1) (default 0)
yuv               <boolean>    ..FV.....T color parameter is in yuv instead of rgb (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class chromakey(
    val color : Any? = null,
    val similarity : Any? = null,
    val blend : Any? = null,
    val yuv : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [chromakey] を参照してください */
fun String.chromakey(color : Any? = null, similarity : Any? = null, blend : Any? = null, yuv : Any? = null) : chromakey {
    return chromakey(color, similarity, blend, yuv, "", "").apply { setInputs(this@chromakey) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( chromashift )](https://ffmpeg.org/ffmpeg-filters.html#chromashift)

```
Filter chromashift
Shift chroma.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
chromashift AVOptions:
cbh               <int>        ..FV.....T shift chroma-blue horizontally (from -255 to 255) (default 0)
cbv               <int>        ..FV.....T shift chroma-blue vertically (from -255 to 255) (default 0)
crh               <int>        ..FV.....T shift chroma-red horizontally (from -255 to 255) (default 0)
crv               <int>        ..FV.....T shift chroma-red vertically (from -255 to 255) (default 0)
edge              <int>        ..FV.....T set edge operation (from 0 to 1) (default smear)
smear           0            ..FV.....T
wrap            1            ..FV.....T

This filter has support for timeline through the 'enable' option.

```
 * */
class chromashift(
    val cbh : Any? = null,
    val cbv : Any? = null,
    val crh : Any? = null,
    val crv : Any? = null,
    val edge : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [chromashift] を参照してください */
fun String.chromashift(cbh : Any? = null, cbv : Any? = null, crh : Any? = null, crv : Any? = null, edge : Any? = null) : chromashift {
    return chromashift(cbh, cbv, crh, crv, edge, "", "").apply { setInputs(this@chromashift) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ciescope )](https://ffmpeg.org/ffmpeg-filters.html#ciescope)

```
Filter ciescope
Video CIE scope.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
ciescope AVOptions:
system            <int>        ..FV...... set color system (from 0 to 9) (default hdtv)
ntsc            0            ..FV...... NTSC 1953 Y'I'O' (ITU-R BT.470 System M)
470m            0            ..FV...... NTSC 1953 Y'I'O' (ITU-R BT.470 System M)
ebu             1            ..FV...... EBU Y'U'V' (PAL/SECAM) (ITU-R BT.470 System B, G)
470bg           1            ..FV...... EBU Y'U'V' (PAL/SECAM) (ITU-R BT.470 System B, G)
smpte           2            ..FV...... SMPTE-C RGB
240m            3            ..FV...... SMPTE-240M Y'PbPr
apple           4            ..FV...... Apple RGB
widergb         5            ..FV...... Adobe Wide Gamut RGB
cie1931         6            ..FV...... CIE 1931 RGB
hdtv            7            ..FV...... ITU.BT-709 Y'CbCr
rec709          7            ..FV...... ITU.BT-709 Y'CbCr
uhdtv           8            ..FV...... ITU-R.BT-2020
rec2020         8            ..FV...... ITU-R.BT-2020
dcip3           9            ..FV...... DCI-P3
cie               <int>        ..FV...... set cie system (from 0 to 2) (default xyy)
xyy             0            ..FV...... CIE 1931 xyY
ucs             1            ..FV...... CIE 1960 UCS
luv             2            ..FV...... CIE 1976 Luv
gamuts            <flags>      ..FV...... set what gamuts to draw (default 0)
ntsc                         ..FV......
470m                         ..FV......
ebu                          ..FV......
470bg                        ..FV......
smpte                        ..FV......
240m                         ..FV......
apple                        ..FV......
widergb                      ..FV......
cie1931                      ..FV......
hdtv                         ..FV......
rec709                       ..FV......
uhdtv                        ..FV......
rec2020                      ..FV......
dcip3                        ..FV......
size              <int>        ..FV...... set ciescope size (from 256 to 8192) (default 512)
s                 <int>        ..FV...... set ciescope size (from 256 to 8192) (default 512)
intensity         <float>      ..FV...... set ciescope intensity (from 0 to 1) (default 0.001)
i                 <float>      ..FV...... set ciescope intensity (from 0 to 1) (default 0.001)
contrast          <float>      ..FV...... (from 0 to 1) (default 0.75)
corrgamma         <boolean>    ..FV...... (default true)
showwhite         <boolean>    ..FV...... (default false)
gamma             <double>     ..FV...... (from 0.1 to 6) (default 2.6)


```
 * */
class ciescope(
    val system : Any? = null,
    val cie : Any? = null,
    val gamuts : Any? = null,
    val size : Any? = null,
    val intensity : Any? = null,
    val contrast : Any? = null,
    val corrgamma : Any? = null,
    val showwhite : Any? = null,
    val gamma : Any? = null,
    val s : Any? = null,
    val i : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ciescope] を参照してください */
fun String.ciescope(system : Any? = null, cie : Any? = null, gamuts : Any? = null, size : Any? = null, intensity : Any? = null, contrast : Any? = null, corrgamma : Any? = null, showwhite : Any? = null, gamma : Any? = null, s : Any? = null, i : Any? = null) : ciescope {
    return ciescope(system, cie, gamuts, size, intensity, contrast, corrgamma, showwhite, gamma, s, i, "", "").apply { setInputs(this@ciescope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( codecview )](https://ffmpeg.org/ffmpeg-filters.html#codecview)

```
Filter codecview
Visualize information about some codecs.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
codecview AVOptions:
mv                <flags>      ..FV...... set motion vectors to visualize (default 0)
pf                           ..FV...... forward predicted MVs of P-frames
bf                           ..FV...... forward predicted MVs of B-frames
bb                           ..FV...... backward predicted MVs of B-frames
qp                <boolean>    ..FV...... (default false)
mv_type           <flags>      ..FV...... set motion vectors type (default 0)
fp                           ..FV...... forward predicted MVs
bp                           ..FV...... backward predicted MVs
mvt               <flags>      ..FV...... set motion vectors type (default 0)
fp                           ..FV...... forward predicted MVs
bp                           ..FV...... backward predicted MVs
frame_type        <flags>      ..FV...... set frame types to visualize motion vectors of (default 0)
if                           ..FV...... I-frames
pf                           ..FV...... P-frames
bf                           ..FV...... B-frames
ft                <flags>      ..FV...... set frame types to visualize motion vectors of (default 0)
if                           ..FV...... I-frames
pf                           ..FV...... P-frames
bf                           ..FV...... B-frames

This filter has support for timeline through the 'enable' option.

```
 * */
class codecview(
    val mv : Any? = null,
    val qp : Any? = null,
    val mv_type : Any? = null,
    val mvt : Any? = null,
    val frame_type : Any? = null,
    val ft : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [codecview] を参照してください */
fun String.codecview(mv : Any? = null, qp : Any? = null, mv_type : Any? = null, mvt : Any? = null, frame_type : Any? = null, ft : Any? = null) : codecview {
    return codecview(mv, qp, mv_type, mvt, frame_type, ft, "", "").apply { setInputs(this@codecview) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colorbalance )](https://ffmpeg.org/ffmpeg-filters.html#colorbalance)

```
Filter colorbalance
Adjust the color balance.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colorbalance AVOptions:
rs                <float>      ..FV.....T set red shadows (from -1 to 1) (default 0)
gs                <float>      ..FV.....T set green shadows (from -1 to 1) (default 0)
bs                <float>      ..FV.....T set blue shadows (from -1 to 1) (default 0)
rm                <float>      ..FV.....T set red midtones (from -1 to 1) (default 0)
gm                <float>      ..FV.....T set green midtones (from -1 to 1) (default 0)
bm                <float>      ..FV.....T set blue midtones (from -1 to 1) (default 0)
rh                <float>      ..FV.....T set red highlights (from -1 to 1) (default 0)
gh                <float>      ..FV.....T set green highlights (from -1 to 1) (default 0)
bh                <float>      ..FV.....T set blue highlights (from -1 to 1) (default 0)
pl                <boolean>    ..FV.....T preserve lightness (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class colorbalance(
    val rs : Any? = null,
    val gs : Any? = null,
    val bs : Any? = null,
    val rm : Any? = null,
    val gm : Any? = null,
    val bm : Any? = null,
    val rh : Any? = null,
    val gh : Any? = null,
    val bh : Any? = null,
    val pl : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colorbalance] を参照してください */
fun String.colorbalance(rs : Any? = null, gs : Any? = null, bs : Any? = null, rm : Any? = null, gm : Any? = null, bm : Any? = null, rh : Any? = null, gh : Any? = null, bh : Any? = null, pl : Any? = null) : colorbalance {
    return colorbalance(rs, gs, bs, rm, gm, bm, rh, gh, bh, pl, "", "").apply { setInputs(this@colorbalance) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colorchannelmixer )](https://ffmpeg.org/ffmpeg-filters.html#colorchannelmixer)

```
Filter colorchannelmixer
Adjust colors by mixing color channels.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colorchannelmixer AVOptions:
rr                <double>     ..FV.....T set the red gain for the red channel (from -2 to 2) (default 1)
rg                <double>     ..FV.....T set the green gain for the red channel (from -2 to 2) (default 0)
rb                <double>     ..FV.....T set the blue gain for the red channel (from -2 to 2) (default 0)
ra                <double>     ..FV.....T set the alpha gain for the red channel (from -2 to 2) (default 0)
gr                <double>     ..FV.....T set the red gain for the green channel (from -2 to 2) (default 0)
gg                <double>     ..FV.....T set the green gain for the green channel (from -2 to 2) (default 1)
gb                <double>     ..FV.....T set the blue gain for the green channel (from -2 to 2) (default 0)
ga                <double>     ..FV.....T set the alpha gain for the green channel (from -2 to 2) (default 0)
br                <double>     ..FV.....T set the red gain for the blue channel (from -2 to 2) (default 0)
bg                <double>     ..FV.....T set the green gain for the blue channel (from -2 to 2) (default 0)
bb                <double>     ..FV.....T set the blue gain for the blue channel (from -2 to 2) (default 1)
ba                <double>     ..FV.....T set the alpha gain for the blue channel (from -2 to 2) (default 0)
ar                <double>     ..FV.....T set the red gain for the alpha channel (from -2 to 2) (default 0)
ag                <double>     ..FV.....T set the green gain for the alpha channel (from -2 to 2) (default 0)
ab                <double>     ..FV.....T set the blue gain for the alpha channel (from -2 to 2) (default 0)
aa                <double>     ..FV.....T set the alpha gain for the alpha channel (from -2 to 2) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class colorchannelmixer(
    val rr : Any? = null,
    val rg : Any? = null,
    val rb : Any? = null,
    val ra : Any? = null,
    val gr : Any? = null,
    val gg : Any? = null,
    val gb : Any? = null,
    val ga : Any? = null,
    val br : Any? = null,
    val bg : Any? = null,
    val bb : Any? = null,
    val ba : Any? = null,
    val ar : Any? = null,
    val ag : Any? = null,
    val ab : Any? = null,
    val aa : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colorchannelmixer] を参照してください */
fun String.colorchannelmixer(rr : Any? = null, rg : Any? = null, rb : Any? = null, ra : Any? = null, gr : Any? = null, gg : Any? = null, gb : Any? = null, ga : Any? = null, br : Any? = null, bg : Any? = null, bb : Any? = null, ba : Any? = null, ar : Any? = null, ag : Any? = null, ab : Any? = null, aa : Any? = null) : colorchannelmixer {
    return colorchannelmixer(rr, rg, rb, ra, gr, gg, gb, ga, br, bg, bb, ba, ar, ag, ab, aa, "", "").apply { setInputs(this@colorchannelmixer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colorkey )](https://ffmpeg.org/ffmpeg-filters.html#colorkey)

```
Filter colorkey
Turns a certain color into transparency. Operates on RGB colors.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colorkey AVOptions:
color             <color>      ..FV.....T set the colorkey key color (default "black")
similarity        <float>      ..FV.....T set the colorkey similarity value (from 0.01 to 1) (default 0.01)
blend             <float>      ..FV.....T set the colorkey key blend value (from 0 to 1) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class colorkey(
    val color : Any? = null,
    val similarity : Any? = null,
    val blend : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colorkey] を参照してください */
fun String.colorkey(color : Any? = null, similarity : Any? = null, blend : Any? = null) : colorkey {
    return colorkey(color, similarity, blend, "", "").apply { setInputs(this@colorkey) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colorhold )](https://ffmpeg.org/ffmpeg-filters.html#colorhold)

```
Filter colorhold
Turns a certain color range into gray. Operates on RGB colors.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colorhold AVOptions:
color             <color>      ..FV.....T set the colorhold key color (default "black")
similarity        <float>      ..FV.....T set the colorhold similarity value (from 0.01 to 1) (default 0.01)
blend             <float>      ..FV.....T set the colorhold blend value (from 0 to 1) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class colorhold(
    val color : Any? = null,
    val similarity : Any? = null,
    val blend : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colorhold] を参照してください */
fun String.colorhold(color : Any? = null, similarity : Any? = null, blend : Any? = null) : colorhold {
    return colorhold(color, similarity, blend, "", "").apply { setInputs(this@colorhold) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colorlevels )](https://ffmpeg.org/ffmpeg-filters.html#colorlevels)

```
Filter colorlevels
Adjust the color levels.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colorlevels AVOptions:
rimin             <double>     ..FV.....T set input red black point (from -1 to 1) (default 0)
gimin             <double>     ..FV.....T set input green black point (from -1 to 1) (default 0)
bimin             <double>     ..FV.....T set input blue black point (from -1 to 1) (default 0)
aimin             <double>     ..FV.....T set input alpha black point (from -1 to 1) (default 0)
rimax             <double>     ..FV.....T set input red white point (from -1 to 1) (default 1)
gimax             <double>     ..FV.....T set input green white point (from -1 to 1) (default 1)
bimax             <double>     ..FV.....T set input blue white point (from -1 to 1) (default 1)
aimax             <double>     ..FV.....T set input alpha white point (from -1 to 1) (default 1)
romin             <double>     ..FV.....T set output red black point (from 0 to 1) (default 0)
gomin             <double>     ..FV.....T set output green black point (from 0 to 1) (default 0)
bomin             <double>     ..FV.....T set output blue black point (from 0 to 1) (default 0)
aomin             <double>     ..FV.....T set output alpha black point (from 0 to 1) (default 0)
romax             <double>     ..FV.....T set output red white point (from 0 to 1) (default 1)
gomax             <double>     ..FV.....T set output green white point (from 0 to 1) (default 1)
bomax             <double>     ..FV.....T set output blue white point (from 0 to 1) (default 1)
aomax             <double>     ..FV.....T set output alpha white point (from 0 to 1) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class colorlevels(
    val rimin : Any? = null,
    val gimin : Any? = null,
    val bimin : Any? = null,
    val aimin : Any? = null,
    val rimax : Any? = null,
    val gimax : Any? = null,
    val bimax : Any? = null,
    val aimax : Any? = null,
    val romin : Any? = null,
    val gomin : Any? = null,
    val bomin : Any? = null,
    val aomin : Any? = null,
    val romax : Any? = null,
    val gomax : Any? = null,
    val bomax : Any? = null,
    val aomax : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colorlevels] を参照してください */
fun String.colorlevels(rimin : Any? = null, gimin : Any? = null, bimin : Any? = null, aimin : Any? = null, rimax : Any? = null, gimax : Any? = null, bimax : Any? = null, aimax : Any? = null, romin : Any? = null, gomin : Any? = null, bomin : Any? = null, aomin : Any? = null, romax : Any? = null, gomax : Any? = null, bomax : Any? = null, aomax : Any? = null) : colorlevels {
    return colorlevels(rimin, gimin, bimin, aimin, rimax, gimax, bimax, aimax, romin, gomin, bomin, aomin, romax, gomax, bomax, aomax, "", "").apply { setInputs(this@colorlevels) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colormatrix )](https://ffmpeg.org/ffmpeg-filters.html#colormatrix)

```
Filter colormatrix
Convert color matrix.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colormatrix AVOptions:
src               <int>        ..FV...... set source color matrix (from -1 to 4) (default -1)
bt709           0            ..FV...... set BT.709 colorspace
fcc             1            ..FV...... set FCC colorspace
bt601           2            ..FV...... set BT.601 colorspace
bt470           2            ..FV...... set BT.470 colorspace
bt470bg         2            ..FV...... set BT.470 colorspace
smpte170m       2            ..FV...... set SMTPE-170M colorspace
smpte240m       3            ..FV...... set SMPTE-240M colorspace
bt2020          4            ..FV...... set BT.2020 colorspace
dst               <int>        ..FV...... set destination color matrix (from -1 to 4) (default -1)
bt709           0            ..FV...... set BT.709 colorspace
fcc             1            ..FV...... set FCC colorspace
bt601           2            ..FV...... set BT.601 colorspace
bt470           2            ..FV...... set BT.470 colorspace
bt470bg         2            ..FV...... set BT.470 colorspace
smpte170m       2            ..FV...... set SMTPE-170M colorspace
smpte240m       3            ..FV...... set SMPTE-240M colorspace
bt2020          4            ..FV...... set BT.2020 colorspace

This filter has support for timeline through the 'enable' option.

```
 * */
class colormatrix(
    val src : Any? = null,
    val dst : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colormatrix] を参照してください */
fun String.colormatrix(src : Any? = null, dst : Any? = null) : colormatrix {
    return colormatrix(src, dst, "", "").apply { setInputs(this@colormatrix) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( colorspace )](https://ffmpeg.org/ffmpeg-filters.html#colorspace)

```
Filter colorspace
Convert between colorspaces.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
colorspace AVOptions:
all               <int>        ..FV...... Set all color properties together (from 0 to 8) (default 0)
bt470m          1            ..FV......
bt470bg         2            ..FV......
bt601-6-525     3            ..FV......
bt601-6-625     4            ..FV......
bt709           5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
bt2020          8            ..FV......
space             <int>        ..FV...... Output colorspace (from 0 to 14) (default 2)
bt709           1            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
ycgco           8            ..FV......
gbr             0            ..FV......
bt2020nc        9            ..FV......
bt2020ncl       9            ..FV......
range             <int>        ..FV...... Output color range (from 0 to 2) (default 0)
tv              1            ..FV......
mpeg            1            ..FV......
pc              2            ..FV......
jpeg            2            ..FV......
primaries         <int>        ..FV...... Output color primaries (from 0 to 22) (default 2)
bt709           1            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
smpte428        10           ..FV......
film            8            ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
bt2020          9            ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
trc               <int>        ..FV...... Output transfer characteristics (from 0 to 18) (default 2)
bt709           1            ..FV......
bt470m          4            ..FV......
gamma22         4            ..FV......
bt470bg         5            ..FV......
gamma28         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
srgb            13           ..FV......
iec61966-2-1    13           ..FV......
xvycc           11           ..FV......
iec61966-2-4    11           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......
format            <int>        ..FV...... Output pixel format (from -1 to 164) (default -1)
yuv420p         0            ..FV......
yuv420p10       64           ..FV......
yuv420p12       125          ..FV......
yuv422p         4            ..FV......
yuv422p10       66           ..FV......
yuv422p12       129          ..FV......
yuv444p         5            ..FV......
yuv444p10       70           ..FV......
yuv444p12       133          ..FV......
fast              <boolean>    ..FV...... Ignore primary chromaticity and gamma correction (default false)
dither            <int>        ..FV...... Dithering mode (from 0 to 1) (default none)
none            0            ..FV......
fsb             1            ..FV......
wpadapt           <int>        ..FV...... Whitepoint adaptation method (from 0 to 2) (default bradford)
bradford        0            ..FV......
vonkries        1            ..FV......
identity        2            ..FV......
iall              <int>        ..FV...... Set all input color properties together (from 0 to 8) (default 0)
bt470m          1            ..FV......
bt470bg         2            ..FV......
bt601-6-525     3            ..FV......
bt601-6-625     4            ..FV......
bt709           5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
bt2020          8            ..FV......
ispace            <int>        ..FV...... Input colorspace (from 0 to 22) (default 2)
bt709           1            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
ycgco           8            ..FV......
gbr             0            ..FV......
bt2020nc        9            ..FV......
bt2020ncl       9            ..FV......
irange            <int>        ..FV...... Input color range (from 0 to 2) (default 0)
tv              1            ..FV......
mpeg            1            ..FV......
pc              2            ..FV......
jpeg            2            ..FV......
iprimaries        <int>        ..FV...... Input color primaries (from 0 to 22) (default 2)
bt709           1            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
smpte428        10           ..FV......
film            8            ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
bt2020          9            ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
itrc              <int>        ..FV...... Input transfer characteristics (from 0 to 18) (default 2)
bt709           1            ..FV......
bt470m          4            ..FV......
gamma22         4            ..FV......
bt470bg         5            ..FV......
gamma28         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
srgb            13           ..FV......
iec61966-2-1    13           ..FV......
xvycc           11           ..FV......
iec61966-2-4    11           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......

This filter has support for timeline through the 'enable' option.

```
 * */
class colorspace(
    val all : Any? = null,
    val space : Any? = null,
    val range : Any? = null,
    val primaries : Any? = null,
    val trc : Any? = null,
    val _format : Any? = null,
    val fast : Any? = null,
    val dither : Any? = null,
    val wpadapt : Any? = null,
    val iall : Any? = null,
    val ispace : Any? = null,
    val irange : Any? = null,
    val iprimaries : Any? = null,
    val itrc : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [colorspace] を参照してください */
fun String.colorspace(all : Any? = null, space : Any? = null, range : Any? = null, primaries : Any? = null, trc : Any? = null, _format : Any? = null, fast : Any? = null, dither : Any? = null, wpadapt : Any? = null, iall : Any? = null, ispace : Any? = null, irange : Any? = null, iprimaries : Any? = null, itrc : Any? = null) : colorspace {
    return colorspace(all, space, range, primaries, trc, _format, fast, dither, wpadapt, iall, ispace, irange, iprimaries, itrc, "", "").apply { setInputs(this@colorspace) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( convolution )](https://ffmpeg.org/ffmpeg-filters.html#convolution)

```
Filter convolution
Apply convolution filter.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
convolution AVOptions:
0m                <string>     ..FV...... set matrix for 1st plane (default "0 0 0 0 1 0 0 0 0")
1m                <string>     ..FV...... set matrix for 2nd plane (default "0 0 0 0 1 0 0 0 0")
2m                <string>     ..FV...... set matrix for 3rd plane (default "0 0 0 0 1 0 0 0 0")
3m                <string>     ..FV...... set matrix for 4th plane (default "0 0 0 0 1 0 0 0 0")
0rdiv             <float>      ..FV...... set rdiv for 1st plane (from 0 to INT_MAX) (default 0)
1rdiv             <float>      ..FV...... set rdiv for 2nd plane (from 0 to INT_MAX) (default 0)
2rdiv             <float>      ..FV...... set rdiv for 3rd plane (from 0 to INT_MAX) (default 0)
3rdiv             <float>      ..FV...... set rdiv for 4th plane (from 0 to INT_MAX) (default 0)
0bias             <float>      ..FV...... set bias for 1st plane (from 0 to INT_MAX) (default 0)
1bias             <float>      ..FV...... set bias for 2nd plane (from 0 to INT_MAX) (default 0)
2bias             <float>      ..FV...... set bias for 3rd plane (from 0 to INT_MAX) (default 0)
3bias             <float>      ..FV...... set bias for 4th plane (from 0 to INT_MAX) (default 0)
0mode             <int>        ..FV...... set matrix mode for 1st plane (from 0 to 2) (default square)
square          0            ..FV...... square matrix
row             1            ..FV...... single row matrix
column          2            ..FV...... single column matrix
1mode             <int>        ..FV...... set matrix mode for 2nd plane (from 0 to 2) (default square)
square          0            ..FV...... square matrix
row             1            ..FV...... single row matrix
column          2            ..FV...... single column matrix
2mode             <int>        ..FV...... set matrix mode for 3rd plane (from 0 to 2) (default square)
square          0            ..FV...... square matrix
row             1            ..FV...... single row matrix
column          2            ..FV...... single column matrix
3mode             <int>        ..FV...... set matrix mode for 4th plane (from 0 to 2) (default square)
square          0            ..FV...... square matrix
row             1            ..FV...... single row matrix
column          2            ..FV...... single column matrix

This filter has support for timeline through the 'enable' option.

```
 * */
class convolution(
    val _0m : Any? = null,
    val _1m : Any? = null,
    val _2m : Any? = null,
    val _3m : Any? = null,
    val _0rdiv : Any? = null,
    val _1rdiv : Any? = null,
    val _2rdiv : Any? = null,
    val _3rdiv : Any? = null,
    val _0bias : Any? = null,
    val _1bias : Any? = null,
    val _2bias : Any? = null,
    val _3bias : Any? = null,
    val _0mode : Any? = null,
    val _1mode : Any? = null,
    val _2mode : Any? = null,
    val _3mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [convolution] を参照してください */
fun String.convolution(_0m : Any? = null, _1m : Any? = null, _2m : Any? = null, _3m : Any? = null, _0rdiv : Any? = null, _1rdiv : Any? = null, _2rdiv : Any? = null, _3rdiv : Any? = null, _0bias : Any? = null, _1bias : Any? = null, _2bias : Any? = null, _3bias : Any? = null, _0mode : Any? = null, _1mode : Any? = null, _2mode : Any? = null, _3mode : Any? = null) : convolution {
    return convolution(_0m, _1m, _2m, _3m, _0rdiv, _1rdiv, _2rdiv, _3rdiv, _0bias, _1bias, _2bias, _3bias, _0mode, _1mode, _2mode, _3mode, "", "").apply { setInputs(this@convolution) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( convolve )](https://ffmpeg.org/ffmpeg-filters.html#convolve)

```
Filter convolve
Convolve first video stream with second video stream.
slice threading supported
Inputs:
#0: main (video)
#1: impulse (video)
Outputs:
#0: default (video)
convolve AVOptions:
planes            <int>        ..FV...... set planes to convolve (from 0 to 15) (default 7)
impulse           <int>        ..FV...... when to process impulses (from 0 to 1) (default all)
first           0            ..FV...... process only first impulse, ignore rest
all             1            ..FV...... process all impulses
noise             <float>      ..FV...... set noise (from 0 to 1) (default 1e-07)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class convolve(
    val planes : Any? = null,
    val impulse : Any? = null,
    val noise : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [convolve] を参照してください */
fun String.convolve(planes : Any? = null, impulse : Any? = null, noise : Any? = null) : convolve {
    return convolve(planes, impulse, noise, "", "").apply { setInputs(this@convolve) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( copy )](https://ffmpeg.org/ffmpeg-filters.html#copy)

```
Filter copy
Copy the input video unchanged to the output.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class copy(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [copy] を参照してください */
fun String.copy() : copy {
    return copy("", "").apply { setInputs(this@copy) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( cover_rect )](https://ffmpeg.org/ffmpeg-filters.html#cover_rect)

```
Filter cover_rect
Find and cover a user specified object.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
cover_rect AVOptions:
cover             <string>     ..FV...... cover bitmap filename
mode              <int>        ..FV...... set removal mode (from 0 to 1) (default blur)
cover           0            ..FV...... cover area with bitmap
blur            1            ..FV...... blur area


```
 * */
class cover_rect(
    val cover : Any? = null,
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [cover_rect] を参照してください */
fun String.cover_rect(cover : Any? = null, mode : Any? = null) : cover_rect {
    return cover_rect(cover, mode, "", "").apply { setInputs(this@cover_rect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( crop )](https://ffmpeg.org/ffmpeg-filters.html#crop)

```
Filter crop
Crop the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
crop AVOptions:
out_w             <string>     ..FV.....T set the width crop area expression (default "iw")
w                 <string>     ..FV.....T set the width crop area expression (default "iw")
out_h             <string>     ..FV.....T set the height crop area expression (default "ih")
h                 <string>     ..FV.....T set the height crop area expression (default "ih")
x                 <string>     ..FV.....T set the x crop area expression (default "(in_w-out_w)/2")
y                 <string>     ..FV.....T set the y crop area expression (default "(in_h-out_h)/2")
keep_aspect       <boolean>    ..FV...... keep aspect ratio (default false)
exact             <boolean>    ..FV...... do exact cropping (default false)


```
 * */
class crop(
    val out_w : Any? = null,
    val out_h : Any? = null,
    val x : Any? = null,
    val y : Any? = null,
    val keep_aspect : Any? = null,
    val exact : Any? = null,
    val w : Any? = null,
    val h : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [crop] を参照してください */
fun String.crop(out_w : Any? = null, out_h : Any? = null, x : Any? = null, y : Any? = null, keep_aspect : Any? = null, exact : Any? = null, w : Any? = null, h : Any? = null) : crop {
    return crop(out_w, out_h, x, y, keep_aspect, exact, w, h, "", "").apply { setInputs(this@crop) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( cropdetect )](https://ffmpeg.org/ffmpeg-filters.html#cropdetect)

```
Filter cropdetect
Auto-detect crop size.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
cropdetect AVOptions:
limit             <float>      ..FV...... Threshold below which the pixel is considered black (from 0 to 65535) (default 0.0941176)
round             <int>        ..FV...... Value by which the width/height should be divisible (from 0 to INT_MAX) (default 16)
reset             <int>        ..FV...... Recalculate the crop area after this many frames (from 0 to INT_MAX) (default 0)
reset_count       <int>        ..FV...... Recalculate the crop area after this many frames (from 0 to INT_MAX) (default 0)
max_outliers      <int>        ..FV...... Threshold count of outliers (from 0 to INT_MAX) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class cropdetect(
    val limit : Any? = null,
    val round : Any? = null,
    val reset : Any? = null,
    val reset_count : Any? = null,
    val max_outliers : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [cropdetect] を参照してください */
fun String.cropdetect(limit : Any? = null, round : Any? = null, reset : Any? = null, reset_count : Any? = null, max_outliers : Any? = null) : cropdetect {
    return cropdetect(limit, round, reset, reset_count, max_outliers, "", "").apply { setInputs(this@cropdetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( cue )](https://ffmpeg.org/ffmpeg-filters.html#cue)

```
Filter cue
Delay filtering to match a cue.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
cue AVOptions:
cue               <int64>      ..FVA..... cue unix timestamp in microseconds (from 0 to I64_MAX) (default 0)
preroll           <duration>   ..FVA..... preroll duration in seconds (default 0)
buffer            <duration>   ..FVA..... buffer duration in seconds (default 0)


```
 * */
class cue(
    val cue : Any? = null,
    val preroll : Any? = null,
    val buffer : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [cue] を参照してください */
fun String.cue(cue : Any? = null, preroll : Any? = null, buffer : Any? = null) : cue {
    return cue(cue, preroll, buffer, "", "").apply { setInputs(this@cue) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( curves )](https://ffmpeg.org/ffmpeg-filters.html#curves)

```
Filter curves
Adjust components curves.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
curves AVOptions:
preset            <int>        ..FV...... select a color curves preset (from 0 to 10) (default none)
none            0            ..FV......
color_negative  1            ..FV......
cross_process   2            ..FV......
darker          3            ..FV......
increase_contrast 4            ..FV......
lighter         5            ..FV......
linear_contrast 6            ..FV......
medium_contrast 7            ..FV......
negative        8            ..FV......
strong_contrast 9            ..FV......
vintage         10           ..FV......
master            <string>     ..FV...... set master points coordinates
m                 <string>     ..FV...... set master points coordinates
red               <string>     ..FV...... set red points coordinates
r                 <string>     ..FV...... set red points coordinates
green             <string>     ..FV...... set green points coordinates
g                 <string>     ..FV...... set green points coordinates
blue              <string>     ..FV...... set blue points coordinates
b                 <string>     ..FV...... set blue points coordinates
all               <string>     ..FV...... set points coordinates for all components
psfile            <string>     ..FV...... set Photoshop curves file name
plot              <string>     ..FV...... save Gnuplot script of the curves in specified file

This filter has support for timeline through the 'enable' option.

```
 * */
class curves(
    val preset : Any? = null,
    val master : Any? = null,
    val red : Any? = null,
    val green : Any? = null,
    val blue : Any? = null,
    val all : Any? = null,
    val psfile : Any? = null,
    val plot : Any? = null,
    val m : Any? = null,
    val r : Any? = null,
    val g : Any? = null,
    val b : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [curves] を参照してください */
fun String.curves(preset : Any? = null, master : Any? = null, red : Any? = null, green : Any? = null, blue : Any? = null, all : Any? = null, psfile : Any? = null, plot : Any? = null, m : Any? = null, r : Any? = null, g : Any? = null, b : Any? = null) : curves {
    return curves(preset, master, red, green, blue, all, psfile, plot, m, r, g, b, "", "").apply { setInputs(this@curves) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( datascope )](https://ffmpeg.org/ffmpeg-filters.html#datascope)

```
Filter datascope
Video data analysis.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
datascope AVOptions:
size              <image_size> ..FV...... set output size (default "hd720")
s                 <image_size> ..FV...... set output size (default "hd720")
x                 <int>        ..FV...... set x offset (from 0 to INT_MAX) (default 0)
y                 <int>        ..FV...... set y offset (from 0 to INT_MAX) (default 0)
mode              <int>        ..FV...... set scope mode (from 0 to 2) (default mono)
mono            0            ..FV......
color           1            ..FV......
color2          2            ..FV......
axis              <boolean>    ..FV...... draw column/row numbers (default false)
opacity           <float>      ..FV...... set background opacity (from 0 to 1) (default 0.75)
format            <int>        ..FV...... set display number format (from 0 to 1) (default hex)
hex             0            ..FV......
dec             1            ..FV......


```
 * */
class datascope(
    val size : Any? = null,
    val x : Any? = null,
    val y : Any? = null,
    val mode : Any? = null,
    val axis : Any? = null,
    val opacity : Any? = null,
    val _format : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [datascope] を参照してください */
fun String.datascope(size : Any? = null, x : Any? = null, y : Any? = null, mode : Any? = null, axis : Any? = null, opacity : Any? = null, _format : Any? = null, s : Any? = null) : datascope {
    return datascope(size, x, y, mode, axis, opacity, _format, s, "", "").apply { setInputs(this@datascope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dctdnoiz )](https://ffmpeg.org/ffmpeg-filters.html#dctdnoiz)

```
Filter dctdnoiz
Denoise frames using 2D DCT.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
dctdnoiz AVOptions:
sigma             <float>      ..FV...... set noise sigma constant (from 0 to 999) (default 0)
s                 <float>      ..FV...... set noise sigma constant (from 0 to 999) (default 0)
overlap           <int>        ..FV...... set number of block overlapping pixels (from -1 to 15) (default -1)
expr              <string>     ..FV...... set coefficient factor expression
e                 <string>     ..FV...... set coefficient factor expression
n                 <int>        ..FV...... set the block size, expressed in bits (from 3 to 4) (default 3)

This filter has support for timeline through the 'enable' option.

```
 * */
class dctdnoiz(
    val sigma : Any? = null,
    val overlap : Any? = null,
    val expr : Any? = null,
    val n : Any? = null,
    val s : Any? = null,
    val e : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dctdnoiz] を参照してください */
fun String.dctdnoiz(sigma : Any? = null, overlap : Any? = null, expr : Any? = null, n : Any? = null, s : Any? = null, e : Any? = null) : dctdnoiz {
    return dctdnoiz(sigma, overlap, expr, n, s, e, "", "").apply { setInputs(this@dctdnoiz) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deband )](https://ffmpeg.org/ffmpeg-filters.html#deband)

```
Filter deband
Debands video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
deband AVOptions:
1thr              <float>      ..FV...... set 1st plane threshold (from 3e-05 to 0.5) (default 0.02)
2thr              <float>      ..FV...... set 2nd plane threshold (from 3e-05 to 0.5) (default 0.02)
3thr              <float>      ..FV...... set 3rd plane threshold (from 3e-05 to 0.5) (default 0.02)
4thr              <float>      ..FV...... set 4th plane threshold (from 3e-05 to 0.5) (default 0.02)
range             <int>        ..FV...... set range (from INT_MIN to INT_MAX) (default 16)
r                 <int>        ..FV...... set range (from INT_MIN to INT_MAX) (default 16)
direction         <float>      ..FV...... set direction (from -6.28319 to 6.28319) (default 6.28319)
d                 <float>      ..FV...... set direction (from -6.28319 to 6.28319) (default 6.28319)
blur              <boolean>    ..FV...... set blur (default true)
b                 <boolean>    ..FV...... set blur (default true)
coupling          <boolean>    ..FV...... set plane coupling (default false)
c                 <boolean>    ..FV...... set plane coupling (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class deband(
    val _1thr : Any? = null,
    val _2thr : Any? = null,
    val _3thr : Any? = null,
    val _4thr : Any? = null,
    val range : Any? = null,
    val direction : Any? = null,
    val blur : Any? = null,
    val coupling : Any? = null,
    val r : Any? = null,
    val d : Any? = null,
    val b : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deband] を参照してください */
fun String.deband(_1thr : Any? = null, _2thr : Any? = null, _3thr : Any? = null, _4thr : Any? = null, range : Any? = null, direction : Any? = null, blur : Any? = null, coupling : Any? = null, r : Any? = null, d : Any? = null, b : Any? = null, c : Any? = null) : deband {
    return deband(_1thr, _2thr, _3thr, _4thr, range, direction, blur, coupling, r, d, b, c, "", "").apply { setInputs(this@deband) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deblock )](https://ffmpeg.org/ffmpeg-filters.html#deblock)

```
Filter deblock
Deblock video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
deblock AVOptions:
filter            <int>        ..FV...... set type of filter (from 0 to 1) (default strong)
weak            0            ..FV......
strong          1            ..FV......
block             <int>        ..FV...... set size of block (from 4 to 512) (default 8)
alpha             <float>      ..FV...... set 1st detection threshold (from 0 to 1) (default 0.098)
beta              <float>      ..FV...... set 2nd detection threshold (from 0 to 1) (default 0.05)
gamma             <float>      ..FV...... set 3rd detection threshold (from 0 to 1) (default 0.05)
delta             <float>      ..FV...... set 4th detection threshold (from 0 to 1) (default 0.05)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class deblock(
    val filter : Any? = null,
    val block : Any? = null,
    val alpha : Any? = null,
    val beta : Any? = null,
    val gamma : Any? = null,
    val delta : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deblock] を参照してください */
fun String.deblock(filter : Any? = null, block : Any? = null, alpha : Any? = null, beta : Any? = null, gamma : Any? = null, delta : Any? = null, planes : Any? = null) : deblock {
    return deblock(filter, block, alpha, beta, gamma, delta, planes, "", "").apply { setInputs(this@deblock) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( decimate )](https://ffmpeg.org/ffmpeg-filters.html#decimate)

```
Filter decimate
Decimate frames (post field matching filter).
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
decimate AVOptions:
cycle             <int>        ..FV...... set the number of frame from which one will be dropped (from 2 to 25) (default 5)
dupthresh         <double>     ..FV...... set duplicate threshold (from 0 to 100) (default 1.1)
scthresh          <double>     ..FV...... set scene change threshold (from 0 to 100) (default 15)
blockx            <int>        ..FV...... set the size of the x-axis blocks used during metric calculations (from 4 to 512) (default 32)
blocky            <int>        ..FV...... set the size of the y-axis blocks used during metric calculations (from 4 to 512) (default 32)
ppsrc             <boolean>    ..FV...... mark main input as a pre-processed input and activate clean source input stream (default false)
chroma            <boolean>    ..FV...... set whether or not chroma is considered in the metric calculations (default true)


```
 * */
class decimate(
    val cycle : Any? = null,
    val dupthresh : Any? = null,
    val scthresh : Any? = null,
    val blockx : Any? = null,
    val blocky : Any? = null,
    val ppsrc : Any? = null,
    val chroma : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [decimate] を参照してください */
fun String.decimate(cycle : Any? = null, dupthresh : Any? = null, scthresh : Any? = null, blockx : Any? = null, blocky : Any? = null, ppsrc : Any? = null, chroma : Any? = null) : decimate {
    return decimate(cycle, dupthresh, scthresh, blockx, blocky, ppsrc, chroma, "", "").apply { setInputs(this@decimate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deconvolve )](https://ffmpeg.org/ffmpeg-filters.html#deconvolve)

```
Filter deconvolve
Deconvolve first video stream with second video stream.
slice threading supported
Inputs:
#0: main (video)
#1: impulse (video)
Outputs:
#0: default (video)
deconvolve AVOptions:
planes            <int>        ..FV...... set planes to deconvolve (from 0 to 15) (default 7)
impulse           <int>        ..FV...... when to process impulses (from 0 to 1) (default all)
first           0            ..FV...... process only first impulse, ignore rest
all             1            ..FV...... process all impulses
noise             <float>      ..FV...... set noise (from 0 to 1) (default 1e-07)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class deconvolve(
    val planes : Any? = null,
    val impulse : Any? = null,
    val noise : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deconvolve] を参照してください */
fun String.deconvolve(planes : Any? = null, impulse : Any? = null, noise : Any? = null) : deconvolve {
    return deconvolve(planes, impulse, noise, "", "").apply { setInputs(this@deconvolve) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dedot )](https://ffmpeg.org/ffmpeg-filters.html#dedot)

```
Filter dedot
Reduce cross-luminance and cross-color.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
dedot AVOptions:
m                 <flags>      ..FV...... set filtering mode (default dotcrawl+rainbows)
dotcrawl                     ..FV......
rainbows                     ..FV......
lt                <float>      ..FV...... set spatial luma threshold (from 0 to 1) (default 0.079)
tl                <float>      ..FV...... set tolerance for temporal luma (from 0 to 1) (default 0.079)
tc                <float>      ..FV...... set tolerance for chroma temporal variation (from 0 to 1) (default 0.058)
ct                <float>      ..FV...... set temporal chroma threshold (from 0 to 1) (default 0.019)

This filter has support for timeline through the 'enable' option.

```
 * */
class dedot(
    val m : Any? = null,
    val lt : Any? = null,
    val tl : Any? = null,
    val tc : Any? = null,
    val ct : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dedot] を参照してください */
fun String.dedot(m : Any? = null, lt : Any? = null, tl : Any? = null, tc : Any? = null, ct : Any? = null) : dedot {
    return dedot(m, lt, tl, tc, ct, "", "").apply { setInputs(this@dedot) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deflate )](https://ffmpeg.org/ffmpeg-filters.html#deflate)

```
Filter deflate
Apply deflate effect.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
deflate AVOptions:
threshold0        <int>        ..FV.....T set threshold for 1st plane (from 0 to 65535) (default 65535)
threshold1        <int>        ..FV.....T set threshold for 2nd plane (from 0 to 65535) (default 65535)
threshold2        <int>        ..FV.....T set threshold for 3rd plane (from 0 to 65535) (default 65535)
threshold3        <int>        ..FV.....T set threshold for 4th plane (from 0 to 65535) (default 65535)

This filter has support for timeline through the 'enable' option.

```
 * */
class deflate(
    val threshold0 : Any? = null,
    val threshold1 : Any? = null,
    val threshold2 : Any? = null,
    val threshold3 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deflate] を参照してください */
fun String.deflate(threshold0 : Any? = null, threshold1 : Any? = null, threshold2 : Any? = null, threshold3 : Any? = null) : deflate {
    return deflate(threshold0, threshold1, threshold2, threshold3, "", "").apply { setInputs(this@deflate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deflicker )](https://ffmpeg.org/ffmpeg-filters.html#deflicker)

```
Filter deflicker
Remove temporal frame luminance variations.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
deflicker AVOptions:
size              <int>        ..FV...... set how many frames to use (from 2 to 129) (default 5)
s                 <int>        ..FV...... set how many frames to use (from 2 to 129) (default 5)
mode              <int>        ..FV...... set how to smooth luminance (from 0 to 6) (default am)
am              0            ..FV...... arithmetic mean
gm              1            ..FV...... geometric mean
hm              2            ..FV...... harmonic mean
qm              3            ..FV...... quadratic mean
cm              4            ..FV...... cubic mean
pm              5            ..FV...... power mean
median          6            ..FV...... median
m                 <int>        ..FV...... set how to smooth luminance (from 0 to 6) (default am)
am              0            ..FV...... arithmetic mean
gm              1            ..FV...... geometric mean
hm              2            ..FV...... harmonic mean
qm              3            ..FV...... quadratic mean
cm              4            ..FV...... cubic mean
pm              5            ..FV...... power mean
median          6            ..FV...... median
bypass            <boolean>    ..FV...... leave frames unchanged (default false)


```
 * */
class deflicker(
    val size : Any? = null,
    val mode : Any? = null,
    val bypass : Any? = null,
    val s : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deflicker] を参照してください */
fun String.deflicker(size : Any? = null, mode : Any? = null, bypass : Any? = null, s : Any? = null, m : Any? = null) : deflicker {
    return deflicker(size, mode, bypass, s, m, "", "").apply { setInputs(this@deflicker) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deinterlace_qsv )](https://ffmpeg.org/ffmpeg-filters.html#deinterlace_qsv)

```
Filter deinterlace_qsv
QuickSync video deinterlacing
Inputs:
#0: default (video)
Outputs:
#0: default (video)
deinterlace_qsv AVOptions:
mode              <int>        ..FV...... set deinterlace mode (from 1 to 2) (default advanced)
bob             1            ..FV...... bob algorithm
advanced        2            ..FV...... Motion adaptive algorithm


```
 * */
class deinterlace_qsv(
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deinterlace_qsv] を参照してください */
fun String.deinterlace_qsv(mode : Any? = null) : deinterlace_qsv {
    return deinterlace_qsv(mode, "", "").apply { setInputs(this@deinterlace_qsv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dejudder )](https://ffmpeg.org/ffmpeg-filters.html#dejudder)

```
Filter dejudder
Remove judder produced by pullup.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
dejudder AVOptions:
cycle             <int>        ..FV...... set the length of the cycle to use for dejuddering (from 2 to 240) (default 4)


```
 * */
class dejudder(
    val cycle : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dejudder] を参照してください */
fun String.dejudder(cycle : Any? = null) : dejudder {
    return dejudder(cycle, "", "").apply { setInputs(this@dejudder) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( delogo )](https://ffmpeg.org/ffmpeg-filters.html#delogo)

```
Filter delogo
Remove logo from input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
delogo AVOptions:
x                 <string>     ..FV...... set logo x position (default "-1")
y                 <string>     ..FV...... set logo y position (default "-1")
w                 <string>     ..FV...... set logo width (default "-1")
h                 <string>     ..FV...... set logo height (default "-1")
show              <boolean>    ..FV...... show delogo area (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class delogo(
    val x : Any? = null,
    val y : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val show : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [delogo] を参照してください */
fun String.delogo(x : Any? = null, y : Any? = null, w : Any? = null, h : Any? = null, show : Any? = null) : delogo {
    return delogo(x, y, w, h, show, "", "").apply { setInputs(this@delogo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( derain )](https://ffmpeg.org/ffmpeg-filters.html#derain)

```
Filter derain
Apply derain filter to the input.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
derain AVOptions:
filter_type       <int>        ..FV...... filter type(derain/dehaze) (from 0 to 1) (default derain)
derain          0            ..FV...... derain filter flag
dehaze          1            ..FV...... dehaze filter flag
dnn_backend       <int>        ..FV...... DNN backend (from 0 to 1) (default native)
native          0            ..FV...... native backend flag
model             <string>     ..FV...... path to model file

This filter has support for timeline through the 'enable' option.

```
 * */
class derain(
    val filter_type : Any? = null,
    val dnn_backend : Any? = null,
    val model : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [derain] を参照してください */
fun String.derain(filter_type : Any? = null, dnn_backend : Any? = null, model : Any? = null) : derain {
    return derain(filter_type, dnn_backend, model, "", "").apply { setInputs(this@derain) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( deshake )](https://ffmpeg.org/ffmpeg-filters.html#deshake)

```
Filter deshake
Stabilize shaky video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
deshake AVOptions:
x                 <int>        ..FV...... set x for the rectangular search area (from -1 to INT_MAX) (default -1)
y                 <int>        ..FV...... set y for the rectangular search area (from -1 to INT_MAX) (default -1)
w                 <int>        ..FV...... set width for the rectangular search area (from -1 to INT_MAX) (default -1)
h                 <int>        ..FV...... set height for the rectangular search area (from -1 to INT_MAX) (default -1)
rx                <int>        ..FV...... set x for the rectangular search area (from 0 to 64) (default 16)
ry                <int>        ..FV...... set y for the rectangular search area (from 0 to 64) (default 16)
edge              <int>        ..FV...... set edge mode (from 0 to 3) (default mirror)
blank           0            ..FV...... fill zeroes at blank locations
original        1            ..FV...... original image at blank locations
clamp           2            ..FV...... extruded edge value at blank locations
mirror          3            ..FV...... mirrored edge at blank locations
blocksize         <int>        ..FV...... set motion search blocksize (from 4 to 128) (default 8)
contrast          <int>        ..FV...... set contrast threshold for blocks (from 1 to 255) (default 125)
search            <int>        ..FV...... set search strategy (from 0 to 1) (default exhaustive)
exhaustive      0            ..FV...... exhaustive search
less            1            ..FV...... less exhaustive search
filename          <string>     ..FV...... set motion search detailed log file name
opencl            <boolean>    ..FV...... ignored (default false)


```
 * */
class deshake(
    val x : Any? = null,
    val y : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val rx : Any? = null,
    val ry : Any? = null,
    val edge : Any? = null,
    val blocksize : Any? = null,
    val contrast : Any? = null,
    val search : Any? = null,
    val filename : Any? = null,
    val opencl : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [deshake] を参照してください */
fun String.deshake(x : Any? = null, y : Any? = null, w : Any? = null, h : Any? = null, rx : Any? = null, ry : Any? = null, edge : Any? = null, blocksize : Any? = null, contrast : Any? = null, search : Any? = null, filename : Any? = null, opencl : Any? = null) : deshake {
    return deshake(x, y, w, h, rx, ry, edge, blocksize, contrast, search, filename, opencl, "", "").apply { setInputs(this@deshake) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( despill )](https://ffmpeg.org/ffmpeg-filters.html#despill)

```
Filter despill
Despill video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
despill AVOptions:
type              <int>        ..FV...... set the screen type (from 0 to 1) (default green)
green           0            ..FV...... greenscreen
blue            1            ..FV...... bluescreen
mix               <float>      ..FV...... set the spillmap mix (from 0 to 1) (default 0.5)
expand            <float>      ..FV...... set the spillmap expand (from 0 to 1) (default 0)
red               <float>      ..FV...... set red scale (from -100 to 100) (default 0)
green             <float>      ..FV...... set green scale (from -100 to 100) (default -1)
blue              <float>      ..FV...... set blue scale (from -100 to 100) (default 0)
brightness        <float>      ..FV...... set brightness (from -10 to 10) (default 0)
alpha             <boolean>    ..FV...... change alpha component (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class despill(
    val type : Any? = null,
    val mix : Any? = null,
    val expand : Any? = null,
    val red : Any? = null,
    val green : Any? = null,
    val blue : Any? = null,
    val brightness : Any? = null,
    val alpha : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [despill] を参照してください */
fun String.despill(type : Any? = null, mix : Any? = null, expand : Any? = null, red : Any? = null, green : Any? = null, blue : Any? = null, brightness : Any? = null, alpha : Any? = null) : despill {
    return despill(type, mix, expand, red, green, blue, brightness, alpha, "", "").apply { setInputs(this@despill) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( detelecine )](https://ffmpeg.org/ffmpeg-filters.html#detelecine)

```
Filter detelecine
Apply an inverse telecine pattern.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
detelecine AVOptions:
first_field       <int>        ..FV...... select first field (from 0 to 1) (default top)
top             0            ..FV...... select top field first
t               0            ..FV...... select top field first
bottom          1            ..FV...... select bottom field first
b               1            ..FV...... select bottom field first
pattern           <string>     ..FV...... pattern that describe for how many fields a frame is to be displayed (default "23")
start_frame       <int>        ..FV...... position of first frame with respect to the pattern if stream is cut (from 0 to 13) (default 0)


```
 * */
class detelecine(
    val first_field : Any? = null,
    val pattern : Any? = null,
    val start_frame : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [detelecine] を参照してください */
fun String.detelecine(first_field : Any? = null, pattern : Any? = null, start_frame : Any? = null) : detelecine {
    return detelecine(first_field, pattern, start_frame, "", "").apply { setInputs(this@detelecine) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dilation )](https://ffmpeg.org/ffmpeg-filters.html#dilation)

```
Filter dilation
Apply dilation effect.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
dilation AVOptions:
threshold0        <int>        ..FV.....T set threshold for 1st plane (from 0 to 65535) (default 65535)
threshold1        <int>        ..FV.....T set threshold for 2nd plane (from 0 to 65535) (default 65535)
threshold2        <int>        ..FV.....T set threshold for 3rd plane (from 0 to 65535) (default 65535)
threshold3        <int>        ..FV.....T set threshold for 4th plane (from 0 to 65535) (default 65535)
coordinates       <int>        ..FV.....T set coordinates (from 0 to 255) (default 255)

This filter has support for timeline through the 'enable' option.

```
 * */
class dilation(
    val threshold0 : Any? = null,
    val threshold1 : Any? = null,
    val threshold2 : Any? = null,
    val threshold3 : Any? = null,
    val coordinates : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dilation] を参照してください */
fun String.dilation(threshold0 : Any? = null, threshold1 : Any? = null, threshold2 : Any? = null, threshold3 : Any? = null, coordinates : Any? = null) : dilation {
    return dilation(threshold0, threshold1, threshold2, threshold3, coordinates, "", "").apply { setInputs(this@dilation) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( displace )](https://ffmpeg.org/ffmpeg-filters.html#displace)

```
Filter displace
Displace pixels.
Inputs:
#0: source (video)
#1: xmap (video)
#2: ymap (video)
Outputs:
#0: default (video)
displace AVOptions:
edge              <int>        ..FV...... set edge mode (from 0 to 3) (default smear)
blank           0            ..FV......
smear           1            ..FV......
wrap            2            ..FV......
mirror          3            ..FV......

This filter has support for timeline through the 'enable' option.

```
 * */
class displace(
    val edge : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [displace] を参照してください */
fun String.displace(edge : Any? = null) : displace {
    return displace(edge, "", "").apply { setInputs(this@displace) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( dnn_processing )](https://ffmpeg.org/ffmpeg-filters.html#dnn_processing)

```
Filter dnn_processing
Apply DNN processing filter to the input.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
dnn_processing AVOptions:
dnn_backend       <int>        ..FV...... DNN backend (from 0 to 1) (default native)
native          0            ..FV...... native backend flag
model             <string>     ..FV...... path to model file
input             <string>     ..FV...... input name of the model
output            <string>     ..FV...... output name of the model


```
 * */
class dnn_processing(
    val dnn_backend : Any? = null,
    val model : Any? = null,
    val input : Any? = null,
    val output : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [dnn_processing] を参照してください */
fun String.dnn_processing(dnn_backend : Any? = null, model : Any? = null, input : Any? = null, output : Any? = null) : dnn_processing {
    return dnn_processing(dnn_backend, model, input, output, "", "").apply { setInputs(this@dnn_processing) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( doubleweave )](https://ffmpeg.org/ffmpeg-filters.html#doubleweave)

```
Filter doubleweave
Weave input video fields into double number of frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
doubleweave AVOptions:
first_field       <int>        ..FV...... set first field (from 0 to 1) (default top)
top             0            ..FV...... set top field first
t               0            ..FV...... set top field first
bottom          1            ..FV...... set bottom field first
b               1            ..FV...... set bottom field first


```
 * */
class doubleweave(
    val first_field : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [doubleweave] を参照してください */
fun String.doubleweave(first_field : Any? = null) : doubleweave {
    return doubleweave(first_field, "", "").apply { setInputs(this@doubleweave) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( drawbox )](https://ffmpeg.org/ffmpeg-filters.html#drawbox)

```
Filter drawbox
Draw a colored box on the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
drawbox AVOptions:
x                 <string>     ..FV.....T set horizontal position of the left box edge (default "0")
y                 <string>     ..FV.....T set vertical position of the top box edge (default "0")
width             <string>     ..FV.....T set width of the box (default "0")
w                 <string>     ..FV.....T set width of the box (default "0")
height            <string>     ..FV.....T set height of the box (default "0")
h                 <string>     ..FV.....T set height of the box (default "0")
color             <string>     ..FV.....T set color of the box (default "black")
c                 <string>     ..FV.....T set color of the box (default "black")
thickness         <string>     ..FV.....T set the box thickness (default "3")
t                 <string>     ..FV.....T set the box thickness (default "3")
replace           <boolean>    ..FV.....T replace color & alpha (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class drawbox(
    val x : Any? = null,
    val y : Any? = null,
    val width : Any? = null,
    val height : Any? = null,
    val color : Any? = null,
    val thickness : Any? = null,
    val replace : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val c : Any? = null,
    val t : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [drawbox] を参照してください */
fun String.drawbox(x : Any? = null, y : Any? = null, width : Any? = null, height : Any? = null, color : Any? = null, thickness : Any? = null, replace : Any? = null, w : Any? = null, h : Any? = null, c : Any? = null, t : Any? = null) : drawbox {
    return drawbox(x, y, width, height, color, thickness, replace, w, h, c, t, "", "").apply { setInputs(this@drawbox) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( drawgraph )](https://ffmpeg.org/ffmpeg-filters.html#drawgraph)

```
Filter drawgraph
Draw a graph using input video metadata.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
drawgraph AVOptions:
m1                <string>     ..FV...... set 1st metadata key (default "")
fg1               <string>     ..FV...... set 1st foreground color expression (default "0xffff0000")
m2                <string>     ..FV...... set 2nd metadata key (default "")
fg2               <string>     ..FV...... set 2nd foreground color expression (default "0xff00ff00")
m3                <string>     ..FV...... set 3rd metadata key (default "")
fg3               <string>     ..FV...... set 3rd foreground color expression (default "0xffff00ff")
m4                <string>     ..FV...... set 4th metadata key (default "")
fg4               <string>     ..FV...... set 4th foreground color expression (default "0xffffff00")
bg                <color>      ..FV...... set background color (default "white")
min               <float>      ..FV...... set minimal value (from INT_MIN to INT_MAX) (default -1)
max               <float>      ..FV...... set maximal value (from INT_MIN to INT_MAX) (default 1)
mode              <int>        ..FV...... set graph mode (from 0 to 2) (default line)
bar             0            ..FV...... draw bars
dot             1            ..FV...... draw dots
line            2            ..FV...... draw lines
slide             <int>        ..FV...... set slide mode (from 0 to 4) (default frame)
frame           0            ..FV...... draw new frames
replace         1            ..FV...... replace old columns with new
scroll          2            ..FV...... scroll from right to left
rscroll         3            ..FV...... scroll from left to right
picture         4            ..FV...... display graph in single frame
size              <image_size> ..FV...... set graph size (default "900x256")
s                 <image_size> ..FV...... set graph size (default "900x256")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")


```
 * */
class drawgraph(
    val m1 : Any? = null,
    val fg1 : Any? = null,
    val m2 : Any? = null,
    val fg2 : Any? = null,
    val m3 : Any? = null,
    val fg3 : Any? = null,
    val m4 : Any? = null,
    val fg4 : Any? = null,
    val bg : Any? = null,
    val min : Any? = null,
    val max : Any? = null,
    val mode : Any? = null,
    val slide : Any? = null,
    val size : Any? = null,
    val rate : Any? = null,
    val s : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [drawgraph] を参照してください */
fun String.drawgraph(m1 : Any? = null, fg1 : Any? = null, m2 : Any? = null, fg2 : Any? = null, m3 : Any? = null, fg3 : Any? = null, m4 : Any? = null, fg4 : Any? = null, bg : Any? = null, min : Any? = null, max : Any? = null, mode : Any? = null, slide : Any? = null, size : Any? = null, rate : Any? = null, s : Any? = null, r : Any? = null) : drawgraph {
    return drawgraph(m1, fg1, m2, fg2, m3, fg3, m4, fg4, bg, min, max, mode, slide, size, rate, s, r, "", "").apply { setInputs(this@drawgraph) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( drawgrid )](https://ffmpeg.org/ffmpeg-filters.html#drawgrid)

```
Filter drawgrid
Draw a colored grid on the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
drawgrid AVOptions:
x                 <string>     ..FV.....T set horizontal offset (default "0")
y                 <string>     ..FV.....T set vertical offset (default "0")
width             <string>     ..FV.....T set width of grid cell (default "0")
w                 <string>     ..FV.....T set width of grid cell (default "0")
height            <string>     ..FV.....T set height of grid cell (default "0")
h                 <string>     ..FV.....T set height of grid cell (default "0")
color             <string>     ..FV.....T set color of the grid (default "black")
c                 <string>     ..FV.....T set color of the grid (default "black")
thickness         <string>     ..FV.....T set grid line thickness (default "1")
t                 <string>     ..FV.....T set grid line thickness (default "1")
replace           <boolean>    ..FV.....T replace color & alpha (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class drawgrid(
    val x : Any? = null,
    val y : Any? = null,
    val width : Any? = null,
    val height : Any? = null,
    val color : Any? = null,
    val thickness : Any? = null,
    val replace : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val c : Any? = null,
    val t : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [drawgrid] を参照してください */
fun String.drawgrid(x : Any? = null, y : Any? = null, width : Any? = null, height : Any? = null, color : Any? = null, thickness : Any? = null, replace : Any? = null, w : Any? = null, h : Any? = null, c : Any? = null, t : Any? = null) : drawgrid {
    return drawgrid(x, y, width, height, color, thickness, replace, w, h, c, t, "", "").apply { setInputs(this@drawgrid) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( drawtext )](https://ffmpeg.org/ffmpeg-filters.html#drawtext)

```
Filter drawtext
Draw text on top of video frames using libfreetype library.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
drawtext AVOptions:
fontfile          <string>     ..FV...... set font file
text              <string>     ..FV...... set text
textfile          <string>     ..FV...... set text file
fontcolor         <color>      ..FV...... set foreground color (default "black")
fontcolor_expr    <string>     ..FV...... set foreground color expression (default "")
boxcolor          <color>      ..FV...... set box color (default "white")
bordercolor       <color>      ..FV...... set border color (default "black")
shadowcolor       <color>      ..FV...... set shadow color (default "black")
box               <boolean>    ..FV...... set box (default false)
boxborderw        <int>        ..FV...... set box border width (from INT_MIN to INT_MAX) (default 0)
line_spacing      <int>        ..FV...... set line spacing in pixels (from INT_MIN to INT_MAX) (default 0)
fontsize          <string>     ..FV...... set font size
x                 <string>     ..FV...... set x expression (default "0")
y                 <string>     ..FV...... set y expression (default "0")
shadowx           <int>        ..FV...... set shadow x offset (from INT_MIN to INT_MAX) (default 0)
shadowy           <int>        ..FV...... set shadow y offset (from INT_MIN to INT_MAX) (default 0)
borderw           <int>        ..FV...... set border width (from INT_MIN to INT_MAX) (default 0)
tabsize           <int>        ..FV...... set tab size (from 0 to INT_MAX) (default 4)
basetime          <int64>      ..FV...... set base time (from I64_MIN to I64_MAX) (default I64_MIN)
font              <string>     ..FV...... Font name (default "Sans")
expansion         <int>        ..FV...... set the expansion mode (from 0 to 2) (default normal)
none            0            ..FV...... set no expansion
normal          1            ..FV...... set normal expansion
strftime        2            ..FV...... set strftime expansion (deprecated)
timecode          <string>     ..FV...... set initial timecode
tc24hmax          <boolean>    ..FV...... set 24 hours max (timecode only) (default false)
timecode_rate     <rational>   ..FV...... set rate (timecode only) (from 0 to INT_MAX) (default 0/1)
r                 <rational>   ..FV...... set rate (timecode only) (from 0 to INT_MAX) (default 0/1)
rate              <rational>   ..FV...... set rate (timecode only) (from 0 to INT_MAX) (default 0/1)
reload            <boolean>    ..FV...... reload text file for each frame (default false)
alpha             <string>     ..FV...... apply alpha while rendering (default "1")
fix_bounds        <boolean>    ..FV...... check and fix text coords to avoid clipping (default false)
start_number      <int>        ..FV...... start frame number for n/frame_num variable (from 0 to INT_MAX) (default 0)
ft_load_flags     <flags>      ..FV...... set font loading flags for libfreetype (default 0)
default                      ..FV......
no_scale                     ..FV......
no_hinting                   ..FV......
render                       ..FV......
no_bitmap                    ..FV......
vertical_layout              ..FV......
force_autohint               ..FV......
crop_bitmap                  ..FV......
pedantic                     ..FV......
ignore_global_advance_width              ..FV......
no_recurse                   ..FV......
ignore_transform              ..FV......
monochrome                   ..FV......
linear_design                ..FV......
no_autohint                  ..FV......

This filter has support for timeline through the 'enable' option.

```
 * */
class drawtext(
    val fontfile : Any? = null,
    val text : Any? = null,
    val textfile : Any? = null,
    val fontcolor : Any? = null,
    val fontcolor_expr : Any? = null,
    val boxcolor : Any? = null,
    val bordercolor : Any? = null,
    val shadowcolor : Any? = null,
    val box : Any? = null,
    val boxborderw : Any? = null,
    val line_spacing : Any? = null,
    val fontsize : Any? = null,
    val x : Any? = null,
    val y : Any? = null,
    val shadowx : Any? = null,
    val shadowy : Any? = null,
    val borderw : Any? = null,
    val tabsize : Any? = null,
    val basetime : Any? = null,
    val font : Any? = null,
    val expansion : Any? = null,
    val timecode : Any? = null,
    val tc24hmax : Any? = null,
    val timecode_rate : Any? = null,
    val rate : Any? = null,
    val reload : Any? = null,
    val alpha : Any? = null,
    val fix_bounds : Any? = null,
    val start_number : Any? = null,
    val ft_load_flags : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [drawtext] を参照してください */
fun String.drawtext(fontfile : Any? = null, text : Any? = null, textfile : Any? = null, fontcolor : Any? = null, fontcolor_expr : Any? = null, boxcolor : Any? = null, bordercolor : Any? = null, shadowcolor : Any? = null, box : Any? = null, boxborderw : Any? = null, line_spacing : Any? = null, fontsize : Any? = null, x : Any? = null, y : Any? = null, shadowx : Any? = null, shadowy : Any? = null, borderw : Any? = null, tabsize : Any? = null, basetime : Any? = null, font : Any? = null, expansion : Any? = null, timecode : Any? = null, tc24hmax : Any? = null, timecode_rate : Any? = null, rate : Any? = null, reload : Any? = null, alpha : Any? = null, fix_bounds : Any? = null, start_number : Any? = null, ft_load_flags : Any? = null, r : Any? = null) : drawtext {
    return drawtext(fontfile, text, textfile, fontcolor, fontcolor_expr, boxcolor, bordercolor, shadowcolor, box, boxborderw, line_spacing, fontsize, x, y, shadowx, shadowy, borderw, tabsize, basetime, font, expansion, timecode, tc24hmax, timecode_rate, rate, reload, alpha, fix_bounds, start_number, ft_load_flags, r, "", "").apply { setInputs(this@drawtext) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( edgedetect )](https://ffmpeg.org/ffmpeg-filters.html#edgedetect)

```
Filter edgedetect
Detect and draw edge.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
edgedetect AVOptions:
high              <double>     ..FV...... set high threshold (from 0 to 1) (default 0.196078)
low               <double>     ..FV...... set low threshold (from 0 to 1) (default 0.0784314)
mode              <int>        ..FV...... set mode (from 0 to 2) (default wires)
wires           0            ..FV...... white/gray wires on black
colormix        1            ..FV...... mix colors
canny           2            ..FV...... detect edges on planes
planes            <flags>      ..FV...... set planes to filter (default y+u+v+r+g+b)
y                            ..FV...... filter luma plane
u                            ..FV...... filter u plane
v                            ..FV...... filter v plane
r                            ..FV...... filter red plane
g                            ..FV...... filter green plane
b                            ..FV...... filter blue plane

This filter has support for timeline through the 'enable' option.

```
 * */
class edgedetect(
    val high : Any? = null,
    val low : Any? = null,
    val mode : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [edgedetect] を参照してください */
fun String.edgedetect(high : Any? = null, low : Any? = null, mode : Any? = null, planes : Any? = null) : edgedetect {
    return edgedetect(high, low, mode, planes, "", "").apply { setInputs(this@edgedetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( elbg )](https://ffmpeg.org/ffmpeg-filters.html#elbg)

```
Filter elbg
Apply posterize effect, using the ELBG algorithm.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
elbg AVOptions:
codebook_length   <int>        ..FV...... set codebook length (from 1 to INT_MAX) (default 256)
l                 <int>        ..FV...... set codebook length (from 1 to INT_MAX) (default 256)
nb_steps          <int>        ..FV...... set max number of steps used to compute the mapping (from 1 to INT_MAX) (default 1)
n                 <int>        ..FV...... set max number of steps used to compute the mapping (from 1 to INT_MAX) (default 1)
seed              <int64>      ..FV...... set the random seed (from -1 to UINT32_MAX) (default -1)
s                 <int64>      ..FV...... set the random seed (from -1 to UINT32_MAX) (default -1)
pal8              <boolean>    ..FV...... set the pal8 output (default false)


```
 * */
class elbg(
    val codebook_length : Any? = null,
    val nb_steps : Any? = null,
    val seed : Any? = null,
    val pal8 : Any? = null,
    val l : Any? = null,
    val n : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [elbg] を参照してください */
fun String.elbg(codebook_length : Any? = null, nb_steps : Any? = null, seed : Any? = null, pal8 : Any? = null, l : Any? = null, n : Any? = null, s : Any? = null) : elbg {
    return elbg(codebook_length, nb_steps, seed, pal8, l, n, s, "", "").apply { setInputs(this@elbg) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( entropy )](https://ffmpeg.org/ffmpeg-filters.html#entropy)

```
Filter entropy
Measure video frames entropy.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
entropy AVOptions:
mode              <int>        ..FV...... set kind of histogram entropy measurement (from 0 to 1) (default normal)
normal          0            ..FV......
diff            1            ..FV......

This filter has support for timeline through the 'enable' option.

```
 * */
class entropy(
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [entropy] を参照してください */
fun String.entropy(mode : Any? = null) : entropy {
    return entropy(mode, "", "").apply { setInputs(this@entropy) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( eq )](https://ffmpeg.org/ffmpeg-filters.html#eq)

```
Filter eq
Adjust brightness, contrast, gamma, and saturation.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
eq AVOptions:
contrast          <string>     ..FV.....T set the contrast adjustment, negative values give a negative image (default "1.0")
brightness        <string>     ..FV.....T set the brightness adjustment (default "0.0")
saturation        <string>     ..FV.....T set the saturation adjustment (default "1.0")
gamma             <string>     ..FV.....T set the initial gamma value (default "1.0")
gamma_r           <string>     ..FV.....T gamma value for red (default "1.0")
gamma_g           <string>     ..FV.....T gamma value for green (default "1.0")
gamma_b           <string>     ..FV.....T gamma value for blue (default "1.0")
gamma_weight      <string>     ..FV.....T set the gamma weight which reduces the effect of gamma on bright areas (default "1.0")
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions per-frame

This filter has support for timeline through the 'enable' option.

```
 * */
class eq(
    val contrast : Any? = null,
    val brightness : Any? = null,
    val saturation : Any? = null,
    val gamma : Any? = null,
    val gamma_r : Any? = null,
    val gamma_g : Any? = null,
    val gamma_b : Any? = null,
    val gamma_weight : Any? = null,
    val eval : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [eq] を参照してください */
fun String.eq(contrast : Any? = null, brightness : Any? = null, saturation : Any? = null, gamma : Any? = null, gamma_r : Any? = null, gamma_g : Any? = null, gamma_b : Any? = null, gamma_weight : Any? = null, eval : Any? = null) : eq {
    return eq(contrast, brightness, saturation, gamma, gamma_r, gamma_g, gamma_b, gamma_weight, eval, "", "").apply { setInputs(this@eq) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( erosion )](https://ffmpeg.org/ffmpeg-filters.html#erosion)

```
Filter erosion
Apply erosion effect.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
erosion AVOptions:
threshold0        <int>        ..FV.....T set threshold for 1st plane (from 0 to 65535) (default 65535)
threshold1        <int>        ..FV.....T set threshold for 2nd plane (from 0 to 65535) (default 65535)
threshold2        <int>        ..FV.....T set threshold for 3rd plane (from 0 to 65535) (default 65535)
threshold3        <int>        ..FV.....T set threshold for 4th plane (from 0 to 65535) (default 65535)
coordinates       <int>        ..FV.....T set coordinates (from 0 to 255) (default 255)

This filter has support for timeline through the 'enable' option.

```
 * */
class erosion(
    val threshold0 : Any? = null,
    val threshold1 : Any? = null,
    val threshold2 : Any? = null,
    val threshold3 : Any? = null,
    val coordinates : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [erosion] を参照してください */
fun String.erosion(threshold0 : Any? = null, threshold1 : Any? = null, threshold2 : Any? = null, threshold3 : Any? = null, coordinates : Any? = null) : erosion {
    return erosion(threshold0, threshold1, threshold2, threshold3, coordinates, "", "").apply { setInputs(this@erosion) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( extractplanes )](https://ffmpeg.org/ffmpeg-filters.html#extractplanes)

```
Filter extractplanes
Extract planes as grayscale frames.
Inputs:
#0: default (video)
Outputs:
dynamic (depending on the options)
extractplanes AVOptions:
planes            <flags>      ..FV...... set planes (default r)
y                            ..FV...... set luma plane
u                            ..FV...... set u plane
v                            ..FV...... set v plane
r                            ..FV...... set red plane
g                            ..FV...... set green plane
b                            ..FV...... set blue plane
a                            ..FV...... set alpha plane


```
 * */
class extractplanes(
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [extractplanes] を参照してください */
fun String.extractplanes(planes : Any? = null) : extractplanes {
    return extractplanes(planes, "", "").apply { setInputs(this@extractplanes) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fade )](https://ffmpeg.org/ffmpeg-filters.html#fade)

```
Filter fade
Fade in/out input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fade AVOptions:
type              <int>        ..FV...... set the fade direction (from 0 to 1) (default in)
in              0            ..FV...... fade-in
out             1            ..FV...... fade-out
t                 <int>        ..FV...... set the fade direction (from 0 to 1) (default in)
in              0            ..FV...... fade-in
out             1            ..FV...... fade-out
start_frame       <int>        ..FV...... Number of the first frame to which to apply the effect. (from 0 to INT_MAX) (default 0)
s                 <int>        ..FV...... Number of the first frame to which to apply the effect. (from 0 to INT_MAX) (default 0)
nb_frames         <int>        ..FV...... Number of frames to which the effect should be applied. (from 1 to INT_MAX) (default 25)
n                 <int>        ..FV...... Number of frames to which the effect should be applied. (from 1 to INT_MAX) (default 25)
alpha             <boolean>    ..FV...... fade alpha if it is available on the input (default false)
start_time        <duration>   ..FV...... Number of seconds of the beginning of the effect. (default 0)
st                <duration>   ..FV...... Number of seconds of the beginning of the effect. (default 0)
duration          <duration>   ..FV...... Duration of the effect in seconds. (default 0)
d                 <duration>   ..FV...... Duration of the effect in seconds. (default 0)
color             <color>      ..FV...... set color (default "black")
c                 <color>      ..FV...... set color (default "black")


```
 * */
class fade(
    val type : Any? = null,
    val start_frame : Any? = null,
    val nb_frames : Any? = null,
    val alpha : Any? = null,
    val start_time : Any? = null,
    val duration : Any? = null,
    val color : Any? = null,
    val t : Any? = null,
    val s : Any? = null,
    val n : Any? = null,
    val st : Any? = null,
    val d : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fade] を参照してください */
fun String.fade(type : Any? = null, start_frame : Any? = null, nb_frames : Any? = null, alpha : Any? = null, start_time : Any? = null, duration : Any? = null, color : Any? = null, t : Any? = null, s : Any? = null, n : Any? = null, st : Any? = null, d : Any? = null, c : Any? = null) : fade {
    return fade(type, start_frame, nb_frames, alpha, start_time, duration, color, t, s, n, st, d, c, "", "").apply { setInputs(this@fade) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fftdnoiz )](https://ffmpeg.org/ffmpeg-filters.html#fftdnoiz)

```
Filter fftdnoiz
Denoise frames using 3D FFT.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fftdnoiz AVOptions:
sigma             <float>      ..FV...... set denoise strength (from 0 to 30) (default 1)
amount            <float>      ..FV...... set amount of denoising (from 0.01 to 1) (default 1)
block             <int>        ..FV...... set block log2(size) (from 3 to 6) (default 4)
overlap           <float>      ..FV...... set block overlap (from 0.2 to 0.8) (default 0.5)
prev              <int>        ..FV...... set number of previous frames for temporal denoising (from 0 to 1) (default 0)
next              <int>        ..FV...... set number of next frames for temporal denoising (from 0 to 1) (default 0)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 7)

This filter has support for timeline through the 'enable' option.

```
 * */
class fftdnoiz(
    val sigma : Any? = null,
    val amount : Any? = null,
    val block : Any? = null,
    val overlap : Any? = null,
    val prev : Any? = null,
    val next : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fftdnoiz] を参照してください */
fun String.fftdnoiz(sigma : Any? = null, amount : Any? = null, block : Any? = null, overlap : Any? = null, prev : Any? = null, next : Any? = null, planes : Any? = null) : fftdnoiz {
    return fftdnoiz(sigma, amount, block, overlap, prev, next, planes, "", "").apply { setInputs(this@fftdnoiz) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fftfilt )](https://ffmpeg.org/ffmpeg-filters.html#fftfilt)

```
Filter fftfilt
Apply arbitrary expressions to pixels in frequency domain.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fftfilt AVOptions:
dc_Y              <int>        ..FV...... adjust gain in Y plane (from 0 to 1000) (default 0)
dc_U              <int>        ..FV...... adjust gain in U plane (from 0 to 1000) (default 0)
dc_V              <int>        ..FV...... adjust gain in V plane (from 0 to 1000) (default 0)
weight_Y          <string>     ..FV...... set luminance expression in Y plane (default "1")
weight_U          <string>     ..FV...... set chrominance expression in U plane
weight_V          <string>     ..FV...... set chrominance expression in V plane
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions per-frame

This filter has support for timeline through the 'enable' option.

```
 * */
class fftfilt(
    val dc_Y : Any? = null,
    val dc_U : Any? = null,
    val dc_V : Any? = null,
    val weight_Y : Any? = null,
    val weight_U : Any? = null,
    val weight_V : Any? = null,
    val eval : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fftfilt] を参照してください */
fun String.fftfilt(dc_Y : Any? = null, dc_U : Any? = null, dc_V : Any? = null, weight_Y : Any? = null, weight_U : Any? = null, weight_V : Any? = null, eval : Any? = null) : fftfilt {
    return fftfilt(dc_Y, dc_U, dc_V, weight_Y, weight_U, weight_V, eval, "", "").apply { setInputs(this@fftfilt) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( field )](https://ffmpeg.org/ffmpeg-filters.html#field)

```
Filter field
Extract a field from the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
field AVOptions:
type              <int>        ..FV...... set field type (top or bottom) (from 0 to 1) (default top)
top             0            ..FV...... select top field
bottom          1            ..FV...... select bottom field


```
 * */
class field(
    val type : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [field] を参照してください */
fun String.field(type : Any? = null) : field {
    return field(type, "", "").apply { setInputs(this@field) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fieldhint )](https://ffmpeg.org/ffmpeg-filters.html#fieldhint)

```
Filter fieldhint
Field matching using hints.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fieldhint AVOptions:
hint              <string>     ..FV...... set hint file
mode              <int>        ..FV...... set hint mode (from 0 to 1) (default absolute)
absolute        0            ..FV......
relative        1            ..FV......


```
 * */
class fieldhint(
    val hint : Any? = null,
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fieldhint] を参照してください */
fun String.fieldhint(hint : Any? = null, mode : Any? = null) : fieldhint {
    return fieldhint(hint, mode, "", "").apply { setInputs(this@fieldhint) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fieldmatch )](https://ffmpeg.org/ffmpeg-filters.html#fieldmatch)

```
Filter fieldmatch
Field matching for inverse telecine.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
fieldmatch AVOptions:
order             <int>        ..FV...... specify the assumed field order (from -1 to 1) (default auto)
auto            -1           ..FV...... auto detect parity
bff             0            ..FV...... assume bottom field first
tff             1            ..FV...... assume top field first
mode              <int>        ..FV...... set the matching mode or strategy to use (from 0 to 5) (default pc_n)
pc              0            ..FV...... 2-way match (p/c)
pc_n            1            ..FV...... 2-way match + 3rd match on combed (p/c + u)
pc_u            2            ..FV...... 2-way match + 3rd match (same order) on combed (p/c + u)
pc_n_ub         3            ..FV...... 2-way match + 3rd match on combed + 4th/5th matches if still combed (p/c + u + u/b)
pcn             4            ..FV...... 3-way match (p/c/n)
pcn_ub          5            ..FV...... 3-way match + 4th/5th matches on combed (p/c/n + u/b)
ppsrc             <boolean>    ..FV...... mark main input as a pre-processed input and activate clean source input stream (default false)
field             <int>        ..FV...... set the field to match from (from -1 to 1) (default auto)
auto            -1           ..FV...... automatic (same value as 'order')
bottom          0            ..FV...... bottom field
top             1            ..FV...... top field
mchroma           <boolean>    ..FV...... set whether or not chroma is included during the match comparisons (default true)
y0                <int>        ..FV...... define an exclusion band which excludes the lines between y0 and y1 from the field matching decision (from 0 to INT_MAX) (default 0)
y1                <int>        ..FV...... define an exclusion band which excludes the lines between y0 and y1 from the field matching decision (from 0 to INT_MAX) (default 0)
scthresh          <double>     ..FV...... set scene change detection threshold (from 0 to 100) (default 12)
combmatch         <int>        ..FV...... set combmatching mode (from 0 to 2) (default sc)
none            0            ..FV...... disable combmatching
sc              1            ..FV...... enable combmatching only on scene change
full            2            ..FV...... enable combmatching all the time
combdbg           <int>        ..FV...... enable comb debug (from 0 to 2) (default none)
none            0            ..FV...... no forced calculation
pcn             1            ..FV...... calculate p/c/n
pcnub           2            ..FV...... calculate p/c/n/u/b
cthresh           <int>        ..FV...... set the area combing threshold used for combed frame detection (from -1 to 255) (default 9)
chroma            <boolean>    ..FV...... set whether or not chroma is considered in the combed frame decision (default false)
blockx            <int>        ..FV...... set the x-axis size of the window used during combed frame detection (from 4 to 512) (default 16)
blocky            <int>        ..FV...... set the y-axis size of the window used during combed frame detection (from 4 to 512) (default 16)
combpel           <int>        ..FV...... set the number of combed pixels inside any of the blocky by blockx size blocks on the frame for the frame to be detected as combed (from 0 to INT_MAX) (default 80)


```
 * */
class fieldmatch(
    val order : Any? = null,
    val mode : Any? = null,
    val ppsrc : Any? = null,
    val field : Any? = null,
    val mchroma : Any? = null,
    val y0 : Any? = null,
    val scthresh : Any? = null,
    val combmatch : Any? = null,
    val combdbg : Any? = null,
    val cthresh : Any? = null,
    val chroma : Any? = null,
    val blockx : Any? = null,
    val blocky : Any? = null,
    val combpel : Any? = null,
    val y1 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fieldmatch] を参照してください */
fun String.fieldmatch(order : Any? = null, mode : Any? = null, ppsrc : Any? = null, field : Any? = null, mchroma : Any? = null, y0 : Any? = null, scthresh : Any? = null, combmatch : Any? = null, combdbg : Any? = null, cthresh : Any? = null, chroma : Any? = null, blockx : Any? = null, blocky : Any? = null, combpel : Any? = null, y1 : Any? = null) : fieldmatch {
    return fieldmatch(order, mode, ppsrc, field, mchroma, y0, scthresh, combmatch, combdbg, cthresh, chroma, blockx, blocky, combpel, y1, "", "").apply { setInputs(this@fieldmatch) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fieldorder )](https://ffmpeg.org/ffmpeg-filters.html#fieldorder)

```
Filter fieldorder
Set the field order.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fieldorder AVOptions:
order             <int>        ..FV...... output field order (from 0 to 1) (default tff)
bff             0            ..FV...... bottom field first
tff             1            ..FV...... top field first

This filter has support for timeline through the 'enable' option.

```
 * */
class fieldorder(
    val order : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fieldorder] を参照してください */
fun String.fieldorder(order : Any? = null) : fieldorder {
    return fieldorder(order, "", "").apply { setInputs(this@fieldorder) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fillborders )](https://ffmpeg.org/ffmpeg-filters.html#fillborders)

```
Filter fillborders
Fill borders of the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fillborders AVOptions:
left              <int>        ..FV.....T set the left fill border (from 0 to INT_MAX) (default 0)
right             <int>        ..FV.....T set the right fill border (from 0 to INT_MAX) (default 0)
top               <int>        ..FV.....T set the top fill border (from 0 to INT_MAX) (default 0)
bottom            <int>        ..FV.....T set the bottom fill border (from 0 to INT_MAX) (default 0)
mode              <int>        ..FV.....T set the fill borders mode (from 0 to 2) (default smear)
smear           0            ..FV.....T
mirror          1            ..FV.....T
fixed           2            ..FV.....T
color             <color>      ..FV.....T set the color for the fixed mode (default "black")

This filter has support for timeline through the 'enable' option.

```
 * */
class fillborders(
    val left : Any? = null,
    val right : Any? = null,
    val top : Any? = null,
    val bottom : Any? = null,
    val mode : Any? = null,
    val color : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fillborders] を参照してください */
fun String.fillborders(left : Any? = null, right : Any? = null, top : Any? = null, bottom : Any? = null, mode : Any? = null, color : Any? = null) : fillborders {
    return fillborders(left, right, top, bottom, mode, color, "", "").apply { setInputs(this@fillborders) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( find_rect )](https://ffmpeg.org/ffmpeg-filters.html#find_rect)

```
Filter find_rect
Find a user specified object.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
find_rect AVOptions:
object            <string>     ..FV...... object bitmap filename
threshold         <float>      ..FV...... set threshold (from 0 to 1) (default 0.5)
mipmaps           <int>        ..FV...... set mipmaps (from 1 to 5) (default 3)
xmin              <int>        ..FV......  (from 0 to INT_MAX) (default 0)
ymin              <int>        ..FV......  (from 0 to INT_MAX) (default 0)
xmax              <int>        ..FV......  (from 0 to INT_MAX) (default 0)
ymax              <int>        ..FV......  (from 0 to INT_MAX) (default 0)


```
 * */
class find_rect(
    val _object : Any? = null,
    val threshold : Any? = null,
    val mipmaps : Any? = null,
    val xmin : Any? = null,
    val ymin : Any? = null,
    val xmax : Any? = null,
    val ymax : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [find_rect] を参照してください */
fun String.find_rect(_object : Any? = null, threshold : Any? = null, mipmaps : Any? = null, xmin : Any? = null, ymin : Any? = null, xmax : Any? = null, ymax : Any? = null) : find_rect {
    return find_rect(_object, threshold, mipmaps, xmin, ymin, xmax, ymax, "", "").apply { setInputs(this@find_rect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( floodfill )](https://ffmpeg.org/ffmpeg-filters.html#floodfill)

```
Filter floodfill
Fill area with same color with another color.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
floodfill AVOptions:
x                 <int>        ..FV...... set pixel x coordinate (from 0 to 65535) (default 0)
y                 <int>        ..FV...... set pixel y coordinate (from 0 to 65535) (default 0)
s0                <int>        ..FV...... set source #0 component value (from -1 to 65535) (default 0)
s1                <int>        ..FV...... set source #1 component value (from -1 to 65535) (default 0)
s2                <int>        ..FV...... set source #2 component value (from -1 to 65535) (default 0)
s3                <int>        ..FV...... set source #3 component value (from -1 to 65535) (default 0)
d0                <int>        ..FV...... set destination #0 component value (from 0 to 65535) (default 0)
d1                <int>        ..FV...... set destination #1 component value (from 0 to 65535) (default 0)
d2                <int>        ..FV...... set destination #2 component value (from 0 to 65535) (default 0)
d3                <int>        ..FV...... set destination #3 component value (from 0 to 65535) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class floodfill(
    val x : Any? = null,
    val y : Any? = null,
    val s0 : Any? = null,
    val s1 : Any? = null,
    val s2 : Any? = null,
    val s3 : Any? = null,
    val d0 : Any? = null,
    val d1 : Any? = null,
    val d2 : Any? = null,
    val d3 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [floodfill] を参照してください */
fun String.floodfill(x : Any? = null, y : Any? = null, s0 : Any? = null, s1 : Any? = null, s2 : Any? = null, s3 : Any? = null, d0 : Any? = null, d1 : Any? = null, d2 : Any? = null, d3 : Any? = null) : floodfill {
    return floodfill(x, y, s0, s1, s2, s3, d0, d1, d2, d3, "", "").apply { setInputs(this@floodfill) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( format )](https://ffmpeg.org/ffmpeg-filters.html#format)

```
Filter format
Convert the input video to one of the specified pixel formats.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
format AVOptions:
pix_fmts          <string>     ..FV...... A '|'-separated list of pixel formats


```
 * */
class format_(
    val pix_fmts : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [format_] を参照してください */
fun String.format_(pix_fmts : Any? = null) : format_ {
    return format_(pix_fmts, "", "").apply { setInputs(this@format_) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fps )](https://ffmpeg.org/ffmpeg-filters.html#fps)

```
Filter fps
Force constant framerate.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fps AVOptions:
fps               <video_rate> ..FV...... A string describing desired output framerate (default "25")
start_time        <double>     ..FV...... Assume the first PTS should be this value. (from -DBL_MAX to DBL_MAX) (default DBL_MAX)
round             <int>        ..FV...... set rounding method for timestamps (from 0 to 5) (default near)
zero            0            ..FV...... round towards 0
inf             1            ..FV...... round away from 0
down            2            ..FV...... round towards -infty
up              3            ..FV...... round towards +infty
near            5            ..FV...... round to nearest
eof_action        <int>        ..FV...... action performed for last frame (from 0 to 1) (default round)
round           0            ..FV...... round similar to other frames
pass            1            ..FV...... pass through last frame


```
 * */
class fps(
    val fps : Any? = null,
    val start_time : Any? = null,
    val round : Any? = null,
    val eof_action : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fps] を参照してください */
fun String.fps(fps : Any? = null, start_time : Any? = null, round : Any? = null, eof_action : Any? = null) : fps {
    return fps(fps, start_time, round, eof_action, "", "").apply { setInputs(this@fps) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( framepack )](https://ffmpeg.org/ffmpeg-filters.html#framepack)

```
Filter framepack
Generate a frame packed stereoscopic video.
Inputs:
#0: left (video)
#1: right (video)
Outputs:
#0: packed (video)
framepack AVOptions:
format            <int>        ..FV...... Frame pack output format (from 0 to INT_MAX) (default sbs)
sbs             1            ..FV...... Views are packed next to each other
tab             2            ..FV...... Views are packed on top of each other
frameseq        3            ..FV...... Views are one after the other
lines           6            ..FV...... Views are interleaved by lines
columns         7            ..FV...... Views are interleaved by columns


```
 * */
class framepack(
    val _format : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [framepack] を参照してください */
fun String.framepack(_format : Any? = null) : framepack {
    return framepack(_format, "", "").apply { setInputs(this@framepack) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( framerate )](https://ffmpeg.org/ffmpeg-filters.html#framerate)

```
Filter framerate
Upsamples or downsamples progressive source between specified frame rates.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
framerate AVOptions:
fps               <video_rate> ..FV...... required output frames per second rate (default "50")
interp_start      <int>        ..FV...... point to start linear interpolation (from 0 to 255) (default 15)
interp_end        <int>        ..FV...... point to end linear interpolation (from 0 to 255) (default 240)
scene             <double>     ..FV...... scene change level (from 0 to 100) (default 8.2)
flags             <flags>      ..FV...... set flags (default scene_change_detect+scd)
scene_change_detect              ..FV...... enable scene change detection
scd                          ..FV...... enable scene change detection


```
 * */
class framerate(
    val fps : Any? = null,
    val interp_start : Any? = null,
    val interp_end : Any? = null,
    val scene : Any? = null,
    val flags : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [framerate] を参照してください */
fun String.framerate(fps : Any? = null, interp_start : Any? = null, interp_end : Any? = null, scene : Any? = null, flags : Any? = null) : framerate {
    return framerate(fps, interp_start, interp_end, scene, flags, "", "").apply { setInputs(this@framerate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( framestep )](https://ffmpeg.org/ffmpeg-filters.html#framestep)

```
Filter framestep
Select one frame every N frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
framestep AVOptions:
step              <int>        ..FV...... set frame step (from 1 to INT_MAX) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class framestep(
    val step : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [framestep] を参照してください */
fun String.framestep(step : Any? = null) : framestep {
    return framestep(step, "", "").apply { setInputs(this@framestep) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( freezedetect )](https://ffmpeg.org/ffmpeg-filters.html#freezedetect)

```
Filter freezedetect
Detects frozen video input.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
freezedetect AVOptions:
n                 <double>     ..FV...... set noise tolerance (from 0 to 1) (default 0.001)
noise             <double>     ..FV...... set noise tolerance (from 0 to 1) (default 0.001)
d                 <duration>   ..FV...... set minimum duration in seconds (default 2)
duration          <duration>   ..FV...... set minimum duration in seconds (default 2)


```
 * */
class freezedetect(
    val n : Any? = null,
    val noise : Any? = null,
    val d : Any? = null,
    val duration : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [freezedetect] を参照してください */
fun String.freezedetect(n : Any? = null, noise : Any? = null, d : Any? = null, duration : Any? = null) : freezedetect {
    return freezedetect(n, noise, d, duration, "", "").apply { setInputs(this@freezedetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( freezeframes )](https://ffmpeg.org/ffmpeg-filters.html#freezeframes)

```
Filter freezeframes
Freeze video frames.
Inputs:
#0: source (video)
#1: replace (video)
Outputs:
#0: default (video)
freezeframes AVOptions:
first             <int64>      ..FV...... set first frame to freeze (from 0 to I64_MAX) (default 0)
last              <int64>      ..FV...... set last frame to freeze (from 0 to I64_MAX) (default 0)
replace           <int64>      ..FV...... set frame to replace (from 0 to I64_MAX) (default 0)


```
 * */
class freezeframes(
    val first : Any? = null,
    val last : Any? = null,
    val replace : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [freezeframes] を参照してください */
fun String.freezeframes(first : Any? = null, last : Any? = null, replace : Any? = null) : freezeframes {
    return freezeframes(first, last, replace, "", "").apply { setInputs(this@freezeframes) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( fspp )](https://ffmpeg.org/ffmpeg-filters.html#fspp)

```
Filter fspp
Apply Fast Simple Post-processing filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
fspp AVOptions:
quality           <int>        ..FV...... set quality (from 4 to 5) (default 4)
qp                <int>        ..FV...... force a constant quantizer parameter (from 0 to 64) (default 0)
strength          <int>        ..FV...... set filter strength (from -15 to 32) (default 0)
use_bframe_qp     <boolean>    ..FV...... use B-frames' QP (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class fspp(
    val quality : Any? = null,
    val qp : Any? = null,
    val strength : Any? = null,
    val use_bframe_qp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [fspp] を参照してください */
fun String.fspp(quality : Any? = null, qp : Any? = null, strength : Any? = null, use_bframe_qp : Any? = null) : fspp {
    return fspp(quality, qp, strength, use_bframe_qp, "", "").apply { setInputs(this@fspp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( gblur )](https://ffmpeg.org/ffmpeg-filters.html#gblur)

```
Filter gblur
Apply Gaussian Blur filter.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
gblur AVOptions:
sigma             <float>      ..FV.....T set sigma (from 0 to 1024) (default 0.5)
steps             <int>        ..FV.....T set number of steps (from 1 to 6) (default 1)
planes            <int>        ..FV.....T set planes to filter (from 0 to 15) (default 15)
sigmaV            <float>      ..FV.....T set vertical sigma (from -1 to 1024) (default -1)

This filter has support for timeline through the 'enable' option.

```
 * */
class gblur(
    val sigma : Any? = null,
    val steps : Any? = null,
    val planes : Any? = null,
    val sigmaV : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [gblur] を参照してください */
fun String.gblur(sigma : Any? = null, steps : Any? = null, planes : Any? = null, sigmaV : Any? = null) : gblur {
    return gblur(sigma, steps, planes, sigmaV, "", "").apply { setInputs(this@gblur) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( geq )](https://ffmpeg.org/ffmpeg-filters.html#geq)

```
Filter geq
Apply generic equation to each pixel.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
geq AVOptions:
lum_expr          <string>     ..FV...... set luminance expression
lum               <string>     ..FV...... set luminance expression
cb_expr           <string>     ..FV...... set chroma blue expression
cb                <string>     ..FV...... set chroma blue expression
cr_expr           <string>     ..FV...... set chroma red expression
cr                <string>     ..FV...... set chroma red expression
alpha_expr        <string>     ..FV...... set alpha expression
a                 <string>     ..FV...... set alpha expression
red_expr          <string>     ..FV...... set red expression
r                 <string>     ..FV...... set red expression
green_expr        <string>     ..FV...... set green expression
g                 <string>     ..FV...... set green expression
blue_expr         <string>     ..FV...... set blue expression
b                 <string>     ..FV...... set blue expression
interpolation     <int>        ..FV...... set interpolation method (from 0 to 1) (default bilinear)
nearest         0            ..FV...... nearest interpolation
n               0            ..FV...... nearest interpolation
bilinear        1            ..FV...... bilinear interpolation
b               1            ..FV...... bilinear interpolation
i                 <int>        ..FV...... set interpolation method (from 0 to 1) (default bilinear)
nearest         0            ..FV...... nearest interpolation
n               0            ..FV...... nearest interpolation
bilinear        1            ..FV...... bilinear interpolation
b               1            ..FV...... bilinear interpolation

This filter has support for timeline through the 'enable' option.

```
 * */
class geq(
    val lum_expr : Any? = null,
    val lum : Any? = null,
    val cb_expr : Any? = null,
    val cr_expr : Any? = null,
    val alpha_expr : Any? = null,
    val red_expr : Any? = null,
    val green_expr : Any? = null,
    val blue_expr : Any? = null,
    val interpolation : Any? = null,
    val cb : Any? = null,
    val cr : Any? = null,
    val a : Any? = null,
    val r : Any? = null,
    val g : Any? = null,
    val b : Any? = null,
    val i : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [geq] を参照してください */
fun String.geq(lum_expr : Any? = null, lum : Any? = null, cb_expr : Any? = null, cr_expr : Any? = null, alpha_expr : Any? = null, red_expr : Any? = null, green_expr : Any? = null, blue_expr : Any? = null, interpolation : Any? = null, cb : Any? = null, cr : Any? = null, a : Any? = null, r : Any? = null, g : Any? = null, b : Any? = null, i : Any? = null) : geq {
    return geq(lum_expr, lum, cb_expr, cr_expr, alpha_expr, red_expr, green_expr, blue_expr, interpolation, cb, cr, a, r, g, b, i, "", "").apply { setInputs(this@geq) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( gradfun )](https://ffmpeg.org/ffmpeg-filters.html#gradfun)

```
Filter gradfun
Debands video quickly using gradients.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
gradfun AVOptions:
strength          <float>      ..FV...... The maximum amount by which the filter will change any one pixel. (from 0.51 to 64) (default 1.2)
radius            <int>        ..FV...... The neighborhood to fit the gradient to. (from 4 to 32) (default 16)

This filter has support for timeline through the 'enable' option.

```
 * */
class gradfun(
    val strength : Any? = null,
    val radius : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [gradfun] を参照してください */
fun String.gradfun(strength : Any? = null, radius : Any? = null) : gradfun {
    return gradfun(strength, radius, "", "").apply { setInputs(this@gradfun) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( graphmonitor )](https://ffmpeg.org/ffmpeg-filters.html#graphmonitor)

```
Filter graphmonitor
Show various filtergraph stats.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
graphmonitor AVOptions:
size              <image_size> ..FV...... set monitor size (default "hd720")
s                 <image_size> ..FV...... set monitor size (default "hd720")
opacity           <float>      ..FV...... set video opacity (from 0 to 1) (default 0.9)
o                 <float>      ..FV...... set video opacity (from 0 to 1) (default 0.9)
mode              <int>        ..FV...... set mode (from 0 to 1) (default full)
full            0            ..FV......
compact         1            ..FV......
m                 <int>        ..FV...... set mode (from 0 to 1) (default full)
full            0            ..FV......
compact         1            ..FV......
flags             <flags>      ..FV...... set flags (default queue)
queue                        ..FV......
frame_count_in               ..FV......
frame_count_out              ..FV......
pts                          ..FV......
time                         ..FV......
timebase                     ..FV......
format                       ..FV......
size                         ..FV......
rate                         ..FV......
f                 <flags>      ..FV...... set flags (default queue)
queue                        ..FV......
frame_count_in               ..FV......
frame_count_out              ..FV......
pts                          ..FV......
time                         ..FV......
timebase                     ..FV......
format                       ..FV......
size                         ..FV......
rate                         ..FV......
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")


```
 * */
class graphmonitor(
    val size : Any? = null,
    val opacity : Any? = null,
    val mode : Any? = null,
    val flags : Any? = null,
    val rate : Any? = null,
    val s : Any? = null,
    val o : Any? = null,
    val m : Any? = null,
    val f : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [graphmonitor] を参照してください */
fun String.graphmonitor(size : Any? = null, opacity : Any? = null, mode : Any? = null, flags : Any? = null, rate : Any? = null, s : Any? = null, o : Any? = null, m : Any? = null, f : Any? = null, r : Any? = null) : graphmonitor {
    return graphmonitor(size, opacity, mode, flags, rate, s, o, m, f, r, "", "").apply { setInputs(this@graphmonitor) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( greyedge )](https://ffmpeg.org/ffmpeg-filters.html#greyedge)

```
Filter greyedge
Estimates scene illumination by grey edge assumption.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
greyedge AVOptions:
difford           <int>        ..FV...... set differentiation order (from 0 to 2) (default 1)
minknorm          <int>        ..FV...... set Minkowski norm (from 0 to 20) (default 1)
sigma             <double>     ..FV...... set sigma (from 0 to 1024) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class greyedge(
    val difford : Any? = null,
    val minknorm : Any? = null,
    val sigma : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [greyedge] を参照してください */
fun String.greyedge(difford : Any? = null, minknorm : Any? = null, sigma : Any? = null) : greyedge {
    return greyedge(difford, minknorm, sigma, "", "").apply { setInputs(this@greyedge) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( haldclut )](https://ffmpeg.org/ffmpeg-filters.html#haldclut)

```
Filter haldclut
Adjust colors using a Hald CLUT.
slice threading supported
Inputs:
#0: main (video)
#1: clut (video)
Outputs:
#0: default (video)
haldclut AVOptions:
interp            <int>        ..FV...... select interpolation mode (from 0 to 2) (default tetrahedral)
nearest         0            ..FV...... use values from the nearest defined points
trilinear       1            ..FV...... interpolate values using the 8 points defining a cube
tetrahedral     2            ..FV...... interpolate values using a tetrahedron

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class haldclut(
    val interp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [haldclut] を参照してください */
fun String.haldclut(interp : Any? = null) : haldclut {
    return haldclut(interp, "", "").apply { setInputs(this@haldclut) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hflip )](https://ffmpeg.org/ffmpeg-filters.html#hflip)

```
Filter hflip
Horizontally flip the input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
hflip AVOptions:

This filter has support for timeline through the 'enable' option.

```
 * */
class hflip(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hflip] を参照してください */
fun String.hflip() : hflip {
    return hflip("", "").apply { setInputs(this@hflip) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( histeq )](https://ffmpeg.org/ffmpeg-filters.html#histeq)

```
Filter histeq
Apply global color histogram equalization.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
histeq AVOptions:
strength          <float>      ..FV...... set the strength (from 0 to 1) (default 0.2)
intensity         <float>      ..FV...... set the intensity (from 0 to 1) (default 0.21)
antibanding       <int>        ..FV...... set the antibanding level (from 0 to 2) (default none)
none            0            ..FV...... apply no antibanding
weak            1            ..FV...... apply weak antibanding
strong          2            ..FV...... apply strong antibanding

This filter has support for timeline through the 'enable' option.

```
 * */
class histeq(
    val strength : Any? = null,
    val intensity : Any? = null,
    val antibanding : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [histeq] を参照してください */
fun String.histeq(strength : Any? = null, intensity : Any? = null, antibanding : Any? = null) : histeq {
    return histeq(strength, intensity, antibanding, "", "").apply { setInputs(this@histeq) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( histogram )](https://ffmpeg.org/ffmpeg-filters.html#histogram)

```
Filter histogram
Compute and draw a histogram.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
histogram AVOptions:
level_height      <int>        ..FV...... set level height (from 50 to 2048) (default 200)
scale_height      <int>        ..FV...... set scale height (from 0 to 40) (default 12)
display_mode      <int>        ..FV...... set display mode (from 0 to 2) (default stack)
overlay         0            ..FV......
parade          1            ..FV......
stack           2            ..FV......
d                 <int>        ..FV...... set display mode (from 0 to 2) (default stack)
overlay         0            ..FV......
parade          1            ..FV......
stack           2            ..FV......
levels_mode       <int>        ..FV...... set levels mode (from 0 to 1) (default linear)
linear          0            ..FV......
logarithmic     1            ..FV......
m                 <int>        ..FV...... set levels mode (from 0 to 1) (default linear)
linear          0            ..FV......
logarithmic     1            ..FV......
components        <int>        ..FV...... set color components to display (from 1 to 15) (default 7)
c                 <int>        ..FV...... set color components to display (from 1 to 15) (default 7)
fgopacity         <float>      ..FV...... set foreground opacity (from 0 to 1) (default 0.7)
f                 <float>      ..FV...... set foreground opacity (from 0 to 1) (default 0.7)
bgopacity         <float>      ..FV...... set background opacity (from 0 to 1) (default 0.5)
b                 <float>      ..FV...... set background opacity (from 0 to 1) (default 0.5)


```
 * */
class histogram(
    val level_height : Any? = null,
    val scale_height : Any? = null,
    val display_mode : Any? = null,
    val levels_mode : Any? = null,
    val components : Any? = null,
    val fgopacity : Any? = null,
    val bgopacity : Any? = null,
    val d : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val f : Any? = null,
    val b : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [histogram] を参照してください */
fun String.histogram(level_height : Any? = null, scale_height : Any? = null, display_mode : Any? = null, levels_mode : Any? = null, components : Any? = null, fgopacity : Any? = null, bgopacity : Any? = null, d : Any? = null, m : Any? = null, c : Any? = null, f : Any? = null, b : Any? = null) : histogram {
    return histogram(level_height, scale_height, display_mode, levels_mode, components, fgopacity, bgopacity, d, m, c, f, b, "", "").apply { setInputs(this@histogram) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hqdn3d )](https://ffmpeg.org/ffmpeg-filters.html#hqdn3d)

```
Filter hqdn3d
Apply a High Quality 3D Denoiser.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
hqdn3d AVOptions:
luma_spatial      <double>     ..FV.....T spatial luma strength (from 0 to DBL_MAX) (default 0)
chroma_spatial    <double>     ..FV.....T spatial chroma strength (from 0 to DBL_MAX) (default 0)
luma_tmp          <double>     ..FV.....T temporal luma strength (from 0 to DBL_MAX) (default 0)
chroma_tmp        <double>     ..FV.....T temporal chroma strength (from 0 to DBL_MAX) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class hqdn3d(
    val luma_spatial : Any? = null,
    val chroma_spatial : Any? = null,
    val luma_tmp : Any? = null,
    val chroma_tmp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hqdn3d] を参照してください */
fun String.hqdn3d(luma_spatial : Any? = null, chroma_spatial : Any? = null, luma_tmp : Any? = null, chroma_tmp : Any? = null) : hqdn3d {
    return hqdn3d(luma_spatial, chroma_spatial, luma_tmp, chroma_tmp, "", "").apply { setInputs(this@hqdn3d) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hqx )](https://ffmpeg.org/ffmpeg-filters.html#hqx)

```
Filter hqx
Scale the input by 2, 3 or 4 using the hq*x magnification algorithm.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
hqx AVOptions:
n                 <int>        ..FV...... set scale factor (from 2 to 4) (default 3)


```
 * */
class hqx(
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hqx] を参照してください */
fun String.hqx(n : Any? = null) : hqx {
    return hqx(n, "", "").apply { setInputs(this@hqx) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hstack )](https://ffmpeg.org/ffmpeg-filters.html#hstack)

```
Filter hstack
Stack video inputs horizontally.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
hstack AVOptions:
inputs            <int>        ..FV...... set number of inputs (from 2 to INT_MAX) (default 2)
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)


```
 * */
class hstack(
    val inputs : Any? = null,
    val shortest : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hstack] を参照してください */
fun String.hstack(inputs : Any? = null, shortest : Any? = null) : hstack {
    return hstack(inputs, shortest, "", "").apply { setInputs(this@hstack) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hue )](https://ffmpeg.org/ffmpeg-filters.html#hue)

```
Filter hue
Adjust the hue and saturation of the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
hue AVOptions:
h                 <string>     ..FV.....T set the hue angle degrees expression
s                 <string>     ..FV.....T set the saturation expression (default "1")
H                 <string>     ..FV.....T set the hue angle radians expression
b                 <string>     ..FV.....T set the brightness expression (default "0")

This filter has support for timeline through the 'enable' option.

```
 * */
class hue(
    val h : Any? = null,
    val s : Any? = null,
    val _H : Any? = null,
    val b : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hue] を参照してください */
fun String.hue(h : Any? = null, s : Any? = null, _H : Any? = null, b : Any? = null) : hue {
    return hue(h, s, _H, b, "", "").apply { setInputs(this@hue) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hwdownload )](https://ffmpeg.org/ffmpeg-filters.html#hwdownload)

```
Filter hwdownload
Download a hardware frame to a normal frame
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class hwdownload(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hwdownload] を参照してください */
fun String.hwdownload() : hwdownload {
    return hwdownload("", "").apply { setInputs(this@hwdownload) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hwmap )](https://ffmpeg.org/ffmpeg-filters.html#hwmap)

```
Filter hwmap
Map hardware frames
Inputs:
#0: default (video)
Outputs:
#0: default (video)
hwmap AVOptions:
mode              <flags>      ..FV...... Frame mapping mode (default read+write)
read                         ..FV...... Mapping should be readable
write                        ..FV...... Mapping should be writeable
overwrite                    ..FV...... Mapping will always overwrite the entire frame
direct                       ..FV...... Mapping should not involve any copying
derive_device     <string>     ..FV...... Derive a new device of this type
reverse           <int>        ..FV...... Map in reverse (create and allocate in the sink) (from 0 to 1) (default 0)


```
 * */
class hwmap(
    val mode : Any? = null,
    val derive_device : Any? = null,
    val reverse : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hwmap] を参照してください */
fun String.hwmap(mode : Any? = null, derive_device : Any? = null, reverse : Any? = null) : hwmap {
    return hwmap(mode, derive_device, reverse, "", "").apply { setInputs(this@hwmap) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hwupload )](https://ffmpeg.org/ffmpeg-filters.html#hwupload)

```
Filter hwupload
Upload a normal frame to a hardware frame
Inputs:
#0: default (video)
Outputs:
#0: default (video)
hwupload AVOptions:
derive_device     <string>     ..FV...... Derive a new device of this type


```
 * */
class hwupload(
    val derive_device : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hwupload] を参照してください */
fun String.hwupload(derive_device : Any? = null) : hwupload {
    return hwupload(derive_device, "", "").apply { setInputs(this@hwupload) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hwupload_cuda )](https://ffmpeg.org/ffmpeg-filters.html#hwupload_cuda)

```
Filter hwupload_cuda
Upload a system memory frame to a CUDA device.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
cudaupload AVOptions:
device            <int>        ..FV...... Number of the device to use (from 0 to INT_MAX) (default 0)


```
 * */
class hwupload_cuda(
    val device : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hwupload_cuda] を参照してください */
fun String.hwupload_cuda(device : Any? = null) : hwupload_cuda {
    return hwupload_cuda(device, "", "").apply { setInputs(this@hwupload_cuda) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( hysteresis )](https://ffmpeg.org/ffmpeg-filters.html#hysteresis)

```
Filter hysteresis
Grow first stream into second stream by connecting components.
Inputs:
#0: base (video)
#1: alt (video)
Outputs:
#0: default (video)
hysteresis AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)
threshold         <int>        ..FV...... set threshold (from 0 to 65535) (default 0)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class hysteresis(
    val planes : Any? = null,
    val threshold : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [hysteresis] を参照してください */
fun String.hysteresis(planes : Any? = null, threshold : Any? = null) : hysteresis {
    return hysteresis(planes, threshold, "", "").apply { setInputs(this@hysteresis) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( idet )](https://ffmpeg.org/ffmpeg-filters.html#idet)

```
Filter idet
Interlace detect Filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
idet AVOptions:
intl_thres        <float>      ..FV...... set interlacing threshold (from -1 to FLT_MAX) (default 1.04)
prog_thres        <float>      ..FV...... set progressive threshold (from -1 to FLT_MAX) (default 1.5)
rep_thres         <float>      ..FV...... set repeat threshold (from -1 to FLT_MAX) (default 3)
half_life         <float>      ..FV...... half life of cumulative statistics (from -1 to INT_MAX) (default 0)
analyze_interlaced_flag <int>        ..FV...... set number of frames to use to determine if the interlace flag is accurate (from 0 to INT_MAX) (default 0)


```
 * */
class idet(
    val intl_thres : Any? = null,
    val prog_thres : Any? = null,
    val rep_thres : Any? = null,
    val half_life : Any? = null,
    val analyze_interlaced_flag : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [idet] を参照してください */
fun String.idet(intl_thres : Any? = null, prog_thres : Any? = null, rep_thres : Any? = null, half_life : Any? = null, analyze_interlaced_flag : Any? = null) : idet {
    return idet(intl_thres, prog_thres, rep_thres, half_life, analyze_interlaced_flag, "", "").apply { setInputs(this@idet) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( il )](https://ffmpeg.org/ffmpeg-filters.html#il)

```
Filter il
Deinterleave or interleave fields.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
il AVOptions:
luma_mode         <int>        ..FV.....T select luma mode (from 0 to 2) (default none)
none            0            ..FV.....T
interleave      1            ..FV.....T
i               1            ..FV.....T
deinterleave    2            ..FV.....T
d               2            ..FV.....T
l                 <int>        ..FV.....T select luma mode (from 0 to 2) (default none)
none            0            ..FV.....T
interleave      1            ..FV.....T
i               1            ..FV.....T
deinterleave    2            ..FV.....T
d               2            ..FV.....T
chroma_mode       <int>        ..FV.....T select chroma mode (from 0 to 2) (default none)
none            0            ..FV.....T
interleave      1            ..FV.....T
i               1            ..FV.....T
deinterleave    2            ..FV.....T
d               2            ..FV.....T
c                 <int>        ..FV.....T select chroma mode (from 0 to 2) (default none)
none            0            ..FV.....T
interleave      1            ..FV.....T
i               1            ..FV.....T
deinterleave    2            ..FV.....T
d               2            ..FV.....T
alpha_mode        <int>        ..FV.....T select alpha mode (from 0 to 2) (default none)
none            0            ..FV.....T
interleave      1            ..FV.....T
i               1            ..FV.....T
deinterleave    2            ..FV.....T
d               2            ..FV.....T
a                 <int>        ..FV.....T select alpha mode (from 0 to 2) (default none)
none            0            ..FV.....T
interleave      1            ..FV.....T
i               1            ..FV.....T
deinterleave    2            ..FV.....T
d               2            ..FV.....T
luma_swap         <boolean>    ..FV.....T swap luma fields (default false)
ls                <boolean>    ..FV.....T swap luma fields (default false)
chroma_swap       <boolean>    ..FV.....T swap chroma fields (default false)
cs                <boolean>    ..FV.....T swap chroma fields (default false)
alpha_swap        <boolean>    ..FV.....T swap alpha fields (default false)
as                <boolean>    ..FV.....T swap alpha fields (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class il(
    val luma_mode : Any? = null,
    val chroma_mode : Any? = null,
    val alpha_mode : Any? = null,
    val luma_swap : Any? = null,
    val chroma_swap : Any? = null,
    val alpha_swap : Any? = null,
    val l : Any? = null,
    val c : Any? = null,
    val a : Any? = null,
    val ls : Any? = null,
    val cs : Any? = null,
    val _as : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [il] を参照してください */
fun String.il(luma_mode : Any? = null, chroma_mode : Any? = null, alpha_mode : Any? = null, luma_swap : Any? = null, chroma_swap : Any? = null, alpha_swap : Any? = null, l : Any? = null, c : Any? = null, a : Any? = null, ls : Any? = null, cs : Any? = null, _as : Any? = null) : il {
    return il(luma_mode, chroma_mode, alpha_mode, luma_swap, chroma_swap, alpha_swap, l, c, a, ls, cs, _as, "", "").apply { setInputs(this@il) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( inflate )](https://ffmpeg.org/ffmpeg-filters.html#inflate)

```
Filter inflate
Apply inflate effect.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
inflate AVOptions:
threshold0        <int>        ..FV.....T set threshold for 1st plane (from 0 to 65535) (default 65535)
threshold1        <int>        ..FV.....T set threshold for 2nd plane (from 0 to 65535) (default 65535)
threshold2        <int>        ..FV.....T set threshold for 3rd plane (from 0 to 65535) (default 65535)
threshold3        <int>        ..FV.....T set threshold for 4th plane (from 0 to 65535) (default 65535)

This filter has support for timeline through the 'enable' option.

```
 * */
class inflate(
    val threshold0 : Any? = null,
    val threshold1 : Any? = null,
    val threshold2 : Any? = null,
    val threshold3 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [inflate] を参照してください */
fun String.inflate(threshold0 : Any? = null, threshold1 : Any? = null, threshold2 : Any? = null, threshold3 : Any? = null) : inflate {
    return inflate(threshold0, threshold1, threshold2, threshold3, "", "").apply { setInputs(this@inflate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( interlace )](https://ffmpeg.org/ffmpeg-filters.html#interlace)

```
Filter interlace
Convert progressive video into interlaced.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
interlace AVOptions:
scan              <int>        ..FV...... scanning mode (from 0 to 1) (default tff)
tff             0            ..FV...... top field first
bff             1            ..FV...... bottom field first
lowpass           <int>        ..FV...... set vertical low-pass filter (from 0 to 2) (default linear)
off             0            ..FV...... disable vertical low-pass filter
linear          1            ..FV...... linear vertical low-pass filter
complex         2            ..FV...... complex vertical low-pass filter


```
 * */
class interlace(
    val scan : Any? = null,
    val lowpass : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [interlace] を参照してください */
fun String.interlace(scan : Any? = null, lowpass : Any? = null) : interlace {
    return interlace(scan, lowpass, "", "").apply { setInputs(this@interlace) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( interleave )](https://ffmpeg.org/ffmpeg-filters.html#interleave)

```
Filter interleave
Temporally interleave video inputs.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
interleave AVOptions:
nb_inputs         <int>        ..FV...... set number of inputs (from 1 to INT_MAX) (default 2)
n                 <int>        ..FV...... set number of inputs (from 1 to INT_MAX) (default 2)
duration          <int>        ..FV...... how to determine the end-of-stream (from 0 to 2) (default longest)
longest         0            ..FV...... Duration of longest input
shortest        1            ..FV...... Duration of shortest input
first           2            ..FV...... Duration of first input


```
 * */
class interleave(
    val nb_inputs : Any? = null,
    val duration : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [interleave] を参照してください */
fun String.interleave(nb_inputs : Any? = null, duration : Any? = null, n : Any? = null) : interleave {
    return interleave(nb_inputs, duration, n, "", "").apply { setInputs(this@interleave) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( kerndeint )](https://ffmpeg.org/ffmpeg-filters.html#kerndeint)

```
Filter kerndeint
Apply kernel deinterlacing to the input.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
kerndeint AVOptions:
thresh            <int>        ..FV...... set the threshold (from 0 to 255) (default 10)
map               <boolean>    ..FV...... set the map (default false)
order             <boolean>    ..FV...... set the order (default false)
sharp             <boolean>    ..FV...... set sharpening (default false)
twoway            <boolean>    ..FV...... set twoway (default false)


```
 * */
class kerndeint(
    val thresh : Any? = null,
    val map : Any? = null,
    val order : Any? = null,
    val sharp : Any? = null,
    val twoway : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [kerndeint] を参照してください */
fun String.kerndeint(thresh : Any? = null, map : Any? = null, order : Any? = null, sharp : Any? = null, twoway : Any? = null) : kerndeint {
    return kerndeint(thresh, map, order, sharp, twoway, "", "").apply { setInputs(this@kerndeint) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lagfun )](https://ffmpeg.org/ffmpeg-filters.html#lagfun)

```
Filter lagfun
Slowly update darker pixels.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lagfun AVOptions:
decay             <float>      ..FV...... set decay (from 0 to 1) (default 0.95)
planes            <flags>      ..FV...... set what planes to filter (default F)


```
 * */
class lagfun(
    val decay : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lagfun] を参照してください */
fun String.lagfun(decay : Any? = null, planes : Any? = null) : lagfun {
    return lagfun(decay, planes, "", "").apply { setInputs(this@lagfun) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lenscorrection )](https://ffmpeg.org/ffmpeg-filters.html#lenscorrection)

```
Filter lenscorrection
Rectify the image by correcting for lens distortion.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lenscorrection AVOptions:
cx                <double>     ..FV...... set relative center x (from 0 to 1) (default 0.5)
cy                <double>     ..FV...... set relative center y (from 0 to 1) (default 0.5)
k1                <double>     ..FV...... set quadratic distortion factor (from -1 to 1) (default 0)
k2                <double>     ..FV...... set double quadratic distortion factor (from -1 to 1) (default 0)


```
 * */
class lenscorrection(
    val cx : Any? = null,
    val cy : Any? = null,
    val k1 : Any? = null,
    val k2 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lenscorrection] を参照してください */
fun String.lenscorrection(cx : Any? = null, cy : Any? = null, k1 : Any? = null, k2 : Any? = null) : lenscorrection {
    return lenscorrection(cx, cy, k1, k2, "", "").apply { setInputs(this@lenscorrection) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( libvmaf )](https://ffmpeg.org/ffmpeg-filters.html#libvmaf)

```
Filter libvmaf
Calculate the VMAF between two video streams.
Inputs:
#0: main (video)
#1: reference (video)
Outputs:
#0: default (video)
libvmaf AVOptions:
model_path        <string>     ..FV...... Set the model to be used for computing vmaf. (default "/usr/local/share/model/vmaf_v0.6.1.pkl")
log_path          <string>     ..FV...... Set the file path to be used to store logs.
log_fmt           <string>     ..FV...... Set the format of the log (xml or json).
enable_transform  <boolean>    ..FV...... Enables transform for computing vmaf. (default false)
phone_model       <boolean>    ..FV...... Invokes the phone model that will generate higher VMAF scores. (default false)
psnr              <boolean>    ..FV...... Enables computing psnr along with vmaf. (default false)
ssim              <boolean>    ..FV...... Enables computing ssim along with vmaf. (default false)
ms_ssim           <boolean>    ..FV...... Enables computing ms-ssim along with vmaf. (default false)
pool              <string>     ..FV...... Set the pool method to be used for computing vmaf.
n_threads         <int>        ..FV...... Set number of threads to be used when computing vmaf. (from 0 to UINT32_MAX) (default 0)
n_subsample       <int>        ..FV...... Set interval for frame subsampling used when computing vmaf. (from 1 to UINT32_MAX) (default 1)
enable_conf_interval <boolean>    ..FV...... Enables confidence interval. (default false)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)


```
 * */
class libvmaf(
    val model_path : Any? = null,
    val log_path : Any? = null,
    val log_fmt : Any? = null,
    val enable_transform : Any? = null,
    val phone_model : Any? = null,
    val psnr : Any? = null,
    val ssim : Any? = null,
    val ms_ssim : Any? = null,
    val pool : Any? = null,
    val n_threads : Any? = null,
    val n_subsample : Any? = null,
    val enable_conf_interval : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [libvmaf] を参照してください */
fun String.libvmaf(model_path : Any? = null, log_path : Any? = null, log_fmt : Any? = null, enable_transform : Any? = null, phone_model : Any? = null, psnr : Any? = null, ssim : Any? = null, ms_ssim : Any? = null, pool : Any? = null, n_threads : Any? = null, n_subsample : Any? = null, enable_conf_interval : Any? = null) : libvmaf {
    return libvmaf(model_path, log_path, log_fmt, enable_transform, phone_model, psnr, ssim, ms_ssim, pool, n_threads, n_subsample, enable_conf_interval, "", "").apply { setInputs(this@libvmaf) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( limiter )](https://ffmpeg.org/ffmpeg-filters.html#limiter)

```
Filter limiter
Limit pixels components to the specified range.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
limiter AVOptions:
min               <int>        ..FV...... set min value (from 0 to 65535) (default 0)
max               <int>        ..FV...... set max value (from 0 to 65535) (default 65535)
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class limiter(
    val min : Any? = null,
    val max : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [limiter] を参照してください */
fun String.limiter(min : Any? = null, max : Any? = null, planes : Any? = null) : limiter {
    return limiter(min, max, planes, "", "").apply { setInputs(this@limiter) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( loop )](https://ffmpeg.org/ffmpeg-filters.html#loop)

```
Filter loop
Loop video frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
loop AVOptions:
loop              <int>        ..FV...... number of loops (from -1 to INT_MAX) (default 0)
size              <int64>      ..FV...... max number of frames to loop (from 0 to 32767) (default 0)
start             <int64>      ..FV...... set the loop start frame (from 0 to I64_MAX) (default 0)


```
 * */
class loop(
    val loop : Any? = null,
    val size : Any? = null,
    val start : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [loop] を参照してください */
fun String.loop(loop : Any? = null, size : Any? = null, start : Any? = null) : loop {
    return loop(loop, size, start, "", "").apply { setInputs(this@loop) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lumakey )](https://ffmpeg.org/ffmpeg-filters.html#lumakey)

```
Filter lumakey
Turns a certain luma into transparency.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lumakey AVOptions:
threshold         <double>     ..FV.....T set the threshold value (from 0 to 1) (default 0)
tolerance         <double>     ..FV.....T set the tolerance value (from 0 to 1) (default 0.01)
softness          <double>     ..FV.....T set the softness value (from 0 to 1) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class lumakey(
    val threshold : Any? = null,
    val tolerance : Any? = null,
    val softness : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lumakey] を参照してください */
fun String.lumakey(threshold : Any? = null, tolerance : Any? = null, softness : Any? = null) : lumakey {
    return lumakey(threshold, tolerance, softness, "", "").apply { setInputs(this@lumakey) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lut )](https://ffmpeg.org/ffmpeg-filters.html#lut)

```
Filter lut
Compute and apply a lookup table to the RGB/YUV input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lut AVOptions:
c0                <string>     ..FV...... set component #0 expression (default "clipval")
c1                <string>     ..FV...... set component #1 expression (default "clipval")
c2                <string>     ..FV...... set component #2 expression (default "clipval")
c3                <string>     ..FV...... set component #3 expression (default "clipval")
y                 <string>     ..FV...... set Y expression (default "clipval")
u                 <string>     ..FV...... set U expression (default "clipval")
v                 <string>     ..FV...... set V expression (default "clipval")
r                 <string>     ..FV...... set R expression (default "clipval")
g                 <string>     ..FV...... set G expression (default "clipval")
b                 <string>     ..FV...... set B expression (default "clipval")
a                 <string>     ..FV...... set A expression (default "clipval")

This filter has support for timeline through the 'enable' option.

```
 * */
class lut(
    val c0 : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,
    val c3 : Any? = null,
    val y : Any? = null,
    val u : Any? = null,
    val v : Any? = null,
    val r : Any? = null,
    val g : Any? = null,
    val b : Any? = null,
    val a : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lut] を参照してください */
fun String.lut(c0 : Any? = null, c1 : Any? = null, c2 : Any? = null, c3 : Any? = null, y : Any? = null, u : Any? = null, v : Any? = null, r : Any? = null, g : Any? = null, b : Any? = null, a : Any? = null) : lut {
    return lut(c0, c1, c2, c3, y, u, v, r, g, b, a, "", "").apply { setInputs(this@lut) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lut1d )](https://ffmpeg.org/ffmpeg-filters.html#lut1d)

```
Filter lut1d
Adjust colors using a 1D LUT.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lut1d AVOptions:
file              <string>     ..FV...... set 1D LUT file name
interp            <int>        ..FV...... select interpolation mode (from 0 to 4) (default linear)
nearest         0            ..FV...... use values from the nearest defined points
linear          1            ..FV...... use values from the linear interpolation
cosine          3            ..FV...... use values from the cosine interpolation
cubic           2            ..FV...... use values from the cubic interpolation
spline          4            ..FV...... use values from the spline interpolation

This filter has support for timeline through the 'enable' option.

```
 * */
class lut1d(
    val file : Any? = null,
    val interp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lut1d] を参照してください */
fun String.lut1d(file : Any? = null, interp : Any? = null) : lut1d {
    return lut1d(file, interp, "", "").apply { setInputs(this@lut1d) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lut2 )](https://ffmpeg.org/ffmpeg-filters.html#lut2)

```
Filter lut2
Compute and apply a lookup table from two video inputs.
slice threading supported
Inputs:
#0: srcx (video)
#1: srcy (video)
Outputs:
#0: default (video)
lut2 AVOptions:
c0                <string>     ..FV...... set component #0 expression (default "x")
c1                <string>     ..FV...... set component #1 expression (default "x")
c2                <string>     ..FV...... set component #2 expression (default "x")
c3                <string>     ..FV...... set component #3 expression (default "x")
d                 <int>        ..FV...... set output depth (from 0 to 16) (default 0)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class lut2(
    val c0 : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,
    val c3 : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lut2] を参照してください */
fun String.lut2(c0 : Any? = null, c1 : Any? = null, c2 : Any? = null, c3 : Any? = null, d : Any? = null) : lut2 {
    return lut2(c0, c1, c2, c3, d, "", "").apply { setInputs(this@lut2) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lut3d )](https://ffmpeg.org/ffmpeg-filters.html#lut3d)

```
Filter lut3d
Adjust colors using a 3D LUT.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lut3d AVOptions:
file              <string>     ..FV...... set 3D LUT file name
interp            <int>        ..FV...... select interpolation mode (from 0 to 2) (default tetrahedral)
nearest         0            ..FV...... use values from the nearest defined points
trilinear       1            ..FV...... interpolate values using the 8 points defining a cube
tetrahedral     2            ..FV...... interpolate values using a tetrahedron

This filter has support for timeline through the 'enable' option.

```
 * */
class lut3d(
    val file : Any? = null,
    val interp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lut3d] を参照してください */
fun String.lut3d(file : Any? = null, interp : Any? = null) : lut3d {
    return lut3d(file, interp, "", "").apply { setInputs(this@lut3d) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lutrgb )](https://ffmpeg.org/ffmpeg-filters.html#lutrgb)

```
Filter lutrgb
Compute and apply a lookup table to the RGB input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lutrgb AVOptions:
c0                <string>     ..FV...... set component #0 expression (default "clipval")
c1                <string>     ..FV...... set component #1 expression (default "clipval")
c2                <string>     ..FV...... set component #2 expression (default "clipval")
c3                <string>     ..FV...... set component #3 expression (default "clipval")
y                 <string>     ..FV...... set Y expression (default "clipval")
u                 <string>     ..FV...... set U expression (default "clipval")
v                 <string>     ..FV...... set V expression (default "clipval")
r                 <string>     ..FV...... set R expression (default "clipval")
g                 <string>     ..FV...... set G expression (default "clipval")
b                 <string>     ..FV...... set B expression (default "clipval")
a                 <string>     ..FV...... set A expression (default "clipval")

This filter has support for timeline through the 'enable' option.

```
 * */
class lutrgb(
    val c0 : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,
    val c3 : Any? = null,
    val y : Any? = null,
    val u : Any? = null,
    val v : Any? = null,
    val r : Any? = null,
    val g : Any? = null,
    val b : Any? = null,
    val a : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lutrgb] を参照してください */
fun String.lutrgb(c0 : Any? = null, c1 : Any? = null, c2 : Any? = null, c3 : Any? = null, y : Any? = null, u : Any? = null, v : Any? = null, r : Any? = null, g : Any? = null, b : Any? = null, a : Any? = null) : lutrgb {
    return lutrgb(c0, c1, c2, c3, y, u, v, r, g, b, a, "", "").apply { setInputs(this@lutrgb) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( lutyuv )](https://ffmpeg.org/ffmpeg-filters.html#lutyuv)

```
Filter lutyuv
Compute and apply a lookup table to the YUV input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
lutyuv AVOptions:
c0                <string>     ..FV...... set component #0 expression (default "clipval")
c1                <string>     ..FV...... set component #1 expression (default "clipval")
c2                <string>     ..FV...... set component #2 expression (default "clipval")
c3                <string>     ..FV...... set component #3 expression (default "clipval")
y                 <string>     ..FV...... set Y expression (default "clipval")
u                 <string>     ..FV...... set U expression (default "clipval")
v                 <string>     ..FV...... set V expression (default "clipval")
r                 <string>     ..FV...... set R expression (default "clipval")
g                 <string>     ..FV...... set G expression (default "clipval")
b                 <string>     ..FV...... set B expression (default "clipval")
a                 <string>     ..FV...... set A expression (default "clipval")

This filter has support for timeline through the 'enable' option.

```
 * */
class lutyuv(
    val c0 : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,
    val c3 : Any? = null,
    val y : Any? = null,
    val u : Any? = null,
    val v : Any? = null,
    val r : Any? = null,
    val g : Any? = null,
    val b : Any? = null,
    val a : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [lutyuv] を参照してください */
fun String.lutyuv(c0 : Any? = null, c1 : Any? = null, c2 : Any? = null, c3 : Any? = null, y : Any? = null, u : Any? = null, v : Any? = null, r : Any? = null, g : Any? = null, b : Any? = null, a : Any? = null) : lutyuv {
    return lutyuv(c0, c1, c2, c3, y, u, v, r, g, b, a, "", "").apply { setInputs(this@lutyuv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( maskedclamp )](https://ffmpeg.org/ffmpeg-filters.html#maskedclamp)

```
Filter maskedclamp
Clamp first stream with second stream and third stream.
slice threading supported
Inputs:
#0: base (video)
#1: dark (video)
#2: bright (video)
Outputs:
#0: default (video)
maskedclamp AVOptions:
undershoot        <int>        ..FV...... set undershoot (from 0 to 65535) (default 0)
overshoot         <int>        ..FV...... set overshoot (from 0 to 65535) (default 0)
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class maskedclamp(
    val undershoot : Any? = null,
    val overshoot : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [maskedclamp] を参照してください */
fun String.maskedclamp(undershoot : Any? = null, overshoot : Any? = null, planes : Any? = null) : maskedclamp {
    return maskedclamp(undershoot, overshoot, planes, "", "").apply { setInputs(this@maskedclamp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( maskedmax )](https://ffmpeg.org/ffmpeg-filters.html#maskedmax)

```
Filter maskedmax
Apply filtering with maximum difference of two streams.
slice threading supported
Inputs:
#0: source (video)
#1: filter1 (video)
#2: filter2 (video)
Outputs:
#0: default (video)
maskedmax AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class maskedmax(
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [maskedmax] を参照してください */
fun String.maskedmax(planes : Any? = null) : maskedmax {
    return maskedmax(planes, "", "").apply { setInputs(this@maskedmax) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( maskedmerge )](https://ffmpeg.org/ffmpeg-filters.html#maskedmerge)

```
Filter maskedmerge
Merge first stream with second stream using third stream as mask.
slice threading supported
Inputs:
#0: base (video)
#1: overlay (video)
#2: mask (video)
Outputs:
#0: default (video)
maskedmerge AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class maskedmerge(
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [maskedmerge] を参照してください */
fun String.maskedmerge(planes : Any? = null) : maskedmerge {
    return maskedmerge(planes, "", "").apply { setInputs(this@maskedmerge) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( maskedmin )](https://ffmpeg.org/ffmpeg-filters.html#maskedmin)

```
Filter maskedmin
Apply filtering with minimum difference of two streams.
slice threading supported
Inputs:
#0: source (video)
#1: filter1 (video)
#2: filter2 (video)
Outputs:
#0: default (video)
maskedmin AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class maskedmin(
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [maskedmin] を参照してください */
fun String.maskedmin(planes : Any? = null) : maskedmin {
    return maskedmin(planes, "", "").apply { setInputs(this@maskedmin) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( maskedthreshold )](https://ffmpeg.org/ffmpeg-filters.html#maskedthreshold)

```
Filter maskedthreshold
Pick pixels comparing absolute difference of two streams with threshold.
slice threading supported
Inputs:
#0: source (video)
#1: reference (video)
Outputs:
#0: default (video)
maskedthreshold AVOptions:
threshold         <int>        ..FV...... set threshold (from 0 to 65535) (default 1)
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class maskedthreshold(
    val threshold : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [maskedthreshold] を参照してください */
fun String.maskedthreshold(threshold : Any? = null, planes : Any? = null) : maskedthreshold {
    return maskedthreshold(threshold, planes, "", "").apply { setInputs(this@maskedthreshold) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( maskfun )](https://ffmpeg.org/ffmpeg-filters.html#maskfun)

```
Filter maskfun
Create Mask.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
maskfun AVOptions:
low               <int>        ..FV...... set low threshold (from 0 to 65535) (default 10)
high              <int>        ..FV...... set high threshold (from 0 to 65535) (default 10)
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)
fill              <int>        ..FV...... set fill value (from 0 to 65535) (default 0)
sum               <int>        ..FV...... set sum value (from 0 to 65535) (default 10)

This filter has support for timeline through the 'enable' option.

```
 * */
class maskfun(
    val low : Any? = null,
    val high : Any? = null,
    val planes : Any? = null,
    val fill : Any? = null,
    val sum : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [maskfun] を参照してください */
fun String.maskfun(low : Any? = null, high : Any? = null, planes : Any? = null, fill : Any? = null, sum : Any? = null) : maskfun {
    return maskfun(low, high, planes, fill, sum, "", "").apply { setInputs(this@maskfun) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mcdeint )](https://ffmpeg.org/ffmpeg-filters.html#mcdeint)

```
Filter mcdeint
Apply motion compensating deinterlacing.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
mcdeint AVOptions:
mode              <int>        ..FV...... set mode (from 0 to 3) (default fast)
fast            0            ..FV......
medium          1            ..FV......
slow            2            ..FV......
extra_slow      3            ..FV......
parity            <int>        ..FV...... set the assumed picture field parity (from -1 to 1) (default bff)
tff             0            ..FV...... assume top field first
bff             1            ..FV...... assume bottom field first
qp                <int>        ..FV...... set qp (from INT_MIN to INT_MAX) (default 1)


```
 * */
class mcdeint(
    val mode : Any? = null,
    val parity : Any? = null,
    val qp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mcdeint] を参照してください */
fun String.mcdeint(mode : Any? = null, parity : Any? = null, qp : Any? = null) : mcdeint {
    return mcdeint(mode, parity, qp, "", "").apply { setInputs(this@mcdeint) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( median )](https://ffmpeg.org/ffmpeg-filters.html#median)

```
Filter median
Apply Median filter.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
median AVOptions:
radius            <int>        ..FV.....T set median radius (from 1 to 127) (default 1)
planes            <int>        ..FV.....T set planes to filter (from 0 to 15) (default 15)
radiusV           <int>        ..FV.....T set median vertical radius (from 0 to 127) (default 0)
percentile        <float>      ..FV.....T set median percentile (from 0 to 1) (default 0.5)

This filter has support for timeline through the 'enable' option.

```
 * */
class median(
    val radius : Any? = null,
    val planes : Any? = null,
    val radiusV : Any? = null,
    val percentile : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [median] を参照してください */
fun String.median(radius : Any? = null, planes : Any? = null, radiusV : Any? = null, percentile : Any? = null) : median {
    return median(radius, planes, radiusV, percentile, "", "").apply { setInputs(this@median) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mergeplanes )](https://ffmpeg.org/ffmpeg-filters.html#mergeplanes)

```
Filter mergeplanes
Merge planes.
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
mergeplanes AVOptions:
mapping           <int>        ..FV...... set input to output plane mapping (from 0 to 8.58993e+08) (default 0)
format            <pix_fmt>    ..FV...... set output pixel format (default yuva444p)


```
 * */
class mergeplanes(
    val mapping : Any? = null,
    val _format : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mergeplanes] を参照してください */
fun String.mergeplanes(mapping : Any? = null, _format : Any? = null) : mergeplanes {
    return mergeplanes(mapping, _format, "", "").apply { setInputs(this@mergeplanes) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mestimate )](https://ffmpeg.org/ffmpeg-filters.html#mestimate)

```
Filter mestimate
Generate motion vectors.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
mestimate AVOptions:
method            <int>        ..FV...... motion estimation method (from 1 to 9) (default esa)
esa             1            ..FV...... exhaustive search
tss             2            ..FV...... three step search
tdls            3            ..FV...... two dimensional logarithmic search
ntss            4            ..FV...... new three step search
fss             5            ..FV...... four step search
ds              6            ..FV...... diamond search
hexbs           7            ..FV...... hexagon-based search
epzs            8            ..FV...... enhanced predictive zonal search
umh             9            ..FV...... uneven multi-hexagon search
mb_size           <int>        ..FV...... macroblock size (from 8 to INT_MAX) (default 16)
search_param      <int>        ..FV...... search parameter (from 4 to INT_MAX) (default 7)


```
 * */
class mestimate(
    val method : Any? = null,
    val mb_size : Any? = null,
    val search_param : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mestimate] を参照してください */
fun String.mestimate(method : Any? = null, mb_size : Any? = null, search_param : Any? = null) : mestimate {
    return mestimate(method, mb_size, search_param, "", "").apply { setInputs(this@mestimate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( metadata )](https://ffmpeg.org/ffmpeg-filters.html#metadata)

```
Filter metadata
Manipulate video frame metadata.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
metadata AVOptions:
mode              <int>        ..FV...... set a mode of operation (from 0 to 4) (default select)
select          0            ..FV...... select frame
add             1            ..FV...... add new metadata
modify          2            ..FV...... modify metadata
delete          3            ..FV...... delete metadata
print           4            ..FV...... print metadata
key               <string>     ..FV...... set metadata key
value             <string>     ..FV...... set metadata value
function          <int>        ..FV...... function for comparing values (from 0 to 6) (default same_str)
same_str        0            ..FV......
starts_with     1            ..FV......
less            2            ..FV......
equal           3            ..FV......
greater         4            ..FV......
expr            5            ..FV......
ends_with       6            ..FV......
expr              <string>     ..FV...... set expression for expr function
file              <string>     ..FV...... set file where to print metadata information
direct            <boolean>    ..FV...... reduce buffering when printing to user-set file or pipe (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class metadata(
    val mode : Any? = null,
    val key : Any? = null,
    val value : Any? = null,
    val function : Any? = null,
    val expr : Any? = null,
    val file : Any? = null,
    val direct : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [metadata] を参照してください */
fun String.metadata(mode : Any? = null, key : Any? = null, value : Any? = null, function : Any? = null, expr : Any? = null, file : Any? = null, direct : Any? = null) : metadata {
    return metadata(mode, key, value, function, expr, file, direct, "", "").apply { setInputs(this@metadata) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( midequalizer )](https://ffmpeg.org/ffmpeg-filters.html#midequalizer)

```
Filter midequalizer
Apply Midway Equalization.
Inputs:
#0: in0 (video)
#1: in1 (video)
Outputs:
#0: default (video)
midequalizer AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class midequalizer(
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [midequalizer] を参照してください */
fun String.midequalizer(planes : Any? = null) : midequalizer {
    return midequalizer(planes, "", "").apply { setInputs(this@midequalizer) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( minterpolate )](https://ffmpeg.org/ffmpeg-filters.html#minterpolate)

```
Filter minterpolate
Frame rate conversion using Motion Interpolation.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
minterpolate AVOptions:
fps               <video_rate> ..FV...... output's frame rate (default "60")
mi_mode           <int>        ..FV...... motion interpolation mode (from 0 to 2) (default mci)
dup             0            ..FV...... duplicate frames
blend           1            ..FV...... blend frames
mci             2            ..FV...... motion compensated interpolation
mc_mode           <int>        ..FV...... motion compensation mode (from 0 to 1) (default obmc)
obmc            0            ..FV...... overlapped block motion compensation
aobmc           1            ..FV...... adaptive overlapped block motion compensation
me_mode           <int>        ..FV...... motion estimation mode (from 0 to 1) (default bilat)
bidir           0            ..FV...... bidirectional motion estimation
bilat           1            ..FV...... bilateral motion estimation
me                <int>        ..FV...... motion estimation method (from 1 to 9) (default epzs)
esa             1            ..FV...... exhaustive search
tss             2            ..FV...... three step search
tdls            3            ..FV...... two dimensional logarithmic search
ntss            4            ..FV...... new three step search
fss             5            ..FV...... four step search
ds              6            ..FV...... diamond search
hexbs           7            ..FV...... hexagon-based search
epzs            8            ..FV...... enhanced predictive zonal search
umh             9            ..FV...... uneven multi-hexagon search
mb_size           <int>        ..FV...... macroblock size (from 4 to 16) (default 16)
search_param      <int>        ..FV...... search parameter (from 4 to INT_MAX) (default 32)
vsbmc             <int>        ..FV...... variable-size block motion compensation (from 0 to 1) (default 0)
scd               <int>        ..FV...... scene change detection method (from 0 to 1) (default fdiff)
none            0            ..FV...... disable detection
fdiff           1            ..FV...... frame difference
scd_threshold     <double>     ..FV...... scene change threshold (from 0 to 100) (default 10)


```
 * */
class minterpolate(
    val fps : Any? = null,
    val mi_mode : Any? = null,
    val mc_mode : Any? = null,
    val me_mode : Any? = null,
    val me : Any? = null,
    val mb_size : Any? = null,
    val search_param : Any? = null,
    val vsbmc : Any? = null,
    val scd : Any? = null,
    val scd_threshold : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [minterpolate] を参照してください */
fun String.minterpolate(fps : Any? = null, mi_mode : Any? = null, mc_mode : Any? = null, me_mode : Any? = null, me : Any? = null, mb_size : Any? = null, search_param : Any? = null, vsbmc : Any? = null, scd : Any? = null, scd_threshold : Any? = null) : minterpolate {
    return minterpolate(fps, mi_mode, mc_mode, me_mode, me, mb_size, search_param, vsbmc, scd, scd_threshold, "", "").apply { setInputs(this@minterpolate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mix )](https://ffmpeg.org/ffmpeg-filters.html#mix)

```
Filter mix
Mix video inputs.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
mix AVOptions:
inputs            <int>        ..FV...... set number of inputs (from 2 to 32767) (default 2)
weights           <string>     ..FV...... set weight for each input (default "1 1")
scale             <float>      ..FV...... set scale (from 0 to 32767) (default 0)
duration          <int>        ..FV...... how to determine end of stream (from 0 to 2) (default longest)
longest         0            ..FV...... Duration of longest input
shortest        1            ..FV...... Duration of shortest input
first           2            ..FV...... Duration of first input


```
 * */
class mix(
    val inputs : Any? = null,
    val weights : Any? = null,
    val scale : Any? = null,
    val duration : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mix] を参照してください */
fun String.mix(inputs : Any? = null, weights : Any? = null, scale : Any? = null, duration : Any? = null) : mix {
    return mix(inputs, weights, scale, duration, "", "").apply { setInputs(this@mix) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mpdecimate )](https://ffmpeg.org/ffmpeg-filters.html#mpdecimate)

```
Filter mpdecimate
Remove near-duplicate frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
mpdecimate AVOptions:
max               <int>        ..FV...... set the maximum number of consecutive dropped frames (positive), or the minimum interval between dropped frames (negative) (from INT_MIN to INT_MAX) (default 0)
hi                <int>        ..FV...... set high dropping threshold (from INT_MIN to INT_MAX) (default 768)
lo                <int>        ..FV...... set low dropping threshold (from INT_MIN to INT_MAX) (default 320)
frac              <float>      ..FV...... set fraction dropping threshold (from 0 to 1) (default 0.33)


```
 * */
class mpdecimate(
    val max : Any? = null,
    val hi : Any? = null,
    val lo : Any? = null,
    val frac : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mpdecimate] を参照してください */
fun String.mpdecimate(max : Any? = null, hi : Any? = null, lo : Any? = null, frac : Any? = null) : mpdecimate {
    return mpdecimate(max, hi, lo, frac, "", "").apply { setInputs(this@mpdecimate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( negate )](https://ffmpeg.org/ffmpeg-filters.html#negate)

```
Filter negate
Negate input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
negate AVOptions:
negate_alpha      <boolean>    ..FV...... (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class negate(
    val negate_alpha : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [negate] を参照してください */
fun String.negate(negate_alpha : Any? = null) : negate {
    return negate(negate_alpha, "", "").apply { setInputs(this@negate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( nlmeans )](https://ffmpeg.org/ffmpeg-filters.html#nlmeans)

```
Filter nlmeans
Non-local means denoiser.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
nlmeans AVOptions:
s                 <double>     ..FV...... denoising strength (from 1 to 30) (default 1)
p                 <int>        ..FV...... patch size (from 0 to 99) (default 7)
pc                <int>        ..FV...... patch size for chroma planes (from 0 to 99) (default 0)
r                 <int>        ..FV...... research window (from 0 to 99) (default 15)
rc                <int>        ..FV...... research window for chroma planes (from 0 to 99) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class nlmeans(
    val s : Any? = null,
    val p : Any? = null,
    val pc : Any? = null,
    val r : Any? = null,
    val rc : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [nlmeans] を参照してください */
fun String.nlmeans(s : Any? = null, p : Any? = null, pc : Any? = null, r : Any? = null, rc : Any? = null) : nlmeans {
    return nlmeans(s, p, pc, r, rc, "", "").apply { setInputs(this@nlmeans) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( nnedi )](https://ffmpeg.org/ffmpeg-filters.html#nnedi)

```
Filter nnedi
Apply neural network edge directed interpolation intra-only deinterlacer.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
nnedi AVOptions:
weights           <string>     ..FV...... set weights file (default "nnedi3_weights.bin")
deint             <int>        ..FV...... set which frames to deinterlace (from 0 to 1) (default all)
all             0            ..FV...... deinterlace all frames
interlaced      1            ..FV...... only deinterlace frames marked as interlaced
field             <int>        ..FV...... set mode of operation (from -2 to 3) (default a)
af              -2           ..FV...... use frame flags, both fields
a               -1           ..FV...... use frame flags, single field
t               0            ..FV...... use top field only
b               1            ..FV...... use bottom field only
tf              2            ..FV...... use both fields, top first
bf              3            ..FV...... use both fields, bottom first
planes            <int>        ..FV...... set which planes to process (from 0 to 7) (default 7)
nsize             <int>        ..FV...... set size of local neighborhood around each pixel, used by the predictor neural network (from 0 to 6) (default s32x4)
s8x6            0            ..FV......
s16x6           1            ..FV......
s32x6           2            ..FV......
s48x6           3            ..FV......
s8x4            4            ..FV......
s16x4           5            ..FV......
s32x4           6            ..FV......
nns               <int>        ..FV...... set number of neurons in predictor neural network (from 0 to 4) (default n32)
n16             0            ..FV......
n32             1            ..FV......
n64             2            ..FV......
n128            3            ..FV......
n256            4            ..FV......
qual              <int>        ..FV...... set quality (from 1 to 2) (default fast)
fast            1            ..FV......
slow            2            ..FV......
etype             <int>        ..FV...... set which set of weights to use in the predictor (from 0 to 1) (default a)
a               0            ..FV...... weights trained to minimize absolute error
s               1            ..FV...... weights trained to minimize squared error
pscrn             <int>        ..FV...... set prescreening (from 0 to 2) (default new)
none            0            ..FV......
original        1            ..FV......
new             2            ..FV......
fapprox           <int>        ..FV...... (from 0 to 3) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class nnedi(
    val weights : Any? = null,
    val deint : Any? = null,
    val field : Any? = null,
    val planes : Any? = null,
    val nsize : Any? = null,
    val nns : Any? = null,
    val qual : Any? = null,
    val etype : Any? = null,
    val pscrn : Any? = null,
    val fapprox : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [nnedi] を参照してください */
fun String.nnedi(weights : Any? = null, deint : Any? = null, field : Any? = null, planes : Any? = null, nsize : Any? = null, nns : Any? = null, qual : Any? = null, etype : Any? = null, pscrn : Any? = null, fapprox : Any? = null) : nnedi {
    return nnedi(weights, deint, field, planes, nsize, nns, qual, etype, pscrn, fapprox, "", "").apply { setInputs(this@nnedi) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( noformat )](https://ffmpeg.org/ffmpeg-filters.html#noformat)

```
Filter noformat
Force libavfilter not to use any of the specified pixel formats for the input to the next filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
noformat AVOptions:
pix_fmts          <string>     ..FV...... A '|'-separated list of pixel formats


```
 * */
class noformat(
    val pix_fmts : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [noformat] を参照してください */
fun String.noformat(pix_fmts : Any? = null) : noformat {
    return noformat(pix_fmts, "", "").apply { setInputs(this@noformat) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( noise )](https://ffmpeg.org/ffmpeg-filters.html#noise)

```
Filter noise
Add noise.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
noise AVOptions:
all_seed          <int>        ..FV...... set component #0 noise seed (from -1 to INT_MAX) (default -1)
all_strength      <int>        ..FV...... set component #0 strength (from 0 to 100) (default 0)
alls              <int>        ..FV...... set component #0 strength (from 0 to 100) (default 0)
all_flags         <flags>      ..FV...... set component #0 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
allf              <flags>      ..FV...... set component #0 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c0_seed           <int>        ..FV...... set component #0 noise seed (from -1 to INT_MAX) (default -1)
c0_strength       <int>        ..FV...... set component #0 strength (from 0 to 100) (default 0)
c0s               <int>        ..FV...... set component #0 strength (from 0 to 100) (default 0)
c0_flags          <flags>      ..FV...... set component #0 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c0f               <flags>      ..FV...... set component #0 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c1_seed           <int>        ..FV...... set component #1 noise seed (from -1 to INT_MAX) (default -1)
c1_strength       <int>        ..FV...... set component #1 strength (from 0 to 100) (default 0)
c1s               <int>        ..FV...... set component #1 strength (from 0 to 100) (default 0)
c1_flags          <flags>      ..FV...... set component #1 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c1f               <flags>      ..FV...... set component #1 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c2_seed           <int>        ..FV...... set component #2 noise seed (from -1 to INT_MAX) (default -1)
c2_strength       <int>        ..FV...... set component #2 strength (from 0 to 100) (default 0)
c2s               <int>        ..FV...... set component #2 strength (from 0 to 100) (default 0)
c2_flags          <flags>      ..FV...... set component #2 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c2f               <flags>      ..FV...... set component #2 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c3_seed           <int>        ..FV...... set component #3 noise seed (from -1 to INT_MAX) (default -1)
c3_strength       <int>        ..FV...... set component #3 strength (from 0 to 100) (default 0)
c3s               <int>        ..FV...... set component #3 strength (from 0 to 100) (default 0)
c3_flags          <flags>      ..FV...... set component #3 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise
c3f               <flags>      ..FV...... set component #3 flags (default 0)
a                            ..FV...... averaged noise
p                            ..FV...... (semi)regular pattern
t                            ..FV...... temporal noise
u                            ..FV...... uniform noise

This filter has support for timeline through the 'enable' option.

```
 * */
class noise(
    val all_seed : Any? = null,
    val all_strength : Any? = null,
    val alls : Any? = null,
    val all_flags : Any? = null,
    val allf : Any? = null,
    val c0_seed : Any? = null,
    val c0_strength : Any? = null,
    val c0s : Any? = null,
    val c0_flags : Any? = null,
    val c0f : Any? = null,
    val c1_seed : Any? = null,
    val c1_strength : Any? = null,
    val c1s : Any? = null,
    val c1_flags : Any? = null,
    val c1f : Any? = null,
    val c2_seed : Any? = null,
    val c2_strength : Any? = null,
    val c2s : Any? = null,
    val c2_flags : Any? = null,
    val c2f : Any? = null,
    val c3_seed : Any? = null,
    val c3_strength : Any? = null,
    val c3s : Any? = null,
    val c3_flags : Any? = null,
    val c3f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [noise] を参照してください */
fun String.noise(all_seed : Any? = null, all_strength : Any? = null, alls : Any? = null, all_flags : Any? = null, allf : Any? = null, c0_seed : Any? = null, c0_strength : Any? = null, c0s : Any? = null, c0_flags : Any? = null, c0f : Any? = null, c1_seed : Any? = null, c1_strength : Any? = null, c1s : Any? = null, c1_flags : Any? = null, c1f : Any? = null, c2_seed : Any? = null, c2_strength : Any? = null, c2s : Any? = null, c2_flags : Any? = null, c2f : Any? = null, c3_seed : Any? = null, c3_strength : Any? = null, c3s : Any? = null, c3_flags : Any? = null, c3f : Any? = null) : noise {
    return noise(all_seed, all_strength, alls, all_flags, allf, c0_seed, c0_strength, c0s, c0_flags, c0f, c1_seed, c1_strength, c1s, c1_flags, c1f, c2_seed, c2_strength, c2s, c2_flags, c2f, c3_seed, c3_strength, c3s, c3_flags, c3f, "", "").apply { setInputs(this@noise) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( normalize )](https://ffmpeg.org/ffmpeg-filters.html#normalize)

```
Filter normalize
Normalize RGB video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
normalize AVOptions:
blackpt           <color>      ..FV.....T output color to which darkest input color is mapped (default "black")
whitept           <color>      ..FV.....T output color to which brightest input color is mapped (default "white")
smoothing         <int>        ..FV...... amount of temporal smoothing of the input range, to reduce flicker (from 0 to 2.68435e+08) (default 0)
independence      <float>      ..FV.....T proportion of independent to linked channel normalization (from 0 to 1) (default 1)
strength          <float>      ..FV.....T strength of filter, from no effect to full normalization (from 0 to 1) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class normalize(
    val blackpt : Any? = null,
    val whitept : Any? = null,
    val smoothing : Any? = null,
    val independence : Any? = null,
    val strength : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [normalize] を参照してください */
fun String.normalize(blackpt : Any? = null, whitept : Any? = null, smoothing : Any? = null, independence : Any? = null, strength : Any? = null) : normalize {
    return normalize(blackpt, whitept, smoothing, independence, strength, "", "").apply { setInputs(this@normalize) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( null )](https://ffmpeg.org/ffmpeg-filters.html#null)

```
Filter null
Pass the source unchanged to the output.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class null_(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [null_] を参照してください */
fun String.null_() : null_ {
    return null_("", "").apply { setInputs(this@null_) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( oscilloscope )](https://ffmpeg.org/ffmpeg-filters.html#oscilloscope)

```
Filter oscilloscope
2D Video Oscilloscope.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
oscilloscope AVOptions:
x                 <float>      ..FV.....T set scope x position (from 0 to 1) (default 0.5)
y                 <float>      ..FV.....T set scope y position (from 0 to 1) (default 0.5)
s                 <float>      ..FV.....T set scope size (from 0 to 1) (default 0.8)
t                 <float>      ..FV.....T set scope tilt (from 0 to 1) (default 0.5)
o                 <float>      ..FV.....T set trace opacity (from 0 to 1) (default 0.8)
tx                <float>      ..FV.....T set trace x position (from 0 to 1) (default 0.5)
ty                <float>      ..FV.....T set trace y position (from 0 to 1) (default 0.9)
tw                <float>      ..FV.....T set trace width (from 0.1 to 1) (default 0.8)
th                <float>      ..FV.....T set trace height (from 0.1 to 1) (default 0.3)
c                 <int>        ..FV.....T set components to trace (from 0 to 15) (default 7)
g                 <boolean>    ..FV.....T draw trace grid (default true)
st                <boolean>    ..FV.....T draw statistics (default true)
sc                <boolean>    ..FV.....T draw scope (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class oscilloscope(
    val x : Any? = null,
    val y : Any? = null,
    val s : Any? = null,
    val t : Any? = null,
    val o : Any? = null,
    val tx : Any? = null,
    val ty : Any? = null,
    val tw : Any? = null,
    val th : Any? = null,
    val c : Any? = null,
    val g : Any? = null,
    val st : Any? = null,
    val sc : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [oscilloscope] を参照してください */
fun String.oscilloscope(x : Any? = null, y : Any? = null, s : Any? = null, t : Any? = null, o : Any? = null, tx : Any? = null, ty : Any? = null, tw : Any? = null, th : Any? = null, c : Any? = null, g : Any? = null, st : Any? = null, sc : Any? = null) : oscilloscope {
    return oscilloscope(x, y, s, t, o, tx, ty, tw, th, c, g, st, sc, "", "").apply { setInputs(this@oscilloscope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( overlay )](https://ffmpeg.org/ffmpeg-filters.html#overlay)

```
Filter overlay
Overlay a video source on top of the input.
slice threading supported
Inputs:
#0: main (video)
#1: overlay (video)
Outputs:
#0: default (video)
overlay AVOptions:
x                 <string>     ..FV...... set the x expression (default "0")
y                 <string>     ..FV...... set the y expression (default "0")
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default frame)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions per-frame
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
format            <int>        ..FV...... set output format (from 0 to 5) (default yuv420)
yuv420          0            ..FV......
yuv422          1            ..FV......
yuv444          2            ..FV......
rgb             3            ..FV......
gbrp            4            ..FV......
auto            5            ..FV......
repeatlast        <boolean>    ..FV...... repeat overlay of the last overlay frame (default true)
alpha             <int>        ..FV...... alpha format (from 0 to 1) (default straight)
straight        0            ..FV......
premultiplied   1            ..FV......

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class overlay(
    val x : Any? = null,
    val y : Any? = null,
    val eof_action : Any? = null,
    val eval : Any? = null,
    val shortest : Any? = null,
    val _format : Any? = null,
    val repeatlast : Any? = null,
    val alpha : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [overlay] を参照してください */
fun String.overlay(x : Any? = null, y : Any? = null, eof_action : Any? = null, eval : Any? = null, shortest : Any? = null, _format : Any? = null, repeatlast : Any? = null, alpha : Any? = null) : overlay {
    return overlay(x, y, eof_action, eval, shortest, _format, repeatlast, alpha, "", "").apply { setInputs(this@overlay) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( overlay_qsv )](https://ffmpeg.org/ffmpeg-filters.html#overlay_qsv)

```
Filter overlay_qsv
Quick Sync Video overlay.
Inputs:
#0: main (video)
#1: overlay (video)
Outputs:
#0: default (video)
overlay_qsv AVOptions:
x                 <string>     ..FV...... Overlay x position (default "0")
y                 <string>     ..FV...... Overlay y position (default "0")
w                 <string>     ..FV...... Overlay width (default "overlay_iw")
h                 <string>     ..FV...... Overlay height (default "overlay_ih*w/overlay_iw")
alpha             <int>        ..FV...... Overlay global alpha (from 0 to 255) (default 255)
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... repeat overlay of the last overlay frame (default true)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)


```
 * */
class overlay_qsv(
    val x : Any? = null,
    val y : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val alpha : Any? = null,
    val eof_action : Any? = null,
    val shortest : Any? = null,
    val repeatlast : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [overlay_qsv] を参照してください */
fun String.overlay_qsv(x : Any? = null, y : Any? = null, w : Any? = null, h : Any? = null, alpha : Any? = null, eof_action : Any? = null, shortest : Any? = null, repeatlast : Any? = null) : overlay_qsv {
    return overlay_qsv(x, y, w, h, alpha, eof_action, shortest, repeatlast, "", "").apply { setInputs(this@overlay_qsv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( overlay_cuda )](https://ffmpeg.org/ffmpeg-filters.html#overlay_cuda)

```
Filter overlay_cuda
Overlay one video on top of another using CUDA
Inputs:
#0: main (video)
#1: overlay (video)
Outputs:
#0: default (video)
overlay_cuda AVOptions:
x                 <int>        ..FV...... Overlay x position (from INT_MIN to INT_MAX) (default 0)
y                 <int>        ..FV...... Overlay y position (from INT_MIN to INT_MAX) (default 0)
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... repeat overlay of the last overlay frame (default true)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)


```
 * */
class overlay_cuda(
    val x : Any? = null,
    val y : Any? = null,
    val eof_action : Any? = null,
    val shortest : Any? = null,
    val repeatlast : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [overlay_cuda] を参照してください */
fun String.overlay_cuda(x : Any? = null, y : Any? = null, eof_action : Any? = null, shortest : Any? = null, repeatlast : Any? = null) : overlay_cuda {
    return overlay_cuda(x, y, eof_action, shortest, repeatlast, "", "").apply { setInputs(this@overlay_cuda) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( owdenoise )](https://ffmpeg.org/ffmpeg-filters.html#owdenoise)

```
Filter owdenoise
Denoise using wavelets.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
owdenoise AVOptions:
depth             <int>        ..FV...... set depth (from 8 to 16) (default 8)
luma_strength     <double>     ..FV...... set luma strength (from 0 to 1000) (default 1)
ls                <double>     ..FV...... set luma strength (from 0 to 1000) (default 1)
chroma_strength   <double>     ..FV...... set chroma strength (from 0 to 1000) (default 1)
cs                <double>     ..FV...... set chroma strength (from 0 to 1000) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class owdenoise(
    val depth : Any? = null,
    val luma_strength : Any? = null,
    val chroma_strength : Any? = null,
    val ls : Any? = null,
    val cs : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [owdenoise] を参照してください */
fun String.owdenoise(depth : Any? = null, luma_strength : Any? = null, chroma_strength : Any? = null, ls : Any? = null, cs : Any? = null) : owdenoise {
    return owdenoise(depth, luma_strength, chroma_strength, ls, cs, "", "").apply { setInputs(this@owdenoise) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pad )](https://ffmpeg.org/ffmpeg-filters.html#pad)

```
Filter pad
Pad the input video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
pad AVOptions:
width             <string>     ..FV...... set the pad area width expression (default "iw")
w                 <string>     ..FV...... set the pad area width expression (default "iw")
height            <string>     ..FV...... set the pad area height expression (default "ih")
h                 <string>     ..FV...... set the pad area height expression (default "ih")
x                 <string>     ..FV...... set the x offset expression for the input image position (default "0")
y                 <string>     ..FV...... set the y offset expression for the input image position (default "0")
color             <color>      ..FV...... set the color of the padded area border (default "black")
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions during initialization and per-frame
aspect            <rational>   ..FV...... pad to fit an aspect instead of a resolution (from 0 to DBL_MAX) (default 0/1)


```
 * */
class pad(
    val width : Any? = null,
    val height : Any? = null,
    val x : Any? = null,
    val y : Any? = null,
    val color : Any? = null,
    val eval : Any? = null,
    val aspect : Any? = null,
    val w : Any? = null,
    val h : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pad] を参照してください */
fun String.pad(width : Any? = null, height : Any? = null, x : Any? = null, y : Any? = null, color : Any? = null, eval : Any? = null, aspect : Any? = null, w : Any? = null, h : Any? = null) : pad {
    return pad(width, height, x, y, color, eval, aspect, w, h, "", "").apply { setInputs(this@pad) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( palettegen )](https://ffmpeg.org/ffmpeg-filters.html#palettegen)

```
Filter palettegen
Find the optimal palette for a given stream.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
palettegen AVOptions:
max_colors        <int>        ..FV...... set the maximum number of colors to use in the palette (from 4 to 256) (default 256)
reserve_transparent <boolean>    ..FV...... reserve a palette entry for transparency (default true)
transparency_color <color>      ..FV...... set a background color for transparency (default "lime")
stats_mode        <int>        ..FV...... set statistics mode (from 0 to 2) (default full)
full            0            ..FV...... compute full frame histograms
diff            1            ..FV...... compute histograms only for the part that differs from previous frame
single          2            ..FV...... compute new histogram for each frame


```
 * */
class palettegen(
    val max_colors : Any? = null,
    val reserve_transparent : Any? = null,
    val transparency_color : Any? = null,
    val stats_mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [palettegen] を参照してください */
fun String.palettegen(max_colors : Any? = null, reserve_transparent : Any? = null, transparency_color : Any? = null, stats_mode : Any? = null) : palettegen {
    return palettegen(max_colors, reserve_transparent, transparency_color, stats_mode, "", "").apply { setInputs(this@palettegen) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( paletteuse )](https://ffmpeg.org/ffmpeg-filters.html#paletteuse)

```
Filter paletteuse
Use a palette to downsample an input video stream.
Inputs:
#0: default (video)
#1: palette (video)
Outputs:
#0: default (video)
paletteuse AVOptions:
dither            <int>        ..FV...... select dithering mode (from 0 to 5) (default sierra2_4a)
bayer           1            ..FV...... ordered 8x8 bayer dithering (deterministic)
heckbert        2            ..FV...... dithering as defined by Paul Heckbert in 1982 (simple error diffusion)
floyd_steinberg 3            ..FV...... Floyd and Steingberg dithering (error diffusion)
sierra2         4            ..FV...... Frankie Sierra dithering v2 (error diffusion)
sierra2_4a      5            ..FV...... Frankie Sierra dithering v2 "Lite" (error diffusion)
bayer_scale       <int>        ..FV...... set scale for bayer dithering (from 0 to 5) (default 2)
diff_mode         <int>        ..FV...... set frame difference mode (from 0 to 1) (default 0)
rectangle       1            ..FV...... process smallest different rectangle
new               <boolean>    ..FV...... take new palette for each output frame (default false)
alpha_threshold   <int>        ..FV...... set the alpha threshold for transparency (from 0 to 255) (default 128)
debug_kdtree      <string>     ..FV...... save Graphviz graph of the kdtree in specified file
color_search      <int>        ..FV...... set reverse colormap color search method (from 0 to 2) (default nns_iterative)
nns_iterative   0            ..FV...... iterative search
nns_recursive   1            ..FV...... recursive search
bruteforce      2            ..FV...... brute-force into the palette
mean_err          <boolean>    ..FV...... compute and print mean error (default false)
debug_accuracy    <boolean>    ..FV...... test color search accuracy (default false)


```
 * */
class paletteuse(
    val dither : Any? = null,
    val bayer_scale : Any? = null,
    val diff_mode : Any? = null,
    val new : Any? = null,
    val alpha_threshold : Any? = null,
    val debug_kdtree : Any? = null,
    val color_search : Any? = null,
    val mean_err : Any? = null,
    val debug_accuracy : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [paletteuse] を参照してください */
fun String.paletteuse(dither : Any? = null, bayer_scale : Any? = null, diff_mode : Any? = null, new : Any? = null, alpha_threshold : Any? = null, debug_kdtree : Any? = null, color_search : Any? = null, mean_err : Any? = null, debug_accuracy : Any? = null) : paletteuse {
    return paletteuse(dither, bayer_scale, diff_mode, new, alpha_threshold, debug_kdtree, color_search, mean_err, debug_accuracy, "", "").apply { setInputs(this@paletteuse) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( perms )](https://ffmpeg.org/ffmpeg-filters.html#perms)

```
Filter perms
Set permissions for the output video frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
perms AVOptions:
mode              <int>        ..FVA..... select permissions mode (from 0 to 4) (default none)
none            0            ..FVA..... do nothing
ro              1            ..FVA..... set all output frames read-only
rw              2            ..FVA..... set all output frames writable
toggle          3            ..FVA..... switch permissions
random          4            ..FVA..... set permissions randomly
seed              <int64>      ..FVA..... set the seed for the random mode (from -1 to UINT32_MAX) (default -1)


```
 * */
class perms(
    val mode : Any? = null,
    val seed : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [perms] を参照してください */
fun String.perms(mode : Any? = null, seed : Any? = null) : perms {
    return perms(mode, seed, "", "").apply { setInputs(this@perms) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( perspective )](https://ffmpeg.org/ffmpeg-filters.html#perspective)

```
Filter perspective
Correct the perspective of video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
perspective AVOptions:
x0                <string>     ..FV...... set top left x coordinate (default "0")
y0                <string>     ..FV...... set top left y coordinate (default "0")
x1                <string>     ..FV...... set top right x coordinate (default "W")
y1                <string>     ..FV...... set top right y coordinate (default "0")
x2                <string>     ..FV...... set bottom left x coordinate (default "0")
y2                <string>     ..FV...... set bottom left y coordinate (default "H")
x3                <string>     ..FV...... set bottom right x coordinate (default "W")
y3                <string>     ..FV...... set bottom right y coordinate (default "H")
interpolation     <int>        ..FV...... set interpolation (from 0 to 1) (default linear)
linear          0            ..FV......
cubic           1            ..FV......
sense             <int>        ..FV...... specify the sense of the coordinates (from 0 to 1) (default source)
source          0            ..FV...... specify locations in source to send to corners in destination
destination     1            ..FV...... specify locations in destination to send corners of source
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions per-frame

This filter has support for timeline through the 'enable' option.

```
 * */
class perspective(
    val x0 : Any? = null,
    val y0 : Any? = null,
    val x1 : Any? = null,
    val y1 : Any? = null,
    val x2 : Any? = null,
    val y2 : Any? = null,
    val x3 : Any? = null,
    val y3 : Any? = null,
    val interpolation : Any? = null,
    val sense : Any? = null,
    val eval : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [perspective] を参照してください */
fun String.perspective(x0 : Any? = null, y0 : Any? = null, x1 : Any? = null, y1 : Any? = null, x2 : Any? = null, y2 : Any? = null, x3 : Any? = null, y3 : Any? = null, interpolation : Any? = null, sense : Any? = null, eval : Any? = null) : perspective {
    return perspective(x0, y0, x1, y1, x2, y2, x3, y3, interpolation, sense, eval, "", "").apply { setInputs(this@perspective) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( phase )](https://ffmpeg.org/ffmpeg-filters.html#phase)

```
Filter phase
Phase shift fields.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
phase AVOptions:
mode              <int>        ..FV...... set phase mode (from 0 to 8) (default A)
p               0            ..FV...... progressive
t               1            ..FV...... top first
b               2            ..FV...... bottom first
T               3            ..FV...... top first analyze
B               4            ..FV...... bottom first analyze
u               5            ..FV...... analyze
U               6            ..FV...... full analyze
a               7            ..FV...... auto
A               8            ..FV...... auto analyze

This filter has support for timeline through the 'enable' option.

```
 * */
class phase(
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [phase] を参照してください */
fun String.phase(mode : Any? = null) : phase {
    return phase(mode, "", "").apply { setInputs(this@phase) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( photosensitivity )](https://ffmpeg.org/ffmpeg-filters.html#photosensitivity)

```
Filter photosensitivity
Filter out photosensitive epilepsy seizure-inducing flashes.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
photosensitivity AVOptions:
frames            <int>        ..FV...... set how many frames to use (from 2 to 240) (default 30)
f                 <int>        ..FV...... set how many frames to use (from 2 to 240) (default 30)
threshold         <float>      ..FV...... set detection threshold factor (lower is stricter) (from 0.1 to FLT_MAX) (default 1)
t                 <float>      ..FV...... set detection threshold factor (lower is stricter) (from 0.1 to FLT_MAX) (default 1)
skip              <int>        ..FV...... set pixels to skip when sampling frames (from 1 to 1024) (default 1)
bypass            <boolean>    ..FV...... leave frames unchanged (default false)


```
 * */
class photosensitivity(
    val frames : Any? = null,
    val threshold : Any? = null,
    val skip : Any? = null,
    val bypass : Any? = null,
    val f : Any? = null,
    val t : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [photosensitivity] を参照してください */
fun String.photosensitivity(frames : Any? = null, threshold : Any? = null, skip : Any? = null, bypass : Any? = null, f : Any? = null, t : Any? = null) : photosensitivity {
    return photosensitivity(frames, threshold, skip, bypass, f, t, "", "").apply { setInputs(this@photosensitivity) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pixdesctest )](https://ffmpeg.org/ffmpeg-filters.html#pixdesctest)

```
Filter pixdesctest
Test pixel format definitions.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class pixdesctest(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pixdesctest] を参照してください */
fun String.pixdesctest() : pixdesctest {
    return pixdesctest("", "").apply { setInputs(this@pixdesctest) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pixscope )](https://ffmpeg.org/ffmpeg-filters.html#pixscope)

```
Filter pixscope
Pixel data analysis.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
pixscope AVOptions:
x                 <float>      ..FV...... set scope x offset (from 0 to 1) (default 0.5)
y                 <float>      ..FV...... set scope y offset (from 0 to 1) (default 0.5)
w                 <int>        ..FV...... set scope width (from 1 to 80) (default 7)
h                 <int>        ..FV...... set scope height (from 1 to 80) (default 7)
o                 <float>      ..FV...... set window opacity (from 0 to 1) (default 0.5)
wx                <float>      ..FV...... set window x offset (from -1 to 1) (default -1)
wy                <float>      ..FV...... set window y offset (from -1 to 1) (default -1)

This filter has support for timeline through the 'enable' option.

```
 * */
class pixscope(
    val x : Any? = null,
    val y : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val o : Any? = null,
    val wx : Any? = null,
    val wy : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pixscope] を参照してください */
fun String.pixscope(x : Any? = null, y : Any? = null, w : Any? = null, h : Any? = null, o : Any? = null, wx : Any? = null, wy : Any? = null) : pixscope {
    return pixscope(x, y, w, h, o, wx, wy, "", "").apply { setInputs(this@pixscope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pp )](https://ffmpeg.org/ffmpeg-filters.html#pp)

```
Filter pp
Filter video using libpostproc.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
pp AVOptions:
subfilters        <string>     ..FV...... set postprocess subfilters (default "de")

This filter has support for timeline through the 'enable' option.

```
 * */
class pp(
    val subfilters : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pp] を参照してください */
fun String.pp(subfilters : Any? = null) : pp {
    return pp(subfilters, "", "").apply { setInputs(this@pp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pp7 )](https://ffmpeg.org/ffmpeg-filters.html#pp7)

```
Filter pp7
Apply Postprocessing 7 filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
pp7 AVOptions:
qp                <int>        ..FV...... force a constant quantizer parameter (from 0 to 64) (default 0)
mode              <int>        ..FV...... set thresholding mode (from 0 to 2) (default medium)
hard            0            ..FV...... hard thresholding
soft            1            ..FV...... soft thresholding
medium          2            ..FV...... medium thresholding

This filter has support for timeline through the 'enable' option.

```
 * */
class pp7(
    val qp : Any? = null,
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pp7] を参照してください */
fun String.pp7(qp : Any? = null, mode : Any? = null) : pp7 {
    return pp7(qp, mode, "", "").apply { setInputs(this@pp7) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( premultiply )](https://ffmpeg.org/ffmpeg-filters.html#premultiply)

```
Filter premultiply
PreMultiply first stream with first plane of second stream.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
premultiply AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)
inplace           <boolean>    ..FV...... enable inplace mode (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class premultiply(
    val planes : Any? = null,
    val inplace : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [premultiply] を参照してください */
fun String.premultiply(planes : Any? = null, inplace : Any? = null) : premultiply {
    return premultiply(planes, inplace, "", "").apply { setInputs(this@premultiply) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( prewitt )](https://ffmpeg.org/ffmpeg-filters.html#prewitt)

```
Filter prewitt
Apply prewitt operator.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
prewitt AVOptions:
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)
scale             <float>      ..FV...... set scale (from 0 to 65535) (default 1)
delta             <float>      ..FV...... set delta (from -65535 to 65535) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class prewitt(
    val planes : Any? = null,
    val scale : Any? = null,
    val delta : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [prewitt] を参照してください */
fun String.prewitt(planes : Any? = null, scale : Any? = null, delta : Any? = null) : prewitt {
    return prewitt(planes, scale, delta, "", "").apply { setInputs(this@prewitt) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pseudocolor )](https://ffmpeg.org/ffmpeg-filters.html#pseudocolor)

```
Filter pseudocolor
Make pseudocolored video frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
pseudocolor AVOptions:
c0                <string>     ..FV...... set component #0 expression (default "val")
c1                <string>     ..FV...... set component #1 expression (default "val")
c2                <string>     ..FV...... set component #2 expression (default "val")
c3                <string>     ..FV...... set component #3 expression (default "val")
i                 <int>        ..FV...... set component as base (from 0 to 3) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class pseudocolor(
    val c0 : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,
    val c3 : Any? = null,
    val i : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pseudocolor] を参照してください */
fun String.pseudocolor(c0 : Any? = null, c1 : Any? = null, c2 : Any? = null, c3 : Any? = null, i : Any? = null) : pseudocolor {
    return pseudocolor(c0, c1, c2, c3, i, "", "").apply { setInputs(this@pseudocolor) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( psnr )](https://ffmpeg.org/ffmpeg-filters.html#psnr)

```
Filter psnr
Calculate the PSNR between two video streams.
Inputs:
#0: main (video)
#1: reference (video)
Outputs:
#0: default (video)
psnr AVOptions:
stats_file        <string>     ..FV...... Set file where to store per-frame difference information
f                 <string>     ..FV...... Set file where to store per-frame difference information
stats_version     <int>        ..FV...... Set the format version for the stats file. (from 1 to 2) (default 1)
output_max        <boolean>    ..FV...... Add raw stats (max values) to the output log. (default false)

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)


```
 * */
class psnr(
    val stats_file : Any? = null,
    val stats_version : Any? = null,
    val output_max : Any? = null,
    val f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [psnr] を参照してください */
fun String.psnr(stats_file : Any? = null, stats_version : Any? = null, output_max : Any? = null, f : Any? = null) : psnr {
    return psnr(stats_file, stats_version, output_max, f, "", "").apply { setInputs(this@psnr) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pullup )](https://ffmpeg.org/ffmpeg-filters.html#pullup)

```
Filter pullup
Pullup from field sequence to frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
pullup AVOptions:
jl                <int>        ..FV...... set left junk size (from 0 to INT_MAX) (default 1)
jr                <int>        ..FV...... set right junk size (from 0 to INT_MAX) (default 1)
jt                <int>        ..FV...... set top junk size (from 1 to INT_MAX) (default 4)
jb                <int>        ..FV...... set bottom junk size (from 1 to INT_MAX) (default 4)
sb                <boolean>    ..FV...... set strict breaks (default false)
mp                <int>        ..FV...... set metric plane (from 0 to 2) (default y)
y               0            ..FV...... luma
u               1            ..FV...... chroma blue
v               2            ..FV...... chroma red


```
 * */
class pullup(
    val jl : Any? = null,
    val jr : Any? = null,
    val jt : Any? = null,
    val jb : Any? = null,
    val sb : Any? = null,
    val mp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pullup] を参照してください */
fun String.pullup(jl : Any? = null, jr : Any? = null, jt : Any? = null, jb : Any? = null, sb : Any? = null, mp : Any? = null) : pullup {
    return pullup(jl, jr, jt, jb, sb, mp, "", "").apply { setInputs(this@pullup) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( qp )](https://ffmpeg.org/ffmpeg-filters.html#qp)

```
Filter qp
Change video quantization parameters.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
qp AVOptions:
qp                <string>     ..FV...... set qp expression

This filter has support for timeline through the 'enable' option.

```
 * */
class qp(
    val qp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [qp] を参照してください */
fun String.qp(qp : Any? = null) : qp {
    return qp(qp, "", "").apply { setInputs(this@qp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( random )](https://ffmpeg.org/ffmpeg-filters.html#random)

```
Filter random
Return random frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
random AVOptions:
frames            <int>        ..FV...... set number of frames in cache (from 2 to 512) (default 30)
seed              <int64>      ..FV...... set the seed (from -1 to UINT32_MAX) (default -1)


```
 * */
class random(
    val frames : Any? = null,
    val seed : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [random] を参照してください */
fun String.random(frames : Any? = null, seed : Any? = null) : random {
    return random(frames, seed, "", "").apply { setInputs(this@random) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( readeia608 )](https://ffmpeg.org/ffmpeg-filters.html#readeia608)

```
Filter readeia608
Read EIA-608 Closed Caption codes from input video and write them to frame metadata.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
readeia608 AVOptions:
scan_min          <int>        ..FV...... set from which line to scan for codes (from 0 to INT_MAX) (default 0)
scan_max          <int>        ..FV...... set to which line to scan for codes (from 0 to INT_MAX) (default 29)
spw               <float>      ..FV...... set ratio of width reserved for sync code detection (from 0.1 to 0.7) (default 0.27)
chp               <boolean>    ..FV...... check and apply parity bit (default false)
lp                <boolean>    ..FV...... lowpass line prior to processing (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class readeia608(
    val scan_min : Any? = null,
    val scan_max : Any? = null,
    val spw : Any? = null,
    val chp : Any? = null,
    val lp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [readeia608] を参照してください */
fun String.readeia608(scan_min : Any? = null, scan_max : Any? = null, spw : Any? = null, chp : Any? = null, lp : Any? = null) : readeia608 {
    return readeia608(scan_min, scan_max, spw, chp, lp, "", "").apply { setInputs(this@readeia608) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( readvitc )](https://ffmpeg.org/ffmpeg-filters.html#readvitc)

```
Filter readvitc
Read vertical interval timecode and write it to frame metadata.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
readvitc AVOptions:
scan_max          <int>        ..FV...... maximum line numbers to scan for VITC data (from -1 to INT_MAX) (default 45)
thr_b             <double>     ..FV...... black color threshold (from 0 to 1) (default 0.2)
thr_w             <double>     ..FV...... white color threshold (from 0 to 1) (default 0.6)


```
 * */
class readvitc(
    val scan_max : Any? = null,
    val thr_b : Any? = null,
    val thr_w : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [readvitc] を参照してください */
fun String.readvitc(scan_max : Any? = null, thr_b : Any? = null, thr_w : Any? = null) : readvitc {
    return readvitc(scan_max, thr_b, thr_w, "", "").apply { setInputs(this@readvitc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( realtime )](https://ffmpeg.org/ffmpeg-filters.html#realtime)

```
Filter realtime
Slow down filtering to match realtime.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
realtime AVOptions:
limit             <duration>   ..FVA..... sleep time limit (default 2)
speed             <double>     ..FVA..... speed factor (from DBL_MIN to DBL_MAX) (default 1)


```
 * */
class realtime(
    val limit : Any? = null,
    val speed : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [realtime] を参照してください */
fun String.realtime(limit : Any? = null, speed : Any? = null) : realtime {
    return realtime(limit, speed, "", "").apply { setInputs(this@realtime) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( remap )](https://ffmpeg.org/ffmpeg-filters.html#remap)

```
Filter remap
Remap pixels.
slice threading supported
Inputs:
#0: source (video)
#1: xmap (video)
#2: ymap (video)
Outputs:
#0: default (video)
remap AVOptions:
format            <int>        ..FV...... set output format (from 0 to 1) (default color)
color           0            ..FV......
gray            1            ..FV......
fill              <color>      ..FV...... set the color of the unmapped pixels (default "black")

This filter has support for timeline through the 'enable' option.

```
 * */
class remap(
    val _format : Any? = null,
    val fill : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [remap] を参照してください */
fun String.remap(_format : Any? = null, fill : Any? = null) : remap {
    return remap(_format, fill, "", "").apply { setInputs(this@remap) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( removegrain )](https://ffmpeg.org/ffmpeg-filters.html#removegrain)

```
Filter removegrain
Remove grain.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
removegrain AVOptions:
m0                <int>        ..FV...... set mode for 1st plane (from 0 to 24) (default 0)
m1                <int>        ..FV...... set mode for 2nd plane (from 0 to 24) (default 0)
m2                <int>        ..FV...... set mode for 3rd plane (from 0 to 24) (default 0)
m3                <int>        ..FV...... set mode for 4th plane (from 0 to 24) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class removegrain(
    val m0 : Any? = null,
    val m1 : Any? = null,
    val m2 : Any? = null,
    val m3 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [removegrain] を参照してください */
fun String.removegrain(m0 : Any? = null, m1 : Any? = null, m2 : Any? = null, m3 : Any? = null) : removegrain {
    return removegrain(m0, m1, m2, m3, "", "").apply { setInputs(this@removegrain) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( removelogo )](https://ffmpeg.org/ffmpeg-filters.html#removelogo)

```
Filter removelogo
Remove a TV logo based on a mask image.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
removelogo AVOptions:
filename          <string>     ..FV...... set bitmap filename
f                 <string>     ..FV...... set bitmap filename

This filter has support for timeline through the 'enable' option.

```
 * */
class removelogo(
    val filename : Any? = null,
    val f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [removelogo] を参照してください */
fun String.removelogo(filename : Any? = null, f : Any? = null) : removelogo {
    return removelogo(filename, f, "", "").apply { setInputs(this@removelogo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( repeatfields )](https://ffmpeg.org/ffmpeg-filters.html#repeatfields)

```
Filter repeatfields
Hard repeat fields based on MPEG repeat field flag.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class repeatfields(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [repeatfields] を参照してください */
fun String.repeatfields() : repeatfields {
    return repeatfields("", "").apply { setInputs(this@repeatfields) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( reverse )](https://ffmpeg.org/ffmpeg-filters.html#reverse)

```
Filter reverse
Reverse a clip.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class reverse(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [reverse] を参照してください */
fun String.reverse() : reverse {
    return reverse("", "").apply { setInputs(this@reverse) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( rgbashift )](https://ffmpeg.org/ffmpeg-filters.html#rgbashift)

```
Filter rgbashift
Shift RGBA.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
rgbashift AVOptions:
rh                <int>        ..FV.....T shift red horizontally (from -255 to 255) (default 0)
rv                <int>        ..FV.....T shift red vertically (from -255 to 255) (default 0)
gh                <int>        ..FV.....T shift green horizontally (from -255 to 255) (default 0)
gv                <int>        ..FV.....T shift green vertically (from -255 to 255) (default 0)
bh                <int>        ..FV.....T shift blue horizontally (from -255 to 255) (default 0)
bv                <int>        ..FV.....T shift blue vertically (from -255 to 255) (default 0)
ah                <int>        ..FV.....T shift alpha horizontally (from -255 to 255) (default 0)
av                <int>        ..FV.....T shift alpha vertically (from -255 to 255) (default 0)
edge              <int>        ..FV.....T set edge operation (from 0 to 1) (default smear)
smear           0            ..FV.....T
wrap            1            ..FV.....T

This filter has support for timeline through the 'enable' option.

```
 * */
class rgbashift(
    val rh : Any? = null,
    val rv : Any? = null,
    val gh : Any? = null,
    val gv : Any? = null,
    val bh : Any? = null,
    val bv : Any? = null,
    val ah : Any? = null,
    val av : Any? = null,
    val edge : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [rgbashift] を参照してください */
fun String.rgbashift(rh : Any? = null, rv : Any? = null, gh : Any? = null, gv : Any? = null, bh : Any? = null, bv : Any? = null, ah : Any? = null, av : Any? = null, edge : Any? = null) : rgbashift {
    return rgbashift(rh, rv, gh, gv, bh, bv, ah, av, edge, "", "").apply { setInputs(this@rgbashift) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( roberts )](https://ffmpeg.org/ffmpeg-filters.html#roberts)

```
Filter roberts
Apply roberts cross operator.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
roberts AVOptions:
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)
scale             <float>      ..FV...... set scale (from 0 to 65535) (default 1)
delta             <float>      ..FV...... set delta (from -65535 to 65535) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class roberts(
    val planes : Any? = null,
    val scale : Any? = null,
    val delta : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [roberts] を参照してください */
fun String.roberts(planes : Any? = null, scale : Any? = null, delta : Any? = null) : roberts {
    return roberts(planes, scale, delta, "", "").apply { setInputs(this@roberts) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( rotate )](https://ffmpeg.org/ffmpeg-filters.html#rotate)

```
Filter rotate
Rotate the input image.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
rotate AVOptions:
angle             <string>     ..FV.....T set angle (in radians) (default "0")
a                 <string>     ..FV.....T set angle (in radians) (default "0")
out_w             <string>     ..FV...... set output width expression (default "iw")
ow                <string>     ..FV...... set output width expression (default "iw")
out_h             <string>     ..FV...... set output height expression (default "ih")
oh                <string>     ..FV...... set output height expression (default "ih")
fillcolor         <string>     ..FV...... set background fill color (default "black")
c                 <string>     ..FV...... set background fill color (default "black")
bilinear          <boolean>    ..FV...... use bilinear interpolation (default true)

This filter has support for timeline through the 'enable' option.

```
 * */
class rotate(
    val angle : Any? = null,
    val out_w : Any? = null,
    val out_h : Any? = null,
    val fillcolor : Any? = null,
    val bilinear : Any? = null,
    val a : Any? = null,
    val ow : Any? = null,
    val oh : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [rotate] を参照してください */
fun String.rotate(angle : Any? = null, out_w : Any? = null, out_h : Any? = null, fillcolor : Any? = null, bilinear : Any? = null, a : Any? = null, ow : Any? = null, oh : Any? = null, c : Any? = null) : rotate {
    return rotate(angle, out_w, out_h, fillcolor, bilinear, a, ow, oh, c, "", "").apply { setInputs(this@rotate) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sab )](https://ffmpeg.org/ffmpeg-filters.html#sab)

```
Filter sab
Apply shape adaptive blur.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
sab AVOptions:
luma_radius       <float>      ..FV...... set luma radius (from 0.1 to 4) (default 1)
lr                <float>      ..FV...... set luma radius (from 0.1 to 4) (default 1)
luma_pre_filter_radius <float>      ..FV...... set luma pre-filter radius (from 0.1 to 2) (default 1)
lpfr              <float>      ..FV...... set luma pre-filter radius (from 0.1 to 2) (default 1)
luma_strength     <float>      ..FV...... set luma strength (from 0.1 to 100) (default 1)
ls                <float>      ..FV...... set luma strength (from 0.1 to 100) (default 1)
chroma_radius     <float>      ..FV...... set chroma radius (from -0.9 to 4) (default -0.9)
cr                <float>      ..FV...... set chroma radius (from -0.9 to 4) (default -0.9)
chroma_pre_filter_radius <float>      ..FV...... set chroma pre-filter radius (from -0.9 to 2) (default -0.9)
cpfr              <float>      ..FV...... set chroma pre-filter radius (from -0.9 to 2) (default -0.9)
chroma_strength   <float>      ..FV...... set chroma strength (from -0.9 to 100) (default -0.9)
cs                <float>      ..FV...... set chroma strength (from -0.9 to 100) (default -0.9)

This filter has support for timeline through the 'enable' option.

```
 * */
class sab(
    val luma_radius : Any? = null,
    val luma_pre_filter_radius : Any? = null,
    val lpfr : Any? = null,
    val luma_strength : Any? = null,
    val chroma_radius : Any? = null,
    val chroma_pre_filter_radius : Any? = null,
    val cpfr : Any? = null,
    val chroma_strength : Any? = null,
    val lr : Any? = null,
    val ls : Any? = null,
    val cr : Any? = null,
    val cs : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sab] を参照してください */
fun String.sab(luma_radius : Any? = null, luma_pre_filter_radius : Any? = null, lpfr : Any? = null, luma_strength : Any? = null, chroma_radius : Any? = null, chroma_pre_filter_radius : Any? = null, cpfr : Any? = null, chroma_strength : Any? = null, lr : Any? = null, ls : Any? = null, cr : Any? = null, cs : Any? = null) : sab {
    return sab(luma_radius, luma_pre_filter_radius, lpfr, luma_strength, chroma_radius, chroma_pre_filter_radius, cpfr, chroma_strength, lr, ls, cr, cs, "", "").apply { setInputs(this@sab) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( scale )](https://ffmpeg.org/ffmpeg-filters.html#scale)

```
Filter scale
Scale the input video size and/or convert the image format.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
scale AVOptions:
w                 <string>     ..FV.....T Output video width
width             <string>     ..FV.....T Output video width
h                 <string>     ..FV.....T Output video height
height            <string>     ..FV.....T Output video height
flags             <string>     ..FV...... Flags to pass to libswscale (default "bilinear")
interl            <boolean>    ..FV...... set interlacing (default false)
in_color_matrix   <string>     ..FV...... set input YCbCr type (default "auto")
auto                         ..FV......
bt601                        ..FV......
bt470                        ..FV......
smpte170m                    ..FV......
bt709                        ..FV......
fcc                          ..FV......
smpte240m                    ..FV......
bt2020                       ..FV......
out_color_matrix  <string>     ..FV...... set output YCbCr type
auto                         ..FV......
bt601                        ..FV......
bt470                        ..FV......
smpte170m                    ..FV......
bt709                        ..FV......
fcc                          ..FV......
smpte240m                    ..FV......
bt2020                       ..FV......
in_range          <int>        ..FV...... set input color range (from 0 to 2) (default auto)
auto            0            ..FV......
unknown         0            ..FV......
full            2            ..FV......
limited         1            ..FV......
jpeg            2            ..FV......
mpeg            1            ..FV......
tv              1            ..FV......
pc              2            ..FV......
out_range         <int>        ..FV...... set output color range (from 0 to 2) (default auto)
auto            0            ..FV......
unknown         0            ..FV......
full            2            ..FV......
limited         1            ..FV......
jpeg            2            ..FV......
mpeg            1            ..FV......
tv              1            ..FV......
pc              2            ..FV......
in_v_chr_pos      <int>        ..FV...... input vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
in_h_chr_pos      <int>        ..FV...... input horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
out_v_chr_pos     <int>        ..FV...... output vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
out_h_chr_pos     <int>        ..FV...... output horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
force_original_aspect_ratio <int>        ..FV...... decrease or increase w/h if necessary to keep the original AR (from 0 to 2) (default disable)
disable         0            ..FV......
decrease        1            ..FV......
increase        2            ..FV......
force_divisible_by <int>        ..FV...... enforce that the output resolution is divisible by a defined integer when force_original_aspect_ratio is used (from 1 to 256) (default 1)
param0            <double>     ..FV...... Scaler param 0 (from INT_MIN to INT_MAX) (default 123456)
param1            <double>     ..FV...... Scaler param 1 (from INT_MIN to INT_MAX) (default 123456)
nb_slices         <int>        ..FV...... set the number of slices (debug purpose only) (from 0 to INT_MAX) (default 0)
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions during initialization and per-frame

SWScaler AVOptions:
-sws_flags         <flags>      E..V...... scaler flags (default bicubic)
fast_bilinear                E..V...... fast bilinear
bilinear                     E..V...... bilinear
bicubic                      E..V...... bicubic
experimental                 E..V...... experimental
neighbor                     E..V...... nearest neighbor
area                         E..V...... averaging area
bicublin                     E..V...... luma bicubic, chroma bilinear
gauss                        E..V...... Gaussian
sinc                         E..V...... sinc
lanczos                      E..V...... Lanczos
spline                       E..V...... natural bicubic spline
print_info                   E..V...... print info
accurate_rnd                 E..V...... accurate rounding
full_chroma_int              E..V...... full chroma interpolation
full_chroma_inp              E..V...... full chroma input
bitexact                     E..V......
error_diffusion              E..V...... error diffusion dither
-srcw              <int>        E..V...... source width (from 1 to INT_MAX) (default 16)
-srch              <int>        E..V...... source height (from 1 to INT_MAX) (default 16)
-dstw              <int>        E..V...... destination width (from 1 to INT_MAX) (default 16)
-dsth              <int>        E..V...... destination height (from 1 to INT_MAX) (default 16)
-src_format        <pix_fmt>    E..V...... source format (default yuv420p)
-dst_format        <pix_fmt>    E..V...... destination format (default yuv420p)
-src_range         <boolean>    E..V...... source is full range (default false)
-dst_range         <boolean>    E..V...... destination is full range (default false)
-param0            <double>     E..V...... scaler param 0 (from INT_MIN to INT_MAX) (default 123456)
-param1            <double>     E..V...... scaler param 1 (from INT_MIN to INT_MAX) (default 123456)
-src_v_chr_pos     <int>        E..V...... source vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
-src_h_chr_pos     <int>        E..V...... source horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
-dst_v_chr_pos     <int>        E..V...... destination vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
-dst_h_chr_pos     <int>        E..V...... destination horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
-sws_dither        <int>        E..V...... set dithering algorithm (from 0 to 6) (default auto)
auto            1            E..V...... leave choice to sws
bayer           2            E..V...... bayer dither
ed              3            E..V...... error diffusion
a_dither        4            E..V...... arithmetic addition dither
x_dither        5            E..V...... arithmetic xor dither
-gamma             <boolean>    E..V...... gamma correct scaling (default false)
-alphablend        <int>        E..V...... mode for alpha -> non alpha (from 0 to 2) (default none)
none            0            E..V...... ignore alpha
uniform_color   1            E..V...... blend onto a uniform color
checkerboard    2            E..V...... blend onto a checkerboard


```
 * */
class scale(
    val w : Any? = null,
    val width : Any? = null,
    val h : Any? = null,
    val height : Any? = null,
    val flags : Any? = null,
    val interl : Any? = null,
    val in_color_matrix : Any? = null,
    val out_color_matrix : Any? = null,
    val in_range : Any? = null,
    val out_range : Any? = null,
    val in_v_chr_pos : Any? = null,
    val in_h_chr_pos : Any? = null,
    val out_v_chr_pos : Any? = null,
    val out_h_chr_pos : Any? = null,
    val force_original_aspect_ratio : Any? = null,
    val force_divisible_by : Any? = null,
    val param0 : Any? = null,
    val param1 : Any? = null,
    val nb_slices : Any? = null,
    val eval : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [scale] を参照してください */
fun String.scale(w : Any? = null, width : Any? = null, h : Any? = null, height : Any? = null, flags : Any? = null, interl : Any? = null, in_color_matrix : Any? = null, out_color_matrix : Any? = null, in_range : Any? = null, out_range : Any? = null, in_v_chr_pos : Any? = null, in_h_chr_pos : Any? = null, out_v_chr_pos : Any? = null, out_h_chr_pos : Any? = null, force_original_aspect_ratio : Any? = null, force_divisible_by : Any? = null, param0 : Any? = null, param1 : Any? = null, nb_slices : Any? = null, eval : Any? = null) : scale {
    return scale(w, width, h, height, flags, interl, in_color_matrix, out_color_matrix, in_range, out_range, in_v_chr_pos, in_h_chr_pos, out_v_chr_pos, out_h_chr_pos, force_original_aspect_ratio, force_divisible_by, param0, param1, nb_slices, eval, "", "").apply { setInputs(this@scale) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( scale_cuda )](https://ffmpeg.org/ffmpeg-filters.html#scale_cuda)

```
Filter scale_cuda
GPU accelerated video resizer
Inputs:
#0: default (video)
Outputs:
#0: default (video)
cudascale AVOptions:
w                 <string>     ..FV...... Output video width (default "iw")
h                 <string>     ..FV...... Output video height (default "ih")
force_original_aspect_ratio <int>        ..FV...... decrease or increase w/h if necessary to keep the original AR (from 0 to 2) (default disable)
disable         0            ..FV......
decrease        1            ..FV......
increase        2            ..FV......
force_divisible_by <int>        ..FV...... enforce that the output resolution is divisible by a defined integer when force_original_aspect_ratio is used (from 1 to 256) (default 1)


```
 * */
class scale_cuda(
    val w : Any? = null,
    val h : Any? = null,
    val force_original_aspect_ratio : Any? = null,
    val force_divisible_by : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [scale_cuda] を参照してください */
fun String.scale_cuda(w : Any? = null, h : Any? = null, force_original_aspect_ratio : Any? = null, force_divisible_by : Any? = null) : scale_cuda {
    return scale_cuda(w, h, force_original_aspect_ratio, force_divisible_by, "", "").apply { setInputs(this@scale_cuda) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( scale_qsv )](https://ffmpeg.org/ffmpeg-filters.html#scale_qsv)

```
Filter scale_qsv
QuickSync video scaling and format conversion
Inputs:
#0: default (video)
Outputs:
#0: default (video)
scale_qsv AVOptions:
w                 <string>     ..FV...... Output video width (default "iw")
h                 <string>     ..FV...... Output video height (default "ih")
format            <string>     ..FV...... Output pixel format (default "same")
mode              <int>        ..FV...... set scaling mode (from 0 to 2) (default 0)
low_power       1            ..FV...... low power mode
hq              2            ..FV...... high quality mode


```
 * */
class scale_qsv(
    val w : Any? = null,
    val h : Any? = null,
    val _format : Any? = null,
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [scale_qsv] を参照してください */
fun String.scale_qsv(w : Any? = null, h : Any? = null, _format : Any? = null, mode : Any? = null) : scale_qsv {
    return scale_qsv(w, h, _format, mode, "", "").apply { setInputs(this@scale_qsv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( scale2ref )](https://ffmpeg.org/ffmpeg-filters.html#scale2ref)

```
Filter scale2ref
Scale the input video size and/or convert the image format to the given reference.
Inputs:
#0: default (video)
#1: ref (video)
Outputs:
#0: default (video)
#1: ref (video)
scale2ref AVOptions:
w                 <string>     ..FV.....T Output video width
width             <string>     ..FV.....T Output video width
h                 <string>     ..FV.....T Output video height
height            <string>     ..FV.....T Output video height
flags             <string>     ..FV...... Flags to pass to libswscale (default "bilinear")
interl            <boolean>    ..FV...... set interlacing (default false)
in_color_matrix   <string>     ..FV...... set input YCbCr type (default "auto")
auto                         ..FV......
bt601                        ..FV......
bt470                        ..FV......
smpte170m                    ..FV......
bt709                        ..FV......
fcc                          ..FV......
smpte240m                    ..FV......
bt2020                       ..FV......
out_color_matrix  <string>     ..FV...... set output YCbCr type
auto                         ..FV......
bt601                        ..FV......
bt470                        ..FV......
smpte170m                    ..FV......
bt709                        ..FV......
fcc                          ..FV......
smpte240m                    ..FV......
bt2020                       ..FV......
in_range          <int>        ..FV...... set input color range (from 0 to 2) (default auto)
auto            0            ..FV......
unknown         0            ..FV......
full            2            ..FV......
limited         1            ..FV......
jpeg            2            ..FV......
mpeg            1            ..FV......
tv              1            ..FV......
pc              2            ..FV......
out_range         <int>        ..FV...... set output color range (from 0 to 2) (default auto)
auto            0            ..FV......
unknown         0            ..FV......
full            2            ..FV......
limited         1            ..FV......
jpeg            2            ..FV......
mpeg            1            ..FV......
tv              1            ..FV......
pc              2            ..FV......
in_v_chr_pos      <int>        ..FV...... input vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
in_h_chr_pos      <int>        ..FV...... input horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
out_v_chr_pos     <int>        ..FV...... output vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
out_h_chr_pos     <int>        ..FV...... output horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
force_original_aspect_ratio <int>        ..FV...... decrease or increase w/h if necessary to keep the original AR (from 0 to 2) (default disable)
disable         0            ..FV......
decrease        1            ..FV......
increase        2            ..FV......
force_divisible_by <int>        ..FV...... enforce that the output resolution is divisible by a defined integer when force_original_aspect_ratio is used (from 1 to 256) (default 1)
param0            <double>     ..FV...... Scaler param 0 (from INT_MIN to INT_MAX) (default 123456)
param1            <double>     ..FV...... Scaler param 1 (from INT_MIN to INT_MAX) (default 123456)
nb_slices         <int>        ..FV...... set the number of slices (debug purpose only) (from 0 to INT_MAX) (default 0)
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions during initialization and per-frame

SWScaler AVOptions:
-sws_flags         <flags>      E..V...... scaler flags (default bicubic)
fast_bilinear                E..V...... fast bilinear
bilinear                     E..V...... bilinear
bicubic                      E..V...... bicubic
experimental                 E..V...... experimental
neighbor                     E..V...... nearest neighbor
area                         E..V...... averaging area
bicublin                     E..V...... luma bicubic, chroma bilinear
gauss                        E..V...... Gaussian
sinc                         E..V...... sinc
lanczos                      E..V...... Lanczos
spline                       E..V...... natural bicubic spline
print_info                   E..V...... print info
accurate_rnd                 E..V...... accurate rounding
full_chroma_int              E..V...... full chroma interpolation
full_chroma_inp              E..V...... full chroma input
bitexact                     E..V......
error_diffusion              E..V...... error diffusion dither
-srcw              <int>        E..V...... source width (from 1 to INT_MAX) (default 16)
-srch              <int>        E..V...... source height (from 1 to INT_MAX) (default 16)
-dstw              <int>        E..V...... destination width (from 1 to INT_MAX) (default 16)
-dsth              <int>        E..V...... destination height (from 1 to INT_MAX) (default 16)
-src_format        <pix_fmt>    E..V...... source format (default yuv420p)
-dst_format        <pix_fmt>    E..V...... destination format (default yuv420p)
-src_range         <boolean>    E..V...... source is full range (default false)
-dst_range         <boolean>    E..V...... destination is full range (default false)
-param0            <double>     E..V...... scaler param 0 (from INT_MIN to INT_MAX) (default 123456)
-param1            <double>     E..V...... scaler param 1 (from INT_MIN to INT_MAX) (default 123456)
-src_v_chr_pos     <int>        E..V...... source vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
-src_h_chr_pos     <int>        E..V...... source horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
-dst_v_chr_pos     <int>        E..V...... destination vertical chroma position in luma grid/256 (from -513 to 512) (default -513)
-dst_h_chr_pos     <int>        E..V...... destination horizontal chroma position in luma grid/256 (from -513 to 512) (default -513)
-sws_dither        <int>        E..V...... set dithering algorithm (from 0 to 6) (default auto)
auto            1            E..V...... leave choice to sws
bayer           2            E..V...... bayer dither
ed              3            E..V...... error diffusion
a_dither        4            E..V...... arithmetic addition dither
x_dither        5            E..V...... arithmetic xor dither
-gamma             <boolean>    E..V...... gamma correct scaling (default false)
-alphablend        <int>        E..V...... mode for alpha -> non alpha (from 0 to 2) (default none)
none            0            E..V...... ignore alpha
uniform_color   1            E..V...... blend onto a uniform color
checkerboard    2            E..V...... blend onto a checkerboard


```
 * */
class scale2ref(
    val w : Any? = null,
    val width : Any? = null,
    val h : Any? = null,
    val height : Any? = null,
    val flags : Any? = null,
    val interl : Any? = null,
    val in_color_matrix : Any? = null,
    val out_color_matrix : Any? = null,
    val in_range : Any? = null,
    val out_range : Any? = null,
    val in_v_chr_pos : Any? = null,
    val in_h_chr_pos : Any? = null,
    val out_v_chr_pos : Any? = null,
    val out_h_chr_pos : Any? = null,
    val force_original_aspect_ratio : Any? = null,
    val force_divisible_by : Any? = null,
    val param0 : Any? = null,
    val param1 : Any? = null,
    val nb_slices : Any? = null,
    val eval : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [scale2ref] を参照してください */
fun String.scale2ref(w : Any? = null, width : Any? = null, h : Any? = null, height : Any? = null, flags : Any? = null, interl : Any? = null, in_color_matrix : Any? = null, out_color_matrix : Any? = null, in_range : Any? = null, out_range : Any? = null, in_v_chr_pos : Any? = null, in_h_chr_pos : Any? = null, out_v_chr_pos : Any? = null, out_h_chr_pos : Any? = null, force_original_aspect_ratio : Any? = null, force_divisible_by : Any? = null, param0 : Any? = null, param1 : Any? = null, nb_slices : Any? = null, eval : Any? = null) : scale2ref {
    return scale2ref(w, width, h, height, flags, interl, in_color_matrix, out_color_matrix, in_range, out_range, in_v_chr_pos, in_h_chr_pos, out_v_chr_pos, out_h_chr_pos, force_original_aspect_ratio, force_divisible_by, param0, param1, nb_slices, eval, "", "").apply { setInputs(this@scale2ref) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( scdet )](https://ffmpeg.org/ffmpeg-filters.html#scdet)

```
Filter scdet
Detect video scene change
Inputs:
#0: default (video)
Outputs:
#0: default (video)
scdet AVOptions:
threshold         <double>     ..FV...... set scene change detect threshold (from 0 to 100) (default 10)
t                 <double>     ..FV...... set scene change detect threshold (from 0 to 100) (default 10)
sc_pass           <boolean>    ..FV...... Set the flag to pass scene change frames (default false)
s                 <boolean>    ..FV...... Set the flag to pass scene change frames (default false)


```
 * */
class scdet(
    val threshold : Any? = null,
    val sc_pass : Any? = null,
    val t : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [scdet] を参照してください */
fun String.scdet(threshold : Any? = null, sc_pass : Any? = null, t : Any? = null, s : Any? = null) : scdet {
    return scdet(threshold, sc_pass, t, s, "", "").apply { setInputs(this@scdet) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( scroll )](https://ffmpeg.org/ffmpeg-filters.html#scroll)

```
Filter scroll
Scroll input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
scroll AVOptions:
horizontal        <float>      ..FV.....T set the horizontal scrolling speed (from -1 to 1) (default 0)
h                 <float>      ..FV.....T set the horizontal scrolling speed (from -1 to 1) (default 0)
vertical          <float>      ..FV.....T set the vertical scrolling speed (from -1 to 1) (default 0)
v                 <float>      ..FV.....T set the vertical scrolling speed (from -1 to 1) (default 0)
hpos              <float>      ..FV...... set initial horizontal position (from 0 to 1) (default 0)
vpos              <float>      ..FV...... set initial vertical position (from 0 to 1) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class scroll(
    val horizontal : Any? = null,
    val vertical : Any? = null,
    val hpos : Any? = null,
    val vpos : Any? = null,
    val h : Any? = null,
    val v : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [scroll] を参照してください */
fun String.scroll(horizontal : Any? = null, vertical : Any? = null, hpos : Any? = null, vpos : Any? = null, h : Any? = null, v : Any? = null) : scroll {
    return scroll(horizontal, vertical, hpos, vpos, h, v, "", "").apply { setInputs(this@scroll) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( select )](https://ffmpeg.org/ffmpeg-filters.html#select)

```
Filter select
Select video frames to pass in output.
Inputs:
#0: default (video)
Outputs:
dynamic (depending on the options)
select AVOptions:
expr              <string>     ..FV...... set an expression to use for selecting frames (default "1")
e                 <string>     ..FV...... set an expression to use for selecting frames (default "1")
outputs           <int>        ..FV...... set the number of outputs (from 1 to INT_MAX) (default 1)
n                 <int>        ..FV...... set the number of outputs (from 1 to INT_MAX) (default 1)


```
 * */
class select(
    val expr : Any? = null,
    val outputs : Any? = null,
    val e : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [select] を参照してください */
fun String.select(expr : Any? = null, outputs : Any? = null, e : Any? = null, n : Any? = null) : select {
    return select(expr, outputs, e, n, "", "").apply { setInputs(this@select) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( selectivecolor )](https://ffmpeg.org/ffmpeg-filters.html#selectivecolor)

```
Filter selectivecolor
Apply CMYK adjustments to specific color ranges.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
selectivecolor AVOptions:
correction_method <int>        ..FV...... select correction method (from 0 to 1) (default absolute)
absolute        0            ..FV......
relative        1            ..FV......
reds              <string>     ..FV...... adjust red regions
yellows           <string>     ..FV...... adjust yellow regions
greens            <string>     ..FV...... adjust green regions
cyans             <string>     ..FV...... adjust cyan regions
blues             <string>     ..FV...... adjust blue regions
magentas          <string>     ..FV...... adjust magenta regions
whites            <string>     ..FV...... adjust white regions
neutrals          <string>     ..FV...... adjust neutral regions
blacks            <string>     ..FV...... adjust black regions
psfile            <string>     ..FV...... set Photoshop selectivecolor file name

This filter has support for timeline through the 'enable' option.

```
 * */
class selectivecolor(
    val correction_method : Any? = null,
    val reds : Any? = null,
    val yellows : Any? = null,
    val greens : Any? = null,
    val cyans : Any? = null,
    val blues : Any? = null,
    val magentas : Any? = null,
    val whites : Any? = null,
    val neutrals : Any? = null,
    val blacks : Any? = null,
    val psfile : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [selectivecolor] を参照してください */
fun String.selectivecolor(correction_method : Any? = null, reds : Any? = null, yellows : Any? = null, greens : Any? = null, cyans : Any? = null, blues : Any? = null, magentas : Any? = null, whites : Any? = null, neutrals : Any? = null, blacks : Any? = null, psfile : Any? = null) : selectivecolor {
    return selectivecolor(correction_method, reds, yellows, greens, cyans, blues, magentas, whites, neutrals, blacks, psfile, "", "").apply { setInputs(this@selectivecolor) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sendcmd )](https://ffmpeg.org/ffmpeg-filters.html#sendcmd)

```
Filter sendcmd
Send commands to filters.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
sendcmd AVOptions:
commands          <string>     ..FVA..... set commands
c                 <string>     ..FVA..... set commands
filename          <string>     ..FVA..... set commands file
f                 <string>     ..FVA..... set commands file


```
 * */
class sendcmd(
    val commands : Any? = null,
    val filename : Any? = null,
    val c : Any? = null,
    val f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sendcmd] を参照してください */
fun String.sendcmd(commands : Any? = null, filename : Any? = null, c : Any? = null, f : Any? = null) : sendcmd {
    return sendcmd(commands, filename, c, f, "", "").apply { setInputs(this@sendcmd) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( separatefields )](https://ffmpeg.org/ffmpeg-filters.html#separatefields)

```
Filter separatefields
Split input video frames into fields.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class separatefields(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [separatefields] を参照してください */
fun String.separatefields() : separatefields {
    return separatefields("", "").apply { setInputs(this@separatefields) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( setdar )](https://ffmpeg.org/ffmpeg-filters.html#setdar)

```
Filter setdar
Set the frame display aspect ratio.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
setdar AVOptions:
dar               <string>     ..FV...... set display aspect ratio (default "0")
ratio             <string>     ..FV...... set display aspect ratio (default "0")
r                 <string>     ..FV...... set display aspect ratio (default "0")
max               <int>        ..FV...... set max value for nominator or denominator in the ratio (from 1 to INT_MAX) (default 100)


```
 * */
class setdar(
    val dar : Any? = null,
    val ratio : Any? = null,
    val max : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [setdar] を参照してください */
fun String.setdar(dar : Any? = null, ratio : Any? = null, max : Any? = null, r : Any? = null) : setdar {
    return setdar(dar, ratio, max, r, "", "").apply { setInputs(this@setdar) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( setfield )](https://ffmpeg.org/ffmpeg-filters.html#setfield)

```
Filter setfield
Force field for the output video frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
setfield AVOptions:
mode              <int>        ..FV...... select interlace mode (from -1 to 2) (default auto)
auto            -1           ..FV...... keep the same input field
bff             0            ..FV...... mark as bottom-field-first
tff             1            ..FV...... mark as top-field-first
prog            2            ..FV...... mark as progressive


```
 * */
class setfield(
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [setfield] を参照してください */
fun String.setfield(mode : Any? = null) : setfield {
    return setfield(mode, "", "").apply { setInputs(this@setfield) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( setparams )](https://ffmpeg.org/ffmpeg-filters.html#setparams)

```
Filter setparams
Force field, or color property for the output video frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
setparams AVOptions:
field_mode        <int>        ..FV...... select interlace mode (from -1 to 2) (default auto)
auto            -1           ..FV...... keep the same input field
bff             0            ..FV...... mark as bottom-field-first
tff             1            ..FV...... mark as top-field-first
prog            2            ..FV...... mark as progressive
range             <int>        ..FV...... select color range (from -1 to 2) (default auto)
auto            -1           ..FV...... keep the same color range
unspecified     0            ..FV......
unknown         0            ..FV......
limited         1            ..FV......
tv              1            ..FV......
mpeg            1            ..FV......
full            2            ..FV......
pc              2            ..FV......
jpeg            2            ..FV......
color_primaries   <int>        ..FV...... select color primaries (from -1 to 22) (default auto)
auto            -1           ..FV...... keep the same color primaries
bt709           1            ..FV......
unknown         2            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
film            8            ..FV......
bt2020          9            ..FV......
smpte428        10           ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
color_trc         <int>        ..FV...... select color transfer (from -1 to 18) (default auto)
auto            -1           ..FV...... keep the same color transfer
bt709           1            ..FV......
unknown         2            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
linear          8            ..FV......
log100          9            ..FV......
log316          10           ..FV......
iec61966-2-4    11           ..FV......
bt1361e         12           ..FV......
iec61966-2-1    13           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......
smpte2084       16           ..FV......
smpte428        17           ..FV......
arib-std-b67    18           ..FV......
colorspace        <int>        ..FV...... select colorspace (from -1 to 14) (default auto)
auto            -1           ..FV...... keep the same colorspace
gbr             0            ..FV......
bt709           1            ..FV......
unknown         2            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
ycgco           8            ..FV......
bt2020nc        9            ..FV......
bt2020c         10           ..FV......
smpte2085       11           ..FV......
chroma-derived-nc 12           ..FV......
chroma-derived-c 13           ..FV......
ictcp           14           ..FV......


```
 * */
class setparams(
    val field_mode : Any? = null,
    val range : Any? = null,
    val color_primaries : Any? = null,
    val color_trc : Any? = null,
    val colorspace : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [setparams] を参照してください */
fun String.setparams(field_mode : Any? = null, range : Any? = null, color_primaries : Any? = null, color_trc : Any? = null, colorspace : Any? = null) : setparams {
    return setparams(field_mode, range, color_primaries, color_trc, colorspace, "", "").apply { setInputs(this@setparams) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( setpts )](https://ffmpeg.org/ffmpeg-filters.html#setpts)

```
Filter setpts
Set PTS for the output video frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
setpts AVOptions:
expr              <string>     ..FVA..... Expression determining the frame timestamp (default "PTS")


```
 * */
class setpts(
    val expr : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [setpts] を参照してください */
fun String.setpts(expr : Any? = null) : setpts {
    return setpts(expr, "", "").apply { setInputs(this@setpts) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( setrange )](https://ffmpeg.org/ffmpeg-filters.html#setrange)

```
Filter setrange
Force color range for the output video frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
setrange AVOptions:
range             <int>        ..FV...... select color range (from -1 to 2) (default auto)
auto            -1           ..FV...... keep the same color range
unspecified     0            ..FV......
unknown         0            ..FV......
limited         1            ..FV......
tv              1            ..FV......
mpeg            1            ..FV......
full            2            ..FV......
pc              2            ..FV......
jpeg            2            ..FV......


```
 * */
class setrange(
    val range : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [setrange] を参照してください */
fun String.setrange(range : Any? = null) : setrange {
    return setrange(range, "", "").apply { setInputs(this@setrange) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( setsar )](https://ffmpeg.org/ffmpeg-filters.html#setsar)

```
Filter setsar
Set the pixel sample aspect ratio.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
setsar AVOptions:
sar               <string>     ..FV...... set sample (pixel) aspect ratio (default "0")
ratio             <string>     ..FV...... set sample (pixel) aspect ratio (default "0")
r                 <string>     ..FV...... set sample (pixel) aspect ratio (default "0")
max               <int>        ..FV...... set max value for nominator or denominator in the ratio (from 1 to INT_MAX) (default 100)


```
 * */
class setsar(
    val sar : Any? = null,
    val ratio : Any? = null,
    val max : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [setsar] を参照してください */
fun String.setsar(sar : Any? = null, ratio : Any? = null, max : Any? = null, r : Any? = null) : setsar {
    return setsar(sar, ratio, max, r, "", "").apply { setInputs(this@setsar) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( settb )](https://ffmpeg.org/ffmpeg-filters.html#settb)

```
Filter settb
Set timebase for the video output link.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
settb AVOptions:
expr              <string>     ..FV...... set expression determining the output timebase (default "intb")
tb                <string>     ..FV...... set expression determining the output timebase (default "intb")


```
 * */
class settb(
    val expr : Any? = null,
    val tb : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [settb] を参照してください */
fun String.settb(expr : Any? = null, tb : Any? = null) : settb {
    return settb(expr, tb, "", "").apply { setInputs(this@settb) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showinfo )](https://ffmpeg.org/ffmpeg-filters.html#showinfo)

```
Filter showinfo
Show textual information for each video frame.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
showinfo AVOptions:
checksum          <boolean>    ..FV...... calculate checksums (default true)


```
 * */
class showinfo(
    val checksum : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showinfo] を参照してください */
fun String.showinfo(checksum : Any? = null) : showinfo {
    return showinfo(checksum, "", "").apply { setInputs(this@showinfo) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showpalette )](https://ffmpeg.org/ffmpeg-filters.html#showpalette)

```
Filter showpalette
Display frame palette.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
showpalette AVOptions:
s                 <int>        ..FV...... set pixel box size (from 1 to 100) (default 30)


```
 * */
class showpalette(
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showpalette] を参照してください */
fun String.showpalette(s : Any? = null) : showpalette {
    return showpalette(s, "", "").apply { setInputs(this@showpalette) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( shuffleframes )](https://ffmpeg.org/ffmpeg-filters.html#shuffleframes)

```
Filter shuffleframes
Shuffle video frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
shuffleframes AVOptions:
mapping           <string>     ..FV...... set destination indexes of input frames (default "0")

This filter has support for timeline through the 'enable' option.

```
 * */
class shuffleframes(
    val mapping : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [shuffleframes] を参照してください */
fun String.shuffleframes(mapping : Any? = null) : shuffleframes {
    return shuffleframes(mapping, "", "").apply { setInputs(this@shuffleframes) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( shuffleplanes )](https://ffmpeg.org/ffmpeg-filters.html#shuffleplanes)

```
Filter shuffleplanes
Shuffle video planes.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
shuffleplanes AVOptions:
map0              <int>        ..FV...... Index of the input plane to be used as the first output plane  (from 0 to 3) (default 0)
map1              <int>        ..FV...... Index of the input plane to be used as the second output plane  (from 0 to 3) (default 1)
map2              <int>        ..FV...... Index of the input plane to be used as the third output plane  (from 0 to 3) (default 2)
map3              <int>        ..FV...... Index of the input plane to be used as the fourth output plane  (from 0 to 3) (default 3)

This filter has support for timeline through the 'enable' option.

```
 * */
class shuffleplanes(
    val map0 : Any? = null,
    val map1 : Any? = null,
    val map2 : Any? = null,
    val map3 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [shuffleplanes] を参照してください */
fun String.shuffleplanes(map0 : Any? = null, map1 : Any? = null, map2 : Any? = null, map3 : Any? = null) : shuffleplanes {
    return shuffleplanes(map0, map1, map2, map3, "", "").apply { setInputs(this@shuffleplanes) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sidedata )](https://ffmpeg.org/ffmpeg-filters.html#sidedata)

```
Filter sidedata
Manipulate video frame side data.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
sidedata AVOptions:
mode              <int>        ..FV...... set a mode of operation (from 0 to 1) (default select)
select          0            ..FV...... select frame
delete          1            ..FV...... delete side data
type              <int>        ..FV...... set side data type (from -1 to INT_MAX) (default -1)
PANSCAN         0            ..FV......
A53_CC          1            ..FV......
STEREO3D        2            ..FV......
MATRIXENCODING  3            ..FV......
DOWNMIX_INFO    4            ..FV......
REPLAYGAIN      5            ..FV......
DISPLAYMATRIX   6            ..FV......
AFD             7            ..FV......
MOTION_VECTORS  8            ..FV......
SKIP_SAMPLES    9            ..FV......
AUDIO_SERVICE_TYPE 10           ..FV......
MASTERING_DISPLAY_METADATA 11           ..FV......
GOP_TIMECODE    12           ..FV......
SPHERICAL       13           ..FV......
CONTENT_LIGHT_LEVEL 14           ..FV......
ICC_PROFILE     15           ..FV......
QP_TABLE_PROPERTIES 16           ..FV......
QP_TABLE_DATA   17           ..FV......
S12M_TIMECOD    18           ..FV......
DYNAMIC_HDR_PLUS 19           ..FV......
REGIONS_OF_INTEREST 20           ..FV......

This filter has support for timeline through the 'enable' option.

```
 * */
class sidedata(
    val mode : Any? = null,
    val type : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sidedata] を参照してください */
fun String.sidedata(mode : Any? = null, type : Any? = null) : sidedata {
    return sidedata(mode, type, "", "").apply { setInputs(this@sidedata) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( signalstats )](https://ffmpeg.org/ffmpeg-filters.html#signalstats)

```
Filter signalstats
Generate statistics from video analysis.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
signalstats AVOptions:
stat              <flags>      ..FV...... set statistics filters (default 0)
tout                         ..FV...... analyze pixels for temporal outliers
vrep                         ..FV...... analyze video lines for vertical line repetition
brng                         ..FV...... analyze for pixels outside of broadcast range
out               <int>        ..FV...... set video filter (from -1 to 2) (default -1)
tout            0            ..FV...... highlight pixels that depict temporal outliers
vrep            1            ..FV...... highlight video lines that depict vertical line repetition
brng            2            ..FV...... highlight pixels that are outside of broadcast range
c                 <color>      ..FV...... set highlight color (default "yellow")
color             <color>      ..FV...... set highlight color (default "yellow")


```
 * */
class signalstats(
    val stat : Any? = null,
    val out : Any? = null,
    val c : Any? = null,
    val color : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [signalstats] を参照してください */
fun String.signalstats(stat : Any? = null, out : Any? = null, c : Any? = null, color : Any? = null) : signalstats {
    return signalstats(stat, out, c, color, "", "").apply { setInputs(this@signalstats) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( signature )](https://ffmpeg.org/ffmpeg-filters.html#signature)

```
Filter signature
Calculate the MPEG-7 video signature
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
signature AVOptions:
detectmode        <int>        ..FV...... set the detectmode (from 0 to 2) (default off)
off             0            ..FV......
full            1            ..FV......
fast            2            ..FV......
nb_inputs         <int>        ..FV...... number of inputs (from 1 to INT_MAX) (default 1)
filename          <string>     ..FV...... filename for output files (default "")
format            <int>        ..FV...... set output format (from 0 to 1) (default binary)
binary          0            ..FV......
xml             1            ..FV......
th_d              <int>        ..FV...... threshold to detect one word as similar (from 1 to INT_MAX) (default 9000)
th_dc             <int>        ..FV...... threshold to detect all words as similar (from 1 to INT_MAX) (default 60000)
th_xh             <int>        ..FV...... threshold to detect frames as similar (from 1 to INT_MAX) (default 116)
th_di             <int>        ..FV...... minimum length of matching sequence in frames (from 0 to INT_MAX) (default 0)
th_it             <double>     ..FV...... threshold for relation of good to all frames (from 0 to 1) (default 0.5)


```
 * */
class signature(
    val detectmode : Any? = null,
    val nb_inputs : Any? = null,
    val filename : Any? = null,
    val _format : Any? = null,
    val th_d : Any? = null,
    val th_dc : Any? = null,
    val th_xh : Any? = null,
    val th_di : Any? = null,
    val th_it : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [signature] を参照してください */
fun String.signature(detectmode : Any? = null, nb_inputs : Any? = null, filename : Any? = null, _format : Any? = null, th_d : Any? = null, th_dc : Any? = null, th_xh : Any? = null, th_di : Any? = null, th_it : Any? = null) : signature {
    return signature(detectmode, nb_inputs, filename, _format, th_d, th_dc, th_xh, th_di, th_it, "", "").apply { setInputs(this@signature) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( smartblur )](https://ffmpeg.org/ffmpeg-filters.html#smartblur)

```
Filter smartblur
Blur the input video without impacting the outlines.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
smartblur AVOptions:
luma_radius       <float>      ..FV...... set luma radius (from 0.1 to 5) (default 1)
lr                <float>      ..FV...... set luma radius (from 0.1 to 5) (default 1)
luma_strength     <float>      ..FV...... set luma strength (from -1 to 1) (default 1)
ls                <float>      ..FV...... set luma strength (from -1 to 1) (default 1)
luma_threshold    <int>        ..FV...... set luma threshold (from -30 to 30) (default 0)
lt                <int>        ..FV...... set luma threshold (from -30 to 30) (default 0)
chroma_radius     <float>      ..FV...... set chroma radius (from -0.9 to 5) (default -0.9)
cr                <float>      ..FV...... set chroma radius (from -0.9 to 5) (default -0.9)
chroma_strength   <float>      ..FV...... set chroma strength (from -2 to 1) (default -2)
cs                <float>      ..FV...... set chroma strength (from -2 to 1) (default -2)
chroma_threshold  <int>        ..FV...... set chroma threshold (from -31 to 30) (default -31)
ct                <int>        ..FV...... set chroma threshold (from -31 to 30) (default -31)

This filter has support for timeline through the 'enable' option.

```
 * */
class smartblur(
    val luma_radius : Any? = null,
    val luma_strength : Any? = null,
    val luma_threshold : Any? = null,
    val chroma_radius : Any? = null,
    val chroma_strength : Any? = null,
    val chroma_threshold : Any? = null,
    val lr : Any? = null,
    val ls : Any? = null,
    val lt : Any? = null,
    val cr : Any? = null,
    val cs : Any? = null,
    val ct : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [smartblur] を参照してください */
fun String.smartblur(luma_radius : Any? = null, luma_strength : Any? = null, luma_threshold : Any? = null, chroma_radius : Any? = null, chroma_strength : Any? = null, chroma_threshold : Any? = null, lr : Any? = null, ls : Any? = null, lt : Any? = null, cr : Any? = null, cs : Any? = null, ct : Any? = null) : smartblur {
    return smartblur(luma_radius, luma_strength, luma_threshold, chroma_radius, chroma_strength, chroma_threshold, lr, ls, lt, cr, cs, ct, "", "").apply { setInputs(this@smartblur) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sobel )](https://ffmpeg.org/ffmpeg-filters.html#sobel)

```
Filter sobel
Apply sobel operator.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
sobel AVOptions:
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)
scale             <float>      ..FV...... set scale (from 0 to 65535) (default 1)
delta             <float>      ..FV...... set delta (from -65535 to 65535) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class sobel(
    val planes : Any? = null,
    val scale : Any? = null,
    val delta : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sobel] を参照してください */
fun String.sobel(planes : Any? = null, scale : Any? = null, delta : Any? = null) : sobel {
    return sobel(planes, scale, delta, "", "").apply { setInputs(this@sobel) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( split )](https://ffmpeg.org/ffmpeg-filters.html#split)

```
Filter split
Pass on the input to N video outputs.
Inputs:
#0: default (video)
Outputs:
dynamic (depending on the options)
split AVOptions:
outputs           <int>        ..FVA..... set number of outputs (from 1 to INT_MAX) (default 2)


```
 * */
class split(
    val outputs : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [split] を参照してください */
fun String.split(outputs : Any? = null) : split {
    return split(outputs, "", "").apply { setInputs(this@split) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( spp )](https://ffmpeg.org/ffmpeg-filters.html#spp)

```
Filter spp
Apply a simple post processing filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
spp AVOptions:
quality           <int>        ..FV.....T set quality (from 0 to 6) (default 3)
qp                <int>        ..FV...... force a constant quantizer parameter (from 0 to 63) (default 0)
mode              <int>        ..FV...... set thresholding mode (from 0 to 1) (default hard)
hard            0            ..FV...... hard thresholding
soft            1            ..FV...... soft thresholding
use_bframe_qp     <boolean>    ..FV...... use B-frames' QP (default false)

AVDCT AVOptions:
-dct               <int>        E..V...... DCT algorithm (from 0 to INT_MAX) (default auto)
auto            0            E..V...... autoselect a good one
fastint         1            E..V...... fast integer (experimental / for debugging)
int             2            E..V...... accurate integer
mmx             3            E..V...... experimental / for debugging
altivec         5            E..V...... experimental / for debugging
faan            6            E..V...... floating point AAN DCT (experimental / for debugging)
-idct              <int>        ED.V...... select IDCT implementation (from 0 to INT_MAX) (default auto)
auto            0            ED.V...... autoselect a good one
int             1            ED.V...... experimental / for debugging
simple          2            ED.V...... experimental / for debugging
simplemmx       3            ED.V...... experimental / for debugging
arm             7            ED.V...... experimental / for debugging
altivec         8            ED.V...... experimental / for debugging
simplearm       10           ED.V...... experimental / for debugging
simplearmv5te   16           ED.V...... experimental / for debugging
simplearmv6     17           ED.V...... experimental / for debugging
simpleneon      22           ED.V...... experimental / for debugging
xvid            14           ED.V...... experimental / for debugging
xvidmmx         14           ED.V...... experimental / for debugging
faani           20           ED.V...... floating point AAN IDCT (experimental / for debugging)
simpleauto      128          ED.V...... experimental / for debugging

This filter has support for timeline through the 'enable' option.

```
 * */
class spp(
    val quality : Any? = null,
    val qp : Any? = null,
    val mode : Any? = null,
    val use_bframe_qp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [spp] を参照してください */
fun String.spp(quality : Any? = null, qp : Any? = null, mode : Any? = null, use_bframe_qp : Any? = null) : spp {
    return spp(quality, qp, mode, use_bframe_qp, "", "").apply { setInputs(this@spp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sr )](https://ffmpeg.org/ffmpeg-filters.html#sr)

```
Filter sr
Apply DNN-based image super resolution to the input.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
sr AVOptions:
dnn_backend       <int>        ..FV...... DNN backend used for model execution (from 0 to 1) (default native)
native          0            ..FV...... native backend flag
scale_factor      <int>        ..FV...... scale factor for SRCNN model (from 2 to 4) (default 2)
model             <string>     ..FV...... path to model file specifying network architecture and its parameters


```
 * */
class sr(
    val dnn_backend : Any? = null,
    val scale_factor : Any? = null,
    val model : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sr] を参照してください */
fun String.sr(dnn_backend : Any? = null, scale_factor : Any? = null, model : Any? = null) : sr {
    return sr(dnn_backend, scale_factor, model, "", "").apply { setInputs(this@sr) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ssim )](https://ffmpeg.org/ffmpeg-filters.html#ssim)

```
Filter ssim
Calculate the SSIM between two video streams.
Inputs:
#0: main (video)
#1: reference (video)
Outputs:
#0: default (video)
ssim AVOptions:
stats_file        <string>     ..FV...... Set file where to store per-frame difference information
f                 <string>     ..FV...... Set file where to store per-frame difference information

framesync AVOptions:
eof_action        <int>        ..FV...... Action to take when encountering EOF from secondary input  (from 0 to 2) (default repeat)
repeat          0            ..FV...... Repeat the previous frame.
endall          1            ..FV...... End both streams.
pass            2            ..FV...... Pass through the main input.
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
repeatlast        <boolean>    ..FV...... extend last frame of secondary streams beyond EOF (default true)


```
 * */
class ssim(
    val stats_file : Any? = null,
    val f : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ssim] を参照してください */
fun String.ssim(stats_file : Any? = null, f : Any? = null) : ssim {
    return ssim(stats_file, f, "", "").apply { setInputs(this@ssim) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( stereo3d )](https://ffmpeg.org/ffmpeg-filters.html#stereo3d)

```
Filter stereo3d
Convert video stereoscopic 3D view.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
stereo3d AVOptions:
in                <int>        ..FV...... set input format (from 16 to 32) (default sbsl)
ab2l            24           ..FV...... above below half height left first
tb2l            24           ..FV...... above below half height left first
ab2r            25           ..FV...... above below half height right first
tb2r            25           ..FV...... above below half height right first
abl             22           ..FV...... above below left first
tbl             22           ..FV...... above below left first
abr             23           ..FV...... above below right first
tbr             23           ..FV...... above below right first
al              26           ..FV...... alternating frames left first
ar              27           ..FV...... alternating frames right first
sbs2l           20           ..FV...... side by side half width left first
sbs2r           21           ..FV...... side by side half width right first
sbsl            18           ..FV...... side by side left first
sbsr            19           ..FV...... side by side right first
irl             16           ..FV...... interleave rows left first
irr             17           ..FV...... interleave rows right first
icl             30           ..FV...... interleave columns left first
icr             31           ..FV...... interleave columns right first
out               <int>        ..FV...... set output format (from 0 to 32) (default arcd)
ab2l            24           ..FV...... above below half height left first
tb2l            24           ..FV...... above below half height left first
ab2r            25           ..FV...... above below half height right first
tb2r            25           ..FV...... above below half height right first
abl             22           ..FV...... above below left first
tbl             22           ..FV...... above below left first
abr             23           ..FV...... above below right first
tbr             23           ..FV...... above below right first
agmc            6            ..FV...... anaglyph green magenta color
agmd            7            ..FV...... anaglyph green magenta dubois
agmg            4            ..FV...... anaglyph green magenta gray
agmh            5            ..FV...... anaglyph green magenta half color
al              26           ..FV...... alternating frames left first
ar              27           ..FV...... alternating frames right first
arbg            12           ..FV...... anaglyph red blue gray
arcc            2            ..FV...... anaglyph red cyan color
arcd            3            ..FV...... anaglyph red cyan dubois
arcg            0            ..FV...... anaglyph red cyan gray
arch            1            ..FV...... anaglyph red cyan half color
argg            13           ..FV...... anaglyph red green gray
aybc            10           ..FV...... anaglyph yellow blue color
aybd            11           ..FV...... anaglyph yellow blue dubois
aybg            8            ..FV...... anaglyph yellow blue gray
aybh            9            ..FV...... anaglyph yellow blue half color
irl             16           ..FV...... interleave rows left first
irr             17           ..FV...... interleave rows right first
ml              14           ..FV...... mono left
mr              15           ..FV...... mono right
sbs2l           20           ..FV...... side by side half width left first
sbs2r           21           ..FV...... side by side half width right first
sbsl            18           ..FV...... side by side left first
sbsr            19           ..FV...... side by side right first
chl             28           ..FV...... checkerboard left first
chr             29           ..FV...... checkerboard right first
icl             30           ..FV...... interleave columns left first
icr             31           ..FV...... interleave columns right first
hdmi            32           ..FV...... HDMI frame pack


```
 * */
class stereo3d(
    val _in : Any? = null,
    val out : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [stereo3d] を参照してください */
fun String.stereo3d(_in : Any? = null, out : Any? = null) : stereo3d {
    return stereo3d(_in, out, "", "").apply { setInputs(this@stereo3d) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( streamselect )](https://ffmpeg.org/ffmpeg-filters.html#streamselect)

```
Filter streamselect
Select video streams
Inputs:
dynamic (depending on the options)
Outputs:
dynamic (depending on the options)
streamselect AVOptions:
inputs            <int>        ..FVA..... number of input streams (from 2 to INT_MAX) (default 2)
map               <string>     ..FVA....T input indexes to remap to outputs


```
 * */
class streamselect(
    val inputs : Any? = null,
    val map : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [streamselect] を参照してください */
fun String.streamselect(inputs : Any? = null, map : Any? = null) : streamselect {
    return streamselect(inputs, map, "", "").apply { setInputs(this@streamselect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( subtitles )](https://ffmpeg.org/ffmpeg-filters.html#subtitles)

```
Filter subtitles
Render text subtitles onto input video using the libass library.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
subtitles AVOptions:
filename          <string>     ..FV...... set the filename of file to read
f                 <string>     ..FV...... set the filename of file to read
original_size     <image_size> ..FV...... set the size of the original video (used to scale fonts)
fontsdir          <string>     ..FV...... set the directory containing the fonts to read
alpha             <boolean>    ..FV...... enable processing of alpha channel (default false)
charenc           <string>     ..FV...... set input character encoding
stream_index      <int>        ..FV...... set stream index (from -1 to INT_MAX) (default -1)
si                <int>        ..FV...... set stream index (from -1 to INT_MAX) (default -1)
force_style       <string>     ..FV...... force subtitle style


```
 * */
class subtitles(
    val filename : Any? = null,
    val original_size : Any? = null,
    val fontsdir : Any? = null,
    val alpha : Any? = null,
    val charenc : Any? = null,
    val stream_index : Any? = null,
    val force_style : Any? = null,
    val f : Any? = null,
    val si : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [subtitles] を参照してください */
fun String.subtitles(filename : Any? = null, original_size : Any? = null, fontsdir : Any? = null, alpha : Any? = null, charenc : Any? = null, stream_index : Any? = null, force_style : Any? = null, f : Any? = null, si : Any? = null) : subtitles {
    return subtitles(filename, original_size, fontsdir, alpha, charenc, stream_index, force_style, f, si, "", "").apply { setInputs(this@subtitles) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( super2xsai )](https://ffmpeg.org/ffmpeg-filters.html#super2xsai)

```
Filter super2xsai
Scale the input by 2x using the Super2xSaI pixel art algorithm.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class super2xsai(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [super2xsai] を参照してください */
fun String.super2xsai() : super2xsai {
    return super2xsai("", "").apply { setInputs(this@super2xsai) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( swaprect )](https://ffmpeg.org/ffmpeg-filters.html#swaprect)

```
Filter swaprect
Swap 2 rectangular objects in video.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
swaprect AVOptions:
w                 <string>     ..FV...... set rect width (default "w/2")
h                 <string>     ..FV...... set rect height (default "h/2")
x1                <string>     ..FV...... set 1st rect x top left coordinate (default "w/2")
y1                <string>     ..FV...... set 1st rect y top left coordinate (default "h/2")
x2                <string>     ..FV...... set 2nd rect x top left coordinate (default "0")
y2                <string>     ..FV...... set 2nd rect y top left coordinate (default "0")

This filter has support for timeline through the 'enable' option.

```
 * */
class swaprect(
    val w : Any? = null,
    val h : Any? = null,
    val x1 : Any? = null,
    val y1 : Any? = null,
    val x2 : Any? = null,
    val y2 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [swaprect] を参照してください */
fun String.swaprect(w : Any? = null, h : Any? = null, x1 : Any? = null, y1 : Any? = null, x2 : Any? = null, y2 : Any? = null) : swaprect {
    return swaprect(w, h, x1, y1, x2, y2, "", "").apply { setInputs(this@swaprect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( swapuv )](https://ffmpeg.org/ffmpeg-filters.html#swapuv)

```
Filter swapuv
Swap U and V components.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
swapuv AVOptions:

This filter has support for timeline through the 'enable' option.

```
 * */
class swapuv(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [swapuv] を参照してください */
fun String.swapuv() : swapuv {
    return swapuv("", "").apply { setInputs(this@swapuv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tblend )](https://ffmpeg.org/ffmpeg-filters.html#tblend)

```
Filter tblend
Blend successive frames.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tblend AVOptions:
c0_mode           <int>        ..FV...... set component #0 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c1_mode           <int>        ..FV...... set component #1 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c2_mode           <int>        ..FV...... set component #2 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c3_mode           <int>        ..FV...... set component #3 blend mode (from 0 to 32) (default normal)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
all_mode          <int>        ..FV...... set blend mode for all components (from -1 to 32) (default -1)
addition        1            ..FV......
addition128     28           ..FV......
grainmerge      28           ..FV......
and             2            ..FV......
average         3            ..FV......
burn            4            ..FV......
darken          5            ..FV......
difference      6            ..FV......
difference128   7            ..FV......
grainextract    7            ..FV......
divide          8            ..FV......
dodge           9            ..FV......
exclusion       10           ..FV......
extremity       32           ..FV......
freeze          31           ..FV......
glow            27           ..FV......
hardlight       11           ..FV......
hardmix         25           ..FV......
heat            30           ..FV......
lighten         12           ..FV......
linearlight     26           ..FV......
multiply        13           ..FV......
multiply128     29           ..FV......
negation        14           ..FV......
normal          0            ..FV......
or              15           ..FV......
overlay         16           ..FV......
phoenix         17           ..FV......
pinlight        18           ..FV......
reflect         19           ..FV......
screen          20           ..FV......
softlight       21           ..FV......
subtract        22           ..FV......
vividlight      23           ..FV......
xor             24           ..FV......
c0_expr           <string>     ..FV...... set color component #0 expression
c1_expr           <string>     ..FV...... set color component #1 expression
c2_expr           <string>     ..FV...... set color component #2 expression
c3_expr           <string>     ..FV...... set color component #3 expression
all_expr          <string>     ..FV...... set expression for all color components
c0_opacity        <double>     ..FV...... set color component #0 opacity (from 0 to 1) (default 1)
c1_opacity        <double>     ..FV...... set color component #1 opacity (from 0 to 1) (default 1)
c2_opacity        <double>     ..FV...... set color component #2 opacity (from 0 to 1) (default 1)
c3_opacity        <double>     ..FV...... set color component #3 opacity (from 0 to 1) (default 1)
all_opacity       <double>     ..FV...... set opacity for all color components (from 0 to 1) (default 1)

This filter has support for timeline through the 'enable' option.

```
 * */
class tblend(
    val c0_mode : Any? = null,
    val c1_mode : Any? = null,
    val c2_mode : Any? = null,
    val c3_mode : Any? = null,
    val all_mode : Any? = null,
    val c0_expr : Any? = null,
    val c1_expr : Any? = null,
    val c2_expr : Any? = null,
    val c3_expr : Any? = null,
    val all_expr : Any? = null,
    val c0_opacity : Any? = null,
    val c1_opacity : Any? = null,
    val c2_opacity : Any? = null,
    val c3_opacity : Any? = null,
    val all_opacity : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tblend] を参照してください */
fun String.tblend(c0_mode : Any? = null, c1_mode : Any? = null, c2_mode : Any? = null, c3_mode : Any? = null, all_mode : Any? = null, c0_expr : Any? = null, c1_expr : Any? = null, c2_expr : Any? = null, c3_expr : Any? = null, all_expr : Any? = null, c0_opacity : Any? = null, c1_opacity : Any? = null, c2_opacity : Any? = null, c3_opacity : Any? = null, all_opacity : Any? = null) : tblend {
    return tblend(c0_mode, c1_mode, c2_mode, c3_mode, all_mode, c0_expr, c1_expr, c2_expr, c3_expr, all_expr, c0_opacity, c1_opacity, c2_opacity, c3_opacity, all_opacity, "", "").apply { setInputs(this@tblend) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( telecine )](https://ffmpeg.org/ffmpeg-filters.html#telecine)

```
Filter telecine
Apply a telecine pattern.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
telecine AVOptions:
first_field       <int>        ..FV...... select first field (from 0 to 1) (default top)
top             0            ..FV...... select top field first
t               0            ..FV...... select top field first
bottom          1            ..FV...... select bottom field first
b               1            ..FV...... select bottom field first
pattern           <string>     ..FV...... pattern that describe for how many fields a frame is to be displayed (default "23")


```
 * */
class telecine(
    val first_field : Any? = null,
    val pattern : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [telecine] を参照してください */
fun String.telecine(first_field : Any? = null, pattern : Any? = null) : telecine {
    return telecine(first_field, pattern, "", "").apply { setInputs(this@telecine) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( thistogram )](https://ffmpeg.org/ffmpeg-filters.html#thistogram)

```
Filter thistogram
Compute and draw a temporal histogram.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
thistogram AVOptions:
width             <int>        ..FV...... set width (from 0 to 8192) (default 0)
w                 <int>        ..FV...... set width (from 0 to 8192) (default 0)
display_mode      <int>        ..FV...... set display mode (from 0 to 2) (default stack)
overlay         0            ..FV......
parade          1            ..FV......
stack           2            ..FV......
d                 <int>        ..FV...... set display mode (from 0 to 2) (default stack)
overlay         0            ..FV......
parade          1            ..FV......
stack           2            ..FV......
levels_mode       <int>        ..FV...... set levels mode (from 0 to 1) (default linear)
linear          0            ..FV......
logarithmic     1            ..FV......
m                 <int>        ..FV...... set levels mode (from 0 to 1) (default linear)
linear          0            ..FV......
logarithmic     1            ..FV......
components        <int>        ..FV...... set color components to display (from 1 to 15) (default 7)
c                 <int>        ..FV...... set color components to display (from 1 to 15) (default 7)
bgopacity         <float>      ..FV...... set background opacity (from 0 to 1) (default 0.9)
b                 <float>      ..FV...... set background opacity (from 0 to 1) (default 0.9)
envelope          <boolean>    ..FV...... display envelope (default false)
e                 <boolean>    ..FV...... display envelope (default false)
ecolor            <color>      ..FV...... set envelope color (default "gold")
ec                <color>      ..FV...... set envelope color (default "gold")


```
 * */
class thistogram(
    val width : Any? = null,
    val display_mode : Any? = null,
    val levels_mode : Any? = null,
    val components : Any? = null,
    val bgopacity : Any? = null,
    val envelope : Any? = null,
    val ecolor : Any? = null,
    val w : Any? = null,
    val d : Any? = null,
    val m : Any? = null,
    val c : Any? = null,
    val b : Any? = null,
    val e : Any? = null,
    val ec : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [thistogram] を参照してください */
fun String.thistogram(width : Any? = null, display_mode : Any? = null, levels_mode : Any? = null, components : Any? = null, bgopacity : Any? = null, envelope : Any? = null, ecolor : Any? = null, w : Any? = null, d : Any? = null, m : Any? = null, c : Any? = null, b : Any? = null, e : Any? = null, ec : Any? = null) : thistogram {
    return thistogram(width, display_mode, levels_mode, components, bgopacity, envelope, ecolor, w, d, m, c, b, e, ec, "", "").apply { setInputs(this@thistogram) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( threshold )](https://ffmpeg.org/ffmpeg-filters.html#threshold)

```
Filter threshold
Threshold first video stream using other video streams.
slice threading supported
Inputs:
#0: default (video)
#1: threshold (video)
#2: min (video)
#3: max (video)
Outputs:
#0: default (video)
threshold AVOptions:
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class threshold(
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [threshold] を参照してください */
fun String.threshold(planes : Any? = null) : threshold {
    return threshold(planes, "", "").apply { setInputs(this@threshold) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( thumbnail )](https://ffmpeg.org/ffmpeg-filters.html#thumbnail)

```
Filter thumbnail
Select the most representative frame in a given sequence of consecutive frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
thumbnail AVOptions:
n                 <int>        ..FV...... set the frames batch size (from 2 to INT_MAX) (default 100)

This filter has support for timeline through the 'enable' option.

```
 * */
class thumbnail(
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [thumbnail] を参照してください */
fun String.thumbnail(n : Any? = null) : thumbnail {
    return thumbnail(n, "", "").apply { setInputs(this@thumbnail) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( thumbnail_cuda )](https://ffmpeg.org/ffmpeg-filters.html#thumbnail_cuda)

```
Filter thumbnail_cuda
Select the most representative frame in a given sequence of consecutive frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
thumbnail_cuda AVOptions:
n                 <int>        ..FV...... set the frames batch size (from 2 to INT_MAX) (default 100)


```
 * */
class thumbnail_cuda(
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [thumbnail_cuda] を参照してください */
fun String.thumbnail_cuda(n : Any? = null) : thumbnail_cuda {
    return thumbnail_cuda(n, "", "").apply { setInputs(this@thumbnail_cuda) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tile )](https://ffmpeg.org/ffmpeg-filters.html#tile)

```
Filter tile
Tile several successive frames together.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tile AVOptions:
layout            <image_size> ..FV...... set grid size (default "6x5")
nb_frames         <int>        ..FV...... set maximum number of frame to render (from 0 to INT_MAX) (default 0)
margin            <int>        ..FV...... set outer border margin in pixels (from 0 to 1024) (default 0)
padding           <int>        ..FV...... set inner border thickness in pixels (from 0 to 1024) (default 0)
color             <color>      ..FV...... set the color of the unused area (default "black")
overlap           <int>        ..FV...... set how many frames to overlap for each render (from 0 to INT_MAX) (default 0)
init_padding      <int>        ..FV......  set how many frames to initially pad (from 0 to INT_MAX) (default 0)


```
 * */
class tile(
    val layout : Any? = null,
    val nb_frames : Any? = null,
    val margin : Any? = null,
    val padding : Any? = null,
    val color : Any? = null,
    val overlap : Any? = null,
    val init_padding : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tile] を参照してください */
fun String.tile(layout : Any? = null, nb_frames : Any? = null, margin : Any? = null, padding : Any? = null, color : Any? = null, overlap : Any? = null, init_padding : Any? = null) : tile {
    return tile(layout, nb_frames, margin, padding, color, overlap, init_padding, "", "").apply { setInputs(this@tile) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tinterlace )](https://ffmpeg.org/ffmpeg-filters.html#tinterlace)

```
Filter tinterlace
Perform temporal field interlacing.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tinterlace AVOptions:
mode              <int>        ..FV...... select interlace mode (from 0 to 7) (default merge)
merge           0            ..FV...... merge fields
drop_even       1            ..FV...... drop even fields
drop_odd        2            ..FV...... drop odd fields
pad             3            ..FV...... pad alternate lines with black
interleave_top  4            ..FV...... interleave top and bottom fields
interleave_bottom 5            ..FV...... interleave bottom and top fields
interlacex2     6            ..FV...... interlace fields from two consecutive frames
mergex2         7            ..FV...... merge fields keeping same frame rate


```
 * */
class tinterlace(
    val mode : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tinterlace] を参照してください */
fun String.tinterlace(mode : Any? = null) : tinterlace {
    return tinterlace(mode, "", "").apply { setInputs(this@tinterlace) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tlut2 )](https://ffmpeg.org/ffmpeg-filters.html#tlut2)

```
Filter tlut2
Compute and apply a lookup table from two successive frames.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tlut2 AVOptions:
c0                <string>     ..FV...... set component #0 expression (default "x")
c1                <string>     ..FV...... set component #1 expression (default "x")
c2                <string>     ..FV...... set component #2 expression (default "x")
c3                <string>     ..FV...... set component #3 expression (default "x")

This filter has support for timeline through the 'enable' option.

```
 * */
class tlut2(
    val c0 : Any? = null,
    val c1 : Any? = null,
    val c2 : Any? = null,
    val c3 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tlut2] を参照してください */
fun String.tlut2(c0 : Any? = null, c1 : Any? = null, c2 : Any? = null, c3 : Any? = null) : tlut2 {
    return tlut2(c0, c1, c2, c3, "", "").apply { setInputs(this@tlut2) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tmedian )](https://ffmpeg.org/ffmpeg-filters.html#tmedian)

```
Filter tmedian
Pick median pixels from successive frames.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tmedian AVOptions:
radius            <int>        ..FV...... set median filter radius (from 1 to 127) (default 1)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)
percentile        <float>      ..FV...... set percentile (from 0 to 1) (default 0.5)

This filter has support for timeline through the 'enable' option.

```
 * */
class tmedian(
    val radius : Any? = null,
    val planes : Any? = null,
    val percentile : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tmedian] を参照してください */
fun String.tmedian(radius : Any? = null, planes : Any? = null, percentile : Any? = null) : tmedian {
    return tmedian(radius, planes, percentile, "", "").apply { setInputs(this@tmedian) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tmix )](https://ffmpeg.org/ffmpeg-filters.html#tmix)

```
Filter tmix
Mix successive video frames.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tmix AVOptions:
frames            <int>        ..FV...... set number of successive frames to mix (from 1 to 128) (default 3)
weights           <string>     ..FV...... set weight for each frame (default "1 1 1")
scale             <float>      ..FV...... set scale (from 0 to 32767) (default 0)

This filter has support for timeline through the 'enable' option.

```
 * */
class tmix(
    val frames : Any? = null,
    val weights : Any? = null,
    val scale : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tmix] を参照してください */
fun String.tmix(frames : Any? = null, weights : Any? = null, scale : Any? = null) : tmix {
    return tmix(frames, weights, scale, "", "").apply { setInputs(this@tmix) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tonemap )](https://ffmpeg.org/ffmpeg-filters.html#tonemap)

```
Filter tonemap
Conversion to/from different dynamic ranges.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tonemap AVOptions:
tonemap           <int>        ..FV...... tonemap algorithm selection (from 0 to 6) (default none)
none            0            ..FV......
linear          1            ..FV......
gamma           2            ..FV......
clip            3            ..FV......
reinhard        4            ..FV......
hable           5            ..FV......
mobius          6            ..FV......
param             <double>     ..FV...... tonemap parameter (from DBL_MIN to DBL_MAX) (default nan)
desat             <double>     ..FV...... desaturation strength (from 0 to DBL_MAX) (default 2)
peak              <double>     ..FV...... signal peak override (from 0 to DBL_MAX) (default 0)


```
 * */
class tonemap(
    val tonemap : Any? = null,
    val param : Any? = null,
    val desat : Any? = null,
    val peak : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tonemap] を参照してください */
fun String.tonemap(tonemap : Any? = null, param : Any? = null, desat : Any? = null, peak : Any? = null) : tonemap {
    return tonemap(tonemap, param, desat, peak, "", "").apply { setInputs(this@tonemap) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( tpad )](https://ffmpeg.org/ffmpeg-filters.html#tpad)

```
Filter tpad
Temporarily pad video frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
tpad AVOptions:
start             <int>        ..FV...... set the number of frames to delay input (from 0 to INT_MAX) (default 0)
stop              <int>        ..FV...... set the number of frames to add after input finished (from -1 to INT_MAX) (default 0)
start_mode        <int>        ..FV...... set the mode of added frames to start (from 0 to 1) (default add)
add             0            ..FV...... add solid-color frames
clone           1            ..FV...... clone first/last frame
stop_mode         <int>        ..FV...... set the mode of added frames to end (from 0 to 1) (default add)
add             0            ..FV...... add solid-color frames
clone           1            ..FV...... clone first/last frame
start_duration    <duration>   ..FV...... set the duration to delay input (default 0)
stop_duration     <duration>   ..FV...... set the duration to pad input (default 0)
color             <color>      ..FV...... set the color of the added frames (default "black")


```
 * */
class tpad(
    val start : Any? = null,
    val stop : Any? = null,
    val start_mode : Any? = null,
    val stop_mode : Any? = null,
    val start_duration : Any? = null,
    val stop_duration : Any? = null,
    val color : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [tpad] を参照してください */
fun String.tpad(start : Any? = null, stop : Any? = null, start_mode : Any? = null, stop_mode : Any? = null, start_duration : Any? = null, stop_duration : Any? = null, color : Any? = null) : tpad {
    return tpad(start, stop, start_mode, stop_mode, start_duration, stop_duration, color, "", "").apply { setInputs(this@tpad) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( transpose )](https://ffmpeg.org/ffmpeg-filters.html#transpose)

```
Filter transpose
Transpose input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
transpose AVOptions:
dir               <int>        ..FV...... set transpose direction (from 0 to 7) (default cclock_flip)
cclock_flip     0            ..FV...... rotate counter-clockwise with vertical flip
clock           1            ..FV...... rotate clockwise
cclock          2            ..FV...... rotate counter-clockwise
clock_flip      3            ..FV...... rotate clockwise with vertical flip
passthrough       <int>        ..FV...... do not apply transposition if the input matches the specified geometry (from 0 to INT_MAX) (default none)
none            0            ..FV...... always apply transposition
portrait        2            ..FV...... preserve portrait geometry
landscape       1            ..FV...... preserve landscape geometry


```
 * */
class transpose(
    val dir : Any? = null,
    val passthrough : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [transpose] を参照してください */
fun String.transpose(dir : Any? = null, passthrough : Any? = null) : transpose {
    return transpose(dir, passthrough, "", "").apply { setInputs(this@transpose) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( trim )](https://ffmpeg.org/ffmpeg-filters.html#trim)

```
Filter trim
Pick one continuous section from the input, drop the rest.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
trim AVOptions:
start             <duration>   ..FV...... Timestamp of the first frame that should be passed (default INT64_MAX)
starti            <duration>   ..FV...... Timestamp of the first frame that should be passed (default INT64_MAX)
end               <duration>   ..FV...... Timestamp of the first frame that should be dropped again (default INT64_MAX)
endi              <duration>   ..FV...... Timestamp of the first frame that should be dropped again (default INT64_MAX)
start_pts         <int64>      ..FV...... Timestamp of the first frame that should be  passed (from I64_MIN to I64_MAX) (default I64_MIN)
end_pts           <int64>      ..FV...... Timestamp of the first frame that should be dropped again (from I64_MIN to I64_MAX) (default I64_MIN)
duration          <duration>   ..FV...... Maximum duration of the output (default 0)
durationi         <duration>   ..FV...... Maximum duration of the output (default 0)
start_frame       <int64>      ..FV...... Number of the first frame that should be passed to the output (from -1 to I64_MAX) (default -1)
end_frame         <int64>      ..FV...... Number of the first frame that should be dropped again (from 0 to I64_MAX) (default I64_MAX)


```
 * */
class trim(
    val start : Any? = null,
    val starti : Any? = null,
    val end : Any? = null,
    val endi : Any? = null,
    val start_pts : Any? = null,
    val end_pts : Any? = null,
    val duration : Any? = null,
    val durationi : Any? = null,
    val start_frame : Any? = null,
    val end_frame : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [trim] を参照してください */
fun String.trim(start : Any? = null, starti : Any? = null, end : Any? = null, endi : Any? = null, start_pts : Any? = null, end_pts : Any? = null, duration : Any? = null, durationi : Any? = null, start_frame : Any? = null, end_frame : Any? = null) : trim {
    return trim(start, starti, end, endi, start_pts, end_pts, duration, durationi, start_frame, end_frame, "", "").apply { setInputs(this@trim) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( unpremultiply )](https://ffmpeg.org/ffmpeg-filters.html#unpremultiply)

```
Filter unpremultiply
UnPreMultiply first stream with first plane of second stream.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
unpremultiply AVOptions:
planes            <int>        ..FV...... set planes (from 0 to 15) (default 15)
inplace           <boolean>    ..FV...... enable inplace mode (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class unpremultiply(
    val planes : Any? = null,
    val inplace : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [unpremultiply] を参照してください */
fun String.unpremultiply(planes : Any? = null, inplace : Any? = null) : unpremultiply {
    return unpremultiply(planes, inplace, "", "").apply { setInputs(this@unpremultiply) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( unsharp )](https://ffmpeg.org/ffmpeg-filters.html#unsharp)

```
Filter unsharp
Sharpen or blur the input video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
unsharp AVOptions:
luma_msize_x      <int>        ..FV...... set luma matrix horizontal size (from 3 to 23) (default 5)
lx                <int>        ..FV...... set luma matrix horizontal size (from 3 to 23) (default 5)
luma_msize_y      <int>        ..FV...... set luma matrix vertical size (from 3 to 23) (default 5)
ly                <int>        ..FV...... set luma matrix vertical size (from 3 to 23) (default 5)
luma_amount       <float>      ..FV...... set luma effect strength (from -2 to 5) (default 1)
la                <float>      ..FV...... set luma effect strength (from -2 to 5) (default 1)
chroma_msize_x    <int>        ..FV...... set chroma matrix horizontal size (from 3 to 23) (default 5)
cx                <int>        ..FV...... set chroma matrix horizontal size (from 3 to 23) (default 5)
chroma_msize_y    <int>        ..FV...... set chroma matrix vertical size (from 3 to 23) (default 5)
cy                <int>        ..FV...... set chroma matrix vertical size (from 3 to 23) (default 5)
chroma_amount     <float>      ..FV...... set chroma effect strength (from -2 to 5) (default 0)
ca                <float>      ..FV...... set chroma effect strength (from -2 to 5) (default 0)
opencl            <boolean>    ..FV...... ignored (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class unsharp(
    val luma_msize_x : Any? = null,
    val luma_msize_y : Any? = null,
    val luma_amount : Any? = null,
    val chroma_msize_x : Any? = null,
    val chroma_msize_y : Any? = null,
    val chroma_amount : Any? = null,
    val opencl : Any? = null,
    val lx : Any? = null,
    val ly : Any? = null,
    val la : Any? = null,
    val cx : Any? = null,
    val cy : Any? = null,
    val ca : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [unsharp] を参照してください */
fun String.unsharp(luma_msize_x : Any? = null, luma_msize_y : Any? = null, luma_amount : Any? = null, chroma_msize_x : Any? = null, chroma_msize_y : Any? = null, chroma_amount : Any? = null, opencl : Any? = null, lx : Any? = null, ly : Any? = null, la : Any? = null, cx : Any? = null, cy : Any? = null, ca : Any? = null) : unsharp {
    return unsharp(luma_msize_x, luma_msize_y, luma_amount, chroma_msize_x, chroma_msize_y, chroma_amount, opencl, lx, ly, la, cx, cy, ca, "", "").apply { setInputs(this@unsharp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( uspp )](https://ffmpeg.org/ffmpeg-filters.html#uspp)

```
Filter uspp
Apply Ultra Simple / Slow Post-processing filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
uspp AVOptions:
quality           <int>        ..FV...... set quality (from 0 to 8) (default 3)
qp                <int>        ..FV...... force a constant quantizer parameter (from 0 to 63) (default 0)
use_bframe_qp     <boolean>    ..FV...... use B-frames' QP (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class uspp(
    val quality : Any? = null,
    val qp : Any? = null,
    val use_bframe_qp : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [uspp] を参照してください */
fun String.uspp(quality : Any? = null, qp : Any? = null, use_bframe_qp : Any? = null) : uspp {
    return uspp(quality, qp, use_bframe_qp, "", "").apply { setInputs(this@uspp) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( v360 )](https://ffmpeg.org/ffmpeg-filters.html#v360)

```
Filter v360
Convert 360 projection of video.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
v360 AVOptions:
input             <int>        ..FV...... set input projection (from 0 to 20) (default e)
e               0            ..FV...... equirectangular
equirect        0            ..FV...... equirectangular
c3x2            1            ..FV...... cubemap 3x2
c6x1            2            ..FV...... cubemap 6x1
eac             3            ..FV...... equi-angular cubemap
dfisheye        5            ..FV...... dual fisheye
flat            4            ..FV...... regular video
rectilinear     4            ..FV...... regular video
gnomonic        4            ..FV...... regular video
barrel          6            ..FV...... barrel facebook's 360 format
fb              6            ..FV...... barrel facebook's 360 format
c1x6            7            ..FV...... cubemap 1x6
sg              8            ..FV...... stereographic
mercator        9            ..FV...... mercator
ball            10           ..FV...... ball
hammer          11           ..FV...... hammer
sinusoidal      12           ..FV...... sinusoidal
fisheye         13           ..FV...... fisheye
pannini         14           ..FV...... pannini
cylindrical     15           ..FV...... cylindrical
tetrahedron     17           ..FV...... tetrahedron
barrelsplit     18           ..FV...... barrel split facebook's 360 format
tsp             19           ..FV...... truncated square pyramid
hequirect       20           ..FV...... half equirectangular
he              20           ..FV...... half equirectangular
output            <int>        ..FV...... set output projection (from 0 to 20) (default c3x2)
e               0            ..FV...... equirectangular
equirect        0            ..FV...... equirectangular
c3x2            1            ..FV...... cubemap 3x2
c6x1            2            ..FV...... cubemap 6x1
eac             3            ..FV...... equi-angular cubemap
dfisheye        5            ..FV...... dual fisheye
flat            4            ..FV...... regular video
rectilinear     4            ..FV...... regular video
gnomonic        4            ..FV...... regular video
barrel          6            ..FV...... barrel facebook's 360 format
fb              6            ..FV...... barrel facebook's 360 format
c1x6            7            ..FV...... cubemap 1x6
sg              8            ..FV...... stereographic
mercator        9            ..FV...... mercator
ball            10           ..FV...... ball
hammer          11           ..FV...... hammer
sinusoidal      12           ..FV...... sinusoidal
fisheye         13           ..FV...... fisheye
pannini         14           ..FV...... pannini
cylindrical     15           ..FV...... cylindrical
perspective     16           ..FV...... perspective
tetrahedron     17           ..FV...... tetrahedron
barrelsplit     18           ..FV...... barrel split facebook's 360 format
tsp             19           ..FV...... truncated square pyramid
hequirect       20           ..FV...... half equirectangular
he              20           ..FV...... half equirectangular
interp            <int>        ..FV...... set interpolation method (from 0 to 6) (default line)
near            0            ..FV...... nearest neighbour
nearest         0            ..FV...... nearest neighbour
line            1            ..FV...... bilinear interpolation
linear          1            ..FV...... bilinear interpolation
lagrange9       2            ..FV...... lagrange9 interpolation
cube            3            ..FV...... bicubic interpolation
cubic           3            ..FV...... bicubic interpolation
lanc            4            ..FV...... lanczos interpolation
lanczos         4            ..FV...... lanczos interpolation
sp16            5            ..FV...... spline16 interpolation
spline16        5            ..FV...... spline16 interpolation
gauss           6            ..FV...... gaussian interpolation
gaussian        6            ..FV...... gaussian interpolation
w                 <int>        ..FV...... output width (from 0 to 32767) (default 0)
h                 <int>        ..FV...... output height (from 0 to 32767) (default 0)
in_stereo         <int>        ..FV...... input stereo format (from 0 to 2) (default 2d)
2d              0            ..FV...... 2d mono
sbs             1            ..FV...... side by side
tb              2            ..FV...... top bottom
out_stereo        <int>        ..FV...... output stereo format (from 0 to 2) (default 2d)
2d              0            ..FV...... 2d mono
sbs             1            ..FV...... side by side
tb              2            ..FV...... top bottom
in_forder         <string>     ..FV...... input cubemap face order (default "rludfb")
out_forder        <string>     ..FV...... output cubemap face order (default "rludfb")
in_frot           <string>     ..FV...... input cubemap face rotation (default "000000")
out_frot          <string>     ..FV...... output cubemap face rotation (default "000000")
in_pad            <float>      ..FV.....T percent input cubemap pads (from 0 to 0.1) (default 0)
out_pad           <float>      ..FV.....T percent output cubemap pads (from 0 to 0.1) (default 0)
fin_pad           <int>        ..FV.....T fixed input cubemap pads (from 0 to 100) (default 0)
fout_pad          <int>        ..FV.....T fixed output cubemap pads (from 0 to 100) (default 0)
yaw               <float>      ..FV.....T yaw rotation (from -180 to 180) (default 0)
pitch             <float>      ..FV.....T pitch rotation (from -180 to 180) (default 0)
roll              <float>      ..FV.....T roll rotation (from -180 to 180) (default 0)
rorder            <string>     ..FV.....T rotation order (default "ypr")
h_fov             <float>      ..FV.....T output horizontal field of view (from 1e-05 to 360) (default 90)
v_fov             <float>      ..FV.....T output vertical field of view (from 1e-05 to 360) (default 45)
d_fov             <float>      ..FV.....T output diagonal field of view (from 0 to 360) (default 0)
h_flip            <boolean>    ..FV.....T flip out video horizontally (default false)
v_flip            <boolean>    ..FV.....T flip out video vertically (default false)
d_flip            <boolean>    ..FV.....T flip out video indepth (default false)
ih_flip           <boolean>    ..FV.....T flip in video horizontally (default false)
iv_flip           <boolean>    ..FV.....T flip in video vertically (default false)
in_trans          <boolean>    ..FV...... transpose video input (default false)
out_trans         <boolean>    ..FV...... transpose video output (default false)
ih_fov            <float>      ..FV.....T input horizontal field of view (from 1e-05 to 360) (default 90)
iv_fov            <float>      ..FV.....T input vertical field of view (from 1e-05 to 360) (default 45)
id_fov            <float>      ..FV.....T input diagonal field of view (from 0 to 360) (default 0)
alpha_mask        <boolean>    ..FV...... build mask in alpha plane (default false)


```
 * */
class v360(
    val input : Any? = null,
    val output : Any? = null,
    val interp : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val in_stereo : Any? = null,
    val out_stereo : Any? = null,
    val in_forder : Any? = null,
    val out_forder : Any? = null,
    val in_frot : Any? = null,
    val out_frot : Any? = null,
    val in_pad : Any? = null,
    val out_pad : Any? = null,
    val fin_pad : Any? = null,
    val fout_pad : Any? = null,
    val yaw : Any? = null,
    val pitch : Any? = null,
    val roll : Any? = null,
    val rorder : Any? = null,
    val h_fov : Any? = null,
    val v_fov : Any? = null,
    val d_fov : Any? = null,
    val h_flip : Any? = null,
    val v_flip : Any? = null,
    val d_flip : Any? = null,
    val ih_flip : Any? = null,
    val iv_flip : Any? = null,
    val in_trans : Any? = null,
    val out_trans : Any? = null,
    val ih_fov : Any? = null,
    val iv_fov : Any? = null,
    val id_fov : Any? = null,
    val alpha_mask : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [v360] を参照してください */
fun String.v360(input : Any? = null, output : Any? = null, interp : Any? = null, w : Any? = null, h : Any? = null, in_stereo : Any? = null, out_stereo : Any? = null, in_forder : Any? = null, out_forder : Any? = null, in_frot : Any? = null, out_frot : Any? = null, in_pad : Any? = null, out_pad : Any? = null, fin_pad : Any? = null, fout_pad : Any? = null, yaw : Any? = null, pitch : Any? = null, roll : Any? = null, rorder : Any? = null, h_fov : Any? = null, v_fov : Any? = null, d_fov : Any? = null, h_flip : Any? = null, v_flip : Any? = null, d_flip : Any? = null, ih_flip : Any? = null, iv_flip : Any? = null, in_trans : Any? = null, out_trans : Any? = null, ih_fov : Any? = null, iv_fov : Any? = null, id_fov : Any? = null, alpha_mask : Any? = null) : v360 {
    return v360(input, output, interp, w, h, in_stereo, out_stereo, in_forder, out_forder, in_frot, out_frot, in_pad, out_pad, fin_pad, fout_pad, yaw, pitch, roll, rorder, h_fov, v_fov, d_fov, h_flip, v_flip, d_flip, ih_flip, iv_flip, in_trans, out_trans, ih_fov, iv_fov, id_fov, alpha_mask, "", "").apply { setInputs(this@v360) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vaguedenoiser )](https://ffmpeg.org/ffmpeg-filters.html#vaguedenoiser)

```
Filter vaguedenoiser
Apply a Wavelet based Denoiser.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vaguedenoiser AVOptions:
threshold         <float>      ..FV...... set filtering strength (from 0 to DBL_MAX) (default 2)
method            <int>        ..FV...... set filtering method (from 0 to 2) (default garrote)
hard            0            ..FV...... hard thresholding
soft            1            ..FV...... soft thresholding
garrote         2            ..FV...... garotte thresholding
nsteps            <int>        ..FV...... set number of steps (from 1 to 32) (default 6)
percent           <float>      ..FV...... set percent of full denoising (from 0 to 100) (default 85)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)

This filter has support for timeline through the 'enable' option.

```
 * */
class vaguedenoiser(
    val threshold : Any? = null,
    val method : Any? = null,
    val nsteps : Any? = null,
    val percent : Any? = null,
    val planes : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vaguedenoiser] を参照してください */
fun String.vaguedenoiser(threshold : Any? = null, method : Any? = null, nsteps : Any? = null, percent : Any? = null, planes : Any? = null) : vaguedenoiser {
    return vaguedenoiser(threshold, method, nsteps, percent, planes, "", "").apply { setInputs(this@vaguedenoiser) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vectorscope )](https://ffmpeg.org/ffmpeg-filters.html#vectorscope)

```
Filter vectorscope
Video vectorscope.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vectorscope AVOptions:
mode              <int>        ..FV...... set vectorscope mode (from 0 to 5) (default gray)
gray            0            ..FV......
tint            0            ..FV......
color           1            ..FV......
color2          2            ..FV......
color3          3            ..FV......
color4          4            ..FV......
color5          5            ..FV......
m                 <int>        ..FV...... set vectorscope mode (from 0 to 5) (default gray)
gray            0            ..FV......
tint            0            ..FV......
color           1            ..FV......
color2          2            ..FV......
color3          3            ..FV......
color4          4            ..FV......
color5          5            ..FV......
x                 <int>        ..FV...... set color component on X axis (from 0 to 2) (default 1)
y                 <int>        ..FV...... set color component on Y axis (from 0 to 2) (default 2)
intensity         <float>      ..FV...... set intensity (from 0 to 1) (default 0.004)
i                 <float>      ..FV...... set intensity (from 0 to 1) (default 0.004)
envelope          <int>        ..FV...... set envelope (from 0 to 3) (default none)
none            0            ..FV......
instant         1            ..FV......
peak            2            ..FV......
peak+instant    3            ..FV......
e                 <int>        ..FV...... set envelope (from 0 to 3) (default none)
none            0            ..FV......
instant         1            ..FV......
peak            2            ..FV......
peak+instant    3            ..FV......
graticule         <int>        ..FV...... set graticule (from 0 to 3) (default none)
none            0            ..FV......
green           1            ..FV......
color           2            ..FV......
invert          3            ..FV......
g                 <int>        ..FV...... set graticule (from 0 to 3) (default none)
none            0            ..FV......
green           1            ..FV......
color           2            ..FV......
invert          3            ..FV......
opacity           <float>      ..FV...... set graticule opacity (from 0 to 1) (default 0.75)
o                 <float>      ..FV...... set graticule opacity (from 0 to 1) (default 0.75)
flags             <flags>      ..FV...... set graticule flags (default name)
white                        ..FV...... draw white point
black                        ..FV...... draw black point
name                         ..FV...... draw point name
f                 <flags>      ..FV...... set graticule flags (default name)
white                        ..FV...... draw white point
black                        ..FV...... draw black point
name                         ..FV...... draw point name
bgopacity         <float>      ..FV...... set background opacity (from 0 to 1) (default 0.3)
b                 <float>      ..FV...... set background opacity (from 0 to 1) (default 0.3)
lthreshold        <float>      ..FV...... set low threshold (from 0 to 1) (default 0)
l                 <float>      ..FV...... set low threshold (from 0 to 1) (default 0)
hthreshold        <float>      ..FV...... set high threshold (from 0 to 1) (default 1)
h                 <float>      ..FV...... set high threshold (from 0 to 1) (default 1)
colorspace        <int>        ..FV...... set colorspace (from 0 to 2) (default auto)
auto            0            ..FV......
601             1            ..FV......
709             2            ..FV......
c                 <int>        ..FV...... set colorspace (from 0 to 2) (default auto)
auto            0            ..FV......
601             1            ..FV......
709             2            ..FV......
tint0             <float>      ..FV...... set 1st tint (from -1 to 1) (default 0)
t0                <float>      ..FV...... set 1st tint (from -1 to 1) (default 0)
tint1             <float>      ..FV...... set 2nd tint (from -1 to 1) (default 0)
t1                <float>      ..FV...... set 2nd tint (from -1 to 1) (default 0)


```
 * */
class vectorscope(
    val mode : Any? = null,
    val x : Any? = null,
    val y : Any? = null,
    val intensity : Any? = null,
    val envelope : Any? = null,
    val graticule : Any? = null,
    val opacity : Any? = null,
    val flags : Any? = null,
    val bgopacity : Any? = null,
    val lthreshold : Any? = null,
    val hthreshold : Any? = null,
    val colorspace : Any? = null,
    val tint0 : Any? = null,
    val tint1 : Any? = null,
    val m : Any? = null,
    val i : Any? = null,
    val e : Any? = null,
    val g : Any? = null,
    val o : Any? = null,
    val f : Any? = null,
    val b : Any? = null,
    val l : Any? = null,
    val h : Any? = null,
    val c : Any? = null,
    val t0 : Any? = null,
    val t1 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vectorscope] を参照してください */
fun String.vectorscope(mode : Any? = null, x : Any? = null, y : Any? = null, intensity : Any? = null, envelope : Any? = null, graticule : Any? = null, opacity : Any? = null, flags : Any? = null, bgopacity : Any? = null, lthreshold : Any? = null, hthreshold : Any? = null, colorspace : Any? = null, tint0 : Any? = null, tint1 : Any? = null, m : Any? = null, i : Any? = null, e : Any? = null, g : Any? = null, o : Any? = null, f : Any? = null, b : Any? = null, l : Any? = null, h : Any? = null, c : Any? = null, t0 : Any? = null, t1 : Any? = null) : vectorscope {
    return vectorscope(mode, x, y, intensity, envelope, graticule, opacity, flags, bgopacity, lthreshold, hthreshold, colorspace, tint0, tint1, m, i, e, g, o, f, b, l, h, c, t0, t1, "", "").apply { setInputs(this@vectorscope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vflip )](https://ffmpeg.org/ffmpeg-filters.html#vflip)

```
Filter vflip
Flip the input video vertically.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vflip AVOptions:

This filter has support for timeline through the 'enable' option.

```
 * */
class vflip(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vflip] を参照してください */
fun String.vflip() : vflip {
    return vflip("", "").apply { setInputs(this@vflip) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vfrdet )](https://ffmpeg.org/ffmpeg-filters.html#vfrdet)

```
Filter vfrdet
Variable frame rate detect filter.
Inputs:
#0: default (video)
Outputs:
#0: default (video)

```
 * */
class vfrdet(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vfrdet] を参照してください */
fun String.vfrdet() : vfrdet {
    return vfrdet("", "").apply { setInputs(this@vfrdet) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vibrance )](https://ffmpeg.org/ffmpeg-filters.html#vibrance)

```
Filter vibrance
Boost or alter saturation.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vibrance AVOptions:
intensity         <float>      ..FV.....T set the intensity value (from -2 to 2) (default 0)
rbal              <float>      ..FV.....T set the red balance value (from -10 to 10) (default 1)
gbal              <float>      ..FV.....T set the green balance value (from -10 to 10) (default 1)
bbal              <float>      ..FV.....T set the blue balance value (from -10 to 10) (default 1)
rlum              <float>      ..FV.....T set the red luma coefficient (from 0 to 1) (default 0.072186)
glum              <float>      ..FV.....T set the green luma coefficient (from 0 to 1) (default 0.715158)
blum              <float>      ..FV.....T set the blue luma coefficient (from 0 to 1) (default 0.212656)
alternate         <boolean>    ..FV.....T use alternate colors (default false)

This filter has support for timeline through the 'enable' option.

```
 * */
class vibrance(
    val intensity : Any? = null,
    val rbal : Any? = null,
    val gbal : Any? = null,
    val bbal : Any? = null,
    val rlum : Any? = null,
    val glum : Any? = null,
    val blum : Any? = null,
    val alternate : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vibrance] を参照してください */
fun String.vibrance(intensity : Any? = null, rbal : Any? = null, gbal : Any? = null, bbal : Any? = null, rlum : Any? = null, glum : Any? = null, blum : Any? = null, alternate : Any? = null) : vibrance {
    return vibrance(intensity, rbal, gbal, bbal, rlum, glum, blum, alternate, "", "").apply { setInputs(this@vibrance) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vidstabdetect )](https://ffmpeg.org/ffmpeg-filters.html#vidstabdetect)

```
Filter vidstabdetect
Extract relative transformations, pass 1 of 2 for stabilization (see vidstabtransform for pass 2).
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vidstabdetect AVOptions:
result            <string>     ..FV...... path to the file used to write the transforms (default "transforms.trf")
shakiness         <int>        ..FV...... how shaky is the video and how quick is the camera? 1: little (fast) 10: very strong/quick (slow) (from 1 to 10) (default 5)
accuracy          <int>        ..FV...... (>=shakiness) 1: low 15: high (slow) (from 1 to 15) (default 15)
stepsize          <int>        ..FV...... region around minimum is scanned with 1 pixel resolution (from 1 to 32) (default 6)
mincontrast       <double>     ..FV...... below this contrast a field is discarded (0-1) (from 0 to 1) (default 0.25)
show              <int>        ..FV...... 0: draw nothing; 1,2: show fields and transforms (from 0 to 2) (default 0)
tripod            <int>        ..FV...... virtual tripod mode (if >0): motion is compared to a reference reference frame (frame # is the value) (from 0 to INT_MAX) (default 0)


```
 * */
class vidstabdetect(
    val result : Any? = null,
    val shakiness : Any? = null,
    val accuracy : Any? = null,
    val stepsize : Any? = null,
    val mincontrast : Any? = null,
    val show : Any? = null,
    val tripod : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vidstabdetect] を参照してください */
fun String.vidstabdetect(result : Any? = null, shakiness : Any? = null, accuracy : Any? = null, stepsize : Any? = null, mincontrast : Any? = null, show : Any? = null, tripod : Any? = null) : vidstabdetect {
    return vidstabdetect(result, shakiness, accuracy, stepsize, mincontrast, show, tripod, "", "").apply { setInputs(this@vidstabdetect) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vidstabtransform )](https://ffmpeg.org/ffmpeg-filters.html#vidstabtransform)

```
Filter vidstabtransform
Transform the frames, pass 2 of 2 for stabilization (see vidstabdetect for pass 1).
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vidstabtransform AVOptions:
input             <string>     ..FV...... set path to the file storing the transforms (default "transforms.trf")
smoothing         <int>        ..FV...... set number of frames*2 + 1 used for lowpass filtering (from 0 to 1000) (default 15)
optalgo           <int>        ..FV...... set camera path optimization algo (from 0 to 2) (default opt)
opt             0            ..FV...... global optimization
gauss           1            ..FV...... gaussian kernel
avg             2            ..FV...... simple averaging on motion
maxshift          <int>        ..FV...... set maximal number of pixels to translate image (from -1 to 500) (default -1)
maxangle          <double>     ..FV...... set maximal angle in rad to rotate image (from -1 to 3.14) (default -1)
crop              <int>        ..FV...... set cropping mode (from 0 to 1) (default keep)
keep            0            ..FV...... keep border
black           1            ..FV...... black border
invert            <int>        ..FV...... invert transforms (from 0 to 1) (default 0)
relative          <int>        ..FV...... consider transforms as relative (from 0 to 1) (default 1)
zoom              <double>     ..FV...... set percentage to zoom (>0: zoom in, <0: zoom out (from -100 to 100) (default 0)
optzoom           <int>        ..FV...... set optimal zoom (0: nothing, 1: optimal static zoom, 2: optimal dynamic zoom) (from 0 to 2) (default 1)
zoomspeed         <double>     ..FV...... for adative zoom: percent to zoom maximally each frame (from 0 to 5) (default 0.25)
interpol          <int>        ..FV...... set type of interpolation (from 0 to 3) (default bilinear)
no              0            ..FV...... no interpolation
linear          1            ..FV...... linear (horizontal)
bilinear        2            ..FV...... bi-linear
bicubic         3            ..FV...... bi-cubic
tripod            <boolean>    ..FV...... enable virtual tripod mode (same as relative=0:smoothing=0) (default false)
debug             <boolean>    ..FV...... enable debug mode and writer global motions information to file (default false)


```
 * */
class vidstabtransform(
    val input : Any? = null,
    val smoothing : Any? = null,
    val optalgo : Any? = null,
    val maxshift : Any? = null,
    val maxangle : Any? = null,
    val crop : Any? = null,
    val invert : Any? = null,
    val relative : Any? = null,
    val zoom : Any? = null,
    val optzoom : Any? = null,
    val zoomspeed : Any? = null,
    val interpol : Any? = null,
    val tripod : Any? = null,
    val debug : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vidstabtransform] を参照してください */
fun String.vidstabtransform(input : Any? = null, smoothing : Any? = null, optalgo : Any? = null, maxshift : Any? = null, maxangle : Any? = null, crop : Any? = null, invert : Any? = null, relative : Any? = null, zoom : Any? = null, optzoom : Any? = null, zoomspeed : Any? = null, interpol : Any? = null, tripod : Any? = null, debug : Any? = null) : vidstabtransform {
    return vidstabtransform(input, smoothing, optalgo, maxshift, maxangle, crop, invert, relative, zoom, optzoom, zoomspeed, interpol, tripod, debug, "", "").apply { setInputs(this@vidstabtransform) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vignette )](https://ffmpeg.org/ffmpeg-filters.html#vignette)

```
Filter vignette
Make or reverse a vignette effect.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vignette AVOptions:
angle             <string>     ..FV...... set lens angle (default "PI/5")
a                 <string>     ..FV...... set lens angle (default "PI/5")
x0                <string>     ..FV...... set circle center position on x-axis (default "w/2")
y0                <string>     ..FV...... set circle center position on y-axis (default "h/2")
mode              <int>        ..FV...... set forward/backward mode (from 0 to 1) (default forward)
forward         0            ..FV......
backward        1            ..FV......
eval              <int>        ..FV...... specify when to evaluate expressions (from 0 to 1) (default init)
init            0            ..FV...... eval expressions once during initialization
frame           1            ..FV...... eval expressions for each frame
dither            <boolean>    ..FV...... set dithering (default true)
aspect            <rational>   ..FV...... set aspect ratio (from 0 to DBL_MAX) (default 1/1)

This filter has support for timeline through the 'enable' option.

```
 * */
class vignette(
    val angle : Any? = null,
    val x0 : Any? = null,
    val y0 : Any? = null,
    val mode : Any? = null,
    val eval : Any? = null,
    val dither : Any? = null,
    val aspect : Any? = null,
    val a : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vignette] を参照してください */
fun String.vignette(angle : Any? = null, x0 : Any? = null, y0 : Any? = null, mode : Any? = null, eval : Any? = null, dither : Any? = null, aspect : Any? = null, a : Any? = null) : vignette {
    return vignette(angle, x0, y0, mode, eval, dither, aspect, a, "", "").apply { setInputs(this@vignette) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vmafmotion )](https://ffmpeg.org/ffmpeg-filters.html#vmafmotion)

```
Filter vmafmotion
Calculate the VMAF Motion score.
Inputs:
#0: reference (video)
Outputs:
#0: default (video)
vmafmotion AVOptions:
stats_file        <string>     ..FV...... Set file where to store per-frame difference information


```
 * */
class vmafmotion(
    val stats_file : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vmafmotion] を参照してください */
fun String.vmafmotion(stats_file : Any? = null) : vmafmotion {
    return vmafmotion(stats_file, "", "").apply { setInputs(this@vmafmotion) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vpp_qsv )](https://ffmpeg.org/ffmpeg-filters.html#vpp_qsv)

```
Filter vpp_qsv
Quick Sync Video VPP.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
vpp_qsv AVOptions:
deinterlace       <int>        ..FV...... deinterlace mode: 0=off, 1=bob, 2=advanced (from 0 to 2) (default 0)
bob             1            ..FV...... Bob deinterlace mode.
advanced        2            ..FV...... Advanced deinterlace mode.
denoise           <int>        ..FV...... denoise level [0, 100] (from 0 to 100) (default 0)
detail            <int>        ..FV...... enhancement level [0, 100] (from 0 to 100) (default 0)
framerate         <rational>   ..FV...... output framerate (from 0 to DBL_MAX) (default 0/1)
procamp           <int>        ..FV...... Enable ProcAmp (from 0 to 1) (default 0)
hue               <float>      ..FV...... ProcAmp hue (from -180 to 180) (default 0)
saturation        <float>      ..FV...... ProcAmp saturation (from 0 to 10) (default 1)
contrast          <float>      ..FV...... ProcAmp contrast (from 0 to 10) (default 1)
brightness        <float>      ..FV...... ProcAmp brightness (from -100 to 100) (default 0)
transpose         <int>        ..FV...... set transpose direction (from -1 to 6) (default -1)
cclock_hflip    0            ..FV...... rotate counter-clockwise with horizontal flip
clock           1            ..FV...... rotate clockwise
cclock          2            ..FV...... rotate counter-clockwise
clock_hflip     3            ..FV...... rotate clockwise with horizontal flip
reversal        4            ..FV...... rotate by half-turn
hflip           5            ..FV...... flip horizontally
vflip           6            ..FV...... flip vertically
cw                <string>     ..FV...... set the width crop area expression (default "iw")
ch                <string>     ..FV...... set the height crop area expression (default "ih")
cx                <string>     ..FV...... set the x crop area expression (default "(in_w-out_w)/2")
cy                <string>     ..FV...... set the y crop area expression (default "(in_h-out_h)/2")
w                 <string>     ..FV...... Output video width (default "cw")
width             <string>     ..FV...... Output video width (default "cw")
h                 <string>     ..FV...... Output video height (default "w*ch/cw")
height            <string>     ..FV...... Output video height (default "w*ch/cw")
format            <string>     ..FV...... Output pixel format (default "same")


```
 * */
class vpp_qsv(
    val deinterlace : Any? = null,
    val denoise : Any? = null,
    val detail : Any? = null,
    val framerate : Any? = null,
    val procamp : Any? = null,
    val hue : Any? = null,
    val saturation : Any? = null,
    val contrast : Any? = null,
    val brightness : Any? = null,
    val transpose : Any? = null,
    val cw : Any? = null,
    val ch : Any? = null,
    val cx : Any? = null,
    val cy : Any? = null,
    val w : Any? = null,
    val width : Any? = null,
    val h : Any? = null,
    val height : Any? = null,
    val _format : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vpp_qsv] を参照してください */
fun String.vpp_qsv(deinterlace : Any? = null, denoise : Any? = null, detail : Any? = null, framerate : Any? = null, procamp : Any? = null, hue : Any? = null, saturation : Any? = null, contrast : Any? = null, brightness : Any? = null, transpose : Any? = null, cw : Any? = null, ch : Any? = null, cx : Any? = null, cy : Any? = null, w : Any? = null, width : Any? = null, h : Any? = null, height : Any? = null, _format : Any? = null) : vpp_qsv {
    return vpp_qsv(deinterlace, denoise, detail, framerate, procamp, hue, saturation, contrast, brightness, transpose, cw, ch, cx, cy, w, width, h, height, _format, "", "").apply { setInputs(this@vpp_qsv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( vstack )](https://ffmpeg.org/ffmpeg-filters.html#vstack)

```
Filter vstack
Stack video inputs vertically.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
vstack AVOptions:
inputs            <int>        ..FV...... set number of inputs (from 2 to INT_MAX) (default 2)
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)


```
 * */
class vstack(
    val inputs : Any? = null,
    val shortest : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [vstack] を参照してください */
fun String.vstack(inputs : Any? = null, shortest : Any? = null) : vstack {
    return vstack(inputs, shortest, "", "").apply { setInputs(this@vstack) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( w3fdif )](https://ffmpeg.org/ffmpeg-filters.html#w3fdif)

```
Filter w3fdif
Apply Martin Weston three field deinterlace.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
w3fdif AVOptions:
filter            <int>        ..FV...... specify the filter (from 0 to 1) (default complex)
simple          0            ..FV......
complex         1            ..FV......
deint             <int>        ..FV...... specify which frames to deinterlace (from 0 to 1) (default all)
all             0            ..FV...... deinterlace all frames
interlaced      1            ..FV...... only deinterlace frames marked as interlaced

This filter has support for timeline through the 'enable' option.

```
 * */
class w3fdif(
    val filter : Any? = null,
    val deint : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [w3fdif] を参照してください */
fun String.w3fdif(filter : Any? = null, deint : Any? = null) : w3fdif {
    return w3fdif(filter, deint, "", "").apply { setInputs(this@w3fdif) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( waveform )](https://ffmpeg.org/ffmpeg-filters.html#waveform)

```
Filter waveform
Video waveform monitor.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
waveform AVOptions:
mode              <int>        ..FV...... set mode (from 0 to 1) (default column)
row             0            ..FV......
column          1            ..FV......
m                 <int>        ..FV...... set mode (from 0 to 1) (default column)
row             0            ..FV......
column          1            ..FV......
intensity         <float>      ..FV...... set intensity (from 0 to 1) (default 0.04)
i                 <float>      ..FV...... set intensity (from 0 to 1) (default 0.04)
mirror            <boolean>    ..FV...... set mirroring (default true)
r                 <boolean>    ..FV...... set mirroring (default true)
display           <int>        ..FV...... set display mode (from 0 to 2) (default stack)
overlay         0            ..FV......
stack           1            ..FV......
parade          2            ..FV......
d                 <int>        ..FV...... set display mode (from 0 to 2) (default stack)
overlay         0            ..FV......
stack           1            ..FV......
parade          2            ..FV......
components        <int>        ..FV...... set components to display (from 1 to 15) (default 1)
c                 <int>        ..FV...... set components to display (from 1 to 15) (default 1)
envelope          <int>        ..FV...... set envelope to display (from 0 to 3) (default none)
none            0            ..FV......
instant         1            ..FV......
peak            2            ..FV......
peak+instant    3            ..FV......
e                 <int>        ..FV...... set envelope to display (from 0 to 3) (default none)
none            0            ..FV......
instant         1            ..FV......
peak            2            ..FV......
peak+instant    3            ..FV......
filter            <int>        ..FV...... set filter (from 0 to 7) (default lowpass)
lowpass         0            ..FV......
flat            1            ..FV......
aflat           2            ..FV......
chroma          3            ..FV......
color           4            ..FV......
acolor          5            ..FV......
xflat           6            ..FV......
yflat           7            ..FV......
f                 <int>        ..FV...... set filter (from 0 to 7) (default lowpass)
lowpass         0            ..FV......
flat            1            ..FV......
aflat           2            ..FV......
chroma          3            ..FV......
color           4            ..FV......
acolor          5            ..FV......
xflat           6            ..FV......
yflat           7            ..FV......
graticule         <int>        ..FV...... set graticule (from 0 to 3) (default none)
none            0            ..FV......
green           1            ..FV......
orange          2            ..FV......
invert          3            ..FV......
g                 <int>        ..FV...... set graticule (from 0 to 3) (default none)
none            0            ..FV......
green           1            ..FV......
orange          2            ..FV......
invert          3            ..FV......
opacity           <float>      ..FV...... set graticule opacity (from 0 to 1) (default 0.75)
o                 <float>      ..FV...... set graticule opacity (from 0 to 1) (default 0.75)
flags             <flags>      ..FV...... set graticule flags (default numbers)
numbers                      ..FV...... draw numbers
dots                         ..FV...... draw dots instead of lines
fl                <flags>      ..FV...... set graticule flags (default numbers)
numbers                      ..FV...... draw numbers
dots                         ..FV...... draw dots instead of lines
scale             <int>        ..FV...... set scale (from 0 to 2) (default digital)
digital         0            ..FV......
millivolts      1            ..FV......
ire             2            ..FV......
s                 <int>        ..FV...... set scale (from 0 to 2) (default digital)
digital         0            ..FV......
millivolts      1            ..FV......
ire             2            ..FV......
bgopacity         <float>      ..FV...... set background opacity (from 0 to 1) (default 0.75)
b                 <float>      ..FV...... set background opacity (from 0 to 1) (default 0.75)
tint0             <float>      ..FV...... set 1st tint (from -1 to 1) (default 0)
t0                <float>      ..FV...... set 1st tint (from -1 to 1) (default 0)
tint1             <float>      ..FV...... set 2nd tint (from -1 to 1) (default 0)
t1                <float>      ..FV...... set 2nd tint (from -1 to 1) (default 0)


```
 * */
class waveform(
    val mode : Any? = null,
    val intensity : Any? = null,
    val mirror : Any? = null,
    val display : Any? = null,
    val components : Any? = null,
    val envelope : Any? = null,
    val filter : Any? = null,
    val graticule : Any? = null,
    val opacity : Any? = null,
    val flags : Any? = null,
    val scale : Any? = null,
    val bgopacity : Any? = null,
    val tint0 : Any? = null,
    val tint1 : Any? = null,
    val m : Any? = null,
    val i : Any? = null,
    val r : Any? = null,
    val d : Any? = null,
    val c : Any? = null,
    val e : Any? = null,
    val f : Any? = null,
    val g : Any? = null,
    val o : Any? = null,
    val fl : Any? = null,
    val s : Any? = null,
    val b : Any? = null,
    val t0 : Any? = null,
    val t1 : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [waveform] を参照してください */
fun String.waveform(mode : Any? = null, intensity : Any? = null, mirror : Any? = null, display : Any? = null, components : Any? = null, envelope : Any? = null, filter : Any? = null, graticule : Any? = null, opacity : Any? = null, flags : Any? = null, scale : Any? = null, bgopacity : Any? = null, tint0 : Any? = null, tint1 : Any? = null, m : Any? = null, i : Any? = null, r : Any? = null, d : Any? = null, c : Any? = null, e : Any? = null, f : Any? = null, g : Any? = null, o : Any? = null, fl : Any? = null, s : Any? = null, b : Any? = null, t0 : Any? = null, t1 : Any? = null) : waveform {
    return waveform(mode, intensity, mirror, display, components, envelope, filter, graticule, opacity, flags, scale, bgopacity, tint0, tint1, m, i, r, d, c, e, f, g, o, fl, s, b, t0, t1, "", "").apply { setInputs(this@waveform) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( weave )](https://ffmpeg.org/ffmpeg-filters.html#weave)

```
Filter weave
Weave input video fields into frames.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
weave AVOptions:
first_field       <int>        ..FV...... set first field (from 0 to 1) (default top)
top             0            ..FV...... set top field first
t               0            ..FV...... set top field first
bottom          1            ..FV...... set bottom field first
b               1            ..FV...... set bottom field first


```
 * */
class weave(
    val first_field : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [weave] を参照してください */
fun String.weave(first_field : Any? = null) : weave {
    return weave(first_field, "", "").apply { setInputs(this@weave) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( xbr )](https://ffmpeg.org/ffmpeg-filters.html#xbr)

```
Filter xbr
Scale the input using xBR algorithm.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
xbr AVOptions:
n                 <int>        ..FV...... set scale factor (from 2 to 4) (default 3)


```
 * */
class xbr(
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [xbr] を参照してください */
fun String.xbr(n : Any? = null) : xbr {
    return xbr(n, "", "").apply { setInputs(this@xbr) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( xfade )](https://ffmpeg.org/ffmpeg-filters.html#xfade)

```
Filter xfade
Cross fade one video with another video.
slice threading supported
Inputs:
#0: main (video)
#1: xfade (video)
Outputs:
#0: default (video)
xfade AVOptions:
transition        <int>        ..FV...... set cross fade transition (from -1 to 34) (default fade)
custom          -1           ..FV...... custom transition
fade            0            ..FV...... fade transition
wipeleft        1            ..FV...... wipe left transition
wiperight       2            ..FV...... wipe right transition
wipeup          3            ..FV...... wipe up transition
wipedown        4            ..FV...... wipe down transition
slideleft       5            ..FV...... slide left transition
slideright      6            ..FV...... slide right transition
slideup         7            ..FV...... slide up transition
slidedown       8            ..FV...... slide down transition
circlecrop      9            ..FV...... circle crop transition
rectcrop        10           ..FV...... rect crop transition
distance        11           ..FV...... distance transition
fadeblack       12           ..FV...... fadeblack transition
fadewhite       13           ..FV...... fadewhite transition
radial          14           ..FV...... radial transition
smoothleft      15           ..FV...... smoothleft transition
smoothright     16           ..FV...... smoothright transition
smoothup        17           ..FV...... smoothup transition
smoothdown      18           ..FV...... smoothdown transition
circleopen      19           ..FV...... circleopen transition
circleclose     20           ..FV...... circleclose transition
vertopen        21           ..FV...... vert open transition
vertclose       22           ..FV...... vert close transition
horzopen        23           ..FV...... horz open transition
horzclose       24           ..FV...... horz close transition
dissolve        25           ..FV...... dissolve transition
pixelize        26           ..FV...... pixelize transition
diagtl          27           ..FV...... diag tl transition
diagtr          28           ..FV...... diag tr transition
diagbl          29           ..FV...... diag bl transition
diagbr          30           ..FV...... diag br transition
hlslice         31           ..FV...... hl slice transition
hrslice         32           ..FV...... hr slice transition
vuslice         33           ..FV...... vu slice transition
vdslice         34           ..FV...... vd slice transition
duration          <duration>   ..FV...... set cross fade duration (default 1)
offset            <duration>   ..FV...... set cross fade start relative to first input stream (default 0)
expr              <string>     ..FV...... set expression for custom transition


```
 * */
class xfade(
    val transition : Any? = null,
    val duration : Any? = null,
    val offset : Any? = null,
    val expr : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [xfade] を参照してください */
fun String.xfade(transition : Any? = null, duration : Any? = null, offset : Any? = null, expr : Any? = null) : xfade {
    return xfade(transition, duration, offset, expr, "", "").apply { setInputs(this@xfade) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( xmedian )](https://ffmpeg.org/ffmpeg-filters.html#xmedian)

```
Filter xmedian
Pick median pixels from several video inputs.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
xmedian AVOptions:
inputs            <int>        ..FV...... set number of inputs (from 3 to 255) (default 3)
planes            <int>        ..FV...... set planes to filter (from 0 to 15) (default 15)
percentile        <float>      ..FV...... set percentile (from 0 to 1) (default 0.5)


```
 * */
class xmedian(
    val inputs : Any? = null,
    val planes : Any? = null,
    val percentile : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [xmedian] を参照してください */
fun String.xmedian(inputs : Any? = null, planes : Any? = null, percentile : Any? = null) : xmedian {
    return xmedian(inputs, planes, percentile, "", "").apply { setInputs(this@xmedian) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( xstack )](https://ffmpeg.org/ffmpeg-filters.html#xstack)

```
Filter xstack
Stack video inputs into custom layout.
slice threading supported
Inputs:
dynamic (depending on the options)
Outputs:
#0: default (video)
xstack AVOptions:
inputs            <int>        ..FV...... set number of inputs (from 2 to INT_MAX) (default 2)
layout            <string>     ..FV...... set custom layout
shortest          <boolean>    ..FV...... force termination when the shortest input terminates (default false)
fill              <string>     ..FV...... set the color for unused pixels (default "none")


```
 * */
class xstack(
    val inputs : Any? = null,
    val layout : Any? = null,
    val shortest : Any? = null,
    val fill : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [xstack] を参照してください */
fun String.xstack(inputs : Any? = null, layout : Any? = null, shortest : Any? = null, fill : Any? = null) : xstack {
    return xstack(inputs, layout, shortest, fill, "", "").apply { setInputs(this@xstack) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( yadif )](https://ffmpeg.org/ffmpeg-filters.html#yadif)

```
Filter yadif
Deinterlace the input image.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
yadif AVOptions:
mode              <int>        ..FV...... specify the interlacing mode (from 0 to 3) (default send_frame)
send_frame      0            ..FV...... send one frame for each frame
send_field      1            ..FV...... send one frame for each field
send_frame_nospatial 2            ..FV...... send one frame for each frame, but skip spatial interlacing check
send_field_nospatial 3            ..FV...... send one frame for each field, but skip spatial interlacing check
parity            <int>        ..FV...... specify the assumed picture field parity (from -1 to 1) (default auto)
tff             0            ..FV...... assume top field first
bff             1            ..FV...... assume bottom field first
auto            -1           ..FV...... auto detect parity
deint             <int>        ..FV...... specify which frames to deinterlace (from 0 to 1) (default all)
all             0            ..FV...... deinterlace all frames
interlaced      1            ..FV...... only deinterlace frames marked as interlaced

This filter has support for timeline through the 'enable' option.

```
 * */
class yadif(
    val mode : Any? = null,
    val parity : Any? = null,
    val deint : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [yadif] を参照してください */
fun String.yadif(mode : Any? = null, parity : Any? = null, deint : Any? = null) : yadif {
    return yadif(mode, parity, deint, "", "").apply { setInputs(this@yadif) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( yadif_cuda )](https://ffmpeg.org/ffmpeg-filters.html#yadif_cuda)

```
Filter yadif_cuda
Deinterlace CUDA frames
Inputs:
#0: default (video)
Outputs:
#0: default (video)
yadif_cuda AVOptions:
mode              <int>        ..FV...... specify the interlacing mode (from 0 to 3) (default send_frame)
send_frame      0            ..FV...... send one frame for each frame
send_field      1            ..FV...... send one frame for each field
send_frame_nospatial 2            ..FV...... send one frame for each frame, but skip spatial interlacing check
send_field_nospatial 3            ..FV...... send one frame for each field, but skip spatial interlacing check
parity            <int>        ..FV...... specify the assumed picture field parity (from -1 to 1) (default auto)
tff             0            ..FV...... assume top field first
bff             1            ..FV...... assume bottom field first
auto            -1           ..FV...... auto detect parity
deint             <int>        ..FV...... specify which frames to deinterlace (from 0 to 1) (default all)
all             0            ..FV...... deinterlace all frames
interlaced      1            ..FV...... only deinterlace frames marked as interlaced

This filter has support for timeline through the 'enable' option.

```
 * */
class yadif_cuda(
    val mode : Any? = null,
    val parity : Any? = null,
    val deint : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [yadif_cuda] を参照してください */
fun String.yadif_cuda(mode : Any? = null, parity : Any? = null, deint : Any? = null) : yadif_cuda {
    return yadif_cuda(mode, parity, deint, "", "").apply { setInputs(this@yadif_cuda) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( yaepblur )](https://ffmpeg.org/ffmpeg-filters.html#yaepblur)

```
Filter yaepblur
Yet another edge preserving blur filter.
slice threading supported
Inputs:
#0: default (video)
Outputs:
#0: default (video)
yaep AVOptions:
radius            <int>        ..FV.....T set window radius (from 0 to INT_MAX) (default 3)
r                 <int>        ..FV.....T set window radius (from 0 to INT_MAX) (default 3)
planes            <int>        ..FV.....T set planes to filter (from 0 to 15) (default 1)
p                 <int>        ..FV.....T set planes to filter (from 0 to 15) (default 1)
sigma             <int>        ..FV.....T set blur strength (from 1 to INT_MAX) (default 128)
s                 <int>        ..FV.....T set blur strength (from 1 to INT_MAX) (default 128)

This filter has support for timeline through the 'enable' option.

```
 * */
class yaepblur(
    val radius : Any? = null,
    val planes : Any? = null,
    val sigma : Any? = null,
    val r : Any? = null,
    val p : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [yaepblur] を参照してください */
fun String.yaepblur(radius : Any? = null, planes : Any? = null, sigma : Any? = null, r : Any? = null, p : Any? = null, s : Any? = null) : yaepblur {
    return yaepblur(radius, planes, sigma, r, p, s, "", "").apply { setInputs(this@yaepblur) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( zoompan )](https://ffmpeg.org/ffmpeg-filters.html#zoompan)

```
Filter zoompan
Apply Zoom & Pan effect.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
zoompan AVOptions:
zoom              <string>     ..FV...... set the zoom expression (default "1")
z                 <string>     ..FV...... set the zoom expression (default "1")
x                 <string>     ..FV...... set the x expression (default "0")
y                 <string>     ..FV...... set the y expression (default "0")
d                 <string>     ..FV...... set the duration expression (default "90")
s                 <image_size> ..FV...... set the output image size (default "hd720")
fps               <video_rate> ..FV...... set the output framerate (default "25")


```
 * */
class zoompan(
    val zoom : Any? = null,
    val x : Any? = null,
    val y : Any? = null,
    val d : Any? = null,
    val s : Any? = null,
    val fps : Any? = null,
    val z : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [zoompan] を参照してください */
fun String.zoompan(zoom : Any? = null, x : Any? = null, y : Any? = null, d : Any? = null, s : Any? = null, fps : Any? = null, z : Any? = null) : zoompan {
    return zoompan(zoom, x, y, d, s, fps, z, "", "").apply { setInputs(this@zoompan) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( zscale )](https://ffmpeg.org/ffmpeg-filters.html#zscale)

```
Filter zscale
Apply resizing, colorspace and bit depth conversion.
Inputs:
#0: default (video)
Outputs:
#0: default (video)
zscale AVOptions:
w                 <string>     ..FV.....T Output video width
width             <string>     ..FV.....T Output video width
h                 <string>     ..FV.....T Output video height
height            <string>     ..FV.....T Output video height
size              <string>     ..FV...... set video size
s                 <string>     ..FV...... set video size
dither            <int>        ..FV...... set dither type (from 0 to 3) (default none)
none            0            ..FV......
ordered         1            ..FV......
random          2            ..FV......
error_diffusion 3            ..FV......
d                 <int>        ..FV...... set dither type (from 0 to 3) (default none)
none            0            ..FV......
ordered         1            ..FV......
random          2            ..FV......
error_diffusion 3            ..FV......
filter            <int>        ..FV...... set filter type (from 0 to 5) (default bilinear)
point           0            ..FV......
bilinear        1            ..FV......
bicubic         2            ..FV......
spline16        3            ..FV......
spline36        4            ..FV......
lanczos         5            ..FV......
f                 <int>        ..FV...... set filter type (from 0 to 5) (default bilinear)
point           0            ..FV......
bilinear        1            ..FV......
bicubic         2            ..FV......
spline16        3            ..FV......
spline36        4            ..FV......
lanczos         5            ..FV......
out_range         <int>        ..FV...... set color range (from -1 to 1) (default input)
input           -1           ..FV......
limited         0            ..FV......
full            1            ..FV......
unknown         -1           ..FV......
tv              0            ..FV......
pc              1            ..FV......
range             <int>        ..FV...... set color range (from -1 to 1) (default input)
input           -1           ..FV......
limited         0            ..FV......
full            1            ..FV......
unknown         -1           ..FV......
tv              0            ..FV......
pc              1            ..FV......
r                 <int>        ..FV...... set color range (from -1 to 1) (default input)
input           -1           ..FV......
limited         0            ..FV......
full            1            ..FV......
unknown         -1           ..FV......
tv              0            ..FV......
pc              1            ..FV......
primaries         <int>        ..FV...... set color primaries (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
170m            6            ..FV......
240m            7            ..FV......
2020            9            ..FV......
unknown         2            ..FV......
bt709           1            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
film            8            ..FV......
bt2020          9            ..FV......
smpte428        10           ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
p                 <int>        ..FV...... set color primaries (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
170m            6            ..FV......
240m            7            ..FV......
2020            9            ..FV......
unknown         2            ..FV......
bt709           1            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
film            8            ..FV......
bt2020          9            ..FV......
smpte428        10           ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
transfer          <int>        ..FV...... set transfer characteristic (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
601             6            ..FV......
linear          8            ..FV......
2020_10         14           ..FV......
2020_12         15           ..FV......
unknown         2            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
bt709           1            ..FV......
linear          8            ..FV......
log100          9            ..FV......
log316          10           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......
smpte2084       16           ..FV......
iec61966-2-4    11           ..FV......
iec61966-2-1    13           ..FV......
arib-std-b67    18           ..FV......
t                 <int>        ..FV...... set transfer characteristic (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
601             6            ..FV......
linear          8            ..FV......
2020_10         14           ..FV......
2020_12         15           ..FV......
unknown         2            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
bt709           1            ..FV......
linear          8            ..FV......
log100          9            ..FV......
log316          10           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......
smpte2084       16           ..FV......
iec61966-2-4    11           ..FV......
iec61966-2-1    13           ..FV......
arib-std-b67    18           ..FV......
matrix            <int>        ..FV...... set colorspace matrix (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
470bg           5            ..FV......
170m            6            ..FV......
2020_ncl        9            ..FV......
2020_cl         10           ..FV......
unknown         2            ..FV......
gbr             0            ..FV......
bt709           1            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte2400m      7            ..FV......
ycgco           8            ..FV......
bt2020nc        9            ..FV......
bt2020c         10           ..FV......
chroma-derived-nc 12           ..FV......
chroma-derived-c 13           ..FV......
ictcp           14           ..FV......
m                 <int>        ..FV...... set colorspace matrix (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
470bg           5            ..FV......
170m            6            ..FV......
2020_ncl        9            ..FV......
2020_cl         10           ..FV......
unknown         2            ..FV......
gbr             0            ..FV......
bt709           1            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte2400m      7            ..FV......
ycgco           8            ..FV......
bt2020nc        9            ..FV......
bt2020c         10           ..FV......
chroma-derived-nc 12           ..FV......
chroma-derived-c 13           ..FV......
ictcp           14           ..FV......
in_range          <int>        ..FV...... set input color range (from -1 to 1) (default input)
input           -1           ..FV......
limited         0            ..FV......
full            1            ..FV......
unknown         -1           ..FV......
tv              0            ..FV......
pc              1            ..FV......
rangein           <int>        ..FV...... set input color range (from -1 to 1) (default input)
input           -1           ..FV......
limited         0            ..FV......
full            1            ..FV......
unknown         -1           ..FV......
tv              0            ..FV......
pc              1            ..FV......
rin               <int>        ..FV...... set input color range (from -1 to 1) (default input)
input           -1           ..FV......
limited         0            ..FV......
full            1            ..FV......
unknown         -1           ..FV......
tv              0            ..FV......
pc              1            ..FV......
primariesin       <int>        ..FV...... set input color primaries (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
170m            6            ..FV......
240m            7            ..FV......
2020            9            ..FV......
unknown         2            ..FV......
bt709           1            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
film            8            ..FV......
bt2020          9            ..FV......
smpte428        10           ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
pin               <int>        ..FV...... set input color primaries (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
170m            6            ..FV......
240m            7            ..FV......
2020            9            ..FV......
unknown         2            ..FV......
bt709           1            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte240m       7            ..FV......
film            8            ..FV......
bt2020          9            ..FV......
smpte428        10           ..FV......
smpte431        11           ..FV......
smpte432        12           ..FV......
jedec-p22       22           ..FV......
ebu3213         22           ..FV......
transferin        <int>        ..FV...... set input transfer characteristic (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
601             6            ..FV......
linear          8            ..FV......
2020_10         14           ..FV......
2020_12         15           ..FV......
unknown         2            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
bt709           1            ..FV......
linear          8            ..FV......
log100          9            ..FV......
log316          10           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......
smpte2084       16           ..FV......
iec61966-2-4    11           ..FV......
iec61966-2-1    13           ..FV......
arib-std-b67    18           ..FV......
tin               <int>        ..FV...... set input transfer characteristic (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
601             6            ..FV......
linear          8            ..FV......
2020_10         14           ..FV......
2020_12         15           ..FV......
unknown         2            ..FV......
bt470m          4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
bt709           1            ..FV......
linear          8            ..FV......
log100          9            ..FV......
log316          10           ..FV......
bt2020-10       14           ..FV......
bt2020-12       15           ..FV......
smpte2084       16           ..FV......
iec61966-2-4    11           ..FV......
iec61966-2-1    13           ..FV......
arib-std-b67    18           ..FV......
matrixin          <int>        ..FV...... set input colorspace matrix (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
470bg           5            ..FV......
170m            6            ..FV......
2020_ncl        9            ..FV......
2020_cl         10           ..FV......
unknown         2            ..FV......
gbr             0            ..FV......
bt709           1            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte2400m      7            ..FV......
ycgco           8            ..FV......
bt2020nc        9            ..FV......
bt2020c         10           ..FV......
chroma-derived-nc 12           ..FV......
chroma-derived-c 13           ..FV......
ictcp           14           ..FV......
min               <int>        ..FV...... set input colorspace matrix (from -1 to INT_MAX) (default input)
input           -1           ..FV......
709             1            ..FV......
unspecified     2            ..FV......
470bg           5            ..FV......
170m            6            ..FV......
2020_ncl        9            ..FV......
2020_cl         10           ..FV......
unknown         2            ..FV......
gbr             0            ..FV......
bt709           1            ..FV......
fcc             4            ..FV......
bt470bg         5            ..FV......
smpte170m       6            ..FV......
smpte2400m      7            ..FV......
ycgco           8            ..FV......
bt2020nc        9            ..FV......
bt2020c         10           ..FV......
chroma-derived-nc 12           ..FV......
chroma-derived-c 13           ..FV......
ictcp           14           ..FV......
chromal           <int>        ..FV...... set output chroma location (from -1 to 5) (default input)
input           -1           ..FV......
left            0            ..FV......
center          1            ..FV......
topleft         2            ..FV......
top             3            ..FV......
bottomleft      4            ..FV......
bottom          5            ..FV......
c                 <int>        ..FV...... set output chroma location (from -1 to 5) (default input)
input           -1           ..FV......
left            0            ..FV......
center          1            ..FV......
topleft         2            ..FV......
top             3            ..FV......
bottomleft      4            ..FV......
bottom          5            ..FV......
chromalin         <int>        ..FV...... set input chroma location (from -1 to 5) (default input)
input           -1           ..FV......
left            0            ..FV......
center          1            ..FV......
topleft         2            ..FV......
top             3            ..FV......
bottomleft      4            ..FV......
bottom          5            ..FV......
cin               <int>        ..FV...... set input chroma location (from -1 to 5) (default input)
input           -1           ..FV......
left            0            ..FV......
center          1            ..FV......
topleft         2            ..FV......
top             3            ..FV......
bottomleft      4            ..FV......
bottom          5            ..FV......
npl               <double>     ..FV...... set nominal peak luminance (from 0 to DBL_MAX) (default nan)
agamma            <boolean>    ..FV...... allow approximate gamma (default true)


```
 * */
class zscale(
    val w : Any? = null,
    val width : Any? = null,
    val h : Any? = null,
    val height : Any? = null,
    val size : Any? = null,
    val dither : Any? = null,
    val filter : Any? = null,
    val out_range : Any? = null,
    val range : Any? = null,
    val primaries : Any? = null,
    val transfer : Any? = null,
    val matrix : Any? = null,
    val in_range : Any? = null,
    val rangein : Any? = null,
    val rin : Any? = null,
    val primariesin : Any? = null,
    val pin : Any? = null,
    val transferin : Any? = null,
    val tin : Any? = null,
    val matrixin : Any? = null,
    val min : Any? = null,
    val chromal : Any? = null,
    val chromalin : Any? = null,
    val cin : Any? = null,
    val npl : Any? = null,
    val agamma : Any? = null,
    val s : Any? = null,
    val d : Any? = null,
    val f : Any? = null,
    val r : Any? = null,
    val p : Any? = null,
    val t : Any? = null,
    val m : Any? = null,
    val c : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [zscale] を参照してください */
fun String.zscale(w : Any? = null, width : Any? = null, h : Any? = null, height : Any? = null, size : Any? = null, dither : Any? = null, filter : Any? = null, out_range : Any? = null, range : Any? = null, primaries : Any? = null, transfer : Any? = null, matrix : Any? = null, in_range : Any? = null, rangein : Any? = null, rin : Any? = null, primariesin : Any? = null, pin : Any? = null, transferin : Any? = null, tin : Any? = null, matrixin : Any? = null, min : Any? = null, chromal : Any? = null, chromalin : Any? = null, cin : Any? = null, npl : Any? = null, agamma : Any? = null, s : Any? = null, d : Any? = null, f : Any? = null, r : Any? = null, p : Any? = null, t : Any? = null, m : Any? = null, c : Any? = null) : zscale {
    return zscale(w, width, h, height, size, dither, filter, out_range, range, primaries, transfer, matrix, in_range, rangein, rin, primariesin, pin, transferin, tin, matrixin, min, chromal, chromalin, cin, npl, agamma, s, d, f, r, p, t, m, c, "", "").apply { setInputs(this@zscale) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( allrgb )](https://ffmpeg.org/ffmpeg-filters.html#allrgb)

```
Filter allrgb
Generate all RGB colors.
Inputs:
none (source filter)
Outputs:
#0: default (video)
allrgb AVOptions:
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class allrgb(
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [allrgb] を参照してください */
fun String.allrgb(rate : Any? = null, duration : Any? = null, sar : Any? = null, r : Any? = null, d : Any? = null) : allrgb {
    return allrgb(rate, duration, sar, r, d, "", "").apply { setInputs(this@allrgb) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( allyuv )](https://ffmpeg.org/ffmpeg-filters.html#allyuv)

```
Filter allyuv
Generate all yuv colors.
Inputs:
none (source filter)
Outputs:
#0: default (video)
allyuv AVOptions:
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class allyuv(
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [allyuv] を参照してください */
fun String.allyuv(rate : Any? = null, duration : Any? = null, sar : Any? = null, r : Any? = null, d : Any? = null) : allyuv {
    return allyuv(rate, duration, sar, r, d, "", "").apply { setInputs(this@allyuv) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( cellauto )](https://ffmpeg.org/ffmpeg-filters.html#cellauto)

```
Filter cellauto
Create pattern generated by an elementary cellular automaton.
Inputs:
none (source filter)
Outputs:
#0: default (video)
cellauto AVOptions:
filename          <string>     ..FV...... read initial pattern from file
f                 <string>     ..FV...... read initial pattern from file
pattern           <string>     ..FV...... set initial pattern
p                 <string>     ..FV...... set initial pattern
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
size              <image_size> ..FV...... set video size
s                 <image_size> ..FV...... set video size
rule              <int>        ..FV...... set rule (from 0 to 255) (default 110)
random_fill_ratio <double>     ..FV...... set fill ratio for filling initial grid randomly (from 0 to 1) (default 0.618034)
ratio             <double>     ..FV...... set fill ratio for filling initial grid randomly (from 0 to 1) (default 0.618034)
random_seed       <int64>      ..FV...... set the seed for filling the initial grid randomly (from -1 to UINT32_MAX) (default -1)
seed              <int64>      ..FV...... set the seed for filling the initial grid randomly (from -1 to UINT32_MAX) (default -1)
scroll            <boolean>    ..FV...... scroll pattern downward (default true)
start_full        <boolean>    ..FV...... start filling the whole video (default false)
full              <boolean>    ..FV...... start filling the whole video (default true)
stitch            <boolean>    ..FV...... stitch boundaries (default true)


```
 * */
class cellauto(
    val filename : Any? = null,
    val pattern : Any? = null,
    val rate : Any? = null,
    val size : Any? = null,
    val rule : Any? = null,
    val random_fill_ratio : Any? = null,
    val ratio : Any? = null,
    val random_seed : Any? = null,
    val seed : Any? = null,
    val scroll : Any? = null,
    val start_full : Any? = null,
    val full : Any? = null,
    val stitch : Any? = null,
    val f : Any? = null,
    val p : Any? = null,
    val r : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [cellauto] を参照してください */
fun String.cellauto(filename : Any? = null, pattern : Any? = null, rate : Any? = null, size : Any? = null, rule : Any? = null, random_fill_ratio : Any? = null, ratio : Any? = null, random_seed : Any? = null, seed : Any? = null, scroll : Any? = null, start_full : Any? = null, full : Any? = null, stitch : Any? = null, f : Any? = null, p : Any? = null, r : Any? = null, s : Any? = null) : cellauto {
    return cellauto(filename, pattern, rate, size, rule, random_fill_ratio, ratio, random_seed, seed, scroll, start_full, full, stitch, f, p, r, s, "", "").apply { setInputs(this@cellauto) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( color )](https://ffmpeg.org/ffmpeg-filters.html#color)

```
Filter color
Provide an uniformly colored input.
Inputs:
none (source filter)
Outputs:
#0: default (video)
color AVOptions:
color             <color>      ..FV.....T set color (default "black")
c                 <color>      ..FV.....T set color (default "black")
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class color(
    val color : Any? = null,
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val c : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [color] を参照してください */
fun String.color(color : Any? = null, size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, c : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : color {
    return color(color, size, rate, duration, sar, c, s, r, d, "", "").apply { setInputs(this@color) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( haldclutsrc )](https://ffmpeg.org/ffmpeg-filters.html#haldclutsrc)

```
Filter haldclutsrc
Provide an identity Hald CLUT.
Inputs:
none (source filter)
Outputs:
#0: default (video)
haldclutsrc AVOptions:
level             <int>        ..FV...... set level (from 2 to 16) (default 6)
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class haldclutsrc(
    val level : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [haldclutsrc] を参照してください */
fun String.haldclutsrc(level : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, r : Any? = null, d : Any? = null) : haldclutsrc {
    return haldclutsrc(level, rate, duration, sar, r, d, "", "").apply { setInputs(this@haldclutsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( life )](https://ffmpeg.org/ffmpeg-filters.html#life)

```
Filter life
Create life.
Inputs:
none (source filter)
Outputs:
#0: default (video)
life AVOptions:
filename          <string>     ..FV...... set source file
f                 <string>     ..FV...... set source file
size              <image_size> ..FV...... set video size
s                 <image_size> ..FV...... set video size
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
rule              <string>     ..FV...... set rule (default "B3/S23")
random_fill_ratio <double>     ..FV...... set fill ratio for filling initial grid randomly (from 0 to 1) (default 0.618034)
ratio             <double>     ..FV...... set fill ratio for filling initial grid randomly (from 0 to 1) (default 0.618034)
random_seed       <int64>      ..FV...... set the seed for filling the initial grid randomly (from -1 to UINT32_MAX) (default -1)
seed              <int64>      ..FV...... set the seed for filling the initial grid randomly (from -1 to UINT32_MAX) (default -1)
stitch            <boolean>    ..FV...... stitch boundaries (default true)
mold              <int>        ..FV...... set mold speed for dead cells (from 0 to 255) (default 0)
life_color        <color>      ..FV...... set life color (default "white")
death_color       <color>      ..FV...... set death color (default "black")
mold_color        <color>      ..FV...... set mold color (default "black")


```
 * */
class life(
    val filename : Any? = null,
    val size : Any? = null,
    val rate : Any? = null,
    val rule : Any? = null,
    val random_fill_ratio : Any? = null,
    val ratio : Any? = null,
    val random_seed : Any? = null,
    val seed : Any? = null,
    val stitch : Any? = null,
    val mold : Any? = null,
    val life_color : Any? = null,
    val death_color : Any? = null,
    val mold_color : Any? = null,
    val f : Any? = null,
    val s : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [life] を参照してください */
fun String.life(filename : Any? = null, size : Any? = null, rate : Any? = null, rule : Any? = null, random_fill_ratio : Any? = null, ratio : Any? = null, random_seed : Any? = null, seed : Any? = null, stitch : Any? = null, mold : Any? = null, life_color : Any? = null, death_color : Any? = null, mold_color : Any? = null, f : Any? = null, s : Any? = null, r : Any? = null) : life {
    return life(filename, size, rate, rule, random_fill_ratio, ratio, random_seed, seed, stitch, mold, life_color, death_color, mold_color, f, s, r, "", "").apply { setInputs(this@life) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mandelbrot )](https://ffmpeg.org/ffmpeg-filters.html#mandelbrot)

```
Filter mandelbrot
Render a Mandelbrot fractal.
Inputs:
none (source filter)
Outputs:
#0: default (video)
mandelbrot AVOptions:
size              <image_size> ..FV...... set frame size (default "640x480")
s                 <image_size> ..FV...... set frame size (default "640x480")
rate              <video_rate> ..FV...... set frame rate (default "25")
r                 <video_rate> ..FV...... set frame rate (default "25")
maxiter           <int>        ..FV...... set max iterations number (from 1 to INT_MAX) (default 7189)
start_x           <double>     ..FV...... set the initial x position (from -100 to 100) (default -0.743644)
start_y           <double>     ..FV...... set the initial y position (from -100 to 100) (default -0.131826)
start_scale       <double>     ..FV...... set the initial scale value (from 0 to FLT_MAX) (default 3)
end_scale         <double>     ..FV...... set the terminal scale value (from 0 to FLT_MAX) (default 0.3)
end_pts           <double>     ..FV...... set the terminal pts value (from 0 to I64_MAX) (default 400)
bailout           <double>     ..FV...... set the bailout value (from 0 to FLT_MAX) (default 10)
morphxf           <double>     ..FV...... set morph x frequency (from -FLT_MAX to FLT_MAX) (default 0.01)
morphyf           <double>     ..FV...... set morph y frequency (from -FLT_MAX to FLT_MAX) (default 0.0123)
morphamp          <double>     ..FV...... set morph amplitude (from -FLT_MAX to FLT_MAX) (default 0)
outer             <int>        ..FV...... set outer coloring mode (from 0 to INT_MAX) (default normalized_iteration_count)
iteration_count 0            ..FV...... set iteration count mode
normalized_iteration_count 1            ..FV...... set normalized iteration count mode
white           2            ..FV...... set white mode
outz            3            ..FV...... set outz mode
inner             <int>        ..FV...... set inner coloring mode (from 0 to INT_MAX) (default mincol)
black           0            ..FV...... set black mode
period          1            ..FV...... set period mode
convergence     2            ..FV...... show time until convergence
mincol          3            ..FV...... color based on point closest to the origin of the iterations


```
 * */
class mandelbrot(
    val size : Any? = null,
    val rate : Any? = null,
    val maxiter : Any? = null,
    val start_x : Any? = null,
    val start_y : Any? = null,
    val start_scale : Any? = null,
    val end_scale : Any? = null,
    val end_pts : Any? = null,
    val bailout : Any? = null,
    val morphxf : Any? = null,
    val morphyf : Any? = null,
    val morphamp : Any? = null,
    val outer : Any? = null,
    val inner : Any? = null,
    val s : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mandelbrot] を参照してください */
fun String.mandelbrot(size : Any? = null, rate : Any? = null, maxiter : Any? = null, start_x : Any? = null, start_y : Any? = null, start_scale : Any? = null, end_scale : Any? = null, end_pts : Any? = null, bailout : Any? = null, morphxf : Any? = null, morphyf : Any? = null, morphamp : Any? = null, outer : Any? = null, inner : Any? = null, s : Any? = null, r : Any? = null) : mandelbrot {
    return mandelbrot(size, rate, maxiter, start_x, start_y, start_scale, end_scale, end_pts, bailout, morphxf, morphyf, morphamp, outer, inner, s, r, "", "").apply { setInputs(this@mandelbrot) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( mptestsrc )](https://ffmpeg.org/ffmpeg-filters.html#mptestsrc)

```
Filter mptestsrc
Generate various test pattern.
Inputs:
none (source filter)
Outputs:
#0: default (video)
mptestsrc AVOptions:
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
test              <int>        ..FV...... set test to perform (from 0 to INT_MAX) (default all)
dc_luma         0            ..FV......
dc_chroma       1            ..FV......
freq_luma       2            ..FV......
freq_chroma     3            ..FV......
amp_luma        4            ..FV......
amp_chroma      5            ..FV......
cbp             6            ..FV......
mv              7            ..FV......
ring1           8            ..FV......
ring2           9            ..FV......
all             10           ..FV......
t                 <int>        ..FV...... set test to perform (from 0 to INT_MAX) (default all)
dc_luma         0            ..FV......
dc_chroma       1            ..FV......
freq_luma       2            ..FV......
freq_chroma     3            ..FV......
amp_luma        4            ..FV......
amp_chroma      5            ..FV......
cbp             6            ..FV......
mv              7            ..FV......
ring1           8            ..FV......
ring2           9            ..FV......
all             10           ..FV......
max_frames        <int64>      ..FV...... Set the maximum number of frames generated for each test (from 1 to I64_MAX) (default 30)
m                 <int64>      ..FV...... Set the maximum number of frames generated for each test (from 1 to I64_MAX) (default 30)


```
 * */
class mptestsrc(
    val rate : Any? = null,
    val duration : Any? = null,
    val test : Any? = null,
    val max_frames : Any? = null,
    val r : Any? = null,
    val d : Any? = null,
    val t : Any? = null,
    val m : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [mptestsrc] を参照してください */
fun String.mptestsrc(rate : Any? = null, duration : Any? = null, test : Any? = null, max_frames : Any? = null, r : Any? = null, d : Any? = null, t : Any? = null, m : Any? = null) : mptestsrc {
    return mptestsrc(rate, duration, test, max_frames, r, d, t, m, "", "").apply { setInputs(this@mptestsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( nullsrc )](https://ffmpeg.org/ffmpeg-filters.html#nullsrc)

```
Filter nullsrc
Null video source, return unprocessed video frames.
Inputs:
none (source filter)
Outputs:
#0: default (video)
nullsrc AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class nullsrc(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [nullsrc] を参照してください */
fun String.nullsrc(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : nullsrc {
    return nullsrc(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@nullsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pal75bars )](https://ffmpeg.org/ffmpeg-filters.html#pal75bars)

```
Filter pal75bars
Generate PAL 75% color bars.
Inputs:
none (source filter)
Outputs:
#0: default (video)
pal75bars AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class pal75bars(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pal75bars] を参照してください */
fun String.pal75bars(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : pal75bars {
    return pal75bars(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@pal75bars) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( pal100bars )](https://ffmpeg.org/ffmpeg-filters.html#pal100bars)

```
Filter pal100bars
Generate PAL 100% color bars.
Inputs:
none (source filter)
Outputs:
#0: default (video)
pal100bars AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class pal100bars(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [pal100bars] を参照してください */
fun String.pal100bars(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : pal100bars {
    return pal100bars(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@pal100bars) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( rgbtestsrc )](https://ffmpeg.org/ffmpeg-filters.html#rgbtestsrc)

```
Filter rgbtestsrc
Generate RGB test pattern.
Inputs:
none (source filter)
Outputs:
#0: default (video)
rgbtestsrc AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class rgbtestsrc(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [rgbtestsrc] を参照してください */
fun String.rgbtestsrc(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : rgbtestsrc {
    return rgbtestsrc(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@rgbtestsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( sierpinski )](https://ffmpeg.org/ffmpeg-filters.html#sierpinski)

```
Filter sierpinski
Render a Sierpinski fractal.
slice threading supported
Inputs:
none (source filter)
Outputs:
#0: default (video)
sierpinski AVOptions:
size              <image_size> ..FV...... set frame size (default "640x480")
s                 <image_size> ..FV...... set frame size (default "640x480")
rate              <video_rate> ..FV...... set frame rate (default "25")
r                 <video_rate> ..FV...... set frame rate (default "25")
seed              <int64>      ..FV...... set the seed (from -1 to UINT32_MAX) (default -1)
jump              <int>        ..FV...... set the jump (from 1 to 10000) (default 100)
type              <int>        ..FV...... set fractal type (from 0 to 1) (default carpet)
carpet          0            ..FV...... sierpinski carpet
triangle        1            ..FV...... sierpinski triangle


```
 * */
class sierpinski(
    val size : Any? = null,
    val rate : Any? = null,
    val seed : Any? = null,
    val jump : Any? = null,
    val type : Any? = null,
    val s : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [sierpinski] を参照してください */
fun String.sierpinski(size : Any? = null, rate : Any? = null, seed : Any? = null, jump : Any? = null, type : Any? = null, s : Any? = null, r : Any? = null) : sierpinski {
    return sierpinski(size, rate, seed, jump, type, s, r, "", "").apply { setInputs(this@sierpinski) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( smptebars )](https://ffmpeg.org/ffmpeg-filters.html#smptebars)

```
Filter smptebars
Generate SMPTE color bars.
Inputs:
none (source filter)
Outputs:
#0: default (video)
smptebars AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class smptebars(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [smptebars] を参照してください */
fun String.smptebars(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : smptebars {
    return smptebars(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@smptebars) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( smptehdbars )](https://ffmpeg.org/ffmpeg-filters.html#smptehdbars)

```
Filter smptehdbars
Generate SMPTE HD color bars.
Inputs:
none (source filter)
Outputs:
#0: default (video)
smptehdbars AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class smptehdbars(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [smptehdbars] を参照してください */
fun String.smptehdbars(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : smptehdbars {
    return smptehdbars(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@smptehdbars) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( testsrc )](https://ffmpeg.org/ffmpeg-filters.html#testsrc)

```
Filter testsrc
Generate test pattern.
Inputs:
none (source filter)
Outputs:
#0: default (video)
testsrc AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)
decimals          <int>        ..FV...... set number of decimals to show (from 0 to 17) (default 0)
n                 <int>        ..FV...... set number of decimals to show (from 0 to 17) (default 0)


```
 * */
class testsrc(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val decimals : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,
    val n : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [testsrc] を参照してください */
fun String.testsrc(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, decimals : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null, n : Any? = null) : testsrc {
    return testsrc(size, rate, duration, sar, decimals, s, r, d, n, "", "").apply { setInputs(this@testsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( testsrc2 )](https://ffmpeg.org/ffmpeg-filters.html#testsrc2)

```
Filter testsrc2
Generate another test pattern.
Inputs:
none (source filter)
Outputs:
#0: default (video)
testsrc2 AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)
alpha             <int>        ..FV...... set global alpha (opacity) (from 0 to 255) (default 255)


```
 * */
class testsrc2(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val alpha : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [testsrc2] を参照してください */
fun String.testsrc2(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, alpha : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : testsrc2 {
    return testsrc2(size, rate, duration, sar, alpha, s, r, d, "", "").apply { setInputs(this@testsrc2) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( yuvtestsrc )](https://ffmpeg.org/ffmpeg-filters.html#yuvtestsrc)

```
Filter yuvtestsrc
Generate YUV test pattern.
Inputs:
none (source filter)
Outputs:
#0: default (video)
yuvtestsrc AVOptions:
size              <image_size> ..FV...... set video size (default "320x240")
s                 <image_size> ..FV...... set video size (default "320x240")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
duration          <duration>   ..FV...... set video duration (default -0.000001)
d                 <duration>   ..FV...... set video duration (default -0.000001)
sar               <rational>   ..FV...... set video sample aspect ratio (from 0 to INT_MAX) (default 1/1)


```
 * */
class yuvtestsrc(
    val size : Any? = null,
    val rate : Any? = null,
    val duration : Any? = null,
    val sar : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val d : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [yuvtestsrc] を参照してください */
fun String.yuvtestsrc(size : Any? = null, rate : Any? = null, duration : Any? = null, sar : Any? = null, s : Any? = null, r : Any? = null, d : Any? = null) : yuvtestsrc {
    return yuvtestsrc(size, rate, duration, sar, s, r, d, "", "").apply { setInputs(this@yuvtestsrc) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( nullsink )](https://ffmpeg.org/ffmpeg-filters.html#nullsink)

```
Filter nullsink
Do absolutely nothing with the input video.
Inputs:
#0: default (video)
Outputs:
none (sink filter)

```
 * */
class nullsink(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [nullsink] を参照してください */
fun String.nullsink() : nullsink {
    return nullsink("", "").apply { setInputs(this@nullsink) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( abitscope )](https://ffmpeg.org/ffmpeg-filters.html#abitscope)

```
Filter abitscope
Convert input audio to audio bit scope video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
abitscope AVOptions:
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
size              <image_size> ..FV...... set video size (default "1024x256")
s                 <image_size> ..FV...... set video size (default "1024x256")
colors            <string>     ..FV...... set channels colors (default "red|green|blue|yellow|orange|lime|pink|magenta|brown")


```
 * */
class abitscope(
    val rate : Any? = null,
    val size : Any? = null,
    val colors : Any? = null,
    val r : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [abitscope] を参照してください */
fun String.abitscope(rate : Any? = null, size : Any? = null, colors : Any? = null, r : Any? = null, s : Any? = null) : abitscope {
    return abitscope(rate, size, colors, r, s, "", "").apply { setInputs(this@abitscope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( adrawgraph )](https://ffmpeg.org/ffmpeg-filters.html#adrawgraph)

```
Filter adrawgraph
Draw a graph using input audio metadata.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
adrawgraph AVOptions:
m1                <string>     ..FV...... set 1st metadata key (default "")
fg1               <string>     ..FV...... set 1st foreground color expression (default "0xffff0000")
m2                <string>     ..FV...... set 2nd metadata key (default "")
fg2               <string>     ..FV...... set 2nd foreground color expression (default "0xff00ff00")
m3                <string>     ..FV...... set 3rd metadata key (default "")
fg3               <string>     ..FV...... set 3rd foreground color expression (default "0xffff00ff")
m4                <string>     ..FV...... set 4th metadata key (default "")
fg4               <string>     ..FV...... set 4th foreground color expression (default "0xffffff00")
bg                <color>      ..FV...... set background color (default "white")
min               <float>      ..FV...... set minimal value (from INT_MIN to INT_MAX) (default -1)
max               <float>      ..FV...... set maximal value (from INT_MIN to INT_MAX) (default 1)
mode              <int>        ..FV...... set graph mode (from 0 to 2) (default line)
bar             0            ..FV...... draw bars
dot             1            ..FV...... draw dots
line            2            ..FV...... draw lines
slide             <int>        ..FV...... set slide mode (from 0 to 4) (default frame)
frame           0            ..FV...... draw new frames
replace         1            ..FV...... replace old columns with new
scroll          2            ..FV...... scroll from right to left
rscroll         3            ..FV...... scroll from left to right
picture         4            ..FV...... display graph in single frame
size              <image_size> ..FV...... set graph size (default "900x256")
s                 <image_size> ..FV...... set graph size (default "900x256")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")


```
 * */
class adrawgraph(
    val m1 : Any? = null,
    val fg1 : Any? = null,
    val m2 : Any? = null,
    val fg2 : Any? = null,
    val m3 : Any? = null,
    val fg3 : Any? = null,
    val m4 : Any? = null,
    val fg4 : Any? = null,
    val bg : Any? = null,
    val min : Any? = null,
    val max : Any? = null,
    val mode : Any? = null,
    val slide : Any? = null,
    val size : Any? = null,
    val rate : Any? = null,
    val s : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [adrawgraph] を参照してください */
fun String.adrawgraph(m1 : Any? = null, fg1 : Any? = null, m2 : Any? = null, fg2 : Any? = null, m3 : Any? = null, fg3 : Any? = null, m4 : Any? = null, fg4 : Any? = null, bg : Any? = null, min : Any? = null, max : Any? = null, mode : Any? = null, slide : Any? = null, size : Any? = null, rate : Any? = null, s : Any? = null, r : Any? = null) : adrawgraph {
    return adrawgraph(m1, fg1, m2, fg2, m3, fg3, m4, fg4, bg, min, max, mode, slide, size, rate, s, r, "", "").apply { setInputs(this@adrawgraph) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( agraphmonitor )](https://ffmpeg.org/ffmpeg-filters.html#agraphmonitor)

```
Filter agraphmonitor
Show various filtergraph stats.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
agraphmonitor AVOptions:
size              <image_size> ..FV...... set monitor size (default "hd720")
s                 <image_size> ..FV...... set monitor size (default "hd720")
opacity           <float>      ..FV...... set video opacity (from 0 to 1) (default 0.9)
o                 <float>      ..FV...... set video opacity (from 0 to 1) (default 0.9)
mode              <int>        ..FV...... set mode (from 0 to 1) (default full)
full            0            ..FV......
compact         1            ..FV......
m                 <int>        ..FV...... set mode (from 0 to 1) (default full)
full            0            ..FV......
compact         1            ..FV......
flags             <flags>      ..FV...... set flags (default queue)
queue                        ..FV......
frame_count_in               ..FV......
frame_count_out              ..FV......
pts                          ..FV......
time                         ..FV......
timebase                     ..FV......
format                       ..FV......
size                         ..FV......
rate                         ..FV......
f                 <flags>      ..FV...... set flags (default queue)
queue                        ..FV......
frame_count_in               ..FV......
frame_count_out              ..FV......
pts                          ..FV......
time                         ..FV......
timebase                     ..FV......
format                       ..FV......
size                         ..FV......
rate                         ..FV......
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")


```
 * */
class agraphmonitor(
    val size : Any? = null,
    val opacity : Any? = null,
    val mode : Any? = null,
    val flags : Any? = null,
    val rate : Any? = null,
    val s : Any? = null,
    val o : Any? = null,
    val m : Any? = null,
    val f : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [agraphmonitor] を参照してください */
fun String.agraphmonitor(size : Any? = null, opacity : Any? = null, mode : Any? = null, flags : Any? = null, rate : Any? = null, s : Any? = null, o : Any? = null, m : Any? = null, f : Any? = null, r : Any? = null) : agraphmonitor {
    return agraphmonitor(size, opacity, mode, flags, rate, s, o, m, f, r, "", "").apply { setInputs(this@agraphmonitor) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( ahistogram )](https://ffmpeg.org/ffmpeg-filters.html#ahistogram)

```
Filter ahistogram
Convert input audio to histogram video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
ahistogram AVOptions:
dmode             <int>        ..FV...... set method to display channels (from 0 to 1) (default single)
single          0            ..FV...... all channels use single histogram
separate        1            ..FV...... each channel have own histogram
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
size              <image_size> ..FV...... set video size (default "hd720")
s                 <image_size> ..FV...... set video size (default "hd720")
scale             <int>        ..FV...... set display scale (from 0 to 4) (default log)
log             3            ..FV...... logarithmic
sqrt            1            ..FV...... square root
cbrt            2            ..FV...... cubic root
lin             0            ..FV...... linear
rlog            4            ..FV...... reverse logarithmic
ascale            <int>        ..FV...... set amplitude scale (from 0 to 1) (default log)
log             1            ..FV...... logarithmic
lin             0            ..FV...... linear
acount            <int>        ..FV...... how much frames to accumulate (from -1 to 100) (default 1)
rheight           <float>      ..FV...... set histogram ratio of window height (from 0 to 1) (default 0.1)
slide             <int>        ..FV...... set sonogram sliding (from 0 to 1) (default replace)
replace         0            ..FV...... replace old rows with new
scroll          1            ..FV...... scroll from top to bottom


```
 * */
class ahistogram(
    val dmode : Any? = null,
    val rate : Any? = null,
    val size : Any? = null,
    val scale : Any? = null,
    val ascale : Any? = null,
    val acount : Any? = null,
    val rheight : Any? = null,
    val slide : Any? = null,
    val r : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [ahistogram] を参照してください */
fun String.ahistogram(dmode : Any? = null, rate : Any? = null, size : Any? = null, scale : Any? = null, ascale : Any? = null, acount : Any? = null, rheight : Any? = null, slide : Any? = null, r : Any? = null, s : Any? = null) : ahistogram {
    return ahistogram(dmode, rate, size, scale, ascale, acount, rheight, slide, r, s, "", "").apply { setInputs(this@ahistogram) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( aphasemeter )](https://ffmpeg.org/ffmpeg-filters.html#aphasemeter)

```
Filter aphasemeter
Convert input audio to phase meter video output.
Inputs:
#0: default (audio)
Outputs:
dynamic (depending on the options)
aphasemeter AVOptions:
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
size              <image_size> ..FV...... set video size (default "800x400")
s                 <image_size> ..FV...... set video size (default "800x400")
rc                <int>        ..FV...... set red contrast (from 0 to 255) (default 2)
gc                <int>        ..FV...... set green contrast (from 0 to 255) (default 7)
bc                <int>        ..FV...... set blue contrast (from 0 to 255) (default 1)
mpc               <string>     ..FV...... set median phase color (default "none")
video             <boolean>    ..FV...... set video output (default true)


```
 * */
class aphasemeter(
    val rate : Any? = null,
    val size : Any? = null,
    val rc : Any? = null,
    val gc : Any? = null,
    val bc : Any? = null,
    val mpc : Any? = null,
    val video : Any? = null,
    val r : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [aphasemeter] を参照してください */
fun String.aphasemeter(rate : Any? = null, size : Any? = null, rc : Any? = null, gc : Any? = null, bc : Any? = null, mpc : Any? = null, video : Any? = null, r : Any? = null, s : Any? = null) : aphasemeter {
    return aphasemeter(rate, size, rc, gc, bc, mpc, video, r, s, "", "").apply { setInputs(this@aphasemeter) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( avectorscope )](https://ffmpeg.org/ffmpeg-filters.html#avectorscope)

```
Filter avectorscope
Convert input audio to vectorscope video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
avectorscope AVOptions:
mode              <int>        ..FV...... set mode (from 0 to 2) (default lissajous)
lissajous       0            ..FV......
lissajous_xy    1            ..FV......
polar           2            ..FV......
m                 <int>        ..FV...... set mode (from 0 to 2) (default lissajous)
lissajous       0            ..FV......
lissajous_xy    1            ..FV......
polar           2            ..FV......
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
size              <image_size> ..FV...... set video size (default "400x400")
s                 <image_size> ..FV...... set video size (default "400x400")
rc                <int>        ..FV...... set red contrast (from 0 to 255) (default 40)
gc                <int>        ..FV...... set green contrast (from 0 to 255) (default 160)
bc                <int>        ..FV...... set blue contrast (from 0 to 255) (default 80)
ac                <int>        ..FV...... set alpha contrast (from 0 to 255) (default 255)
rf                <int>        ..FV...... set red fade (from 0 to 255) (default 15)
gf                <int>        ..FV...... set green fade (from 0 to 255) (default 10)
bf                <int>        ..FV...... set blue fade (from 0 to 255) (default 5)
af                <int>        ..FV...... set alpha fade (from 0 to 255) (default 5)
zoom              <double>     ..FV...... set zoom factor (from 0 to 10) (default 1)
draw              <int>        ..FV...... set draw mode (from 0 to 1) (default dot)
dot             0            ..FV......
line            1            ..FV......
scale             <int>        ..FV...... set amplitude scale mode (from 0 to 3) (default lin)
lin             0            ..FV...... linear
sqrt            1            ..FV...... square root
cbrt            2            ..FV...... cube root
log             3            ..FV...... logarithmic
swap              <boolean>    ..FV...... swap x axis with y axis (default true)
mirror            <int>        ..FV...... mirror axis (from 0 to 3) (default none)
none            0            ..FV...... no mirror
x               1            ..FV...... mirror x
y               2            ..FV...... mirror y
xy              3            ..FV...... mirror both


```
 * */
class avectorscope(
    val mode : Any? = null,
    val rate : Any? = null,
    val size : Any? = null,
    val rc : Any? = null,
    val gc : Any? = null,
    val bc : Any? = null,
    val ac : Any? = null,
    val rf : Any? = null,
    val gf : Any? = null,
    val bf : Any? = null,
    val af : Any? = null,
    val zoom : Any? = null,
    val draw : Any? = null,
    val scale : Any? = null,
    val swap : Any? = null,
    val mirror : Any? = null,
    val m : Any? = null,
    val r : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [avectorscope] を参照してください */
fun String.avectorscope(mode : Any? = null, rate : Any? = null, size : Any? = null, rc : Any? = null, gc : Any? = null, bc : Any? = null, ac : Any? = null, rf : Any? = null, gf : Any? = null, bf : Any? = null, af : Any? = null, zoom : Any? = null, draw : Any? = null, scale : Any? = null, swap : Any? = null, mirror : Any? = null, m : Any? = null, r : Any? = null, s : Any? = null) : avectorscope {
    return avectorscope(mode, rate, size, rc, gc, bc, ac, rf, gf, bf, af, zoom, draw, scale, swap, mirror, m, r, s, "", "").apply { setInputs(this@avectorscope) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( concat )](https://ffmpeg.org/ffmpeg-filters.html#concat)

```
Filter concat
Concatenate audio and video streams.
Inputs:
dynamic (depending on the options)
Outputs:
dynamic (depending on the options)
concat AVOptions:
n                 <int>        ..FVA..... specify the number of segments (from 1 to INT_MAX) (default 2)
v                 <int>        ..FV...... specify the number of video streams (from 0 to INT_MAX) (default 1)
a                 <int>        ..F.A..... specify the number of audio streams (from 0 to INT_MAX) (default 0)
unsafe            <boolean>    ..FVA..... enable unsafe mode (default false)


```
 * */
class concat(
    val n : Any? = null,
    val v : Any? = null,
    val a : Any? = null,
    val unsafe : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [concat] を参照してください */
fun String.concat(n : Any? = null, v : Any? = null, a : Any? = null, unsafe : Any? = null) : concat {
    return concat(n, v, a, unsafe, "", "").apply { setInputs(this@concat) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showcqt )](https://ffmpeg.org/ffmpeg-filters.html#showcqt)

```
Filter showcqt
Convert input audio to a CQT (Constant/Clamped Q Transform) spectrum video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showcqt AVOptions:
size              <image_size> ..FV...... set video size (default "1920x1080")
s                 <image_size> ..FV...... set video size (default "1920x1080")
fps               <video_rate> ..FV...... set video rate (default "25")
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
bar_h             <int>        ..FV...... set bargraph height (from -1 to INT_MAX) (default -1)
axis_h            <int>        ..FV...... set axis height (from -1 to INT_MAX) (default -1)
sono_h            <int>        ..FV...... set sonogram height (from -1 to INT_MAX) (default -1)
fullhd            <boolean>    ..FV...... set fullhd size (default true)
sono_v            <string>     ..FV...... set sonogram volume (default "16")
volume            <string>     ..FV...... set sonogram volume (default "16")
bar_v             <string>     ..FV...... set bargraph volume (default "sono_v")
volume2           <string>     ..FV...... set bargraph volume (default "sono_v")
sono_g            <float>      ..FV...... set sonogram gamma (from 1 to 7) (default 3)
gamma             <float>      ..FV...... set sonogram gamma (from 1 to 7) (default 3)
bar_g             <float>      ..FV...... set bargraph gamma (from 1 to 7) (default 1)
gamma2            <float>      ..FV...... set bargraph gamma (from 1 to 7) (default 1)
bar_t             <float>      ..FV...... set bar transparency (from 0 to 1) (default 1)
timeclamp         <double>     ..FV...... set timeclamp (from 0.002 to 1) (default 0.17)
tc                <double>     ..FV...... set timeclamp (from 0.002 to 1) (default 0.17)
attack            <double>     ..FV...... set attack time (from 0 to 1) (default 0)
basefreq          <double>     ..FV...... set base frequency (from 10 to 100000) (default 20.0152)
endfreq           <double>     ..FV...... set end frequency (from 10 to 100000) (default 20495.6)
coeffclamp        <float>      ..FV...... set coeffclamp (from 0.1 to 10) (default 1)
tlength           <string>     ..FV...... set tlength (default "384*tc/(384+tc*f)")
count             <int>        ..FV...... set transform count (from 1 to 30) (default 6)
fcount            <int>        ..FV...... set frequency count (from 0 to 10) (default 0)
fontfile          <string>     ..FV...... set axis font file
font              <string>     ..FV...... set axis font
fontcolor         <string>     ..FV...... set font color (default "st(0, (midi(f)-59.5)/12);st(1, if(between(ld(0),0,1), 0.5-0.5*cos(2*PI*ld(0)), 0));r(1-ld(1)) + b(ld(1))")
axisfile          <string>     ..FV...... set axis image
axis              <boolean>    ..FV...... draw axis (default true)
text              <boolean>    ..FV...... draw axis (default true)
csp               <int>        ..FV...... set color space (from 0 to INT_MAX) (default unspecified)
unspecified     2            ..FV...... unspecified
bt709           1            ..FV...... bt709
fcc             4            ..FV...... fcc
bt470bg         5            ..FV...... bt470bg
smpte170m       6            ..FV...... smpte170m
smpte240m       7            ..FV...... smpte240m
bt2020ncl       9            ..FV...... bt2020ncl
cscheme           <string>     ..FV...... set color scheme (default "1|0.5|0|0|0.5|1")


```
 * */
class showcqt(
    val size : Any? = null,
    val fps : Any? = null,
    val rate : Any? = null,
    val bar_h : Any? = null,
    val axis_h : Any? = null,
    val sono_h : Any? = null,
    val fullhd : Any? = null,
    val sono_v : Any? = null,
    val volume : Any? = null,
    val bar_v : Any? = null,
    val volume2 : Any? = null,
    val sono_g : Any? = null,
    val gamma : Any? = null,
    val bar_g : Any? = null,
    val gamma2 : Any? = null,
    val bar_t : Any? = null,
    val timeclamp : Any? = null,
    val attack : Any? = null,
    val basefreq : Any? = null,
    val endfreq : Any? = null,
    val coeffclamp : Any? = null,
    val tlength : Any? = null,
    val count : Any? = null,
    val fcount : Any? = null,
    val fontfile : Any? = null,
    val font : Any? = null,
    val fontcolor : Any? = null,
    val axisfile : Any? = null,
    val axis : Any? = null,
    val text : Any? = null,
    val csp : Any? = null,
    val cscheme : Any? = null,
    val s : Any? = null,
    val r : Any? = null,
    val tc : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showcqt] を参照してください */
fun String.showcqt(size : Any? = null, fps : Any? = null, rate : Any? = null, bar_h : Any? = null, axis_h : Any? = null, sono_h : Any? = null, fullhd : Any? = null, sono_v : Any? = null, volume : Any? = null, bar_v : Any? = null, volume2 : Any? = null, sono_g : Any? = null, gamma : Any? = null, bar_g : Any? = null, gamma2 : Any? = null, bar_t : Any? = null, timeclamp : Any? = null, attack : Any? = null, basefreq : Any? = null, endfreq : Any? = null, coeffclamp : Any? = null, tlength : Any? = null, count : Any? = null, fcount : Any? = null, fontfile : Any? = null, font : Any? = null, fontcolor : Any? = null, axisfile : Any? = null, axis : Any? = null, text : Any? = null, csp : Any? = null, cscheme : Any? = null, s : Any? = null, r : Any? = null, tc : Any? = null) : showcqt {
    return showcqt(size, fps, rate, bar_h, axis_h, sono_h, fullhd, sono_v, volume, bar_v, volume2, sono_g, gamma, bar_g, gamma2, bar_t, timeclamp, attack, basefreq, endfreq, coeffclamp, tlength, count, fcount, fontfile, font, fontcolor, axisfile, axis, text, csp, cscheme, s, r, tc, "", "").apply { setInputs(this@showcqt) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showfreqs )](https://ffmpeg.org/ffmpeg-filters.html#showfreqs)

```
Filter showfreqs
Convert input audio to a frequencies video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showfreqs AVOptions:
size              <image_size> ..FV...... set video size (default "1024x512")
s                 <image_size> ..FV...... set video size (default "1024x512")
mode              <int>        ..FV...... set display mode (from 0 to 2) (default bar)
line            0            ..FV...... show lines
bar             1            ..FV...... show bars
dot             2            ..FV...... show dots
ascale            <int>        ..FV...... set amplitude scale (from 0 to 3) (default log)
lin             0            ..FV...... linear
sqrt            1            ..FV...... square root
cbrt            2            ..FV...... cubic root
log             3            ..FV...... logarithmic
fscale            <int>        ..FV...... set frequency scale (from 0 to 2) (default lin)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
rlog            2            ..FV...... reverse logarithmic
win_size          <int>        ..FV...... set window size (from 16 to 65536) (default 2048)
win_func          <int>        ..FV...... set window function (from 0 to 19) (default hanning)
rect            0            ..FV...... Rectangular
bartlett        4            ..FV...... Bartlett
hanning         1            ..FV...... Hanning
hamming         2            ..FV...... Hamming
blackman        3            ..FV...... Blackman
welch           5            ..FV...... Welch
flattop         6            ..FV...... Flat-top
bharris         7            ..FV...... Blackman-Harris
bnuttall        8            ..FV...... Blackman-Nuttall
bhann           11           ..FV...... Bartlett-Hann
sine            9            ..FV...... Sine
nuttall         10           ..FV...... Nuttall
lanczos         12           ..FV...... Lanczos
gauss           13           ..FV...... Gauss
tukey           14           ..FV...... Tukey
dolph           15           ..FV...... Dolph-Chebyshev
cauchy          16           ..FV...... Cauchy
parzen          17           ..FV...... Parzen
poisson         18           ..FV...... Poisson
bohman          19           ..FV...... Bohman
overlap           <float>      ..FV...... set window overlap (from 0 to 1) (default 1)
averaging         <int>        ..FV...... set time averaging (from 0 to INT_MAX) (default 1)
colors            <string>     ..FV...... set channels colors (default "red|green|blue|yellow|orange|lime|pink|magenta|brown")
cmode             <int>        ..FV...... set channel mode (from 0 to 1) (default combined)
combined        0            ..FV...... show all channels in same window
separate        1            ..FV...... show each channel in own window
minamp            <float>      ..FV...... set minimum amplitude (from FLT_MIN to 1e-06) (default 1e-06)


```
 * */
class showfreqs(
    val size : Any? = null,
    val mode : Any? = null,
    val ascale : Any? = null,
    val fscale : Any? = null,
    val win_size : Any? = null,
    val win_func : Any? = null,
    val overlap : Any? = null,
    val averaging : Any? = null,
    val colors : Any? = null,
    val cmode : Any? = null,
    val minamp : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showfreqs] を参照してください */
fun String.showfreqs(size : Any? = null, mode : Any? = null, ascale : Any? = null, fscale : Any? = null, win_size : Any? = null, win_func : Any? = null, overlap : Any? = null, averaging : Any? = null, colors : Any? = null, cmode : Any? = null, minamp : Any? = null, s : Any? = null) : showfreqs {
    return showfreqs(size, mode, ascale, fscale, win_size, win_func, overlap, averaging, colors, cmode, minamp, s, "", "").apply { setInputs(this@showfreqs) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showspatial )](https://ffmpeg.org/ffmpeg-filters.html#showspatial)

```
Filter showspatial
Convert input audio to a spatial video output.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showspatial AVOptions:
size              <image_size> ..FV...... set video size (default "512x512")
s                 <image_size> ..FV...... set video size (default "512x512")
win_size          <int>        ..FV...... set window size (from 1024 to 65536) (default 4096)
win_func          <int>        ..FV...... set window function (from 0 to 19) (default hann)
rect            0            ..FV...... Rectangular
bartlett        4            ..FV...... Bartlett
hann            1            ..FV...... Hann
hanning         1            ..FV...... Hanning
hamming         2            ..FV...... Hamming
blackman        3            ..FV...... Blackman
welch           5            ..FV...... Welch
flattop         6            ..FV...... Flat-top
bharris         7            ..FV...... Blackman-Harris
bnuttall        8            ..FV...... Blackman-Nuttall
bhann           11           ..FV...... Bartlett-Hann
sine            9            ..FV...... Sine
nuttall         10           ..FV...... Nuttall
lanczos         12           ..FV...... Lanczos
gauss           13           ..FV...... Gauss
tukey           14           ..FV...... Tukey
dolph           15           ..FV...... Dolph-Chebyshev
cauchy          16           ..FV...... Cauchy
parzen          17           ..FV...... Parzen
poisson         18           ..FV...... Poisson
bohman          19           ..FV...... Bohman
overlap           <float>      ..FV...... set window overlap (from 0 to 1) (default 0.5)


```
 * */
class showspatial(
    val size : Any? = null,
    val win_size : Any? = null,
    val win_func : Any? = null,
    val overlap : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showspatial] を参照してください */
fun String.showspatial(size : Any? = null, win_size : Any? = null, win_func : Any? = null, overlap : Any? = null, s : Any? = null) : showspatial {
    return showspatial(size, win_size, win_func, overlap, s, "", "").apply { setInputs(this@showspatial) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showspectrum )](https://ffmpeg.org/ffmpeg-filters.html#showspectrum)

```
Filter showspectrum
Convert input audio to a spectrum video output.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showspectrum AVOptions:
size              <image_size> ..FV...... set video size (default "640x512")
s                 <image_size> ..FV...... set video size (default "640x512")
slide             <int>        ..FV...... set sliding mode (from 0 to 3) (default replace)
replace         0            ..FV...... replace old columns with new
scroll          1            ..FV...... scroll from right to left
fullframe       2            ..FV...... return full frames
rscroll         3            ..FV...... scroll from left to right
mode              <int>        ..FV...... set channel display mode (from 0 to 1) (default combined)
combined        0            ..FV...... combined mode
separate        1            ..FV...... separate mode
color             <int>        ..FV...... set channel coloring (from 0 to 14) (default channel)
channel         0            ..FV...... separate color for each channel
intensity       1            ..FV...... intensity based coloring
rainbow         2            ..FV...... rainbow based coloring
moreland        3            ..FV...... moreland based coloring
nebulae         4            ..FV...... nebulae based coloring
fire            5            ..FV...... fire based coloring
fiery           6            ..FV...... fiery based coloring
fruit           7            ..FV...... fruit based coloring
cool            8            ..FV...... cool based coloring
magma           9            ..FV...... magma based coloring
green           10           ..FV...... green based coloring
viridis         11           ..FV...... viridis based coloring
plasma          12           ..FV...... plasma based coloring
cividis         13           ..FV...... cividis based coloring
terrain         14           ..FV...... terrain based coloring
scale             <int>        ..FV...... set display scale (from 0 to 5) (default sqrt)
lin             0            ..FV...... linear
sqrt            1            ..FV...... square root
cbrt            2            ..FV...... cubic root
log             3            ..FV...... logarithmic
4thrt           4            ..FV...... 4th root
5thrt           5            ..FV...... 5th root
fscale            <int>        ..FV...... set frequency scale (from 0 to 1) (default lin)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
saturation        <float>      ..FV...... color saturation multiplier (from -10 to 10) (default 1)
win_func          <int>        ..FV...... set window function (from 0 to 19) (default hann)
rect            0            ..FV...... Rectangular
bartlett        4            ..FV...... Bartlett
hann            1            ..FV...... Hann
hanning         1            ..FV...... Hanning
hamming         2            ..FV...... Hamming
blackman        3            ..FV...... Blackman
welch           5            ..FV...... Welch
flattop         6            ..FV...... Flat-top
bharris         7            ..FV...... Blackman-Harris
bnuttall        8            ..FV...... Blackman-Nuttall
bhann           11           ..FV...... Bartlett-Hann
sine            9            ..FV...... Sine
nuttall         10           ..FV...... Nuttall
lanczos         12           ..FV...... Lanczos
gauss           13           ..FV...... Gauss
tukey           14           ..FV...... Tukey
dolph           15           ..FV...... Dolph-Chebyshev
cauchy          16           ..FV...... Cauchy
parzen          17           ..FV...... Parzen
poisson         18           ..FV...... Poisson
bohman          19           ..FV...... Bohman
orientation       <int>        ..FV...... set orientation (from 0 to 1) (default vertical)
vertical        0            ..FV......
horizontal      1            ..FV......
overlap           <float>      ..FV...... set window overlap (from 0 to 1) (default 0)
gain              <float>      ..FV...... set scale gain (from 0 to 128) (default 1)
data              <int>        ..FV...... set data mode (from 0 to 1) (default magnitude)
magnitude       0            ..FV......
phase           1            ..FV......
rotation          <float>      ..FV...... color rotation (from -1 to 1) (default 0)
start             <int>        ..FV...... start frequency (from 0 to INT_MAX) (default 0)
stop              <int>        ..FV...... stop frequency (from 0 to INT_MAX) (default 0)
fps               <string>     ..FV...... set video rate (default "auto")
legend            <boolean>    ..FV...... draw legend (default false)


```
 * */
class showspectrum(
    val size : Any? = null,
    val slide : Any? = null,
    val mode : Any? = null,
    val color : Any? = null,
    val scale : Any? = null,
    val fscale : Any? = null,
    val saturation : Any? = null,
    val win_func : Any? = null,
    val orientation : Any? = null,
    val overlap : Any? = null,
    val gain : Any? = null,
    val data : Any? = null,
    val rotation : Any? = null,
    val start : Any? = null,
    val stop : Any? = null,
    val fps : Any? = null,
    val legend : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showspectrum] を参照してください */
fun String.showspectrum(size : Any? = null, slide : Any? = null, mode : Any? = null, color : Any? = null, scale : Any? = null, fscale : Any? = null, saturation : Any? = null, win_func : Any? = null, orientation : Any? = null, overlap : Any? = null, gain : Any? = null, data : Any? = null, rotation : Any? = null, start : Any? = null, stop : Any? = null, fps : Any? = null, legend : Any? = null, s : Any? = null) : showspectrum {
    return showspectrum(size, slide, mode, color, scale, fscale, saturation, win_func, orientation, overlap, gain, data, rotation, start, stop, fps, legend, s, "", "").apply { setInputs(this@showspectrum) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showspectrumpic )](https://ffmpeg.org/ffmpeg-filters.html#showspectrumpic)

```
Filter showspectrumpic
Convert input audio to a spectrum video output single picture.
slice threading supported
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showspectrumpic AVOptions:
size              <image_size> ..FV...... set video size (default "4096x2048")
s                 <image_size> ..FV...... set video size (default "4096x2048")
mode              <int>        ..FV...... set channel display mode (from 0 to 1) (default combined)
combined        0            ..FV...... combined mode
separate        1            ..FV...... separate mode
color             <int>        ..FV...... set channel coloring (from 0 to 14) (default intensity)
channel         0            ..FV...... separate color for each channel
intensity       1            ..FV...... intensity based coloring
rainbow         2            ..FV...... rainbow based coloring
moreland        3            ..FV...... moreland based coloring
nebulae         4            ..FV...... nebulae based coloring
fire            5            ..FV...... fire based coloring
fiery           6            ..FV...... fiery based coloring
fruit           7            ..FV...... fruit based coloring
cool            8            ..FV...... cool based coloring
magma           9            ..FV...... magma based coloring
green           10           ..FV...... green based coloring
viridis         11           ..FV...... viridis based coloring
plasma          12           ..FV...... plasma based coloring
cividis         13           ..FV...... cividis based coloring
terrain         14           ..FV...... terrain based coloring
scale             <int>        ..FV...... set display scale (from 0 to 5) (default log)
lin             0            ..FV...... linear
sqrt            1            ..FV...... square root
cbrt            2            ..FV...... cubic root
log             3            ..FV...... logarithmic
4thrt           4            ..FV...... 4th root
5thrt           5            ..FV...... 5th root
fscale            <int>        ..FV...... set frequency scale (from 0 to 1) (default lin)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
saturation        <float>      ..FV...... color saturation multiplier (from -10 to 10) (default 1)
win_func          <int>        ..FV...... set window function (from 0 to 19) (default hann)
rect            0            ..FV...... Rectangular
bartlett        4            ..FV...... Bartlett
hann            1            ..FV...... Hann
hanning         1            ..FV...... Hanning
hamming         2            ..FV...... Hamming
blackman        3            ..FV...... Blackman
welch           5            ..FV...... Welch
flattop         6            ..FV...... Flat-top
bharris         7            ..FV...... Blackman-Harris
bnuttall        8            ..FV...... Blackman-Nuttall
bhann           11           ..FV...... Bartlett-Hann
sine            9            ..FV...... Sine
nuttall         10           ..FV...... Nuttall
lanczos         12           ..FV...... Lanczos
gauss           13           ..FV...... Gauss
tukey           14           ..FV...... Tukey
dolph           15           ..FV...... Dolph-Chebyshev
cauchy          16           ..FV...... Cauchy
parzen          17           ..FV...... Parzen
poisson         18           ..FV...... Poisson
bohman          19           ..FV...... Bohman
orientation       <int>        ..FV...... set orientation (from 0 to 1) (default vertical)
vertical        0            ..FV......
horizontal      1            ..FV......
gain              <float>      ..FV...... set scale gain (from 0 to 128) (default 1)
legend            <boolean>    ..FV...... draw legend (default true)
rotation          <float>      ..FV...... color rotation (from -1 to 1) (default 0)
start             <int>        ..FV...... start frequency (from 0 to INT_MAX) (default 0)
stop              <int>        ..FV...... stop frequency (from 0 to INT_MAX) (default 0)


```
 * */
class showspectrumpic(
    val size : Any? = null,
    val mode : Any? = null,
    val color : Any? = null,
    val scale : Any? = null,
    val fscale : Any? = null,
    val saturation : Any? = null,
    val win_func : Any? = null,
    val orientation : Any? = null,
    val gain : Any? = null,
    val legend : Any? = null,
    val rotation : Any? = null,
    val start : Any? = null,
    val stop : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showspectrumpic] を参照してください */
fun String.showspectrumpic(size : Any? = null, mode : Any? = null, color : Any? = null, scale : Any? = null, fscale : Any? = null, saturation : Any? = null, win_func : Any? = null, orientation : Any? = null, gain : Any? = null, legend : Any? = null, rotation : Any? = null, start : Any? = null, stop : Any? = null, s : Any? = null) : showspectrumpic {
    return showspectrumpic(size, mode, color, scale, fscale, saturation, win_func, orientation, gain, legend, rotation, start, stop, s, "", "").apply { setInputs(this@showspectrumpic) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showvolume )](https://ffmpeg.org/ffmpeg-filters.html#showvolume)

```
Filter showvolume
Convert input audio volume to video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showvolume AVOptions:
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
b                 <int>        ..FV...... set border width (from 0 to 5) (default 1)
w                 <int>        ..FV...... set channel width (from 80 to 8192) (default 400)
h                 <int>        ..FV...... set channel height (from 1 to 900) (default 20)
f                 <double>     ..FV...... set fade (from 0 to 1) (default 0.95)
c                 <string>     ..FV...... set volume color expression (default "PEAK*255+floor((1-PEAK)*255)*256+0xff000000")
t                 <boolean>    ..FV...... display channel names (default true)
v                 <boolean>    ..FV...... display volume value (default true)
dm                <double>     ..FV...... duration for max value display (from 0 to 9000) (default 0)
dmc               <color>      ..FV...... set color of the max value line (default "orange")
o                 <int>        ..FV...... set orientation (from 0 to 1) (default h)
h               0            ..FV...... horizontal
v               1            ..FV...... vertical
s                 <int>        ..FV...... set step size (from 0 to 5) (default 0)
p                 <float>      ..FV...... set background opacity (from 0 to 1) (default 0)
m                 <int>        ..FV...... set mode (from 0 to 1) (default p)
p               0            ..FV...... peak
r               1            ..FV...... rms
ds                <int>        ..FV...... set display scale (from 0 to 1) (default lin)
lin             0            ..FV...... linear
log             1            ..FV...... log


```
 * */
class showvolume(
    val rate : Any? = null,
    val b : Any? = null,
    val w : Any? = null,
    val h : Any? = null,
    val f : Any? = null,
    val c : Any? = null,
    val t : Any? = null,
    val v : Any? = null,
    val dm : Any? = null,
    val dmc : Any? = null,
    val o : Any? = null,
    val s : Any? = null,
    val p : Any? = null,
    val m : Any? = null,
    val ds : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showvolume] を参照してください */
fun String.showvolume(rate : Any? = null, b : Any? = null, w : Any? = null, h : Any? = null, f : Any? = null, c : Any? = null, t : Any? = null, v : Any? = null, dm : Any? = null, dmc : Any? = null, o : Any? = null, s : Any? = null, p : Any? = null, m : Any? = null, ds : Any? = null, r : Any? = null) : showvolume {
    return showvolume(rate, b, w, h, f, c, t, v, dm, dmc, o, s, p, m, ds, r, "", "").apply { setInputs(this@showvolume) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showwaves )](https://ffmpeg.org/ffmpeg-filters.html#showwaves)

```
Filter showwaves
Convert input audio to a video output.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showwaves AVOptions:
size              <image_size> ..FV...... set video size (default "600x240")
s                 <image_size> ..FV...... set video size (default "600x240")
mode              <int>        ..FV...... select display mode (from 0 to 3) (default point)
point           0            ..FV...... draw a point for each sample
line            1            ..FV...... draw a line for each sample
p2p             2            ..FV...... draw a line between samples
cline           3            ..FV...... draw a centered line for each sample
n                 <int>        ..FV...... set how many samples to show in the same point (from 0 to INT_MAX) (default 0)
rate              <video_rate> ..FV...... set video rate (default "25")
r                 <video_rate> ..FV...... set video rate (default "25")
split_channels    <boolean>    ..FV...... draw channels separately (default false)
colors            <string>     ..FV...... set channels colors (default "red|green|blue|yellow|orange|lime|pink|magenta|brown")
scale             <int>        ..FV...... set amplitude scale (from 0 to 3) (default lin)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
sqrt            2            ..FV...... square root
cbrt            3            ..FV...... cubic root
draw              <int>        ..FV...... set draw mode (from 0 to 1) (default scale)
scale           0            ..FV...... scale pixel values for each drawn sample
full            1            ..FV...... draw every pixel for sample directly


```
 * */
class showwaves(
    val size : Any? = null,
    val mode : Any? = null,
    val n : Any? = null,
    val rate : Any? = null,
    val split_channels : Any? = null,
    val colors : Any? = null,
    val scale : Any? = null,
    val draw : Any? = null,
    val s : Any? = null,
    val r : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showwaves] を参照してください */
fun String.showwaves(size : Any? = null, mode : Any? = null, n : Any? = null, rate : Any? = null, split_channels : Any? = null, colors : Any? = null, scale : Any? = null, draw : Any? = null, s : Any? = null, r : Any? = null) : showwaves {
    return showwaves(size, mode, n, rate, split_channels, colors, scale, draw, s, r, "", "").apply { setInputs(this@showwaves) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( showwavespic )](https://ffmpeg.org/ffmpeg-filters.html#showwavespic)

```
Filter showwavespic
Convert input audio to a video output single picture.
Inputs:
#0: default (audio)
Outputs:
#0: default (video)
showwavespic AVOptions:
size              <image_size> ..FV...... set video size (default "600x240")
s                 <image_size> ..FV...... set video size (default "600x240")
split_channels    <boolean>    ..FV...... draw channels separately (default false)
colors            <string>     ..FV...... set channels colors (default "red|green|blue|yellow|orange|lime|pink|magenta|brown")
scale             <int>        ..FV...... set amplitude scale (from 0 to 3) (default lin)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
sqrt            2            ..FV...... square root
cbrt            3            ..FV...... cubic root
draw              <int>        ..FV...... set draw mode (from 0 to 1) (default scale)
scale           0            ..FV...... scale pixel values for each drawn sample
full            1            ..FV...... draw every pixel for sample directly


```
 * */
class showwavespic(
    val size : Any? = null,
    val split_channels : Any? = null,
    val colors : Any? = null,
    val scale : Any? = null,
    val draw : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [showwavespic] を参照してください */
fun String.showwavespic(size : Any? = null, split_channels : Any? = null, colors : Any? = null, scale : Any? = null, draw : Any? = null, s : Any? = null) : showwavespic {
    return showwavespic(size, split_channels, colors, scale, draw, s, "", "").apply { setInputs(this@showwavespic) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( spectrumsynth )](https://ffmpeg.org/ffmpeg-filters.html#spectrumsynth)

```
Filter spectrumsynth
Convert input spectrum videos to audio output.
Inputs:
#0: magnitude (video)
#1: phase (video)
Outputs:
#0: default (audio)
spectrumsynth AVOptions:
sample_rate       <int>        ..F.A..... set sample rate (from 15 to INT_MAX) (default 44100)
channels          <int>        ..F.A..... set channels (from 1 to 8) (default 1)
scale             <int>        ..FV...... set input amplitude scale (from 0 to 1) (default log)
lin             0            ..FV...... linear
log             1            ..FV...... logarithmic
slide             <int>        ..FV...... set input sliding mode (from 0 to 3) (default fullframe)
replace         0            ..FV...... consume old columns with new
scroll          1            ..FV...... consume only most right column
fullframe       2            ..FV...... consume full frames
rscroll         3            ..FV...... consume only most left column
win_func          <int>        ..F.A..... set window function (from 0 to 19) (default rect)
rect            0            ..F.A..... Rectangular
bartlett        4            ..F.A..... Bartlett
hann            1            ..F.A..... Hann
hanning         1            ..F.A..... Hanning
hamming         2            ..F.A..... Hamming
sine            9            ..F.A..... Sine
overlap           <float>      ..F.A..... set window overlap (from 0 to 1) (default 1)
orientation       <int>        ..FV...... set orientation (from 0 to 1) (default vertical)
vertical        0            ..FV......
horizontal      1            ..FV......


```
 * */
class spectrumsynth(
    val sample_rate : Any? = null,
    val channels : Any? = null,
    val scale : Any? = null,
    val slide : Any? = null,
    val win_func : Any? = null,
    val overlap : Any? = null,
    val orientation : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [spectrumsynth] を参照してください */
fun String.spectrumsynth(sample_rate : Any? = null, channels : Any? = null, scale : Any? = null, slide : Any? = null, win_func : Any? = null, overlap : Any? = null, orientation : Any? = null) : spectrumsynth {
    return spectrumsynth(sample_rate, channels, scale, slide, win_func, overlap, orientation, "", "").apply { setInputs(this@spectrumsynth) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( amovie )](https://ffmpeg.org/ffmpeg-filters.html#amovie)

```
Filter amovie
Read audio from a movie source.
Inputs:
none (source filter)
Outputs:
dynamic (depending on the options)
amovie AVOptions:
filename          <string>     ..FVA.....
format_name       <string>     ..FVA..... set format name
f                 <string>     ..FVA..... set format name
stream_index      <int>        ..FVA..... set stream index (from -1 to INT_MAX) (default -1)
si                <int>        ..FVA..... set stream index (from -1 to INT_MAX) (default -1)
seek_point        <double>     ..FVA..... set seekpoint (seconds) (from 0 to 9.22337e+12) (default 0)
sp                <double>     ..FVA..... set seekpoint (seconds) (from 0 to 9.22337e+12) (default 0)
streams           <string>     ..FVA..... set streams
s                 <string>     ..FVA..... set streams
loop              <int>        ..FVA..... set loop count (from 0 to INT_MAX) (default 1)
discontinuity     <duration>   ..FVA..... set discontinuity threshold (default 0)


```
 * */
class amovie(
    val filename : Any? = null,
    val format_name : Any? = null,
    val stream_index : Any? = null,
    val seek_point : Any? = null,
    val streams : Any? = null,
    val loop : Any? = null,
    val discontinuity : Any? = null,
    val f : Any? = null,
    val si : Any? = null,
    val sp : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [amovie] を参照してください */
fun String.amovie(filename : Any? = null, format_name : Any? = null, stream_index : Any? = null, seek_point : Any? = null, streams : Any? = null, loop : Any? = null, discontinuity : Any? = null, f : Any? = null, si : Any? = null, sp : Any? = null, s : Any? = null) : amovie {
    return amovie(filename, format_name, stream_index, seek_point, streams, loop, discontinuity, f, si, sp, s, "", "").apply { setInputs(this@amovie) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( movie )](https://ffmpeg.org/ffmpeg-filters.html#movie)

```
Filter movie
Read from a movie source.
Inputs:
none (source filter)
Outputs:
dynamic (depending on the options)
movie AVOptions:
filename          <string>     ..FVA.....
format_name       <string>     ..FVA..... set format name
f                 <string>     ..FVA..... set format name
stream_index      <int>        ..FVA..... set stream index (from -1 to INT_MAX) (default -1)
si                <int>        ..FVA..... set stream index (from -1 to INT_MAX) (default -1)
seek_point        <double>     ..FVA..... set seekpoint (seconds) (from 0 to 9.22337e+12) (default 0)
sp                <double>     ..FVA..... set seekpoint (seconds) (from 0 to 9.22337e+12) (default 0)
streams           <string>     ..FVA..... set streams
s                 <string>     ..FVA..... set streams
loop              <int>        ..FVA..... set loop count (from 0 to INT_MAX) (default 1)
discontinuity     <duration>   ..FVA..... set discontinuity threshold (default 0)


```
 * */
class movie(
    val filename : Any? = null,
    val format_name : Any? = null,
    val stream_index : Any? = null,
    val seek_point : Any? = null,
    val streams : Any? = null,
    val loop : Any? = null,
    val discontinuity : Any? = null,
    val f : Any? = null,
    val si : Any? = null,
    val sp : Any? = null,
    val s : Any? = null,

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [movie] を参照してください */
fun String.movie(filename : Any? = null, format_name : Any? = null, stream_index : Any? = null, seek_point : Any? = null, streams : Any? = null, loop : Any? = null, discontinuity : Any? = null, f : Any? = null, si : Any? = null, sp : Any? = null, s : Any? = null) : movie {
    return movie(filename, format_name, stream_index, seek_point, streams, loop, discontinuity, f, si, sp, s, "", "").apply { setInputs(this@movie) }
}


/**
 *
 *
 *

---------- Official Document ----------

[Document ( afifo )](https://ffmpeg.org/ffmpeg-filters.html#afifo)

```
Filter afifo
Buffer input frames and send them when they are requested.
Inputs:
#0: default (audio)
Outputs:
#0: default (audio)

```
 * */
class afifo(

    inLabels : String = "",
    outLabels : String = ""
) : FilterImpl(inLabels, outLabels)

/** [afifo] を参照してください */
fun String.afifo() : afifo {
    return afifo("", "").apply { setInputs(this@afifo) }
}
