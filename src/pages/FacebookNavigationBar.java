package pages;

import base.BasePage;
import base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FacebookNavigationBar extends BasePage {

    private BaseElement homeIcon;

    public FacebookCreatePost clickOnStart() {
        webElement = homeIcon;
        clickButton();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
        }
        return this.initPage.facebookCreatePost();
    }

    public FacebookNavigationBar(WebDriver iDriver) {
        super(iDriver);

        homeIcon = new BaseElement(By.xpath("//*[@id='pagelet_bluebar']//a[text()='Home']"), iDriver, "Start", "button");
    }
}

