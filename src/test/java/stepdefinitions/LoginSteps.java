package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.SeleniumHelper;


public class LoginSteps {

    WebDriver driver = SeleniumHelper.createWebDriver();
    LoginPage loginPage;

    @Given("User is on the login page")
    public void navigateToLoginPage() {
        // Code to navigate to the login page e.g.
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid email and password")
    public void enterValidCredentials() {
        loginPage.enterEmail("bla");
        loginPage.enterPassword("blabla");
        // Code to enter invalid credentials and attempt login
    }

    @When("User clicks login button")
    public void clickLogin() {
        loginPage.clickLoginButton();
        // Code to enter invalid credentials and attempt login
    }

    @When("User enters invalid email")
    public void enterInvalidCredentials() {
        loginPage.enterEmail("bla");
        // Code to enter invalid credentials and attempt login
    }

    @Then("User should see an error message")
    public void verifyErrorMessage() {
        // Code to verify the error message after unsuccessful login
        var errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Nie znaleziono konta przypisanego do podanego loginu lub adresu e-mail.", errorMessage);
    }

    @Then("User should be logged in successfully")
    public Object verifyLoginSuccess() {
        // Code to verify successful login
        Assert.assertTrue("Login not successful", true);

        return null;
    }

    @Then("User should be logged out successfully")
    public Object verifyLogoutSuccess() {
        // Code to verify successful login
        Assert.assertTrue("Login not successful", true);

        return null;
    }
}
t
