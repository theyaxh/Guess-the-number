import java.util.Scanner;
import java.util.InputMismatchException;

public class Input {
    public int userInput;
    public boolean inputFlag = false;
    public boolean guessFlag = false;

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while(!inputFlag) {
            try {
                // userInput = getUserInput(scanner);
                System.out.print("Enter your guess: ");
                userInput = scanner.nextInt();

                if(Double.isNaN((double) userInput)) {
                    inputFlag = false; }
                else {
                    if(userInput < 1 || userInput > 100) {
                        inputFlag = false;
                        throw new IllegalArgumentException("Enter a Integer between 1 and 100");
                    }
                    inputFlag = true; 
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid Input! Please enter a valid Integer.");
                scanner.nextLine(); // preventing infinite loop
            } catch (IllegalArgumentException e) {
                System.err.println("Invalid Input: " + e.getMessage());
            }
        }
        scanner.close();
        return userInput;
    }
}