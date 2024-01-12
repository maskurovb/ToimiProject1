package com.tests;

import com.base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.page.LoginPage;
import com.selenoid.BrowserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.constants.Constant.Urls.TASKEE;

@BrowserType(browser = BrowserType.Browser.CHROME, isRemote = false)
@Tag("UI")

public class LoginTest extends BaseTest {
    private final LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void login() {
        Selenide.open(TASKEE);}



    @Test
    public void chekIsRedirect() {
        loginPage.selectUsername("test22@toimi.pro")
                .selectPassword("3125");

        Assertions.assertEquals("Забыли пароль?", loginPage.getEnterForgotPassword());

        loginPage.enterSignIn();
    }

    @Test
    public void checkRedirectError() {
        loginPage.selectUsername("test122@oimi.pro")
                .selectPassword("3125")
                .enterSignIn();
        Assertions.assertEquals("Пользователь не найден", loginPage.getTitleInputUsername());
    }

    @Test
    public void errorMail() {
        loginPage.selectUsername("test122oimi.pro")
                .selectPassword("3125")
                .enterSignIn();
        Assertions.assertEquals("Введите действительный адрес электронной почты", loginPage.getButtonInputErrorMessage());
    }

    @Test
    public void forgotPassword() {
        loginPage.selectUsername("test22@toimi.pro")
                .selectPassword("312")
                .enterSignIn();
        Assertions.assertEquals("Email или пароль неверны", loginPage.getButtonForgotPassword());
    }


    }

