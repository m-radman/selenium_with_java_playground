package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InfiniteScrollPage {
    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scroll until paragraph with specified index is in view
     * @param index 1-based
     */
    public void scrollToPara(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExector = ((JavascriptExecutor)driver);

        while(getNumberOfParagraphsPresent() < index) {
            jsExector.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent() {
        List<WebElement> ps = driver.findElements(textBlocks);
        return  ps.size();
    }
}
