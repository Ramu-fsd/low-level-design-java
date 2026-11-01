package com.ramu.lld.warehousemanagement;

import java.util.Scanner;

public class WarehouseManagementApplication {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.warehousemanagement.Warehouse com.ramu.lld.warehousemanagement.Slot Management ===");
            System.out.println("1. View All Slots");
            System.out.println("2. View Empty Slots");
            System.out.println("3. Store com.ramu.lld.warehousemanagement.Item");
            System.out.println("4. Remove com.ramu.lld.warehousemanagement.Item");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    warehouse.showAllSlots();
                    break;
                case 2:
                    warehouse.showEmptySlots();
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item size (SMALL/MEDIUM/LARGE): ");
                    SlotSize size = SlotSize.valueOf(sc.nextLine().toUpperCase());
                    warehouse.storeItem(new Item(name, size));
                    break;
                case 4:
                    System.out.print("Enter slot ID to remove item: ");
                    int slotId = sc.nextInt();
                    warehouse.removeItem(slotId);
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
