package com.ramu.lld.cardispatch;

public class Customer {
    private final int id;
    private final String name;
    private final int pickupLocation;

    public Customer(int id, String name, int pickupLocation) {
        this.id = id;
        this.name = name;
        this.pickupLocation = pickupLocation;
    }

    public int getPickupLocation() { return pickupLocation; }

    @Override
    public String toString() {
        return "com.ramu.lld.cardisp.Customer ID: " + id + ", Name: " + name + ", Pickup: " + pickupLocation;
    }
}
