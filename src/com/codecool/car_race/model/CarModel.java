package com.codecool.car_race.model;

import java.util.Random;

public class CarModel extends VehicleModel {
    private static final int MIN_CAR_SPEED = 80;
    private static final int CAR_SPEED_DIFFERENCE_RANGE = 31;
    private static final int NUMBER_OF_NAMES = 20;

    int normalSpeed;

    static String[] names = {"Warrior", "Paragon", "Climax", "Aeon", "Passion", "Presence", "Mastery", "Rune", "Sanctuary", "Ethereal", "Charm", "Avalanche", "Eminance", "Augury", "Mastery", "Storm", "Method", "Daydream", "Realm", "Vision"};

    public CarModel() {
        Random random = new Random();
        int k = random.nextInt(NUMBER_OF_NAMES);
        int l = random.nextInt(NUMBER_OF_NAMES);

        String name1 = names[k];
        String name2 = names[l];

        String finalName = new StringBuilder().append(name1).append(" ").append(name2).toString();
        setName(finalName);

        normalSpeed = random.nextInt(CAR_SPEED_DIFFERENCE_RANGE) + MIN_CAR_SPEED; // car speed is between 80 and 110 km/h
        setSpeed(normalSpeed);
    }}
