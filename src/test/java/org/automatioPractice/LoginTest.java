package org.automatioPractice;
import org.automatioPractice.BaseTest;
import org.example.automatioPractice.HomePage;
import org.example.automatioPractice.LoginPage;
import org.example.automatioPractice.MyAccountPage;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    @Test
    public void LoginCorrecto(){

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());



        loginPage.login("evymunozescriba@gmail.com","evelyn");

        Assert.assertTrue(myAccountPage.TitleIsVisible("MY ACCOUNT"),"El titulo no es el esperado");

    }





}
