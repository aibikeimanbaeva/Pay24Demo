package com.digital.services.payments.educationAndSportCategory;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GrowthAcademyPageTest extends  EducationAndSportTest{

    @BeforeClass
    public void openPage(){
        growthAcademyPage.openGrowthAcademyPage();
    }

    @Test(priority = 1)
    public void checkWriteOffAccountsBlock(){
        growthAcademyPage.clickToWriteOffAccountsBlock()
                .clickToCard();
        Assert.assertTrue(growthAcademyPage.masterCardBlockText.getText().contains("Mastercard"));
    };

    @Test(priority = 2)
    public void checkFullNameInp(){
        growthAcademyPage.fillUpTheFullNameInp("Aibike Imanbaeva");
        Assert.assertEquals(growthAcademyPage.fullNameInp.getAttribute("innerText"),"Aibike Imanbaeva");
    };

    @Test(priority = 3)
    public void checkRegionInp(){
        growthAcademyPage.clickToRegionInp();
        Assert.assertNotNull(growthAcademyPage.regionInp.getText());
    }

    @Test(priority = 4)
    public void checkSubcategoryInp(){
        growthAcademyPage.clickToSubcategoryInp();
        Assert.assertNotNull(growthAcademyPage.subcategoryInp.getText());
    }

    @Test(priority = 5)
    public void checkSumInp(){
        growthAcademyPage.fillUpTheSumInp("200");
        Assert.assertEquals(growthAcademyPage.sumInp,"200");
    }

}
