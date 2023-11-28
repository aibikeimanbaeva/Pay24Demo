package com.digital.LoginPageTests;

import com.digital.BaseTest;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.services.payments.educationAndSportCategory.EducationAndSportTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidPasswordLogIn{
    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("AUTH_URL"));
    }

    @Test
    void loginPageValidTest(){
        LoginPage loginPage = new LoginPage();
        String validUserLogin = "777333744";
        String inValidPassword = "0123456";
        String actualLogin = loginPage.loginInput.getAttribute("value");
        String actualPassword = loginPage.passwordInput.getAttribute("value");
        String expectedLogin = "(777) 33 37 44";
        String actualMessage = loginPage.errorMessage.getAttribute("innerText");
        String expectedMessage = "Неправильный логинпароль";

        loginPage
                .login(validUserLogin)
                .password(inValidPassword)
                .loginButton();

        Assert.assertEquals(actualLogin, expectedLogin);
        Assert.assertEquals(actualPassword, inValidPassword);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
