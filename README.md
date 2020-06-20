
# kwffmpeg  
  
FFmpeg を Kotlin で扱うためのラッパー

# Install

## Gradle 形式

リポジトリに下記のURLを追加する

```kotlin.gradle
repositories {
    maven { url 'https://github.com/TS-SARUTAHIKO/FFmpegAttr/raw/master/repository/' }
}
```

依存に下記を追加する

```kotlin.gradle
dependencies {
    implementation 'com.xxxsarutahikoxxx.kotlin:FFmpegAttr:1.0.0'
}
```


# How to use  
  
### FFmpeg 形式で実行する  
  
引数をコマンドライン形式で実行する  
  
```kotlin.kt  
 FFmpeg.command("-y -i input.mp3 output.wav")
```

### ファイルを変換する  
  
```kotlin.kt  
 FFmpeg.convert(File("input.mp3"), File("output.wav"))
```
  
### ファイル情報を取得する

```kotlin.kt
    val info = FFmpeg.ffprobe(File("input.mp3"))
```
  
## 属性（Attributes）を用いて実行する

### 概要

`FFmpeg` のオプションには幾つかの種類がある

（一般設定用、入力ファイル用、出力ファイル用、映像ファイル用、音声ファイル用、字幕ファイル用、etc）

一つのファイルに対応するオプション（若しくは一般設定オプション）を一つのまとまりとして`Attributes`として扱う<br>
（`Attributes`には音声ファイル用の`AudioAttributes`、映像ファイル用の`VideoAttributes`などがある）

`Attributes`には `出力用 or 入力用` `音声用 or 映像用` などの用途に応じた多くのサブクラスが存在する<br>
サブクラスにはサブクラス専用の属性を設定したり参照したりするための多くの属性関数がある<br>
（`ss属性`を設定or参照する`ss`関数など）

作成した属性（`Attributes`）とファイルのセット（Map<Attributes, File>）を引数として`FFmpeg`を実行する方法を以下で説明する


### 属性

```kotlin.kt
    FFmpeg.ffmpeg(
        gAttr { 
            y = true
        },
        mapOf(
            aiAttr { t = "20" } to File("input_1.mp3"),

            aoAttr { ss =  "0" ; t = "5" } to File("output_1.mp3"),
            aoAttr { ss = "10" ; t = "5" } to File("output_2.mp3") 
        )
    )
    
    // 最終的に実行されるFFmpegコマンドは以下になる
    // FFmpeg -y -t 20 -i input_1.mp3 -ss 0 -t 5 output_1.mp3 -ss 10 -t 5 output_2.mp3 
```

一般設定の属性は`GenericAttributes`であり、`gAttr{ }`によって作成と編集を行う<br>
つまり下記は`y`属性を`true`に設定する（真偽型である`y`オプションを設定する）ことを意味する

```kotlin.kt
gAttr{ y = true }
```

音声入力ファイル用の属性は`AudioInputAttributes`であり、`aiAttr{ }`によって作成と編集を行う<br>
この属性とセットになったファイルは入力ファイルとして扱われる

つまり下記は`input_1.mp3`を音声ファイルとして取り込むことを意味する<br>
そして属性として `t = "20"` がセットされる

```kotlin.kt
aiAttr { t = "20" } to File("input_1.mp3")
```

音声出力ファイル用の属性は`AudioOutputAttributes`であり、`aoAttr{ }`によって作成と編集を行う<br>
この属性とセットになったファイルは出力ファイルとして扱われる

つまり下記は`output_1.mp3`に音声ファイルを出力することを意味する<br>
そして出力の際は `ss = "0"` `t = "5"`が用いられる

```kotlin.kt
aoAttr { ss = "0" ; t = "5" } to File("input_1.mp3")
```

### 属性ファクトリー関数

各用途に応じた属性を作成・編集するためのファクトリ関数を以下に示す

