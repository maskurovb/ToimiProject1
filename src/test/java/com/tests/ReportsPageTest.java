package com.tests;
import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ReportsPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ReportsPageTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ReportsPage ReportsPage = new ReportsPage();

    @Test
    public void createReports() {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();
        ReportsPage.enterButtonReports()
                .enterButtonGeneral()
                .enterButtonAllProjects()
                .enterButtonUserOne()
                .enterButtonChooseDate()
                .inputButtonChooseDay()
                .inputButtonChooseFinishDay()
                .enterButtonChooseEmployee()
                .enterOneEmployee();
    //   Type

    }
}