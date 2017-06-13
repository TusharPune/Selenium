package com.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		String browser="firefox";
		
		if (browser.equals("firefox"))
		{
		driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		} 
		else if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_R\\Jars\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("http://www.flipkart.com/");
			System.out.println(driver.getTitle());	
			
			
		}else {
			System.setProperty("webdriver.ie.driver", "F:\\Selenium_R\\Jars\\IEDriverServer_x64_2.47.0\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
			driver.get("http://www.flipkart.com/");
			System.out.println(driver.getTitle());	
		}
		
		
		
		
		
		
		driver.close();
		
		
		

	}

}
