package com.example.tajniacy.language;

public class LanguageStrategy {
    protected String pathToFileWithWords;
    protected String redTeamInfo;
    protected String blueTeamInfo;
    protected String gameOverInfo;
    protected String redLabelText;
    protected String blueLabelText;
    protected String instructionLabelText;

    public LanguageStrategy(String pathToFileWithWords, String redTeamInfo, String blueTeamInfo, String gameOverInfo, String redLabelText, String blueLabelText, String instructionLabelText) {
        this.pathToFileWithWords = pathToFileWithWords;
        this.redTeamInfo = redTeamInfo;
        this.blueTeamInfo = blueTeamInfo;
        this.gameOverInfo = gameOverInfo;
        this.redLabelText = redLabelText;
        this.blueLabelText = blueLabelText;
        this.instructionLabelText = instructionLabelText;
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
}
