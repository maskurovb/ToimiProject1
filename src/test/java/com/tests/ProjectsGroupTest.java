package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ProjectsGroupPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ProjectsGroupTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ProjectsGroupPage ProjectsGroupPage = new ProjectsGroupPage();

    @Test
    public void createProjectsGroup() throws InterruptedException {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();


        ProjectsGroupPage.enterButtonProject()
                .enterCreateProject()
                .enterChooseProjectGroup()
                .enterInputProjectName("ProjectGroup Autotest")
                .enterButtonAddProject()
                .enterChooseProjectNameOne()
                .enterChooseProjectNameTwo()
                .enterCreateProjectFinish();
    }
}
