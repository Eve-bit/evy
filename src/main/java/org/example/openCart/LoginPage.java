package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By mailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By LoginBntInput = By.xpath("//input[@value='Login']");

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public void CompletarLogin(String mail, String password){
        WebElement mailElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(this.mailInput));
        mailElement.sendKeys(mail);

        WebElement passwordElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(this.passwordInput));
        passwordElement.sendKeys(password);

        WebElement loginBtnElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(this.LoginBntInput));
        loginBtnElement.click();

    }
}
