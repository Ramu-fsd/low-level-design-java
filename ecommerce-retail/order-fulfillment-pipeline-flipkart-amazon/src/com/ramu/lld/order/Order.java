package com.ramu.lld.order;

public class Order {
    private static int counter = 1;

    private final int orderId;
    private final String product;
    private final int quantity;
    private String status;

    public Order(String product, int quantity) {
        this.orderId = counter++;
        this.product = product;
        this.quantity = quantity;
        this.status = "PLACED";
    }

    public int getOrderId() { return orderId; }
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "com.ramu.lld.order.Order #" + orderId + " | " + product + " x" + quantity + " | Status: " + status;
    }
}
