package be.jarflux.car.core.multimedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Developer: Ben Oeyen
 * Date: 07/04/16
 */
public class Radio {
    private static boolean power = false;
    private transient int stationIndex = 0;
    private Station station;
    private static transient List<Station> stations;

    public Radio(){
        stations = new ArrayList<>();
        stations.add(new Station("MNM", 89.00 , "http://radiomap.eu/be/play/vrt_mnm"));
        stations.add(new Station("Radio 1", 91.70, "http://radiomap.eu/be/play/vrt_radio1"));
        stations.add(new Station("Klara", 96.40, "http://radiomap.eu/be/play/vrt_klara"));
        stations.add(new Station("Q-music", 99.20, "http://radiomap.eu/be/play/qmusic"));
        stations.add(new Station("Studio Brussel", 100.90, "http://radiomap.eu/be/play/vrt_stubru"));
        stations.add(new Station("Joe FM", 103.40, "http://radiomap.eu/be/play/joefm"));
    }

    public boolean isPower() {
        return power;
    }

    public void togglePower() {
        power = !power;
    }

    public Station getStation(){
        return stations.get(stationIndex);
    }

    public void next(){
        stationIndex = (stationIndex + 1) % stations.size();
    }

    public void prev(){
        stationIndex = (stationIndex - 1)> 0? (stationIndex - 1) % stations.size():(stationIndex - 1 + stations.size()) % stations.size();
    }

}
