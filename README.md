# Low-Level Design (LLD) Using Core Java

A collection of standalone Core Java projects covering practical low-level design scenarios across multiple business domains.

## Technology

- Java 21 (JDK)
- Core Java and Object-Oriented Programming
- Java Collections Framework
- No Maven or Gradle required for these exercises

## Repository Structure

Each domain contains independent project folders. Each project has its own `src/` directory and `README.md`.

### Booking Reservation

- [`cinema-ticket-booking-system`](booking-reservation/cinema-ticket-booking-system/)
- [`hotel-room-booking-system`](booking-reservation/hotel-room-booking-system/)

### Ecommerce Retail

- [`billing-pos-system-restaurant-retail`](ecommerce-retail/billing-pos-system-restaurant-retail/)
- [`inventory-management-system`](ecommerce-retail/inventory-management-system/)
- [`online-shopping-cart-system`](ecommerce-retail/online-shopping-cart-system/)
- [`order-fulfillment-pipeline-lipkart-amazon`](ecommerce-retail/order-fulfillment-pipeline-lipkart-amazon/)

### Education

- [`class-exam-seat-allocation-system`](education/class-exam-seat-allocation-system/)
- [`school-college-attendance-management-system`](education/school-college-attendance-management-system/)

### Facility Management

- [`table-management-system`](facility-management/table-management-system/)
- [`warehouse-slot-management-system`](facility-management/warehouse-slot-management-system/)

### Healthcare

- [`hospital-bed-ICU-management-system`](healthcare/hospital-bed-ICU-management-system/)

### Queue Scheduling

- [`call-center-queue-management-system`](queue-scheduling/call-center-queue-management-system/)
- [`job-scheduling-systems-jenkins-builds`](queue-scheduling/job-scheduling-systems-jenkins-builds/)

### Transportation

- [`bus-seat-reservation-system`](transportation/bus-seat-reservation-system/)
- [`car-dispatch-system-like-uber-ola`](transportation/car-dispatch-system-like-uber-ola/)
- [`traffic-signal-management-system`](transportation/traffic-signal-management-system/)
- [`vehicle-parking-system`](transportation/vehicle-parking-system/)

### Voting

- [`voting-polling-management-system`](voting/voting-polling-management-system/)

## Running a Project

Open a terminal in the individual project folder. Most projects can be compiled and run with:

```powershell
javac -d out src/*.java
java -cp out Main
```

Check that project's README for its actual entry-point class. Some projects use a different main class name.

## Repository Conventions

- Each project is independently compilable.
- Source code is kept under `src/`.
- Generated output, IDE metadata, and compiled files are excluded using the root `.gitignore`.
- Project-specific documentation is maintained beside each project.

---

**Author:** Ramu Boya  
**Language:** Java 21  
**Focus:** Low-Level Design | Core Java | Object-Oriented Design
