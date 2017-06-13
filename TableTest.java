package com.day1;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.By.ByXPath;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.WebElement;

public class TableTest 

{


	public static void main(String args [])

	{

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);

		driver.navigate().to("http://money.rediff.com/gainers/bse/weekly");	

		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

		List <WebElement> rowcount = table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		//int totalrows = rowcount.size();

		String rowvalue = "Barak Valley Cements";

	for (int i=1 ; i<=rowcount.size();i++)

	{

		String findvalue = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[1]")).getText();

		if(rowvalue.equals(findvalue))

		{
			
			
			String value = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + i + "]")).getText();

			System.out.println(value);

			
			break;


			
		}

		

	}
	}
}