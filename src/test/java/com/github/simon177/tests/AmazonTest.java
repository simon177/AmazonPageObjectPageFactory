package com.github.simon177.tests;

import com.github.simon177.pages.AfterLoginPage;
import com.github.simon177.pages.Homepage;
import com.github.simon177.pages.LoginPage;
import com.github.simon177.pages.SignOutPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by simon on 05.03.2017.
 */
public class AmazonTest {
    WebDriver driver;
    private Homepage homePage;

    @Before
    public void setUp(){
            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
    public void AmazonTest(){
        LoginPage login = homePage.GoToLogInPage();
        AfterLoginPage afterLogin = login.LogIn("automation.user2015@gmail.com","@ut0m@t!0n");
        afterLogin.getUsername().contains("Automation");
        afterLogin.hoverMyAcount();
        SignOutPage signOut = afterLogin.SignOut();
        signOut.getSignOutTitle().equals("Sign in");
    }
    }

