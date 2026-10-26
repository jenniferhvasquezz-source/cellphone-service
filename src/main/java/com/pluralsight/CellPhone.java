package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // --- Getters ---
    public int getSerialNumber() { return serialNumber; }
    public String getModel() { return model; }
    public String getCarrier() { return carrier; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getOwner() { return owner; }

    // --- Setters ---
    public void setSerialNumber (int serialNumber) { this.serialNUmber = serialNumber; }
    public void setModel(String model) { this.model = model; }

    }
}
