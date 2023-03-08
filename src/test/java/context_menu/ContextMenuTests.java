package context_menu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick() {
        var contextPage = homePage.clickContextMenu();

        contextPage.doContextClick();
        String alertText = contextPage.alert_getText();
        contextPage.alert_clickToAccept();

        assertEquals(alertText,"You selected a context menu",
                "Incorrect alert text");
    }
}
