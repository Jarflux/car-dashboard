package be.jarflux.car.controller;

import be.jarflux.car.core.energy.*;
import be.jarflux.car.service.EnergyService;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
@Path("/energy")
@Produces(MediaType.APPLICATION_JSON)
public class EnergyController {
    private final static Logger LOG = Logger.getLogger("Car");

    @Inject
    protected EnergyService energyService;

    @GET
    @Timed
    @Path("/doors")
    public Doors doors() {
        return energyService.getDoors();
    }

    @POST
    @Timed
    @Path("/doors/change")
    public void doorsChange() {
        energyService.getDoors().change();
    }

    @GET
    @Timed
    @Path("/belts")
    public Seatbelts belts() {
        return energyService.getSeatbelts();
    }

    @POST
    @Timed
    @Path("/belts/change")
    public void beltsChange() {
        energyService.getSeatbelts().change();
    }

    @GET
    @Timed
    @Path("/stats")
    public Statistics stats() {
        return energyService.getStatistics();
    }

    @POST
    @Timed
    @Path("/stats/change")
    public void statsChange() {
        energyService.getStatistics().change();
    }

    @POST
    @Timed
    @Path("/stats/trip/reset")
    public void statsResetTrip() {
        energyService.getStatistics().resetTrip();
    }

    @GET
    @Timed
    @Path("/lights")
    public Lights lights() {
        return energyService.getLights();
    }

    @POST
    @Timed
    @Path("/lights/change")
    public void lightsChange() {
        energyService.getLights().change();
    }
}
