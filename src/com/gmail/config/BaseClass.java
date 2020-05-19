package com.gmail.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public abstract class BaseClass {
    protected WebDriver driver;
    final String baseurl = "https://www.gmail.com/";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @AfterTest
    public void tearDown() {
        driver.close();
    }

}