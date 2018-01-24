package com.tests;

import com.baseConfiges.BaseConditions;
import com.pages.Login;
import com.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.nio.file.Watchable;

public class LoginTest extends BaseConditions {


    @Test
    public void login() throws InterruptedException {

        Login login = new Login(driver);
        login.openLoginWindow();
        login.fillUpCredentials("Sir_Bobby@i.ua", "Aa19141983");

        login.pushSignInButton();
        Thread.sleep(5000);
    }
}
