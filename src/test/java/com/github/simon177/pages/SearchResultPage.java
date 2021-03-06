package com.github.simon177.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by simon on 05.03.2017.
 */
public class SearchResultPage extends BasePage {
    @FindBy(how= How.CSS, using = "[title^='Absolute Beginner (Part 1) Selenium WebDriver']")
    private WebElement firstElement;

    public SearchResultPage(WebDriver driver){
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getFirstElTitle(){
        return firstElement.getAttribute("title");
    }

    public ProductPage clickFirstElement(){
        firstElement.click();
        return new ProductPage(driver);
    }



}
