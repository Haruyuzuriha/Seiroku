/*
 * Root build file: configuration shared by every module (engine-api, engine-core,
 * engine-web, engine-cli). Module-specific dependencies and plugins live in each
 * module's own build.gradle.kts.
 */

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(26)
        }
    }

    dependencies {
        "testImplementation"(libs.junit.jupiter)
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
