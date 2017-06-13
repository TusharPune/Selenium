package com.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLocator {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("class");
		driver.findElement(By.id("exp-1")).click();
		driver.findElement(By.id("profession-1")).click();
		//driver.findElement(By.partialLinkText("Partial")).click();
		//driver.findElement(By.linkText("Link Test")).click();
		
		driver.findElement(By.xpath("//input[@id='tool-0']")).click();
		

	}
}
