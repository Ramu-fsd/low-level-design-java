package com.ramu.lld.cardispatch;

import java.util.Scanner;

public class CarDispatchApplication {
    public static void main(String[] args) {
        CabService cabService = new CabService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Cab Dispatch System ===");
            System.out.println("1. Register com.ramu.lld.cardisp.Driver");
            System.out.println("2. List Drivers");
            System.out.println("3. Request Cab");
            System.out.println("4. End Trip");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (choice) {
                case 1:
                    System.out.print("Enter driver name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter location (number): ");
                    int location = sc.nextInt();
                    cabService.registerDriver(name, location);
                    break;
                case 2:
                    cabService.listDrivers();
                    break;
                case 3:
                    System.out.print("Enter customer name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter pickup location (number): ");
                    int pickup = sc.nextInt();
                    cabService.requestCab(cname, pickup);
                    break;
                case 4:
                    System.out.print("Enter driver ID: ");
                    int driverId = sc.nextInt();
                    System.out.print("Enter new location after trip: ");
                    int drop = sc.nextInt();
                    cabService.endTrip(driverId, drop);
                    break;
                case 5:
                    System.out.println("Thank you for using Cab Dispatch System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
