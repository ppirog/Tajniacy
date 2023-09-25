package com.example.tajniacy.language;

public class LanguageStrategy {
    protected String pathToFileWithWords;
    protected String redTeamInfo;
    protected String blueTeamInfo;
    protected String gameOverInfo;
    protected String redLabelText;
    protected String blueLabelText;
    protected String instructionLabelText;
    protected String redLabelWhichTeamStarts;
    protected String blueLabelWhichTeamStarts;

    public LanguageStrategy(String pathToFileWithWords, String redTeamInfo, String blueTeamInfo, String gameOverInfo, String redLabelText, String blueLabelText, String instructionLabelText, String redLabelWhichTeamStarts, String blueLabelWhichTeamStarts) {
        this.pathToFileWithWords = pathToFileWithWords;
        this.redTeamInfo = redTeamInfo;
        this.blueTeamInfo = blueTeamInfo;
        this.gameOverInfo = gameOverInfo;
        this.redLabelText = redLabelText;
        this.blueLabelText = blueLabelText;
        this.instructionLabelText = instructionLabelText;
        this.redLabelWhichTeamStarts = redLabelWhichTeamStarts;
        this.blueLabelWhichTeamStarts = blueLabelWhichTeamStarts;
    }

    public String getInstructionLabelText() {
        return instructionLabelText;
    }

    public String getBlueLabelText() {
        return blueLabelText;
    }

    public String getRedLabelText() {
        return redLabelText;
    }

    public String getPathToFileWithWords() {
        return pathToFileWithWords;
    }

    public String getRedTeamInfo() {
        return redTeamInfo;
    }

    public String getBlueTeamInfo() {
        return blueTeamInfo;
    }

    public String getGameOverInfo() {
        return gameOverInfo;
    }

    public String getRedLabelWhichTeamStarts() {
        return redLabelWhichTeamStarts;
    }

    public String getBlueLabelWhichTeamStarts() {
        return blueLabelWhichTeamStarts;
    }
}
