package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Objects;

public class NotePage {
    private final WebDriver driver = SeleniumHelper.driver;

    private final By noteTextArea = By.id("gwt-debug-NoteContentEditorView-root");
    private final By logoutButton = By.id("gwt-debug-AccountMenu-logout");
    private final By accountButton = By.id("gwt-debug-AccountMenuView-root");
    private final By saveButton = By.id("gwt-debug-NoteAttributes-doneButton");
    private final By notesView = By.xpath("//*[contains(@class,'focus-NotesView-Note focus-NotesView-Note-selected')]");
    private final By note = By.xpath("//*[contains(@class,'focus-NotesView-Note-snippet qa-snippet')]");

    public boolean isVisible() {
        var wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(Exception.class);
        wait.until((msg) -> driver.findElement(noteTextArea));
        return driver.findElement(noteTextArea).isDisplayed();
    }

    public void writeNote(String noteContent) {
        driver.findElement(noteTextArea).sendKeys(noteContent);
    }

    public void saveNote()
    {
        WebElement webElement = driver.findElement(saveButton);
        SeleniumHelper.waitForElement(driver, webElement);
        webElement.click();
    }

    public boolean isNoteVisible(String content)
    {
        WebElement webElement = driver.findElement(notesView);
        SeleniumHelper.waitForElement(driver, webElement);
        WebElement note = driver.findElement((By) webElement);
        return webElement.isDisplayed() && Objects.equals(note.getText(), content);
    }

    public void clickLogoutButton() {

        WebElement webElement = driver.findElement(logoutButton);
        SeleniumHelper.waitForElement(driver, webElement);
        webElement.click();
        driver.findElement(logoutButton).click();
    }

    public void clickNote() {
        WebElement webElement = driver.findElement(notesView);
        SeleniumHelper.waitForElement(driver, webElement);
        WebElement noteElement = driver.findElement(note);
        noteElement.click();
    }
}
