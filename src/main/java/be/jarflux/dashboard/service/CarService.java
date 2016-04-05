package be.jarflux.dashboard.service;

/**
 * Developer: Ben Oeyen
 * Date: 04/04/16
 */
public class CarService {

    private static int gear;
    private static final int MIN_GEAR = -1;
    private static final int MAX_GEAR = 6;

    private static int rpm;
    private static final int MIN_RPM = 0;
    private static final int MAX_RPM = 5000;

    private static final int MAX_SPEED = 240;

    private static final double avgFuelConsumption =  0.1657; // L/km

    private static double fuel;
    private static final double MAX_FUEL = 60.00; // Liter

    private static double carTemp;
    private static double aircoTemp;

    private static final double heatingSpeed = 0.1; //degrees/tick


    public CarService(){
        gear = 0;
        rpm = 0;
        carTemp = 19.00;
        aircoTemp = 19.00;
        fuel = 55.0;
    }

    public int getGear() {
        return gear;
    }

    public int getRPM() {
        return rpm;
    }

    public double getSpeed() {
        // Magic Speed Formula
        return ((double)rpm/(double)5000) * ((double)MAX_SPEED/(double)MAX_GEAR * gear);
    }

    public double getFuelConsumption(){
        // Magic FuelConsumption Formula
        return getSpeed() * avgFuelConsumption;
    }

    public boolean shiftUp() {
        if( gear +1 > MAX_GEAR ){
            return false;
        }else{
            gear++;
            return true;
        }
    }

    public boolean shiftDown() {
        if( gear -1 < MIN_GEAR ){
            return false;
        }else{
            gear--;
            return true;
        }
    }

    public boolean accelerate() {
        if( rpm + 100 > MAX_RPM ){
            return false;
        }else{
            rpm+=100;
            return true;
        }
    }

    public boolean brake() {
        if( rpm -100 < MIN_RPM ){
            return false;
        }else{
            gear-=100;
            return true;
        }
    }


    public void tick(){
        double diffTemp = aircoTemp - carTemp;
        if(!(Math.abs(diffTemp-1.0) <= 0.00001)){
           if(diffTemp > 0){
               carTemp += heatingSpeed;
           }else{
               carTemp -= heatingSpeed;
           }
        }

        fuel -= getFuelConsumption()/(double)3600;
    }

}
