package base;

import org.openqa.selenium.*;
import org.testng.log4testng.Logger;

public class BaseElement {

    private WebDriver webDriver;
    private WebElement webElement;
    private String elementName;
    private String elementType;
    private static Logger logger = Logger.getLogger(BaseElement.class);

    public BaseElement(By byLocator, WebDriver webDriver, String elementName, String elementType) {
        this.webDriver = webDriver;
        this.elementName = elementName;
        this.elementType = elementType;
        this.webElement = findPageElement(byLocator);
    }

    void sendKeys(String inputString) {
        logger.info("Sending Keys: ["  + inputString + "] to [" + this.elementName + "] [" + this.elementType + "]");
        this.webElement.sendKeys(inputString);
    }

    void click() {
        boolean clicked = false;

        while (!clicked) {
            try {
                logger.info("Clicking on [" + this.elementName + "] [" + this.elementType + "]");
                this.webElement.click();
                clicked = true;
            } catch (StaleElementReferenceException staleElementReference) {
                logger.debug("StaleElementReferenceException: " + staleElementReference);
            }
        }
    }


    public WebElement findPageElement(By byLocator) {
        boolean isFound = false;
        WebElement webElement = null;

        while (!isFound) {
            try {
                logger.info("Trying to find element: [" + this.elementName + "] [" + this.elementType + "]");
                webElement = this.webDriver.findElement(byLocator);
                break;
            } catch (NoSuchElementException noSuchElement) {
                logger.debug("NoSuchElementException: " + noSuchElement);
            }
        }
        return webElement;
    }
}