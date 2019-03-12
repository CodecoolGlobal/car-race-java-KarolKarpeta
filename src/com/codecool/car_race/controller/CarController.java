package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.model.CarModel;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.CarView;
import com.codecool.car_race.view.VehicleView;

public class CarController extends VehicleController {
    private CarModel carModel;
    private CarView carView;

    private static final int CAR_SPEED_WHEN_THERE_IS_A_BROKEN_TRUCK = 75;

    public CarController(VehicleModel vehicleModel, VehicleView vehicleView) {
        super(vehicleModel, vehicleView);
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            carModel.setSpeed(CAR_SPEED_WHEN_THERE_IS_A_BROKEN_TRUCK);
        }
    }
}
