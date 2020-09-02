package com.qa.stepdefinition;

import org.junit.Assert;
import org.junit.BeforeClass;

import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.testBase.TestBase;
import com.qa.util.ExpectedResults;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FlipkartLoginSDF extends TestBase {
	TestBase tb =new  TestBase();
	FlipkartLoginPage flp; 
	FlipkartHomePage  fhp; 
    String msg,actualMsg,excpetedUserName;
	int checkAssert;
	
	
	@Given("User enter credentials as {string} and {string} and {string} and {string}")
	public void userLoginData(String usrId, String passWord,String errMsg,String usrName) {
		  tb.initDriver();
		  flp = new FlipkartLoginPage();
		  fhp = new FlipkartHomePage();
	      flp.enterLoginDetails(usrId, passWord);
	      msg=errMsg;
	      excpetedUserName=usrName;  
	}

	@When("User click on login Button")
	public void submitLoginForm() {
	    if(msg.length()==0)
	    { 	
		    checkAssert=1;
		    System.out.println(checkAssert);
	    	flp.goToFlipkartHome();
	      
	    }
	    else
	    {	
	    	System.out.println(checkAssert);
	    	actualMsg=flp.errorMsg();
	    }	
	}

	@Then("User is taken to FlipKart Home.")
	public void verifyUserNameHomePage() throws InterruptedException {
	   	
		if(checkAssert==1)
		{	
		 Assert.assertEquals(excpetedUserName,fhp.checkNameHomePage(excpetedUserName));
		 driver.close();
		}
		else
		{	
		 Assert.assertEquals(actualMsg,msg);
		 driver.close();
		}
		
	}

	
	
}