/*
This is the cucumber runner
 */
package config;

import cucumber.api.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
        features={"src/main/resources/cucumber"},
        glue={"stepdefs"},
        tags={"@All"} // Can choose the tests to run @All for all
)

public class CukesRunner {


}
