package org.example.automatioPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By InputMail = By.id("login");
    private By InputPass  = By.id("email");
    private By LoginBtn = By.id("passwd");
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));

    }

    public  void login(String mail, String password){


        WebElement InputMailElement= wait.until(ExpectedConditions.presenceOfElementLocated(InputMail));
        InputMailElement.sendKeys(mail);

        WebElement InputPassElement= wait.until(ExpectedConditions.presenceOfElementLocated(InputPass));
        InputPassElement.sendKeys(password);

        WebElement LoginBtnElement = wait.until(ExpectedConditions.elementToBeClickable(LoginBtn));
        LoginBtnElement.click();
    }

}
