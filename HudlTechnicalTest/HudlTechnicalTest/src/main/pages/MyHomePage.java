package pages;

import config.DriverFactory;
import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyHomePage extends Page {
    private Setup setup;

    public MyHomePage(DriverFactory webDriver){
        super(webDriver);
    }
    private static final By SEARCH_BAR = By.className("mobile-first explore-search-bar--search-active");
    private static final By SEARCH_RESULT = By.xpath("//*[@data-qa-id='search-row-name']");

    public void searchForPlayer(){
        webDriver.findElement(SEARCH_BAR).sendKeys(setup.setPlayerProfile());
    }

    public void clickOnSearchResult(){
        if ( webDriver.findElement(SEARCH_RESULT).getText()== "Emerson Fussell");
            click(SEARCH_RESULT);
    }




}
