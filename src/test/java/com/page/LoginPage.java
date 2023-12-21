package com.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement inputUsername = $x("//input[@name='email']");
    private final SelenideElement inputPassword = $x("//input[@name='password']");
    private final SelenideElement buttonSingIn = $x("//div[@class='button-submit__hover']");

    public LoginPage selectUsername(String email) {
       inputUsername.sendKeys(email);
       return this;
    }
    public LoginPage selectPassword(String password) {
       inputPassword.sendKeys(password);
        return this;
    }

    public LoginPage enterSignIn() {
        buttonSingIn.submit();
        return this;
    }


}
