package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by simon on 05.03.2017.
 */
public class AfterLoginPage {
    private WebDriver driver;
    private final By LOGIN_BOX = By.id("nav-link-accountList");
    private final By SIGN_OUT_BUTTON = By.id("nav-item-signout");


    public AfterLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return driver.findElement(LOGIN_BOX).getText();
    }

    public void hoverMyAcount() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(LOGIN_BOX)).build().perform();
    }
    public SignOutPage SignOut() {
        driver.findElement(SIGN_OUT_BUTTON).click();
        return new SignOutPage(driver);
    }
}


