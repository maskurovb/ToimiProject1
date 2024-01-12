package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ProjectsPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ProjectsPageTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ProjectsPage ProjectsPage = new ProjectsPage();

    @BeforeEach
    public void login() throws InterruptedException {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();
    }

    @Test
    public void createProject() throws InterruptedException {
        ProjectsPage.enterButtonProject()
                .enterCreateProject()
                .enterChooseProjectGroup()
                .enterInputProjectName("Project Autotest")
                .enterChooseProjectSubGroup()
                .enterChooseProjectGroupName()
                .enterSelectUser()
                .enterSelectUserName()
                .enterStartDate()
                .enterChooseStartDay()
                .enterFinishDate()
                .enterChooseFinishDay()
                .enterInputProjectTime("123")
                .enterCreateFinish();



        Assertions.assertEquals("Confirmation letter", ProjectsPage.getChooseProjectSubGroup());
        Assertions.assertEquals("проекты", ProjectsPage.getTitleButtonProject());

    }


    @Test
    public void createProjectNameError() throws InterruptedException {
        ProjectsPage.enterButtonProject()
                .enterCreateProject()
                .enterChooseProjectGroup()
                .enterChooseProjectSubGroup()
                .enterChooseProjectGroupName()
                .enterSelectUser()
                .enterSelectUserName()
                .enterStartDate()
                .enterChooseStartDay()
                .enterFinishDate()
                .enterChooseFinishDay()
                .enterInputProjectTime("123")
                .enterCreateFinish();
    }





}













