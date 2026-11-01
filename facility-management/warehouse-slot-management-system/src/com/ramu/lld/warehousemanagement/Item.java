package com.ramu.lld.warehousemanagement;

public class Item {
    private final String name;
    private final SlotSize requiredSize;

    public Item(String name, SlotSize requiredSize) {
        this.name = name;
        this.requiredSize = requiredSize;
    }

    public String getName() {
        return name;
    }

    public SlotSize getRequiredSize() {
        return requiredSize;
    }

    @Override
    public String toString() {
        return name + " [" + requiredSize + "]";
    }
}
