import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static int generateRandomNumber(int maxBound) {
        Random random = new Random();
        return random.nextInt(maxBound) + 1;
    }

    public static int getUserInput() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }
    
    public static void main(String[] args) {
        int generatedNumber = generateRandomNumber(100);
        int userInput;
        boolean inputFlag = false;

        while(!inputFlag) {
            try {
                userInput = getUserInput();
                if(Double.isNaN((double) userInput) || (userInput < 1 || userInput > 100))
                    inputFlag = false;
                else
                    inputFlag = true; 
            } catch (InputMismatchException e) {
                System.err.println("Invalid Input! Please enter a valid Integer from 1 to 100.");
            } 
        }
    }
}