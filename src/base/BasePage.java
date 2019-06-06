package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends BaseTest {

    protected WebDriver driver;

    public BasePage(WebDriver iDriver){
        this.driver = iDriver;
    }

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy(id = "pass")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement buttonLogIn;

    public void btnLoginClick() {
        buttonLogIn.click();
    }

    public void inputEnterEmail(String userEmail){
        inputEmail.sendKeys(userEmail);
    }

    public void inputEnterPassword(String userPassword){
        inputPassword.sendKeys(userPassword);
    }
}