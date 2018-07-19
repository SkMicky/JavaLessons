package com.epam.michel;

public class Computers extends Electronics {

    private boolean moveable;
    private int countOfOZU;
    private int countOfMemory;
    private ProcessorType processorType;
    private VideoAdapterType videoAdapterType;
    private ComputersOSType osType;

    public boolean isMoveable() {
        return moveable;
    }

    public void setMoveable(boolean moveable) {
        this.moveable = moveable;
    }

    public int getCountOfOZU() {
        return countOfOZU;
    }

    public void setCountOfOZU(int countOfOZU) {
        this.countOfOZU = countOfOZU;
    }

    public int getCountOfMemory() {
        return countOfMemory;
    }

    public void setCountOfMemory(int countOfMemory) {
        this.countOfMemory = countOfMemory;
    }

    public ProcessorType getProcessorType() {
        return processorType;
    }

    public void setProcessorType(ProcessorType processorType) {
        this.processorType = processorType;
    }

    public VideoAdapterType getVideoAdapterType() {
        return videoAdapterType;
    }

    public void setVideoAdapterType(VideoAdapterType videoAdapterType) {
        this.videoAdapterType = videoAdapterType;
    }

    public ComputersOSType getOsType() {
        return osType;
    }

    public void setOsType(ComputersOSType osType) {
        this.osType = osType;
    }
}
