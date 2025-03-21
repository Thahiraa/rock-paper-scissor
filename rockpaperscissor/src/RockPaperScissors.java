import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    private static int userScore = 0;
    private static int computerScore = 0;
    private static boolean typingEffect = true; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock \uD83E\uDEA8", "Paper \uD83D\uDCC4", "Scissors \u2702"};

        while (true) {
            clearScreen();
            printWithTypingEffect("Choose (1) Rock \uD83E\uDEA8, (2) Paper \uD83D\uDCC4, (3) Scissors \u2702, or (0) Exit:");
            int userChoice = getUserChoice(scanner);

            if (userChoice == 0) {
                printWithTypingEffect("\nExiting game...\n");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                printWithTypingEffect("Invalid choice. Please select 1-3, or 0 to exit.\n");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;
            printWithTypingEffect("\nYour choice: " + choices[userChoice - 1]);
            printWithTypingEffect("\nComputer's choice: " + choices[computerChoice - 1] + "\n");

            String result = getResult(userChoice, computerChoice);

            printWithTypingEffect(result + "\n");
            printWithTypingEffect("Current Score: You - " + userScore + ", Computer - " + computerScore + "\n");

            printWithTypingEffect("\nPlay again? (Y/N): ");
            if (!scanner.next().equalsIgnoreCase("Y")) {
                break;
            }
        }

        scanner.close();
        clearScreen();
        printWithTypingEffect("\nGame ended. Final Score: You - " + userScore + ", Computer - " + computerScore);
        printWithTypingEffect("\nThank you for playing!\n");
    }

    private static int getUserChoice(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                printWithTypingEffect("Invalid input. Please enter a number.\n");
                scanner.next();
            }
        }
    }

    private static String getResult(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        }

        boolean userWins = (userChoice == 1 && computerChoice == 3) ||
                           (userChoice == 2 && computerChoice == 1) ||
                           (userChoice == 3 && computerChoice == 2);

        if (userWins) {
            userScore++;
            return "You win!";
        } else {
            computerScore++;
            return "You lose!";
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void printWithTypingEffect(String message) {
        if (!typingEffect) {
            System.out.print(message);
            return;
        }

        for (char ch : message.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
