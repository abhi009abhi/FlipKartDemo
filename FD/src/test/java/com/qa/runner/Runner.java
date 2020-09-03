package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
  features= {"FeaturesFile"},
  glue= {"com.qa.stepdefinition"},
  dryRun= false,
  monochrome=true,
  plugin= {"json:target/json-cucumber-reports/Cucumber.json",
		   "html:target/html-cucumber-reports/Cucumber.html"}
)
public class Runner {

}
