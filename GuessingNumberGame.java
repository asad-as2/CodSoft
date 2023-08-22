import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        int attempts = 10;
        char ch = 'y';
        while (ch != 'n') {
            System.out.println("You have only "+attempts+" number of attempts remaining !!");
            System.out.println("Enter your guess (1-100): ");

            int guess = scanner.nextInt();
            attempts--;

            if (guess == number) 
            {
                System.out.println();
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Your score is : " + (10-attempts));
                System.out.println();
                System.out.println("Enter y to Play Again or n to exit");
                System.out.println();
                ch = scanner.next().charAt(0);
                attempts = 10;
               
            } else if (guess < number) {
                System.out.println();
                System.out.println("Your guess is too low. Try again.");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Your guess is too high. Try again.");
                System.out.println();
            }
            if(attempts == 0)
            {
                System.out.println();
                System.out.println(" Your number of attempts is equal to 10. So, Game is over");
                System.out.println();
                System.out.println("Enter y to Play Again or n to exit");
                ch = scanner.next().charAt(0);
                attempts = 10;
            }
        }
        System.out.println("You quit the game !!!");
        scanner.close();
    }
}