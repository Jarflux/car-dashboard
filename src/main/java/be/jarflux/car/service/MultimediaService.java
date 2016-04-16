package be.jarflux.car.service;

import be.jarflux.car.core.multimedia.Music;
import be.jarflux.car.core.multimedia.Radio;

/**
 * Developer: Ben Oeyen
 * Date: 07/04/16
 */
public class MultimediaService {

    private static Music music;
    private static Radio radio;

    public MultimediaService() {
        music = new Music();
        radio = new Radio();
    }

    public Music getMusic() {
        return music;
    }

    public Radio getRadio() {
        return radio;
    }
}
