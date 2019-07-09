package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;
    protected BaseElement webElement;
    protected BasePageFactory initPage;

    public BasePage (WebDriver iDriver){
        this.driver = iDriver;
        this.initPage = new BasePageFactory(iDriver);
    }

    protected void enterText(String userEmail){
        webElement.sendKeys(userEmail);
    }

    protected void clickButton(){
        webElement.click();
    }

    protected boolean isElementDisplayed(String elementLocator){
        return driver.findElement(By.xpath(elementLocator)).isDisplayed();
    }
}