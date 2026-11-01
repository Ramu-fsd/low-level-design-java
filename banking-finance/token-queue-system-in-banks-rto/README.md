# Bank Token Queue Management System

A console-based Bank Token Queue Management System developed using Core Java. The application manages customer queues for different banking services and assigns service counters to handle customer requests.

The system follows the FIFO (First-In, First-Out) queue processing approach.

## Features

- Register different banking services.
- Add service counters for registered services.
- Generate tokens for customers.
- Maintain separate queues for each banking service.
- Serve the next customer using the assigned counter.
- Display all service queues.
- Handle invalid service types and counter IDs.

## Technology Stack

- Java 21
- Core Java
- Object-Oriented Programming
- Java Collections Framework

## Project Structure

```text
token-queue-system/
├── README.md
└── src/
    └── com/
        └── ramu/
            └── lld/
                └── bankqueue/
                    ├── TokenQueueSystem.java
                    ├── BankQueueSystem.java
                    ├── Counter.java
                    └── Token.java
```

## Banking Services

The application initially registers three services:

| Service | Description |
|---|---|
| ACCOUNT | Account-related services |
| LOAN | Loan-related services |
| CASH | Cash-related services |

Each service maintains its own customer queue.

## How to Run

### Prerequisites

- JDK 21 or later
- Any Java IDE or command-line terminal

### Compile

Run the following command from the project root:

```bash
javac -d out src/com/ramu/lld/bankqueue/*.java
```

### Execute

```bash
java -cp out com.ramu.lld.bankqueue.TokenQueueSystem
```

## Application Menu

```text
========== BANK TOKEN QUEUE SYSTEM ==========

1. Add Counter
2. Generate Token
3. Serve Next Token
4. Display All Queues
5. Exit
```

## Example Workflow

1. Register banking services.
2. Add counters for ACCOUNT, LOAN, and CASH services.
3. Generate customer tokens.
4. Display the queues to view pending customers.
5. Select a counter to serve the next customer.
6. Display the queues again to verify token processing.

## Concepts Demonstrated

- Object-Oriented Programming
- Encapsulation
- Classes and Objects
- Java Queue Interface
- LinkedList
- HashMap
- ArrayList
- FIFO processing
- Service-based queue management
- Separation of responsibilities

## Design Overview

| Class | Responsibility |
|---|---|
| TokenQueueSystem | Console menu and user interaction |
| BankQueueSystem | Manages services, queues, counters, and token processing |
| Counter | Represents a banking service counter |
| Token | Represents a customer token |

## Future Enhancements

- Prevent duplicate counter IDs.
- Support counter activation and deactivation.
- Display currently serving and waiting customers.
- Add token cancellation.
- Add priority-based queues.
- Maintain customer service history.
- Add estimated waiting time.

---

**Author:** Ramu Boya  
**Language:** Java 21  
**Project Type:** Low-Level Design (LLD) | Console Application