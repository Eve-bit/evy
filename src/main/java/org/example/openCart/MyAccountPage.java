package org.example.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

    private By titleDisplayed = By.xpath("//h2[text()='My Account']");
    private By CameraBtn = By.xpath("//a[text()='Cameras']");
    private WebDriver driver;
    private WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public boolean TitleIsDisplayed () {
        WebElement titleElement = this.wait.until(ExpectedConditions.presenceOfElementLocated(this.titleDisplayed));
        return titleElement.isDisplayed();
    }

    public void AccederACamaras(){
        WebElement  cameraBtnElement = wait.until(ExpectedConditions.elementToBeClickable(this.CameraBtn));
        cameraBtnElement.click();
    }
}
