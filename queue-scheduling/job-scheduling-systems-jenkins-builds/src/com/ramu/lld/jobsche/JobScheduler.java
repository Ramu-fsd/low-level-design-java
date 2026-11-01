package com.ramu.lld.jobsche;

import java.util.*;
import java.util.concurrent.*;

public class JobScheduler {
    private final Map<Integer, Job> jobMap = new ConcurrentHashMap<>();
    private final ScheduledExecutorService executorService;
    private int jobIdCounter = 1;

    public JobScheduler(int threadPoolSize) {
        executorService = Executors.newScheduledThreadPool(threadPoolSize);
    }

    public int scheduleJob(String jobName, int durationSec, int delaySec) {
        int jobId = jobIdCounter++;
        Job job = new Job(jobId, jobName, durationSec);
        jobMap.put(jobId, job);

        executorService.schedule(job, delaySec, TimeUnit.SECONDS);
        System.out.println("Scheduled job [" + jobName + "] (ID: " + jobId + ") after " + delaySec + " sec");
        return jobId;
    }

    public void showAllJobs() {
        System.out.println("\n--- All Jobs ---");
        for (Job job : jobMap.values()) {
            System.out.println(job);
        }
    }

    public void shutdownScheduler() {
        executorService.shutdown();
        System.out.println("Scheduler shutdown initiated...");
    }
}
