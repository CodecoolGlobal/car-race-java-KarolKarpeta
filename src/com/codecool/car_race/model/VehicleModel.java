package com.codecool.car_race.model;

import com.codecool.car_race.Race;

public abstract class VehicleModel {
    private double distanceTraveled;
    private int speed;
    private String name;


    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getSpeed() {
        return speed;
    }


    public String getName() {
        return name;
    }

    public void setSpeed(int speed) {
        if (!(speed < 0 || speed > 1000)) {
            this.speed = speed;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveForAnHour() {
        distanceTraveled += speed;
    }

    abstract public void prepareForLap(Race race);


}
