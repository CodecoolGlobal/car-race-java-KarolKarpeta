package com.codecool.car_race;

import com.codecool.car_race.model.TruckModel;
import com.codecool.car_race.model.VehicleModel;

public class Race {

    private static final int NUMBER_OF_HOURS_PER_RACE = 50;
    static final int NUMBER_OF_VEHICLES = 30;

    Weather weather;
    private VehicleModel[] vehicles;


    public Race(Weather weather) {
        this.weather = weather;
    }

    void simulateRace(Race race) {

        for (int i = 0; i < NUMBER_OF_HOURS_PER_RACE; i++) {

            weather.checkWhetherItIsRaining();
            for (int j = 0; j < NUMBER_OF_VEHICLES; j++) {
                vehicles[j].prepareForLap(race);
                vehicles[j].moveForAnHour();
            }
        }
    }

    void printRaceResults() {
        for (VehicleModel vehicle : vehicles) {
            System.out.println(vehicle.getName());
            System.out.println(vehicle.getDistanceTraveled() + "\n");
        }
    }

    public boolean isThereABrokenTruck() {
        boolean isAnyTruckBroken = false;

        for (VehicleModel vehicle : vehicles) {
            if (vehicle instanceof TruckModel && ((TruckModel) vehicle).getIsBroken() == true) {
                isAnyTruckBroken = true;
                break;
            }

        }
        if (isAnyTruckBroken) {
            return true;
        } else return false;

    }

    public void addVehicles(VehicleModel[] vehicles) {
        this.vehicles = vehicles;
    }

}
