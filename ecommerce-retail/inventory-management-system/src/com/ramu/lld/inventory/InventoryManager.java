package com.ramu.lld.inventory;


import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getSku())) {
            System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product with SKU already exists.");
        } else {
            inventory.put(product.getSku(), product);
            System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product added.");
        }
    }

    public void updateStock(String sku, int quantity) {
        Product product = inventory.get(sku);
        if (product != null) {
            product.setQuantity(product.getQuantity() + quantity);
            System.out.println("Stock updated.");
        } else {
            System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product not found.");
        }
    }

    public void deleteProduct(String sku) {
        if (inventory.remove(sku) != null) {
            System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product deleted.");
        } else {
            System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product not found.");
        }
    }

    public void viewAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            inventory.values().forEach(System.out::println);
        }
    }

    public void showLowStockProducts() {
        boolean found = false;
        for (Product product : inventory.values()) {
            if (product.getQuantity() < product.getThreshold()) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) System.out.println("No low-stock items.");
    }

    public void searchProduct(String keyword) {
        for (Product product : inventory.values()) {
            if (product.getSku().equalsIgnoreCase(keyword) || product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("com.ramu.lld.pos.com.ramu.lld.inventory.com.ramu.lld.shoppingcart.Product not found.");
    }
}
