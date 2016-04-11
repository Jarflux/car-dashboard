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
        LOG.debug("@GET /doors Show current door status");
        return energyService.getDoors();
    }

    @POST
    @Timed
    @Path("/doors/change")
    public void doorsChange() {
        LOG.debug("@GET /doors Show current door status");
        energyService.getDoors().change();
    }

    @GET
    @Timed
    @Path("/belts")
    public Seatbelts belts() {
        LOG.debug("@GET /belts Show current seatbelt status");
        return energyService.getSeatbelts();
    }

    @POST
    @Timed
    @Path("/belts/change")
    public void beltsChange() {
        LOG.debug("@GET /belts Show current seatbelt status");
        energyService.getSeatbelts().change();
    }

    @GET
    @Timed
    @Path("/stats")
    public Statistics stats() {
        LOG.debug("@GET /stats Show current statistics status");
        return energyService.getStatistics();
    }

    @POST
    @Timed
    @Path("/stats/change")
    public void statsChange() {
        LOG.debug("@GET /stats Show current statistics status");
        energyService.getStatistics().change();
    }

    @GET
    @Timed
    @Path("/lights")
    public Lights lights() {
        LOG.debug("@GET /lights Show current lights status");
        return energyService.getLights();
    }

    @POST
    @Timed
    @Path("/lights/change")
    public void lightsChange() {
        LOG.debug("@GET /lights Show current lights status");
        energyService.getLights().change();
    }
}
