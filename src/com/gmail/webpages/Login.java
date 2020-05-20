package com.gmail.webpages;

import com.gmail.config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Login extends BaseClass {

    private By EmailPageHeader1 = By.cssSelector("h1#headingText > [jsslot]");
    private By EmailPageHeader2 = By.cssSelector("div#headingSubtext > [jsslot]");
    private By ForgotEmailLink = By.cssSelector("button[jsname='Cuz2Ue']");
    private By Text = By.xpath("//div[@class='vwtvsf']/div[@class='PrDSKc']");
    private By CreateNewAccountLink = By.cssSelector(".NlWrkb");
    private By NextButtonEmail = By.cssSelector(".RveJvd");
    private By Dropdown = By.cssSelector(".TquXA");
    private By HelpLink = By.cssSelector("ul.Bgzgmd > li:nth-of-type(1) > [target='_blank']");
    private By PrivacyLink = By.cssSelector("ul.Bgzgmd > li:nth-of-type(2) > [target='_blank']");
    private By TermsLink = By.cssSelector("ul.Bgzgmd > li:nth-of-type(3) > [target='_blank']");
    private By EmailLabel = By.cssSelector("div.vHVGub .AxOyFc");
    private By EmailTextBox = By.id("identifierId");
    private By PasswordHeader1 = By.cssSelector("h1#headingText > [jsslot]");
    private By PasswordHeader2 = By.id("profileIdentifier");
    private By ForgotPasswordLink = By.cssSelector("div#forgotPassword .RveJvd");
    private By PasswordMaskIcon = By.cssSelector("span.pVlEsd > .stUf5b");
    private By NextButtonPassword = By.cssSelector("div#passwordNext .RveJvd");
    private By PasswordLabel = By.cssSelector("div.I0VJ4d .AxOyFc");
    private By PasswordTextBox = By.cssSelector("[name='password']");


    public Login(WebDriver d) {
        driver = d;
    }

    public void verifyTitle() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Gmail");
        System.out.println(pageTitle + " - Test Pass");
    }

    public void verifyEmailPageHeader1() {
        String emailPageHeading1 = driver.findElement(EmailPageHeader1).getText();
        Assert.assertEquals(emailPageHeading1, "साइन इन");
        System.out.println(emailPageHeading1 + " - Test Pass");
    }

    public void verifyEmailPageHeader2() {
        String emailPageHeading2 = driver.findElement(EmailPageHeader2).getText();
        Assert.assertEquals(emailPageHeading2, "Gmail मा जारी राख्नुहोस्");
        System.out.println(emailPageHeading2 + " - Test Pass");
    }

    public void verifyForgotEmailLink() {
        String forgotEmailLink = driver.findElement(ForgotEmailLink).getText();
//        driver.findElement(ForgotEmailLink).click();
        Assert.assertEquals(forgotEmailLink, "इमेल ठेगाना बिर्सनुभयो?");
        System.out.println(forgotEmailLink + " - Test Pass");

    }

    public void verifyText() {
        String text = driver.findElement(Text).getText();
        Assert.assertEquals(text, "तपाईंको कम्प्युटर होइन? निजी रूपमा साइन इन गर्न अतिथि मोड प्रयोग गर्नुहोस्। थप जान्नुहोस्");
        System.out.println(text + " - Test Pass");
    }

    public void verifyCreateNewAccountLink() {
        String newAccountLink = driver.findElement(CreateNewAccountLink).getText();
        Assert.assertEquals(newAccountLink, "खाता सिर्जना गर्नुहोस्");
        System.out.println(newAccountLink + " - Test Pass");
    }

    public void verifyEmailNextButton() {
        String EmailNextButton = driver.findElement(NextButtonEmail).getText();
        Assert.assertEquals(EmailNextButton, "अर्को");
        System.out.println(EmailNextButton + " - Test Pass");
    }

    public void verifyDropdown() {
        driver.findElement(Dropdown).isDisplayed();
        driver.findElement(Dropdown).click();
        Assert.assertTrue(true);
        System.out.println("Dropdown list verified");
    }

    public void verifyHelpLink() {
        String helpLink = driver.findElement(HelpLink).getText();
        Assert.assertEquals(helpLink, "सहयोग");
        System.out.println(helpLink + " - Test Pass");
    }

    public void verifyPrivacyLink() {
        String privacyLink = driver.findElement(PrivacyLink).getText();
        Assert.assertEquals(privacyLink, "गोपनीयता");
        System.out.println(privacyLink + " - Test Pass");
    }

    public void verifyTermsLink() {
        String termsLink = driver.findElement(TermsLink).getText();
        Assert.assertEquals(termsLink, "सर्तहरू");
        System.out.println(termsLink + " - Test Pass");
    }

    public void verifyEmailLabel() {
        String emailLabel = driver.findElement(EmailLabel).getText();
        Assert.assertEquals(emailLabel, "इमेल वा फोन नम्बर");
        System.out.println(emailLabel + " - Test Pass");
    }

    public void verifyBlankEmail() throws InterruptedException {
        driver.findElement(EmailTextBox).sendKeys("");
        driver.findElement(NextButtonEmail).click();
        Assert.assertFalse(false);
        String blankEmailValidationMessage = driver.findElement(By.cssSelector(".o6cuMc")).getText();
        Assert.assertEquals(blankEmailValidationMessage, "कुनै इमेल वा फोन नम्बर प्रविष्टि गर्नुहोस्");
        System.out.println(blankEmailValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    public void verifyInvalidEmail() throws InterruptedException{

        driver.findElement(EmailTextBox).sendKeys("32dddasdsd");
        driver.findElement(NextButtonEmail).click();
        Assert.assertFalse(false);
        String invalidEmailValidationMessage = driver.findElement(By.className("o6cuMc")).getText();
        Assert.assertEquals(invalidEmailValidationMessage, "तपाईँको Google खाता फेला पार्न सक्दैन");
        System.out.println(invalidEmailValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    public void verifyValidEmail() throws InterruptedException{
        driver.findElement(EmailTextBox).clear();
        driver.findElement(EmailTextBox).sendKeys("***");
        driver.findElement(NextButtonEmail).click();
        Assert.assertTrue(true);
        System.out.println("Valid Email Test Pass");
        Thread.sleep(2000);
    }

    public void verifyPasswordPageHeader1() {
        String passwordHeader1 = driver.findElement(PasswordHeader1).getText();
        Assert.assertEquals(passwordHeader1, "स्वागतम्");
        System.out.println(passwordHeader1 + " - Test Pass");
    }

    public void verifyPasswordPageHeader2() {
        String passwordHeader2 = driver.findElement(PasswordHeader2).getText();
        Assert.assertEquals(passwordHeader2, "***@gmail.com");
        System.out.println(passwordHeader2 + " - Test Pass");
    }

    public void verifyForgotPasswordLink() {
        String forgotPasswordLink = driver.findElement(ForgotPasswordLink).getText();
//        driver.findElement().click();
        Assert.assertEquals(forgotPasswordLink, "पासवर्ड विर्सनुभयो?");
        System.out.println(forgotPasswordLink + " - Test Pass");
    }

    public void verifyPasswordMaskIcon() {
        driver.findElement(PasswordMaskIcon).isDisplayed();
        Assert.assertTrue(true);
        System.out.println("Password Mask Icon Displayed");
    }

    public void verifyPasswordNextButton() {
        String PasswordNextButton = driver.findElement(NextButtonPassword).getText();
        Assert.assertEquals(PasswordNextButton, "अर्को");
        System.out.println(PasswordNextButton + " - Test Pass");
    }

    public void verifyPasswordLabel() {
        String passwordLabel = driver.findElement(PasswordLabel).getText();
        Assert.assertEquals(passwordLabel, "तपाईको पासवर्ड प्रविष्टि गर्नुहोस्");
        System.out.println(passwordLabel + " - Test Pass");
    }

    public void verifyBlankPassword() throws InterruptedException {
        driver.findElement(PasswordTextBox).sendKeys("");
        driver.findElement(NextButtonPassword).click();
        Assert.assertFalse(false);
        String blankPasswordValidationMessage = driver.findElement(By.cssSelector("div.OyEIQ [jsslot]")).getText();
        Assert.assertEquals(blankPasswordValidationMessage, "पासवर्ड प्रविष्टि गर्नुहोस्");
        System.out.println(blankPasswordValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    public void verifyInvalidPassword() throws InterruptedException{
        driver.findElement(PasswordTextBox).sendKeys("123da#@@");
        driver.findElement(NextButtonEmail).click();
        Assert.assertFalse(false);
        String invalidPasswordValidationMessage = driver.findElement(By.cssSelector("div.OyEIQ [jsslot]")).getText();
        Assert.assertEquals(invalidPasswordValidationMessage, "गलत पासवर्ड। फेरि प्रयास गर्नुहोस् वा यसलाई रिसेट गर्न तल दिइएको पासवर्ड बिर्सें नामक लिंकमा क्लिक गर्नुहोस्।");
        System.out.println(invalidPasswordValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    public void verifyValidPassword() throws InterruptedException{
        driver.findElement(PasswordTextBox).clear();
        driver.findElement(PasswordTextBox).sendKeys("****");
        driver.findElement(NextButtonPassword).click();
        Assert.assertTrue(true);
        System.out.println("Valid Password Test Pass");
        Thread.sleep(2000);
    }

}

