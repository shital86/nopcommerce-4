package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {
    By pageHeader = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listView = By.xpath("//a[@class='viewmode-icon list' and contains(text(),'List')]");
    By nokiaCellPhoneLink = By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]");



    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void setListView() {
        clickOnElement(listView);
    }

    public void setNokiaCellPhoneLink() {
        clickOnElement(nokiaCellPhoneLink);
    }

}
