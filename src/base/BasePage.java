package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;
    protected WebElement webElement;

    public BasePage (WebDriver iDriver){
        this.driver = iDriver;
    }

    public void enterText(String userEmail){
        webElement.sendKeys(userEmail);
    }

    public void clickButton(){
        webElement.click();
    }

    public boolean isElementDisplayed(){
        if(webElement.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }

    // Page Factories

    public FacebookLoginPage initFacebookLoginPage(){
        return PageFactory.initElements(driver, FacebookLoginPage.class);
    }

    public FacebookLoginAttemptPage initFacebookLoginAttemptPage(){
        return PageFactory.initElements(driver, FacebookLoginAttemptPage.class);
    }

    public FacebookHomePage initFacebookHomePage(){
        return PageFactory.initElements(driver, FacebookHomePage.class);
    }
}