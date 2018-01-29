package pages;

import org.baseConfigs.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class LoginPage extends BasePageObject <LoginPage> {
    private By signInButton=By.xpath("//*[@id=\"b_tt_holder_1\"]/div/span");
    private By emailField=By.xpath("(//label[contains(text(),'Email Address')])[1]");
    private By passwordField=By.xpath("(//label[contains(text(),'Email Address')])[1]");
    private By loginSignIn=By.xpath("//*[@value='Sign in'])[1]");
    private By errorMessage=By.xpath("(//*[@class='alert alert-error alert-displayed'])[1]");

    public LoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }
    public void openLoginWindow(){
        openElement(signInButton);
    }
    public void fullUpCredentials(String emailAdress, String password){
        type(emailAdress, emailField);
        type(password, passwordField);

    }
    public void loginToPage(){
        openElement(loginSignIn);
    }
    public String getLiginErrorMessage(){
        waitForVisibility(errorMessage, 10);
        return getText(errorMessage);
    }


}
