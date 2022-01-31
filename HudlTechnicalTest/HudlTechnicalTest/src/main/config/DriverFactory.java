package config;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.cs.A;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver driver = new ChromeDriver();

    public DriverFactory (){}

    @Before
    public static WebDriver getDriver() {
        return driver;
    }
    public void quitDriver () {
        driver.close();
        driver.quit();
    }
}