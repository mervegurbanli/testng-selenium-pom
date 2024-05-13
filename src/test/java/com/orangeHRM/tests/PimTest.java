package com.orangeHRM.tests;

import com.orangeHRM.base.TestBase;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.pages.PimPage;
import com.orangeHRM.testData.ExpectedMessages;
import com.orangeHRM.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PimTest extends TestBase {


    @Test
    public void verifyPimPageHeader(){
        LoginPage loginPage=new LoginPage(driver);
       loginPage.login(PropertiesUtils.getUsername(),PropertiesUtils.getPassword());
        HomePage hp=new HomePage(driver);
        hp.clickPimTab();
        PimPage pimPage=new PimPage(driver);
        Assert.assertEquals(pimPage.getHeaderText(), ExpectedMessages.PIM_HEADER,"Pim Header Verification failed");
    }
}
