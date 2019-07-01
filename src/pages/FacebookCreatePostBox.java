package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookCreatePostBox extends BasePage {

    @FindBy(xpath = "//div[@aria-autocomplete='list']")
    WebElement inputPost;

    @FindBy(xpath = "//button//span[text()='Compartir']")
    WebElement btnPost;

    public void enterPost(String somePost){
        webElement = inputPost;
        enterText(somePost);
    }

    public void clickOnPostButton(){
        webElement = btnPost;
        clickButton();
    }

    public FacebookCreatePostBox(WebDriver iDriver) {
        super(iDriver);
    }
}
