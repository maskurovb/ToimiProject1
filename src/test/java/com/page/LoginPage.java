package com.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private static final SelenideElement inputUsername = $x("//input[@name='email']");
    private static final SelenideElement inputPassword = $x("//input[@name='password']");
    private static final SelenideElement buttonSingIn = $x("//div[@class='button-submit__hover']");

    private static final SelenideElement userNameError = $x("//div[@class='input-error-message']");
    private static final SelenideElement userNotFound = $x("//*[@id='root']/div/form/a");
    private static final SelenideElement inputErrorMessage = $x("//div[@class='input-error-message']");
    private static final SelenideElement forgotPassword = $x("//div[@class='input-error-message']");

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
    public LoginPage enterForgotPassword() {
        userNotFound.click();
        return this;
    }
    public LoginPage buttonInputErrorMessage() {
        inputErrorMessage.click();
        return this;
    }
    public LoginPage buttonForgotPassword() {
        forgotPassword.click();
        return this;
    }



    public String getTitleInputUsername() {return userNameError.getText();}
    public String getEnterForgotPassword() {return userNotFound.getText();}
    public String getButtonInputErrorMessage() {return inputErrorMessage.getText();}
    public String getButtonForgotPassword() {return forgotPassword.getText();}
}
