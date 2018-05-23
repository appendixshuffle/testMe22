package com.testMe.pages;

import com.testMe.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEmailPage extends BasePage {
    WebDriver driver;

    //contructor
    public LoginEmailPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);//inicjalizuje @FindBy'e
    }

    @FindBy(id = "usernameOrEmail")
    public WebElement emailField;

    @FindBy(css = ".button.form-button.is-primary") //"div.login__form-action button.form-button.is-primary" - to wykorzystuje strukture HTML
    public WebElement continueButton;








}
