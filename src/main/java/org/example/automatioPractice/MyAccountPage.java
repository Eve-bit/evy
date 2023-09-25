package org.example.automatioPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

        private By Tittle = By.xpath("//h1[@class=\"page-heading\"]");
        private WebDriver driver;
        private WebDriverWait wait;

        public MyAccountPage(WebDriver driver){
            this.driver = driver;
            this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));

        }

        public boolean TitleIsVisible(String TittleEsperado){
           return this.wait.until(ExpectedConditions.textToBe(Tittle, TittleEsperado));

        }


}
