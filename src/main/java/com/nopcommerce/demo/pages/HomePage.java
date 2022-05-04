package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;



public class HomePage extends Utility {
    By login = By.linkText("Log in");
    By register = By.linkText("Register");
    By welcomeText = By.xpath("//h2[text()='Welcome to our store']");
    By computer = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By electronics= By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]");
    By apparel= By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]");
    By digitalDownload = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]");
    By books = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]");
    By jewerly = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]");
    By giftCards = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]");
    By logOut = By.xpath("//a[contains(text(),'Log out')]");
    public void clickOnLoginLink(){
    clickOnElement(login);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }public void logOutLink(){
        clickOnElement(logOut);
    }
    public void selectTopMenu(String menu){
        if(menu.equalsIgnoreCase("Computers"))clickOnElement(computer);
       if(menu.equalsIgnoreCase("Electronics"))clickOnElement(electronics);
        if(menu.equalsIgnoreCase("Apparel")) clickOnElement(apparel);
        if(menu.equalsIgnoreCase("Digital downloads")) clickOnElement(digitalDownload);
        if(menu.equalsIgnoreCase("Books")) clickOnElement(books);
        if(menu.equalsIgnoreCase("Jewelry")) clickOnElement(jewerly);
        if(menu.equalsIgnoreCase("Gift Cards")) clickOnElement(giftCards);

        }
    }
