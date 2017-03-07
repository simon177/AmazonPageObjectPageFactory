package com.github.simon177.pages;

import com.github.simon177.components.Navigator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import java.sql.Driver;

/**
 * Created by simon on 05.03.2017.
 */
public class Homepage {
    private static WebDriver driver;
    @FindBy(how= How.ID, using = "nav-link-accountList")
    private WebElement signInButton;
    private final static String LINK  = "https://www.amazon.com";
    public Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public Homepage goTo(){
        driver.get(LINK);
        return this;
    }

    public LoginPage GoToLogInPage(){
        signInButton.click();
        return new LoginPage(driver);
    }

    public Navigator naviGator(){
        return new Navigator(driver);
    }

}
