package com.ramu.lld.order;

import java.util.Random;

public class PaymentGateway {
    public boolean processPayment(Order order) {
        // Simulate 90% success rate
        boolean success = new Random().nextInt(10) < 9;
        System.out.println(success
            ? "Payment successful for com.ramu.lld.order.Order #" + order.getOrderId()
            : "Payment failed for com.ramu.lld.order.Order #" + order.getOrderId());
        return success;
    }
}
