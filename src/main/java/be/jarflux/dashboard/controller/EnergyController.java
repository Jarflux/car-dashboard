package be.jarflux.dashboard.controller;

import be.jarflux.dashboard.core.DoorStatus;
import be.jarflux.dashboard.service.CarService;
import be.jarflux.dashboard.service.DoorService;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;
import org.apache.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class EnergyController {
    private final static Logger LOG = Logger.getLogger(DashboardController.class);

    @Inject
    protected DoorService doorService;

    @GET
    @Timed
    @Path("/doors")
    public DoorStatus gear() {
        LOG.debug("@GET /doors Show current door status");
        return doorService.getDoorStatus();
    }
}
