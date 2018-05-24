package com.testMe.frontendBDD.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPasswordPage extends BasePage {
        WebDriver driver;

        //contructor
        public LoginPasswordPage (WebDriver driver) {
            super(driver);
            this.driver = driver;
            PageFactory.initElements(driver, this);//inicjalizuje @FindBy'e
        }

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(css = " .button.form-button")
    public WebElement continuePasswordButton;

    }

