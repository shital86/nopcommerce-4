package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Register extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By emailAddress = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By repeatPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationVerification = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void setFirstName(String text){
        sendTextToElement(firstName,text);
    }

    public void setLastName(String text){
        sendTextToElement(lastName,text);
    }

    public void setEmailAddress(String text){
//       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        String email = text + timestamp.getTime()/10000 + "@domain.com";
        sendTextToElement(emailAddress,text);
    }

    public void setPassword(String text){
        sendTextToElement(password,text);
    }

    public void setRepeatPassword(String text){
        sendTextToElement(repeatPassword,text);
    }

    public void setRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getConfirmRegisterMessage(){
        return getTextFromElement(registrationVerification);
    }

    public void setContinueButton(){
        clickOnElement(continueButton);
    }



}
