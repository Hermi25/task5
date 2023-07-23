package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver = SeleniumHelper.driver;

    private final By title = By.xpath("//*[contains(@class,'MinimalLoginForm')]");
    private final By emailInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("loginButton");
    private final By errorMessage = By.id("responseMessage");

    public LoginPage() {
        driver.navigate().to("https://sandbox.evernote.com/");
    }

    public boolean isVisible() {
        WebElement webElement = driver.findElement(title);
        SeleniumHelper.waitForElement(driver, webElement);
        return webElement.isDisplayed();
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        clickLoginButton();
        WebElement webElement = driver.findElement(passwordInput);
        SeleniumHelper.waitForElement(driver, webElement);
        webElement.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {

        WebElement webElement = driver.findElement(errorMessage);
        SeleniumHelper.waitForElement(driver, webElement);
        return webElement.getText();
    }
}
