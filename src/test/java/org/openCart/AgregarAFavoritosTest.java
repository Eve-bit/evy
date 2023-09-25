package org.openCart;

import org.automatioPractice.BaseTest;
import org.example.openCart.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgregarAFavoritosTest extends BaseTest {

    @Test
    public void AgregarProducto() {
       // LoginTest loginTest = new LoginTest();
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        CamerasPage camerasPage = new CamerasPage(getDriver());
        WishListPage wishListPage = new WishListPage(getDriver());

        HomePage homePage  = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        //MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        homePage.AccederAlLogin();
        loginPage.CompletarLogin("evymunozescriba@gmail.com", "evelyn");
        Assert.assertTrue(myAccountPage.TitleIsDisplayed());

        //loginTest.LoginCorrecto();
        myAccountPage.AccederACamaras();
        camerasPage.AddProductToWishList();
        camerasPage.EnterToWishList();
        Assert.assertTrue(wishListPage.IsInTheWishList("Canon EOS 5D"));
        //wishListPage.IsInTheWishList("Canon EOS 5D");

    }






}
