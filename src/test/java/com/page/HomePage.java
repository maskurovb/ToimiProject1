package com.page;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private static final SelenideElement buttonCreateTask = $x("//div[@class='create-task-button__icon-circle-hover']");

    public HomePage enterButtonCreateTask() {
        buttonCreateTask.click();
        return this;
    }
}
