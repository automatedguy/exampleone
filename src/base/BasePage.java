package base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;


public class BasePage {

    protected WebDriver driver;
    protected BaseElement webElement;

    public BasePage (WebDriver iDriver){
        this.driver = iDriver;
    }

    public void enterText(String userEmail){
        boolean entered = false;
        while(!entered) {
            try {
                webElement.sendKeys(userEmail);
                entered = true;
                break;
            } catch(NoSuchElementException e) {
            }
        }
    }

    public void clickButton(){
        webElement.click();
    }

    public boolean isElementDisplayed(){
        return webElement.isDisplayed();
    }

    // Page Factories

    public FacebookLoginPage initFacebookLoginPage(){
        return new FacebookLoginPage(driver);
    }

    public FacebookCreatePost initFacebookCreatePost(){
        return new FacebookCreatePost(driver);
    }

    public FacebookCreatePostBox initFacebookCreatePostBox(){
        return new FacebookCreatePostBox(driver);
    }

    public FacebookNavigationBar initFacebookNavigationBar(){
        return new FacebookNavigationBar(driver);
    }
}