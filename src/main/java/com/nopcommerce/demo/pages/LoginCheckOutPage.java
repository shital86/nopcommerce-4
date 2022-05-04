package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginCheckOutPage extends Utility {
    By pageHeader = By.xpath("//div/h1[text()='Welcome, Please Sign In!']");
    By checkOutAsGuestButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By registerButton = By.xpath("//button[contains(text(),'Register')]");


    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public void setCheckOutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }

    public void setRegisterButton(){
        clickOnElement(registerButton);
    }
}
