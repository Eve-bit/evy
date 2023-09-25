package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    private By name= By.id("input-firstname");
    private By lasName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By policyCheckBox = By.name("agree");
    private By ContinueBtn = By.xpath("//input[@value=\"Continue\"]");

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

   public void CompletarFormulario(String name,
                                   String lastName,
                                   String email,
                                   String phone,
                                   String password,
                                   String confPass){
       WebElement nameElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.name));
       nameElement.sendKeys(name);

       WebElement lastNameElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.lasName));
       lastNameElement.sendKeys(lastName);

       WebElement emailElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.email));
       emailElement.sendKeys(email);

       WebElement phoneElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.telephone));
       phoneElement.sendKeys(phone);

       WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.password));
       passwordElement.sendKeys(password);

       WebElement confirmElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.confirmPassword));
       confirmElement.sendKeys(confPass);

       WebElement policyElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.policyCheckBox));
       policyElement.click();

       WebElement continueBtnElement = wait.until(ExpectedConditions.presenceOfElementLocated(this.ContinueBtn));
       continueBtnElement.click();

   }
}
