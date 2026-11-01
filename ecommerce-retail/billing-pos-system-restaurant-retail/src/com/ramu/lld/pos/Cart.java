package com.ramu.lld.pos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<Integer, CartItem> items = new HashMap<>();

    public void addItem(Product product, int quantity) {
        CartItem existing = items.get(product.getId());
        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + quantity);
        } else {
            items.put(product.getId(), new CartItem(product, quantity));
        }
        System.out.println("Added " + quantity + " x " + product.getName());
    }

    public void removeItem(int productId) {
        if (items.remove(productId) != null) {
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public Collection<CartItem> getItems() {
        return items.values();
    }

    public double getSubtotal() {
        return items.values().stream().mapToDouble(CartItem::getTotal).sum();
    }

    public void clear() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void showCart() {
        System.out.println("\n--- Cart Items ---");
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (CartItem item : items.values()) {
            System.out.println(item);
        }
        System.out.println("Subtotal: ₹" + getSubtotal());
    }
}
