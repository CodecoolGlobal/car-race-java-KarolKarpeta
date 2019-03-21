package com.codecool.car_race.model;

import com.codecool.car_race.Race;
import com.codecool.car_race.Weather;

import java.util.Random;

public class MotorcycleModel extends VehicleModel {
    private static int motorcycleNumber = 1;

    private static final int MIN_SPEED_DECREASE = 5;
    private static final int MAX_SPEED_DECREASE = 46;
    private static final int NORMAL_MOTORCYCLE_SPEED = 100;

    public MotorcycleModel() {

        StringBuilder name = new StringBuilder("Motorcycle ");
        setName(name.append(motorcycleNumber).toString());
        motorcycleNumber++;
    }

    @Override
    public void prepareForLap(Race race) {
        Random randomNumber = new Random();

        if (Weather.isRaining()) {
            setSpeed(NORMAL_MOTORCYCLE_SPEED - MIN_SPEED_DECREASE - randomNumber.nextInt(MAX_SPEED_DECREASE));
        } else {
            setSpeed(NORMAL_MOTORCYCLE_SPEED);
        }
    }
}
