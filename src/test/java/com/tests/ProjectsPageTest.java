package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ProjectsPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ProjectsPageTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ProjectsPage ProjectsPage = new ProjectsPage();

    @BeforeEach
    public void login() {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();
    }

    @Test
    public void createProject() {
        String currentMils = String.valueOf(Calendar.getInstance().getTimeInMillis());
        String projectName = "TP_" + currentMils;
        ProjectsPage.enterButtonProject()
                .enterCreateProject()
                .enterChooseProjectGroup()
                .enterInputProjectName(projectName)
                .enterChooseProjectSubGroup()
                .enterChooseProjectGroupName()
                .enterSelectUser()
                .enterSelectUserName()
                .enterStartDate()
                .enterChooseStartDay()
                .enterFinishDate()
                .enterChooseFinishDay()
                .enterInputProjectTime("123")
                .enterCreateFinish()
                .backToAllProjects()
                .searchProject(projectName)
                .assertFoundProjectsName(projectName);

       // Assertions.assertEquals("Confirmation letter", ProjectsPage.getChooseProjectSubGroup());
       // Assertions.assertEquals("проекты", ProjectsPage.getTitleButtonProject());
    }

    @Test
    public void createProjectNameError() {
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

    @Test
    public void changeStatusWithKanban() {
        ProjectsPage.enterButtonProject()
                .buttonOpenProjects1()
                .buttonOpenKanban()
                .buttonOpenProjectsTest()
                .buttonOpenStatus()
                .buttonChangeStatusProjects();
    }

    @Test
    public void createTaskWithKanban () {
        ProjectsPage.enterButtonProject()
                .buttonOpenProjects2()
                .enterOpenKanban2();
//                .enterChooseUserTasks()
//                .enterAddTasksTag()
//                .enterAndTasksTime()
//                .enterAndTasksTimeDay()
//                .inputCreateTaskHours("75")
//                .buttonCreateAndStartTimer();
    }
}














