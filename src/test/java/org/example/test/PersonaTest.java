package org.example.test;


import org.example.clase7.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonaTest {
    @Test
    public void validaNombre(){
        Persona persona= new Persona("Evelyn", "Munoz",40);
        Assert.assertEquals(persona.getNombre(),"Evelyn");
    }

    @Test
    public void validarNombreIncorrecto(){
        Persona persona= new Persona("Evelyn","Muñoz",33);
        Assert.assertNotEquals(persona.getNombre(),"Evelyn2");
    }

    @Test
    public void validarSaludo(){
        Persona persona= new Persona("Rocio","Muñoz", 33);
        Assert.assertTrue(persona.saludar().equals("Hola soy Rocio Muñoz"));
    }
}
