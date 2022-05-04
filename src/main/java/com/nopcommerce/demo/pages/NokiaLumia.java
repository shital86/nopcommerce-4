package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia extends Utility {
    By pageHeader = By.xpath("//h1[text()='Nokia Lumia 1020']");
    By phonePrice = By.xpath("//span[@id='price-value-20' and contains(text(),'$349.00')]");
    By itemQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-20']");
    By infoFromGreenBar = By.xpath("//div/p[@class='content']");
    By closeGreenBar = By.xpath("//span[@class='close']");
    By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");

    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public String getPhonePrice() {
        return getTextFromElement(phonePrice);
    } //This method will send text on element
    public void sendTextToElement(By by, String data) {
        driver.findElement(by).sendKeys(data);
    }

    public void clearItemQuantity() {
        sendTextToElement(itemQuantity);
    }

    public void setItemQuantity(String text) {
        sendTextToElement(itemQuantity, text);
    }

    public void setAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String getInfoFromGreenBar() {
        return getTextFromElement(infoFromGreenBar);
    }

    public void setCloseGreenBar() {
        clickOnElement(closeGreenBar);
    }

    public void mouseHoverToShoppingCartLink() {
        mouseHoverToElement(shoppingCartLink);
    }

    public void clickOnGoToCartButton() {
        clickOnElement(goToCartButton);
    }
}
