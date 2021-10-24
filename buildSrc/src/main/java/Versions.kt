import org.gradle.api.JavaVersion

/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */

object Versions {

    object Google {
        const val MATERIAL = "1.3.0"
        const val CARDVIEW = "1.0.0"
        const val RECYCLERVIEW = "1.2.0"
        const val CONSTRAINT_LAYOUT = "2.0.4"
        const val VIEW_PAGER_2 = "1.0.0"
        const val FLEX_BOX = "2.0.1"
    }

    object AndroidX {
        const val CORE = "1.5.0"
        const val APP_COMPAT = "1.3.1"
        const val LIFECYCLE = "2.3.1"
        const val CORE_KTX = "1.6.0"
        const val ACTIVITY_KTX = "1.3.1"
        const val FRAGMENT_KTX = "1.1.0"
        const val WORK_MANAGER = "2.5.0"
        const val ROOM = "2.3.0"
        const val NAVIGATION = "2.3.5"
        const val FRAGMENT = "1.3.6"
        const val MULTIDEX = "2.0.1"
        const val LEGACY = "1.0.0"
    }

    object Hilt {
        const val HILT_ANDROID = "2.31-alpha"
        const val HILT_KAPT = ""
        const val HILT_VIEW_MODEL = "1.0.0-alpha03"
        const val HILT_KAPT_COMPILER = "1.0.0"
        const val HILT_WORK = "1.0.0"
    }

    object Square {
        const val RETROFIT = "2.9.0"
        const val OKHTTP3 = "4.9.1"
    }

    object Test {
        const val JUNIT = "4.13.2"
        const val JUNIT_INTEGRATION = "1.1.2"
        const val ESPRESSO = "3.3.0"
    }

    const val GLIDE = "4.12.0"
    const val GSON = "2.9.0"
    const val Coroutines = "1.4.2"

    // Make sure to update `buildSrc/build.gradle.kts` when updating this
    const val GRADLE = "7.0.0-alpha07"

    // Make sure to update `buildSrc/build.gradle.kts` when updating this
    const val KOTLIN = "1.5.31"

    val JAVA = JavaVersion.VERSION_1_8
}
