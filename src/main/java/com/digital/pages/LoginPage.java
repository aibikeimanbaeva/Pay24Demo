package com.digital.pages;

import com.digital.enums.UserCredentials;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//div[@data-testid='enter']")
    public WebElement enterLoginPage;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@autocorrect='off']")
    public WebElement passwordInput;

    @FindBy(xpath = "//div[@data-testid='loginSubmit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@data-testid='error_message']")
    public WebElement errorMessage;

//    @FindBy(xpath = "div [@class='css-901oao']")
//    public WebElement element;

    public LoginPage loginIn() {
        elementActions.clickElement(enterLoginPage);
        elementActions.writeText(loginInput, UserCredentials.ADMIN.getUsername());
        elementActions.writeText(passwordInput, UserCredentials.ADMIN.getPassword());
        elementActions.clickElement(submitBtn);
        return this;
    }

    public LoginPage goToLoginPage(){
        elementActions.moveToElement(enterLoginPage).clickElement(enterLoginPage);
        return this;
    }

    public LoginPage login(String loginPhoneNumber){
        elementActions.writeText(loginInput, loginPhoneNumber);
        return this;
    }

    public LoginPage password(String pass){
        elementActions.writeText(passwordInput, pass);
        return this;
    }

    public LoginPage loginButton(){
        elementActions.clickElement(submitBtn);
        return this;
    }

}
