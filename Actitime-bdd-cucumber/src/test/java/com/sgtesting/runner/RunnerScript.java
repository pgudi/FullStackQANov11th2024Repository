package com.sgtesting.runner;

import com.sgtesting.utility.ApplicationIndependent;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = "com.sgtesting.stepdefinitions",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@Execute"
)
public class RunnerScript extends AbstractTestNGCucumberTests {

}
