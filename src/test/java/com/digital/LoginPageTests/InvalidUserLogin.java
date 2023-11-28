package com.digital.LoginPageTests;

import com.digital.BaseTest;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidUserLogin {
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("AUTH_URL"));
    }

    @Test
    void loginPageValidTest() {
        LoginPage loginPage = new LoginPage();
        String inValidUserLogin = "000000000";
        String validPassword = "1234567";
        String actualLogin = loginPage.loginInput.getAttribute("value");
        String actualPassword = loginPage.passwordInput.getAttribute("value");
        String expectedLogin = "(777) 33 37 44";
        String actualMessage = loginPage.errorMessage.getAttribute("innerText");
        String expectedMessage = "Неправильный логинпароль";

        loginPage
                .login(inValidUserLogin)
                .password(validPassword)
                .loginButton();

        Assert.assertEquals(actualLogin, expectedLogin);
        Assert.assertEquals(actualPassword, validPassword);
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
