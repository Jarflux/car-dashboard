package be.jarflux.car.core.multimedia;

/**
 * Developer: Ben Oeyen
 * Date: 07/04/16
 */
public class Station {
    private String name;
    private double frequency;
    private String stream;

    public Station(String name, double frequency, String stream) {
        this.name = name;
        this.frequency = frequency;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getStream() {
        return stream;
    }
}
