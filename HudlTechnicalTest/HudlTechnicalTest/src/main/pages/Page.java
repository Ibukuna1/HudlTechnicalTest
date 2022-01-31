package pages;

import config.DriverFactory;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import config.Setup;


public abstract class Page {
    public static DriverFactory driver;
    public static WebDriver webDriver;
    private Setup setup;
    public Page(DriverFactory driver){
        Page.driver = driver ;
        webDriver = driver.getDriver();
    }

    public void click (By element){
        webDriver.findElement(element).click();
    }

    public void goToHomePage(){
        webDriver.get("https://www.hudl.com/en_gb/");
        webDriver.manage().window().maximize();

    }
    @After
    public void closeDriver(){
        webDriver.quit();
    }

}
