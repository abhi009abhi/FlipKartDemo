package com.qa.stepdefinition;

import java.util.Set;

import org.junit.Assert;

import com.qa.pages.FlipkartAllProductPage;
import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.pages.FlipkartProductPage;
import com.qa.testBase.TestBase;
import com.qa.util.FlipkartUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FlipkarAllProductSDF extends TestBase{
	TestBase tb =new  TestBase();
	FlipkartUtility util;
	FlipkartLoginPage flp; 
	FlipkartHomePage  fhp; 
	FlipkartAllProductPage fall;
	FlipkartProductPage fpp;
	String usrProd,runTimeProdSelected;
	
@Given("User selects  {string} and {string} and {string} as")
public void user_selects_and_and_as(String string, String string2, String string3) {
	tb.initDriver();
    flp = new FlipkartLoginPage();
    util = new FlipkartUtility();
    fhp = new FlipkartHomePage();
    flp.enterLoginDetails("7507218335","FlipKart007");
    flp.goToFlipkartHome();
    fhp.clickMainMenuAndSubOption(string,string2);
    usrProd=string3;
    
}

@When("click on user Product")
public void click_on_user_Product() {
    fall = new FlipkartAllProductPage();
    String handle = util.getPageHandle();
    fall.checkProduct(usrProd);
    fpp=new FlipkartProductPage();
    Set<String> allHandle= util.getAllHandle();
    util.changeWindow(handle, allHandle);
    runTimeProdSelected = fpp.getProductName();
    //System.out.println(runTimeProdSelected);
    
    
}

@Then("user is taken to product Page")
public void user_is_taken_to_product_Page() {
	System.out.println("inside then");
	boolean flag = false;
	if(runTimeProdSelected.length()>usrProd.length())
	{
		if(runTimeProdSelected.contains(usrProd))
		{
			flag = true;
		}	
	}
	if(runTimeProdSelected.length()<usrProd.length())
	{
		if(usrProd.contains(runTimeProdSelected))
		{
			flag = true;
		}
	}
	
    Assert.assertEquals(true, flag);
    driver.quit();
}
}
