package com.ramu.lld.busseatreservation;

import java.util.*;

public class Bus {
    private final List<Seat> seats;

    public Bus(int totalSeats) {
        this.seats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public void displaySeats() {
        System.out.println("\n--- com.ramu.lld.busseatreservation.Seat Status ---");
        for (Seat seat : seats) {
            System.out.println(seat);
        }
    }

    public void reserveSeat(int seatNumber, String passengerName) {
        if (seatNumber < 1 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return;
        }

        Seat seat = seats.get(seatNumber - 1);
        if (seat.isReserved()) {
            System.out.println("com.ramu.lld.busseatreservation.Seat already reserved by " + seat.getPassengerName());
        } else {
            seat.reserve(passengerName);
            System.out.println("com.ramu.lld.busseatreservation.Seat " + seatNumber + " reserved for " + passengerName);
        }
    }

    public void cancelReservation(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return;
        }

        Seat seat = seats.get(seatNumber - 1);
        if (!seat.isReserved()) {
            System.out.println("com.ramu.lld.busseatreservation.Seat is not reserved.");
        } else {
            seat.cancel();
            System.out.println("Reservation for seat " + seatNumber + " has been cancelled.");
        }
    }

    public void displayAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        for (Seat seat : seats) {
            if (!seat.isReserved()) {
                System.out.print(seat.getSeatNumber() + " ");
            }
        }
        System.out.println();
    }
}
