package com.gmail.tests;

import com.gmail.config.BaseClass;
import com.gmail.webpages.GmailLoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailLoginPageTest extends BaseClass {

    @Test
    public void verifyLogin() {

        GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);


        gmailLoginPage.checkTitle();
//        gmailLoginPage.changeLanguage();
        gmailLoginPage.getEmailLabel();
        gmailLoginPage.enterEmail();
//        gmailLoginPage.getPasswordLabel();
        gmailLoginPage.enterPassword();


            if (driver.getPageSource().contains("Inbox")) {
                System.out.println("Logged in successfully - Test passed");
            } else {
                System.out.println("Logged in failed - Test failed");
            }


    }
}