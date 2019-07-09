package pages;

import base.BaseElement;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends BasePage {

    private BaseElement inputEmail;
    private BaseElement inputPassword;
    private BaseElement buttonLogIn;

    public FacebookNavigationBar clickOnLoginButton() {
        webElement = buttonLogIn;
        clickButton();
        return this.initPage.facebookNavigationBar();
    }

    public void enterEmail(String userEmail){
        webElement = inputEmail;
        enterText(userEmail);
    }

    public void enterPassword(String userPassword){
        webElement = inputPassword;
        enterText(userPassword);
    }

    public FacebookLoginPage(WebDriver iDriver) {
        super(iDriver);

        inputEmail = new BaseElement(By.id("email"), iDriver, "email", "input");
        inputPassword = new BaseElement(By.id("pass"), iDriver, "password",  "input");
        buttonLogIn = new BaseElement(By.xpath("//input[@value='Log In']"), iDriver, "Log In", "button");
    }
}