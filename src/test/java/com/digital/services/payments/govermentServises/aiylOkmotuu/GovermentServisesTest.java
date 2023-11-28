package com.digital.services.payments.govermentServises.aiylOkmotuu;

import com.digital.BaseTest;
import com.digital.pages.services.payments.educationAndSportCategory.GrowthAcademyPage;
import com.digital.pages.services.payments.governmentServices.aiylOkmotuu.AkDoboAiylOkmotuuPage;
import org.testng.annotations.BeforeClass;

public class GovermentServisesTest extends BaseTest {
    public AkDoboAiylOkmotuuPage akDoboAiylOkmotuuPage;


    @BeforeClass
    public void openEducationAndSport(){
        akDoboAiylOkmotuuPage = new AkDoboAiylOkmotuuPage();
        homePage.openPaymentsMenu();
    };
}
