package com.digital.pages.services.payments.governmentServices.aiylOkmotuu;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage  extends BasePage {
    @FindBy(xpath = "//div[text()='Государственные услуги и штрафы']")
    public WebElement governmentServicesCategory;

    public PaymentsPage openGovernmentServicesCategory(){
        elementActions.clickElement(governmentServicesCategory);
        return this;
    }
}
