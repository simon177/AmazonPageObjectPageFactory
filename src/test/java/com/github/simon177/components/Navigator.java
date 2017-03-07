package com.github.simon177.components;

import com.github.simon177.pages.CartPage;
import com.github.simon177.pages.Homepage;
import com.github.simon177.pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 05.03.2017.
 */
public class Navigator {
    WebDriver driver;
    @FindBy(how=How.ID, using = "searchDropdownBox")
    private WebElement dropdown;
    @FindBy(how=How.ID,using = "twotabsearchtextbox")
    private WebElement searchbox;
    @FindBy(how=How.XPATH,using = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    private WebElement searchButton;
    @FindBy(how=How.ID,using = "nav-cart")
    private WebElement cartButton;

    public Navigator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage search(String dropDownItem, String Text) {
        new Select(dropdown).selectByVisibleText(dropDownItem);
        searchbox.sendKeys(Text);
        searchButton.click();
        return new SearchResultPage(driver);
    }
    public CartPage goToCartPage(){
        cartButton.click();
        return new CartPage(driver);
    }
}

