package com.example.tajniacy.words;

import com.example.tajniacy.color.ColorSelector;

import java.util.List;

public abstract class WordStrategy {

    protected ColorSelector colorSelector;
    protected List<Word> wordList;

    public WordStrategy(List<Word> wordList, ColorSelector colorSelector) {
        this.wordList = wordList;
        this.colorSelector = colorSelector;
    }


    public List<Word> getWordList() {
        return wordList;
    }

    public ColorSelector getColorSelector() {
        return colorSelector;
    }
}
