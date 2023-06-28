package com.epam.ta.steps;

import com.epam.ta.driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class ScenarioHooks {

    protected WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = DriverSingleton.getDriver();
    }

    @After
    public void afterScenario() {
        DriverSingleton.closeDriver();
    }
}
