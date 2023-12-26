package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")
public class LoginTest extends BaseTest {

    private final LoginPage loginPage = new LoginPage();

    @Test
    public void chekIsRedirect() throws InterruptedException {
        Selenide.open(TASKEE);
        loginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();

    }

    @Test
    public void checkRedirectError() throws InterruptedException {
        Selenide.open(TASKEE);
        loginPage.selectUsername("test22@oimi.pro")
                .selectPassword("3125")
                .enterSignIn();

        Assertions.assertEquals("Enter a valid email address", loginPage.getTitleInputUsername());



    }
}

//