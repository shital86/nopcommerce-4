package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homepage.clickOnLoginLink();

    }


}
