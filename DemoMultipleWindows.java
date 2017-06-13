package com.day1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.icicibank.com/");
		Set <String> winId=driver.getWindowHandles();  //Capturing session Id of first window
		Iterator <String> ite=winId.iterator();

		 driver.findElement(By.xpath("html/body/div[1]/header/div/ul/li[4]/a")).click();
		 winId=driver.getWindowHandles();   // Capturing second window's session id
		 ite=winId.iterator();
		 
		 String mainTab= ite.next();   // First sessionn Id
		 String subTab=ite.next();	   // Second Session Id
		 
		 
		 System.out.println(mainTab+"  "+subTab);
		 
		 driver.switchTo().window(subTab);    // Switch 
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(mainTab);
		 
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
		 
		 
		 
		

	}

}
