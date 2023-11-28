package com.digital.pages.services.payments.educationAndSportCategory;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GrowthAcademyPage extends BasePage {

    @FindBy(xpath = "//div[@data-testid='AcademiyaRosta_AcademiyaRosta']")
    public WebElement academiyaRostaCategory;
    @FindBy(xpath = "//div[text()='Счет для списания']/..//div[text()='Mastercard']")
    public WebElement masterCardBlockText;
    @FindBy(xpath = "//div[text()='Счет для списания']/../div[2]")
    public WebElement writeOffAccountsBlock;
    @FindBy(xpath = "(//div[@data-testid='debitCard_MasterCard'])[2]")
    public WebElement masterCardBlock;
    @FindBy(xpath = "(//div[text()='Введите ФИО']/following-sibling::div//input)[1]")
    public WebElement fullNameInp;
    @FindBy(xpath = "//div[text()='Выберите Область']/following-sibling::div[1]")
    public WebElement regionInp;
    @FindBy(xpath = "//div[text()='Подкатегория']/following-sibling::div[1]")
    public WebElement subcategoryInp;
    @FindBy(xpath = "(//div[text()='Сумма']/following-sibling::div//input)[1]")
    public WebElement sumInp;
    @FindBy(xpath = "(//div[text()='Комментарий']/following-sibling::div//input)[1]")
    public WebElement commentsInp;

    @FindBy(xpath = "(//div[@data-testid='SelectComponent0'])[2]//div[@dir='auto']")
    public List<WebElement> regionList;

    @FindBy(xpath = "(//div[@data-testid='SelectComponent1'])[2]//div[@dir='auto']")
    public List<WebElement> subcategoryList;

    @FindBy(xpath = "//div[text()='Далее']/..")
    public WebElement nextBtn;

    public GrowthAcademyPage openGrowthAcademyPage(){
        elementActions.clickElement(academiyaRostaCategory);
        return this;
    }
    public GrowthAcademyPage clickToWriteOffAccountsBlock(){
        elementActions.clickElement(writeOffAccountsBlock);
        return this;
    }

    public GrowthAcademyPage clickToCard(){
        elementActions.clickElement(masterCardBlock);
        return this;
    }

    public GrowthAcademyPage fillUpTheFullNameInp(String txt){
        elementActions.writeText(fullNameInp,txt);
        return this;
    }

    public GrowthAcademyPage clickToRegionInp(){
        elementActions.clickElement(regionInp);
        elementActions.clickToRandomElement(regionList);
        return this;
    }

    public GrowthAcademyPage clickToSubcategoryInp(){
        elementActions.clickElement(subcategoryInp);
        elementActions.clickToRandomElement(subcategoryList);
        return this;
    }
    public GrowthAcademyPage fillUpTheSumInp(String txt){
        elementActions.writeText(sumInp,txt);
        return this;
    }

    public GrowthAcademyPage clickToNextBtn(){
        elementActions.clickElement(nextBtn);
        return this;
    }





}
