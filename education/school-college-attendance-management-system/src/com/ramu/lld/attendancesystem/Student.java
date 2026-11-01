package com.ramu.lld.attendancesystem;

import java.util.*;

public class Student {
    private final int id;
    private final String name;
    private final Map<String, String> attendance = new HashMap<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void markAttendance(String date, String status) {
        attendance.put(date, status);
    }

    public String getAttendance(String date) {
        return attendance.getOrDefault(date, "Not Marked");
    }

    public double getAttendancePercentage() {
        long total = attendance.size();
        long present = attendance.values().stream().filter(s -> s.equalsIgnoreCase("Present")).count();
        return total == 0 ? 0 : (present * 100.0) / total;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public Map<String, String> getAllAttendance() {
        return attendance;
    }

    @Override
    public String toString() {
        return id + ". " + name + " | Attendance: " + String.format("%.2f", getAttendancePercentage()) + "%";
    }
}
