package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by simon on 05.03.2017.
 */
public class SignOutPage {
    WebDriver driver;
    final static By SIGN_OUT_TITLE = By.xpath("//*[@id=\"a-page\"]/div[1]/div[3]/div/div/form/div/div/div/h1");

    public SignOutPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSignOutTitle(){
        return driver.findElement(SIGN_OUT_TITLE).getText();
    }
}
