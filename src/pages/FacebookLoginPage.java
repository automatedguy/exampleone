package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "pass")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement buttonLogIn;

    public FacebookLoginPage(WebDriver iDriver) {
        super(iDriver);
    }

    public FacebookNavigationBar clickOnLoginButton() {
        webElement = buttonLogIn;
        clickButton();
        return initFacebookNavigationBar();
    }

    public FacebookLoginAttemptPage clickLoginBtnFail() {
        webElement = buttonLogIn;
        clickButton();
        return initFacebookLoginAttemptPage();
    }

    public void enterEmail(String userEmail){
        webElement = inputEmail;
        enterText(userEmail);
    }

    public void enterPassword(String userPassword){
        webElement = inputPassword;
        enterText(userPassword);
    }

}