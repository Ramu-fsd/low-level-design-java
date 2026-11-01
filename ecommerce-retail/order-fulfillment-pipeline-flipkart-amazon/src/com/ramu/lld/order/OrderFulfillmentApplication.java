package com.ramu.lld.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderFulfillmentApplication {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        OrderProcessor processor = new OrderProcessor(inventory);
        List<Order> orders = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // Seed some products
        inventory.addProduct("Mobile", 10);
        inventory.addProduct("Laptop", 5);
        inventory.addProduct("Book", 20);

        while (true) {
            System.out.println("\n=== com.ramu.lld.order.Order Fulfillment System ===");
            System.out.println("1. Place com.ramu.lld.order.Order");
            System.out.println("2. Show Inventory");
            System.out.println("3. Show Orders");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String product = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    Order order = new Order(product, qty);
                    processor.processOrder(order);
                    orders.add(order);
                    break;
                case 2:
                    inventory.showInventory();
                    break;
                case 3:
                    System.out.println("\n=== com.ramu.lld.order.Order History ===");
                    for (Order o : orders) {
                        System.out.println(o);
                    }
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
