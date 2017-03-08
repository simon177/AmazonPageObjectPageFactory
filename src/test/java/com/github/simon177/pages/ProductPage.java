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
public class ProductPage extends BasePage  {
    @FindBy(how= How.ID, using = "add-to-cart-button")
    private WebElement addingToCartButton;
    @FindBy(how= How.ID, using = "productTitle")
    private WebElement productTitle;
    public ProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        super.driver = driver;
    }
    public CartConfirmationPage addProductToCart(){
        addingToCartButton.click();
        return new CartConfirmationPage(driver);
    }

    public String getTitle(){
        return productTitle.getText();
    }
}
