package tests;

import base.BaseTest;

import org.testng.annotations.*;
public class FirstTests extends BaseTest {


    @Test
    public void firstTest() throws InterruptedException {

        faceBookPage.inputEnterEmail("someemail@address.com");
        faceBookPage.inputEnterPassword("pass");
        faceBookPage.btnLoginClick();
        Thread.sleep(3000);

    }

    @Test
    public void secondTest() throws InterruptedException {

        faceBookPage.inputEnterEmail("someemail@address.com");
        faceBookPage.inputEnterPassword("pass");
        faceBookPage.btnLoginClick();
        Thread.sleep(3000);

    }

}
