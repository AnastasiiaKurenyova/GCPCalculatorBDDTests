package com.epam.ta.driver.factory;

import org.openqa.selenium.WebDriver;

public class LocalWebDriverFactory implements WebDriverFactory {
    private final WebDriverFactory firefoxDriverFactory = new FirefoxDriverFactory();
    private final WebDriverFactory chromeDriverFactory = new ChromeDriverFactory();
    private final WebDriverFactory edgeDriverFactory = new EdgeDriverFactory();

    @Override
    public WebDriver getDriver(String webDriverType) {
        WebDriverFactory webDriverFactory;
        switch (webDriverType) {
            case "firefox": {
                webDriverFactory = firefoxDriverFactory;
                break;
            }
            case "edge": {
                webDriverFactory = edgeDriverFactory;
                break;
            }
            default: {
                webDriverFactory = chromeDriverFactory;
                break;
            }
        }
        return webDriverFactory.getDriver(webDriverType);
    }
}
