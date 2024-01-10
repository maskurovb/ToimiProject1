package com.base;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.constants.Constant.Urls.TASKEE;

public class BaseTest {

    @AfterEach
    void close() {
        WebDriverRunner.closeWebDriver();
    }
    @BeforeEach
    public void initDriver() {
        Configuration.browser = Browsers.CHROME;
        open(TASKEE);
        getWebDriver().manage().window().maximize();
    }


}



