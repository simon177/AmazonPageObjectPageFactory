package com.github.simon177.pages;

import com.github.simon177.components.Navigator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 05.03.2017.
 */
public class Homepage extends BasePage {
    @FindBy(how= How.ID, using = "nav-link-accountList")
    private WebElement signInButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
    private WebElement createAccountButton;
    private final static String LINK  = "https://www.amazon.com";
    public Homepage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Homepage goTo(){
        driver.get(LINK);
        return this;
    }

    public LoginPage GoToLogInPage(){
        signInButton.click();
        return new LoginPage(driver);
    }

    public RegistrationPage goToRegistrationPage(){
        super.hoverMyAcount();
        createAccountButton.click();
        return new RegistrationPage(driver);
    }

    public Navigator naviGator(){
        return new Navigator(driver);
    }

}
