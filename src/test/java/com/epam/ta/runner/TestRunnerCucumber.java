package com.epam.ta.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "com.epam.reportportal.cucumber.StepReporter",
                "json:target/reports/json/reports.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = {"src/test/resources/features"},
        glue = {"com.epam.ta.steps", "com.epam.ta.hooks"},
        tags = ""
)

public class TestRunnerCucumber extends AbstractTestNGCucumberTests {

}
