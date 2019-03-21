package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.Weather;
import com.codecool.car_race.model.MotorcycleModel;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.MotorcycleView;
import com.codecool.car_race.view.VehicleView;

import java.util.Random;

public class MotorcycleController extends VehicleController {



    private MotorcycleModel motorcycleModel;
    private MotorcycleView motorcycleView;

    public MotorcycleController(VehicleModel vehicleModel, VehicleView vehicleView) {
        super(vehicleModel, vehicleView);
    }


}
