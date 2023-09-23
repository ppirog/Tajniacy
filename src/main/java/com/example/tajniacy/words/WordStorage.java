package com.example.tajniacy.words;

import java.util.List;

public class WordStorage {
    private static volatile WordStorage instance = null;
    private List<Word> wordList;

    private WordStorage() {

    }

    public static WordStorage getInstance() {
        if (instance == null) {
            synchronized (WordStorage.class) {
                instance = new WordStorage();
                instance.wordList = WordFactory.get25WordsWith8RedColors7Blue1Black9Yellow();
            }
        }
        return instance;
    }

    public List<Word> getWordList() {
        return wordList;
    }
}
