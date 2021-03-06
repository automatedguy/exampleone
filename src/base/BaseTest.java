package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;
import pages.FacebookLoginPage;

import static base.BaseSettings.*;

public class BaseTest {

    public static WebDriver driver = null;
    private ChromeOptions chromeOptions = null;
    public BasePage basePage = null;
    public FacebookLoginPage facebookLoginPage = null;
    protected static Logger logger = Logger.getLogger(BaseTest.class);


    @BeforeSuite
    public void setUp(ITestContext context){

    }

    @AfterMethod
    public void tearDown(){
        logger.info("Closing Browser");
        driver.quit();
    }

    @BeforeMethod
    public void navigateToBaseUrl(){
        System.setProperty("webdriver.chrome.driver", RESOURCES + CHROMEDRIVER);
        logger.info("Starting browser: [" + CHROMEDRIVER + "]");
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);
        basePage = new BasePage(driver);
        driver.navigate().to(BASE_URL);
        facebookLoginPage = basePage.initPage.facebookLoginPage();
    }

    public void displayTestName(String testName){
        logger.info("Staring test: [" + testName + "]");
    }
}
