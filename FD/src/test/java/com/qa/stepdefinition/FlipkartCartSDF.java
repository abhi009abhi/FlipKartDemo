package com.qa.stepdefinition;

import java.util.Set;

import org.junit.Assert;

import com.qa.pages.FlipkartAllProductPage;
import com.qa.pages.FlipkartCartPage;
import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;
import com.qa.pages.FlipkartProductPage;
import com.qa.testBase.TestBase;
import com.qa.util.FlipkartUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class FlipkartCartSDF {
	
	TestBase tb =new  TestBase();
	FlipkartUtility flipUtil;
	FlipkartLoginPage flp; 
	FlipkartHomePage  fhp; 
	FlipkartAllProductPage fall;
	FlipkartProductPage flProd;
	String usrProd;
	FlipkartCartPage cart;
	
	@Given("cart has Product{string} and{string} and {string}")
	public void cart_has_Product_and_and(String string, String string2, String string3) {
	    
		tb.initDriver();
		flipUtil= new FlipkartUtility();
	    flp = new FlipkartLoginPage();
	    fhp = new FlipkartHomePage();
	    fall = new FlipkartAllProductPage();
	    flProd = new FlipkartProductPage();
	    cart = new FlipkartCartPage();
	    flp.enterLoginDetails("7507218335","FlipKart007");
	    flp.goToFlipkartHome();
	    fhp.userMainAndSubMenuOptions(string, string2);
	    String handle=flipUtil.getPageHandle();
	    fall.checkProduct(string3);
	    Set<String> allHandles = flipUtil.getAllHandle();
	    flipUtil.changeWindow(handle,allHandles);
	    flProd.clickOnAddToCart();
	}

	@Then("verify item count and Price")
	public void verify_item_count_and_Price() throws InterruptedException {
	 
		boolean result=false;
	    if(cart.checkItemCounts()==true&&cart.checkAmountTotal()==true) 	
	    {
	    	result=true;
	    }
	    Assert.assertEquals(true, result);
	}

}
