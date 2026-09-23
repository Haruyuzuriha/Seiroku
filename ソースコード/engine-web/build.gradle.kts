/*
 * engine-web: Spring Boot REST layer. Deliberately NOT modularized with
 * module-info.java — Spring Boot's repackaged fat jar runs on the plain
 * classpath, and forcing it onto the module path fights the framework for
 * little benefit. This module still can only compile against what
 * engine-api exports; the module boundary is enforced for unnamed-module
 * code too, it's just Gradle's classpath doing the enforcing here, not JPMS.
 */

plugins {
    java
    id("org.springframework.boot") version "3.4.1"
    id("io.spring.dependency-management") version "1.1.7"
}

dependencies {
    implementation(project(":engine-api"))
    runtimeOnly(project(":engine-core"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server") // Keycloak
}
