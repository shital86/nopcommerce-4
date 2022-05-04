package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerMenu computerMenu=new ComputerMenu();
    Electronics electronics = new Electronics();
    Apparel apparel = new Apparel();
    DigitalDownloads digitalDownloads = new DigitalDownloads();
    Books books = new Books();
    Jewelry jewelry = new Jewelry();
    GiftCards giftCards = new GiftCards();

    @Test // 1.3
    public void verifyPageNavigation(){

        //Click on Computer TopMenu
        homePage.selectTopMenu("Computers");
        Assert.assertEquals(computerMenu.computersPageTitle(),"Computers","Computers");
        System.out.println("Computers");

        //Click on Electronics TopMenu
        homePage.selectTopMenu("Electronics");
        Assert.assertEquals(electronics.getPageTitle(),"Electronics","Electronics");
        System.out.println("User is on Correct Page : Electronics");

        //Click on Apparel TopMenu
        homePage.selectTopMenu("Apparel");
        Assert.assertEquals(apparel.getPageHeader(),"Apparel","Apparel");
        System.out.println("User is on Correct Page : Apparel");

        //Click on Digital downloads TopMenu
        homePage.selectTopMenu("Digital downloads");
        Assert.assertEquals(digitalDownloads.getPageHeader(),"Digital downloads","Digital downloads");
        System.out.println("User is on Correct Page : Digital downloads");

        //Click on Books TopMenu
        homePage.selectTopMenu("Books");
        Assert.assertEquals(books.getPageHeader(),"Books","Books");
        System.out.println("User is on Correct Page : Books");

        //Click on Jewelry  TopMenu
        homePage.selectTopMenu("Jewelry");
        Assert.assertEquals(jewelry.getPageHeader(),"Jewelry","Jewelry");
        System.out.println("User is on Correct Page : Jewelry");

        //Click on Gift Cards  TopMenu
        homePage.selectTopMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(),"Gift Cards","Gift Cards");
        System.out.println("User is on Correct Page : Gift Cards");

    }

}
