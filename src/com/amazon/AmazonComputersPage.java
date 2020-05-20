package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AmazonComputersPage {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.id("searchDropdownBox"));
        actions.moveToElement(webElement).clickAndHold().build().perform();
        webElement.sendKeys(Keys.DOWN);
        webElement.sendKeys(Keys.DOWN);
        webElement.sendKeys(Keys.DOWN);
        webElement.sendKeys(Keys.DOWN);
        webElement.sendKeys(Keys.DOWN);
        webElement.sendKeys(Keys.DOWN);
        webElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
        select.selectByVisibleText("Computers");

        Actions actions1 = new Actions(driver);
        WebElement webElement1 = driver.findElement(By.cssSelector("input[value='Go']"));
        actions1.moveToElement(webElement1).click().build().perform();
        Thread.sleep(2000);

        if (driver.getPageSource().contains("Computers, Tablets and IT Accessories")) {
            System.out.println("Navigated to Computers page successfully - Test passed");
        } else {
            System.out.println("Not Navigated to Computers page - Test failed");
        }

        driver.close();

    }
}
