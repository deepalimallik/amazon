package com.amazon.test;

import com.amazon.conf.Configurations;
import com.amazon.webpage.AmazonHomePage;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends Configurations {

    @Test
    public void verifyTest() {

        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
        amazonHomePage.checkTitle();
        amazonHomePage.clickDropdownMenu();
        amazonHomePage.clickComputerOption();
        amazonHomePage.clickGoButton();
    }


}
