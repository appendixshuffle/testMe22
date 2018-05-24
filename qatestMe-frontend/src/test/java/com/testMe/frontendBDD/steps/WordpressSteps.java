package com.testMe.frontendBDD.steps;

import com.testMe.Configuration;
import com.testMe.frontendBDD.pages.LoginEmailPage;
import com.testMe.frontendBDD.pages.LoginPasswordPage;
import com.testMe.frontendBDD.pages.MainLoggedPage;
import com.testMe.frontendBDD.pages.MainPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordpressSteps extends BaseSteps{
    MainPage mainPage;
    LoginEmailPage loginEmailPage;
    LoginPasswordPage loginPasswordPage;
    MainLoggedPage mainLoggedPage;

    //constructor korzystajacy z metod dziedziczonej klasy BaseSteps
    public WordpressSteps(StepsConfig config) {
        super(config);
        try {
            driver = config.setUp();  //tu wskazaujemy, ze wykorzystujemy @BeforeAll z StepsCoonfig
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(config.id);

        }
    }




    @Given("^User is on wordpress site \"(.*)\"$")  //tutaj wskazujemy w klasie, ze bedzie wykonywany ten step
    public void userIsOnWordpressSite(String website){
        driver.get(Configuration.WORDPRESS_BASE_URL);
        mainPage = new MainPage(driver);
        mainPage.isContentPresent();

    }

    @When("^User clicks on loggin button$")
    public void userClicksOnLogginButton() throws Throwable {
    mainPage.loginButton.click();


    }

    @Then("^Email login page is displayed$")
    public void emailLoginPageIsDisplayed() throws Throwable {
        LoginEmailPage loginEmailPage = new LoginEmailPage(driver);
        loginEmailPage.emailField.isDisplayed();
    }

    @When("^User enter email and clicks on continue button$")
    public void userEnterEmailAndClicksOnContinueButton() throws Throwable {
        LoginEmailPage loginEmailPage = new LoginEmailPage(driver); //dodac waitForElement
       // loginEmailPage.emailField.wait(5);
        loginEmailPage.emailField.sendKeys(Configuration.WORDPRESS_EMAIL);
        loginEmailPage.continueButton.click();
    }

    @Then("^Password login page is displayed$")
    public void passwordLoginPageIsDisplayed() throws Throwable {
         LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
         loginPasswordPage.passwordField.isDisplayed();
    }

    @When("^User enter password and press continue button$")
    public void userEnterPasswordAndPressContinueButton() throws Throwable {
        LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
        loginPasswordPage.passwordField.sendKeys(Configuration.WORDPRESS_PASSWORD);
        loginPasswordPage.continuePasswordButton.click();

    }

    @Then("^Main loged page is displayed$")
    public void mainLogedPageIsDisplayed() throws Throwable {
        MainLoggedPage mainLoggedPage = new MainLoggedPage(driver);
        mainLoggedPage.isMainContentPresent();


        throw new PendingException();
    }
}
