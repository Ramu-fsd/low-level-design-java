# ATM Cash Management System

A console-based ATM Cash Management System developed using Core Java. This project demonstrates basic ATM operations, cash inventory management, and denomination-based cash withdrawal.

## Features

- Deposit cash into the ATM account.
- Withdraw cash based on available balance.
- Dispense cash using available denominations.
- Maintain ATM cash inventory.
- Display the current account balance.
- Handle basic withdrawal validation.

## Technology Stack

- Java 21
- Core Java
- Object-Oriented Programming
- Collections Framework

## Project Structure

```text
atm-cash-management-system/
├── README.md
└── src/
    └── com/
        └── ramu/
            └── lld/
                └── atm/
                    ├── ATMApplication.java
                    └── ATM.java
```

## How to Run

### Prerequisites

- JDK 21 or later
- Any Java IDE or command-line terminal

### Compile

Run the following command from the project root:

```bash
javac -d out src/com/ramu/lld/atm/*.java
```

### Execute

```bash
java -cp out com.ramu.lld.atm.ATMApplication
```

## Concepts Demonstrated

- Classes and Objects
- Encapsulation
- Methods and Constructors
- Conditional Statements
- Loops
- Collections
- Cash denomination handling
- Input validation

## Learning Objective

Understand how to model a simple ATM system using object-oriented programming and implement cash deposit, withdrawal, and inventory management operations.

## Future Enhancements

- PIN-based authentication
- Transaction history
- Daily withdrawal limits
- Multiple customer accounts
- Improved exception handling
- Unit testing

---

**Author:** Ramu Boya  
**Language:** Java 21  
**Project Type:** Low-Level Design (LLD) | Console Application