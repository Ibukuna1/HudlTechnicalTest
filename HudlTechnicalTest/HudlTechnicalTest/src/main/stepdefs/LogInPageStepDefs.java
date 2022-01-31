package stepdefs;

/**
 * Created by ibukun.akintokun
 */
import static org.junit.Assert.*;
import config.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LognInPage;
import pages.NavBar;

public class LogInPageStepDefs {
    private LognInPage lognInPage;
    private NavBar navBar;


    public LogInPageStepDefs(DriverFactory driver) {
                lognInPage = new LognInPage(driver);
    }

    /*
    Given
         */
    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        lognInPage.goToHomePage();

    }
    @Given("^I access the Login Page$")
    public void i_access_the_login_page () throws Throwable {
        lognInPage.goToLoginPage() ;

    }
    /*
    When
     */

    @When("^I add my login details$")
    public void i_add_my_login_details() throws Throwable {
        lognInPage.enterLoginName();
        lognInPage.enterPassword();
    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable {
        lognInPage.clickSignInButton();
    }

    /*
    Then
    */

    @Then("^I am logged in$")
    public void i_am_on_logged_in() throws Throwable {
        assertTrue(lognInPage.checkLoginPageURL());

    }


}
