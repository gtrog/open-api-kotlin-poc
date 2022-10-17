Proof-of-concept of writing a Spring Boot Kotlin service with an OpenAPI spec first approach
--------------------------------------------------------------------------------------------

This basic project demonstrates how you can build a Spring Boot service with just an OpenAPI spec to
generate a service stub to implement and a client to talk to the service.

Project Layout:

---
```
/pom.xml
```
The main Maven project that has all the required dependencies and also runs the openapi generator plugins to generate 
sources for the client and service stubs.

---
```
/src/main/kotlin/com/rtr/example/PetStoreApplication.kt
```
Entry point for our Spring Boot application

---
```
/src/main/kotlin/com/rtr/example/api/PetsApiDelegateImpl.kt
```
Our implementation of the Pet Store service stub

---
```
/src/main/resources/application.properties
```
Spring Boot properties in order to have Swagger UI point at our spec yaml

---
```
/src/main/resources/spec/petstore.yaml
```
The OpenAPI spec itself for the service

---
```
/src/test/kotlin/com/rtr/example/PetStoreTesting.kt
```
Demonstration of using the generated client to talk to the Spring Boot application

---
```
/target/generated-sources/openapi/**
```
The location where all the generated service stubs and client code is written
