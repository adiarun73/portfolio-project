public class useCaseTwo {
    public static void main(String[] args) {

        KernelImplementation playlist = new KernelImplementation();

        playlist.addSong("Shape of You");
        playlist.addSong("Rolling in the Deep");
        playlist.addSong("Levitating");

        playlist.rateSong("Shape of You", 8.5);
        playlist.rateSong("Rolling in the Deep", 9.0);
        playlist.rateArtist("Dua Lipa", 8.8);

        System.out.println("Average Rating: " + playlist.avgRating());
        System.out.println("Most Played Song: " + playlist.mostPlays());
        System.out.println("Is 'Shape of You' a Favorite? " + playlist.isFav("Shape of You"));
    }
}
