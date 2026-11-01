package com.ramu.lld.queuemanagement;

import java.util.Scanner;

public class CallCenterQueueManagementApp {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Call Center Queue Management ===");
            System.out.println("1. Add com.ramu.lld.queuemanagement.Customer to Queue");
            System.out.println("2. Assign Calls to Available Agents");
            System.out.println("3. Mark com.ramu.lld.queuemanagement.Agent Call as Completed");
            System.out.println("4. Show com.ramu.lld.queuemanagement.Agent Status");
            System.out.println("5. Show Waiting Queue");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Is VIP (true/false): ");
                    boolean isVip = scanner.nextBoolean();
                    callCenter.addCustomer(name, isVip);
                    break;
                case 2:
                    callCenter.assignCalls();
                    break;
                case 3:
                    System.out.print("Enter agent ID to release: ");
                    int agentId = scanner.nextInt();
                    callCenter.releaseAgent(agentId);
                    break;
                case 4:
                    callCenter.showAgents();
                    break;
                case 5:
                    callCenter.showQueue();
                    break;
                case 6:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
