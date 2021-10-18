import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */

object Dependencies {

    object AndroidX {
        const val ANDROID_APP_COMPAT =
            "androidx.appcompat:appcompat:${Versions.AndroidX.APP_COMPAT}"
        const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${Versions.AndroidX.CORE_KTX}"
        const val ANDROID_WORK_MANAGER =
            "androidx.work:work-runtime-ktx:${Versions.AndroidX.WORK_MANAGER}"
    }

    object MaterialDesign {
        const val MATERIAL = "com.google.android.material:material:${Versions.Google.MATERIAL}"
        const val CARD_VIEW = "androidx.cardview:cardview:${Versions.Google.CARDVIEW_VERSION}"
        const val RECYCLER_VIEW =
            "androidx.recyclerview:recyclerview:${Versions.Google.RECYCLERVIEW_VERSION}"
    }
}

fun DependencyHandler.appCompat() {
    implementation(Dependencies.AndroidX.ANDROID_APP_COMPAT)
    implementation(Dependencies.AndroidX.ANDROID_CORE_KTX)
    implementation(Dependencies.AndroidX.ANDROID_WORK_MANAGER)
}

fun DependencyHandler.materialDesign() {
    implementation(Dependencies.MaterialDesign.MATERIAL)
    implementation(Dependencies.MaterialDesign.CARD_VIEW)
    implementation(Dependencies.MaterialDesign.RECYCLER_VIEW)
}

fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.compileOnly(depName: String) {
    add("compileOnly", depName)
}

private fun DependencyHandler.api(depName: String) {
    add("api", depName)
}