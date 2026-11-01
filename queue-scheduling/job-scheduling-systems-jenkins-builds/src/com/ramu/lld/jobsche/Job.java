package com.ramu.lld.jobsche;

import java.util.Random;

public class Job implements Runnable {
    private final int jobId;
    private final String jobName;
    private volatile JobStatus status;
    private final int durationInSeconds;

    public Job(int jobId, String jobName, int durationInSeconds) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.durationInSeconds = durationInSeconds;
        this.status = JobStatus.SCHEDULED;
    }

    public int getJobId() { return jobId; }
    public String getJobName() { return jobName; }
    public JobStatus getStatus() { return status; }

    @Override
    public void run() {
        try {
            status = JobStatus.RUNNING;
            System.out.println("com.ramu.lld.jobsche.Job [" + jobName + "] started (ID: " + jobId + ")");
            Thread.sleep(durationInSeconds * 1000L);

            // Simulate random failure
            if (new Random().nextInt(10) < 2) {
                throw new RuntimeException("Simulated job failure.");
            }

            status = JobStatus.COMPLETED;
            System.out.println("com.ramu.lld.jobsche.Job [" + jobName + "] completed (ID: " + jobId + ")");
        } catch (Exception e) {
            status = JobStatus.FAILED;
            System.out.println("com.ramu.lld.jobsche.Job [" + jobName + "] failed (ID: " + jobId + "): " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "com.ramu.lld.jobsche.Job #" + jobId + " | " + jobName + " | Status: " + status;
    }
}
