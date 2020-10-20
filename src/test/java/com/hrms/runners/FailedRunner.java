package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/FailedTests.txt", 
				glue = "com/hrms/stepDefinitions", 
				monochrome = true, // when set as true will format the console outcome
				plugin = {"pretty", // will print the steps inside the console
						"html:target/cucumber-default-reports", // generates default html report
						"rerun:target/FailedTests.txt"}) 
public class FailedRunner {
	
}
