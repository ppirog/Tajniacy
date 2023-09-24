package com.example.tajniacy.language;

import static com.example.tajniacy.language.LanguageStrategyManager.*;

public class EnglishLanguageStrategy extends LanguageStrategy {

    public EnglishLanguageStrategy() {
        super(ENGLISH_WORDS_FILE_PATH,RED_TEAM_INFO_ENGLISH,BLUE_TEAM_INFO_ENGLISH, GAME_OVER_INFO_ENGLISH,RED_LABEL_TEXT_ENGLISH,BLUE_LABEL_TEXT_ENGLISH,INSTRUCTION_LABEL_TEXT_ENGLISH);
    }


}
