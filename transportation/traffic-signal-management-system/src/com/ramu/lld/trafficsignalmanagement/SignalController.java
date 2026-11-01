package com.ramu.lld.trafficsignalmanagement;

import java.util.*;

public class SignalController implements Runnable {
    private final List<TrafficSignal> signals;
    private final int greenDuration = 5;   // in seconds
    private final int yellowDuration = 2;

    public SignalController() {
        signals = new ArrayList<>();
        signals.add(new TrafficSignal("North"));
        signals.add(new TrafficSignal("East"));
        signals.add(new TrafficSignal("South"));
        signals.add(new TrafficSignal("West"));
    }

    public void run() {
        int index = 0;
        while (true) {
            try {
                for (int i = 0; i < signals.size(); i++) {
                    TrafficSignal current = signals.get(i);

                    if (i == index) {
                        current.setColor(SignalColor.GREEN);
                    } else {
                        current.setColor(SignalColor.RED);
                    }
                }

                displayAll();

                Thread.sleep(greenDuration * 1000);

                signals.get(index).setColor(SignalColor.YELLOW);
                if(index+1 < signals.size()) {
                    signals.get(index + 1).setColor(SignalColor.YELLOW);
                }else{
                    signals.get(0).setColor(SignalColor.YELLOW);
                }
                displayAll();
                Thread.sleep(yellowDuration * 1000);

                index = (index + 1) % signals.size();
            } catch (InterruptedException e) {
                System.out.println("Signal controller interrupted.");
                break;
            }
        }
    }

    private void displayAll() {
        System.out.println("\n--- Traffic Signal Status ---");
        for (TrafficSignal signal : signals) {
            signal.displayStatus();
        }
        System.out.println("-----------------------------");
    }
}
