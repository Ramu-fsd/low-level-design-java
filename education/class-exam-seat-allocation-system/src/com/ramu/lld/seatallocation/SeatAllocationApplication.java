package com.ramu.lld.seatallocation;

import java.util.Scanner;

public class SeatAllocationApplication {
    public static void main(String[] args) {
        ExamSeatAllocator allocator = new ExamSeatAllocator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Exam com.ramu.lld.seatallocation.Seat Allocation System ===");
            System.out.println("1. Create com.ramu.lld.seatallocation.Classroom");
            System.out.println("2. Register com.ramu.lld.seatallocation.com.ramu.lld.attendancesystem.Student");
            System.out.println("3. Allocate Seats");
            System.out.println("4. Show Seating Plan");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter rows: ");
                    int rows = sc.nextInt();
                    System.out.print("Enter columns: ");
                    int cols = sc.nextInt();
                    allocator.createClassroom(rows, cols);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    allocator.registerStudent(name);
                    break;
                case 3:
                    allocator.allocateSeats();
                    break;
                case 4:
                    allocator.showSeatingPlan();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
