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
public class AfterLoginPage {
    private WebDriver driver;
    @FindBy(how= How.ID, using = "nav-link-accountList")
    private WebElement loginBox;
    @FindBy(how=How.ID, using = "nav-item-signout")
    private WebElement signOutButton;

    public AfterLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getUsername() {

        return loginBox.getText();
    }

    public void hoverMyAcount() {
        Actions action = new Actions(driver);
        action.moveToElement(loginBox).build().perform();
    }
    public SignOutPage SignOut() {
        signOutButton.click();
        return new SignOutPage(driver);
    }
}


