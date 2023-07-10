package com.epam.ta.runner;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.epam.ta.steps")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value="pretty,com.epam.reportportal.cucumber.StepReporter,json:target/reports/json/reports.json,com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")

public class TestRunnerCucumber {

}
