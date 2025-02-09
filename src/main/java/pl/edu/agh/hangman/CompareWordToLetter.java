package pl.edu.agh.hangman;

public class CompareWordToLetter implements Comparator{
    public int compareWordToLetter(String word, char[] to_compare, char letter) {
        int changes = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                changes += 1;
                to_compare[i] = letter;
            }
        }
        return changes;
    }
}
