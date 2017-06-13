package com.day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DemoCertificate {

	public static void main(String[] args) {
		//For Firefox Browser
				//step 1: create a new firefox profile say "pf"  
				
		ProfilesIni allProfiles = new ProfilesIni();
		System.setProperty("webdriver.firefox.profile","myprofile");
		String browserProfile = System.getProperty("webdriver.firefox.profile");
		FirefoxProfile profile = allProfiles.getProfile(browserProfile); 
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		FirefoxDriver driver = new FirefoxDriver(profile);
				
		driver.get("https://inchnzm02.tcs.com/");
	}

}
