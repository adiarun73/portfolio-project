//This is a template of what I think is needed.
public abstract class music {
    // Constant threshold for determining a favorite song
    protected static final int FAVORITE_RATING = 4;
    
    protected music() {
        super();
    }
    public abstract void createNewRep();

    // Adds a song to the playlist
    public abstract void addSong(String name);

    // Increments the play count for a song
    public abstract void songCount(String name);

    // Checks whether a given song meets the favorite rating threshold
    public boolean isFavorite(String title) {
        return this.getRating(title) >= FAVORITE_RATING;
    }

    //how many times a song has been played
    public int getPlayCount(String title) {
        return this.playCountOf(title);
    }

    // Updates a songs rating to a new value
    public void rateSong(String title, int rating) {
        this.updateRating(title, rating);
    }

    // Returns current rating
    protected abstract int getRating(String title);

    // Returns how many plays a song has
    protected abstract int playCountOf(String title);

    // Updates a rating for a song
    protected abstract void updateRating(String title, int rating);
}
