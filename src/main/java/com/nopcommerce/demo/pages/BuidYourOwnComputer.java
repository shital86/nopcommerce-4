package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuidYourOwnComputer extends Utility {
 By computerTitle= By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By Ram = By.xpath("//select[@id='product_attribute_2']");
    By select400GBHDD = By.id("product_attribute_3_7");
    By VistaPremium = By.id("product_attribute_4_9");
    By selectTotalCommander = By.id("product_attribute_5_12");
    By getProductPrice = By.xpath("//span[@id='price-value-1']");
    By clickOnAddToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By infoFromGreenBar = By.xpath("//div/p[@class='content']");
    By closeGreenBar = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By addToCartBtn = By.xpath("//button[contains(text(),'Go to cart')]");

    public String getPageTitle(){
        return getTextFromElement(computerTitle);
    }
    public void selectProcessor(String text){
        selectByVisibleTextFromDropDown(processor,text);
    }public void selectRam(String text){
        selectByVisibleTextFromDropDown(Ram,text);
    }
    public void select400GBHDD(){
       clickOnElement(select400GBHDD);
    }
    public void vistaPremium(){
       clickOnElement(VistaPremium);
    }public void selectTotalCommander(){
       clickOnElement(selectTotalCommander);
   }public String productPrice(){
       return getTextFromElement(getProductPrice);
   }public void setClickOnAddToCartButton(){
       clickOnElement(clickOnAddToCartButton);
   }public String getInfoFromGreenBar(){
       return getTextFromElement(infoFromGreenBar);
   }public void clickOnCloseGreenBar(){
       clickOnElement(closeGreenBar);
   }public void mouseHoverToShoppingCartLink(){
       mouseHoverToElement(shoppingCart);
   } public void clickOnGoToCartButton(){
      clickOnElement(addToCartBtn);
   }

}
