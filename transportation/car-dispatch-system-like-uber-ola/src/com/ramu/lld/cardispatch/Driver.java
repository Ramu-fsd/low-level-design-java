package com.ramu.lld.cardispatch;

public class Driver {
    private final int id;
    private final String name;
    private int location; // Assume location is an integer (e.g., pin code or distance)
    private boolean available;

    public Driver(int id, String name, int location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.available = true;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getLocation() { return location; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void updateLocation(int newLocation) {
        this.location = newLocation;
    }

    @Override
    public String toString() {
        return "com.ramu.lld.cardisp.Driver ID: " + id + ", Name: " + name + ", Location: " + location + ", " +
               (available ? "Available" : "On Trip");
    }
}
