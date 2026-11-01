package com.ramu.lld.trafficsignalmanagement;

public class TrafficSignal {
    private final String direction;
    private SignalColor color;

    public TrafficSignal(String direction) {
        this.direction = direction;
        this.color = SignalColor.RED;
    }

    public String getDirection() {
        return direction;
    }

    public SignalColor getColor() {
        return color;
    }

    public void setColor(SignalColor color) {
        this.color = color;
    }

    public void displayStatus() {
        System.out.println(direction + " Signal: " + color);
    }
}
