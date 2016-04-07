package be.jarflux.car.core.multimedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Developer: Ben Oeyen
 * Date: 07/04/16
 */
public class Music {
    private boolean power = true;
    private boolean repeat = true;
    private boolean shuffle = true;
    private transient int songIndex = 0;
    private Song song;
    private transient List<Song> songs = new ArrayList();

    public Music(){
        songs.add(new Song("I Took A Pill In Ibiza - Seeb Remix","Mike Posner, Seeb",229,"https://i.scdn.co/image/9c20a56d31f4f5a979203d7038ea614d830395a2"));
        songs.add(new Song("7 Years","Lukas Graham",237,"https://i.scdn.co/image/6eaeb0e59e50269f879d7e643ec0c4b5c16cb6bf"));
        songs.add(new Song("Faded","Alan Walker",212,"https://i.scdn.co/image/2ddde58427f632037093857ebb71a67ddbdec34b"));
        songs.add(new Song("Fast Car - Radio Edit","Jonas Blue, Dakota",212,"https://i.scdn.co/image/00d38a1a9c17c9a169b3b605d64ef4855905d030"));
        songs.add(new Song("Light It Up (feat. Nyla & Fuse ODG) - Remix","Major Lazer, Fuse Odg, Nyla",166,"https://i.scdn.co/image/a8a79f70e7fb00f8d5bf595336773e4ee7f5db5c"));
        songs.add(new Song("Cheap Thrills","Sia",211,"https://i.scdn.co/image/37f615e5ec794b796556f99c608b6e283dc27286"));
    }

    public boolean isPower() {
        return power;
    }

    public void togglePower() {
        power = !power;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void toggleRepeat() {
        repeat = !repeat;
    }

    public boolean isShuffle() {
        return shuffle;
    }

    public void toggleShuffle() {
        shuffle = !shuffle;
    }

    public Song getSong() {
        return songs.get(songIndex);
    }

    public void next(){
        songIndex = (songIndex + 1) % songs.size();
    }

    public void prev(){
        songIndex = (songIndex - 1)> 0? (songIndex - 1) % songs.size():(songIndex - 1 + songs.size()) % songs.size();
    }
}
