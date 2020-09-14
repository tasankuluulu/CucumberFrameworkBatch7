package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Login.feature", 
				glue = "com/hrms/stepDefinitions", 
				dryRun = false, // when set as true will run over the feature steps and identify the missing implementation)
				monochrome = true, // when set as true will format the console outcome
				tags = "@smoke", 
				strict = true, // when set as true will fail the execution when undefined step is found
				plugin = {"pretty", // will print the steps inside the console
						"html:target/cucumber-default-reports", // generates default html report
						"rerun:target/FailedTests.txt", // generates a txt file only with failed tests
						"json:target/cucumber.json"}) // generates json reports
public class TestRunner {
	
}
