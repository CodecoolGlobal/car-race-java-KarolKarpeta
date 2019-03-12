package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.Weather;
import com.codecool.car_race.model.MotorcycleModel;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.MotorcycleView;
import com.codecool.car_race.view.VehicleView;

import java.util.Random;

public class MotorcycleController extends VehicleController {

    private static final int MIN_SPEED_DECREASE = 5;
    private static final int MAX_SPEED_DECREASE = 46;
    private static final int NORMAL_MOTORCYCLE_SPEED = 100;

    private MotorcycleModel motorcycleModel;
    private MotorcycleView motorcycleView;

    public MotorcycleController(VehicleModel vehicleModel, VehicleView vehicleView) {
        super(vehicleModel, vehicleView);
    }

    @Override
    void prepareForLap(Race race) {

        Random randomNumber = new Random();

        if (Weather.isRaining()) {
            motorcycleModel.setSpeed(NORMAL_MOTORCYCLE_SPEED - MIN_SPEED_DECREASE - randomNumber.nextInt(MAX_SPEED_DECREASE));
        } else {
            motorcycleModel.setSpeed(NORMAL_MOTORCYCLE_SPEED);
        }
    }
}
