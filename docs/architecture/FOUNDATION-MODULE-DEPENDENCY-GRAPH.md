
# MRIS PDF — Foundation Module Dependency Graph

## Architecture Scope

Foundation Layer provides the lowest-level
infrastructure for the independent PDF engine.

## Modules

1. foundation-common
2. foundation-errors
3. foundation-collections
4. foundation-io
5. foundation-memory
6. foundation-concurrency
7. foundation-testing

## Dependency Rules

- No circular dependencies.
- Common remains dependency-free.
- Errors remains dependency-free.
- Testing must not become a production runtime dependency.
- Modules depend only on explicitly declared lower-level modules.
- No Android framework dependencies.
- No external PDF engine dependencies.

## Language

Pure Kotlin/JVM.

## JVM Toolchain

Java 21.

## Namespace

com.mris.pdf.foundation

## Validation

Every module must compile independently
and pass its designated automated tests.
