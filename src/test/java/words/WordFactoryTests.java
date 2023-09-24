package words;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.language.PolishLanguageStrategy;
import com.example.tajniacy.words.Word;
import com.example.tajniacy.words.WordFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WordFactoryTests {

    @Test
    public void isMethodGet25WordsWith9RedColors8Blue1Black7yellowGives25WordsTest() {

        //given
        WordFactory.setLanguageStrategy(new PolishLanguageStrategy());
        List<Word> allWords = WordFactory.get25WordsWith9RedColors8Blue1Black7yellow();
        //when
        int expectedSize = 25;
        //then
        Assert.assertEquals(allWords.size(), expectedSize);
    }

    @Test
    public void isMethodGet25WordsWith9RedColors8Blue1Black7yellowGivesUnique25WordsTest() {
        //given
        WordFactory.setLanguageStrategy(new PolishLanguageStrategy());
        List<Word> allWords = WordFactory.get25WordsWith9RedColors8Blue1Black7yellow();
        int counteruniqueWords = (int) allWords.stream().distinct().count();
        //when
        int expectedUniqueWords = 25;
        //then
        Assert.assertEquals(expectedUniqueWords, counteruniqueWords);
    }

    @Test
    public void isMethodGet25WordsWith9RedColors8Blue1Black7yellowGives9WordsWithRedColorTest() {

        //given
        WordFactory.setLanguageStrategy(new PolishLanguageStrategy());
        List<Word> allWords = WordFactory.get25WordsWith9RedColors8Blue1Black7yellow();
        int counterWordsWithRedColor = (int) allWords.stream()
                .filter(word -> word.getColor()
                        .equals(ColorSelector.RED))
                .count();
        //when
        int expectedWordsWithRedColorCounter = 9;
        //then
        Assert.assertEquals(counterWordsWithRedColor, expectedWordsWithRedColorCounter);
    }

    @Test
    public void isMethodGet25WordsWith9RedColors8Blue1Black7yellowGives8WordsWithBlueColorTest() {
        //given
        WordFactory.setLanguageStrategy(new PolishLanguageStrategy());
        List<Word> allWords = WordFactory.get25WordsWith9RedColors8Blue1Black7yellow();
        int counterWordsWithRedColor = (int) allWords.stream()
                .filter(word -> word.getColor()
                        .equals(ColorSelector.BLUE))
                .count();
        //when
        int expectedWordsWithBlueColorCounter = 8;
        //then
        Assert.assertEquals(counterWordsWithRedColor, expectedWordsWithBlueColorCounter);
    }

    @Test
    public void isMethodGet25WordsWith9RedColors8Blue1Black7yellowGives1WordWithBlackColorTest() {
        //given
        WordFactory.setLanguageStrategy(new PolishLanguageStrategy());
        List<Word> allWords = WordFactory.get25WordsWith9RedColors8Blue1Black7yellow();
        int counterWordsWithRedColor = (int) allWords.stream()
                .filter(word -> word.getColor()
                        .equals(ColorSelector.BLACK))
                .count();
        //when
        int expectedWordsWithBlackColorCounter = 1;
        //then
        Assert.assertEquals(counterWordsWithRedColor, expectedWordsWithBlackColorCounter);
    }

    @Test
    public void isMethodGet25WordsWith9RedColors8Blue1Black7yellowGives7WordWithYellowColorTest() {
        //given
        WordFactory.setLanguageStrategy(new PolishLanguageStrategy());
        List<Word> allWords = WordFactory.get25WordsWith9RedColors8Blue1Black7yellow();
        int counterWordsWithRedColor = (int) allWords.stream()
                .filter(word -> word.getColor()
                        .equals(ColorSelector.YELLOW))
                .count();
        //when
        int expectedWordsWithYellowColorCounter = 7;
        //then
        Assert.assertEquals(counterWordsWithRedColor, expectedWordsWithYellowColorCounter);
    }
}
