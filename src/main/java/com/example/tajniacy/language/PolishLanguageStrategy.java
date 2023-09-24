package com.example.tajniacy.language;

import static com.example.tajniacy.language.FilePathsManager.*;

public class PolishLanguageStrategy extends LanguageStrategy {
    public PolishLanguageStrategy() {
        super(POLISH_WORDS_FILE_PATH,RED_TEAM_INFO_POLISH,BLUE_TEAM_INFO_POLISH, GAME_OVER_INFO_POLISH);
    }

}
