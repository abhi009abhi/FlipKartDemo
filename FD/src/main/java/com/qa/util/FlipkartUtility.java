package com.qa.util;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.qa.testBase.TestBase;

public class FlipkartUtility extends TestBase {

	
	public String getPageHandle()
	{
		return driver.getWindowHandle();
	}
	
	public Set<String> getAllHandle()
	{
		return driver.getWindowHandles();
	}
    
	public void changeWindow(String handle,Set<String> allHandle)
	{
		for(String s:allHandle)
		{
			if(!s.equals(handle))
			{
				driver.switchTo().window(s);
			}	
		}	
		TimeUnit a = TimeUnit.SECONDS; 
	}
}
