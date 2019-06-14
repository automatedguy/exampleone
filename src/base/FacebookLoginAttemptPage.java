package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginAttemptPage extends BasePage {

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "pass")
    public WebElement inputPassword;

    @FindBy(id = "loginbutton")
    public WebElement buttonLogIn;

    public FacebookLoginAttemptPage(WebDriver iDriver) {
        super(iDriver);
    }

    public void btnLoginClick() {
        buttonLogIn.click();
    }

    public void inputEnterEmail(String userEmail){
        inputEmail.sendKeys(userEmail);
    }

    public void inputEnterPassword(String userPassword){
        inputPassword.sendKeys(userPassword);
    }

}
