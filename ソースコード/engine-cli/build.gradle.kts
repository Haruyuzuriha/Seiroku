/*
 * engine-cli: future CLI consumer of the engine. Stack not yet decided (see
 * README) — kept as a thin application stub that depends on engine-api only,
 * same boundary rule as engine-web.
 */

plugins {
    application
}

dependencies {
    implementation(project(":engine-api"))
}

application {
    mainClass.set("net.haruyuzuriha.seiroku.cli.Main")
}
