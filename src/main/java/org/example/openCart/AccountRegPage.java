package org.example.openCart;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountRegPage {

    private By title = By.xpath("//h1[text()='Account']");
    private WebDriver driver;
    private WebDriverWait wait;

    public AccountRegPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public boolean TitleIsDisplayed () {
        WebElement titleElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(this.title));
        return titleElement.isDisplayed();
    }
}
