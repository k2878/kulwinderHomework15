package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Registration extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public Registration() {
        PageFactory.initElements(driver, this);
    }

    Random randomnumb= new Random();
    int emailNumber = randomnumb.nextInt();
    String emailRandom= Integer.toString(emailNumber);
    @CacheLookup
    @FindBy(xpath = "//nav[@id='top']/div[1]/div[2]/ul/li[2]")
    WebElement getRegisterButton;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirm;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[1]")
    WebElement privacyPolicy;

    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[2]")
    WebElement Continue;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement SuccessRegister;

    public void clickOnRegisterButton() {
        log.info("Clicking on Register from Menu :");
        clickOnElement(getRegisterButton);
        clickOnElement(registerButton);
    }

    public void fillOutForm(String first,String last,String mail,String phone,String pass,String con) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(firstName,first);
        Thread.sleep(2000);
        sendTextToElement(lastName,last);
        Thread.sleep(2000);
        sendTextToElement(email,mail);
        Thread.sleep(2000);
        sendTextToElement(telephone,phone);
        Thread.sleep(2000);
        sendTextToElement(password,pass);
        Thread.sleep(2000);
        sendTextToElement(confirm,con);
    }

    public void clickOnPrivacyPolicyButton(){
        log.info("Clicking on PrivacyPolicy Button :");
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinueButton() {
        log.info("Clicking on Continue Button :");
        clickOnElement(Continue);
    }
    public String verifySuccessRegister() {
        log.info("Registered Successfully:");
        return getTextFromElement(SuccessRegister);
    }







}

