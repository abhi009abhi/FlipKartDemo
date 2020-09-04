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
import cucumber.api.java.en.When;

public class FlipkartProductSDF extends TestBase{
	TestBase tb =new  TestBase();
	FlipkartUtility flipUtil;
	FlipkartLoginPage flp; 
	FlipkartHomePage  fhp; 
	FlipkartAllProductPage fall;
	FlipkartProductPage flProd;
	String usrProd;
	FlipkartCartPage cart;
	@Given("User selects Product as {string} and {string} and {string}")
	public void user_selects_Product_as_and_and(String string, String string2, String string3) {
		tb.initDriver();
		flipUtil= new FlipkartUtility();
	    flp = new FlipkartLoginPage();
	    fhp = new FlipkartHomePage();
	    fall = new FlipkartAllProductPage();
	    flProd = new FlipkartProductPage();
	    cart = new FlipkartCartPage();
	    flp.enterLoginDetails("7507218335","FlipKart007");
	    flp.goToFlipkartHome();
	    Assert.assertTrue(fhp.goToMenuAndSubMenu(string,string2));
	    String handle=flipUtil.getPageHandle();
	    Assert.assertTrue(fall.checkProduct(string3));
	    fall.goToFlipkartProduct();
	    Set<String> allHandles = flipUtil.getAllHandle();
	    flipUtil.changeWindow(handle,allHandles);
	}

	@When("clicks on Add to Cart")
	public void clicks_on_Add_to_Cart() throws InterruptedException {
	    
		flProd.clickOnAddToCart();
			
	}

	@Then("product is added to cart")
	public void product_is_added_to_cart() {
	    
		
		driver.quit();
	}
	
	
}
