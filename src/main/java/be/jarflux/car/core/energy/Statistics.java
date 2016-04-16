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
    private List<Integer> distance = new ArrayList<>();
    private int tripDuration = 0;
    private int tripDistance = 0;
    private int tripConsumption = 0;
    private double avgSpeed = 65.20;
    private int totalDuration = 10;
    private int totalDistance = 10;
    private int totalConsumption = 1000;
    private int avgConsumption;
    private int battery = 85;

    private static transient final int SLOPE = 10;
    private transient int totalAmountOfPolls = 0;

    public Statistics() {
        consumption.add((200));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));
        consumption.add(calculateNumber(consumption.get(consumption.size() - 1)));

        distance.add(1);
        distance.add(2);
        distance.add(3);
        distance.add(4);
        distance.add(5);
        distance.add(6);
        distance.add(7);
        distance.add(8);
        distance.add(9);
        distance.add(10);
    }

    public int calculateNumber(int prev) {
        int number = prev + (new Random().nextInt(SLOPE) - (SLOPE / 2));
        return Math.min(600, Math.max(-200, number));
    }

    public void resetTrip() {
        tripConsumption = 0;
        tripDistance = 0;
        tripDuration = 0;
    }

    public void change() {
        totalAmountOfPolls++;
        tripDistance++;
        totalDistance++;
        tripDuration++;
        totalDuration++;

        int consumptionNumber = calculateNumber(consumption.get(consumption.size() - 1));
        tripConsumption += consumptionNumber;
        totalConsumption += consumptionNumber;

        consumption.add(consumptionNumber);
        consumption.remove(0);
        distance.add(totalDistance);
        distance.remove(0);
        switch (new Random().nextInt(1)) {
            case 0:
                avgSpeed = new Random().nextDouble() * 270;
                break;
            case 1:
                battery = new Random().nextInt(100);
                break;
        }
    }

    public List<Integer> getDistance() {
        return distance;
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
        return totalAmountOfPolls == 0 ? 0 : totalConsumption / totalAmountOfPolls;
    }

    public int getBattery() {
        return battery;
    }
}
