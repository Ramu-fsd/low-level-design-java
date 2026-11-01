package com.ramu.lld.booking;

import java.util.Scanner;

public class CinemaTicketBookingApplication {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.booking.Cinema Ticket Booking System ===");
            System.out.println("1. View Shows");
            System.out.println("2. View Seats");
            System.out.println("3. Book com.ramu.lld.booking.Seat");
            System.out.println("4. Cancel com.ramu.lld.booking.Seat");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cinema.listShows();
                    break;
                case 2:
                    System.out.print("Enter com.ramu.lld.booking.Show ID: ");
                    int showId2 = sc.nextInt();
                    Show show2 = cinema.getShow(showId2);
                    if (show2 != null) {
                        show2.displaySeats();
                    } else {
                        System.out.println("Invalid com.ramu.lld.booking.Show ID.");
                    }
                    break;
                case 3:
                    System.out.print("Enter com.ramu.lld.booking.Show ID: ");
                    int showId3 = sc.nextInt();
                    System.out.print("Enter com.ramu.lld.booking.Seat Number: ");
                    int seatNum3 = sc.nextInt();
                    Show show3 = cinema.getShow(showId3);
                    if (show3 != null) {
                        show3.bookSeat(seatNum3);
                    } else {
                        System.out.println("Invalid com.ramu.lld.booking.Show ID.");
                    }
                    break;
                case 4:
                    System.out.print("Enter com.ramu.lld.booking.Show ID: ");
                    int showId4 = sc.nextInt();
                    System.out.print("Enter com.ramu.lld.booking.Seat Number to Cancel: ");
                    int seatNum4 = sc.nextInt();
                    Show show4 = cinema.getShow(showId4);
                    if (show4 != null) {
                        show4.cancelSeat(seatNum4);
                    } else {
                        System.out.println("Invalid com.ramu.lld.booking.Show ID.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
