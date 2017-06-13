package com.day1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTestNGParameter {

	
	
	@Test (dataProvider="Authentication")

	public void testParameter (String firstName, String lastName) {
		
		System.out.println(firstName);
		System.out.println(lastName);
	}
	
	@DataProvider (name = "Authentication")
	
	public static Object[][] credentials() {
	
	return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_2", "Test@123" } };
	
	}
	
}
