import java.util.Scanner;
import java.util.Random;

 class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int number = generator.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;

        do {
            System.out.print("Guess a number from 1 to 10: ");

            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();

                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Enter a number from 1 to 10.");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a whole number.");
            }
        } while (!done);

        System.out.println("The random number was: " + number);

        if (guess > number) {
            System.out.println("Your guess was too high!");
        } else if (guess < number) {
            System.out.println("Your guess was too low!");
        } else {
            System.out.println("You got it right!");
        }
    }
}
