package com.day1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*String myProxy = "localhost:7777"; 		 //example: proxy host=localhost port=7777
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.PROXY,new Proxy().setHttpProxy(myProxy));*/
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://store.demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		
		js.executeScript("alert('hello world');");
		js.executeScript("scrollBy(0, 250);");


	}

}
