package org.example.openCart;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CamerasPage {

    private By HeartBtnInput = By.xpath("//*[@onclick=\"wishlist.add('30');\"]");
    private By WishListBtn = By.id("wishlist-total");
    private By ProductChose = By.xpath("//img[@src= 'http://opencart.abstracta.us:80/image/cache/catalog/demo/canon_eos_5d_1-228x228.jpg']");

    private WebDriver driver;
    private WebDriverWait wait;

    public CamerasPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public void AddProductToWishList() {
        WebElement heartElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.HeartBtnInput));
        heartElement.click();
    }

    public void EnterToWishList() {
        WebElement wishListBtnElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.WishListBtn));
        wishListBtnElement.click();
    }

    public void ClickToProduct() {
        WebElement productChoseElement = this.wait.until(ExpectedConditions.elementToBeClickable(this.ProductChose));
        productChoseElement.click();
    }

}

