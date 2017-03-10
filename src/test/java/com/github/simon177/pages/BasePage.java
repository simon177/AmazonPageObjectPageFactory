package com.github.simon177.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by simon on 08.03.2017.
 */
public class BasePage {
    WebDriver driver;

    @FindBy(how= How.ID, using = "nav-link-accountList")
    WebElement accountChecker;

    public void hoverMyAcount() {
        Actions action = new Actions(driver);
        action.moveToElement(accountChecker).build().perform();
    }
    public String getUsername() {
        return accountChecker.getText();
    }
}
