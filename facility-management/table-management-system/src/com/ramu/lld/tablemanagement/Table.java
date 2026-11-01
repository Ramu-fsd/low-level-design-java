package com.ramu.lld.tablemanagement;

public class Table {
    private final int id;
    private final int capacity;
    private boolean reserved;

    public Table(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.reserved = false;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        reserved = true;
    }

    public void release() {
        reserved = false;
    }

    @Override
    public String toString() {
        return "com.ramu.lld.tablemanagement.Table " + id + " [Capacity: " + capacity + "] - " + (reserved ? "Reserved" : "Available");
    }
}
