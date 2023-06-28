package com.epam.ta.driver.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver getDriver(String webDriverType) {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
