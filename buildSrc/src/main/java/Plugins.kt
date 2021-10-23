/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */

object Plugins {
    const val ANDROID_APPLICATION = "com.android.application"
    const val KOTLIN_ANDROID = "kotlin-android"
    const val KOTLIN_ANDROID_EXTENSIONS = "kotlin-android-extensions"
    const val KAPT = "kotlin-kapt"
    const val BASE_GRADLE_PLUGIN = "base-gradle-plugin"

    object GradleClasspath {
        const val KOTLIN_PlUGIN = "gradle-plugin"
        const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE}"
        const val KOTLIN_GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val SAFE_ARGS =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.AndroidX.NAVIGATION}"
    }
}