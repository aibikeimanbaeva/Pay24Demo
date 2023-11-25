package com.digital.pages.usersPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Study extends UserHomePage {

    @FindBy(xpath = "//div[@data-testid='ObrazovanieISport']")
    public WebElement fieldStudyAndSport;

    public Study clickStudyAndSport(){
        elementActions.clickElement(fieldStudyAndSport);
        return this;
    }
}
