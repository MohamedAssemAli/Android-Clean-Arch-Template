plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.BASE_GRADLE_PLUGIN)
}
dependencies {
    implementation(Modules.FEATURE1)
    implementation(Modules.FEATURE1)

    networking()
    glide()
    materialDesign()
}