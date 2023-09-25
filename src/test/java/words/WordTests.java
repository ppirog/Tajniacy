package words;

import com.example.tajniacy.color.ColorSelector;
import com.example.tajniacy.words.Word;
import org.junit.Assert;
import org.junit.Test;

public class WordTests {
    @Test
    public void wordGetNameTest() {
        //given
        Word word = new Word("testWord", ColorSelector.RED);
        //when
        String expectedWordName = word.getName();
        //then
        Assert.assertEquals(expectedWordName, word.getName());
    }

    @Test
    public void wordGetColorRedTest() {
        //given
        Word word = new Word("testWord", ColorSelector.RED);
        //when
        ColorSelector colorSelector = ColorSelector.RED;
        //then
        Assert.assertEquals(colorSelector, word.getColor());
    }

    @Test
    public void wordGetColorBlueTest() {
        //given
        Word word = new Word("testWord", ColorSelector.BLUE);
        //when
        ColorSelector colorSelector = ColorSelector.BLUE;
        //then
        Assert.assertEquals(colorSelector, word.getColor());
    }

    @Test
    public void wordGetColorYellowTest() {
        //given
        Word word = new Word("testWord", ColorSelector.YELLOW);
        //when
        ColorSelector colorSelector = ColorSelector.YELLOW;
        //then
        Assert.assertEquals(colorSelector, word.getColor());
    }

    @Test
    public void wordGetColorBlackTest() {
        //given
        Word word = new Word("testWord", ColorSelector.BLACK);
        //when
        ColorSelector colorSelector = ColorSelector.BLACK;
        //then
        Assert.assertEquals(colorSelector, word.getColor());
    }
}
