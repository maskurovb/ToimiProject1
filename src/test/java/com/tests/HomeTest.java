package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.page.HomePage;
import com.page.LoginPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")
public class HomeTest extends BaseTest {
    private final HomePage HomePage = new HomePage();
    private final LoginPage LoginPage = new LoginPage();

    @AfterAll
    public static void exitBrowser(){
        Configuration.holdBrowserOpen = true;
    }



    @Test
    public void chekRedirect(){
        Selenide.open(TASKEE);

        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();

        HomePage.enterButtonGeneral()
                .enterButtonCreateTask();



    }
}
