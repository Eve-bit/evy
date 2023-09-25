package org.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.example.openCart.AccountRegPage;
import org.example.openCart.HomePage;
import org.example.openCart.RegisterPage;
import org.hooks.Hooks;
import org.testng.Assert;

public class RegisterDefinitions {

    private HomePage homePage;
    private RegisterPage registerPage;
    private AccountRegPage accountRegPage;

    public RegisterDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.accountRegPage = new AccountRegPage(Hooks.getDriver());
    }

    @Dado("que el usuario accede al register de la pagina opencart")
    public void queElUsuarioAccedeAlRegisterDeLaPaginaOpencart(){
        homePage.AbrirPagina("https://opencart.abstracta.us/");
        homePage.AccederAlRegister();

    }

    @Cuando("el usuario completa el formulario de registro con datos validos")
    public void elUsuarioCompletaElFormularioDeRegistroConDatosValidos() {
        registerPage.CompletarFormulario("evelyn","munoz","evemunozescriba@gmail.com",
                "3512824591","evelyn", "evelyn");

    }

    @Entonces("se muestra la pantalla de su cuenta recien creada")
    public void seMuestraLaPantallaDeSuCuentaRecienCreada() {
        Assert.assertTrue(accountRegPage.TitleIsDisplayed());

    }
}
