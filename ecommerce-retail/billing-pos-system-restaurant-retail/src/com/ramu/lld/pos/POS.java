package com.ramu.lld.pos;

public class POS {
    private static final double TAX_PERCENT = 18.0;

    public void checkout(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.");
            return;
        }

        System.out.println("\n===== INVOICE =====");
        cart.getItems().forEach(item -> System.out.println(item));

        double subtotal = cart.getSubtotal();
        double tax = subtotal * (TAX_PERCENT / 100.0);
        double total = subtotal + tax;

        System.out.printf("Subtotal: ₹%.2f\n", subtotal);
        System.out.printf("GST @ %.0f%%: ₹%.2f\n", TAX_PERCENT, tax);
        System.out.printf("Total: ₹%.2f\n", total);

        System.out.println("Payment received. Thank you!");
        cart.clear();
    }
}
