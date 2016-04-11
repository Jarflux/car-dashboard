package be.jarflux.car.core.energy;

import java.util.Random;

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

    public void change(){
        switch(new Random().nextInt(7)){
            case 0: automatic = !automatic; break;
            case 1: turnSignalLeft = !turnSignalLeft;break;
            case 2: turnSignalRight = !turnSignalRight;break;
            case 3: fogLamps = !fogLamps;break;
            case 4: lowBeam = !lowBeam;break;
            case 5: highBeam = !highBeam;break;
            case 6: position = new Random().nextInt(5);break;
        }
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
