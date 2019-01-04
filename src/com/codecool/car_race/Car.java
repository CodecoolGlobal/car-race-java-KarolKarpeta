package com.codecool.car_race;

import java.util.Random;

public class Car {
    private int normalSpeed;
    String name;
    private double distanceTraveled = 0;

    public void prepareForLap(Race race) {
        Random randomNumber = new Random();
        int i = randomNumber.nextInt(31);
        this.normalSpeed = 80 + i;
    }

    public void moveForAnHour() {
        this.distanceTraveled = distanceTraveled + normalSpeed;
    }
}
