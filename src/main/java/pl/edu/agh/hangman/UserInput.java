package pl.edu.agh.hangman;

import java.util.Scanner;
import java.util.Set;

public class UserInput {
    public static char finalChar(Set guesses) {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        String input = "";
        while (!correct) {
            System.out.print("Your guess: ");
            input = scanner.nextLine();
            input = input.toUpperCase();
            if (input.length()>1) {
                System.out.println("Your should provide one character!");
            } else if (!Character.isLetter(input.charAt(0))) {
                System.out.println("Your guess should be a letter!");
            } else if (guesses.contains(input.charAt(0))) {
                System.out.println("Your already tried this letter!");
            } else {
                correct = true;
            }
        }
        guesses.add(input.charAt(0));
        return input.charAt(0);





    }
}
