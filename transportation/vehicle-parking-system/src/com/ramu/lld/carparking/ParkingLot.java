package com.ramu.lld.carparking;

class ParkingLot {
    private final int capacity;
    private final Car[] slots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.slots = new Car[capacity];
    }

    // Park car in nearest available slot (from 0)
    public void parkCar(String registrationNumber) {
        for (int i = 0; i < capacity; i++) {
            if (slots[i] == null) {
                slots[i] = new Car(registrationNumber);
                System.out.println("com.ramu.lld.carparking.Car parked at slot " + (i + 1));
                return;
            }
        }
        System.out.println("Parking Lot is Full");
    }

    // Remove car from specified slot
    public void removeCar(int slotNumber) {
        if (slotNumber <= 0 || slotNumber > capacity) {
            System.out.println("Invalid slot number");
            return;
        }

        if (slots[slotNumber - 1] == null) {
            System.out.println("Slot already empty");
        } else {
            System.out.println("com.ramu.lld.carparking.Car with registration number " + slots[slotNumber - 1].getRegistrationNumber() + " removed from slot " + slotNumber);
            slots[slotNumber - 1] = null;
        }
    }

    // Display status of parking lot
    public void displayStatus() {
        System.out.println("Slot No.\tRegistration Number");
        for (int i = 0; i < capacity; i++) {
            if (slots[i] != null) {
                System.out.println((i + 1) + "\t\t" + slots[i].getRegistrationNumber());
            } else {
                System.out.println((i + 1) + "\t\t" + "Empty");
            }
        }
    }
}