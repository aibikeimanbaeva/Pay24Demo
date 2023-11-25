package com.digital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[text()='Сервисы']")
    public WebElement clickServiceMenu;

    @FindBy(xpath = "//div[@data-testid='payments']")
    public WebElement clickPaymentsMenu;

    public HomePage openPaymentsMenu() {
        elementActions.clickElement(clickServiceMenu);
        elementActions.clickElement(clickPaymentsMenu);
        return this;
    }


}
