package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.model.TruckModel;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.TruckView;
import com.codecool.car_race.view.VehicleView;

public class TruckController extends VehicleController {
    private TruckModel truckModel;
    private TruckView truckView;

    private static final int PROBABILITY_OF_BREAKING_IN_PERCENT = 5;
    private static final int TRUCK_NORMAL_SPEED = 100;

    private int breakdownTurnsLeft = 0;
    public boolean isBroken = false;

    public TruckController(VehicleModel vehicleModel, VehicleView vehicleView) {
        super(vehicleModel, vehicleView);
    }

    @Override
    void prepareForLap(Race race) {

        if (breakdownTurnsLeft == 0) {
            double randomNumberInRange0to1 = Math.random();
            if (randomNumberInRange0to1 * 100 <= PROBABILITY_OF_BREAKING_IN_PERCENT) {
                isBroken = true;
                truckModel.setSpeed(0);
                race.isThereABrokenTruck();
                breakdownTurnsLeft = 2;
            } else {
                isBroken = false;
                truckModel.setSpeed(TRUCK_NORMAL_SPEED);
            }
        } else {
            breakdownTurnsLeft -= 1;
        }
    }

    public boolean getIsBroken() {
        return isBroken;
    }

}
