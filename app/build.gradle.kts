plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.xaviermaximin.simplemedia3"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.xaviermaximin.simplemedia3"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)


    // Media3 Version Catalog References
    val media3_version = "1.11.1"

    // For media playback using ExoPlayer
    implementation(libs.androidx.media3.exoplayer.asProvider())

    // For DASH playback support with ExoPlayer
    implementation(libs.androidx.media3.exoplayer.dash)
    // For HLS playback support with ExoPlayer
    implementation(libs.androidx.media3.exoplayer.hls)
    // For SmoothStreaming playback support with ExoPlayer
    implementation(libs.androidx.media3.exoplayer.smoothstreaming)
    // For RTSP playback support with ExoPlayer
    implementation(libs.androidx.media3.exoplayer.rtsp)
    // For MIDI playback support with ExoPlayer (see additional dependency requirements in
    // https://github.com/androidx/media/blob/release/libraries/decoder_midi/README.md)
    implementation(libs.androidx.media3.exoplayer.midi)
    // For ad insertion using the Interactive Media Ads SDK with ExoPlayer
    implementation(libs.androidx.media3.exoplayer.ima)

    // For loading data using the Cronet network stack
    implementation(libs.androidx.media3.datasource.cronet)
    // For loading data using the OkHttp network stack
    implementation(libs.androidx.media3.datasource.okhttp)
    // For loading data using librtmp
    implementation(libs.androidx.media3.datasource.rtmp)

    // For building media playback UIs using Compose
    implementation(libs.androidx.media3.ui.compose)
    // For building media playback UIs using Views
    implementation(libs.androidx.media3.ui.asProvider())
    // For building media playback UIs using Jetpack Compose
    implementation(libs.androidx.media3.ui.compose)
    // For building media playback UIs for Android TV using the Jetpack Leanback library
    implementation(libs.androidx.media3.ui.leanback)

    // For exposing and controlling media sessions
    implementation(libs.androidx.media3.session)

    // For extracting data from media containers
    implementation(libs.androidx.media3.extractor)

    // For inspecting media files
    implementation(libs.androidx.media3.inspector.asProvider())
    // For extracting and processing video frames
    implementation(libs.androidx.media3.inspector.frame)

    // For integrating with Cast
    implementation(libs.androidx.media3.cast)

    // For scheduling background operations using Jetpack Work's WorkManager with ExoPlayer
    implementation(libs.androidx.media3.exoplayer.workmanager)

    // For transforming media files
    implementation(libs.androidx.media3.transformer)

    // For applying effects on video frames
    implementation(libs.androidx.media3.effect.asProvider())
    // For applying Lottie effects on video frames
    implementation(libs.androidx.media3.effect.lottie)

    // For muxing media files
    implementation(libs.androidx.media3.muxer)

    // Utilities for testing media components (including ExoPlayer components)
    implementation(libs.androidx.media3.test.utils.asProvider())
    // Utilities for testing media components (including ExoPlayer components) via Robolectric
    implementation(libs.androidx.media3.test.utils.robolectric)

    // Common functionality for reading and writing media containers
    implementation(libs.androidx.media3.container)
    // Common functionality for media database components
    implementation(libs.androidx.media3.database)
    // Common functionality for media decoders
    implementation(libs.androidx.media3.decoder)
    // Common functionality for loading data
    implementation(libs.androidx.media3.datasource.asProvider())
    // Common functionality used across multiple media libraries
    implementation(libs.androidx.media3.common.asProvider())
    // Common Kotlin-specific functionality
    implementation(libs.androidx.media3.common.ktx)

}