package be.jarflux.car.core.energy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Developer: Ben Oeyen
 * Date: 06/04/16
 */
public class Statistics {

    private List<Integer> consumption = new ArrayList<>();
    private int tripDuration = 100;
    private int tripDistance = 250;
    private int tripConsumption = 350;
    private double avgSpeed = 65;
    private int totalDuration = 20;
    private int totalDistance = 20;
    private int totalConsumption = 350;
    private int avgConsumption = 200;

    public Statistics(){
        Random rd = new Random();
        consumption.add(rd.nextInt(500));
        consumption.add(rd.nextInt(500));
        consumption.add(rd.nextInt(500));
        consumption.add(rd.nextInt(500));
        consumption.add(rd.nextInt(500));
        consumption.add(rd.nextInt(500));
        consumption.add(rd.nextInt(500));
    }

}