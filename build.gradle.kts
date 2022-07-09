plugins {
    id(Deps.Plugins.Configuration.Kotlin.Android.App)
}

group = AppInfo.PACKAGE
version = AppInfo.VERSION

android {
    compileSdk = Deps.compileSdkVersion

    defaultConfig {
        minSdk = Deps.minSdkVersion
        applicationId = "com.y9vad9.kscript.android.test"
    }

    packagingOptions {
        exclude("kotlin/internal/internal.kotlin_builtins")
        exclude("META-INF/util.runtime.kotlin_module")
        exclude("kotlin/reflect/reflect.kotlin_builtins")
        exclude("META-INF/compiler.common.jvm.kotlin_module")
        exclude("META-INF/metadata.kotlin_module")
        exclude("META-INF/metadata.jvm.kotlin_module")
        exclude("META-INF/descriptors.jvm.kotlin_module")
        exclude("kotlin/kotlin.kotlin_builtins")
        exclude("kotlin/coroutines/coroutines.kotlin_builtins")
        exclude("META-INF/deserialization.common.kotlin_module")
        exclude("META-INF/descriptors.runtime.kotlin_module")
        exclude("META-INF/descriptors.kotlin_module")
        exclude("META-INF/deserialization.common.jvm.kotlin_module")
        exclude("META-INF/compiler.common.kotlin_module")
        exclude("kotlin/ranges/ranges.kotlin_builtins")
        exclude("META-INF/deserialization.kotlin_module")
        exclude("kotlin/collections/collections.kotlin_builtins")
        exclude("kotlin/annotation/annotation.kotlin_builtins")
        exclude("META-INF/LICENSE.md")
        exclude("META-INF/LICENSE-notice.md")
    }
}

dependencies {
    implementation(Deps.Libs.Androidx.AppCompat)
    implementation(Deps.Libs.Y9Vad9.ScriptKt)
    implementation(Deps.Libs.Kotlinx.Coroutines)
}