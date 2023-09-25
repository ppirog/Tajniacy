package com.example.tajniacy.words;

import com.example.tajniacy.color.ColorSelector;

import java.util.List;

public class WordStorage {
    private static volatile WordStorage instance = null;
    private WordStrategy wordStrategy;

    private WordStorage() {

    }

    public static WordStorage getInstance() {
        if (instance == null) {
            synchronized (WordStorage.class) {
                instance = new WordStorage();
                instance.wordStrategy = WordStrategyFactory.getPreparedWordsToGame();
            }
        }
        return instance;
    }

    public List<Word> getWordList() {
        return wordStrategy.getWordList();
    }


    public ColorSelector getWordStrategyColorLabel() {
        return wordStrategy.getColorSelector();
    }
}
