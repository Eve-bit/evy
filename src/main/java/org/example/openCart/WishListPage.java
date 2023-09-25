package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage {

    private By Product1 = By.xpath("//td[text()='Product 3']");
    private WebDriver driver;
    private WebDriverWait wait;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public boolean IsInTheWishList (String productEsperado){
        return this.wait.until(ExpectedConditions.textToBe(this.Product1, productEsperado));

    }
}
