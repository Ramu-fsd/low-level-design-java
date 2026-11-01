package com.ramu.lld.order;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String product, int quantity) {
        stock.put(product, stock.getOrDefault(product, 0) + quantity);
    }

    public boolean isAvailable(String product, int quantity) {
        return stock.getOrDefault(product, 0) >= quantity;
    }

    public void deduct(String product, int quantity) {
        if (isAvailable(product, quantity)) {
            stock.put(product, stock.get(product) - quantity);
        }
    }

    public void showInventory() {
        System.out.println("\n=== Inventory ===");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " units");
        }
    }
}
