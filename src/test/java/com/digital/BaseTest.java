package com.digital;

import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import com.digital.pages.services.payments.governmentServices.aiylOkmotuu.AkDoboAiylOkmotuuPage;
import com.digital.services.payments.educationAndSportCategory.EducationAndSportTest;
import com.digital.services.payments.govermentServises.aiylOkmotuu.AkDoboAiylOkmotuuTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public abstract class BaseTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;
    public EducationAndSportTest educationAndSportTest;
    public ElementActions elementActions;
    public AkDoboAiylOkmotuuTest akDoboAiylOkmotuuTest;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        loginPage = new LoginPage();
        driver.get(ConfigReader.getProperty("BASE_URL"));
        loginPage.loginIn();
        homePage = new HomePage();
        elementActions = new ElementActions();
        educationAndSportTest = new EducationAndSportTest();
        akDoboAiylOkmotuuTest= new AkDoboAiylOkmotuuTest();



    }

//    @AfterClass(alwaysRun = true)
//    public void tearDown() {
//        Driver.closeDriver();
//    }


}
