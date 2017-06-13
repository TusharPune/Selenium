package com.day1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTable {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/gainers/bse/weekly");
		
		String company="Godfrey Philips";
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		//List <WebElement> rows=table.findElements(By.tagName("tr"));
	/*	
		System.out.println(rows.size());
		for (int rnum=0; rnum<rows.size();rnum++){
			
			System.out.println(rows.get(rnum).getText());
		}*/
		
	
		
		
		//List <WebElement> rows= table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		//int rnum1=rows.size();
		
		List <WebElement> col1= table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	
		/*for (int i=0 ; i<=rows.size();i++){
			System.out.println(rows.get(i).getText());
			
		}
		*/
		
		int position =1;
		
		for (int rnum=0;rnum<col1.size();rnum++){
			//System.out.println(rnum);
						
			if (col1.get(rnum).getText().equals(company)){
			position=rnum;
			//System.out.println(position);
			break;
			}
			
		}
		
		//System.out.println(position);
		
		String value=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(position+1)+"]/td[4]")).getText();
	
		System.out.println("Current Price of "+value);
		
	
		

	}
}

