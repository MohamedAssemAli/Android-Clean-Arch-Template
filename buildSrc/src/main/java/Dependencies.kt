/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */

object Dependencies {

    object Kotlin {
        const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
    }

    object AndroidX {
        // core
        const val ANDROID_APP_COMPAT =
            "androidx.appcompat:appcompat:${Versions.AndroidX.APP_COMPAT}"
        const val ANDROID_CORE_KTX = "androidx.core:core-ktx:${Versions.AndroidX.CORE_KTX}"
        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.AndroidX.ACTIVITY_KTX}"
        const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.AndroidX.FRAGMENT_KTX}"
        const val MULTIDEX = "androidx.multidex:multidex:${Versions.AndroidX.MULTIDEX}"
        const val LEGACY = "androidx.legacy:legacy-support-v4:${Versions.AndroidX.LEGACY}"

        // Work manager
        const val ANDROID_WORK_MANAGER =
            "androidx.work:work-runtime-ktx:${Versions.AndroidX.WORK_MANAGER}"

        // Navigation
        const val NAVIGATION =
            "androidx.navigation:navigation-fragment-ktx:${Versions.AndroidX.NAVIGATION}"
        const val NAVIGATION_KTX =
            "androidx.navigation:navigation-ui-ktx:${Versions.AndroidX.NAVIGATION}"

        // Viewmodel
        // ViewModel -  Lifecycle KTX
        const val LIFECYCLE_VIEWMODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.LIFECYCLE}"
        const val LIFECYCLE =
            "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.LIFECYCLE}"
        const val KAPT_LIFECYCLE_COMPILER =
            "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.LIFECYCLE}"
        const val LIFECYCLE_RUNTIME =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.LIFECYCLE}"

        // LiveData
        const val LIFECYCLE_LIVEDATA =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.LIFECYCLE}"
    }

    object MaterialDesign {
        const val MATERIAL = "com.google.android.material:material:${Versions.Google.MATERIAL}"
        const val CARD_VIEW = "androidx.cardview:cardview:${Versions.Google.CARDVIEW}"
        const val RECYCLER_VIEW =
            "androidx.recyclerview:recyclerview:${Versions.Google.RECYCLERVIEW}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.Google.CONSTRAINT_LAYOUT}"
        const val VIEW_PAGER_2 = "androidx.viewpager2:viewpager2:${Versions.Google.VIEW_PAGER_2}"
        const val FLEX_BOX = "com.google.android:flexbox:${Versions.Google.FLEX_BOX}"
    }

    object Room {
        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.AndroidX.ROOM}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.AndroidX.ROOM}"
        const val ROOM_COMPILER_KAPT = "androidx.room:room-compiler:${Versions.AndroidX.ROOM}"
    }

    object Square {
        const val RETROFIT2 = "com.squareup.retrofit2:retrofit:${Versions.Square.RETROFIT}"
        const val OKHTTP3 = "com.squareup.okhttp3:okhttp:${Versions.Square.OKHTTP3}"
        const val LOGGING_INTERCEPTOR =
            "com.squareup.okhttp3:logging-interceptor:${Versions.Square.OKHTTP3}"
        const val CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.Square.CONVERTER_GSON}"
    }

    object Coroutines {
        const val COROUTINES_CORE =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Coroutines}"
        const val COROUTINES_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines}"
    }

    object Hilt {
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.HILT_ANDROID}"
        const val KAPT_HILT_ANDROID =
            "com.google.dagger:hilt-android-compiler:${Versions.Hilt.HILT_ANDROID}"
        const val HILT_VIEWMODEL =
            "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.Hilt.HILT_VIEW_MODEL}"
        const val KAPT_HILT_COMPILER =
            "androidx.hilt:hilt-compiler:${Versions.Hilt.HILT_KAPT_COMPILER}"
        const val HILT_WORK = "androidx.hilt:hilt-work:${Versions.Hilt.HILT_WORK}"
    }

    object Glide {
        const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
        const val GLIDE_KAPT = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
    }

    const val PAGING = "androidx.paging:paging-runtime-ktx:${Versions.PAGING}"
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"

}
