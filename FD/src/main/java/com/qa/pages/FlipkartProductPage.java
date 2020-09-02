package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class FlipkartProductPage extends TestBase{

	@FindBy(css="div._2dcihZ")
	WebElement cartCount;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement addToCart;
	
	@FindBy(xpath="//div[@class='_3aS5mM']")
	List<WebElement> productName;
	
	WebDriverWait wait;
	public FlipkartProductPage()
	{
		PageFactory.initElements(driver,this);
		 wait = new WebDriverWait(driver,30);
	}
		
	public void clickOnAddToCart()
	{
		System.out.println("clicking on add to cart");
		addToCart.click();
	}
	
	public String getProductName()
	{
		String s = driver.getTitle();
		//System.out.println(s);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_3aS5mM']")));
		return s;
	}
}
