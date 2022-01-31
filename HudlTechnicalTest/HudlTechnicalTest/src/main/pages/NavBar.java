package pages;

import config.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBar extends Page {
        public NavBar(DriverFactory webDriver){
        super(webDriver);
    }

        private static final By HOME_BUTTON = By.className("login");
        private static final By NAV_LOG_OUT_BUTTON = By.xpath("//*[@data-qa-id='webnav-usermenu-logout']");




    public boolean checkLoginOutLink(){
        return webDriver.findElement(NAV_LOG_OUT_BUTTON).isDisplayed();
    }





}





