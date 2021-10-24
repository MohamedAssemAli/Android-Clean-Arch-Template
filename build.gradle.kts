// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.KAPT)
}

buildscript {
    repositories {
        // Android plugin & support libraries
        google()

        // Main open-source repository
        jcenter()
    }
    dependencies {
        classpath(kotlin(Plugins.GradleClasspath.KOTLIN_PlUGIN, version = Versions.KOTLIN))
        classpath(Plugins.GradleClasspath.SAFE_ARGS)
        classpath(Plugins.GradleClasspath.KOTLIN_GRADLE)
        classpath(Plugins.GradleClasspath.ANDROID_GRADLE)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}