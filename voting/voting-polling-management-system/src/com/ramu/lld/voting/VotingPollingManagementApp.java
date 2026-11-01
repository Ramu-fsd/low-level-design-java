package com.ramu.lld.voting;

import java.util.Scanner;

public class VotingPollingManagementApp {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Voting / Polling System ===");
            System.out.println("1. View Candidates");
            System.out.println("2. Cast Vote");
            System.out.println("3. Show Results");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    votingSystem.showCandidates();
                    break;
                case 2:
                    System.out.print("Enter your com.ramu.lld.voting.Voter ID: ");
                    String voterId = scanner.nextLine();
                    votingSystem.showCandidates();
                    System.out.print("Enter candidate ID to vote: ");
                    int candidateId = scanner.nextInt();
                    votingSystem.vote(voterId, candidateId);
                    break;
                case 3:
                    votingSystem.showResults();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
