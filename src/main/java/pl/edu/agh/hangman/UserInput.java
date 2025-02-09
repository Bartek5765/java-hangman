package pl.edu.agh.hangman;

import java.util.Scanner;

public class UserInput {
    public static char finalChar() {
        Scanner scanner = new Scanner(originalInput);
        boolean correct = false;
        String input = "";
        while (!correct) {
            System.out.print("Your guess: ");
            input = scanner.nextLine();
            if (input.length()>1) {
                System.out.println("Your should provide one character!");
            } else if (!Character.isLetter(input.charAt(0))) {
                System.out.println("Your guess should be a letter!");
            } else {
                correct = true;
            }
        }

        return input.toLowerCase().charAt(0);





    }
}
