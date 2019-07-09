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

    public boolean clickOnPostButton(){
        webElement = btnPost;
        clickButton();
        //TODO: need to refactor this shitty part...
        return isElementDisplayed("(//div[@data-testid='post_message'])[1]//p[contains(text(), 'Some shit posting')]");
    }

    public FacebookCreatePostBox(WebDriver iDriver) {
        super(iDriver);

        inputPost = new BaseElement(By.xpath("//div[@aria-autocomplete='list']"), iDriver, "Post", "Input");
        btnPost = new BaseElement(By.xpath("//button//span[text()='Compartir']"), iDriver, "Post", "Button");
    }
}
