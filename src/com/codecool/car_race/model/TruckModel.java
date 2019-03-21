package com.codecool.car_race.model;

import com.codecool.car_race.Race;

import java.util.Random;

public class TruckModel extends VehicleModel {

    private static final int MAX_TRUCK_NUMBER = 1001;

    private static final int PROBABILITY_OF_BREAKING_IN_PERCENT = 5;
    private static final int TRUCK_NORMAL_SPEED = 100;

    private int breakdownTurnsLeft = 0;
    private boolean isBroken = false;

    public TruckModel() {
        Random randomNumber = new Random();
        setName(String.valueOf(randomNumber.nextInt(MAX_TRUCK_NUMBER)));
    }

    private void setBroken(boolean broken) {
        isBroken = broken;
    }

    public boolean getIsBroken() {
        return isBroken;
    }

    @Override
    public void prepareForLap(Race race) {

        if (breakdownTurnsLeft == 0) {
            double randomNumberInRange0to1 = Math.random();
            if (randomNumberInRange0to1 * 100 <= PROBABILITY_OF_BREAKING_IN_PERCENT) {
                setBroken(true);
                setSpeed(0);
                race.isThereABrokenTruck();
                breakdownTurnsLeft = 2;
            } else {
                setBroken(false);
                setSpeed(TRUCK_NORMAL_SPEED);
            }
        } else {
            breakdownTurnsLeft--;
        }
    }
}
