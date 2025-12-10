public abstract class music {
    protected abstract double getSongRating(String song);
    protected abstract double getArtistRating(String artist);
    protected abstract int getPlays(String song);
    protected abstract Iterable<String> songs();

    // ratings for songs
    @Override
    public double avgRating() {
        double total = 0;
        int count = 0;
        for (String song : this.songs()) {
            total = total + this.getSongRating(song);
            count = count + 1;
        }

        if (count == 0) {
            return 0;
        } else {
            return total / count;
        }
    }

    // finds the song with the most plays
    @Override
    public String mostPlays() {
        String best = "";
        int max = -1;
        for (String song : this.songs()) {
            int plays = this.getPlays(song);
            if (plays > max) {
                max = plays;
                best = song;
            }
        }
        return best;
    }

    // finds the song that has the highest rating
    @Override
    public boolean isFav(String song) {
        double rating = this.getSongRating(song);
        for (String s : this.songs()) {
            if (this.getSongRating(s) > rating) {
                return false;
            }
        }
        return true;
    }
}

