package com.ramu.lld.cardispatch;

import java.util.*;

public class CabService {
    private final List<Driver> drivers = new ArrayList<>();
    private int driverCounter = 1;
    private int customerCounter = 1;

    public void registerDriver(String name, int location) {
        Driver driver = new Driver(driverCounter++, name, location);
        drivers.add(driver);
        System.out.println("com.ramu.lld.cardisp.Driver registered: " + driver);
    }

    public void listDrivers() {
        System.out.println("\n--- com.ramu.lld.cardisp.Driver List ---");
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }

    public void requestCab(String customerName, int pickupLocation) {
        Customer customer = new Customer(customerCounter++, customerName, pickupLocation);
        Driver nearestDriver = null;
        int minDistance = Integer.MAX_VALUE;

        for (Driver driver : drivers) {
            if (driver.isAvailable()) {
                int distance = Math.abs(driver.getLocation() - pickupLocation);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestDriver = driver;
                }
            }
        }

        if (nearestDriver == null) {
            System.out.println("No cabs available for " + customerName + " at the moment.");
            return;
        }

        nearestDriver.setAvailable(false);
        nearestDriver.updateLocation(pickupLocation); // Move driver to pickup location
        System.out.println("Cab assigned to " + customerName + " -> " + nearestDriver.getName() +
                           " (com.ramu.lld.cardisp.Driver ID: " + nearestDriver.getId() + ")");
    }

    public void endTrip(int driverId, int newLocation) {
        for (Driver driver : drivers) {
            if (driver.getId() == driverId) {
                if (driver.isAvailable()) {
                    System.out.println("com.ramu.lld.cardisp.Driver is not on a trip.");
                } else {
                    driver.setAvailable(true);
                    driver.updateLocation(newLocation);
                    System.out.println("Trip completed. com.ramu.lld.cardisp.Driver " + driver.getName() +
                                       " is now available at location " + newLocation);
                }
                return;
            }
        }
        System.out.println("com.ramu.lld.cardisp.Driver ID not found.");
    }
}
