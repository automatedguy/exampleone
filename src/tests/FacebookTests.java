package tests;

import base.BaseTest;
import pages.FacebookCreatePost;
import org.testng.annotations.*;
import pages.FacebookCreatePostBox;
import pages.FacebookNavigationBar;

import static base.BaseSettings.*;
import static org.testng.Assert.assertTrue;

public class FacebookTests extends BaseTest {

    private FacebookNavigationBar facebookNavigationBar;
    private FacebookCreatePost facebookCreatePost;
    private FacebookCreatePostBox facebookCreatePostBox;

    @Test
    public void createPost() {

        facebookLoginPage.enterEmail(FACEBOOK_USER);
        facebookLoginPage.enterPassword(FACEBOOK_PASS);
        facebookNavigationBar = facebookLoginPage.clickOnLoginButton();

        facebookCreatePost = facebookNavigationBar.clickOnStart();
        facebookCreatePostBox = facebookCreatePost.clickOnCreatePost();
        facebookCreatePostBox.enterPost(CRAPPY_POST);
        assertTrue(facebookCreatePostBox.clickOnPostButton());
    }
}
