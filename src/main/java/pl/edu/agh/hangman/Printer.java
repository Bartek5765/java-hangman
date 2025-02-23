package pl.edu.agh.hangman;

import java.util.Set;

import static pl.edu.agh.hangman.Hangman.HANGMANPICS;

public class Printer {
    private static void printHangMan(int n) {
        System.out.println(HANGMANPICS[n]);
    }

    private static void printWorld(char[] arrOfGuessedLetters) {
        System.out.println(arrOfGuessedLetters);
    }

    public static void printOutput(int n, char[] arrOfGuessedLetters) {
        printHangMan(n);
        printWorld(arrOfGuessedLetters);
    }

    public static void printLoosersFace() {
       System.out.println("\\  ( * n * ) //");
       System.out.println("YOU LOOSE :(");
    }

    public static void printWinnersFace() {
        System.out.println("\\  ( * u * ) //");
        System.out.println("YOU WIN");
    }
}
