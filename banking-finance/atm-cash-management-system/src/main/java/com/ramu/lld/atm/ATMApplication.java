package com.ramu.lld.atm;
import java.util.Scanner;

public class ATMApplication {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.atm.ATM Cash Management System ===");
            System.out.println("1. Deposit Cash");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Show com.ramu.lld.atm.ATM Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter denomination (₹2000 / ₹500 / ₹100): ");
                    int denom = sc.nextInt();
                    System.out.print("Enter number of notes: ");
                    int count = sc.nextInt();
                    atm.depositCash(denom, count);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    int amount = sc.nextInt();
                    atm.withdrawCash(amount);
                    break;
                case 3:
                    atm.showBalance();
                    break;
                case 4:
                    System.out.println("Thank you! Exiting com.ramu.lld.atm.ATM...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
