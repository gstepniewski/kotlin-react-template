plugins {
    id("org.jetbrains.kotlin.js") version "1.3.72"
}

group = "com.rollercoaster"
version = "1.0"

repositories {
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:1.3.5")

    implementation(npm("react", "16.13.1"))
    implementation("org.jetbrains:kotlin-react:16.13.0-pre.94-kotlin-1.3.70")
    implementation(npm("react-dom", "16.13.1"))
    implementation("org.jetbrains:kotlin-react-dom:16.13.0-pre.94-kotlin-1.3.70")

    implementation(npm("styled-components"))
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.94-kotlin-1.3.70")

    implementation(npm("inline-style-prefixer"))

    implementation(npm("react-player"))
}

kotlin.target.browser { }