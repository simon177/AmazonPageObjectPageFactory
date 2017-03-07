package com.github.simon177.tests;

import com.github.simon177.pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by simon on 05.03.2017.
 */
public class AmazonTest extends TestConfiguration {
    private Homepage homePage;

    @Before
    public void runConf(){
        super.setUp();
    }


    @Before
    public void runHomepage() {
        homePage = new Homepage(driver);
        homePage.goTo();
    }

    @After
    public void tearDown(){
        driver.quit();
        }
    @Test
    public void AmazonLoginTest(){
        LoginPage login = homePage.GoToLogInPage();
        AfterLoginPage afterLogin = login.LogIn("automation.user2015@gmail.com","@ut0m@t!0n");
        afterLogin.getUsername().contains("Automation");
        afterLogin.hoverMyAcount();
        SignOutPage signOut = afterLogin.SignOut();
        signOut.getSignOutTitle().equals("Sign in");
    }
    @Test
    public void AmazonAddingToCartTest(){
        SearchResultPage searchResult = homePage.naviGator().search("Books","Selenium");
        String title = searchResult.getFirstElTitle();
        ProductPage product = searchResult.clickFirstElement();
        Assert.assertEquals(product.getTitle(), title);
        CartConfirmationPage confirm = product.addProductToCart();
        Assert.assertEquals("Added to Cart",confirm.getConfirmation());
        CartPage cart = homePage.naviGator().goToCartPage();
        cart.CartList().contains(title);
    }
    @Test
    public void RemovingItemfromACart(){
        AmazonAddingToCartTest();
        CartPage cart  = homePage.naviGator().goToCartPage();
        cart.deleteItem();
        cart.getRemoveList().contains("was removed from Shopping Cart");
    }
    }

