
package com.tests;
import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.page.TasksPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class TaskPageTest extends BaseTest {
    private final LoginPage LoginPage = new LoginPage();
    private final TasksPage TasksPage = new TasksPage();

    @Test
    public void createTask() {
        Selenide.open(TASKEE);
        LoginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125")
                .enterSignIn();

        TasksPage.enterButtonTask()
                .enterButtonAdd()
                .enterButtonCreate()
                .selectInputTaskName("тестовая задача")
                .enterButtonChooseProject()
                .enterButtonTest1()
                .enterButtonUser()
                .enterButtonChooseUser()
                .enterButtonStatusSelect()
                .enterButtonStatusChoose()
                .enterButtonSelectTag()
                .enterButtonChooseTag()
                .enterButtonDate()
                .enterButtonDay()
                .enterButtonTime()
                .selectInputOur("111")
                .enterButtonDescription()
                .enterButtonDescriptionCl()
                .selectInputDescriptionTask("описание задачи");

    }
}


//        Assertions.assertEquals("Описание", TasksPage.getTitleTaskPage());
//        Assertions.assertEquals("Выбрать проект", TasksPage.getTitleChooseProject());
//        Assertions.assertEquals("Выбрать статус", TasksPage.getButtonStatusSelect());
//        Assertions.assertEquals("Выбрать исполнителя", TasksPage.getButtonChooseUser());
//        Assertions.assertEquals("добавить тег", TasksPage.getSelectTag());
//        Assertions.assertEquals("Выбрать время начала", TasksPage.getButtonDay());
//        Assertions.assertEquals("Указать срок", TasksPage.getButtonTime());
//        Assertions.assertEquals("Установить часы", TasksPage.getButtonTime());

