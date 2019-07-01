package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookNavigationBar extends BasePage {

    @FindBy(xpath = "//*[@id='pagelet_bluebar']//a[text()='Inicio']")
    WebElement homeIcon;


    public FacebookNavigationBar(WebDriver iDriver) {
        super(iDriver);
    }

    public FacebookCreatePost clickOnStart() {
        webElement = homeIcon;
        clickButton();
        return initFacebookCreatePost();
    }
}

