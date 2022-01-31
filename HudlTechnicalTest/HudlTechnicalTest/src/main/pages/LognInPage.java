package pages;

import config.DriverFactory;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.Setup;



public class LognInPage extends Page {
    public Setup setup;

    public LognInPage(DriverFactory webDriver){
        super(webDriver);
    }
    private static final By EMAIL = By.id("email");
    private static final By PASSWORD = By.id("password");
    private static final By LOG_IN_BUTTON = By.id("logIn");
    private static final By NAV_LOG_IN_BUTTON = By.xpath("//*[@data-qa-id='login']");

    public void clickSignInButton(){
        click(LOG_IN_BUTTON);

    }

    public void enterLoginName(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(EMAIL)));
        webDriver.findElement(EMAIL).sendKeys("email"); //Username set here

    }
    public void enterPassword(){
        webDriver.findElement(PASSWORD).sendKeys("password"); //Password set here
    }
    public boolean checkLoginPageURL (){

        return webDriver.getTitle().contains("home");

    }

    public void goToLoginPage(){
        click(NAV_LOG_IN_BUTTON);
    }


}
