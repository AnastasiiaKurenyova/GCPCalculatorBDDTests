package com.epam.ta.driver.factory;

import com.epam.ta.driver.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver getDriver(WebDriverType webDriverType) {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
