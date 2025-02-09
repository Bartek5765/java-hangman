package pl.edu.agh.hangman;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Reader {
    private List<String> words;
    private Random rand = new Random();
    //konstruktor wczytuje zawartość pliku z listy
    public Reader(String filePath) {
        try {
            words = Files.readAllLines(Paths.get("slowa.txt")).stream().map(this::deleteSpecialCharacter).filter(line -> !line.isEmpty()).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            words = List.of();
        }
    }
    //metoda zwraca losowo z listy
    public String getRandomWord() {
        if (words.isEmpty()) {
            return "";
        }
        int index = rand.nextInt(words.size());
        return words.get(index);
        }
        //Usuwanie znaków specjalnych
        private String deleteSpecialCharacter(String line) {
        String cleaned = line.replaceAll("[^a-zA-Z0-9]", "");
        return cleaned.toUpperCase();
        }
    }
