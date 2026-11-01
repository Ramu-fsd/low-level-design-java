package com.ramu.lld.tablemanagement;

import java.util.*;

public class Restaurant {
    private final List<Table> tables;

    public Restaurant() {
        this.tables = new ArrayList<>();
        initTables();
    }

    private void initTables() {
        // Sample: Create tables with varied capacities
        tables.add(new Table(1, 2));
        tables.add(new Table(2, 2));
        tables.add(new Table(3, 4));
        tables.add(new Table(4, 4));
        tables.add(new Table(5, 6));
    }

    public void showTables() {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    public Table reserveTable(int guestCount) {
        for (Table table : tables) {
            if (!table.isReserved() && table.getCapacity() >= guestCount) {
                table.reserve();
                return table;
            }
        }
        return null;
    }

    public boolean releaseTable(int tableId) {
        for (Table table : tables) {
            if (table.getId() == tableId && table.isReserved()) {
                table.release();
                return true;
            }
        }
        return false;
    }

    public List<Table> getReservedTables() {
        List<Table> reserved = new ArrayList<>();
        for (Table table : tables) {
            if (table.isReserved()) {
                reserved.add(table);
            }
        }
        return reserved;
    }
}
