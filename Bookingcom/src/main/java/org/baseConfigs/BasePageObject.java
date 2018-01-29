package org.baseConfigs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class BasePageObject <T> {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Logger log;

    protected BasePageObject(WebDriver driver, Logger log){
        this.driver=driver;
        wait = new WebDriverWait(driver, 30);

    }
    protected T getPage(String url){
        driver.get(url);
        return (T)this;
    }
    private WebElement find(By element){
        return driver.findElement(element);
    }

    protected void type(String text, By element){
        find(element).sendKeys(text);
    }
    protected void clickButton(By selector){
        find(selector).click();
    }
    public String getTitle() {
        return driver.getTitle();
    }
    protected String getText(By element){
        return find(element).getText();

    }

}
