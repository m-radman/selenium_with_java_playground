package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("input[type=\"range\"]");
    private By sliderValue = By.cssSelector("span#range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSliderRight() {
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public void moveSliderLeft() {
        driver.findElement(slider).sendKeys(Keys.ARROW_LEFT);
    }

    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }
}
