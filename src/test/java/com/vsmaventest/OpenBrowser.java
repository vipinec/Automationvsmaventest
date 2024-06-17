package com.vsmaventest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

    WebDriver driver;

    @Test
    void opentest() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://panel.izooto.com/en/login");
        // https://panel.izooto.com/en/login

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.quit();

    }

}
