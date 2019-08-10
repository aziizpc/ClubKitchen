package com.bie.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;  // May need to import manually

@RunWith(Cucumber.class)   // Google Cucumber RunnerClass
@CucumberOptions(
		features = "./ClubKitchen/src/test/java/com/bie/qa/features/one.feature"  // Path of Feature file
		,glue = "com.bie.qa.stepDefinitions.ClubKitchenStepDefinition"  // Path of Step Definition file
		,plugin = {"pretty", "html:test-output/html_output", "json:test-output/json_output/cucumber.json", "junit:test-output/junit_output/cucumber.xml"}  // Output folder and HTML file.
		,monochrome = true  // Display the Console output in a proper readable format. Brackets and all will be gone.
		,strict = true // Will execute test case. If a step is not defined, it will show in console.
		,tags = {"@one"}
		,dryRun = false // Just show the mapping. Won't execute. We can identify if some steps are not defined.
		)

public class TestRunner {
}