package com.ramu.lld.roombooking;

public class Room {
    private final int roomNumber;
    private final RoomType type;
    private boolean booked;
    private Customer customer;

    public Room(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getType() {
        return type;
    }

    public boolean isBooked() {
        return booked;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void book(Customer customer) {
        this.customer = customer;
        this.booked = true;
    }

    public void cancel() {
        this.customer = null;
        this.booked = false;
    }

    @Override
    public String toString() {
        return "com.ramu.lld.roombooking.Room " + roomNumber + " [" + type + "] - " + (booked ? "Booked by " + customer : "Available");
    }
}
