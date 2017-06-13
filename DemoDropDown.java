package com.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.indianrail.gov.in/between_Imp_Stations.html");
		
		WebElement srcStn=driver.findElement(By.xpath("//select[@name='lccp_src_stncode']"));
		
		Select sel=new Select(srcStn);
		
		sel.selectByIndex(10);
		Thread.sleep(3000);
		sel.selectByValue("ADI");
		Thread.sleep(3000);
		sel.selectByVisibleText("BANGALORE - SBC");
		
		File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\Selenium_R\\scr1.png"));
		
		
		
	}

}
