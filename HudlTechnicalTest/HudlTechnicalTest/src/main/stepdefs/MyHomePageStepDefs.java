package stepdefs;

/**
 * Created by ibukun.akintokun.
 */

import static org.junit.Assert.*;
import config.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LognInPage;
import pages.NavBar;
import pages.MyHomePage;

import static org.junit.Assert.assertTrue;

public class MyHomePageStepDefs {
    private LognInPage lognInPage;
    private MyHomePage myHomePage;

    public MyHomePageStepDefs(DriverFactory driver) {
        myHomePage = new MyHomePage(driver);
    }

    /*
    Given
         */
    /*
    @Then("^I am logged in$")
    public void i_am_on_logged_in() throws Throwable {
        assertTrue(lognInPage.checkLoginPageURL());

    }
    /*
    When
     */


    @When("^I search for a player$")
    public void search_for_player_in_search_bar () throws Throwable{
        myHomePage.searchForPlayer();


    }

    @When("^I select the player$")
    public void select_the_player_in_search_bar () throws Throwable{
        myHomePage.clickOnSearchResult();


    }

}
