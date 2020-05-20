package com.gmail.tests;

import com.gmail.config.BaseClass;
import com.gmail.webpages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void verifyLogin() throws InterruptedException {

        Login login = new Login(driver);

        login.verifyTitle();
        login.verifyEmailPageHeader1();
        login.verifyEmailPageHeader2();
        login.verifyForgotEmailLink();
        login.verifyText();
        login.verifyCreateNewAccountLink();
        login.verifyEmailNextButton();
        login.verifyDropdown();
        login.verifyHelpLink();
        login.verifyPrivacyLink();
        login.verifyTermsLink();
        login.verifyEmailLabel();
        login.verifyBlankEmail();
        login.verifyInvalidEmail();
        login.verifyValidEmail();
        login.verifyPasswordPageHeader1();
        login.verifyPasswordPageHeader2();
        login.verifyForgotPasswordLink();
        login.verifyPasswordMaskIcon();
        login.verifyPasswordNextButton();
        login.verifyPasswordLabel();
        login.verifyBlankPassword();
        login.verifyInvalidPassword();
        login.verifyValidPassword();

//        String pageSource = driver.getCurrentUrl();
//        if (pageSource.matches("Compose")) {
//                System.out.println("Logged in successfully - Test passed");
//            } else {
//                System.out.println("Log in failed - Test failed");
//            }

    }
}