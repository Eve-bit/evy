package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDescriptionPage {

    private By ListDropDown = By.name("option[226]");
    private By RedDropDown = By.xpath("//option[@value= '15']");
    private By AddToCartBtn = By.id("button-cart");

    private By ViewCartBtn = By.xpath("//strong[text()= ' View Cart']");

    private By CartBtn = By.xpath("//button[@class= 'btn btn-inverse btn-block btn-lg dropdown-toggle']");
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductDescriptionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public void ChooseColorProduct(){
        WebElement listDropDownElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.ListDropDown));
        listDropDownElement.click();
        WebElement chooseColorElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.RedDropDown));
        chooseColorElement.click();

    }

    public void AddProductToCart(){
        WebElement addToCartBtnElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.AddToCartBtn));
        addToCartBtnElement.click();
    }


    public void AccederACarrito(){
        WebElement CartBtnElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.CartBtn));
        CartBtnElement.click();
    }

    public void AccederAViewCart(){
        WebElement ViewCartBtnElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.ViewCartBtn));
        ViewCartBtnElement.click();
    }
}
