package com.ramu.lld.bedmanage;

public class Patient {
    private final int id;
    private final String name;
    private final boolean isCritical;

    public Patient(int id, String name, boolean isCritical) {
        this.id = id;
        this.name = name;
        this.isCritical = isCritical;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public boolean isCritical() { return isCritical; }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", " + (isCritical ? "ICU" : "General") + ")";
    }
}
