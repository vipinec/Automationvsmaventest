package com.vsmaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomatiom {
	
	WebDriver driver;
	@Test
	 
	 void driverManager() {
		 
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		 driver.get("https://google.com");
		 driver.quit();
	System.out.println("Closing broser chrome now");
		
		
	
	
	

}
}
