package com.codecool.car_race;

public class Weather {

    private static final int PROBABILITY_OF_RAIN_IN_PERCENT = 30;

    private static boolean rain = false;

    public static boolean isRaining() {
        return rain;
    }

    public void checkWhetherItIsRaining() {
        rain = Math.random()*100 <= PROBABILITY_OF_RAIN_IN_PERCENT;
    }

}
