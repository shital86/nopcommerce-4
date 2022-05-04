package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By pageTitle = By.xpath("//h1[contains(text(),'Electronics')]");
    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By cellPhoneLine = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Cell phones')]");

    // Verify the Page Header for verification
    public String getPageTitle() {
        return getTextFromElement(pageTitle);
    }

    public void setMouserHoverElectronicsLink() {
        mouseHoverToElement(electronicsLink);
    }

    public void setMouseHoverCellPhoneLink() {
        mouseHoverToElement(cellPhoneLine);
    }

    public void setCellPhoneLink() {
        clickOnElement(cellPhoneLine);
    }
}
