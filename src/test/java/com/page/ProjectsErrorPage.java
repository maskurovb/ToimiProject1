package com.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectsErrorPage {

    private static final SelenideElement buttonProject2 = $x("//*[@id='root']/div[1]/ul/li[3]/a");
    private static final SelenideElement createProject2 = $x("//div[@class='button-add']");
    private static final SelenideElement chooseProjectGroup2 = $x("(//div[@class='dropdown__item-content'])[2]");
    private static final SelenideElement inputProjectName2 = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[1]/input");
    private static final SelenideElement chooseProjectSubGroup2 = $x("//div[@class='create-project-select-group']");
    private static final SelenideElement chooseProjectGroupName2 = $x("(//div[@class='dropdown__item-content'])[1]");
    private static final SelenideElement selectUser2 = $x("//div[@class='create-project__created-user']");
    private static final SelenideElement selectUserName2 = $x("(//div[@class='dropdown__item'])[1]");
    private static final SelenideElement selectUserName3 = $x("(//div[@class='dropdown__item-content'])[2]");
    private static final SelenideElement selectUserName4 = $x("(//div[@class='dropdown__item-content'])[3]");
    private static final SelenideElement selectUserName5 = $x("(//div[@class='dropdown__item-content'])[4]");

    private static final SelenideElement inputProjectTime2 = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");

    private static final SelenideElement buttonProjectsTagsGroup = $x("//*[@id='create-project-group-tags']/div[2]/div/div[2]/button");
    private static final SelenideElement projectsTagsGroupName = $x("//input[@placeholder='Название группы']");
    private static final SelenideElement addTagsFinal = $x("//*[@id='create-project-group-tags']/div[2]/div/div[2]/div/div[3]/button[2]");

    private static final SelenideElement addStatus = $x("//div[@class='statuses-edit-list__add-button']");
    private static final SelenideElement statusGroupName = $x("//*[@id='create-project-group-statuses']/div[2]/div[2]/form/div[1]/input");


    public ProjectsErrorPage enterButtonProject2() {
        buttonProject2.click();
        return this;
    }
    public ProjectsErrorPage enterCreateProject2() {
        createProject2.click();
        return this;
    }
    public ProjectsErrorPage enterChooseProjectGroup2() {
        chooseProjectGroup2.click();
        return this;
    }
    public ProjectsErrorPage enterInputProjectName2(String ProjectName2) {
        inputProjectName2.sendKeys(ProjectName2);
        return this;
    }
    public ProjectsErrorPage enterChooseProjectSubGroup2() {
        chooseProjectSubGroup2.click();
        return this;
    }
    public ProjectsErrorPage enterChooseProjectGroupName2() {
        chooseProjectGroupName2.click();
        return this;
    }
    public ProjectsErrorPage enterSelectUser2() {
        selectUser2.click();
        return this;
    }
    public ProjectsErrorPage enterSelectUserName2() {
        selectUserName2.click();
        return this;
    }
    public ProjectsErrorPage enterSelectUserName3() {
        selectUserName3.click();
        return this;
    }
    public ProjectsErrorPage enterSelectUserName4() {
        selectUserName4.click();
        return this;
    }
    public ProjectsErrorPage enterSelectUserName5() {
        selectUserName5.click();
        return this;
    }
    public ProjectsErrorPage enterInputProjectTime2(String projectTime2) {
        inputProjectTime2.sendKeys(projectTime2);
        return this;
    }
    public ProjectsErrorPage enterButtonProjectsTagsGroup() {
        buttonProjectsTagsGroup.click();
        return this;
    }
    public ProjectsErrorPage enterProjectsTagsGroupName(String TagsName) {
        projectsTagsGroupName.sendKeys(TagsName);
        return this;
    }
    public ProjectsErrorPage enterAddTagsFinal() {
        addTagsFinal.click();
        return this;
    }
    public ProjectsErrorPage enterAddStatus() {
        addStatus.click();
        return this;
    }
    public ProjectsErrorPage enterStatusGroupName(String StatusName) {
        statusGroupName.sendKeys(StatusName);
        return this;
    }
}
