package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ProjectsErrorPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ProjectsErrorPageTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ProjectsErrorPage ProjectsErrorPage = new ProjectsErrorPage();

    @BeforeEach
    public void login() throws InterruptedException {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();

    }
    @Test
    public void addMultiUsers() throws InterruptedException {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest1")
                .enterChooseProjectSubGroup2()
                .enterChooseProjectGroupName2()
                .enterSelectUser2()
                .enterSelectUserName2()
                .enterSelectUserName3();
    }

    @Test
    public void addProjectsTime() throws InterruptedException {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest2")
                .enterInputProjectTime2("xXx");
    }

    @Test
    public void addProjectsTagsGroup() throws InterruptedException {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest3")
                .enterButtonProjectsTagsGroup()
                .enterProjectsTagsGroupName("В процессе")
                .enterAddTagsFinal();
    }

    @Test
    public void addProjectsStatus() throws InterruptedException {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest4")
                .enterAddStatus()
                .enterStatusGroupName("Срочно");
    }
}
