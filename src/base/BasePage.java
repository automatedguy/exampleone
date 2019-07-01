package base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.*;


public class BasePage {

    protected WebDriver driver;
    protected WebElement webElement;

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
        boolean clicked = false;
        while(!clicked) {
            try {
                webElement.click();
                clicked = true;
                break;
            } catch(StaleElementReferenceException e) {
            }
        }
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

    public FacebookCreatePost initFacebookCreatePost(){
        return PageFactory.initElements(driver, FacebookCreatePost.class);
    }

    public FacebookCreatePostBox initFacebookCreatePostBox(){
        return PageFactory.initElements(driver, FacebookCreatePostBox.class);
    }

    public FacebookNavigationBar initFacebookNavigationBar(){
        return PageFactory.initElements(driver, FacebookNavigationBar.class);
    }
}