package com.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectsGroupPage {

    private static final SelenideElement buttonProject = $x("//*[@id='root']/div[1]/ul/li[3]/a");
    private static final SelenideElement createProject = $x("//div[@class='button-add']");
    private static final SelenideElement chooseProjectGroup = $x("(//div[@class='dropdown__item-content'])[1]");
    private static final SelenideElement inputProjectName = $x("//*[@id='root']/div[2]/div[3]/div[4]/div/section/div/div/div[1]/input");
    private static final SelenideElement buttonAddProject = $x("//div[@class='create-group-project__button-add-project']");
    private static final SelenideElement chooseProjectNameOne = $x("(//div[@class='dropdown__item-content'])[1]");
    private static final SelenideElement chooseProjectNameTwo = $x("(//div[@class='dropdown__item-content'])[2]");
    private static final SelenideElement createProjectFinish = $x("//button[@class='button button--action']");


    public ProjectsGroupPage enterButtonProject(){
        buttonProject.click();
        return this;
    }
    public ProjectsGroupPage enterCreateProject(){
        createProject.click();
        return this;
    }
    public ProjectsGroupPage enterChooseProjectGroup(){
        chooseProjectGroup.click();
        return this;
    }
    public ProjectsGroupPage enterInputProjectName(String ProjectGroupName){
        inputProjectName.sendKeys(ProjectGroupName);
        return this;
    }
    public ProjectsGroupPage enterButtonAddProject(){
        buttonAddProject.click();
        return this;
    }
    public ProjectsGroupPage enterChooseProjectNameOne(){
        chooseProjectNameOne.click();
        return this;
    }
    public ProjectsGroupPage enterChooseProjectNameTwo(){
        chooseProjectNameTwo.click();
        return this;
    }
    public ProjectsGroupPage enterCreateProjectFinish(){
        createProjectFinish.click();
        return this;
    }

}
//