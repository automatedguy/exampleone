package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static base.Settings.*;

public class BaseTest {

    public static WebDriver driver = null;
    private ChromeOptions chromeOptions = null;
    public BasePage basePage = null;
    public FacebookLoginPage facebookLoginPage = null;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", RESOURCES + CHROMEDRIVER);
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        basePage = new BasePage(driver);
        facebookLoginPage = basePage.initFacebookLoginPage();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void navigateToBaseUrl(){
        driver.navigate().to(BASE_URL);
    }
}
