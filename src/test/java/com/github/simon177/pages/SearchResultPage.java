package com.github.simon177.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by simon on 05.03.2017.
 */
public class SearchResultPage {
    WebDriver driver;
    private final static By FIRST_ELEMENT = By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/a/h2");

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getFirstElTitle(){
        return driver.findElement(FIRST_ELEMENT).getAttribute("data-attribute");
    }

    public ProductPage clickFirstElement(){
        driver.findElement(FIRST_ELEMENT).click();
        return new ProductPage(driver);
    }



}
