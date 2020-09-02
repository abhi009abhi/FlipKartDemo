package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FlipkartLoginPage extends TestBase {

	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement userName;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement passWord;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[@class='ZAtlA-']")
	WebElement errMsg;
	
	public FlipkartLoginPage()
	 { 
	    System.out.println("driver Recieved as"+ driver);
		PageFactory.initElements(driver,this);
	 }
	
	public void enterLoginDetails(String usr,String pwd)
	{
		System.out.println(userName);
		System.out.println(passWord);
		userName.sendKeys(usr);
		passWord.sendKeys(pwd);
	}
	
	public FlipkartHomePage goToFlipkartHome() 
	{
	  loginBtn.click();
	  return new FlipkartHomePage();
	}
	
	public String errorMsg()
	{
		loginBtn.click();
		String runTimeErrMsg =errMsg.getText();
		System.out.println(runTimeErrMsg);
	    return runTimeErrMsg;
	}
}
