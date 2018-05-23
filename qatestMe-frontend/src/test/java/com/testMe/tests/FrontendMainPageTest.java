package com.testMe.tests;

import com.testMe.FrontendConfig;
import com.testMe.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FrontendMainPageTest extends FrontendConfig{

        @Test
        @DisplayName("Test of main page content")
        public void contentMainPageTest (){
            driver.get("http://wordpress.com");
            MainPage mainPage = new MainPage(driver);

//            mainPage.loginButton  = driver.findElement(By.id("navbar-login-link"));
            mainPage.isContentPresent();


        }

    }


