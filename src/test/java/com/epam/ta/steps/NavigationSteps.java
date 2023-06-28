package com.epam.ta.steps;

import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.pages.AbstractPage;
import com.epam.ta.pages.calculator.ComputeEngineCalcPage;
import com.epam.ta.pages.ServiceTabPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class NavigationSteps extends AbstractPage {

    public NavigationSteps() {
        super(DriverSingleton.getDriver());
    }

    @Given("^I navigated to GCP Calculator page$")
    public void iNavigateToGCPCalculator(){
        new ComputeEngineCalcPage(driver).openPage();
        new ComputeEngineCalcPage(driver).switchToCalculatorFrame();
    }

    @Given("^Compute Engine service is checked on Service Tab$")
    public void iCheckComputeEngine(){
        new ServiceTabPage(driver).switchToComputeEngineTab();
    }

    @Given("^GKE Standard service is checked on Service Tab$")
    @And("^I navigate to GKE Standard service on Service Tab$")
    public void gkeStandardServiceIsCheckedOnServiceTab() {
        new ServiceTabPage(driver).switchToGKEStandardTab();
    }

}
