//This is a template of what I think is needed.

public abstract class music implements MusicPlaylist {

    public static final int FAVORITE_RATING = 4;

    protected music() {
        super();
    }

    @Override
    public abstract void createNewRep();

    @Override
    public abstract void addSong(String name);

    @Override
    public abstract void songCount(String name);

    @Override
    public boolean isFavorite(String title) {
        return this.getRating(title) >= FAVORITE_RATING;
    }

    @Override
    public int getPlayCount(String title) {
        return this.playCountOf(title);
    }

    @Override
    public void rateSong(String title, int rating) {
        this.updateRating(title, rating);
    }

    protected abstract int getRating(String title);

    protected abstract int playCountOf(String title);

    protected abstract void updateRating(String title, int rating);
}