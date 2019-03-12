package com.codecool.car_race;

//TODO MVC
//TODO packages: vehicle and subclasses in one package, weather in another, race in another

import com.codecool.car_race.model.CarModel;
import com.codecool.car_race.model.MotorcycleModel;
import com.codecool.car_race.model.TruckModel;
import com.codecool.car_race.model.VehicleModel;

import static com.codecool.car_race.Race.NUMBER_OF_VEHICLES;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */

    private static VehicleModel[] createVehicles() {

        VehicleModel[] vehicles = new VehicleModel[NUMBER_OF_VEHICLES];
        int i = 0;
        while (i < NUMBER_OF_VEHICLES) {
            vehicles[i++] = new CarModel();
            vehicles[i++] = new MotorcycleModel();
            vehicles[i++] = new TruckModel();
        }
        return vehicles;
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */

    public static void main(String[] args) {
        Weather weather = new Weather();
        Race race = new Race(weather);
        race.addVehicles(createVehicles());
        race.simulateRace(race);
        race.printRaceResults();

    }
}
