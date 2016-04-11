package be.jarflux.car.controller;

import be.jarflux.car.core.Climate;
import be.jarflux.car.service.ClimateService;
import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Developer: Ben Oeyen
 * Date: 11/04/16
 */
@Path("/climate")
@Produces(MediaType.APPLICATION_JSON)
public class ClimateController {

    @Inject
    protected ClimateService climateService;

    @GET
    @Timed
    @Path("/")
    public Climate temp() {
        return climateService.getClimate();
    }

    @POST
    @Timed
    @Path("/airco")
    public void toggleAirco() {
        climateService.getClimate().toggleAirco();
    }

    @POST
    @Timed
    @Path("/auto")
    public void toggleAuto() {
        climateService.getClimate().toggleAuto();
    }

    @POST
    @Timed
    @Path("/frontwindow")
    public void toggleFrontWindow() {
        climateService.getClimate().toggleFrontWindow();
    }

    @POST
    @Timed
    @Path("/backwindow")
    public void toggleBackWindow() {
        climateService.getClimate().toggleBackWindow();
    }

    @POST
    @Timed
    @Path("/temp/{temp}")
    public void setTemp(@PathParam("temp")int temp) {
        climateService.getClimate().setTemperature(temp);
    }

    @POST
    @Timed
    @Path("/volume/{volume}")
    public void setVolume(@PathParam("volume")int volume) {
        climateService.getClimate().setVolume(volume);
    }

    @POST
    @Timed
    @Path("/blow/strength/{strength}")
    public void setBlowStrength(@PathParam("strength")int strength) {
        climateService.getClimate().setBlowStrength(strength);
    }

    @POST
    @Timed
    @Path("/blow/direction/{direction}")
    public void setBlowDirection(@PathParam("direction")int direction) {
        climateService.getClimate().setBlowDirection(direction);
    }

    @POST
    @Timed
    @Path("/chair/heat/left/{heat}")
    public void setChairHeatLeft(@PathParam("heat")int heat) {
        climateService.getClimate().setChairHeatLeft(heat);
    }

    @POST
    @Timed
    @Path("/chair/heat/right/{heat}")
    public void setChairHeatRight(@PathParam("heat")int heat) {
        climateService.getClimate().setChairHeatRight(heat);
    }
}
