package be.jarflux.car.core.energy;

import java.util.Random;

/**
 * Developer: Ben Oeyen
 * Date: 06/04/16
 */
public class Seatbelts {

    private Seatbelt frontLeft;
    private Seatbelt frontRight;
    private Seatbelt backLeft;
    private Seatbelt backCenter;
    private Seatbelt backRight;

    public Seatbelts() {
        frontLeft = new Seatbelt();
        frontRight = new Seatbelt();
        backLeft = new Seatbelt();
        backCenter = new Seatbelt();
        backRight = new Seatbelt();
    }

    public Seatbelt getFrontLeft() {
        return frontLeft;
    }

    public Seatbelt getFrontRight() {
        return frontRight;
    }

    public Seatbelt getBackLeft() {
        return backLeft;
    }

    public Seatbelt getBackCenter() {
        return backCenter;
    }

    public Seatbelt getBackRight() {
        return backRight;
    }

    public void change() {
        switch (new Random().nextInt(5)) {
            case 0:
                interact(frontLeft);
                break;
            case 1:
                interact(frontRight);
                break;
            case 2:
                interact(backLeft);
                break;
            case 3:
                interact(backCenter);
                break;
            case 4:
                interact(backRight);
                break;
        }
    }

    private void interact(Seatbelt seatbelt) {
        if (seatbelt.isLocked()) {
            seatbelt.unlock();
        } else {
            seatbelt.lock();
        }
    }
}
