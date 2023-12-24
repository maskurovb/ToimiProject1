package com.page;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {

    private static final SelenideElement buttonProject = $x("(//a[@href='/projects'])[1]");
    private static final SelenideElement buttonCreateProject = $x("//div[@class='button-top-settings']");
    private static final SelenideElement buttonProjectOne = $x("//*[@id='button-add']/div[2]/div[3]/div[2]/div[2]/div/span[1]");
    private static final SelenideElement inputProjectName = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[1]/input");
    private static final SelenideElement buttonProjectChooseGroup = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[1]/div[1]/div/span");
    private static final SelenideElement buttonProjectChooseGroupName = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[1]/div[2]/div[3]/div[2]/div[1]/div");
    private static final SelenideElement buttonSelectUser = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[2]/div[1]");
    private static final SelenideElement buttonSelectUserName = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[2]/div[2]/div[3]/div[2]/div[2]/div/a");
    private static final SelenideElement buttonProjectDateStart = $x("//input[@placeholder='Выбрать время начала']");
    private static final SelenideElement buttonProjectChooseDateStart = $x("//div[@aria-label='Choose воскресенье, 31 декабря 2023 г.']");
    private static final SelenideElement buttonProjectDateFinish = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[3]/div/div[3]/div[1]/div/input");
    private static final SelenideElement inputSetTime = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
    private static final SelenideElement create = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[2]/button");




    public ProjectsPage enterButtonProject() {
        buttonProject.click();
        return this;
    }
    public ProjectsPage buttonCreateProject() {
        buttonCreateProject.click();
        return this;
    }
    public ProjectsPage buttonCreateProjectOne() {
        buttonProjectOne.click();
        return this;
    }
    public ProjectsPage selectInputProjectName(String ProjectName) {
        inputProjectName.sendKeys(ProjectName);
        return this;
    }
    public ProjectsPage enterProjectChooseGroup(){
        buttonProjectChooseGroup.click();
        return this;
    }
    public ProjectsPage enterButtonProjectChooseGroupName(){
        buttonProjectChooseGroupName.click();
        return this;
    }
    public ProjectsPage enterButtonSelectUser(){
        buttonSelectUser.click();
        return this;
    }
    public ProjectsPage enterButtonSelectUserName(){
        buttonSelectUserName.click();
        return this;
    }
    public ProjectsPage enterButtonDateStart() {
        buttonProjectDateStart.click();
        return this;
    }
    public ProjectsPage enterButtonProjectChooseDateStart() {
        buttonProjectChooseDateStart.click();
        return this;
    }
    public ProjectsPage enterButtonDateFinish() {
        buttonProjectDateFinish.click();
        return this;
    }
    public ProjectsPage inputProjectSetTime(String projectTime) {
        inputSetTime.sendKeys(projectTime);
        return this;
    }
    public ProjectsPage buttonCreate(){
        create.click();
        return this;
    }
}

//

//    public String getTitleButtonProject(){return buttonProject.getText();}
//    public String getTitleButtonCreateProject(){return (buttonCreateProject).getText();}
//    public  String getTitleButtonChooseStatus(){return (buttonChooseStatus).getText();}
//    public String getTitleButtonChooseGroup(){return buttonChooseGroup.getText();}



