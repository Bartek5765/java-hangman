package pl.edu.agh.hangman;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {
    String word;
    int lengthOfWord;
    int numOfGuessedWords;
    Set<Character> guesses;
    char[] arrOfGuessedLetters;

    public Game(String word) {
        this.word = word;
        this.lengthOfWord = word.length();
        this.numOfGuessedWords = 0;
        this.guesses = new HashSet<>();
        this.arrOfGuessedLetters = new char[lengthOfWord];
        for (int i = 0; i < lengthOfWord; i++) {
            this.arrOfGuessedLetters[i] = '-';
        }
    }

    public void run(String[] hanhManSteps) {
        int fails = 0;
        boolean won = false;
        Scanner scanner = new Scanner(System.in);
        while (fails < hanhManSteps.length) {
            char input = UserInput.finalChar();
            int guessed = Comperator.compareWordToLetter(word, arrOfGuessedLetters, input);
            if (guessed == 0) {
                fails += 1;

            } else {
                numOfGuessedWords += 1;
                if (numOfGuessedWords == lengthOfWord) {
                    won = true;
                    break;
                }
            }
        }
        // print picture abd word
        //printFinalResult
    }
}
