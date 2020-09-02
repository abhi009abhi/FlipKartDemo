package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class FlipkartCartPage extends TestBase{
	
	@FindBy(xpath="//div[contains(text(),'My Cart')]")
	WebElement myCartCount;
	
	@FindBy(xpath="//div[contains(text(),'Price ')]")
	WebElement priceItemCount;
	
	@FindBy(xpath="//span[@class='pMSy0p XU9vZa']")
	List<WebElement> myCartTotalItemPrices;
	
	@FindBy(xpath="//span[@class='pMSy0p XU9vZa']")
	List<WebElement> pricesLHS;
	
	@FindBy(xpath="//div[@class='_13wOiu']/div/div/span")
	List<WebElement> totalAmount;
	WebDriverWait wait;
	public FlipkartCartPage()
	{
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver, 1000);
	}
	

	public boolean checkItemCounts() 
	{
		boolean result=false; 
		System.out.println("waiting inside");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'My Cart')]")));
		String myCartItemCount = myCartCount.getText().substring(myCartCount.getText().lastIndexOf(")")-1,myCartCount.getText().lastIndexOf(")"));
		String noOfpriceItem = priceItemCount.getText().substring(priceItemCount.getText().indexOf("(")+1,priceItemCount.getText().indexOf("(")+2);
        
		if(myCartItemCount.equals(noOfpriceItem))
		{
			result = true;
		}	
		
	return result;}
	
	public boolean checkAmountTotal()
	{
		boolean result=false;
		int amount =0;
		int total= Integer.parseInt(totalAmount.get(0).getText().substring(1).replace(",",""));
		for(int i=0;i<pricesLHS.size();i++)
		{
			amount = amount+Integer.parseInt(pricesLHS.get(i).getText().substring(1).replace(",",""));
		}	
		if(total==amount)
		{
			result=true;
		}
		
	return result;}
	
	
    

	
}
