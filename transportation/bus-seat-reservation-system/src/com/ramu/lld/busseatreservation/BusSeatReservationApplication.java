package com.ramu.lld.busseatreservation;

import java.util.Scanner;

public class BusSeatReservationApplication {
    public static void main(String[] args) {
        Bus bus = new Bus(20); // 20 seats
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.busseatreservation.Bus Reservation System ===");
            System.out.println("1. View com.ramu.lld.busseatreservation.Seat Status");
            System.out.println("2. Reserve com.ramu.lld.busseatreservation.Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View Available Seats");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bus.displaySeats();
                    break;
                case 2:
                    System.out.print("Enter seat number to reserve: ");
                    int seatNum = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    bus.reserveSeat(seatNum, name);
                    break;
                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    int cancelSeat = scanner.nextInt();
                    bus.cancelReservation(cancelSeat);
                    break;
                case 4:
                    bus.displayAvailableSeats();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
