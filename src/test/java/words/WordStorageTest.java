package words;

import com.example.tajniacy.language.PolishLanguageStrategy;
import com.example.tajniacy.words.Word;
import com.example.tajniacy.words.WordStorage;
import com.example.tajniacy.words.WordStrategyFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WordStorageTest {
    @Test
    public void getInstaceTest() {

        //expected
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());
        WordStorage wordStorage1 = WordStorage.getInstance();
        //when
        WordStorage wordStorage2 = WordStorage.getInstance();
        //then
        Assert.assertSame(wordStorage1, wordStorage2);
    }

    @Test
    public void getWordListTest() {

        //expected
        WordStrategyFactory.setLanguageStrategy(new PolishLanguageStrategy());
        WordStorage wordStorage1 = WordStorage.getInstance();
        List<Word> wordList1 = wordStorage1.getWordList();
        //when
        WordStorage wordStorage2 = WordStorage.getInstance();
        List<Word> wordList2 = wordStorage2.getWordList();
        //then
        Assert.assertSame(wordList1, wordList2);
    }

}
