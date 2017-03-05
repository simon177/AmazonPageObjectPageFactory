package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by simon on 05.03.2017.
 */
public class CartConfirmationPage {
    WebDriver driver;
    private static final By AddedItem = By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1");
    public CartConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getConfirmation(){
        return driver.findElement(AddedItem).getText();
    }

}
