package pages;

import base.BasePage;
import base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookCreatePost extends BasePage {

    private BaseElement createPost;

    public FacebookCreatePostBox clickOnCreatePost(){
        webElement = createPost;
        clickButton();
        return initFacebookCreatePostBox();
    }
    public FacebookCreatePost(WebDriver iDriver) {
        super(iDriver);

        createPost = new BaseElement(By.xpath("//span[text()='Crear publicación']"), iDriver);
    }
}
