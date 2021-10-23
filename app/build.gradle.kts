plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.BASE_GRADLE_PLUGIN)
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.3.1")
    androidX()
    networking()
    glide()
}