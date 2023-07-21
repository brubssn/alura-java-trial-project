import java.util.Random;
import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        // Task 03
        Scanner reader = new Scanner(System.in);

        int random = new Random().nextInt(100);
        int newAttempt = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the guessing game! You have five chances to guess the random number.");

        for (int i = 0; i <= 4; i++) {
            System.out.println("Choose a number from 0 to 100: ");
            newAttempt = reader.nextInt();
            totalAttempts++;

            if (newAttempt == random) {
                System.out.println("Congratulations! You've found the right number. ");
                break;
            } else if (newAttempt < random) {
                System.out.println("Oops! The number you wrote is smaller than the random chosen number. ");
            } else if (newAttempt > random) {
                System.out.println("Oops! The number you wrote is bigger than the random chosen number. ");
            }

            if (totalAttempts == 5) {
                System.out.println("You used all your chances. The chosen number was: "+ random);
            }
        }
    }
}
