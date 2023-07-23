package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;



public class LoginSteps {

    LoginPage loginPage;

    @Given("User is on the login page")
    public void navigateToLoginPage() {
        loginPage = new LoginPage();
    }

    @And("User enters valid email and password")
    public void enterValidCredentials() {
        loginPage.enterEmail("test.test@o2.pl");
        loginPage.enterPassword("12345678");
    }

    @When("User clicks login button")
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @When("User enters invalid email")
    public void enterInvalidCredentials() {
        loginPage.enterEmail("bla");
    }

    @Then("User should see an error message")
    public void verifyErrorMessage() {
        var errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Nie znaleziono konta przypisanego do podanego loginu lub adresu e-mail.", errorMessage);
    }

    @Then("User should be logged out successfully")
    public void verifyLogoutSuccess() {
        boolean loginPageVisible = loginPage.isVisible();
        Assert.assertTrue(loginPageVisible);
    }
}
