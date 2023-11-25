package com.digital;

import com.digital.pages.usersPage.Study;
import com.digital.pages.HomePage;
import com.digital.pages.usersPage.UserHomePage;
import org.testng.annotations.BeforeClass;

public class UserHomePageTest extends BaseTest{
    public HomePage homePage;
    public Study study;

@BeforeClass
    void setHomePage() {
        userHomePage = new UserHomePage();
        homePage = new HomePage();
        homePage.openPaymentsMenu();
        study = new Study();


    }
}
