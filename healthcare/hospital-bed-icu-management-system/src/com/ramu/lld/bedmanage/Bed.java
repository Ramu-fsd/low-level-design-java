package com.ramu.lld.bedmanage;

public class Bed {
    private final int bedNumber;
    private final boolean isIcu;
    private Patient patient;

    public Bed(int bedNumber, boolean isIcu) {
        this.bedNumber = bedNumber;
        this.isIcu = isIcu;
        this.patient = null;
    }

    public boolean isOccupied() {
        return patient != null;
    }

    public boolean isIcu() {
        return isIcu;
    }

    public void assignPatient(Patient patient) {
        this.patient = patient;
    }

    public void discharge() {
        this.patient = null;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public String getStatus() {
        if (isOccupied()) {
            return "[Occupied by: " + patient.getName() + "]";
        }
        return "[Available]";
    }

    @Override
    public String toString() {
        return "com.ramu.lld.bedmanage.Bed #" + bedNumber + " (" + (isIcu ? "ICU" : "General") + ") - " + getStatus();
    }
}
