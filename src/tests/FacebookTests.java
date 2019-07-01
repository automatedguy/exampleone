package tests;

import base.BaseTest;
import pages.FacebookCreatePost;
import org.testng.annotations.*;
import pages.FacebookCreatePostBox;
import pages.FacebookNavigationBar;

public class FacebookTests extends BaseTest {

    private FacebookNavigationBar facebookNavigationBar;
    private FacebookCreatePost facebookCreatePost;
    private FacebookCreatePostBox facebookCreatePostBox;

    @Test
    public void postSomething() throws InterruptedException {

        facebookLoginPage.enterEmail("59897505100");
        facebookLoginPage.enterPassword("jona1981br");
        facebookNavigationBar = facebookLoginPage.clickOnLoginButton();
        facebookCreatePost = facebookNavigationBar.clickOnStart();
        facebookCreatePostBox = facebookCreatePost.clickOnCreatePost();

        Thread.sleep(3000);

    }

}
