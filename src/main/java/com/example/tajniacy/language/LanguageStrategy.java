package com.example.tajniacy.language;

public class LanguageStrategy {
    protected String pathToFileWithPolishWords;

    protected LanguageStrategy(String pathToFileWithPolishWords) {
        this.pathToFileWithPolishWords = pathToFileWithPolishWords;
    }

    public String getPathToFileWithPolishWords() {
        return pathToFileWithPolishWords;
    }
}
