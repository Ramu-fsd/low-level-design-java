package com.ramu.lld.attendancesystem;

import java.util.Scanner;

public class AttendanceApplication {
    public static void main(String[] args) {
        AttendanceSystem system = new AttendanceSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Attendance Management System ===");
            System.out.println("1. Add com.ramu.lld.seatallocation.com.ramu.lld.attendancesystem.Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Mark Attendance for All");
            System.out.println("4. View Attendance by com.ramu.lld.seatallocation.com.ramu.lld.attendancesystem.Student");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    system.addStudent(name);
                    break;
                case 2:
                    system.showAllStudents();
                    break;
                case 3:
                    System.out.print("Enter date (yyyy-MM-dd): ");
                    String date = sc.nextLine();
                    system.markAttendanceForAll(date);
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();
                    system.viewAttendanceByStudent(id);
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
