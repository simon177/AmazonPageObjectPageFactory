package com.github.simon177.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 05.03.2017.
 */
public class SignOutPage extends BasePage {
    WebDriver driver;
    @FindBy(how= How.XPATH, using = "//div[contains(@class,'a-box-inner')]/h1")
    private WebElement firstElement;

    public SignOutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        super.driver = driver;
    }

    public String getSignOutTitle(){
        return firstElement.getText();
    }
}
