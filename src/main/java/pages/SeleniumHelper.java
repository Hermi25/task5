package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class SeleniumHelper {

    public static WebDriver createWebDriver() {
        String webdriver = System.getProperty("browser", "chrome");
        switch (webdriver) {
            case "chrome":
                return new ChromeDriver();
            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriver);
        }
    }

    public static void waitForElement(WebDriver driver, WebElement webElement)
    {
        var wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(Exception.class);
        wait.until((msg) -> webElement.isDisplayed());
    }
}
