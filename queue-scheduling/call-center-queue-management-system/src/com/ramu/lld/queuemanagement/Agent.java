package com.ramu.lld.queuemanagement;

public class Agent {
    private final int id;
    private final String name;
    private boolean isBusy;

    public Agent(int id, String name) {
        this.id = id;
        this.name = name;
        this.isBusy = false;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public boolean isBusy() { return isBusy; }

    public void assign() { isBusy = true; }

    public void release() { isBusy = false; }

    @Override
    public String toString() {
        return "com.ramu.lld.queuemanagement.Agent " + id + " - " + name + (isBusy ? " [Busy]" : " [Available]");
    }
}
