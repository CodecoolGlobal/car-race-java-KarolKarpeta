package com.codecool.car_race.controller;

import com.codecool.car_race.Race;
import com.codecool.car_race.model.TruckModel;
import com.codecool.car_race.model.VehicleModel;
import com.codecool.car_race.view.TruckView;
import com.codecool.car_race.view.VehicleView;

public class TruckController extends VehicleController {
    private TruckModel truckModel;
    private TruckView truckView;



    public TruckController(VehicleModel vehicleModel, VehicleView vehicleView) {
        super(vehicleModel, vehicleView);
    }




}
