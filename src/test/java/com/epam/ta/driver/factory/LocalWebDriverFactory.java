package com.epam.ta.driver.factory;

import com.epam.ta.driver.WebDriverType;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverFactory implements WebDriverFactory {
    private final WebDriverFactory firefoxDriverFactory = new FirefoxDriverFactory();
    private final WebDriverFactory chromeDriverFactory = new ChromeDriverFactory();
    private final WebDriverFactory edgeDriverFactory = new EdgeDriverFactory();

    @Override
    public WebDriver getDriver(WebDriverType webDriverType) {
        WebDriverFactory webDriverFactory;
        switch (webDriverType) {
            case FIREFOX -> webDriverFactory = firefoxDriverFactory;
            case EDGE -> webDriverFactory = edgeDriverFactory;
            default -> webDriverFactory = chromeDriverFactory;
        }
        return webDriverFactory.getDriver(webDriverType);
    }
}
