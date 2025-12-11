public class useCaseOne {
    //use case 1
    //direct installation

    public static void main(String[] args) {

        KernelImplementation playlist = new KernelImplementation();

        playlist.addSong("Espresso");
        playlist.addSong("God's Plan");
        playlist.addSong("Skyfall");

        playlist.rateArtist("Sabrina Carpenter", 9.2);
        playlist.rateSong("Skyfall", 8.7);
        playlist.rateSong("God's Plan", 9.0);

        System.out.println("Average rating: " + playlist.avgRating());
        System.out.println("Most played: " + playlist.mostPlays());
        System.out.println("Is God's Plan a favorite: " + playlist.isFav("God's Plan"));
    }

}
