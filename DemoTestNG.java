package com.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("I am in Before suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("I am in after suite");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("I am in Before class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("I am in after class");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("I am in Before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("I am in after Test");
	}
	
		
	@Test 
	public void login(){
	
	System.out.println("I am in Login test");
	}
	
	@Test(dependsOnMethods="login")		//execute only if login passes done by dependsOnMethod.Priorities are used for test execution sequence.
	public void logout(){
		
		System.out.println("I am in Logout");
	}
	
	@Test (enabled=false)
	public void Payment(){
	
	System.out.println("I am in Payment test");
	}
	
	@BeforeMethod
	public void beforeMethod(){
	
	System.out.println("I m in before method");
	}
	
	@AfterMethod
	public void afterMethod(){
	
	System.out.println("I m in after method");
	}
	
}
