package com.vsmaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariBrowser {

	
	
	WebDriver driver;
	
	@Test
	void safariset() {
		
		WebDriverManager.safaridriver().setup();
		
		driver = new SafariDriver();
		
		driver.get("https://fb.com");
		
		driver.quit();
		
		
		
		
	}
}
