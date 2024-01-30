import java.util.Scanner;
import java.util.InputMismatchException;

public class Input {
    private Scanner scanner;
    public int userInput;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public int getUserInput() {
        while (true) { 
            try {
                System.out.print("Enter your guess: ");
                userInput = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                if (Double.isNaN((double) userInput) || userInput < 1 || userInput > 100) 
                    throw new IllegalArgumentException("Enter an integer between 1 and 100");

                return userInput; 
            } catch (InputMismatchException e) {
                System.err.println("Invalid Input! Please enter a valid integer.");
                scanner.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid Input: " + e.getMessage());
            }
        }
    }
}
