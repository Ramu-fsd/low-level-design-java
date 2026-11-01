package com.ramu.lld.attendancesystem;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AttendanceSystem {
    private final List<Student> students = new ArrayList<>();
    private int studentIdCounter = 1;

    public void addStudent(String name) {
        students.add(new Student(studentIdCounter++, name));
        System.out.println("com.ramu.lld.seatallocation.com.ramu.lld.attendancesystem.Student added: " + name);
    }

    public void showAllStudents() {
        System.out.println("\n--- com.ramu.lld.seatallocation.com.ramu.lld.attendancesystem.Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void markAttendanceForAll(String date) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMarking attendance for date: " + date);

        for (Student s : students) {
            System.out.print("Is " + s.getName() + " present? (y/n): ");
            String input = sc.nextLine();
            s.markAttendance(date, input.equalsIgnoreCase("y") ? "Present" : "Absent");
        }

        System.out.println("Attendance marked for all students.");
    }

    public void viewAttendanceByStudent(int id) {
        Student student = getStudentById(id);
        if (student == null) {
            System.out.println("Invalid student ID.");
            return;
        }

        System.out.println("\n--- Attendance for " + student.getName() + " ---");
        for (Map.Entry<String, String> entry : student.getAllAttendance().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.printf("Attendance %%: %.2f%%\n", student.getAttendancePercentage());
    }

    private Student getStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}
