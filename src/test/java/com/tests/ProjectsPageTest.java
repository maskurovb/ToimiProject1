package com.tests;
import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.ProjectsPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class ProjectsPageTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final ProjectsPage ProjectsPage = new ProjectsPage();

    @Test
    public void createProject() {
        Selenide.open(TASKEE);

        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();

        ProjectsPage.enterButtonProject()
                .buttonCreateProject();
    }
}









//        Assertions.assertEquals("Проекты", ProjectsPage.getTitleButtonProject());
//        Assertions.assertEquals("Создать проект", ProjectsPage.getTitleButtonCreateProject());
//        Assertions.assertEquals("Выбрать статус", ProjectsPage.getTitleButtonChooseStatus());
//        Assertions.assertEquals("Выбрать группу", ProjectsPage.getTitleButtonChooseGroup());


