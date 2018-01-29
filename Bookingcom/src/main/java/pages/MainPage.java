package pages;

import org.baseConfigs.BasePageObject;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class MainPage extends BasePageObject <MainPage> {
    private static final String URL = "https://www.booking.com/";
    protected MainPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
    public void openMainPage(){
        getPage(URL);
    }
}
