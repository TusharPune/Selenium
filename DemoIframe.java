package com.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		driver.switchTo().frame(0);
        driver.findElement(By.name("firstname")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("IF2");
        driver.findElement(By.xpath("//*[@id='post-9']/div/div[1]/div/p[1]/a/img")).click();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
       
        driver.findElement(By.xpath("//*[@id='text-10']/div[2]/form/p[2]/input")).sendKeys("asjdhka@asd.com");
        
        Thread.sleep(3000);

	}

}
