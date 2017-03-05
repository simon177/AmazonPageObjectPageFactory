package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by simon on 05.03.2017.
 */
public class CartPage {
    WebDriver driver;
    private final static By LIST = By.className("a-list-item");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    public String CartList(){
        return driver.findElement(LIST).getText();
    }
}
