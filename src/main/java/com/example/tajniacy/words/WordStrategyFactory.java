package com.example.tajniacy.words;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.language.LanguageStrategy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordStrategyFactory {

    private static LanguageStrategy languageStrategy;

    public static WordStrategy getPreparedWordsToGame() {
        Random random = new Random();
        boolean randomSelector = random.nextBoolean();
        if (randomSelector) {
            return new Words9Red8BlueStrategy(get25WordsWith9RedColors8Blue1Black7yellow(9, 8));
        } else {
            return new Words8Red9BlueStrategy(get25WordsWith9RedColors8Blue1Black7yellow(8, 9));
        }
    }


    private static List<Word> get25WordsWith9RedColors8Blue1Black7yellow(int maxRedNumber, int maxBlueNumber) {

        if (maxRedNumber + maxBlueNumber != 17) {
            throw new IllegalArgumentException("Wrong arguments. Sum of them must be equal to 17.");
        }

        int maxNumber = 25;
        List<String> slowa = get25Words();
        List<Word> words = new ArrayList<>();

        int maxBlackNumber = 1;
        int maxYellowNumber = 7;

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < maxNumber; ++i) {
            integers.add(i);
        }

        List<Integer> blackIndexes = new ArrayList<>();
        List<Integer> redIndexes = new ArrayList<>();
        List<Integer> blueIndexes = new ArrayList<>();
        List<Integer> yellowIndexes = new ArrayList<>();

        List<Integer> temp = generateIndexesOfColor(integers, maxBlackNumber, blackIndexes, redIndexes, blueIndexes, yellowIndexes);
        blackIndexes.addAll(temp);
        redIndexes.addAll(generateIndexesOfColor(integers, maxRedNumber, blackIndexes, redIndexes, blueIndexes, yellowIndexes));
        blueIndexes.addAll(generateIndexesOfColor(integers, maxBlueNumber, blackIndexes, redIndexes, blueIndexes, yellowIndexes));
        yellowIndexes.addAll(generateIndexesOfColor(integers, maxYellowNumber, blackIndexes, redIndexes, blueIndexes, yellowIndexes));

        for (int i = 0; i < slowa.size(); ++i) {
            if (blackIndexes.contains(i)) {
                words.add(new Word(slowa.get(i), ColorSelector.BLACK));
            } else if (redIndexes.contains(i)) {
                words.add(new Word(slowa.get(i), ColorSelector.RED));
            } else if (blueIndexes.contains(i)) {
                words.add(new Word(slowa.get(i), ColorSelector.BLUE));
            } else if (yellowIndexes.contains(i)) {
                words.add(new Word(slowa.get(i), ColorSelector.YELLOW));
            }
        }
        return words;
    }

    private static List<String> get25Words() {
        int maxNumber = 25;
        Random random = new Random();
        List<String> result = new ArrayList<>();

        List<String> allWordFromFile = getAllWordFromFile();

        while (result.size() < maxNumber) {
            int losowyIndeks = random.nextInt(allWordFromFile.size());
            String randomString = allWordFromFile.get(losowyIndeks).toUpperCase();

            if (!result.contains(randomString)) {
                result.add(randomString);
            }
        }
        return result;
    }

    private static List<String> getAllWordFromFile() {
        try {
            return Files.readAllLines(Paths.get(languageStrategy.getPathToFileWithWords()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean generateIndexCondition(List<Integer> blackIndexes, int index, List<Integer> redIndexes, List<Integer> blueIndexes, List<Integer> yellowIndexes, List<Integer> result) {
        return !((blackIndexes.contains(index) || redIndexes.contains(index) || blueIndexes.contains(index) || yellowIndexes.contains(index) || result.contains(index)));
    }

    private static List<Integer> generateIndexesOfColor(List<Integer> integers, int maxNumber, List<Integer> blackIndexes, List<Integer> redIndexes, List<Integer> blueIndexes, List<Integer> yellowIndexes) {
        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < maxNumber; ++i) {
            while (true) {
                int index = random.nextInt(integers.size());
                if (generateIndexCondition(blackIndexes, index, redIndexes, blueIndexes, yellowIndexes, result)) {
                    result.add(index);
                    break;
                }
            }
        }
        return result;
    }

    public static void setLanguageStrategy(LanguageStrategy languageStrategy) {
        WordStrategyFactory.languageStrategy = languageStrategy;
    }
}
