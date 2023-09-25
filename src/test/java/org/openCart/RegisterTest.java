package org.openCart;

import org.automatioPractice.BaseTest;
import org.example.openCart.AccountRegPage;
import org.example.openCart.HomePage;
import org.example.openCart.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void CrearCuenta(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountRegPage accountRegPage = new AccountRegPage(getDriver());

        homePage.AccederAlRegister();
        registerPage.CompletarFormulario("evelyn","munoz","evymunozescriba@gmail.com",
                                         "3512824591","evelyn", "evelyn");

        Assert.assertTrue(accountRegPage.TitleIsDisplayed());

    }
}
