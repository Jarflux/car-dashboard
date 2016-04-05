package be.jarflux.dashboard.controller;

import be.jarflux.dashboard.service.CarService;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Developer: Ben Oeyen
 * Date: 04/04/16
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class DashboardController {
    private final static Logger LOG = Logger.getLogger(DashboardController.class);

    @Inject
    protected CarService carService;

    @GET
    @Timed
    @Path("/gear")
    public int gear() {
        LOG.debug("@GET /gear Show current gear");
        return carService.getGear();
    }

    @GET
    @Timed
    @Path("/gear/up")
    public boolean shiftGearUp() {
        LOG.debug("@GET /gear/up Shift gear up");
        return carService.shiftUp();
    }

    @GET
    @Timed
    @Path("/gear/down")
    public boolean shiftDown() {
        LOG.debug("@GET /gear/down Shift gear down");
        return carService.shiftDown();
    }
}
