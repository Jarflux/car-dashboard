package be.jarflux.car.core.energy;

import be.jarflux.car.core.energy.Door;

import java.util.Random;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class Doors {

    private Door frontLeft;
    private Door frontRight;
    private Door backLeft;
    private Door backRight;
    private Door trunk;
    private Door hood;

    public Doors(){
        frontLeft = new Door();
        frontRight = new Door();
        backLeft = new Door();
        backRight = new Door();
        trunk = new Door();
        hood = new Door();
    }

    public Door getFrontLeft() {
        return frontLeft;
    }

    public Door getFrontRight() {
        return frontRight;
    }

    public Door getBackLeft() {
        return backLeft;
    }

    public Door getBackRight() {
        return backRight;
    }

    public Door getTrunk() {
        return trunk;
    }

    public Door getHood() {
        return hood;
    }

    public void change(){
        switch(new Random().nextInt(6)){
            case 0: interact(frontLeft); break;
            case 1: interact(frontRight);break;
            case 2: interact(backLeft);break;
            case 3: interact(backRight);break;
            case 4: interact(trunk);break;
            case 5: interact(hood);break;
        }
    }

    private void interact(Door door){
        if(new Random().nextBoolean()){
            if(door.isLocked()){
                door.unlock();
            }else{
                door.lock();
            }
        }else{
            if(door.isOpen()){
                door.close();
            }else{
                door.open();
            }
        }
    }
}
