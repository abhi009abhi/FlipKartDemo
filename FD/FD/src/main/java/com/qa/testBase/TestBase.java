package com.qa.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.FlipkartHomePage;
import com.qa.pages.FlipkartLoginPage;

import cucumber.api.java.After;

public class TestBase {

	public static WebDriver driver;
	public Properties prop;
	File file;
	FileInputStream fis;
	
	
	void readProperties() 
	{
		
		try 
		{
		 file = new File(System.getProperty("user.dir")+"/src/main/java/"+"com/qa/config/config.properties");
		 fis = new FileInputStream(file);
		 prop = new Properties();
		 prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public TestBase()
	{
		
		readProperties();
		
	}
	
	public void initDriver()
	{
		
		if("chrome".equals(prop.getProperty("browser")))
		{
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"/ChromeDriver/chromedriver.exe");
		    driver = new ChromeDriver();
		    System.out.println("driver initailzed as :"+ driver);
		}
		
		  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		  driver.get(prop.getProperty("url"));
	}
	
	
	

	
}
