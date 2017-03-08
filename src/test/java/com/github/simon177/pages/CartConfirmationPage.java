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
public class CartConfirmationPage extends BasePage {
    @FindBy(how= How.XPATH, using = "//*[@id='huc-v2-order-row-confirm-text']/h1")
    private WebElement addedItem;
    public CartConfirmationPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getConfirmation(){
        return addedItem.getText();
    }

}
