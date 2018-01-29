package tests;

import org.baseConfigs.BaseConditions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.logging.Logger;

public class LoginPageTest extends BaseConditions {

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver, logger);
        String expectedPageTitle="Booking.com Online Hotel Reservations";
        loginPage.openLoginWindow();
        loginPage.fullUpCredentials("Sir_Bobby@i.ua","Aa!19141983" );
        loginPage.loginToPage();
        String actualPageTitle = loginPage.getTitle();
        Assert.assertTrue(actualPageTitle.equals(expectedPageTitle), "Success");

    }

}
