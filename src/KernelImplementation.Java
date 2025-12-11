import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicKernelImpl implements Music {
    
    private List<String> songs;
    private Map<String, Double> songRatings;
    private Map<String, Double> artistRatings;

    private static final double DEFAULT_RATING = 0.0;

    public MusicKernelImpl() {
        this.createNewRep();
    }

    // Initializer
    @Override
    public void createNewRep() {
        songs = new ArrayList<>();
        songRatings = new HashMap<>();
        artistRatings = new HashMap<>();
    }

    // adding song to a playlist.
    @Override
    public void addSong(String song) {
        if (song == null || song.isEmpty()) {
            return;
        }
        if (!songs.contains(song)) {
            songs.add(song);
            songRatings.put(song, DEFAULT_RATING);
        }
    }

    // ratings for songs.
    @Override
    public void rateSong(String song, double rating) {
        if (song == null || song.isEmpty()) {
            return;
        }
        if (!songs.contains(song)) {
            this.addSong(song);
        }
        songRatings.put(song, rating);
    }

    // Rates an artist
    @Override
    public void rateArtist(String artist, double rating) {
        if (artist == null || artist.isEmpty()) {
            return;
        }
        artistRatings.put(artist, rating);
    }

    // secondary methods from assignment four
    @Override
    public double avgRating() {
        double total = 0.0;
        int count = 0;
        for (String s : songs) {
            total += songRatings.getOrDefault(s, DEFAULT_RATING);
            count++;
        }
        if (count == 0) {
            return 0.0;
        } else {
            return total / count;
        }
    }

    @Override
    public String mostPlays() {
        return "";
    }

    @Override
    public boolean isFav(String song) {
        return false;
    }
}