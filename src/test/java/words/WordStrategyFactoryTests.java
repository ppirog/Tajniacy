package words;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.language.EnglishLanguageStrategy;
import com.example.tajniacy.language.PolishLanguageStrategy;
import com.example.tajniacy.words.WordStrategy;
import com.example.tajniacy.words.WordStrategyFactory;
import org.junit.Assert;
import org.junit.Test;

public class WordStrategyFactoryTests {

    @Test
    public void isMethodGetPreparedWordsToGameGivesCorrectNumberOfUniqueWordsBackWithEnglishStrategy() {
        //given
        WordStrategyFactory.setLanguageStrategy(new EnglishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();
        int givenBlueWordsSize = wordStrategy.getWordList().size();

        //when
        int expectedRedAndBlueWordsSize = 25;
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedRedAndBlueWordsSize);
    }

    @Test
    public void isMethodGetPreparedWordsToGameGivesCorrectBlueAndRedWordsBackWithEnglishStrategy() {
        //given
        WordStrategyFactory.setLanguageStrategy(new EnglishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();
        int givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();

        int givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();
        //when
        int expectedRedAndBlueWordsSize = 17;
        //then
        Assert.assertEquals(givenBlueWordsSize + givenRedWordsSize, expectedRedAndBlueWordsSize);
    }

    @Test
    public void isMethodGetPreparedWordsToGameGivesCorrectBlueAndRedWordsBackWithPolishStrategy() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();
        int givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();

        int givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();
        //when
        int expectedRedAndBlueWordsSize = 17;
        //then
        Assert.assertEquals(givenBlueWordsSize + givenRedWordsSize, expectedRedAndBlueWordsSize);
    }
}
