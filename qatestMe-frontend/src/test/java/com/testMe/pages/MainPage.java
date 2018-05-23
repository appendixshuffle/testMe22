package com.testMe.pages;

import com.testMe.tests.TestDataHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends BasePage{
    WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver); //w kosntruktorze super musi byc na pierwszej linii
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

@FindBy(id = "navbar-login-link") //szuka elementu po :id,css etc. Trzeba zainicjalicowac zmienna WebElement
    public WebElement loginButton;
@FindBy(id = "hero-cta")
    public WebElement getStartedButton;
@FindBy(css = "a#hero-plans-anchor.button.is-more-link.is-large")
    public WebElement seePlansButton;

@FindBy(css = "div.page-root div.hp-hero__wrapper h2")
    public WebElement welcomeText;

    //weryfikuje, czy na głownej stronie MainPage znajduja sie elementy ( jesli nie ma, to failuje)
    public boolean isContentPresent() {
//        loginButton = driver.findElement(By.id("navbar-login-link"));
        assertTrue(loginButton.isDisplayed());
        assertTrue(getStartedButton.isDisplayed());
        assertTrue(seePlansButton.isDisplayed());
        assertTrue(welcomeText.getText().equals("Join the global community."));//szuka tekstu
        assertTrue(welcomeText.getText().equals(TestDataHelper.joinOurCommunity));//przechowywane sa stringi w klasie TestDataHelper


        return true;

    }






}
