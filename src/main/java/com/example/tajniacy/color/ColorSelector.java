package com.example.tajniacy.color;

public enum ColorSelector {
    RED("#ff4141"), BLUE("#2589e7"), YELLOW("#dedfb1"), BLACK("#4b4b4b");

    private final String colorCode;

    ColorSelector(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
}
