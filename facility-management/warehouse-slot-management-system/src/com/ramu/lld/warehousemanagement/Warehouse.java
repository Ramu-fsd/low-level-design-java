package com.ramu.lld.warehousemanagement;

import java.util.*;

public class Warehouse {
    private final List<Slot> slots = new ArrayList<>();

    public Warehouse() {
        // Initialize slots
        for (int i = 1; i <= 5; i++) slots.add(new Slot(i, SlotSize.SMALL));
        for (int i = 6; i <= 10; i++) slots.add(new Slot(i, SlotSize.MEDIUM));
        for (int i = 11; i <= 15; i++) slots.add(new Slot(i, SlotSize.LARGE));
    }

    public void showAllSlots() {
        for (Slot slot : slots) {
            System.out.println(slot);
        }
    }

    public boolean storeItem(Item item) {
        for (Slot slot : slots) {
            if (slot.isEmpty() && slot.getSize().ordinal() >= item.getRequiredSize().ordinal()) {
                slot.assignItem(item);
                System.out.println("Stored " + item.getName() + " in com.ramu.lld.warehousemanagement.Slot " + slot.getId());
                return true;
            }
        }
        System.out.println("No suitable slot found for item: " + item.getName());
        return false;
    }

    public boolean removeItem(int slotId) {
        for (Slot slot : slots) {
            if (slot.getId() == slotId && !slot.isEmpty()) {
                System.out.println("Removed item: " + slot.getItem().getName() + " from com.ramu.lld.warehousemanagement.Slot " + slotId);
                slot.removeItem();
                return true;
            }
        }
        System.out.println("Invalid or empty slot.");
        return false;
    }

    public void showEmptySlots() {
        System.out.println("Available Slots:");
        for (Slot slot : slots) {
            if (slot.isEmpty()) {
                System.out.println(slot);
            }
        }
    }
}
