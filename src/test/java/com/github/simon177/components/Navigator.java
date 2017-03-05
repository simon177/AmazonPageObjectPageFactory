package com.github.simon177.components;

import com.github.simon177.pages.CartPage;
import com.github.simon177.pages.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by simon on 05.03.2017.
 */
public class Navigator {
    WebDriver driver;
    private static final By DROPDOWN = By.id("searchDropdownBox");
    private static final By SEARCHBOX = By.id("twotabsearchtextbox");
    private static final By SEARCH_BUTTON = By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");
    private static final By CART_BUTTON = By.id("nav-cart");

    public Navigator(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResultPage search(String dropDownItem, String Text) {
        new Select(driver.findElement(DROPDOWN)).selectByVisibleText(dropDownItem);
        driver.findElement(SEARCHBOX).sendKeys(Text);
        driver.findElement(SEARCH_BUTTON).click();
        return new SearchResultPage(driver);
    }
    public CartPage goToCartPage(){
        driver.findElement(CART_BUTTON).click();
        return new CartPage(driver);
    }
}

