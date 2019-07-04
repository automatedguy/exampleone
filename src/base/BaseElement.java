package base;

import org.openqa.selenium.*;

public class BaseElement {

    protected WebDriver webDriver;
    protected WebElement webElement;

    public BaseElement(By byLocator, WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webElement = findPageElement(byLocator);
    }

    public void sendKeys(String inputString) {
        this.webElement.sendKeys(inputString);
    }

    public void click() {
        boolean clicked = false;
        while (!clicked) {
            try {
                this.webElement.click();
                clicked = true;
            } catch (StaleElementReferenceException staleElementReference) {
                //TODO: add logs here
            }
        }
    }

    public boolean isDisplayed() {
        if (webElement.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public WebElement findPageElement(By byLocator) {
        boolean isFound = false;
        WebElement webElement = null;

        while (!isFound) {
            try {
                webElement = this.webDriver.findElement(byLocator);
                break;
            } catch (NoSuchElementException noSuchElement) {
                //TODO: add logs here
            }
        }
        return webElement;
    }
}