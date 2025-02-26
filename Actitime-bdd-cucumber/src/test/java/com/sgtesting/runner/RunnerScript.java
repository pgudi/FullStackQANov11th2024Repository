package com.sgtesting.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/FeatureFiles",
        glue = "com.sgtesting.stepdefinitions",
        plugin = {"pretty",
                "html:Reports/actitime-cucumber-report.html",
                "json:Reports/cucumber.json"},
        tags = "@Execute"
)
public class RunnerScript extends AbstractTestNGCucumberTests {
}
