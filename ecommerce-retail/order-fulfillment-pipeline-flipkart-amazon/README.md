# com.ramu.lld.order.Order Fulfillment Pipeline Lipkart Amazon

A standalone Core Java low-level design exercise.

## Overview

This project is part of the `low-level-design-java` repository and demonstrates a small, domain-focused application implemented with Java.

## Technology

- Java 21 (JDK)
- Core Java
- Object-Oriented Programming
- Java Collections Framework, where applicable

## Source Files

- `Inventory.java`
- `com.ramu.lld.pos.OrderFulfillmentApplication.java`
- `com.ramu.lld.order.Order.java`
- `com.ramu.lld.order.OrderProcessor.java`
- `com.ramu.lld.order.PaymentGateway.java`

## Entry Point

`com.ramu.lld.pos.OrderFulfillmentApplication`

## Package

These source files use the default package.

## Run Locally

Install JDK 21 or later and open a terminal in this project directory.

Compile:

```powershell
javac -d out src/*.java
```

Run:

```powershell
java -cp out com.ramu.lld.pos.OrderFulfillmentApplication
```

## Notes

- This is a standalone Java project; Maven and Gradle are not required.
- Compiled classes are written to the `out/` directory.
- See the source files for the implemented business rules and console interaction.
