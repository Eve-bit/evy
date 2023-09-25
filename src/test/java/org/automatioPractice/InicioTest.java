package org.automatioPractice;


import org.automatioPractice.BaseTest;
import org.testng.annotations.Test;


public class InicioTest extends BaseTest {



    @Test
    public void IngresarAlInicio(){

        this.getDriver().get("http://www.automationpractice.pl/index.php");
    }



}
