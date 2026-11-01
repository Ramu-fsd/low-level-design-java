package com.ramu.lld.pos;


import java.util.List;
import java.util.Scanner;

public class PosApplication {
    public static void main(String[] args) {
        List<Product> catalog = List.of(
            new Product(1, "Burger", 99.0),
            new Product(2, "Pizza", 199.0),
            new Product(3, "Coke", 49.0),
            new Product(4, "Fries", 79.0)
        );

        Cart cart = new Cart();
        POS pos = new POS();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.pos.POS System ===");
            System.out.println("1. Show Menu");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Menu ---");
                    catalog.forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    catalog.stream()
                        .filter(p -> p.getId() == pid)
                        .findFirst()
                        .ifPresentOrElse(
                            p -> cart.addItem(p, qty),
                            () -> System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product not found.")
                        );
                    break;
                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int rid = sc.nextInt();
                    cart.removeItem(rid);
                    break;
                case 4:
                    cart.showCart();
                    break;
                case 5:
                    pos.checkout(cart);
                    break;
                case 6:
                    System.out.println("Exiting com.ramu.lld.pos.POS...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
