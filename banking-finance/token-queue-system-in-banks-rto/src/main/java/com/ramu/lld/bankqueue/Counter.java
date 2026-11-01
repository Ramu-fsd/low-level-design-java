package com.ramu.lld.bankqueue;

public class Counter {
    private final int counterId;
    private final String serviceType;

    public Counter(int counterId, String serviceType) {
        this.counterId = counterId;
        this.serviceType = serviceType;
    }

    public int getCounterId() {
        return counterId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void serveToken(Token token) {
        System.out.println("com.ramu.lld.bankqueue.Counter " + counterId + " serving " + token);
    }
}
