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
                //TODO: Move the logger.info outside the try - catch
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
        int maxAttemps = 1;

        while (!isFound && maxAttemps < 30) {
            try {
                logger.debug("Trying to find element: [" + this.elementName + "] [" + this.elementType + "]");
                webElement = this.webDriver.findElement(byLocator);
                break;
            } catch (NoSuchElementException noSuchElement) {
                logger.debug("NoSuchElementException: " + noSuchElement + String.valueOf(maxAttemps));
                maxAttemps = maxAttemps + 1;
            }
        }
        return webElement;
    }
}