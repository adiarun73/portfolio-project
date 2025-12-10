public interface musicPlaylistSecondary extends musicPlaylist {

    /**
     * Reports the average rating of all songs.
     * 
     * @return average rating
     * @ensures avgRating = average of all song ratings in this
     */
    double avgRating();

    /**
     * Reports the song with the most plays.
     * 
     * @return most played song
     * @ensures mostPlays is a song in this with the highest play count
     */
    String mostPlays();

    /**
     * Checks whether a song is considered a favorite.
     * 
     * @param song
     *            song name
     * @return true if this song is rated as a favorite
     * @ensures isFav = (rating of song is highest rating in this)
     */
    boolean isFav(String song);
}
