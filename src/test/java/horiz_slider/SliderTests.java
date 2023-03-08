package horiz_slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void moveSliderRight() {
        var sliderPage = homePage.clickHorizSlider();

        String value;

        for(int i = 0; i < 8; i++) {
            sliderPage.moveSliderRight();
        }
        value = sliderPage.getSliderValue();

        assertEquals(value, "4");
    }
}
