import java.util.Scanner;

public class NewLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double averageRating = 0;
        double review = 0;
        int reviewTotal = 0;

        while (review != -1) {
            System.out.println("What is your rating for this movie? (Press -1 to end) ");
            review = reader.nextDouble();

            if (review != -1) {
                averageRating += review;
                reviewTotal++;
            }

        }

        System.out.println("Average rating for this Movie: " + averageRating/reviewTotal);
    }
}
