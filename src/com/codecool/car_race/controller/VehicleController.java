package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.VehicleView;

public abstract class VehicleController {
    private VehicleModel vehicleModel;
    private VehicleView vehicleView;

    public VehicleController(VehicleModel vehicleModel, VehicleView vehicleView) {
        this.vehicleModel = vehicleModel;
        this.vehicleView = vehicleView;
    }

    public void moveForAnHour() {
        vehicleModel.distanceTraveled += vehicleModel.speed;
    }

    abstract void prepareForLap(Race race);

    public double getDistanceTraveled() {
        return vehicleModel.distanceTraveled;
    }

}
