package org.automatioPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;  //para poder trabjar con las esperas

    @BeforeTest
    public void setup() {
        ChromeOptions options= new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("Incognito");
        //options.addArguments("--headless"); //no levanta la pagina pero si trabaja

        //options.addArguments("disable-infobars"); //deshabilita los infobars pop ups
        //options.addArguments("--disable-extensions");
        //options.addArguments("--disable-gpu"); //solo para windows os
        //options.addArguments("--disable-dev-shm-usage");
        //options.addArguments("--no-sandbox");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);
        this.wait = new WebDriverWait(this.driver,Duration.ofSeconds(15));
        this.driver.get("https://opencart.abstracta.us/");
    }


    @AfterTest
    public void TearDown(){
        if (this.driver != null) {
            this.driver.quit();  // es mejor que close, ya que te cierra todas ventanas
        }

    }
    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
