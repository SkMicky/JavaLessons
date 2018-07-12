package com.epam.michel;

public class Gadgets extends Electronics {

    private double gadgetSize;
    private String videoQuality;
    private TypeOfGadgetsOS typeOfGadgetsOS;
    private int batteryCapacity;

    public double getGadgetSize() {
        return gadgetSize;
    }

    public void setGadgetSize(double gadgetSize) {
        this.gadgetSize = gadgetSize;
    }

    public String getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    public TypeOfGadgetsOS getTypeOfGadgetsOS() {
        return typeOfGadgetsOS;
    }

    public void setTypeOfGadgetsOS(TypeOfGadgetsOS typeOfGadgetsOS) {
        this.typeOfGadgetsOS = typeOfGadgetsOS;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
