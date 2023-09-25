package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private By ProductIsDisplayed = By.xpath("//td[text()= 'Product 3']");
    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public boolean ProductIsDisplayed (){
        WebElement productIsDisplayedElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(this.ProductIsDisplayed));
        return productIsDisplayedElement.isDisplayed();
    }

}
