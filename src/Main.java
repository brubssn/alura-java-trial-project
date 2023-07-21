public class Main {
    public static void main(String[] args) {
        System.out.println("Alô Mundo!");

        System.out.println("This is Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int yearOfRelease = 2022;
        System.out.println("Year of Release: " + yearOfRelease);

        boolean isItAvailable = true;
        double movieRating = 8.1;
        // Average rating calculated using three reviews from users
        double averageRating = (9.8 + 6.3 + 8.0)/3;
        System.out.println(averageRating);

        String synopsis;
        /*synopsis = "Adventure movie with a big actor from the 80s";
        System.out.println(synopsis);*/

        synopsis = """
                 Top Gun: Maverick
                 Adventure movie with a big actor from the 80s
                 Great movie
                 Year of Release
                 """ + yearOfRelease;
        System.out.println(synopsis);

        int review = (int) (averageRating/2);
        System.out.println(review);
    }
}