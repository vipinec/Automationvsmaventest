package com.vsmaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomatiom {

	// public static void main(String[] args){

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
