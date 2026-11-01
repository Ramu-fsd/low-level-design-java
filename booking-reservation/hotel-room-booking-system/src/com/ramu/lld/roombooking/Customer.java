package com.ramu.lld.roombooking;

public class Customer {
    private final String name;
    private final String contact;

    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return name + " (Contact: " + contact + ")";
    }
}
