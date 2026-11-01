package com.ramu.lld.roombooking;

import java.util.*;

public class Hotel {
    private final List<Room> rooms = new ArrayList<>();

    public Hotel() {
        // Initialize 10 rooms (customize as needed)
        rooms.add(new Room(101, RoomType.SINGLE));
        rooms.add(new Room(102, RoomType.SINGLE));
        rooms.add(new Room(201, RoomType.DOUBLE));
        rooms.add(new Room(202, RoomType.DOUBLE));
        rooms.add(new Room(301, RoomType.SUITE));
    }

    public void showAllRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void showAvailableRooms() {
        for (Room room : rooms) {
            if (!room.isBooked()) {
                System.out.println(room);
            }
        }
    }

    public boolean bookRoom(int roomNumber, Customer customer) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isBooked()) {
                room.book(customer);
                System.out.println("com.ramu.lld.roombooking.Room " + roomNumber + " successfully booked for " + customer.getName());
                return true;
            }
        }
        System.out.println("com.ramu.lld.roombooking.Room " + roomNumber + " is not available.");
        return false;
    }

    public boolean cancelBooking(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isBooked()) {
                System.out.println("Booking for com.ramu.lld.roombooking.Room " + roomNumber + " cancelled (com.ramu.lld.roombooking.Customer: " + room.getCustomer().getName() + ")");
                room.cancel();
                return true;
            }
        }
        System.out.println("com.ramu.lld.roombooking.Room is not booked or invalid.");
        return false;
    }
}
