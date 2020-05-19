package com.amazon.webpage;

import com.amazon.conf.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonHomePage extends Configurations {

    private By DepartmentsDropdown =   By.xpath("//*[@id=\"searchDropdownBox\"]");
    private By ComputerOption = By.xpath("//option[.='Computers']");
    private By GoButton = By.xpath("//input[@value='Go']");

    public AmazonHomePage(WebDriver d) {
        driver = d;
    }

    public void checkTitle() {
        String pageTitle = driver.getTitle();
        String expectedPageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        Assert.assertEquals(pageTitle, expectedPageTitle);
        if (pageTitle.equals(expectedPageTitle)) {
            System.out.println("Page Title is: " + pageTitle);
        } else {
            System.out.println("Page title does not match");
        }
    }

    public void clickDropdownMenu() {
        driver.findElement(DepartmentsDropdown).click();

    }

    public void clickComputerOption() {
        driver.findElement(ComputerOption).click();
    }

    public void clickGoButton() {
        driver.findElement(GoButton).click();
    }
}
