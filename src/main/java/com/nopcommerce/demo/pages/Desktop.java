package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Desktop extends Utility {
    By priceOrder = By.xpath("//div[@class='prices']");
    By sortByLowToHigh = By.xpath("//select[@id='products-orderby']");
    By clickOnBuildOnYourComputer = By.xpath("//span[contains(text(),'$1,200.00')]/parent::*/following-sibling::*/child::button[@type='button']");
    By itemTitle = By.xpath("//h2/a[contains(text(),'Build your own computer')]");
    By addToCartOnBuildOnYourComputerlink = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    // Sort by filter
    public void sortByLowToHigh(String sortBy) {
        selectByVisibleTextFromDropDown(sortByLowToHigh, sortBy);
    }

    // Fetching the list of items
    public List<WebElement> fetchItemsList() {
        return listOfWebElementsList(priceOrder);
    }

    public List<Double> getPriceOrderList() {
        List<WebElement> lisTOSort = fetchItemsList();
        List<Double> myList = new ArrayList<>();
        for (WebElement data : lisTOSort) {
            String a = data.getText().substring(1).replace(",", "");
            Double a1 = Double.valueOf(a);
            myList.add(a1);
        }
        return myList;
    }

    public void setClickOnBuildOnYourComputer() {
        clickOnElement(clickOnBuildOnYourComputer);
    }

    // Verify the Page Header for verification
    public String getItemTitle() {
        return getTextFromElement(itemTitle);
    }

    public void cartforBuildOnYourComputerlink() {
        clickOnElement(addToCartOnBuildOnYourComputerlink);
    }

}


