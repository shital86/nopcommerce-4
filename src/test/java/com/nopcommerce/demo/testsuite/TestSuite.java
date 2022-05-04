package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase { HomePage homePage = new HomePage();
    ComputerMenu computers = new ComputerMenu();
    Desktop desktop = new Desktop();
    BuidYourOwnComputer buildYourOwnComputer = new BuidYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    LoginCheckOutPage loginCheckOutPage = new LoginCheckOutPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    CheckOutCompleted checkOutCompleted = new CheckOutCompleted();

    @Test
    public void testName() throws InterruptedException {
        homePage.selectTopMenu("Computers"); // Click on Computers from Top Menu
        computers.clickOnDesktop(); // Click on DeskTop from Computer Page

        List<Double> expectedList= desktop.getPriceOrderList();
        Collections.sort(expectedList);

        //System.out.println(expectedList);
        desktop.sortByLowToHigh("Price: Low to High");
        Thread.sleep(2000);
        List<Double> actualList= desktop.getPriceOrderList();
        Thread.sleep(2000);

        //System.out.println(actualList);
        Assert.assertEquals(actualList, expectedList, "Not sorted by high to low");
    }

    /**
     * @throws InterruptedException
     */
    @Test
    public void verifyProductAToShoppingCartSuccessFully() throws InterruptedException {
        homePage.selectTopMenu("Computers"); // Click on Computers from Top Menu

        computers.clickOnDesktop(); // Click on DeskTop from Computer Page

        desktop.sortByLowToHigh("Price: Low to High");
        Thread.sleep(2000);
        desktop.setClickOnBuildOnYourComputer();
        Thread.sleep(3000);
        Assert.assertEquals(desktop.getItemTitle(),"Build your own computer","Not navigated to correct Page!");
        Thread.sleep(3000);
        desktop.cartforBuildOnYourComputerlink();
        Thread.sleep(3000);

        Assert.assertEquals(buildYourOwnComputer.getPageTitle(),"Build your own computer","Not navigated to correct Page");
        Thread.sleep(2000);
        buildYourOwnComputer.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(2000);
        buildYourOwnComputer.selectRam("8GB [+$60.00]");
        Thread.sleep(2000);
        buildYourOwnComputer.select400GBHDD();
        Thread.sleep(3000);
        buildYourOwnComputer.vistaPremium();
        Thread.sleep(2000);
        buildYourOwnComputer.selectTotalCommander();
        Thread.sleep(1000);
        Assert.assertEquals(buildYourOwnComputer.productPrice(),"$1,475.00", "Not Correct Total!");
        Thread.sleep(1000);
        buildYourOwnComputer.setClickOnAddToCartButton();
        Thread.sleep(1000);
        Assert.assertEquals(buildYourOwnComputer.getInfoFromGreenBar(),"The product has been added to your shopping cart","Failed to add cart");
        Thread.sleep(1000);
        buildYourOwnComputer.getInfoFromGreenBar();
        Thread.sleep(1000);
        buildYourOwnComputer.mouseHoverToShoppingCartLink();
        Thread.sleep(1000);
        buildYourOwnComputer.clickOnGoToCartButton();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCart.getPageHeader(),"Shopping cart", "Not navigated to Shopping Cart!!");
        Thread.sleep(1000);
        shoppingCart.clearQuantity();
        Thread.sleep(1000);
        shoppingCart.changeQuantity("2");
        Thread.sleep(1000);
        shoppingCart.setUpdateCartButton();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCart.getTotalCheckoutPrice(),"$2,950.00","Quantity is not updated to 2 to shopping card");
        Thread.sleep(1000);
        shoppingCart.setTermAndConditionsCheckBox();
        Thread.sleep(1000);
        shoppingCart.setCheckOutButton();
        Thread.sleep(1000);

        Assert.assertEquals(loginCheckOutPage.getPageHeader(), "Welcome, Please Sign In!", "Not navigated to sign in page");
        Thread.sleep(1000);
        loginCheckOutPage.setCheckOutAsGuestButton();
        Thread.sleep(1000);

        checkOutPage.setFirstName("Kim");
        Thread.sleep(1000);
        checkOutPage.setLastName("Marsh");
        Thread.sleep(1000);
        checkOutPage.setEmailAddress("ab@yahoo.com");
        checkOutPage.setCountry("fiji");
        checkOutPage.setCity("luma");
        checkOutPage.setAddress("3 Avenue");
        checkOutPage.setZipCode("20202");
        checkOutPage.setPhoneNumber("09987875646");
        checkOutPage.setClickOnContinueButton1();
        checkOutPage.setShippingOptionNextDayByAir();
        checkOutPage.setClickOnContinueButton2();
        checkOutPage.setPaymentMethod();
        checkOutPage.setClickOnContinueButton3();
        checkOutPage.setCreditCardType("Visa");
        checkOutPage.setCreditCardHolderName("Paul");
        checkOutPage.setCreditCardNumber("1234567812345678");
        checkOutPage.setExpireMonth("09");
        checkOutPage.setExpireYear("2026");
        checkOutPage.setCardCode("123");
        Thread.sleep(1000);
        checkOutPage.setClickOnContinueButton4();
        Thread.sleep(1000);
        Assert.assertEquals(checkOutPage.getPaymentMethod(),"Credit Card","Not Correct Payment Method!");
        Thread.sleep(1000);
        Assert.assertEquals(checkOutPage.getShippingMethod(),"Next Day Air","Not Correct shipping Method!");
        Thread.sleep(1000);
        Assert.assertEquals(checkOutPage.getTotal(),"$2,950.00","Not Correct total!");
        Thread.sleep(1000);
        checkOutPage.setConfirmButton();
        Thread.sleep(1000);

        Assert.assertEquals(checkOutCompleted.getPageHeader(),"Thank you","Order failed to Place!");
        Thread.sleep(1000);
        Assert.assertEquals(checkOutCompleted.getConfirmMessage(),"Your order has been successfully processed!","Order failed to Place!");
        Thread.sleep(1000);
        checkOutCompleted.setContinueButton();
        Thread.sleep(1000);

        Assert.assertEquals(homePage.getWelcomeText(),"Welcome to our store","Failed to navigaet to Home Page!");

    }


}
