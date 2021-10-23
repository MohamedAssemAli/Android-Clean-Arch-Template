/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */

object Plugins {
    const val ANDROID_APPLICATION = "com.android.application"
    const val KOTLIN_ANDROID = "android"
    const val KOTLIN_ANDROID_EXTENSIONS = "android.extensions"
    const val KAPT = "kotlin-kapt"
    const val COMMON = "common"
    const val BASE_GRADLE_PLUGIN = "base-gradle-plugin"

    object GradleClasspath {
        const val KOTLIN_PlUGIN = "gradle-plugin"
        const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE}"
        const val SAFE_ARGS =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.AndroidX.NAVIGATION}"
    }
}