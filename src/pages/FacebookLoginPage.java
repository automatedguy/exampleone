package pages;

import base.BaseElement;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends BasePage {

    public BaseElement inputEmail;
    public BaseElement inputPassword;
    public BaseElement buttonLogIn;

    public FacebookLoginPage(WebDriver iDriver) {
        super(iDriver);

        inputEmail = new BaseElement(By.id("email"), iDriver);
        inputPassword = new BaseElement(By.id("pass"), iDriver);
        buttonLogIn = new BaseElement(By.xpath("//input[@value='Log In']"), iDriver);
    }

    public FacebookNavigationBar clickOnLoginButton() {
        webElement = buttonLogIn;
        clickButton();
        return initFacebookNavigationBar();
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