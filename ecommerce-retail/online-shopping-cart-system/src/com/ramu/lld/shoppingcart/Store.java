package com.ramu.lld.shoppingcart;

import java.util.*;

public class Store {
    private final List<Product> products = new ArrayList<>();

    public Store() {
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "Smartphone", 20000));
        products.add(new Product(3, "Headphones", 1500));
        products.add(new Product(4, "Keyboard", 999));
        products.add(new Product(5, "Mouse", 499));
    }

    public void listProducts() {
        System.out.println("Available Products:");
        products.forEach(System.out::println);
    }

    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
