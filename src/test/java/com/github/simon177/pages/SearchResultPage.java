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
public class SearchResultPage {
    WebDriver driver;
    @FindBy(how= How.XPATH, using = "//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/a/h2")
    private WebElement firstElement;

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public String getFirstElTitle(){
        return firstElement.getAttribute("data-attribute");
    }

    public ProductPage clickFirstElement(){
        firstElement.click();
        return new ProductPage(driver);
    }



}
