package org.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.example.openCart.*;
import org.hooks.Hooks;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private CamerasPage camerasPage;
    private WishListPage wishListPage;
    private ProductDescriptionPage productDescriptionPage;
    private CartPage cartPage;


    public LoginDefinitions(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.camerasPage = new CamerasPage(Hooks.getDriver());
        this.wishListPage = new WishListPage(Hooks.getDriver());
        this.productDescriptionPage = new ProductDescriptionPage(Hooks.getDriver());
        this.cartPage = new CartPage(Hooks.getDriver());
    }

    @Dado("que el usuario accede al login de la pagina opencart")
    public void queElUsuarioAccedeAlLoginDeLaPaginaOpencart(){
        homePage.AbrirPagina("https://opencart.abstracta.us/");
        homePage.AccederAlLogin();
    }

    @Cuando("el usuario ingresa mail y password validos")
    public void elUsuarioIngresaMailYPasswordValidos() {
        loginPage.CompletarLogin("evymunozescriba@gmail.com", "evelyn");
    }

    @Entonces("se muestra la pantalla de su cuenta")
    public void seMuestraLaPantallaDeSuCuenta() {
        Assert.assertTrue(myAccountPage.TitleIsDisplayed());

    }


    @Cuando("el usuario accede a la seccion Cameras")
    public void elUsuarioAccedeALaSeccionCameras (){
        myAccountPage.AccederACamaras();
    }


    @Y("agrega un producto a Favoritos")
    public void agregaUnProductoAFavoritos() {
        camerasPage.AddProductToWishList();
    }

    @Y("accede a la Wish List")
    public void accedeALaWishList() {
        camerasPage.EnterToWishList();
    }

    @Entonces("se muestra el producto agregado en la Wish List del usuario")
    public void seMuestraElProductoAgregadoEnLaWishListDelUsuario() {
        Assert.assertTrue(wishListPage.IsInTheWishList("Product 3"));
    }

    @Cuando("el usuario agrega un producto al carrito de compras")
    public void elUsuarioAgregaUnProductoAlCarritoDeCompras(){
        camerasPage.ClickToProduct();
        productDescriptionPage.ChooseColorProduct();
        productDescriptionPage.AddProductToCart();

    }

    @Y("accede a su carrito de compras")
    public void accedeASuCarritoDeCompras() {
        productDescriptionPage.AccederACarrito();
        productDescriptionPage.AccederAViewCart();

    }

    @Entonces("se muestra el producto agregado al carrito")
    public void seMuestraElProductoAgregadoAlCarrito() {
        Assert.assertTrue(cartPage.ProductIsDisplayed());


    }
}
