package tests;

import base.BaseTest;

import base.FacebookHomePage;
import base.FacebookLoginAttemptPage;
import org.testng.annotations.*;

public class FacebookTests extends BaseTest {

    private FacebookLoginAttemptPage facebookLoginAttemptPage;
    private FacebookHomePage facebookHomePage;

    @Test
    public void loginFail() throws InterruptedException {

        String userEmail = "someemail@address.com";
        String userPass = "pass";

        facebookLoginPage.enterEmail(userEmail);
        facebookLoginPage.enterPassword(userPass);
        facebookLoginAttemptPage = facebookLoginPage.clickLoginBtnFail();

        facebookLoginAttemptPage.enterEmail(userEmail);
        facebookLoginAttemptPage.enterPassword(userPass);
        facebookLoginAttemptPage.clickLoginBtnFail();

        Thread.sleep(3000);

    }

    @Test
    public void loginSuccess() throws InterruptedException {

        facebookLoginPage.enterEmail("someemail@address.com");
        facebookLoginPage.enterPassword("pass");
        facebookHomePage = facebookLoginPage.btnLoginClick();
        Thread.sleep(3000);

    }

}
