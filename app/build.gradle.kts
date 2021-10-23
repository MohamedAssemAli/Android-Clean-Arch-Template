plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.BASE_GRADLE_PLUGIN)
}
dependencies {
    implementation(project(Modules.FEATURE1))
    implementation(project(Modules.FEATURE2))

    networking()
    glide()
    materialDesign()
}