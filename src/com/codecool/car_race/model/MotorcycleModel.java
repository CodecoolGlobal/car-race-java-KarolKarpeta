package com.codecool.car_race.model;

public class MotorcycleModel extends VehicleModel {
    private static int motorcycleNumber = 1;

    public MotorcycleModel() {

        StringBuilder name = new StringBuilder("Motorcycle ");
        setName(name.append(motorcycleNumber).toString());
        motorcycleNumber += 1;
    }
}
