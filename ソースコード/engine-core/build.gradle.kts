/*
 * engine-core: the blackbox implementation of engine-api. Nothing in this
 * module is exported except the top-level package that Spring needs to
 * instantiate beans from; internals (persistence, aspects) stay unexported
 * and are only reachable via reflection where explicitly opened below.
 */

plugins {
    `java-library`
}

dependencies {
    api(project(":engine-api"))

    implementation("org.mybatis:mybatis:3.5.19")
    implementation("org.springframework:spring-beans:6.2.1")
    implementation("org.springframework:spring-context:6.2.1")
}
