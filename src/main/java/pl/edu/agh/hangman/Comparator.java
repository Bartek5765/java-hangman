package pl.edu.agh.hangman;

public interface Comparator {
    public int compareWordToLetter(String word, char[] to_compare, char letter);
}
