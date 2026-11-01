package com.ramu.lld.bedmanage;

import java.util.Scanner;

public class HospitalBedManagementApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.bedmanage.Hospital com.ramu.lld.bedmanage.Bed/ICU Management ===");
            System.out.println("1. Setup com.ramu.lld.bedmanage.Hospital Beds");
            System.out.println("2. Admit com.ramu.lld.bedmanage.Patient");
            System.out.println("3. Discharge com.ramu.lld.bedmanage.Patient");
            System.out.println("4. Show com.ramu.lld.bedmanage.Bed Status");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter number of General Beds: ");
                    int g = sc.nextInt();
                    System.out.print("Enter number of ICU Beds: ");
                    int i = sc.nextInt();
                    hospital.setupBeds(g, i);
                    break;
                case 2:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Is critical (true/false): ");
                    boolean critical = sc.nextBoolean();
                    hospital.admitPatient(name, critical);
                    break;
                case 3:
                    System.out.print("Enter bed number to discharge: ");
                    int bedNum = sc.nextInt();
                    hospital.dischargePatient(bedNum);
                    break;
                case 4:
                    hospital.showBedStatus();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
