package com.epam.ta.steps;

import com.epam.ta.driver.DriverSingleton;
import com.epam.ta.pages.AbstractPage;
import com.epam.ta.pages.calculator.ComputeEngineCalcPage;
import com.epam.ta.pages.EstimationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;


public class CheckEstimationSteps extends AbstractPage {

    public CheckEstimationSteps() {
        super(DriverSingleton.getDriver());
    }

    @And("^I click Add to Estimate button$")
    public void clickAddToEstimateButton() {
        new ComputeEngineCalcPage(driver).addToEstimate();
    }

    @Then("I should get the total estimated cost {double}$ on Estimation page")
    public void iShouldGetTheTotalEstimatedCost(double expectedCost) {
        double actualCost = new EstimationPage(driver).getTotalEstimationValue();
        Assertions.assertEquals(actualCost, expectedCost, "Total estimated cost value is not expected");
    }

}
