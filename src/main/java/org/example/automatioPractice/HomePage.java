package org.example.automatioPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private By dropdownBy = By.id("dropdown");

    private WebDriver driver;
    private WebDriverWait wait;


    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));

    }

    public void SelectOptionLogin(){

        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownBy));
        Select dropdown = new Select(dropdownElement);
        dropdown.deselectByVisibleText("Login");
    }


}
