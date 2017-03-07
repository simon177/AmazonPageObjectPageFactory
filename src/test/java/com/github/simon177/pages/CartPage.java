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
public class CartPage {
    WebDriver driver;
    @FindBy(how= How.CLASS_NAME, using = "a-list-item")
    private WebElement list;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public String CartList(){
        return list.getText();
    }
}
