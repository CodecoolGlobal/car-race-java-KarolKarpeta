package com.codecool.car_race;

public class Truck {
    private int name;
    private int breakdownTurnsLeft = 0;
    private double distanceTraveled;
    private int speed;

    void prepareForLap(Race race) {

        if (breakdownTurnsLeft == 0){
            if (Math.random()*100 <= 5) {
                this.speed = 0;
                this.breakdownTurnsLeft = 2;
            } else {
                this.speed = 100;
            }
        } else {
            breakdownTurnsLeft -= 1;
        }
    }

    void moveForAnHour() {
        this.distanceTraveled = distanceTraveled + speed;
    }

}
