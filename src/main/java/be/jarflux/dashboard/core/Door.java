package be.jarflux.dashboard.core;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
public class Door {
    private boolean locked;
    private boolean open;

    public Door(){
        locked = false;
        open = false;
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

    public boolean isOpen() {
        return open;
    }

    public void open() {
        this.open = true;
    }

    public void close() {
        this.open = false;
    }
}
