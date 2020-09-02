package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
  features= {"FeaturesFile/File1.feature"},
  glue= {"stepdefinition"}
)
public class Runner {

}
