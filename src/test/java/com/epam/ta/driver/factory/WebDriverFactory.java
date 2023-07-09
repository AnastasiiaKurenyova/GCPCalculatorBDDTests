package com.epam.ta.driver.factory;

import com.epam.ta.driver.WebDriverType;
import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {

    WebDriver getDriver(WebDriverType webDriverType);
}
