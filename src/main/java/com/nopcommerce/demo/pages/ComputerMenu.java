package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerMenu extends Utility {
    By computersTitle=By.xpath("//h1[contains(text(),'Computers')]");
    By desktop=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    public String computersPageTitle(){
        return getTextFromElement(computersTitle);
    }
    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
}
