package com.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$x;

public class ProjectsPage {

    private final SelenideElement buttonProject = $x("//*[@id='root']/div[1]/ul/li[3]/a");
    private final SelenideElement buttonCreateProject = $x("//div[@class='button-top-settings']");
    private final SelenideElement buttonProjectOne =$x("//*[@id='button-add']/div[2]/div[3]/div[2]/div[2]/div/span[1]");
    private final SelenideElement inputProjectName = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[1]/input");
    private final SelenideElement buttonChooseStatus = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[2]/div");
    private final SelenideElement buttonStatusType = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[2]/div[2]/div[3]/div[2]/div[1]/div/div/span");
    private final SelenideElement buttonChooseGroup = $x("//div[@class='create-project-select-group']");
    private final SelenideElement buttonGroupName = $x("//div[@class='create-project-select-group__selected']");
    private final SelenideElement buttonProjectDateStart = $x("//input[@placeholder='Выбрать время начала']");
    private final SelenideElement buttonProjectChooseDateStart =$x("//div[@aria-label='Choose воскресенье, 31 декабря 2023 г.']");
    private final SelenideElement buttonProjectDateFinish =$x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[3]/div/div[3]/div[1]/div/input");
    private final SelenideElement buttonProjectChooseDateFinish = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[3]/div/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]");
    private final SelenideElement inputSetTime = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");


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
    public ProjectsPage enterButtonStatus() {
        buttonChooseStatus.click();
        return this;
    }
    public ProjectsPage enterButtonStatusType() {
        buttonStatusType.click();
        return this;
    }
    public ProjectsPage enterButtonChooseGroup() {
        buttonChooseGroup.click();
        return this;
    }
    public ProjectsPage enterButtonGroupName() {
        buttonGroupName.click();
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
    public ProjectsPage enterButtonProjectChooseDateFinish() {
        buttonProjectChooseDateFinish.click();
        return this;
    }
    public ProjectsPage inputProjectSetTime(String projectTime) {
        inputSetTime.sendKeys(projectTime);
        return this;
    }




    public String getTitleButtonProject(){
        return buttonProject.getText();
    }
    public String getTitleButtonCreateProject(){
        return (buttonCreateProject).getText();
    }
    public  String getTitleButtonChooseStatus(){
        return (buttonChooseStatus).getText();
    }
    public String getTitleButtonChooseGroup(){
        return buttonChooseGroup.getText();
    }

}

