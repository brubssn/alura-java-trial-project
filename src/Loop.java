import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double averageRating = 0;
        double review = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("What is your rating for this movie? ");
            review = reader.nextDouble();
            averageRating += review;
        }

        System.out.println("Average rating for this Movie: " + averageRating/3);
    }
}
