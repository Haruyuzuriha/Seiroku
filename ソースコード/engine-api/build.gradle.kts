/*
 * engine-api: the only module engine-web and engine-cli are allowed to compile
 * against. Pure interfaces and DTOs/records — no persistence, no framework
 * dependencies, no implementation logic.
 */

plugins {
    `java-library`
}
