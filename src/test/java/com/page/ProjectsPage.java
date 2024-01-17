package com.page;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {

    private static final SelenideElement buttonProject = $x("//*[@id='root']/div[1]/ul/li[3]/a");
    private static final SelenideElement createProject = $x("//div[@class='button-add']");
    private static final SelenideElement chooseProjectGroup = $x("(//div[@class='dropdown__item-content'])[2]");
    private static final SelenideElement inputProjectName = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[1]/input");
    private static final SelenideElement chooseProjectSubGroup = $x("//div[@class='create-project-select-group']");
    private static final SelenideElement chooseProjectGroupName = $x("(//div[@class='dropdown__item-content'])[1]");
    private static final SelenideElement selectUser = $x("//div[@class='create-project__created-user']");
    private static final SelenideElement selectUserName = $x("(//div[@class='dropdown__item'])[1]");
    private static final SelenideElement startDate = $x("//div[@class='create-project__start-and-end-time']");
    private static final SelenideElement chooseStartDay = $x("//div[@class='react-datepicker__day react-datepicker__day--001']");
    private static final SelenideElement finishDate = $x("(//div[@class='react-datepicker-wrapper'])[2]");
    private static final SelenideElement chooseFinishDay = $x("//div[@class='react-datepicker__day react-datepicker__day--025']");
    private static final SelenideElement inputProjectTime = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
    private static final SelenideElement createFinish = $x("(//button[@class='button button--action'])[2]");


    // changeStatusWithKanban
    private static final SelenideElement openProjects1 = $x("//*[@id='root']/div[2]/div[3]/div[4]/div/div[2]/div[2]/div[1]/div[2]/div/div[29]/div[1]/div[1]/a");
    private static final SelenideElement openKanban = $x("//*[@id='root']/div[2]/div[3]/div[4]/div/section/div/div/div[1]/div[1]/button[1]");
    private static final SelenideElement openProjectsTest = $x("//a[@class='kanban__task-title']");
    private static final SelenideElement openStatus = $x("//div[@class='task__status-current']");
    private static final SelenideElement changeStatusProjects = $x("(//div[@class='dropdown__item'])[3]");

    // create task with kanban
    private static final SelenideElement openProjects2 = $x("//*[@id='root']/div[2]/div[3]/div[4]/div/div[2]/div[2]/div[1]/div[2]/div/div[29]/div[1]/div[1]/a");
    private static final SelenideElement buttonAddNewTasks = $x("(//button[@class='kanban__button-add-new-task'])[4]");
    private static final SelenideElement openKanban2 = $x("//*[@id='root']/div[2]/div[3]/div[4]/div/section/div/div/div[1]/div[1]/button[1]");
    private static final SelenideElement tasksNameWithKanban = $x("//textarea[@placeholder='Введите название задачи']");
    private static final SelenideElement chooseUserTasks = $x("//div[@class='create-task__assignee-select']");
    private static final SelenideElement addTasksTag = $x("//button[@class='tag-add-button active']");
    private static final SelenideElement chooseTagType = $x("(//div[@class='dropdown__item-content'])[3]");
    private static final SelenideElement andTasksTime = $x("(//div[@class='select-date-calendar start-time-and-end-time__select-date-calendar'])[2]");
    private static final SelenideElement andTasksTimeDay = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[2]/div/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]");
    private static final SelenideElement createTaskHours = $x("//input[@placeholder='Установить часы']");
    private static final SelenideElement createAndStartTimer = $x("(//button[@class='button button--action-start-timer'])[2]");

    private static final SelenideElement backToProjectBtn = $x("//div[@class='icon icon--arrow-right']//following::span[1]");

    private static final SelenideElement searchField = $x("//input[@type='search']");
    private static final ElementsCollection foundProjects = $$x("//div[@class='search-result__group-title' and text()='Проекты']//following-sibling::div[1]/div");


    public ProjectsPage enterButtonProject() {
        buttonProject.click();
        return this;
    }
    public ProjectsPage enterCreateProject() {
        createProject.click();
        return this;
    }
    public ProjectsPage enterChooseProjectGroup() {
        chooseProjectGroup.click();
        return this;
    }
    public ProjectsPage enterInputProjectName(String ProjectName) {
        inputProjectName.sendKeys(ProjectName);
        return this;
    }
    public ProjectsPage enterChooseProjectSubGroup() {
        chooseProjectSubGroup.click();
        return this;
    }
    public ProjectsPage enterChooseProjectGroupName() {
        chooseProjectGroupName.click();
        return this;
    }
    public ProjectsPage enterSelectUser() {
        selectUser.click();
        return this;
    }
    public ProjectsPage enterSelectUserName() {
        selectUserName.click();
        return this;
    }
    public ProjectsPage enterStartDate() {
        startDate.click();
        return this;
    }
    public ProjectsPage enterChooseStartDay() {
        chooseStartDay.click();
        return this;
    }
    public ProjectsPage enterFinishDate() {
        finishDate.click();
        return this;
    }
    public ProjectsPage enterChooseFinishDay() {
        chooseFinishDay.click();
        return this;
    }
    public ProjectsPage enterInputProjectTime(String projectTime) {
        inputProjectTime.sendKeys(projectTime);
        return this;
    }
    public ProjectsPage enterCreateFinish() {
        createFinish.click();
        return this;
    }

    public ProjectsPage backToAllProjects(){
        backToProjectBtn.click();
        return this;
    }

    public ProjectsPage buttonOpenProjects1() {
        openProjects1.click();
        return this;
    }
    public ProjectsPage buttonOpenKanban() {
        openKanban.click();
        return this;
    }
    public ProjectsPage buttonOpenProjectsTest() {
        openProjectsTest.click();
        return this;
    }
    public ProjectsPage buttonOpenStatus() {
        openStatus.click();
        return this;
    }
    public ProjectsPage buttonChangeStatusProjects() {
        changeStatusProjects.click();
        return this;
    }
    public ProjectsPage buttonOpenProjects2() {
        openProjects2.click();
        return this;
    }
    public ProjectsPage enterButtonAddNewTaks() {
        buttonAddNewTasks.click();
        return this;
    }
    public ProjectsPage enterOpenKanban2() {
        openKanban2.click();
        return this;
    }
    public ProjectsPage inputTasksNameWithKanban (String tasksNameKanban) {
        tasksNameWithKanban.sendKeys (tasksNameKanban);
        return this;
    }
    public ProjectsPage enterChooseUserTasks() {
        chooseUserTasks.click();
        return this;
    }
    public ProjectsPage enterAddTasksTag() {
        addTasksTag.click();
        return this;
    }
    public ProjectsPage enterChooseTagType() {
        chooseTagType.click();
        return this;
    }
    public ProjectsPage enterAndTasksTime() {
        andTasksTime.click();
        return this;
    }
    public ProjectsPage enterAndTasksTimeDay() {
        andTasksTimeDay.click();
        return this;
    }
    public ProjectsPage inputCreateTaskHours (String taskHours) {
        createTaskHours.sendKeys(taskHours);
        return this;
    }
    public ProjectsPage buttonCreateAndStartTimer() {
        createAndStartTimer.click();
        return this;
    }
    public ProjectsPage searchProject(String name){
        searchField.sendKeys(name + Keys.ENTER);
        return this;
    }
    public ProjectsPage assertFoundProjectsName(String name){
        foundProjects.should(CollectionCondition.textsInAnyOrder(name));
        return this;
    }






    public String getChooseProjectSubGroup() {return chooseProjectSubGroup.getText();}
    public String getTitleButtonProject() {return buttonProject.getText();}








}














