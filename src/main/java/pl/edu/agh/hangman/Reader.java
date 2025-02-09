package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Reader {
    //konstruktor wczytuje zawartość pliku z listy
//    public void getTextFile() {
////        try {
//
//            printInputStream(is);
////            words = is.stream().map(this::deleteSpecialCharacter).filter(line -> !line.isEmpty()).collect(Collectors.toList());
////        } catch (IOException e) {
////            e.printStackTrace();
////            words = List.of();
////        }
//    }

    private static void printInputStream() {


    }
    public static String getRandomWord() {
        InputStream is = Reader.class.getClassLoader().getResourceAsStream("slowa.txt");
        Random random = new Random();
        List<String> words = new ArrayList<>();
        try (InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }

        } catch (IOException e) {
            words = List.of();
            e.printStackTrace();
        }

        printInputStream();
        if (words.isEmpty()) {
            return "";
        }
        int index = random.nextInt(words.size());
            return words.get(index);
        }
        private String deleteSpecialCharacter(String line) {
        String cleaned = line.replaceAll("[^a-zA-Z0-9]", "");
        return cleaned.toUpperCase();
        }
    }
