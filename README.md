# bank-engine# Seiroku

**Seiroku** is a self-contained, UI-agnostic banking engine. It exposes a small, deliberate set of public APIs and keeps all internal logic — account state, transaction rules, ledger integrity — fully encapsulated behind them. Any frontend, CLI, or service can sit on top without ever touching or tampering with the core.

## Why this design

Where a previous project in this series explored data-oriented programming (DOP), Seiroku leans into the opposite strengths: **OOP encapsulation** and **AOP** (aspect-oriented programming, e.g. logging, auditing, and access checks applied around core operations rather than scattered through them). The core is treated as a black box — few entry points in, no shortcuts around it.

## Name

The project is named after **Honda Seiroku** (1866–1952), a Japanese forester and academic remembered both as the "father of Japan's modern parks" and as a well-known figure in Japanese personal finance for his disciplined, methodical approach to saving and investing. The name is a nod to that same discipline applied here — building something durable and rule-governed, one deliberate layer at a time.

## Tech stack

| Layer | Choice |
|---|---|
| Language / Build | Java (Gradle) |
| Database | PostgreSQL |
| Migrations | Liquibase |
| DB access | MyBatis |
| Web / networking | Spring Boot |
| Auth / access management | Keycloak (single realm, small set of roles) |
| Testing (logic) | JUnit |
| Testing (DB) | Testcontainers |
| Logging | SLF4J + Logback |
| API spec | OpenAPI |
| Local environment | Docker Compose (PostgreSQL + Keycloak) |

A CLI is planned to sit on top of the engine as a first consumer of the public API; its stack is not yet decided.

## Status

Early stage 