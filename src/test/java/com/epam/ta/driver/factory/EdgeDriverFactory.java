package com.epam.ta.driver.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver getDriver(String webDriverType) {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
