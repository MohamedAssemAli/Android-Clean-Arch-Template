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
        const val CARDVIEW_VERSION = "1.0.0"
        const val RECYCLERVIEW_VERSION = "1.2.0-alpha02"
    }

    object AndroidX {
        const val CORE = "1.5.0"
        const val APP_COMPAT = "1.3.0"
        const val LIFECYCLE = "2.2.0"
        const val CORE_KTX = "1.1.0"
        const val WORK_MANAGER = "2.3.0"
        const val ROOM = "2.2.3"
    }

    object Test {
        const val JUNIT = "4.13.2"
        const val JUNIT_INTEGRATION = "1.1.2"
        const val ESPRESSO = "3.3.0"
    }

    // Make sure to update `buildSrc/build.gradle.kts` when updating this
    const val GRADLE = "4.2.1"

    // Make sure to update `buildSrc/build.gradle.kts` when updating this
    const val KOTLIN = "1.5.12"

    val JAVA = JavaVersion.VERSION_1_8
}
