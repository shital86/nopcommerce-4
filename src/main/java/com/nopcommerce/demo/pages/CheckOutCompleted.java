package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutCompleted extends Utility {
    By pageHeader = By.xpath("//h1[text()='Thank you']");
    By confirmMessage = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);
    }

    public String getConfirmMessage(){
        return getTextFromElement(confirmMessage);
    }

    public void setContinueButton(){
        clickOnElement(continueButton);
    }
}
