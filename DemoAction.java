package com.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAction {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
       
        driver.get("http://store.demoqa.com/");
        
       WebElement ele= driver.findElement(By.linkText("Product Category"));
      
       Actions act= new Actions (driver);
       
       //act.moveToElement(ele).build().perform();
       
       act.moveToElement(ele).build().perform();
       
       act.moveToElement(driver.findElement(By.linkText("iPads"))).click().build().perform();
      
       driver.close();
       
        
        
	}

}
