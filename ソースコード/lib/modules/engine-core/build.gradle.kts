plugins {
    `java-library`
}

dependencies {
    api(project(":lib:modules:engine-api"))

    implementation("org.mybatis:mybatis:3.5.19")
    implementation("org.springframework:spring-beans:6.2.1")
    implementation("org.springframework:spring-context:6.2.1")
}
