package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private static final SelenideElement buttonCreateTask = $x("//*[@id='root']/div[2]/div[2]/button/div");

    public HomePage enterButtonCreateTask() throws InterruptedException {
        Thread.sleep(4000);
        buttonCreateTask.click();
        return this;
    }
}
//