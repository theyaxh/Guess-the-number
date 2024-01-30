import java.util.Random;

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
        Input input = new Input();
        int generatedNumber = generateRandomNumber(100);
        int userInput;
        boolean guessFlag = false;
        
        while(!guessFlag) {
            userInput = input.getUserInput();

            if(userInput == generatedNumber) {
                System.out.println("Your guess is correct, The number was indeed " + userInput + "!");
                guessFlag = true;
            } else if(userInput > generatedNumber) {
                if(userInput - generatedNumber >= 30) {
                    System.out.println("Your guess is too high.");
                } else if(userInput - generatedNumber >= 7) {
                    System.out.println("Your guess is quite high");
                } else {
                    System.out.println("Your guess is high but very close.");
                }
            } else  { // if(userInput < generatedNumber)
                if(generatedNumber - userInput >= 30) {
                    System.out.println("Your guess is too low.");
                } else if(generatedNumber - userInput >= 7) {
                    System.out.println("Your guess is quite low");
                } else {
                    System.out.println("Your guess is low but very close.");
                }
            }
        }    
    }
}