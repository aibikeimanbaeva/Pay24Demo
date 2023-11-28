package com.digital.pages.services.payments.educationAndSportCategory;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage extends BasePage {
    @FindBy(xpath = "//div[text()='Образование и спорт']")
    public WebElement educationAndSportCategory;

    public PaymentsPage openEducationAndSportCategory(){
        elementActions.clickElement(educationAndSportCategory);
        return this;
    }
}
