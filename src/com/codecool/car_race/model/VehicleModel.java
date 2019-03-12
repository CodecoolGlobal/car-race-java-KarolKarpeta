package com.codecool.car_race.model;

public abstract class VehicleModel {
    public double distanceTraveled;
    public int speed;
    public String name;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
