package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by simon on 05.03.2017.
 */
public class ProductPage {
    WebDriver driver;
    private final static By ADDING_TO_CART = By.id("add-to-cart-button");
    private final static By PRODUCT_TITLE = By.id("productTitle");
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public CartConfirmationPage addProductToCart(){
        driver.findElement(ADDING_TO_CART).click();
        return new CartConfirmationPage(driver);
    }

    public String getTitle(){
        return driver.findElement(PRODUCT_TITLE).getText();
    }
}
