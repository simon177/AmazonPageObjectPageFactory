package com.github.simon177.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 10.03.2017.
 */
public class RegistrationPage extends BasePage {
    @FindBy(how = How.ID, using = "ap_customer_name")
    private WebElement nameField;
    @FindBy(how = How.ID, using = "ap_email")
    private WebElement emailField;
    @FindBy(how = How.ID, using = "ap_password")
    private WebElement passwordField;
    @FindBy(how = How.ID, using = "ap_password_check")
    private WebElement reEnterPasswordField;
    @FindBy(how = How.ID, using = "continue")
    private WebElement registerButton;


    public RegistrationPage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AfterLoginPage createAccount(String name, String email, String password){
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        reEnterPasswordField.sendKeys("password");
        registerButton.click();
        return new AfterLoginPage(driver);
    }

}
