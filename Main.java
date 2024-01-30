import java.util.Random;
import java.util.Scanner;

class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String message) {
        super(message);
    }
}

public class Main {
    public static int generateRandomNumber(int maxBound) {
        Random random = new Random();
        return random.nextInt(maxBound) + 1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        int generatedNumber = generateRandomNumber(100);
        boolean guessFlag = false;

        while(!guessFlag) {
            int userInput = input.getUserInput();

        }    


        scanner.close();
    }
}