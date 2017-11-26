package com.talentech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
						features= {"features"}, glue= {"com.talentech.stepdefs"}
			)

public class Testrunner extends AbstractTestNGCucumberTests {

}
