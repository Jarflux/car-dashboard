package be.jarflux.car.core.energy;

/**
 * Developer: Ben Oeyen
 * Date: 06/04/16
 */
public class Seatbelt {
    private boolean locked;

    public Seatbelt(){
        locked = false;
    }

    public boolean isLocked() {
        return locked;
    }

    public void lock() {
        this.locked = true;
    }

    public void unlock() {
        this.locked = false;
    }
}
