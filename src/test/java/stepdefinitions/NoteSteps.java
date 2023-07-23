package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.NotePage;

public class NoteSteps {

    private NotePage notePage = new NotePage();

    private static final String NOTE_CONTENT = "This is a new note content";

    @Then("Note page is visible")
    public void visible() {
        boolean notePageVisible = notePage.isVisible();
        Assert.assertTrue(notePageVisible);
    }

    @When("User writes a new note")
    public void writeNote() {
        notePage.writeNote(NOTE_CONTENT);
    }

    @Then("Added note is Visible")
    public void noteVisible() {
        boolean noteVisible = notePage.isNoteVisible(NOTE_CONTENT);
        Assert.assertTrue(noteVisible);
    }

    @When("User opens the created note")
    public void openNote() {
        notePage.clickNote();
    }

    @When("User logs out")
    public void logout() {
        notePage.clickLogoutButton();
    }
}
