package com.vsmaventest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {
	
	WebDriver driver;
	
	
	@Test
	void oepnBrowser() {
		
		
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.quit();
	}

}
