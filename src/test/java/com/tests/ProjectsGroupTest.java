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
    public void login() {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();
    }

        @Test
        public void createProjectsGroup () {
        ProjectsGroupPage.enterButtonProject()
                    .enterCreateProject()
                    .enterChooseProjectGroup()
                    .enterInputProjectName("ProjectGroup Autotest")
                    .enterButtonAddProject();

//                    .enterChooseProjectNameOne()   До исправления бага при добавлении группы проектов
//                    .enterChooseProjectNameTwo()
//                    .enterCreateProjectFinish()


        }

        @Test
        public void createProjectsGroupNoName () {
        ProjectsGroupPage.enterButtonProject()
                    .enterCreateProject()
                    .enterChooseProjectGroup()
                    .enterCreateProjectFinish();
        }

        @Test
        public void openProject () {
            ProjectsGroupPage.enterButtonProject()
                    .enterOpenProjectName()
                    .enterShowNestingLevel()
                    .enterAllTasks()
                    .enterAllTasksType()
                    .enterSortAssignee()
                    .enterSortPriority();

        }
    }
