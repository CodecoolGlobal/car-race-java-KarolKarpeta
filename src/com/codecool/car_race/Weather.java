package com.codecool.car_race;

public class Weather {

    private boolean rain = false;

    public boolean isRaining() {
        return rain;
    }

    public boolean setRaining() {
        if ((Math.random() * 100) <= 30) return true;
        else return false;
    }


}
