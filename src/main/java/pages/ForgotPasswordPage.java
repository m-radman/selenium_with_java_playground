package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInput = By.id("email");
    private By retrievePassBtn = By.id("form_submit");
    private By message = By.tagName("h1");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }
    public void retrievePassword() {
        driver.findElement(retrievePassBtn).click();
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }


}
