package com.ramu.lld.bankqueue;

public class Token {
    private final int tokenNumber;
    private final String serviceType;
    private final String customerName;

    public Token(int tokenNumber, String serviceType, String customerName) {
        this.tokenNumber = tokenNumber;
        this.serviceType = serviceType;
        this.customerName = customerName;
    }

    public int getTokenNumber() { return tokenNumber; }

    public String getServiceType() { return serviceType; }

    public String getCustomerName() { return customerName; }

    @Override
    public String toString() {
        return "[com.ramu.lld.bankqueue.Token #" + tokenNumber + " | " + serviceType + " | " + customerName + "]";
    }
}
