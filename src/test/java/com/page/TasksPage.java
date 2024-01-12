package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TasksPage {


    private static final SelenideElement buttonTask = $x("(//a[@href='/my-tasks'])[1]");
    private static final SelenideElement buttonAdd = $x("//div[@class='button-add']");
    private static final SelenideElement buttonCreate = $x("(//span[@class='button__text'])[4]");
    private static final SelenideElement inputTaskName = $x("//textarea[@placeholder='Введите название задачи']");
    private static final SelenideElement buttonChooseProject = $x("//div[@class='icon icon--project']");
    private static final SelenideElement buttonTest1 = $x("//div[@class='dropdown__item'][1]");
    private static final SelenideElement buttonUser = $x("//span[@class='active']");
    private static final SelenideElement buttonStatusSelect = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[2]/div[1]");
    private static final SelenideElement buttonStatusChoose = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[2]/div[2]/div[3]/div[2]/div[3]/div/div");
    private static final SelenideElement buttonChooseUser = $x("//div[@class='dropdown__item-content']");
    private static final SelenideElement selectTag = $x("//button[@class='tag-add-button active']");
    private static final SelenideElement chooseTag = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[3]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/span");
    private static final SelenideElement titleTextHomepage = $x("(//a[@class='create-task__group-nav active'])[2]");
    private static final SelenideElement buttonDate = $x("(//div[@class='select-date-calendar start-time-and-end-time__select-date-calendar'])[1]");
    private static final SelenideElement buttonDay = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[5]");
    private static final SelenideElement buttonTime = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
    private static final SelenideElement inputOur = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
    private static final SelenideElement description = $x("//*[@id='create-task-group-description']/div[1]/div/a[1]");
    private static final SelenideElement descriptionCl = $x("//*[@id='rdw-wrapper-2466']/div[2]/div/div/div");
    private static final SelenideElement descriptionTask = $x("//span[@data-text='true']");


    public TasksPage enterButtonTask() {
        buttonTask.click();
        return this;
    }
    public TasksPage enterButtonAdd() {
        buttonAdd.click();
        return this;
    }
    public TasksPage enterButtonCreate() {
        buttonCreate.click();
        return this;
    }
    public TasksPage selectInputTaskName(String taskName) {
        inputTaskName.sendKeys(taskName);
        return this;
    }
    public TasksPage enterButtonChooseProject() {
        buttonChooseProject.click();
        return this;
    }
    public TasksPage enterButtonTest1() {
        buttonTest1.click();
        return this;
    }
    public TasksPage enterButtonUser() {
        buttonUser.click();
        return this;
    }
    public TasksPage enterButtonChooseUser() {
        buttonChooseUser.click();
        return this;
    }
    public TasksPage enterButtonStatusSelect() {
        buttonStatusSelect.click();
        return this;
    }
    public TasksPage enterButtonStatusChoose() {
        buttonStatusChoose.click();
        return this;
    }
    public TasksPage enterButtonSelectTag() {
        selectTag.click();
        return this;
    }
    public TasksPage buttonTitleTextHomepage(){
        titleTextHomepage.click();
        return this;
    }
    public TasksPage enterButtonChooseTag() {
        chooseTag.click();
        return this;
    }
    public TasksPage enterButtonDate()  {
        buttonDate.click();
        return this;
    }
    public TasksPage enterButtonDay() {
        buttonDay.click();
        return this;
    }
    public TasksPage enterButtonTime() {
        buttonTime.click();
        return this;
    }
    public TasksPage selectInputOur(String taskOur) {
        inputOur.sendKeys(taskOur);
        return this;
    }
    public TasksPage enterButtonDescription() {
        description.click();
        return this;
    }
    public TasksPage enterButtonDescriptionCl() {
        descriptionCl.click();
        return this;
    }
    public TasksPage selectInputDescriptionTask(String DescriptionTask) {
        descriptionTask.sendKeys(DescriptionTask);
        return this;
    }
}

