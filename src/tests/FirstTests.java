package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTests {

    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @Test
    public void firstExampleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcespedes\\xpoprojects\\exampleone\\src\\resources\\chromedriver.exe");

        chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("http://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
