package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private By myAccountDropdown = By.xpath("//a[@title='My Account']");
    private By loginDropdown = By.xpath("//a[text()='Login']");
    private By registerDropdown = By.xpath("//a[text()='Register']");

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public void AccederAlLogin() {

        WebElement myAccountElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.myAccountDropdown));
        myAccountElement.click();
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginDropdown));
        loginBtn.click();
    }

    public void AccederAlRegister() {
        WebElement myAccountElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.myAccountDropdown));
        myAccountElement.click();
        WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(registerDropdown));
        registerBtn.click();
    }

    public void AbrirPagina(String url) {
        this.driver.get(url);
    }

}

