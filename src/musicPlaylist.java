public interface musicPlaylist {

    /**
     * Adds a song to this playlist.
     * 
     * @param song
     *            the song to add
     * @updates this
     * @ensures song is in this
     */
    void addSong(String song);

    /**
     * Rates an artist.
     * 
     * @param artist
     *            artist name
     * @param rating
     *            rating for the artist
     * @updates this
     * @ensures artist rating is updated to rating
     */
    void rateArtist(String artist, double rating);

    /**
     * Rates a song.
     * 
     * @param song
     *            the song to rate
     * @param rating
     *            the rating to assign
     * @updates this
     * @ensures song rating is updated to rating
     */
    void rateSong(String song, double rating);
}
