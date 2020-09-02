package com.qa.pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FlipkartAllProductPage extends TestBase {
	
	@FindBy(xpath="//a[@class='_31qSD5']")
	List<WebElement> productOnPage;
	List<String> allProdDisplayed;
	
	public FlipkartAllProductPage()	
	{
		PageFactory.initElements(driver, this);
	}
	int index=0;
	public List<String> getElements()
	{
		List<String> list = new ArrayList();
		for(int i=0;i<productOnPage.size();i++)
		{
			String s= productOnPage.get(i).getAttribute("href").
			substring(0,productOnPage.get(i).getAttribute("href").indexOf("/p"));	
			s=s.replace("https://www.flipkart.com/","");
			s=s.replace("-"," ");
			list.add(s);
			
		}
		
	return list;}
	
	public void checkProduct(String usrProd)
	{
	   
	   allProdDisplayed = getElements();
       for(int i=0;i<allProdDisplayed.size();i++)
       {
    	  if(allProdDisplayed.get(i).contains(usrProd.toLowerCase()))
    	   {
    		   index=i;
    		   goToFlipkartProduct();
    		   break;
    		
    	   } 
       }
       System.out.println("exit check product");
    }
	
	 public FlipkartProductPage goToFlipkartProduct()
	 {
		 System.out.println("call product age :" +driver.getWindowHandle());
		 productOnPage.get(index).click();
		 return new FlipkartProductPage();
	 }
}
