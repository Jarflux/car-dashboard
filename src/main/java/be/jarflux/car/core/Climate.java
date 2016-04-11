package be.jarflux.car.core;

/**
 * Developer: Ben Oeyen
 * Date: 11/04/16
 */
public class Climate {

    private int chairHeatLeft = 0;
    private int chairHeatRight= 0;
    private boolean frontWindow;
    private boolean backWindow;
    private int blowDirection= 0;
    private int blowStrength= 0;
    private int volume = 50;
    private int temperature = 21;
    private boolean airco = false;
    private boolean auto = false;

    public void toggleAirco() {
        airco = !airco;
    }

    public void toggleFrontWindow() {
        frontWindow = !frontWindow;
    }

    public void toggleBackWindow() {
        backWindow = !backWindow;
    }

    public void toggleAuto() {
        auto = !auto;
    }

    public boolean isFrontWindow() {
        return frontWindow;
    }

    public boolean isBackWindow() {
        return backWindow;
    }

    public boolean isAirco() {
        return airco;
    }

    public boolean isAuto() {
        return auto;
    }

    public int getChairHeatLeft() {
        return chairHeatLeft;
    }

    public void setChairHeatLeft(int chairHeatLeft) {
        this.chairHeatLeft = chairHeatLeft;
    }

    public int getChairHeatRight() {
        return chairHeatRight;
    }

    public void setChairHeatRight(int chairHeatRight) {
        this.chairHeatRight = chairHeatRight;
    }

    public int getBlowDirection() {
        return blowDirection;
    }

    public void setBlowDirection(int blowDirection) {
        this.blowDirection = blowDirection;
    }

    public int getBlowStrength() {
        return blowStrength;
    }

    public void setBlowStrength(int blowStrength) {
        this.blowStrength = blowStrength;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
