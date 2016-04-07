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

/**
 * Developer: Ben Oeyen
 * Date: 05/04/16
 */
@Path("/media")
public class MultimediaController {
    private final static Logger LOG = Logger.getLogger("Car");

    @Inject
    protected MultimediaService multimediaService;

    @GET
    @Timed
    @Path("/music")
    public Music music() {
        LOG.debug("@GET /music");
        return multimediaService.getMusic();
    }

    @POST
    @Timed
    @Path("/music/power")
    public void musicPower() {
        LOG.debug("@POST /music/power");
        multimediaService.getMusic().togglePower();
    }

    @POST
    @Timed
    @Path("/music/shuffle")
    public void musicShuffle() {
        LOG.debug("@POST /music/shuffle");
        multimediaService.getMusic().toggleShuffle();
    }

    @POST
    @Timed
    @Path("/music/repeat")
    public void musicRepeat() {
        LOG.debug("@POST /music/repeat");
        multimediaService.getMusic().toggleRepeat();
    }

    @POST
    @Timed
    @Path("/music/next")
    public void musicNext() {
        LOG.debug("@POST /music/next");
        multimediaService.getMusic().next();
    }

    @POST
    @Timed
    @Path("/music/prev")
    public void musicPrev() {
        LOG.debug("@POST /music/prev");
        multimediaService.getMusic().prev();
    }

    @GET
    @Timed
    @Path("/radio")
    public Radio radio() {
        LOG.debug("@GET /radio");
        return multimediaService.getRadio();
    }

    @POST
    @Timed
    @Path("/radio/power")
    public void radioPower() {
        LOG.debug("@POST /radio/power");
        multimediaService.getRadio().togglePower();
    }

    @POST
    @Timed
    @Path("/radio/next")
    public void radioNext() {
        LOG.debug("@POST /radio/next");
        multimediaService.getRadio().next();
    }

    @POST
    @Timed
    @Path("/radio/prev")
    public void radioPrev() {
        LOG.debug("@POST /radio/prev");
        multimediaService.getRadio().prev();
    }
}
