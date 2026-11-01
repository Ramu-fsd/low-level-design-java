package com.ramu.lld.tablemanagement;

import java.util.Scanner;

public class TableManagementApplication {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== com.ramu.lld.tablemanagement.Restaurant com.ramu.lld.tablemanagement.Table Management =====");
            System.out.println("1. Show All Tables");
            System.out.println("2. Reserve com.ramu.lld.tablemanagement.Table");
            System.out.println("3. Release com.ramu.lld.tablemanagement.Table");
            System.out.println("4. View Reserved Tables");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    restaurant.showTables();
                    break;
                case 2:
                    System.out.print("Enter guest count: ");
                    int guestCount = scanner.nextInt();
                    Table reserved = restaurant.reserveTable(guestCount);
                    if (reserved != null) {
                        System.out.println("Reserved " + reserved);
                    } else {
                        System.out.println("No suitable table available.");
                    }
                    break;
                case 3:
                    System.out.print("Enter table ID to release: ");
                    int tableId = scanner.nextInt();
                    boolean success = restaurant.releaseTable(tableId);
                    System.out.println(success ? "com.ramu.lld.tablemanagement.Table released." : "Invalid or already free.");
                    break;
                case 4:
                    System.out.println("Reserved Tables:");
                    for (Table t : restaurant.getReservedTables()) {
                        System.out.println(t);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
