package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssert {

	
	@Test
	public void googleTitleTest(){
		
			WebDriver driver= new FirefoxDriver();
			driver.navigate().to("http://google.com");
			
			//System.out.println(driver.getTitle());
			
			Assert.assertEquals(driver.getTitle(),"Gooogle");
			//Assert.assertEquals(actual, expected);
			
				

	}
	
	
}
