package color;

import com.example.tajniacy.color.ColorSelector;
import org.junit.Assert;
import org.junit.Test;

public class ColorSelectorTests {

    @Test
    public void redColorSelectorTest() {
        //given
        ColorSelector colorSelector = ColorSelector.RED;
        String colorCode = colorSelector.getColorCode();
        //when
        String correctColorCode = "#ff4141";
        Assert.assertEquals(colorCode, correctColorCode);
    }

    @Test
    public void blueColorSelectorTest() {
        //given
        ColorSelector colorSelector = ColorSelector.BLUE;
        String colorCode = colorSelector.getColorCode();
        //when
        String correctColorCode = "#2589e7";
        Assert.assertEquals(colorCode, correctColorCode);
    }

    @Test
    public void blackColorSelectorTest() {
        //given
        ColorSelector colorSelector = ColorSelector.BLACK;
        String colorCode = colorSelector.getColorCode();
        //when
        String correctColorCode = "#4b4b4b";
        Assert.assertEquals(colorCode, correctColorCode);
    }

    @Test
    public void yellowColorSelectorTest() {
        //given
        ColorSelector colorSelector = ColorSelector.YELLOW;
        String colorCode = colorSelector.getColorCode();
        //when
        String correctColorCode = "#dedfb1";
        Assert.assertEquals(colorCode, correctColorCode);
    }
}
