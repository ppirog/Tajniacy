package com.example.tajniacy.words;

import com.example.tajniacy.color.ColorSelector;

import java.util.List;

public abstract class WordStrategy {

    protected ColorSelector whichTeamStartsTheGame;
    protected List<Word> wordList;

    public WordStrategy(List<Word> wordList, ColorSelector whichTeamStartsTheGame) {
        this.wordList = wordList;
        this.whichTeamStartsTheGame = whichTeamStartsTheGame;
    }


    public List<Word> getWordList() {
        return wordList;
    }

    public ColorSelector getWhichTeamStartsTheGame() {
        return whichTeamStartsTheGame;
    }
}
