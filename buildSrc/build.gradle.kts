plugins {
    `kotlin-dsl`
    kotlin("kapt") version "1.3.21"
}

//The kotlin-dsl plugin requires a repository to be declared
repositories {
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {
        register("base-gradle-plugin") {
            id = "base-gradle-plugin"
            implementationClass = "base_plugin.BaseGradlePlugin"
        }
    }
}


dependencies {
    // Depend on the android gradle plugin, since we want to access it in our plugin
    // This should be in-sync with the Gradle version exposed by `Versions.kt`
    implementation("com.android.tools.build:gradle:4.2.2")
    // Depend on the kotlin plugin, since we want to access it in our plugin
    // This should be in-sync with the Kotlin version exposed by `Versions.kt`
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
}
