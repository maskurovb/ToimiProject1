//package com.page;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class ReportsPage  {
//
//    private final By buttonReports = By.xpath("//*[@id='root']/div[1]/ul/li[4]/a");
//    private final By buttonGeneral = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[1]/div[1]/span");
//    private final By buttonAllProjects = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[1]/div[1]/span");
//    private final By buttonUserOne = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div/span");
//    private final By buttonChooseDate = By.xpath("//*[@id='root']/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/div/input");
//    private final By buttonChooseDay = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[6]/div[1]");
//    private final By buttonChooseFinishDay = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]");
//    private final By buttonChooseEmployee = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[3]/div[1]");
//    private final By buttonChooseOneEmployee = By.xpath("//*[@id='root']/div[2]/div[5]/div[4]/section/div/div/div[1]/div[2]/div[3]/div[2]/div[3]/div[2]/div[2]/div");
//
//    public ReportsPage enterButtonReports() {
//        driver.findElement(buttonReports).click();
//        return this;
//    }
//    public ReportsPage enterButtonGeneral() {
//        driver.findElement(buttonGeneral).click();
//        return this;
//    }
//    public ReportsPage enterButtonAllProjects() {
//        driver.findElement(buttonAllProjects).click();
//        return this;
//    }
//    public ReportsPage enterButtonUserOne() {
//        driver.findElement(buttonUserOne).click();
//        return this;
//    }
//    public ReportsPage enterButtonChooseDate() {
//        driver.findElement(buttonChooseDate).click();
//        return this;
//    }
//    public ReportsPage inputButtonChooseDay() {
//        driver.findElement(buttonChooseDay).click();
//        return this;
//    }
//    public ReportsPage inputButtonChooseFinishDay() {
//        driver.findElement(buttonChooseFinishDay).click();
//        return this;
//    }
//    public ReportsPage enterButtonChooseEmployee() {
//        driver.findElement(buttonChooseEmployee).click();
//        return this;
//    }
//    public ReportsPage enterOneEmployee() {
//        driver.findElement(buttonChooseOneEmployee).click();
//        return this;
//    }
//}