package com.codecool.car_race;

public class Weather {

    private boolean rain = false;

    boolean isRaining() {
        return rain;
    }

    public boolean setRaining() {
        if (Math.random()*100 <= 30) {
            this.rain = true;
        } else {
            this.rain = false;
        }
        return rain;
    }


}
