package org.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hooks {
    private static WebDriver driver;
    private WebDriverWait wait;  //para poder trabjar con las esperas

    @Before
    public void SetUp(Scenario scenario){

        ChromeOptions options= new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("Incognito");
        options.addArguments("--ignore-certificate-error");
        //options.addArguments("--headless"); //no levanta la pagina pero si trabaja

        //options.addArguments("disable-infobars"); //deshabilita los infobars pop ups
        //options.addArguments("--disable-extensions");
        //options.addArguments("--disable-gpu"); //solo para windows os
        //options.addArguments("--disable-dev-shm-usage");
        //options.addArguments("--no-sandbox");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        driver = new ChromeDriver(options);
        //driver.get("https://opencart.abstracta.us/");

    }

    @After
    public void TearDown(){
        if (driver != null) {
            driver.quit();
        }

    }
    public static WebDriver getDriver() {

        return driver;
    }



}
