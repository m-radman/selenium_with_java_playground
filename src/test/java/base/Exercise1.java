package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise1 {
    private WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingLink.click();

        WebElement example1 = driver.findElement(By.cssSelector("div.example>a:first-of-type"));
        example1.click();

        List<WebElement> menuElements = driver.findElements(By.tagName("li"));
        System.out.println(menuElements.size());

        driver.quit();
    }

    public static void main(String[] args) {
        Exercise1 test = new Exercise1();
        test.setup();
    }
}
