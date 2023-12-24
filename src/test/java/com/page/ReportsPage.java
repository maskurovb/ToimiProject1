package com.page;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;


public class ReportsPage  {

    private static final SelenideElement buttonReports = $x("//*[@id='root']/div[1]/ul/li[4]/a");
    private static final SelenideElement buttonGeneral = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[1]/div[1]/span");
    private static final SelenideElement buttonAllProjects = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[1]/div[1]/span");
    private static final SelenideElement buttonUserOne = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div/span");
    private static final SelenideElement buttonChooseDate = $x("//*[@id='root']/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div/input");
    private static final SelenideElement buttonChooseDay = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[6]/div[1]");
    private static final SelenideElement buttonChooseFinishDay = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]");
    private static final SelenideElement buttonChooseEmployee = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[3]/div[1]");
    private static final SelenideElement buttonChooseOneEmployee = $x("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div[2]/div");

    public ReportsPage enterButtonReports() {
        buttonReports.click();
        return this;
    }
    public ReportsPage enterButtonGeneral() {
        buttonGeneral.click();
        return this;
    }
    public ReportsPage enterButtonAllProjects() {
        buttonAllProjects.click();
        return this;
    }
    public ReportsPage enterButtonUserOne() {
        buttonUserOne.click();
        return this;
    }
    public ReportsPage enterButtonChooseDate() {
        buttonChooseDate.click();
        return this;
    }
    public ReportsPage inputButtonChooseDay() {
        buttonChooseDay.click();
        return this;
    }
    public ReportsPage inputButtonChooseFinishDay() {
        buttonChooseFinishDay.click();
        return this;
    }
    public ReportsPage enterButtonChooseEmployee() {
        buttonChooseEmployee.click();
        return this;
    }
    public ReportsPage enterOneEmployee() {
        buttonChooseOneEmployee.click();
        return this;
    }
}
//