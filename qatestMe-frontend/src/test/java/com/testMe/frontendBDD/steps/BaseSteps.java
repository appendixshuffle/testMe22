package com.testMe.frontendBDD.steps;

import org.openqa.selenium.WebDriver;

// klasa do globalnych metod uzywanych w kazdym stepie

public class BaseSteps {
    WebDriver driver;

    public BaseSteps(StepsConfig config) {  //tu w argumencie wprowadzmy klase StepsConfig metode setUp
        this.driver = config.setUp();
    }
}
