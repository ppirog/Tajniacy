package words;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.language.PolishLanguageStrategy;
import com.example.tajniacy.words.*;
import org.junit.Assert;
import org.junit.Test;

public class WordsStrategyTests {
    @Test
    public void isWordStrategyContains25Words() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());
        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenSize = wordStrategy.getWordList().size();
        //when
        int expectedSize = 25;
        //then
        Assert.assertEquals(givenSize, expectedSize);
    }

    @Test
    public void isWordStrategyContains25UniqueWords() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());
        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenSize = (int) wordStrategy.getWordList().stream().map(Word::getName).distinct().count();
        //when
        int expectedSize = 25;
        //then
        Assert.assertEquals(givenSize, expectedSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithRedColorTest1() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenRedWordsSize = 0;
        //when
        int expectedRedWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedRedWordsSize = 9;

        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedRedWordsSize = 8;
        }
        //then
        Assert.assertEquals(givenRedWordsSize, expectedRedWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlueColorTest1() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlueWordsSize = 0;
        //when
        int expectedBlueWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedBlueWordsSize = 8;
        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedBlueWordsSize = 9;
        }
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedBlueWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithRedColorTest2() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenRedWordsSize = 0;
        //when
        int expectedRedWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedRedWordsSize = 9;

        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedRedWordsSize = 8;
        }
        //then
        Assert.assertEquals(givenRedWordsSize, expectedRedWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlueColorTest2() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlueWordsSize = 0;
        //when
        int expectedBlueWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedBlueWordsSize = 8;
        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedBlueWordsSize = 9;
        }
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedBlueWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithRedColorTest3() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenRedWordsSize = 0;
        //when
        int expectedRedWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedRedWordsSize = 9;

        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedRedWordsSize = 8;
        }
        //then
        Assert.assertEquals(givenRedWordsSize, expectedRedWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlueColorTest3() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlueWordsSize = 0;
        //when
        int expectedBlueWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedBlueWordsSize = 8;
        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedBlueWordsSize = 9;
        }
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedBlueWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithRedColorTest4() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenRedWordsSize = 0;
        //when
        int expectedRedWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedRedWordsSize = 9;

        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedRedWordsSize = 8;
        }
        //then
        Assert.assertEquals(givenRedWordsSize, expectedRedWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlueColorTest4() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlueWordsSize = 0;
        //when
        int expectedBlueWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedBlueWordsSize = 8;
        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedBlueWordsSize = 9;
        }
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedBlueWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithRedColorTest5() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenRedWordsSize = 0;
        //when
        int expectedRedWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedRedWordsSize = 9;

        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedRedWordsSize = 8;
        }
        //then
        Assert.assertEquals(givenRedWordsSize, expectedRedWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlueColorTest5() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlueWordsSize = 0;
        //when
        int expectedBlueWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedBlueWordsSize = 8;
        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedBlueWordsSize = 9;
        }
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedBlueWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithRedColorTest6() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenRedWordsSize = 0;
        //when
        int expectedRedWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedRedWordsSize = 9;

        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenRedWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedRedWordsSize = 8;
        }
        //then
        Assert.assertEquals(givenRedWordsSize, expectedRedWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlueColorTest6() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlueWordsSize = 0;
        //when
        int expectedBlueWordsSize = 0;

        if (wordStrategy.equals(Words9Red8BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLUE)).count();
            expectedBlueWordsSize = 8;
        } else if (wordStrategy.equals(Words8Red9BlueStrategy.class)) {
            givenBlueWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.RED)).count();

            expectedBlueWordsSize = 9;
        }
        //then
        Assert.assertEquals(givenBlueWordsSize, expectedBlueWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithYellowColorTest1() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenYellowWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.YELLOW)).count();
        //when
        int expectedYellowWordsSize = 7;

        //then
        Assert.assertEquals(givenYellowWordsSize, expectedYellowWordsSize);
    }

    @Test
    public void isWordStrategyContainsCorrectNumberWordsWithBlackColorTest1() {
        //given
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());

        WordStrategy wordStrategy = WordStrategyFactory.getPreparedWordsToGame();

        int givenBlackWordsSize = (int) wordStrategy.getWordList().stream().filter(word -> word.getColor().equals(ColorSelector.BLACK)).count();
        //when
        int expectedBlackWordsSize = 1;

        //then
        Assert.assertEquals(givenBlackWordsSize, expectedBlackWordsSize);
    }

}
