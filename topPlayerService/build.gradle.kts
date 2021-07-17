apply {
    from("$rootDir/library-build.gradle")
}

plugins {
    kotlin(KotlinPlugins.serialization) version Kotlin.version
}

dependencies {
    "implementation"(project(Modules.player))

    "implementation"(Ktor.core)
    "implementation"(Ktor.clientSerialization)
}