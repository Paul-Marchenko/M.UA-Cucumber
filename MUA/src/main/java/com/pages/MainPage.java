package com.pages;

import com.baseConfiges.BasePageObject;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePageObject <MainPage> {
    private static final String URL="http://m.ua/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage(){
        getPage(URL);
    }
}
