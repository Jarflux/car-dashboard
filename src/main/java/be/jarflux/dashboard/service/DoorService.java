package be.jarflux.dashboard.service;

import be.jarflux.dashboard.core.DoorStatus;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class DoorService {

    private static DoorStatus doorStatus;

    public DoorService() {
        doorStatus = new DoorStatus();
    }

    public DoorStatus getDoorStatus(){
        return doorStatus;
    }

    public void tick(){
        doorStatus.tick();
    }

}
