package com.ramu.lld.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private final Map<Integer, CartItem> cartItems = new HashMap<>();

    public void addToCart(Product product, int quantity) {
        CartItem existing = cartItems.get(product.getId());
        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + quantity);
        } else {
            cartItems.put(product.getId(), new CartItem(product, quantity));
        }
        System.out.println("Added " + quantity + " of " + product.getName());
    }

    public void removeFromCart(int productId) {
        if (cartItems.remove(productId) != null) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not in cart.");
        }
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Your Cart:");
        cartItems.values().forEach(System.out::println);
        System.out.println("Total: ₹" + calculateTotal());
    }

    public double calculateTotal() {
        return cartItems.values().stream().mapToDouble(CartItem::getTotalPrice).sum();
    }

    public void checkout() {
        viewCart();
        System.out.println("Checkout complete. Thank you!");
        cartItems.clear();
    }
}
