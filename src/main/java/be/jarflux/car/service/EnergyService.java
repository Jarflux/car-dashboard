package be.jarflux.car.service;

import be.jarflux.car.core.energy.Doors;
import be.jarflux.car.core.energy.Lights;
import be.jarflux.car.core.energy.Seatbelts;
import be.jarflux.car.core.energy.Statistics;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class EnergyService {

    private static Doors doors;
    private static Seatbelts seatbelts;
    private static Statistics statistics;
    private static Lights lights;

    public EnergyService() {
        doors = new Doors();
        seatbelts = new Seatbelts();
        statistics = new Statistics();
        lights = new Lights();
    }

    public Doors getDoors() {
        return doors;
    }

    public Seatbelts getSeatbelts() {
        return seatbelts;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public Lights getLights() {
        return lights;
    }

}
