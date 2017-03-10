package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 05.03.2017.
 */
public class LoginPage extends BasePage {
    @FindBy(how= How.ID, using = "ap_email")
    private WebElement login;
    @FindBy(how= How.ID, using = "ap_password")
    private WebElement password;
    @FindBy(how= How.ID, using = "signInSubmit")
    private WebElement logInButton;


    public LoginPage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AfterLoginPage LogIn(String Login, String Password){
        login.sendKeys(Login);
        password.sendKeys(Password);
        logInButton.click();
        return new AfterLoginPage(driver);
    }
}
