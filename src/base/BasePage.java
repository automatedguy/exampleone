package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.concurrent.TimeUnit;


public class BasePage {

    protected WebDriver driver;
    protected BaseElement webElement;

    public BasePage (WebDriver iDriver){
        this.driver = iDriver;
    }

    public void enterText(String userEmail){
        webElement.sendKeys(userEmail);
    }

    public void clickButton(){
        webElement.click();
    }

    public boolean isElementDisplayed(String elementLocator){
        return driver.findElement(By.xpath(elementLocator)).isDisplayed();
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