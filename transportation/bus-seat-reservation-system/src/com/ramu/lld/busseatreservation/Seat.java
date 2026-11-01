package com.ramu.lld.busseatreservation;

public class Seat {
    private final int seatNumber;
    private boolean isReserved;
    private String passengerName;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void reserve(String passengerName) {
        this.isReserved = true;
        this.passengerName = passengerName;
    }

    public void cancel() {
        this.isReserved = false;
        this.passengerName = null;
    }

    @Override
    public String toString() {
        return "com.ramu.lld.busseatreservation.Seat " + seatNumber + " - " + (isReserved ? "Reserved by " + passengerName : "Available");
    }
}
