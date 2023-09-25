package org.openCart;

import org.automatioPractice.BaseTest;
import org.example.openCart.HomePage;
import org.example.openCart.LoginPage;
import org.example.openCart.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test
    public void LoginCorrecto(){
        HomePage homePage  = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        homePage.AccederAlLogin();
        loginPage.CompletarLogin("evymunozescriba@gmail.com", "evelyn");
        Assert.assertTrue(myAccountPage.TitleIsDisplayed());

    }

}
