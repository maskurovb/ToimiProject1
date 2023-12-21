//package com.tests;
//
//import base.BaseTest;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static constants.Constant.Urls.TASKEE;
//
//public class TaskPageTest extends BaseTest {
//
//    @Test
//    public void createTask() throws InterruptedException {
//        basePage.goToUrl(TASKEE);
//        loginPage.selectUsername("test22@toimi.pro")
//                .selectPassword("3125")
//                .enterSignIn();
//        tasksPage.enterButtonTask()
//                .enterButtonAdd()
//                .enterButtonCreate()
//                .selectInputTaskName("тестовая задача")
//                .enterButtonChooseProject()
//                .enterButtonTest1()
//                .enterButtonUser()
//                .enterButtonChooseUser()
//                .enterButtonStatusSelect()
//                .enterButtonStatusChoose()
//                .enterButtonSelectTag()
//                .enterButtonChooseTag()
//                .enterButtonDate()
//                .enterButtonDay()
//                .enterButtonTime()
//                .selectInputOur("111")
//                .enterButtonDescription()
//                .enterButtonDescriptionCl()
//                .selectInputDescriptionTask("описание задачи");
//
//
//        Assertions.assertEquals("Описание", tasksPage.getTitleTaskPage());
//        Assertions.assertEquals("Выбрать проект", tasksPage.getTitleChooseProject());
//        Assertions.assertEquals("Выбрать статус", tasksPage.getButtonStatusSelect());
//        Assertions.assertEquals("Выбрать исполнителя", tasksPage.getButtonChooseUser());
//        Assertions.assertEquals("добавить тег", tasksPage.getSelectTag());
//        Assertions.assertEquals("Выбрать время начала", tasksPage.getButtonDay());
//        Assertions.assertEquals("Указать срок", tasksPage.getButtonTime());
//        Assertions.assertEquals("Установить часы", tasksPage.getButtonTime());
//
//
//
//    }
//}
//
//
//
//
