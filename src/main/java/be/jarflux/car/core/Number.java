package be.jarflux.car.core;

import java.util.Random;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class Number {
    private double current = 0.00;
    private double min = 0.00;
    private double max = 240.00;

    public Number(double min, double max){
        this.min = min;
        this.max = max;
    }

    public void tick(){
        current = new Random().nextDouble() * max;
    }
}
