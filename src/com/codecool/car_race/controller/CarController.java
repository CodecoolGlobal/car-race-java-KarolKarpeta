package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.model.CarModel;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.CarView;
import com.codecool.car_race.view.VehicleView;

public class CarController extends VehicleController {
    private CarModel carModel;
    private CarView carView;



    public CarController(VehicleModel vehicleModel, VehicleView vehicleView) {
        super(vehicleModel, vehicleView);
    }


}
