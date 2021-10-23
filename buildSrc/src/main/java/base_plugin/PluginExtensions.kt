package base_plugin

import BuildType
import ConfigData
import Dependencies
import Plugins
import Versions
import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

internal fun Project.configureDefaultPlugins() {
    plugins.apply(Plugins.KOTLIN_ANDROID)
    plugins.apply(Plugins.KOTLIN_ANDROID_EXTENSIONS)
}

private typealias AndroidBaseExtension = BaseExtension

internal fun Project.configureAndroidApp() = this.extensions.getByType<AndroidBaseExtension>().run {
    compileSdkVersion(ConfigData.compileSdkVersion)
    buildToolsVersion(ConfigData.buildToolsVersion)
    defaultConfig {
        applicationId = ConfigData.applicationId
        minSdkVersion(ConfigData.minSdkVersion)
        targetSdkVersion(ConfigData.targetSdkVersion)
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName(BuildType.DEBUG) {
            isTestCoverageEnabled = true
        }
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = Versions.JAVA
        targetCompatibility = Versions.JAVA
    }

    project.tasks.withType(KotlinCompile::class.java).configureEach {
        kotlinOptions {
            jvmTarget = Versions.JAVA.toString()
        }
    }
}

internal fun Project.configureDependencies() = this.dependencies {
    add("implementation", Dependencies.Kotlin.STD_LIB)
}