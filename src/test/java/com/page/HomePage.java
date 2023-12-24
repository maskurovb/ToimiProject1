package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private static final SelenideElement buttonGeneral = $x("//*[@id='root']/div[1]/ul/li[1]/a");
    private static final SelenideElement buttonCreateTask = $x("//*[@id='root']/div[2]/div[2]/button/div");

    public HomePage enterButtonGeneral(){
        buttonGeneral.click();
        return this;
    }
    public HomePage enterButtonCreateTask(){
        buttonCreateTask.click();
        return this;
    }
}
