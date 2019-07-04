package pages;

import base.BasePage;
import base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookCreatePostBox extends BasePage {

    private BaseElement inputPost;
    private BaseElement btnPost;

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

        inputPost = new BaseElement(By.xpath("//div[@aria-autocomplete='list']"), iDriver);
        btnPost = new BaseElement(By.xpath("//button//span[text()='Compartir']"), iDriver);
    }
}
