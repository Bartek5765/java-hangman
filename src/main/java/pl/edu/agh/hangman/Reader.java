package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reader {
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
