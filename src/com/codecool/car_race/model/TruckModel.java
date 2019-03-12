package com.codecool.car_race.model;

import java.util.Random;

public class TruckModel extends VehicleModel {

    private static final int MAX_TRUCK_NUMBER = 1001;

    public TruckModel() {
        Random randomNumber = new Random();
        setName(String.valueOf(randomNumber.nextInt(MAX_TRUCK_NUMBER)));
    }
}
