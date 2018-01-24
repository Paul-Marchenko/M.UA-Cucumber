package com.baseConfiges;

import com.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseConditions {
    protected WebDriver driver;

    @BeforeMethod
    protected void setUp(){
        driver = new FirefoxDriver();
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
    }
    /*@BeforeTest
    public void showMainPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openMainPage();
    }*/
    @AfterMethod
    protected void tearDown(){
        driver.quit();
    }
}
