package com.ramu.lld.jobsche;

import java.util.Scanner;

public class JobSchedulingApplication {
    public static void main(String[] args) {
        JobScheduler scheduler = new JobScheduler(5);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== com.ramu.lld.jobsche.Job Scheduling System ===");
            System.out.println("1. Schedule com.ramu.lld.jobsche.Job");
            System.out.println("2. View All Jobs");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter com.ramu.lld.jobsche.Job Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter com.ramu.lld.jobsche.Job Duration (sec): ");
                    int duration = sc.nextInt();
                    System.out.print("Enter Delay Before Start (sec): ");
                    int delay = sc.nextInt();

                    scheduler.scheduleJob(name, duration, delay);
                    break;
                case 2:
                    scheduler.showAllJobs();
                    break;
                case 3:
                    scheduler.shutdownScheduler();
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
