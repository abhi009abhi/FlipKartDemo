package com.qa.stepdefinition;

import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.pages.FlipkartAllProductPage;
import com.qa.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartHomeSDF extends TestBase{
	TestBase tb =new  TestBase();
	FlipkartLoginPage flp; 
	FlipkartHomePage  fhp; 
    
	
	@Given("User has login successfully")
	public void user_has_login_successfully() {
	    tb.initDriver();
	    flp = new FlipkartLoginPage();
	    fhp = new FlipkartHomePage();
	    flp.enterLoginDetails("7507218335","FlipKart007");
	    flp.goToFlipkartHome();
	   
	}

	@When("User clicks on {string} and {string}")
	public void user_clicks_on_and(String string, String string2) {
		
		
		//fhp.clickMainMenuAndSubOption("Electronics","shoes");
		fhp.clickMainMenuAndSubOption("Electronics","oyo");
		fhp.clickMainMenuAndSubOption("ooyo","MI");
		fhp.clickMainMenuAndSubOption("Electronics","Mi");
		
	}

	@Then("user is taken to Product Page")
	public void user_is_taken_to_Product_Page() throws InterruptedException {
	  
	  //driver.quit();
	}

}
