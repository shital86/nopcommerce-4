package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    Electronics electronics = new Electronics();
    CellPhone cellPhones = new CellPhone();
    NokiaLumia nokiaLumia = new NokiaLumia();
    ShoppingCart shoppingCart = new ShoppingCart();
    LoginCheckOutPage loginCheckOutPage = new LoginCheckOutPage();
    Register register = new Register();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckOutCompleted checkOutCompleted = new CheckOutCompleted();
    HomePage homePage = new HomePage();

    @Test
    public void verified() {
        electronics.setMouserHoverElectronicsLink();
        electronics.setMouseHoverCellPhoneLink();
        electronics.setCellPhoneLink();

        Assert.assertEquals(cellPhones.getPageHeader(), "Cell phones", "Not navigated to Cell Phone Page!");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics.setMouserHoverElectronicsLink();
        electronics.setMouseHoverCellPhoneLink();
        electronics.setCellPhoneLink();

        Assert.assertEquals(cellPhones.getPageHeader(), "Cell phones", "Not navigated to Cell Phone Page!");

        cellPhones.setListView();
        Thread.sleep(2000);
        cellPhones.setNokiaCellPhoneLink();

        Assert.assertEquals(nokiaLumia.getPageHeader(), "Nokia Lumia 1020", "Not navigated to correct Page!!");
        Assert.assertEquals(nokiaLumia.getPhonePrice(), "$349.00", "Not correct Price!!");
        nokiaLumia.clearItemQuantity();
        nokiaLumia.setItemQuantity("2");
        nokiaLumia.setAddToCartButton();
        Assert.assertEquals(nokiaLumia.getInfoFromGreenBar(), "The product has been added to your shopping cart", "Product is not added to Cart!!");
        nokiaLumia.setCloseGreenBar();
        nokiaLumia.mouseHoverToShoppingCartLink();
        nokiaLumia.clickOnGoToCartButton();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCart.getPageHeader(),"Shopping cart", "Not navigated to Shopping Cart!!");
        Assert.assertEquals(shoppingCart.getQuantityFromShoppingCart("value"),"2","Not Correct Qty.!!");
        Assert.assertEquals(shoppingCart.getTotalCheckoutPrice(),"$698.00","Not Correct Price!!");
        shoppingCart.setTermAndConditionsCheckBox();
        shoppingCart.setCheckOutButton();

        Assert.assertEquals(loginCheckOutPage.getPageHeader(), "Welcome, Please Sign In!", "Not navigated to sign in page");
        loginCheckOutPage.setRegisterButton();
        Thread.sleep(1000);

        Assert.assertEquals(register.getPageHeader(),"Register","not navigated to signin Page!!");
        register.setFirstName("Kim");
        register.setLastName("Marsh");
        register.setEmailAddress("ab@yahoo.com");
        register.setPassword("Happy123");
        register.setRepeatPassword("Happy123");
        register.setRegisterButton();
        Assert.assertEquals(register.getConfirmRegisterMessage(),"Your registration completed","Registration Failed");
        register.setContinueButton();

        Assert.assertEquals(shoppingCart.getPageHeader(),"Shopping cart","Not on checkout page");
        shoppingCart.setTermAndConditionsCheckBox();
        shoppingCart.setCheckOutButton();

        checkOutPage.clearFirstName();
        checkOutPage.setFirstName("Paul");
        checkOutPage.clearLastName();
        checkOutPage.setLastName("Marsh");
        checkOutPage.clearEmailAddress();
        checkOutPage.setEmailAddress("pm@yahoo.com");
        checkOutPage.setCountry("fiji");
        checkOutPage.setCity("lima");
        checkOutPage.setAddress("3 Avenue");
        checkOutPage.setZipCode("20202");
        checkOutPage.setPhoneNumber("077869846544");
        checkOutPage.setClickOnContinueButton1();
        checkOutPage.setShippingOptionSecondDayByAir();
        checkOutPage.setClickOnContinueButton2();
        checkOutPage.setPaymentMethod();
        checkOutPage.setClickOnContinueButton3();
        checkOutPage.setCreditCardType("Visa");
        checkOutPage.setCreditCardHolderName("Paul Marsh");
        checkOutPage.setCreditCardNumber("1234234576548767");
        checkOutPage.setExpireMonth("09");
        checkOutPage.setExpireYear("2026");
        checkOutPage.setCardCode("009");
        checkOutPage.setClickOnContinueButton4();
        Assert.assertEquals(checkOutPage.getPaymentMethod(),"Credit Card","Not Correct Payment Method!");
        Assert.assertEquals(checkOutPage.getShippingMethod(),"2nd Day Air","Not Correct shipping Method!");
        Assert.assertEquals(checkOutPage.getTotal(),"$698.00","Not Correct total!");
        checkOutPage.setConfirmButton();



        Assert.assertEquals(checkOutCompleted.getPageHeader(),"Thank you","Order failed to Place!");
        Assert.assertEquals(checkOutCompleted.getConfirmMessage(),"Your order has been successfully processed!","Order failed to Place!");
        checkOutCompleted.setContinueButton();

        Assert.assertEquals(homePage.getWelcomeText(),"Welcome to our store","Failed to navigaet to Home Page!");
        homePage.clickOnLoginLink();
        Assert.assertEquals(driver.getCurrentUrl(),baseUrl,"Not correct URL");

    }

}
