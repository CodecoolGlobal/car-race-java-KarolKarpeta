package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Weather {
    int motorcycleNumber;
    String name;
    private double distanceTraveled;
    private int speed = 100;

    void prepareForLap(Race race) {
        Random randomNumber = new Random();
        int i = randomNumber.nextInt(46);
        i = i + 5;
        if (super.isRaining()) {
            this.speed = 100 - i;
        } else {
            this.speed = 100;
        }
    }

    void moveForAnHour() {
        this.distanceTraveled = distanceTraveled + speed;
    }
}
