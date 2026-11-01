package com.ramu.lld.bedmanage;

import java.util.*;

public class Hospital {
    private final List<Bed> beds = new ArrayList<>();
    private int patientCounter = 1;

    public void setupBeds(int generalBeds, int icuBeds) {
        int bedNo = 1;
        for (int i = 0; i < generalBeds; i++) {
            beds.add(new Bed(bedNo++, false));
        }
        for (int i = 0; i < icuBeds; i++) {
            beds.add(new Bed(bedNo++, true));
        }
        System.out.println("com.ramu.lld.bedmanage.Hospital setup complete. Total Beds: " + beds.size());
    }

    public void admitPatient(String name, boolean isCritical) {
        Patient patient = new Patient(patientCounter++, name, isCritical);

        for (Bed bed : beds) {
            if (!bed.isOccupied() && bed.isIcu() == isCritical) {
                bed.assignPatient(patient);
                System.out.println("com.ramu.lld.bedmanage.Patient admitted: " + patient + " to com.ramu.lld.bedmanage.Bed #" + bed.getBedNumber());
                return;
            }
        }

        System.out.println("No available " + (isCritical ? "ICU" : "general") + " beds for " + name);
    }

    public void dischargePatient(int bedNumber) {
        for (Bed bed : beds) {
            if (bed.getBedNumber() == bedNumber && bed.isOccupied()) {
                System.out.println("Discharging patient: " + bed.toString());
                bed.discharge();
                return;
            }
        }
        System.out.println("Invalid bed number or bed is already empty.");
    }

    public void showBedStatus() {
        System.out.println("\n--- com.ramu.lld.bedmanage.Bed Status ---");
        for (Bed bed : beds) {
            System.out.println(bed);
        }
    }
}
