package com.ramu.lld.carparking;

import java.util.Scanner;

public class CarParkingSystemApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of parking slots: ");
        int capacity = scanner.nextInt();

        ParkingLot parkingLot = new ParkingLot(capacity);

        while (true) {
            System.out.println("\n1. Park Car\n2. Remove Car\n3. Display Status\n4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter registration number: ");
                    String regNumber = scanner.next();
                    parkingLot.parkCar(regNumber);
                    break;
                case 2:
                    System.out.print("Enter slot number to remove car: ");
                    int slot = scanner.nextInt();
                    parkingLot.removeCar(slot);
                    break;
                case 3:
                    parkingLot.displayStatus();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}