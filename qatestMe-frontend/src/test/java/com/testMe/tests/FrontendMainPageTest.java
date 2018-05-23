package com.testMe.tests;

import com.testMe.Configuration;
import com.testMe.FrontendConfig;
import com.testMe.pages.LoginEmailPage;
import com.testMe.pages.LoginPasswordPage;
import com.testMe.pages.MainLoggedPage;
import com.testMe.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FrontendMainPageTest extends FrontendConfig{
        MainPage mainPage;
        LoginEmailPage loginEmailPage;
        LoginPasswordPage loginPasswordPage;
        MainLoggedPage mainLoggedPage;

        @Test
        @DisplayName("Test of main page content")
        public void contentMainPageTest (){
            driver.get("http://wordpress.com");
            MainPage mainPage = new MainPage(driver);

//            mainPage.loginButton  = driver.findElement(By.id("navbar-login-link"));
            mainPage.isContentPresent();


        }

        @Test
        @DisplayName("Login test")
        public void loginTest (){
            driver.get(Configuration.WORDPRESS_BASE_URL);
            mainPage = new MainPage(driver);
            mainPage.loginButton.click() ;
            loginEmailPage = new LoginEmailPage(driver);
            loginEmailPage.emailField.sendKeys(Configuration.WORDPRESS_EMAIL);
           // loginEmailPage.waitForVisibilityOfElement(loginEmailPage.continueButton, 15);//tutaj wykorzystuje BasePage class - moje toolsy wykorzystywane w wielu klasach
            loginEmailPage.continueButton.click();
            LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
            loginPasswordPage.passwordField.sendKeys("");
            loginPasswordPage.continuePasswordButton.click();
            MainLoggedPage mainLoggedPage = new MainLoggedPage(driver);
           // MainLoggedPage.




        }

    }


