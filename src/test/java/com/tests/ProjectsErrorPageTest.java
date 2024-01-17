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
    public void login() {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();

    }
    @Test
    public void addMultiUsers() {
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
    public void addProjectsTime() {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest2")
                .enterInputProjectTime2("xXx");
    }

    @Test
    public void addProjectsTagsGroup() {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest3")
                .enterButtonProjectsTagsGroup()
                .enterProjectsTagsGroupName("В процессе")
                .enterAddTagsFinal();
    }

    @Test
    public void addProjectsStatus() {
        ProjectsErrorPage.enterButtonProject2()
                .enterCreateProject2()
                .enterChooseProjectGroup2()
                .enterInputProjectName2("Project Autotest45")
                .enterAddStatus();
//                .enterStatusGroupName("Срочно");
    }
}
