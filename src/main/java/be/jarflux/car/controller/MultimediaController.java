package be.jarflux.car.controller;

import be.jarflux.car.core.energy.Doors;
import be.jarflux.car.core.multimedia.Music;
import be.jarflux.car.core.multimedia.Radio;
import be.jarflux.car.service.EnergyService;
import be.jarflux.car.service.MultimediaService;
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
@Path("/media")
@Produces(MediaType.APPLICATION_JSON)
public class MultimediaController {
    private final static Logger LOG = Logger.getLogger("Car");

    @Inject
    private MultimediaService multimediaService;

    @GET
    @Timed
    @Path("/music")
    public Music music() {
        return multimediaService.getMusic();
    }

    @POST
    @Timed
    @Path("/music/power")
    public void musicPower() {
        multimediaService.getMusic().togglePower();
    }

    @POST
    @Timed
    @Path("/music/shuffle")
    public void musicShuffle() {
        multimediaService.getMusic().toggleShuffle();
    }

    @POST
    @Timed
    @Path("/music/repeat")
    public void musicRepeat() {
        multimediaService.getMusic().toggleRepeat();
    }

    @POST
    @Timed
    @Path("/music/next")
    public void musicNext() {
        multimediaService.getMusic().next();
    }

    @POST
    @Timed
    @Path("/music/prev")
    public void musicPrev() {
        multimediaService.getMusic().prev();
    }

    @GET
    @Timed
    @Path("/radio")
    public Radio radio() {
        return multimediaService.getRadio();
    }

    @POST
    @Timed
    @Path("/radio/power")
    public void radioPower() {
        multimediaService.getRadio().togglePower();
    }

    @POST
    @Timed
    @Path("/radio/next")
    public void radioNext() {
        multimediaService.getRadio().next();
    }

    @POST
    @Timed
    @Path("/radio/prev")
    public void radioPrev() {
        multimediaService.getRadio().prev();
    }
}
