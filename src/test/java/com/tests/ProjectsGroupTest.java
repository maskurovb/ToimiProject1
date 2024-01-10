package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ProjectsGroupPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ProjectsGroupTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ProjectsGroupPage ProjectsGroupPage = new ProjectsGroupPage();


    @BeforeEach
    public void login() throws InterruptedException {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();
    }

        @Test
        public void createProjectsGroup () throws InterruptedException {
        ProjectsGroupPage.enterButtonProject()
                    .enterCreateProject()
                    .enterChooseProjectGroup()
                    .enterInputProjectName("ProjectGroup Autotest")
                    .enterButtonAddProject()
                    .enterChooseProjectNameOne()
                    .enterChooseProjectNameTwo();
//                .enterCreateProjectFinish();
        }

        @Test
        public void createProjectsGroupNoName () throws InterruptedException {
        ProjectsGroupPage.enterButtonProject()
                    .enterCreateProject()
                    .enterChooseProjectGroup();
//                .enterCreateProjectFinish();
        }

        @Test
        public void createTaskInProjects () throws InterruptedException {
        ProjectsGroupPage.enterButtonProject()
                    .enterCreateTask();
        }

        @Test
        public void openProject () throws InterruptedException {
            ProjectsGroupPage.enterButtonProject()
                    .enterOpenProjectName()
                    .enterShowNestingLevel()
                    .enterAllTasks()
                    .enterAllTasksType()
                    .enterSortAssignee()
                    .enterSortPriority();

        }

    }
