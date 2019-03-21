package com.codecool.car_race.model;

import com.codecool.car_race.Race;

import java.util.Random;

public class CarModel extends VehicleModel {
    private static final int MIN_CAR_SPEED = 80;
    private static final int CAR_SPEED_DIFFERENCE_RANGE = 31;
//    private static final int NUMBER_OF_NAMES = 20;
    private static final int CAR_SPEED_WHEN_THERE_IS_A_BROKEN_TRUCK = 75;

    static String[] names = {"Warrior", "Paragon", "Climax", "Aeon", "Passion", "Presence", "Mastery", "Rune", "Sanctuary", "Ethereal", "Charm", "Avalanche", "Eminance", "Augury", "Mastery", "Storm", "Method", "Daydream", "Realm", "Vision"};

    public CarModel() {
        Random random = new Random();
        int k = random.nextInt(names.length);
        int l = random.nextInt(names.length);

        String name1 = names[k];
        String name2 = names[l];

        String finalName = new StringBuilder().append(name1).append(" ").append(name2).toString();
        setName(finalName);

 // car speed is between 80 and 110 km/h
        setSpeed(random.nextInt(CAR_SPEED_DIFFERENCE_RANGE) + MIN_CAR_SPEED);
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isThereABrokenTruck()) {
            setSpeed(CAR_SPEED_WHEN_THERE_IS_A_BROKEN_TRUCK);
        }
    }

}
