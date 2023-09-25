package com.example.tajniacy.language;

import static com.example.tajniacy.language.LanguageStrategyManager.*;

public class PolishLanguageStrategy extends LanguageStrategy {
    public PolishLanguageStrategy() {
        super(POLISH_WORDS_FILE_PATH, RED_TEAM_INFO_POLISH, BLUE_TEAM_INFO_POLISH, GAME_OVER_INFO_POLISH, RED_LABEL_TEXT_POLISH, BLUE_LABEL_TEXT_POLISH, INSTRUCTION_LABEL_TEXT_POLISH, POLISH_LABEL_RED_TEAM_STARTS, POLISH_LABEL_BLUE_TEAM_STARTS);
    }

}
