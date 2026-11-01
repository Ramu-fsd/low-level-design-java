package com.ramu.lld.seatallocation;

public class Classroom {
    private final int rows;
    private final int cols;
    private final Seat[][] seats;

    public Classroom(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        seats = new Seat[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat(i + 1, j + 1);
            }
        }
    }

    public boolean allocateSeat(Student student) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!seats[i][j].isOccupied()) {
                    seats[i][j].assignStudent(student);
                    System.out.println("Allocated seat [" + (i+1) + "," + (j+1) + "] to " + student.getName());
                    return true;
                }
            }
        }
        System.out.println("No available seats for student: " + student.getName());
        return false;
    }

    public void displaySeatingPlan() {
        System.out.println("\n=== Seating Plan ===");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + seats[i][j].getDisplay() + "]\t");
            }
            System.out.println();
        }
    }
}
