package base;

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

    public FacebookHomePage btnLoginClick(){
        webElement = buttonLogIn;
        clickButton();
        return initFacebookHomePage();
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
