import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * Created by mohamedassem on 18-Oct-2021.
 * mohamed.assem.ali@gmail.com
 * https://github.com/MohamedAssemAli
 * https://gitlab.com/mohamed.assem.ali
 */

fun DependencyHandlerScope.implementation(depName: String) {
    add("implementation", depName)
}

fun DependencyHandlerScope.kapt(depName: String) {
    add("kapt", depName)
}

fun DependencyHandlerScope.compileOnly(depName: String) {
    add("compileOnly", depName)
}

fun DependencyHandlerScope.api(depName: String) {
    add("api", depName)
}

fun DependencyHandlerScope.testImplementation(depName: String) {
    add("testImplementation", depName)
}

fun DependencyHandlerScope.androidTestImplementation(depName: String) {
    add("androidTestImplementation", depName)
}
