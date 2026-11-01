package com.ramu.lld.voting;

import java.util.*;

public class VotingSystem {
    private final Map<Integer, Candidate> candidates = new LinkedHashMap<>();
    private final Map<String, Voter> voters = new HashMap<>();

    public VotingSystem() {
        // Add sample candidates
        candidates.put(1, new Candidate(1, "Alice"));
        candidates.put(2, new Candidate(2, "Bob"));
        candidates.put(3, new Candidate(3, "Charlie"));
    }

    public void showCandidates() {
        System.out.println("\n=== Candidates ===");
        candidates.values().forEach(System.out::println);
    }

    public void vote(String voterId, int candidateId) {
        Voter voter = voters.getOrDefault(voterId, new Voter(voterId));
        if (voter.hasVoted()) {
            System.out.println("You have already voted.");
            return;
        }

        Candidate candidate = candidates.get(candidateId);
        if (candidate == null) {
            System.out.println("Invalid candidate ID.");
            return;
        }

        candidate.addVote();
        voter.markVoted();
        voters.put(voterId, voter);
        System.out.println("Vote cast successfully for " + candidate.getName());
    }

    public void showResults() {
        System.out.println("\n=== Voting Results ===");
        candidates.values().forEach(System.out::println);
    }
}
