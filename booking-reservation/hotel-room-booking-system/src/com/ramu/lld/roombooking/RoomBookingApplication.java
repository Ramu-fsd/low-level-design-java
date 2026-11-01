package com.ramu.lld.roombooking;


import java.util.Scanner;

public class RoomBookingApplication {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.roombooking.Hotel com.ramu.lld.roombooking.Room Booking System ===");
            System.out.println("1. View All Rooms");
            System.out.println("2. View Available Rooms");
            System.out.println("3. Book com.ramu.lld.roombooking.Room");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    hotel.showAllRooms();
                    break;
                case 2:
                    hotel.showAvailableRooms();
                    break;
                case 3:
                    System.out.print("Enter room number: ");
                    int roomNum = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact number: ");
                    String contact = scanner.nextLine();
                    hotel.bookRoom(roomNum, new Customer(name, contact));
                    break;
                case 4:
                    System.out.print("Enter room number to cancel: ");
                    int cancelRoom = scanner.nextInt();
                    hotel.cancelBooking(cancelRoom);
                    break;
                case 5:
                    System.out.println("Thank you for using com.ramu.lld.roombooking.Hotel Booking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
