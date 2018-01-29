package pages;

import org.baseConfigs.BasePageObject;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class LoginPage extends BasePageObject <LoginPage> {
    protected LoginPage(WebDriver driver, Logger log) {
        super(driver, log);
    }
}
