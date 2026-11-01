package com.ramu.lld.queuemanagement;

import java.util.*;

public class CallCenter {
    private final List<Agent> agents = new ArrayList<>();
    private final Queue<Customer> customerQueue = new LinkedList<>();
    private int customerIdCounter = 1;

    public CallCenter() {
        // Add sample agents
        agents.add(new Agent(1, "Alice"));
        agents.add(new Agent(2, "Bob"));
        agents.add(new Agent(3, "Charlie"));
    }

    public void addCustomer(String name, boolean isVip) {
        Customer customer = new Customer(customerIdCounter++, name, isVip);
        if (isVip) {
            // VIPs go to front of the queue
            LinkedList<Customer> temp = (LinkedList<Customer>) customerQueue;
            temp.addFirst(customer);
        } else {
            customerQueue.add(customer);
        }
        System.out.println(customer + " added to queue.");
    }

    public void assignCalls() {
        for (Agent agent : agents) {
            if (!agent.isBusy() && !customerQueue.isEmpty()) {
                Customer customer = customerQueue.poll();
                agent.assign();
                System.out.println("Assigned " + customer + " to " + agent.getName());
            }
        }
    }

    public void releaseAgent(int agentId) {
        for (Agent agent : agents) {
            if (agent.getId() == agentId && agent.isBusy()) {
                agent.release();
                System.out.println("com.ramu.lld.queuemanagement.Agent " + agent.getName() + " is now available.");
                return;
            }
        }
        System.out.println("com.ramu.lld.queuemanagement.Agent not found or not busy.");
    }

    public void showAgents() {
        System.out.println("\n--- com.ramu.lld.queuemanagement.Agent Status ---");
        for (Agent agent : agents) {
            System.out.println(agent);
        }
    }

    public void showQueue() {
        System.out.println("\n--- Waiting Queue ---");
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
        } else {
            for (Customer customer : customerQueue) {
                System.out.println(customer);
            }
        }
    }
}
