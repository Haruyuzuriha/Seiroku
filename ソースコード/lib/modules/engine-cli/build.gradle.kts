plugins {
    application
}

dependencies {
    implementation(project(":lib:modules:engine-api"))
}

application {
    mainClass.set("net.haruyuzuriha.seiroku.cli.Main")
}
