package language;

import com.example.tajniacy.language.EnglishLanguageStrategy;
import com.example.tajniacy.language.LanguageStrategy;
import com.example.tajniacy.language.PolishLanguageStrategy;
import org.junit.Assert;
import org.junit.Test;

import static com.example.tajniacy.language.FilePathsManager.ENGLISH_WORDS_FILE_PATH;
import static com.example.tajniacy.language.FilePathsManager.POLISH_WORDS_FILE_PATH;

public class LanguageStrategyTests {

    @Test
    public void polishLanguageStrategyPathToFileMethodTest() {
        //given
        LanguageStrategy polish = new PolishLanguageStrategy();
        //when
        String expected = POLISH_WORDS_FILE_PATH;
        //then
        Assert.assertEquals(polish.getPathToFileWithWords(), expected);
    }

    @Test
    public void englishLanguageStrategyPathToFileMethodTest() {
        //given
        LanguageStrategy english = new EnglishLanguageStrategy();
        //when
        String expected = ENGLISH_WORDS_FILE_PATH;
        //then
        Assert.assertEquals(english.getPathToFileWithWords(), expected);
    }

    @Test
    public void englishLanguageStrategyGameOverMethodTest() {
        //given
        LanguageStrategy english = new EnglishLanguageStrategy();
        //when
        String expected = "GAME OVER";
        //then
        Assert.assertEquals(english.getGameOverInfo(), expected);
    }

    @Test
    public void polishLanguageStrategyGameOverMethodTest() {
        //given
        LanguageStrategy polish = new PolishLanguageStrategy();
        //when
        String expected = "KONIEC GRY";
        //then
        Assert.assertEquals(polish.getGameOverInfo(), expected);
    }

    @Test
    public void polishLanguageStrategyRedTeamInfoMethodTest() {
        //given
        LanguageStrategy polish = new PolishLanguageStrategy();
        //when
        String expected = "CZERWONI";
        //then
        Assert.assertEquals(polish.getRedTeamInfo(), expected);
    }

    @Test
    public void englishLanguageStrategyRedTeamInfoMethodTest() {
        //given
        LanguageStrategy english = new EnglishLanguageStrategy();
        //when
        String expected = "RED TEAM";
        //then
        Assert.assertEquals(english.getRedTeamInfo(), expected);
    }

    @Test
    public void englishLanguageStrategyBlueTeamInfoMethodTest() {
        //given
        LanguageStrategy english = new EnglishLanguageStrategy();
        //when
        String expected = "BLUE TEAM";
        //then
        Assert.assertEquals(english.getBlueTeamInfo(), expected);
    }

    @Test
    public void polishLanguageStrategyBlueTeamInfoMethodTest() {
        //given
        LanguageStrategy english = new PolishLanguageStrategy();
        //when
        String expected = "NIEBIESCY";
        //then
        Assert.assertEquals(english.getBlueTeamInfo(), expected);
    }
}
