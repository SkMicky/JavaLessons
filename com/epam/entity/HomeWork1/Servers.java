package com.epam.michel;

public class Servers extends Computers {

    private int countOfSlotsForOZU;
    private int countOfSlotsForHDD;

    public int getCountOfSlotsForOZU() {
        return countOfSlotsForOZU;
    }

    public void setCountOfSlotsForOZU(int countOfSlotsForOZU) {
        this.countOfSlotsForOZU = countOfSlotsForOZU;
    }

    public int getCountOfSlotsForHDD() {
        return countOfSlotsForHDD;
    }

    public void setCountOfSlotsForHDD(int countOfSlotsForHDD) {
        this.countOfSlotsForHDD = countOfSlotsForHDD;
    }
}
