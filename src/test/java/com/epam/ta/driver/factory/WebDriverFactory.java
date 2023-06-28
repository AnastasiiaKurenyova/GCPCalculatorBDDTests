package com.epam.ta.driver.factory;

import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {

    WebDriver getDriver(String webDriverType);
}
