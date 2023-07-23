package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotePage {
    private final WebDriver driver;

    private final By noteTextArea = By.id("note");
    private final By logoutButton = By.id("logoutButton");

    public NotePage(WebDriver driver) {
        this.driver = driver;
    }

    public void writeNote(String noteContent) {
        driver.findElement(noteTextArea).sendKeys(noteContent);
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}