package com.ramu.lld.voting;

public class Candidate {
    private final int id;
    private final String name;
    private int votes;

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.votes = 0;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getVotes() { return votes; }

    public void addVote() {
        votes++;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - Votes: " + votes;
    }
}
