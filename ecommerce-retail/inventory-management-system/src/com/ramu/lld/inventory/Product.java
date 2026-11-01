package com.ramu.lld.inventory;

public class Product {
    private String sku;
    private String name;
    private int quantity;
    private double price;
    private int threshold;

    public Product(String sku, String name, int quantity, double price, int threshold) {
        this.sku = sku;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.threshold = threshold;
    }

    public String getSku() { return sku; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public int getThreshold() { return threshold; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "SKU: " + sku + ", Name: " + name + ", Qty: " + quantity + ", Price: ₹" + price + ", Threshold: " + threshold;
    }
}
