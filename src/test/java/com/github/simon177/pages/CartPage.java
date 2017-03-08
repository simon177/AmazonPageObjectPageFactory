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
public class CartPage extends BasePage{
    @FindBy(how= How.CLASS_NAME, using = "a-list-item")
    private WebElement list;
    @FindBy(how=How.CSS, using = "[name^='submit.delete.']")
    private WebElement deleteButton;
    @FindBy(how=How.CLASS_NAME, using = "sc-list-item-removed-msg")
    private WebElement Removedlist;
    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        super.driver = driver;
    }
    public String CartList(){
        return list.getText();
    }
    public CartPage deleteItem(){
        deleteButton.click();
        return this;
    }
    public String getRemoveList(){
        return Removedlist.getText();
    }
}
