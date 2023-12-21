//package com.tests;
//
//import base.BaseTest;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static constants.Constant.Urls.TASKEE;
//
//public class ProjectsPageTest extends BaseTest {
//    @Test
//    public void createProject() throws InterruptedException {
//        basePage.goToUrl(TASKEE);
//        loginPage.selectUsername("test22@toimi.pro")
//                .selectPassword("3125")
//                .enterSignIn();
//        projectsPage.enterButtonProject()
//                .buttonCreateProject()
//                .buttonCreateProjectOne()
//                .selectInputProjectName("Тест 11.12.2023")
//                .enterButtonStatus()
//                .enterButtonStatusType()
//                .enterButtonChooseGroup()
//                .enterButtonGroupName()
//                .enterButtonDateStart()
//                .enterButtonProjectChooseDateStart()
//                .enterButtonDateFinish()
//                .enterButtonProjectChooseDateFinish()
//                .inputProjectSetTime("123");
//
//        Assertions.assertEquals("Проекты", projectsPage.getTitleButtonProject());
//        Assertions.assertEquals("Создать проект", projectsPage.getTitleButtonCreateProject());
//        Assertions.assertEquals("Выбрать статус", projectsPage.getTitleButtonChooseStatus());
//        Assertions.assertEquals("Выбрать группу", projectsPage.getTitleButtonChooseGroup());
//
//
//
//
//    }
//}
