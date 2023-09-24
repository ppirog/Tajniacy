package com.example.tajniacy.language;

import java.lang.ref.PhantomReference;

public class LanguageStrategy {
    protected String pathToFileWithWords;
    protected String redTeamInfo;
    protected String blueTeamInfo;
    protected String gameOverInfo;

    public LanguageStrategy(String pathToFileWithWords, String redTeamInfo, String blueTeamInfo, String gameOverInfo) {
        this.pathToFileWithWords = pathToFileWithWords;
        this.redTeamInfo = redTeamInfo;
        this.blueTeamInfo = blueTeamInfo;
        this.gameOverInfo = gameOverInfo;
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
