package com.ramu.lld.trafficsignalmanagement;

public class TrafficSignalManagementApp {
    public static void main(String[] args) {
        SignalController controller = new SignalController();
        Thread controllerThread = new Thread(controller);
        controllerThread.start();

        // Let it run for some time then exit
        try {
            Thread.sleep(60 * 1000); // run simulation for 60 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        controllerThread.interrupt();
        System.out.println("\nSimulation ended.");
    }
}
