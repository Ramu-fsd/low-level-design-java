package com.ramu.lld.shoppingcart;

import java.util.Scanner;

public class ShoppingCartApplication {
    public static void main(String[] args) {
        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Online Shopping ===");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    store.listProducts();
                    break;
                case 2:
                    System.out.print("Enter com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    Product prod = store.getProductById(pid);
                    if (prod != null) {
                        cart.addToCart(prod, qty);
                    } else {
                        System.out.println("Invalid product ID.");
                    }
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    System.out.print("Enter com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product ID to remove: ");
                    int removeId = sc.nextInt();
                    cart.removeFromCart(removeId);
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
