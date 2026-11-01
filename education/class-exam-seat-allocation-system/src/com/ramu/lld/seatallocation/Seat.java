package com.ramu.lld.seatallocation;

public class Seat {
    private final int row;
    private final int col;
    private Student student;

    public Seat(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public boolean isOccupied() {
        return student != null;
    }

    public void assignStudent(Student student) {
        this.student = student;
    }

    public String getDisplay() {
        return isOccupied() ? student.getName() : "Empty";
    }

    @Override
    public String toString() {
        return "com.ramu.lld.seatallocation.Seat [" + row + "," + col + "]: " + (student != null ? student.getName() : "Empty");
    }
}