|  関数 |  対象クラス  | 解説 |
| ---- | ---- | ---- |
|  iAttr { }  |  InputAttributes  | 入力ファイル用属性<br> [Main Option](https://ffmpeg.org/ffmpeg.html#Main-options)を対象とした属性関数の中で`input`なものを呼び出せる<br>Audio専用, Video専用などの属性関数を呼び出すためには`aiAttr{ }`,`viAttr{ }`などを用いる |
|  oAttr { }  |  OutputAttributes  | 出力ファイル用属性<br> [Main Option](https://ffmpeg.org/ffmpeg.html#Main-options)を対象とした属性関数の中で`output`なものを呼び出せる<br>Audio専用, Video専用などの属性関数を呼び出すためには`aoAttr{ }`,`voAttr{ }`などを用いる |
|  gAttr { }  |  GenericAttributes  | 一般設定用属性<br> [Generic Option](https://ffmpeg.org/ffmpeg.html#Generic-options)を対象とした関数を呼び出せる <br>Main Option, Audio専用, Video専用, Subtitle専用などの属性関数は`Global`なものだけを呼び出せる |
|  |  |  |
|  aiAttr { }  | AudioInputAttributes | 音声入力ファイル用属性<br> `iAttr{ }` に加えて`AudioInputAttributes`用の属性関数を呼び出せる |
|  aoAttr { }  | AudioOutputAttributes | 音声出力ファイル用属性<br> `oAttr{ }` に加えて`AudioOutputAttributes`用の属性関数を呼び出せる |
|  viAttr { }  | VideoInputAttributes | 映像入力ファイル用属性<br> `iAttr{ }` に加えて`VideoInputAttributes`用の属性関数を呼び出せる |
|  voAttr { }  | VideoOutputAttributes | 映像出力ファイル用属性<br> `oAttr{ }` に加えて`VideoOutputAttributes`用の属性関数を呼び出せる |
|  siAttr { }  | SubtitleInputAttributes | 字幕入力ファイル用属性<br> `iAttr{ }` に加えて`SubtitleInputAttributes`用の属性関数を呼び出せる |
|  soAttr { }  | SubtitleOutputAttributes | 字幕出力ファイル用属性<br> `oAttr{ }` に加えて`SubtitleOutputAttributes`用の属性関数を呼び出せる |
|  |  |  |


### 属性関数を用いない属性の設定

以下の表記で属性関数を用いないで属性を設定できる<br>

一部の関連処理などが行われないため注意が必要<br>
（真偽型の値を設定した場合に `key` `nokey` の値が自動的に設定・除去される処理など）

```kotlin.kt
aAttr{
    "t".."10"
}
```


### 真偽型の属性

FFmpeg のオプションには引数を取らない真偽型のオプションがある

真偽型のオプションは引数を取らないが状態は`true` / `false`の2通りを取る<br>
`key`オプションを引数にFFmpegが起動されると`key`が`true`と扱われる<br>
`nokey`オプションを引数にFFmpegが起動されると`key`が`false`と扱われる

真偽型のオプションを`Attributes`設定するには属性関数に`true`を設定する<br>
`true`を設定されると対応する`nokey`属性は自動的に除去される

真偽型のオプションに`false`を設定すると`key`属性は除去される<br>
対応する`nokey`属性が設定される`

真偽型のオプションに`null`を設定すると`key` `nokey`の両方の属性が除去される<br>
結果的にFFmpegの実行プロセスは属性に設定された自身のデフォルト値を使用する

```kotlin.kt
gAttr{
    y = true  // y を設定する。 noy は除去される
    y = false  // y を除去する。 noy が設定される
    y = null  // y noy の両方を除去する
}
```


## フィルター

フィルターを用いる方法は2通りあります<br>
一つは文字列で直接使用する方法、一つはクラスと関数を用いる方法です<br>
どちらの方法を用いても属性は最終的に文字列として値を保持します


### 文字列でフィルターを設定する

```kotlin.kt
oAttr {
    filter = "afade=t=in:st=0:d=2"
}
```

### クラスと関数でフィルターを設定する

フィルターを設定する関数は`filter_{ }`（※末尾にアンダーバー）です<br>
関数の返り値がフィルターとして設定されます

`filter_complex`, `af`, `vf` などは同様に末尾にアンダーバーを足したフィルター関数で設定します

```kotlin.kt
oAttr {
    filter_{ fade(t="in", st=9, d=2) }
}
```

### 入力・出力ラベル

入力ラベルはフィルターのコンストラクタで`inLabels`、`outLabels`に設定したものが用いられます<br>

複数の入力・出力ラベルを用いる場合は　`,`　`[` `]`　などで区切って設定してください

下記では両方とも`overlay`フィルターに入力ラベル`[main][overlay]`、出力ラベル`[out]`が設定されます

```kotlin.kt
oAttr {
    filter_complex_{ overlay(inLabels = "main, overlay", outLabels = "out") }
}

oAttr {
    filter_complex_{ overlay(inLabels = "[main][overlay]", outLabels = "[out]") }
}
```

以下の表記の拡張関数・invokeオペレーターを用いた方法でも設定できます

```kotlin.kt
oAttr {
    filter_complex_{ "main, overlay".overlay()("out") }
}
```

### フィルターの結合

フィルターをチェイン結合する場合は`chain`オペレーターを使います

```kotlin.kt
oAttr {
    filter_complex_{ filter1 chain filter2 }
}
```

フィルターをグラフ結合する場合は`graph`オペレーターを使います

```kotlin.kt
oAttr {
    filter_complex_{ filter2 graph filter3 }
}
```

結合関数は連続して用いることができます

```kotlin.kt
oAttr {
    filter_complex_{ filter1 chain filter2 graph filter3 }
}
```
