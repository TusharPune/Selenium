package com.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.tutorialzine.com/2009/09/simple-ajax-website-jquery/demo.html#page4");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement cat = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='pageContent']/img"))));
		
		cat.click();

	}

}
