package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookCreatePost extends BasePage {

    @FindBy(xpath = "//span[text()='Crear publicación']")
    WebElement createPost;

    public FacebookCreatePostBox clickOnCreatePost(){
        webElement = createPost;
        clickButton();
        return initFacebookCreatePostBox();
    }
    public FacebookCreatePost(WebDriver iDriver) {
        super(iDriver);
    }
}
