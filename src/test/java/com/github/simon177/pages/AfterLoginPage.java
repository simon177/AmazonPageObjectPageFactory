package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 05.03.2017.
 */
public class AfterLoginPage extends BasePage {

    @FindBy(how=How.ID, using = "nav-item-signout")
    private WebElement signOutButton;

    public AfterLoginPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getUsername() {
        return super.getUsername();
    }


    public void hoverMyAcount() {
        super.hoverMyAcount();
    }

    public SignOutPage SignOut() {
        signOutButton.click();
        return new SignOutPage(driver);
    }
}


