package com.ramu.lld.booking;

import java.util.*;

public class Show {
    private final int showId;
    private final String movieName;
    private final List<Seat> seats;

    public Show(int showId, String movieName, int seatCount) {
        this.showId = showId;
        this.movieName = movieName;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= seatCount; i++) {
            seats.add(new Seat(i));
        }
    }

    public int getShowId() {
        return showId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void displaySeats() {
        System.out.println("\nSeats for " + movieName + ":");
        for (Seat seat : seats) {
            System.out.print(seat + "  ");
        }
        System.out.println();
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return false;
        }
        Seat seat = seats.get(seatNumber - 1);
        if (seat.isBooked()) {
            System.out.println("com.ramu.lld.booking.Seat already booked.");
            return false;
        }
        seat.book();
        System.out.println("com.ramu.lld.booking.Seat " + seatNumber + " booked for " + movieName);
        return true;
    }

    public boolean cancelSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.size()) {
            System.out.println("Invalid seat number.");
            return false;
        }
        Seat seat = seats.get(seatNumber - 1);
        if (!seat.isBooked()) {
            System.out.println("com.ramu.lld.booking.Seat is not booked.");
            return false;
        }
        seat.cancel();
        System.out.println("Booking for seat " + seatNumber + " cancelled.");
        return true;
    }
}
