package com.ramu.lld.queuemanagement;

public class Customer {
    private final int id;
    private final String name;
    private final boolean isVip;

    public Customer(int id, String name, boolean isVip) {
        this.id = id;
        this.name = name;
        this.isVip = isVip;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public boolean isVip() { return isVip; }

    @Override
    public String toString() {
        return (isVip ? "[VIP] " : "") + "com.ramu.lld.queuemanagement.Customer ID: " + id + ", Name: " + name;
    }
}
