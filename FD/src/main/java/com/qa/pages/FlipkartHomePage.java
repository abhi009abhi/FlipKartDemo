package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	public FlipkartHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkNameHomePage(String s) {
	 
	 nameHomePage=driver.findElement(By.xpath("//div[text()='"+s+"']"));	
	 return nameHomePage.getText();
	}
    
	//Return a List having text of all web elements
	public List<String> getTextofWebElements(List<WebElement> we)
	{
		List<String> weString =new ArrayList<String>();
		for(int i=0;i<we.size();i++)
		{
			weString.add(we.get(i).getText());
		}	
		
	return weString;}
	
			
	public WebElement getMenuOptionToClick(List<WebElement> weList, List<String> list,String usrCat)
	{
		if(list.contains(usrCat))
		{	
           return weList.get(list.indexOf(usrCat));
		}
	return electronics;
	
	}
	
	public void userMainAndSubMenuOptions(String usrCat,String usrSubCat)
	{
	    categories=getTextofWebElements(topMenuFlipKart);
		moveToCategory=getMenuOptionToClick(topMenuFlipKart,categories,usrCat);
		moveToCategory.click();
		moveToSubCategory=getSubMenu(moveToCategory.getText(), usrSubCat);
		moveToSubCategory.click();
	}
	
	public WebElement getSubMenu(String mainMenuSelectedAs,String usrSubCat)
	{
		WebElement we= null;
		switch (mainMenuSelectedAs) {
		case "Electronics":
			categoriesSubOption=getTextofWebElements(subMenuElectronics);
			moveToSubCategory=getMenuOptionToClick(subMenuElectronics,categoriesSubOption,usrSubCat);
			return moveToSubCategory;
		case "TVs & Appliances":
			categoriesSubOption=getTextofWebElements(subMenuTvAndAppliances);
			moveToSubCategory=getMenuOptionToClick(subMenuTvAndAppliances,categoriesSubOption,usrSubCat);
			return moveToSubCategory;
		default:
			return we;
		}
	}
}
