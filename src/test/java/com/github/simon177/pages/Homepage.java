package com.github.simon177.pages;

import com.github.simon177.components.Navigator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


import java.sql.Driver;

/**
 * Created by simon on 05.03.2017.
 */
public class Homepage {
    private static WebDriver driver;
    private final Navigator naviGator;
    private final static String LINK  = "https://www.amazon.com";
    private final static By SIGN_IN_BUTTON = By.id("nav-link-accountList");
    public Homepage(WebDriver driver){
        this.driver = driver;
        this.naviGator = new Navigator(driver);
    }

    public Homepage goTo(){
        driver.get(LINK);
        return this;
    }

    public LoginPage GoToLogInPage(){
        driver.findElement(SIGN_IN_BUTTON).click();
        return new LoginPage(driver);
    }

    public Navigator naviGator(){
        return naviGator;
    }

}
