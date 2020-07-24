private object LibraryVersion {
    const val GIRAFFE_PLAYER = "0.1.25-lazyLoad"
    const val APP_COMPAT = "1.1.0"
    const val CORE_KTX = "1.3.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val MATERIAL = "1.2.0-beta01"
    const val PREFERENCES = "1.1.1"
    const val ROOM = "2.2.5"
    const val LIFECYCLE = "2.2.0"
    const val PAGING = "2.1.2"
    const val RETROFIT = "2.9.0"
    const val OKHTTP = "4.7.2"
    const val GSON_CONVERTER = "2.7.0"
    const val COROUTINES_ADAPTER = "0.9.2"
    const val TOASTY = "1.4.2"
    const val GSON = "2.8.6"
    const val SWIPE_REFRESH = "1.1.0"
    const val BROWSER = "1.2.0"
    const val FB_SHIMMER = "0.5.0"
    const val ASYNC_AWAIT = "1.0.0"
    const val GLIDE = "4.11.0"
    const val RXJAVA = "2.2.10"
    const val RXANDROID = "2.1.1"
    const val RXBINDING = "2.0.0"
    const val BLURRY = "3.0.0"
    const val JSOUP = "1.12.1"
    const val YOUTUBE_PLAYER = "10.0.5"
    const val TORRENT = "2.5.0"
    const val CAFEBAR = "1.3.1"
    const val LOCALBROADCAST = "1.0.0"
    const val PHOTOVIEW = "2.0.0"
    const val CARDVIEW = "1.0.0"
    const val HILT_VIEWMODEL = "1.0.0-alpha01"
}

object LibraryDependency {
    const val HILT_VIEWODEL_COMPILER = "androidx.hilt:hilt-compiler:${LibraryVersion.HILT_VIEWMODEL}"
    const val HILT_VIEWODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${LibraryVersion.HILT_VIEWMODEL}"
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${CoreVersion.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${CoreVersion.HILT}"
    const val CARDVIEW = "androidx.cardview:cardview:${LibraryVersion.CARDVIEW}"
    const val PHOTOVIEW = "com.github.chrisbanes:PhotoView:${LibraryVersion.PHOTOVIEW}"
    const val LOCALBROADCAST_MANAGER = "androidx.localbroadcastmanager:localbroadcastmanager:${LibraryVersion.LOCALBROADCAST}"
    const val CAFEBAR = "com.github.danimahardhika:cafebar:${LibraryVersion.CAFEBAR}"
    const val TORRENT_STREAM_ANDROID = "com.github.TorrentStream:TorrentStream-Android:${LibraryVersion.TORRENT}"
    const val YOUTUBE_PLAYER = "com.pierfrancescosoffritti.androidyoutubeplayer:core:${LibraryVersion.YOUTUBE_PLAYER}"
    const val JSOUP = "org.jsoup:jsoup:${LibraryVersion.JSOUP}"
    const val BLURRY = "jp.wasabeef:blurry:${LibraryVersion.BLURRY}"
    const val RXANDROID = "io.reactivex.rxjava2:rxandroid:${LibraryVersion.RXANDROID}"
    const val RXJAVA = "io.reactivex.rxjava2:rxjava:${LibraryVersion.RXJAVA}"
    const val RXBINDING = "com.jakewharton.rxbinding2:rxbinding:${LibraryVersion.RXBINDING}"
    const val GLIDE = "com.github.bumptech.glide:glide:${LibraryVersion.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${LibraryVersion.GLIDE}"
    const val ASYNC_AWAIT = "co.metalab.asyncawait:asyncawait:${LibraryVersion.ASYNC_AWAIT}"
    const val FB_SHIMMER = "com.facebook.shimmer:shimmer:${LibraryVersion.FB_SHIMMER}"
    const val ANDROID_BROWSER = "androidx.browser:browser:${LibraryVersion.BROWSER}"
    const val SWIPE_REFRESH_LAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:${LibraryVersion.SWIPE_REFRESH}"
    const val TOASTY = "com.github.GrenderG:Toasty:${LibraryVersion.TOASTY}"
    const val GSON = "com.google.code.gson:gson:${LibraryVersion.GSON}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibraryVersion.RETROFIT}"
    const val RETROFIT_GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${LibraryVersion.GSON_CONVERTER}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${LibraryVersion.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${LibraryVersion.OKHTTP}"
    const val RETROFIT_COROUTINES_ADAPTER = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${LibraryVersion.COROUTINES_ADAPTER}"
    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${CoreVersion.ANDROID_COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${CoreVersion.ANDROID_COROUTINES}"
    const val PAGING = "androidx.paging:paging-runtime-ktx:${LibraryVersion.PAGING}"
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${LibraryVersion.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.LIFECYCLE}"
    const val LIFECYCLE_COMMON = "androidx.lifecycle:lifecycle-common-java8:${LibraryVersion.LIFECYCLE}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${LibraryVersion.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${LibraryVersion.ROOM}"
    const val ROOM_COMPILER_KAPT = "androidx.room:room-compiler:${LibraryVersion.ROOM}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${CoreVersion.JETPACK_NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${CoreVersion.JETPACK_NAVIGATION}"
    const val ANDROIDX_PREFERENCES = "androidx.preference:preference:${LibraryVersion.PREFERENCES}"
    const val MATERIAL = "com.google.android.material:material:${LibraryVersion.MATERIAL}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${LibraryVersion.CONSTRAINT_LAYOUT}"
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersion.KOTLIN}"
    const val CORE_KTX = "androidx.core:core-ktx:${LibraryVersion.CORE_KTX}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${LibraryVersion.APP_COMPAT}"
    const val GIRAFFE_PLAYER2 = "com.github.tcking:giraffeplayer2:${LibraryVersion.GIRAFFE_PLAYER}"
}