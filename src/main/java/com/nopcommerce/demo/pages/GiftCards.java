package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCards extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Gift Cards')]");

    // Verify the Page Header for verification
    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }
}
