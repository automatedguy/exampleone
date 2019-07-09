package pages;

import base.BasePage;
import base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookNavigationBar extends BasePage {

    private BaseElement homeIcon;

    public FacebookCreatePost clickOnStart() {
        webElement = homeIcon;
        clickButton();
        return this.initPage.facebookCreatePost();
    }

    public FacebookNavigationBar(WebDriver iDriver) {
        super(iDriver);

        homeIcon = new BaseElement(By.xpath("//*[@id='pagelet_bluebar']//a[text()='Inicio']"), iDriver, "Start", "button");
    }
}

