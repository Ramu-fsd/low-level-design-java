package com.ramu.lld.inventory;

import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Inventory Management ====");
            System.out.println("1. Add com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product");
            System.out.println("2. Update Stock");
            System.out.println("3. View All Products");
            System.out.println("4. Delete com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product");
            System.out.println("5. Low Stock Alert");
            System.out.println("6. Search com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter SKU: ");
                    String sku = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Threshold: ");
                    int threshold = sc.nextInt();
                    manager.addProduct(new Product(sku, name, qty, price, threshold));
                    break;
                case 2:
                    System.out.print("Enter SKU: ");
                    sku = sc.nextLine();
                    System.out.print("Enter Quantity to Add (+ve) or Reduce (-ve): ");
                    qty = sc.nextInt();
                    manager.updateStock(sku, qty);
                    break;
                case 3:
                    manager.viewAllProducts();
                    break;
                case 4:
                    System.out.print("Enter SKU to delete: ");
                    sku = sc.nextLine();
                    manager.deleteProduct(sku);
                    break;
                case 5:
                    manager.showLowStockProducts();
                    break;
                case 6:
                    System.out.print("Enter SKU or name to search: ");
                    String key = sc.nextLine();
                    manager.searchProduct(key);
                    break;
                case 7:
                    System.out.println("Exiting system...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
