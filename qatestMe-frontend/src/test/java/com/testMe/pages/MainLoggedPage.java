package com.testMe.pages;

import com.testMe.tests.TestDataHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainLoggedPage extends BasePage{
    WebDriver driver;

    public MainLoggedPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "content")
    public WebElement mainPageContent;

    public boolean isMainContentPresent() {
        assertTrue(mainPageContent.isDisplayed());
        return true;

    }


}
