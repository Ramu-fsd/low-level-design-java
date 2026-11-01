package com.ramu.lld.seatallocation;

import java.util.ArrayList;
import java.util.List;

public class ExamSeatAllocator {
    private final List<Student> students = new ArrayList<>();
    private Classroom classroom;
    private int studentIdCounter = 1;

    public void createClassroom(int rows, int cols) {
        classroom = new Classroom(rows, cols);
        System.out.println("Created classroom with " + rows + " rows and " + cols + " columns.");
    }

    public void registerStudent(String name) {
        Student student = new Student(studentIdCounter++, name);
        students.add(student);
        System.out.println("Registered student: " + student);
    }

    public void allocateSeats() {
        if (classroom == null) {
            System.out.println("com.ramu.lld.seatallocation.Classroom not initialized.");
            return;
        }

        for (Student student : students) {
            classroom.allocateSeat(student);
        }
    }

    public void showSeatingPlan() {
        if (classroom != null) {
            classroom.displaySeatingPlan();
        } else {
            System.out.println("No classroom initialized.");
        }
    }
}
