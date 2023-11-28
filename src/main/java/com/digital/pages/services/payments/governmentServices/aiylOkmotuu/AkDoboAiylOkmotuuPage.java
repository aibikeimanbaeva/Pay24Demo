package com.digital.pages.services.payments.governmentServices.aiylOkmotuu;

import com.digital.pages.BasePage;
import com.digital.pages.services.payments.educationAndSportCategory.GrowthAcademyPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AkDoboAiylOkmotuuPage extends BasePage {
    @FindBy(xpath = "//div[text()='Государственные услуги и штрафы']")
    public WebElement governmentServicesCategory;
    @FindBy(xpath = "//div[@data-testid='AjylOkmotu']")
    public WebElement aiylOkmotuCategory;
    @FindBy(xpath = "//div[@data-testid='AyilBank_AkDobo']")
    public WebElement clickAkDoboCategory;
    @FindBy(xpath = "//div[text()='Счет для списания']/..//div[text()='Mastercard']")
    public WebElement masterCardBlockText;
    @FindBy(xpath = "(//*[@id=\"root\"]//div[@data-testid='toolbarBtnID'])[4]")
    public WebElement clickBackInMasterCard;
    @FindBy(xpath = "(//div[text()='Введите ИНН']/following-sibling::div//input)[1]")
    public WebElement INNInp;
    @FindBy(xpath = "(//div[text()='ФИО']/following-sibling::div//input)[1]")
    public WebElement fullNameInp;
    @FindBy(xpath = "//div[text()='Выберите услуги']/following-sibling::div[1]")
    public WebElement clickTheService;
    @FindBy(xpath = "(//div[text()='Сумма']/following-sibling::div//input)[1]")
    public WebElement sumInp;
    @FindBy(xpath = "(//div[text()='Комментарий']/following-sibling::div//input)[1]")
    public WebElement commentsInp;
    @FindBy(xpath = "(//div[@data-testid='modalID'])//div[@dir='auto']")
    public List<WebElement> servicesList;
    @FindBy(xpath = "//div[text()='Далее']/..")
    public WebElement nextBtn;

    public AkDoboAiylOkmotuuPage openAiylOkmotuu(){
        elementActions.clickElement(governmentServicesCategory);
        elementActions.clickElement(aiylOkmotuCategory);
        return this;
    }
    public AkDoboAiylOkmotuuPage openAkDoboAiylOkmotuu(){
        elementActions.clickElement(clickAkDoboCategory);
        return this;
    }
    public AkDoboAiylOkmotuuPage clickToCard(){
        elementActions.clickElement(masterCardBlockText);
        elementActions.waitElementToBeClickable(clickBackInMasterCard);
        return this;
    }

    public AkDoboAiylOkmotuuPage fillUpTheINNInp(String txt){
        elementActions.writeText(INNInp,txt);
        return this;
    }
    public AkDoboAiylOkmotuuPage fillUpTheFullNameInp(String txt){
        elementActions.writeText(fullNameInp,txt);
        return this;
    }

    public AkDoboAiylOkmotuuPage clickToServicesInp(){
        elementActions.clickByJS(clickTheService);
        elementActions.clickToRandomElement(servicesList);
        return this;
    }

    public  AkDoboAiylOkmotuuPage fillUpTheSumInp(String txt){
        elementActions.writeText(sumInp,txt);
        return this;
    }

    public AkDoboAiylOkmotuuPage clickToNextBtn(){
        elementActions.clickElement(nextBtn);
        return this;
    }


}
