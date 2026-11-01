
package com.ramu.lld.bankqueue;

import java.util.Scanner;

public class TokenQueueSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankQueueSystem bankQueueSystem = new BankQueueSystem();

        // Initial service registration
        bankQueueSystem.registerService("ACCOUNT");
        bankQueueSystem.registerService("LOAN");
        bankQueueSystem.registerService("CASH");

        int choice;

        do {
            System.out.println("\n========== BANK TOKEN QUEUE SYSTEM ==========");
            System.out.println("1. Add Counter");
            System.out.println("2. Generate Token");
            System.out.println("3. Serve Next Token");
            System.out.println("4. Display All Queues");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Counter ID: ");
                    int counterId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Service Type (ACCOUNT/LOAN/CASH): ");
                    String counterService = scanner.nextLine().trim().toUpperCase();

                    bankQueueSystem.addCounter(counterId, counterService);
                    break;

                case 2:
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();

                    System.out.print("Enter Service Type (ACCOUNT/LOAN/CASH): ");
                    String tokenService = scanner.nextLine().trim().toUpperCase();

                    bankQueueSystem.generateToken(customerName, tokenService);
                    break;

                case 3:
                    System.out.print("Enter Counter ID: ");
                    int servingCounterId = scanner.nextInt();

                    bankQueueSystem.serveNextToken(servingCounterId);
                    break;

                case 4:
                    bankQueueSystem.showAllQueues();
                    break;

                case 5:
                    System.out.println("Exiting Bank Token Queue System...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
