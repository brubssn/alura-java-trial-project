public class Conditions {
    public static void main(String[] args) {
        int yearOfRelease = 2022;
        boolean isItAvailable = true;
        double movieRating = 8.1;
        String planType = "plus";

        if (yearOfRelease >= 2022){
            System.out.println("New movies that our clients are enjoying!");
        } else {
            System.out.println("Old movies that we think you are going to enjoy!");
        }

        if (isItAvailable || planType.equalsIgnoreCase("plus")){
            System.out.println("This movie is available.");
        } else {
            System.out.println("Find out how to watch this movie by checking our plans.");
        }
    }
}
