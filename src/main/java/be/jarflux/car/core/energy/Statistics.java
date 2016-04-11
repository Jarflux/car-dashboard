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
    private double avgSpeed = 65.20;
    private int totalDuration = 20;
    private int totalDistance = 20;
    private int totalConsumption = 350;
    private int avgConsumption = 200;
    private int battery = 85;

    public Statistics(){
        Random rd = new Random();
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
        consumption.add(rd.nextInt(800)-200);
    }

    public void change(){
        consumption.add(new Random().nextInt(800)-200);
        consumption.remove(0);
        switch(new Random().nextInt(9)){
            case 0: tripDuration = new Random().nextInt(500); break;
            case 1: tripDistance = new Random().nextInt(500); break;
            case 2: tripConsumption = new Random().nextInt(500);break;
            case 3: avgSpeed = new Random().nextDouble() * 270;break;
            case 4: totalDuration = new Random().nextInt(400);break;
            case 5: totalDistance = new Random().nextInt(50);break;
            case 6: totalConsumption = new Random().nextInt(1000) + 150;break;
            case 7: avgConsumption = new Random().nextInt(800)-200;break;
            case 8: battery = new Random().nextInt(100);break;
        }
    }

    public List<Integer> getConsumption() {
        return consumption;
    }

    public int getTripDuration() {
        return tripDuration;
    }

    public int getTripDistance() {
        return tripDistance;
    }

    public int getTripConsumption() {
        return tripConsumption;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public int getTotalConsumption() {
        return totalConsumption;
    }

    public int getAvgConsumption() {
        return avgConsumption;
    }

    public int getBattery() {
        return battery;
    }
}
