package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/HW_2.feature", glue = "com/hrms/stepDefinitions", dryRun = false, tags = "@HW")
public class HW_2_TestRunner {

}
