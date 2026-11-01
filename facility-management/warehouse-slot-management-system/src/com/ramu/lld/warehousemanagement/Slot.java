package com.ramu.lld.warehousemanagement;

public class Slot {
    private final int id;
    private final SlotSize size;
    private Item item; // null = empty

    public Slot(int id, SlotSize size) {
        this.id = id;
        this.size = size;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public void assignItem(Item item) {
        this.item = item;
    }

    public void removeItem() {
        this.item = null;
    }

    public SlotSize getSize() {
        return size;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "com.ramu.lld.warehousemanagement.Slot " + id + " [" + size + "] - " + (item == null ? "Empty" : "Occupied by " + item.getName());
    }
}
