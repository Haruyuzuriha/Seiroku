plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "seiroku"

include("lib:modules:engine-api")
include("lib:modules:engine-core")
include("lib:modules:engine-web")
include("lib:modules:engine-cli")

project(":lib:modules:engine-api").projectDir = file("lib/modules/engine-api")
project(":lib:modules:engine-core").projectDir = file("lib/modules/engine-core")
project(":lib:modules:engine-web").projectDir = file("lib/modules/engine-web")
project(":lib:modules:engine-cli").projectDir = file("lib/modules/engine-cli")
