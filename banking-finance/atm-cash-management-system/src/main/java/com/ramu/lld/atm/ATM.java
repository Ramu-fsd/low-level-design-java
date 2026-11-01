package com.ramu.lld.atm;

import java.util.LinkedHashMap;
import java.util.Map;

public class ATM {
    private final Map<Integer, Integer> cashInventory;

    public ATM() {
        // Maintain in descending order for withdrawal optimization
        cashInventory = new LinkedHashMap<>();
        cashInventory.put(2000, 0);
        cashInventory.put(500, 0);
        cashInventory.put(100, 0);
    }

    public void depositCash(int note, int count) {
        if (!cashInventory.containsKey(note)) {
            System.out.println("Invalid denomination.");
            return;
        }
        cashInventory.put(note, cashInventory.get(note) + count);
        System.out.println("Deposited " + count + " x ₹" + note);
    }

    public void showBalance() {
        System.out.println("\n=== com.ramu.lld.atm.ATM Balance ===");
        int total = 0;
        for (Map.Entry<Integer, Integer> entry : cashInventory.entrySet()) {
            int denomination = entry.getKey();
            int count = entry.getValue();
            int amount = denomination * count;
            total += amount;
            System.out.println("₹" + denomination + " x " + count + " = ₹" + amount);
        }
        System.out.println("Total Balance: ₹" + total);
    }

    public void withdrawCash(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Invalid amount. Must be multiple of 100.");
            return;
        }

        int remaining = amount;
        Map<Integer, Integer> tempInventory = new LinkedHashMap<>();

        for (int denomination : cashInventory.keySet()) {
            int availableNotes = cashInventory.get(denomination);
            int neededNotes = Math.min(remaining / denomination, availableNotes);
            if (neededNotes > 0) {
                tempInventory.put(denomination, neededNotes);
                remaining -= neededNotes * denomination;
            }
        }

        if (remaining == 0) {
            // Update actual inventory
            for (Map.Entry<Integer, Integer> entry : tempInventory.entrySet()) {
                int denom = entry.getKey();
                int used = entry.getValue();
                cashInventory.put(denom, cashInventory.get(denom) - used);
            }
            System.out.println("Withdrawal successful. Dispensed:");
            tempInventory.forEach((denom, cnt) -> System.out.println("₹" + denom + " x " + cnt));
        } else {
            System.out.println("Cannot dispense the requested amount with available notes.");
        }
    }
}
