package com.page;
import com.codeborne.selenide.SelenideElement;
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
    private static final SelenideElement chooseStartDay = $x("//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--weekend']");
    private static final SelenideElement finishDate = $x("(//div[@class='select-date-calendar start-time-and-end-time__select-date-calendar'])[2]");
    private static final SelenideElement chooseFinishDay = $x("//div[@class='react-datepicker__day react-datepicker__day--031 react-datepicker__day--weekend']");
    private static final SelenideElement inputProjectTime = $x("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
    private static final SelenideElement createFinish = $x("(//button[@class='button button--action'])[2]");





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
    public ProjectsPage enterInputProjectTime(String projectTime){
        inputProjectTime.sendKeys(projectTime);
        return this;
    }
//    public ProjectsPage enterCreateFinish(){
//        createFinish.click();
//        return this;
//    }

    public String getChooseProjectSubGroup(){return chooseProjectSubGroup.getText();}
    public String getTitleButtonProject(){return buttonProject.getText();}

}














