package com.qa.stepdefinition;

import com.qa.testBase.TestBase;

import cucumber.api.java.After;

public class FlipkartSDFHooks extends TestBase {

	@After
	public void afterEachScenario()
	{
		//driver.close();
	}
}
