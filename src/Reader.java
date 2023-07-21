import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Write your favorite movie. ");
        String movie = reader.nextLine();
        System.out.println("When was it released? ");
        int yearOfRelease = reader.nextInt();
        System.out.println("What is your rating? ");
        double movieRating = reader.nextDouble();

        System.out.println(movie);
        System.out.println(yearOfRelease);
        System.out.println(movieRating);
    }
}
