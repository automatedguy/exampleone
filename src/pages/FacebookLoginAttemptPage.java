package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginAttemptPage extends FacebookLoginPage {

    @FindBy(id = "loginbutton")
    public WebElement buttonLogIn;

    @FindBy(xpath = "//div[@role='alert' and text()='The email or phone number you’ve entered doesn’t match any account. ']")
    public WebElement wrongCredentialsAlert;

    public FacebookLoginAttemptPage(WebDriver iDriver) {
        super(iDriver);
    }

    public FacebookNavigationBar clickOnLoginButton(){
        webElement = buttonLogIn;
        clickButton();
        return initFacebookNavigationBar();
    }

    public FacebookLoginAttemptPage clickLoginBtnFail() {
        webElement = buttonLogIn;
        clickButton();
        return initFacebookLoginAttemptPage();
    }

    public boolean isWrongCredentialsAlertDisplayed(){
        webElement = wrongCredentialsAlert;
        return isElementDisplayed();
    }
}
