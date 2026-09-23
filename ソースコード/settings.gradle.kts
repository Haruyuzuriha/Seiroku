/*
 * The settings file is used to specify which projects to include in your build.
 * For more detailed information on multi-project builds, please refer to https://docs.gradle.org/9.7.1/userguide/multi_project_builds.html in the Gradle documentation.
 */

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "seiroku"

// engine-api: the only module external consumers (web, cli) compile against.
// engine-core: the blackbox implementation of engine-api, sealed behind module-info.java.
// engine-web: Spring Boot REST layer; runs on the classpath (unnamed module), wires engine-core at runtime.
// engine-cli: future CLI consumer; depends on engine-api only. Stack not yet decided (see README).
include("engine-api")
include("engine-core")
include("engine-web")
include("engine-cli")
