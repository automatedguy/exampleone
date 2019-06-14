package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasePage{

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "pass")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement buttonLogIn;

    public FacebookLoginPage(WebDriver iDriver) {
        super(iDriver);
    }

    public FacebookLoginAttemptPage btnLoginClick() {
        buttonLogIn.click();
        return initFacebookLoginAttemptPage(driver);
    }

    public void inputEnterEmail(String userEmail){
        inputEmail.sendKeys(userEmail);
    }

    public void inputEnterPassword(String userPassword){
        inputPassword.sendKeys(userPassword);
    }

}