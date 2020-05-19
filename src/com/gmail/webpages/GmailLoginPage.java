package com.gmail.webpages;

import com.gmail.config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.*;

public class GmailLoginPage extends BaseClass {


    private By EmailLabel = By.cssSelector("div.vHVGub .AxOyFc");
    private By EmailTextBox = By.id("identifierId");
    private By EmailNextButton = By.cssSelector(".RveJvd");
//    private By PasswordLabel = By.xpath("//div[@class='aXBtI I0VJ4d Wic03c']//div[@class='AxOyFc snByac']");
    private By PasswordTextBox = By.cssSelector("[name='password']");
    private By PasswordNextBox = By.cssSelector("div#passwordNext .RveJvd");

    public GmailLoginPage(WebDriver d) {
        driver = d;
    }

    public void checkTitle() {
        String pageTitle = driver.getTitle();
        String expectedPageTitle = "Gmail";
        Assert.assertEquals(pageTitle, expectedPageTitle);
        if (pageTitle.equals(expectedPageTitle)) {
            System.out.println("Page Title is: " + pageTitle);
        } else {
            System.out.println("Page title does not match");
        }
    }

//    public void changeLanguage() {
//        driver.findElement(By.cssSelector(".ry3kXd")).click();
//
//        Select dropDown = new Select(driver.findElement(By.cssSelector("[role='option'][data-value='en-GB'] > .vRMGwf")));
//        dropDown.selectByVisibleText("\u202AEnglish (United Kingdom)\u202C");
//
//        driver.findElement(By.xpath("//div[@class='OA0qNb ncFHed']/div[@class='MocG8c B9IrJb LMgvRb KKjvXb']/span[@class='vRMGwf oJeWuf']")).click();
//    }


    public void getEmailLabel() {
        String emailLabelText = driver.findElement(EmailLabel).getText();
        String expectedEmailLabelText = "इमेल वा फोन नम्बर";  // Email or phone
        Assert.assertEquals(emailLabelText, expectedEmailLabelText);
        System.out.println(emailLabelText);
    }

    public void enterEmail() {
        driver.findElement(EmailTextBox).sendKeys("testdeepali2020");
        String buttonText = driver.findElement(EmailNextButton).getText();
        String expectedButtonText = "अर्को"; // Next
        Assert.assertEquals(buttonText,expectedButtonText);
        System.out.println(buttonText);
        driver.findElement(EmailNextButton).click();
    }

//    public void getPasswordLabel() {
//        String passwordLabelText = driver.findElement(PasswordLabel).getText();
//        String expectedPasswordLabelText = "तपाईको पासवर्ड प्रविष्टि गर्नुहोस्"; // Enter your password
//        Assert.assertEquals(passwordLabelText, expectedPasswordLabelText);
//        System.out.println(passwordLabelText);
//    }

    public void enterPassword() {
        driver.findElement(PasswordTextBox).sendKeys("Test@123");
        driver.findElement(PasswordNextBox).click();
    }



}
