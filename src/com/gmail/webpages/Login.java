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

    // method to verify the page title
    public void verifyTitle() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Gmail");
        System.out.println(pageTitle + " - Test Pass");
    }

    // method to verify the text displayed in first header of enter email screen
    public void verifyEmailPageHeader1() {
        boolean displayed = driver.findElement(EmailPageHeader1).isDisplayed();
        Assert.assertTrue(displayed);
        String emailPageHeading1 = driver.findElement(EmailPageHeader1).getText();
        Assert.assertEquals(emailPageHeading1, "साइन इन");
        System.out.println(emailPageHeading1 + " - Test Pass");
    }

    // method to verify the text displayed in second header of enter email screen
    public void verifyEmailPageHeader2() {
        boolean displayed = driver.findElement(EmailPageHeader2).isDisplayed();
        Assert.assertTrue(displayed);
        String emailPageHeading2 = driver.findElement(EmailPageHeader2).getText();
        Assert.assertEquals(emailPageHeading2, "Gmail मा जारी राख्नुहोस्");
        System.out.println(emailPageHeading2 + " - Test Pass");
    }

    // method to verify the text displayed in forgot email link
    public void verifyForgotEmailLink() {
        boolean displayed = driver.findElement(ForgotEmailLink).isDisplayed();
        Assert.assertTrue(displayed);
        String forgotEmailLink = driver.findElement(ForgotEmailLink).getText();
        Assert.assertEquals(forgotEmailLink, "इमेल ठेगाना बिर्सनुभयो?");
        System.out.println(forgotEmailLink + " - Test Pass");

    }

    // method to verify the text displayed below the forgot email link in the enter email screen
    public void verifyText() {
        boolean displayed = driver.findElement(Text).isDisplayed();
        Assert.assertTrue(displayed);
        String text = driver.findElement(Text).getText();
        Assert.assertEquals(text, "तपाईंको कम्प्युटर होइन? निजी रूपमा साइन इन गर्न अतिथि मोड प्रयोग गर्नुहोस्। थप जान्नुहोस्");
        System.out.println(text + " - Test Pass");
    }

    // method to verify the text displayed in create new account link
    public void verifyCreateNewAccountLink() {
        boolean displayed = driver.findElement(CreateNewAccountLink).isDisplayed();
        Assert.assertTrue(displayed);
        String newAccountLink = driver.findElement(CreateNewAccountLink).getText();
        Assert.assertEquals(newAccountLink, "खाता सिर्जना गर्नुहोस्");
        System.out.println(newAccountLink + " - Test Pass");
    }

    // method to verify the text displayed in next button in email screen
    public void verifyEmailNextButton() {
        boolean displayed = driver.findElement(NextButtonEmail).isDisplayed();
        Assert.assertTrue(displayed);
        String EmailNextButton = driver.findElement(NextButtonEmail).getText();
        Assert.assertEquals(EmailNextButton, "अर्को");
        System.out.println(EmailNextButton + " - Test Pass");
    }

    // method to verify whether the dropdown to select the language has been displayed or not in email screen
    public void verifyDropdown() {
        boolean displayed = driver.findElement(Dropdown).isDisplayed();
        Assert.assertTrue(displayed);
        driver.findElement(Dropdown).click();
        System.out.println("Dropdown list verified");
    }

    //method to verify the text of help link in email screen
    public void verifyHelpLink() {
        boolean displayed = driver.findElement(HelpLink).isDisplayed();
        Assert.assertTrue(displayed);
        String helpLink = driver.findElement(HelpLink).getText();
        Assert.assertEquals(helpLink, "सहयोग");
        System.out.println(helpLink + " - Test Pass");
    }

    //method to verify the text of privacy link in email screen
    public void verifyPrivacyLink() {
        boolean displayed = driver.findElement(PrivacyLink).isDisplayed();
        Assert.assertTrue(displayed);
        String privacyLink = driver.findElement(PrivacyLink).getText();
        Assert.assertEquals(privacyLink, "गोपनीयता");
        System.out.println(privacyLink + " - Test Pass");
    }

    // method to verify the text of terms link in email screen
    public void verifyTermsLink() {
        boolean displayed = driver.findElement(TermsLink).isDisplayed();
        Assert.assertTrue(displayed);
        String termsLink = driver.findElement(TermsLink).getText();
        Assert.assertEquals(termsLink, "सर्तहरू");
        System.out.println(termsLink + " - Test Pass");
    }

    // method to verify the text of email label
    public void verifyEmailLabel() {
        boolean displayed = driver.findElement(EmailLabel).isDisplayed();
        Assert.assertTrue(displayed);
        String emailLabel = driver.findElement(EmailLabel).getText();
        Assert.assertEquals(emailLabel, "इमेल वा फोन नम्बर");
        System.out.println(emailLabel + " - Test Pass");
    }

    //method to verify the validation message when a user leaves email text box blank and click next button
    public void verifyBlankEmail() throws InterruptedException {
        driver.findElement(EmailTextBox).sendKeys("");
        driver.findElement(NextButtonEmail).click();
        String blankEmailValidationMessage = driver.findElement(By.cssSelector(".o6cuMc")).getText();
        Assert.assertEquals(blankEmailValidationMessage, "कुनै इमेल वा फोन नम्बर प्रविष्टि गर्नुहोस्");
        System.out.println(blankEmailValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    // method to verify the validation message when a user enters invalid email and click next button
    public void verifyInvalidEmail() throws InterruptedException {
        driver.findElement(EmailTextBox).sendKeys(".test@gmail.com");
        driver.findElement(NextButtonEmail).click();
        String invalidEmailValidationMessage = driver.findElement(By.cssSelector(".o6cuMc")).getText();
        Assert.assertEquals(invalidEmailValidationMessage, "तपाईँको Google खाता फेला पार्न सक्दैन");
        System.out.println(invalidEmailValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    //method to verify the validation message when a user enters email of invalid length and click next button
    public void verifyInvalidLengthEmail() throws InterruptedException {
        driver.findElement(EmailTextBox).clear();
        driver.findElement(EmailTextBox).sendKeys("testestestestesestesttestetstestestetsteste@testestetstestets@gmail.com");
        driver.findElement(NextButtonEmail).click();
        String invalidLengthEmailValidationMessage = driver.findElement(By.cssSelector(".o6cuMc")).getText();
        Assert.assertEquals(invalidLengthEmailValidationMessage, "कुनै मान्य इमेल ठेगाना वा फोन नम्बर प्रविष्टि गर्नुहोस्");
        System.out.println(invalidLengthEmailValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    // method to verify when the user enters a valid email and click next button
    public void verifyValidEmail() throws InterruptedException {
        driver.findElement(EmailTextBox).clear();
        driver.findElement(EmailTextBox).sendKeys("testdeepali2020@gmail.com");
        driver.findElement(NextButtonEmail).click();
        System.out.println("Valid Email Test Pass");
        Thread.sleep(5000);
    }

    // method to verify the text of first header in enter password screen
    public void verifyPasswordPageHeader1() {
        boolean displayed = driver.findElement(PasswordHeader1).isDisplayed();
        Assert.assertTrue(displayed);
        String passwordHeader1 = driver.findElement(PasswordHeader1).getText();
        Assert.assertEquals(passwordHeader1, "स्वागतम्");
        System.out.println(passwordHeader1 + " - Test Pass");
    }

    // method to verify the text of second header in enter password screen
    public void verifyPasswordPageHeader2() {
        boolean displayed = driver.findElement(PasswordHeader2).isDisplayed();
        Assert.assertTrue(displayed);
        String passwordHeader2 = driver.findElement(PasswordHeader2).getText();
        Assert.assertEquals(passwordHeader2, "testdeepali2020@gmail.com");
        System.out.println(passwordHeader2 + " - Test Pass");
    }

    // method to verify the text of forgot password link in enter password screen
    public void verifyForgotPasswordLink() {
        boolean displayed = driver.findElement(ForgotPasswordLink).isDisplayed();
        Assert.assertTrue(displayed);
        String forgotPasswordLink = driver.findElement(ForgotPasswordLink).getText();
        Assert.assertEquals(forgotPasswordLink, "पासवर्ड विर्सनुभयो?");
        System.out.println(forgotPasswordLink + " - Test Pass");
    }

    // method to verify the password mask icon is displayed
    public void verifyPasswordMaskIcon() {
        boolean displayed = driver.findElement(PasswordMaskIcon).isDisplayed();
        Assert.assertTrue(displayed);
        driver.findElement(PasswordMaskIcon).click();
        System.out.println("Password Mask Icon Displayed");
    }

    // method to verify the text of next button in enter password screen
    public void verifyPasswordNextButton() {
        boolean displayed = driver.findElement(NextButtonPassword).isDisplayed();
        Assert.assertTrue(displayed);
        String PasswordNextButton = driver.findElement(NextButtonPassword).getText();
        Assert.assertEquals(PasswordNextButton, "अर्को");
        System.out.println(PasswordNextButton + " - Test Pass");
    }

    // method to verify the text of password label in enter password screen
    public void verifyPasswordLabel() {
        boolean displayed = driver.findElement(PasswordLabel).isDisplayed();
        Assert.assertTrue(displayed);
        String passwordLabel = driver.findElement(PasswordLabel).getText();
        Assert.assertEquals(passwordLabel, "तपाईको पासवर्ड प्रविष्टि गर्नुहोस्");
        System.out.println(passwordLabel + " - Test Pass");
    }

    // method to verify the validation message when a user leaves password text box blank and click next button
    public void verifyBlankPassword() throws InterruptedException {
        driver.findElement(PasswordTextBox).sendKeys("");
        driver.findElement(NextButtonPassword).click();
        String blankPasswordValidationMessage = driver.findElement(By.cssSelector("div.OyEIQ [jsslot]")).getText();
        Assert.assertEquals(blankPasswordValidationMessage, "पासवर्ड प्रविष्टि गर्नुहोस्");
        System.out.println(blankPasswordValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    // method to verify the validation message when a user enters invalid password in password text box and click next button
    public void verifyInvalidPassword() throws InterruptedException {
        driver.findElement(PasswordTextBox).sendKeys("123da#@@");
        driver.findElement(NextButtonEmail).click();
        String invalidPasswordValidationMessage = driver.findElement(By.cssSelector("div.OyEIQ [jsslot]")).getText();
        Assert.assertEquals(invalidPasswordValidationMessage, "गलत पासवर्ड। फेरि प्रयास गर्नुहोस् वा यसलाई रिसेट गर्न तल दिइएको पासवर्ड बिर्सें नामक लिंकमा क्लिक गर्नुहोस्।");
        System.out.println(invalidPasswordValidationMessage + " - Test Pass");
        Thread.sleep(2000);
    }

    // method to verify when the user enters a valid password and click next button
    public void verifyValidPassword() throws InterruptedException {
        driver.findElement(PasswordTextBox).clear();
        driver.findElement(PasswordTextBox).sendKeys("Test@123");
        driver.findElement(NextButtonPassword).click();
        System.out.println("Valid Password Test Pass");
        Thread.sleep(2000);
    }

    // method to verify the user is navigated to the dashboard page after successful login
    public void verifyNavigatedToDashboard() {
        boolean displayed = driver.findElement(By.cssSelector(".T-I-KE")).isDisplayed();
        Assert.assertTrue(displayed);
        System.out.println("Logged in successfully");
    }

}

