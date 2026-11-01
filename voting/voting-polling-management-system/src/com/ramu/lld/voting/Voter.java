package com.ramu.lld.voting;

public class Voter {
    private final String voterId;
    private boolean hasVoted;

    public Voter(String voterId) {
        this.voterId = voterId;
        this.hasVoted = false;
    }

    public String getVoterId() { return voterId; }

    public boolean hasVoted() { return hasVoted; }

    public void markVoted() {
        this.hasVoted = true;
    }
}
