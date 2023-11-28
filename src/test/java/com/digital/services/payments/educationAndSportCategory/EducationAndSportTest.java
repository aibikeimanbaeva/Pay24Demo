package com.digital.services.payments.educationAndSportCategory;

import com.digital.BaseTest;
import com.digital.pages.services.payments.educationAndSportCategory.GrowthAcademyPage;
import org.testng.annotations.BeforeClass;


public class EducationAndSportTest extends BaseTest {
    public GrowthAcademyPage growthAcademyPage;


    @BeforeClass
    public void openEducationAndSport(){
        growthAcademyPage = new GrowthAcademyPage();
        homePage.openPaymentsMenu();
    };

}
