package com.testMe.frontendFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementToBeClickable (WebElement webElement,int maxWaitTime){
            WebDriverWait webDriverWait = new WebDriverWait(driver,maxWaitTime);
            webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));

    }
    public void waitForVisibilityOfElement (WebElement webElement,int maxWaitTime){
        WebDriverWait webDriverWait = new WebDriverWait(driver,maxWaitTime);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));

    }


}

