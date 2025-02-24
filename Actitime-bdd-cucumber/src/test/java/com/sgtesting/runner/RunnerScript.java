package com.sgtesting.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/FeatureFiles",
        glue = "com.sgtesting.stepdefinitions"
)
public class RunnerScript extends AbstractTestNGCucumberTests {
}
