package be.jarflux.car.service;

import be.jarflux.car.core.Climate;

/**
 * Developer: Ben Oeyen
 * Date: 11/04/16
 */
public class ClimateService {
    private static Climate climate;

    public ClimateService() {
        climate = new Climate();
    }

    public static Climate getClimate() {
        return climate;
    }
}
