package be.jarflux.car.service;

import be.jarflux.car.core.energy.Doors;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class EnergyService {

    private static Doors doorStatus;

    public EnergyService() {
        doorStatus = new Doors();
    }

    public Doors getDoors(){
        return doorStatus;
    }

    public void tick(){
        doorStatus.tick();
    }

}
