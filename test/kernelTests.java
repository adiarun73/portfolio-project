import static org.junit.Assert.*;
import org.junit.Test;

public class kernelTests {

    //tests for addings songs

    //adds one song
    @Test
    public void testAddSongBasic() {
        KernelImplementation m = new KernelImplementation();
        m.addSong("Halo");
        assertEquals(0, m.songRating("Halo"));
    }

    //makes sure no duplicates
    @Test
    public void testAddSongNoDuplicates() {
        KernelImplementation m = new KernelImplementation();
        m.addSong("sky");
        m.addSong("sky");

        int count = 0;
        for (String s : m.songs()) {
            if (s.equals("sky")) {
                count++;
            }
        }
        assertEquals(1, count);
    }

    //if list is empty
    @Test
    public void testAddSongEmptyString() {
        KernelImplementation m = new KernelImplementation();
        m.addSong("");

        int size = 0;
        for (String s : m.songs()) {
            size++;
        }
        assertEquals(0, size);
    }

    //tests for song ratings

    //adds rating to song
    @Test
    public void testRateOneSong() {
        KernelImplementation m = new KernelImplementation();
        m.addSong("One Dance");
        m.rateSong("One Dance", 4.5);
        assertEquals(4.5, m.songRating("One Dance"));
    }

    //adding a rating if there isn't one originally
    @Test
    public void testRateSongAddsSong() {
        KernelImplementation m = new KernelImplementation();
        m.rateSong("Skyfall", 3.0);
        assertEquals(3.0, m.songRating("Skyfall"));
    }

    //new rating for song
    @Test
    public void testRateSongOverwritesRating() {
        KernelImplementation m = new KernelImplementation();
        m.addSong("One Dance");
        m.rateSong("One Dance", 2.0);
        m.rateSong("One Dance", 5.0);
        assertEquals(5.0, m.songRating("One Dance"));
    }

    //tests for rating artists

    //rating one artist
    @Test
    public void testRateArtistBasic() {
        KernelImplementation m = new KernelImplementation();
        m.rateArtist("Drake", 5.0);
        assertEquals(5.0, m.artistRating("Drake"));
    }

    //making new rating for an artist
    @Test
    public void testRateArtistOverwrite() {
        KernelImplementation m = new KernelImplementation();
        m.rateArtist("Drake", 3.0);
        m.rateArtist("Drake", 4.5);
        assertEquals(4.5, m.artistRating("Drake"));
    }

    //invalid input for rating
    @Test
    public void testRateArtistInvalidName() {
        KernelImplementation m = new KernelImplementation();
        m.rateArtist("", 4.0);

        int size = m.artistRatingsMap().size();
        assertEquals(0, size);
    }

}
