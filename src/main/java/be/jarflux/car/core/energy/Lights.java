package be.jarflux.car.core.energy;

/**
 * Developer: Ben Oeyen
 * Date: 06/04/16
 */
public class Lights {

    private boolean automatic = false;
    private boolean turnSignalLeft = false;
    private boolean turnSignalRight = false;
    private boolean fogLamps = false;
    private boolean lowBeam = false;
    private boolean highBeam = true;
    private int position = 0;

    public Lights(){

    }

    public void change(){

    }

    public boolean isAutomatic() {
        return automatic;
    }

    public boolean isTurnSignalLeft() {
        return turnSignalLeft;
    }

    public boolean isTurnSignalRight() {
        return turnSignalRight;
    }

    public boolean isFogLamps() {
        return fogLamps;
    }

    public boolean isLowBeam() {
        return lowBeam;
    }

    public boolean isHighBeam() {
        return highBeam;
    }

    public int getPosition() {
        return position;
    }
}
