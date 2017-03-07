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
public class SignOutPage {
    WebDriver driver;
    @FindBy(how= How.XPATH, using = "//*[@id=\"a-page\"]/div[1]/div[3]/div/div/form/div/div/div/h1")
    private WebElement firstElement;

    public SignOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getSignOutTitle(){
        return firstElement.getText();
    }
}
