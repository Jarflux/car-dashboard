package be.jarflux.car.core.multimedia;

/**
 * Developer: Ben Oeyen
 * Date: 07/04/16
 */
public class Song {

    private String title;
    private String artist;
    private int duration;
    private String image;

    public Song(String title, String artist, int duration, String image) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public String getImage() {
        return image;
    }
}
