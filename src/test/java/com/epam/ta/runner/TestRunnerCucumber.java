package com.epam.ta.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "com.epam.reportportal.cucumber.StepReporter"},
        features = {"src/test/resources/features"},
        glue = {"com.epam.ta.steps"},
        tags = ""
)

public class TestRunnerCucumber extends AbstractTestNGCucumberTests {

}
