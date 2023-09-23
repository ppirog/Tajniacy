package com.example.tajniacy.words;

import com.example.tajniacy.color.ColorSelector;

public class Word {
    private final String name;
    private final ColorSelector colorSelector;

    public Word(String name, ColorSelector colorSelector) {
        this.name = name;
        this.colorSelector = colorSelector;
    }

    public String getName() {
        return name;
    }

    public ColorSelector getColor() {
        return colorSelector;
    }
}
