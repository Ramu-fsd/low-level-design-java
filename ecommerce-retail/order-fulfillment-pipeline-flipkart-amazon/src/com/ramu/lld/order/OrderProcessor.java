package com.ramu.lld.order;

public class OrderProcessor {
    private final Inventory inventory;
    private final PaymentGateway paymentGateway;

    public OrderProcessor(Inventory inventory) {
        this.inventory = inventory;
        this.paymentGateway = new PaymentGateway();
    }

    public void processOrder(Order order) {
        System.out.println("\nProcessing " + order);

        // Step 1: Inventory Check
        if (!inventory.isAvailable(order.getProduct(), order.getQuantity())) {
            order.setStatus("FAILED: OUT OF STOCK");
            System.out.println("Inventory insufficient. com.ramu.lld.order.Order failed.");
            return;
        }

        // Step 2: Payment
        if (!paymentGateway.processPayment(order)) {
            order.setStatus("FAILED: PAYMENT DECLINED");
            return;
        }

        // Step 3: Deduct Inventory
        inventory.deduct(order.getProduct(), order.getQuantity());

        // Step 4: Pack & Dispatch
        System.out.println("Packing and dispatching com.ramu.lld.order.Order #" + order.getOrderId());

        // Step 5: Mark Delivered
        order.setStatus("DELIVERED");
        System.out.println("com.ramu.lld.order.Order #" + order.getOrderId() + " delivered.");
    }
}
