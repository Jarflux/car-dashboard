package be.jarflux.dashboard.service;

import be.jarflux.dashboard.core.SpeedStatus;

/**
 * Developer: Ben Oeyen
 * Date: 04/04/16
 */
public class SpeedService {

    private static SpeedStatus speedStatus;
    private static final int MIN_RPM = 0;
    private static final int MAX_RPM = 6000;



    public SpeedService(){
        speedStatus = new SpeedStatus();
    }

    public void tick() {

    }
}
