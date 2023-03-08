package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        //need to wait before continues to set text

        String text1 = "hello";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.increaseIndentation();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 + text2,
                "Text is incorrect");
    }
}