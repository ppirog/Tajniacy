package com.example.tajniacy.words;

import com.example.tajniacy.color.ColorSelector;

import java.util.List;

public class Words8Red9BlueStrategy extends WordStrategy {

    public Words8Red9BlueStrategy(List<Word> wordList) {
        super(wordList, ColorSelector.BLUE);
    }
}
