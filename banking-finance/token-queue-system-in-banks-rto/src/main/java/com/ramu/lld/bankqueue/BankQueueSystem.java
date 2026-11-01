package com.ramu.lld.bankqueue;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BankQueueSystem {
    private final Map<String, Queue<Token>> serviceQueues = new HashMap<>();
    private final List<Counter> counters = new ArrayList<>();
    private int tokenCounter = 1;

    public void registerService(String service) {
        serviceQueues.put(service, new LinkedList<>());
        System.out.println("Service registered: " + service);
    }

    public void addCounter(int counterId, String serviceType) {
        if (!serviceQueues.containsKey(serviceType)) {
            System.out.println("Service " + serviceType + " is not registered.");
            return;
        }
        counters.add(new Counter(counterId, serviceType));
        System.out.println("com.ramu.lld.bankqueue.Counter " + counterId + " added for service: " + serviceType);
    }

    public void generateToken(String customerName, String serviceType) {
        if (!serviceQueues.containsKey(serviceType)) {
            System.out.println("Invalid service type.");
            return;
        }
        Token token = new Token(tokenCounter++, serviceType, customerName);
        serviceQueues.get(serviceType).add(token);
        System.out.println("Generated token: " + token);
    }

    public void serveNextToken(int counterId) {
        for (Counter counter : counters) {
            if (counter.getCounterId() == counterId) {
                Queue<Token> queue = serviceQueues.get(counter.getServiceType());
                if (queue.isEmpty()) {
                    System.out.println("No tokens in queue for service: " + counter.getServiceType());
                } else {
                    Token token = queue.poll();
                    counter.serveToken(token);
                }
                return;
            }
        }
        System.out.println("Invalid counter ID.");
    }

    public void showAllQueues() {
        System.out.println("\n--- com.ramu.lld.bankqueue.Token Queues ---");
        for (Map.Entry<String, Queue<Token>> entry : serviceQueues.entrySet()) {
            System.out.println(entry.getKey() + " Queue: " + entry.getValue());
        }
    }
}
