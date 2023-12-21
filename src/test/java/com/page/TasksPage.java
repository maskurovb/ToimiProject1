//package com.page;
//
//import base.BasePage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class TasksPage extends BasePage {
//    public TasksPage(WebDriver driver) {super(driver);}
//
//    private final By buttonTask = By.xpath("(//a[@href='/my-tasks'])[1]");
//    private final By buttonAdd = By.xpath("//div[@class='button-add']");
//    private final By buttonCreate = By.xpath("(//span[@class='button__text'])[4]");
//    private final By inputTaskName = By.xpath("//textarea[@placeholder='Введите название задачи']");
//    private final By buttonChooseProject = By.xpath("//div[@class='icon icon--project']");
//    private final By buttonTest1 = By.xpath("//div[@class='dropdown__item'][1]");
//    private final By buttonUser = By.xpath("//span[@class='active']");
//    private final By buttonStatusSelect = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[2]/div[1]");
//    private final By buttonStatusChoose = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[2]/div[2]/div[3]/div[2]/div[3]/div/div");
//    private final By buttonChooseUser = By.xpath("//div[@class='dropdown__item-content']");
//    private final By selectTag = By.xpath("//button[@class='tag-add-button active']");
//    private final By chooseTag = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[3]/div[3]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/span");
//    private final By titleTextHomepage = By.xpath("(//a[@class='create-task__group-nav active'])[2]");
//    private final By buttonDate = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[2]/div/div[3]/div[1]/div/input");
//    private final By buttonDay = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[4]/div[2]/div/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]");
//    private final By buttonTime = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
//    private final By inputOur = By.xpath("//*[@id='root']/div[2]/div[4]/div[4]/section/div/div/div[5]/div/input");
//    private final By description = By.xpath("//*[@id='create-task-group-description']/div[1]/div/a[1]");
//    private final By descriptionCl = By.xpath("//*[@id='rdw-wrapper-2466']/div[2]/div/div/div");
//    private final By descriptionTask = By.xpath("//*[@id='rdw-wrapper-9277']/div[2]/div/div/div/div/div/div/span");
//
//
//
//
//    public TasksPage enterButtonTask(){
//        driver.findElement(buttonTask).click();
//        return this;
//    }
//    public TasksPage enterButtonAdd() {
//        driver.findElement(buttonAdd).click();
//        return this;
//    }
//    public TasksPage enterButtonCreate(){
//        driver.findElement(buttonCreate).click();
//        return this;
//    }
//    public TasksPage selectInputTaskName(String taskName){
//        driver.findElement(inputTaskName).sendKeys(taskName);
//        return this;
//    }
//    public TasksPage enterButtonChooseProject(){
//        driver.findElement(buttonChooseProject).click();
//        return this;
//    }
//    public TasksPage enterButtonTest1(){
//        driver.findElement(buttonTest1).click();
//        return this;
//    }
//    public TasksPage enterButtonUser(){
//        driver.findElement(buttonUser).click();
//        return this;
//    }
//    public TasksPage enterButtonChooseUser(){
//        driver.findElement(buttonChooseUser).click();
//        return this;
//    }
//    public TasksPage enterButtonStatusSelect(){
//        driver.findElement(buttonStatusSelect).click();
//        return this;
//    }
//    public TasksPage enterButtonStatusChoose(){
//        driver.findElement(buttonStatusChoose).click();
//        return this;
//    }
//    public TasksPage enterButtonSelectTag(){
//        driver.findElement(selectTag).click();
//        return this;
//    }
//    public TasksPage enterButtonChooseTag(){
//        driver.findElement(chooseTag).click();
//        return this;
//    }
//    public TasksPage enterButtonDate(){
//        driver.findElement(buttonDate).click();
//        return this;
//    }
//    public TasksPage enterButtonDay(){
//        driver.findElement(buttonDay).click();
//        return this;
//    }
//    public TasksPage enterButtonTime(){
//        driver.findElement(buttonTime).click();
//        return this;
//    }
//    public TasksPage selectInputOur(String taskOur){
//        driver.findElement(inputOur).sendKeys(taskOur);
//        return this;
//    }
//    public TasksPage enterButtonDescription(){
//        driver.findElement(description).click();
//        return this;
//    }
//    public TasksPage enterButtonDescriptionCl(){
//        driver.findElement(descriptionCl).click();
//        return this;
//    }
//    public TasksPage selectInputDescriptionTask(String DescriptionTask){
//        driver.findElement(descriptionTask).sendKeys(DescriptionTask);
//        return this;
//    }
//
//
//
//    public String getTitleTaskPage() {
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(titleTextHomepage));
//        return driver.findElement(titleTextHomepage).getText();
//    }
//    public String getTitleChooseProject(){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(buttonChooseProject));
//        return driver.findElement(buttonChooseProject).getText();
//    }
//    public String getButtonStatusSelect(){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(buttonStatusSelect));
//        return driver.findElement(buttonStatusSelect).getText();
//    }
//
//    public String getButtonChooseUser(){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(buttonChooseUser));
//        return driver.findElement(buttonChooseUser).getText();
//    }
//    public String getSelectTag(){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(selectTag));
//        return driver.findElement(selectTag).getText();
//    }
//    public String getButtonDay(){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(buttonDay));
//        return driver.findElement(buttonDay).getText();
//    }
//    public String getButtonTime(){
//        new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(buttonTime));
//        return driver.findElement(buttonTime).getText();
//    }
//    public String getInputOur(){
//        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(inputOur));
//        return driver.findElement(inputOur).getText();
//    }
//
//}
//
