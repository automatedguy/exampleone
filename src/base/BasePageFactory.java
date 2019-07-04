package base;

import org.openqa.selenium.WebDriver;
import pages.FacebookCreatePost;
import pages.FacebookCreatePostBox;
import pages.FacebookLoginPage;
import pages.FacebookNavigationBar;

public class BasePageFactory {

    private WebDriver driver;

    BasePageFactory(WebDriver iDriver){
        this.driver = iDriver;
    }

    public FacebookLoginPage facebookLoginPage(){
        return new FacebookLoginPage(driver);
    }

    public FacebookCreatePost facebookCreatePost(){
        return new FacebookCreatePost(driver);
    }

    public FacebookCreatePostBox facebookCreatePostBox(){
        return new FacebookCreatePostBox(driver);
    }

    public FacebookNavigationBar facebookNavigationBar(){
        return new FacebookNavigationBar(driver);
    }

}
