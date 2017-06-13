package com.day1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
       
        driver.get("http://jqueryui.com/datepicker/");
        
        driver.switchTo().frame(0);
        
        driver.findElement(By.xpath("//*[@id='datepicker']")).click();
        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]")).click();
        
	}

}
