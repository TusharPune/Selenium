package com.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert ale=driver.switchTo().alert(); 
		System.out.println(ale.getText());
		Thread.sleep(2000);
		ale.accept();
		//ale.dismiss();
	
}
}
