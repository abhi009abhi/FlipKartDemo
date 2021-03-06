package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testBase.TestBase;

public class FlipkartHomePage extends TestBase{
	WebElement nameHomePage;
	@FindBy(xpath="//span[text()='Electronics']")	
    WebElement electronics;		
	
	@FindBy(xpath="//span[text()='TVs & Appliances']']")
    WebElement tvAndAppliances;	
	
	@FindBy(xpath="//span[text()='Men']")
    WebElement men;	
	
	@FindBy(xpath="//span[text()='Women']")
    WebElement women;	
	
	@FindBy(xpath="//span[text()='Baby & Kids']")
    WebElement babyAndKids;
	
	@FindBy(xpath="//span[text()='Home & Furniture']")
    WebElement homeAndFurniture;	
	
	@FindBy(xpath="//span[text()='Sports, Books & More']")
    WebElement sportsBookMore;
	
	@FindBy(xpath="//span[text()='Electronics']//following-sibling::ul//li/a")
    List<WebElement> subMenuElectronics;
	
	@FindBy(xpath="//span[text()='TVs & Appliances']//following-sibling::ul//li/a")
    List<WebElement> subMenuTvAndAppliances;
	
	@FindBy(xpath="//span[text()='Men']//following-sibling::ul//li/a")
	List<WebElement> subMenuMen;
	
	@FindBy(xpath="//span[text()='Women']//following-sibling::ul//li/a")
	List<WebElement> subMenuWomen;
	
	@FindBy(xpath="//span[text()='Baby & Kids']//following-sibling::ul//li/a")
	List<WebElement> subMenuBabyAndKids;
	
	@FindBy(xpath="//span[text()='Sports, Books & More']//following-sibling::ul//li/a")
	List<WebElement> subMenuSportsBooksMore;
	
	@FindBy(xpath="//span[@class='_1QZ6fC _3Lgyp8']")
	List<WebElement> topMenuFlipKart;
	
	List<String> categories,categoriesSubOption;
	WebElement moveToCategory,moveToSubCategory;
	
	WebDriverWait wait;
	public FlipkartHomePage()
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
	}
	
	public String checkNameHomePage(String s) {
	 
	 nameHomePage=driver.findElement(By.xpath("//div[text()='"+s+"']"));	
	 return nameHomePage.getText();
	}
    
	public boolean goToMenuAndSubMenu(String usrCat,String usrSubCat)
	{
		System.out.println("Main menu= "+usrCat+" Sub Menu "+usrSubCat);
		boolean bothMenuFound=true;
		if(checkMainMenuOptionExist(usrCat))
		{	
			moveToCategory.click();
		    bothMenuFound=checkSubMenuOptionExist(categories.get(categories.indexOf(usrCat)),usrSubCat);
		}
		else
		{
			bothMenuFound=false;
		    
		}
		
		if(bothMenuFound==true)
		{
			moveToSubCategory.click();
		}	
	System.out.println("bothMenu is "+bothMenuFound);	
   
	return bothMenuFound;}
	
	public boolean checkMainMenuOptionExist(String usrCat)
	{
		boolean mainMenuFound=false;
		categories = checkMenu(topMenuFlipKart);
		moveToCategory = getWebElement(categories,topMenuFlipKart, usrCat);
		if(moveToCategory !=null)
		{
			mainMenuFound = true;
		}	
		System.out.println("mainMenuFound is "+mainMenuFound);
	return mainMenuFound;}
	
	public boolean checkSubMenuOptionExist(String mainMenuSelectedAs,String usrSubCat)
	{
		boolean subMenuFound=false;
		moveToSubCategory=getSubMenu(mainMenuSelectedAs, usrSubCat);
		if(moveToSubCategory!=null)
		{
			subMenuFound=true;
		}	
		
		System.out.println("SubMenuFound is "+subMenuFound);
	return subMenuFound;}
	
	
	
	public List<String> checkMenu(List<WebElement> we)
	{
	  int noOfAttempts =0;
	  List<String> list = new ArrayList<String>();
	  while(noOfAttempts<11) 
	   try
	   {
		    for(int i=0;i<we.size();i++)
			{
				list.add(we.get(i).getText());
			}
		      break;
	   }
	   catch(StaleElementReferenceException se)
	   {
		   System.out.println("attempt count "+noOfAttempts);
		   noOfAttempts++;
	   }
	  
	return list;}
	
	public WebElement getWebElement(List<String> textofOptions,List<WebElement> we, String usrOptions)
	{
	  WebElement userWebELement=null;	
	  if(textofOptions.contains(usrOptions))
	 {
		 userWebELement=we.get(textofOptions.indexOf(usrOptions));
	 }
	return userWebELement;} 
	
	public WebElement getSubMenu(String mainMenuSelectedAs,String usrSubCat)
	{
		WebElement we= null;
		System.out.println(mainMenuSelectedAs);
		switch (mainMenuSelectedAs) {
		case "Electronics":
			wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//span[text()='Electronics']//following-sibling::ul//li/a"),100));
			categoriesSubOption=checkMenu(subMenuElectronics);
			moveToSubCategory=getWebElement(categoriesSubOption,subMenuElectronics,usrSubCat);
			return moveToSubCategory;
		case "TVs & Appliances":
			wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//span[text()='TVs & Appliances']//following-sibling::ul//li/a"),100));
			categoriesSubOption=checkMenu(subMenuTvAndAppliances);
			moveToSubCategory=getWebElement(categoriesSubOption,subMenuTvAndAppliances,usrSubCat);
			return moveToSubCategory;
		default:
			System.out.println("returninf grom default");
			return we;
		}
	}
	
	
  
	
	
}//class
	
	
	
	
	
