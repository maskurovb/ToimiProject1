package com.base;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {

    @AfterEach
    void close() {
        WebDriverRunner.closeWebDriver();
    }
}
