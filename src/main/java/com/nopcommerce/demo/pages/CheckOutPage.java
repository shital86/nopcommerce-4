package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstName = By.id("FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailAddress = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickOnContinueButton1 = By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']");
    By shippingOptionNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By shippingOptionSecondDayByAir = By.xpath("//input[@id='shippingoption_2']");
    By clickOnContinueButton2 = By.xpath("//div[@id='shipping-method-buttons-container']/button");
    By paymentMethod = By.xpath("//input[@id='paymentmethod_1']");
    By clickOnContinueButton3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By creditCardType = By.xpath("//select[@id='CreditCardType']");
    By creditCardHolderName = By.xpath("//input[@id='CardholderName']");
    By creditCardNumber = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By clickOnContinueButton4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyShippingMethod = By.xpath("//li[@class='shipping-method']/span[@class='value']");
    //By verifyTotal = By.xpath("//span[@class='value-summary']/strong[text()='$2,950.00']");
    By verifyTotal = By.xpath("//span[@class='value-summary']/strong");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");

    public void setFirstName(String text) {
        sendTextToElement(firstName,text);
    }

    public void clearFirstName() {
        sendTextToElement(firstName);
    }

    public void setLastName(String text) {
        sendTextToElement(lastName,text);
    }

    public void clearLastName() {
        sendTextToElement(lastName);
    }

    public void clearEmailAddress() {
        sendTextToElement(emailAddress);
    }
    public void setEmailAddress(String text) {
        sendTextToElement(emailAddress,text);
    }

    public void setCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    public void setCity(String text) {
        sendTextToElement(city,text);
    }

    public void setAddress(String text) {
        sendTextToElement(address,text);
    }

    public void setZipCode(String text) {
        sendTextToElement(zipCode,text);
    }

    public void setPhoneNumber(String text) {
        sendTextToElement(phoneNumber,text);
    }

    public void setClickOnContinueButton1() {
        clickOnElement(clickOnContinueButton1);
    }

    public void setShippingOptionNextDayByAir(){
        clickOnElement(shippingOptionNextDayAir);
    }

    public void setShippingOptionSecondDayByAir(){
        clickOnElement(shippingOptionSecondDayByAir);
    }

    public void setClickOnContinueButton2() {
        clickOnElement(clickOnContinueButton2);
    }

    public void setPaymentMethod(){
        clickOnElement(paymentMethod);
    }

    public void setClickOnContinueButton3() {
        clickOnElement(clickOnContinueButton3);
    }

    public void setCreditCardType(String text){
        selectByVisibleTextFromDropDown(creditCardType,text);
    }

    public void setCreditCardHolderName(String text){
        sendTextToElement(creditCardHolderName,text);
    }

    public void setCreditCardNumber(String text){
        sendTextToElement(creditCardNumber,text);
    }

    public void setExpireMonth(String text){
        selectByVisibleTextFromDropDown(expireMonth,text);
    }

    public void setExpireYear(String text){
        selectByVisibleTextFromDropDown(expireYear,text);
    }

    public void setCardCode(String text){
        sendTextToElement(cardCode,text);
    }

    public void setClickOnContinueButton4() {
        clickOnElement(clickOnContinueButton4);
    }

    public String getPaymentMethod(){
        return getTextFromElement(verifyPaymentMethod);
    }
    public String getShippingMethod(){
        return getTextFromElement(verifyShippingMethod);
    }
    public String getTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void setConfirmButton() {
        clickOnElement(confirmButton);
    }


}
