package com.testMe.frontendFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class FrontendConfig {
    public WebDriver driver = null;
    @BeforeAll
    public static void setUpAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUpDriver(){
      //  WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();

        if(driver==null){
            driver = new ChromeDriver(chromeOptions);
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //return driver;

    }

    @AfterEach
    public void tearDown(){
        driver.quit(); //zamykamy przegladarke
        driver = null; // nulujemy wszystkie opcje driver'a

    }


}
