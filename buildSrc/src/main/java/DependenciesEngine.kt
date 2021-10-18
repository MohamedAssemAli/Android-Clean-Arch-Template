import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */
fun DependencyHandler.kotlin() {
    implementation(Dependencies.Kotlin.STD_LIB)
}

fun DependencyHandler.androidX() {
    implementation(Dependencies.AndroidX.ANDROID_APP_COMPAT)
    implementation(Dependencies.AndroidX.ANDROID_CORE_KTX)
    implementation(Dependencies.AndroidX.ANDROID_WORK_MANAGER)
    implementation(Dependencies.AndroidX.ACTIVITY_KTX)
    implementation(Dependencies.AndroidX.FRAGMENT_KTX)
    implementation(Dependencies.AndroidX.MULTIDEX)
    implementation(Dependencies.AndroidX.LEGACY)
    lifeCycle()
}

fun DependencyHandler.lifeCycle() {
    implementation(Dependencies.AndroidX.LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.AndroidX.LIFECYCLE)
    kapt(Dependencies.AndroidX.KAPT_LIFECYCLE_COMPILER)
    implementation(Dependencies.AndroidX.LIFECYCLE_RUNTIME)
    implementation(Dependencies.AndroidX.LIFECYCLE_LIVEDATA)
}

fun DependencyHandler.materialDesign() {
    implementation(Dependencies.MaterialDesign.MATERIAL)
    implementation(Dependencies.MaterialDesign.CARD_VIEW)
    implementation(Dependencies.MaterialDesign.RECYCLER_VIEW)
    implementation(Dependencies.MaterialDesign.VIEW_PAGER_2)
    implementation(Dependencies.MaterialDesign.FLEX_BOX)
}

fun DependencyHandler.networking() {
    implementation(Dependencies.Square.RETROFIT2)
    implementation(Dependencies.Square.OKHTTP3)
    implementation(Dependencies.Square.LOGGING_INTERCEPTOR)
    implementation(Dependencies.Square.CONVERTER_GSON)
    implementation(Dependencies.PAGING)
}

fun DependencyHandler.gson() {
    implementation(Dependencies.GSON)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.Hilt.HILT_ANDROID)
    kapt(Dependencies.Hilt.KAPT_HILT_ANDROID)
    implementation(Dependencies.Hilt.HILT_VIEWMODEL)
    kapt(Dependencies.Hilt.KAPT_HILT_COMPILER)
    implementation(Dependencies.Hilt.HILT_WORK)
}

fun DependencyHandler.coroutines() {
    implementation(Dependencies.Coroutines.COROUTINES_CORE)
    implementation(Dependencies.Coroutines.COROUTINES_ANDROID)
}

fun DependencyHandler.room() {
    implementation(Dependencies.Room.ROOM_RUNTIME)
    implementation(Dependencies.Room.ROOM_KTX)
    kapt(Dependencies.Room.ROOM_COMPILER_KAPT)
}

fun DependencyHandler.glide() {
    implementation(Dependencies.Glide.GLIDE)
    kapt(Dependencies.Glide.GLIDE_KAPT)
}

