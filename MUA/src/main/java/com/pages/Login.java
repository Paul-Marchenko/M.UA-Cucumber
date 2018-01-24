package com.pages;

import com.baseConfiges.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends MainPage {
    private By ExitWindow=By.xpath("//*[@id=\"mui_user_login_row\"]/span/em");
    private By emailField = By.xpath("//*[@name='l_']");
    private By paswordField = By.xpath("//*[@name='pw_']");
    private By signInButton = By.xpath("//*[@value='Войти']");


    public Login(WebDriver driver) {
        super(driver);
    }
    public void fillUpCredentials(String email, String password){
        type(email,emailField);
        type(password,paswordField);

    }
    public void openLoginWindow(){
        openElement(ExitWindow);
    }
    public void pushSignInButton(){
        clickButton(signInButton);
    }

}
