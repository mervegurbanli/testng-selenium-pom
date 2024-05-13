package com.orangeHRM.tests;

import com.orangeHRM.base.TestBase;
import com.orangeHRM.pages.HomePage;
import com.orangeHRM.pages.LoginPage;
import com.orangeHRM.testData.DataProviders;
import com.orangeHRM.testData.ExpectedMessages;
import com.orangeHRM.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends TestBase {

    @Test
    public void testLoginwithValidCredentials(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.login(PropertiesUtils.getUsername(),PropertiesUtils.getPassword());
        HomePage homePage=new HomePage(driver);
        String actualMessage= homePage.getWelcomeMessageText();
        Assert.assertEquals(actualMessage, ExpectedMessages.WELCOME_MESSAGE,"Login Verification failed!");
    }
    @Test(dataProviderClass = DataProviders.class, dataProvider = "Login Invalid Credentials")
    public void testLoginWithInvalidCredentials(String username, String password, String expectedErrorMessage){
    LoginPage loginPage=new LoginPage(driver);
    loginPage.login(username,password);
    Assert.assertEquals(loginPage.getErrorMessage(),expectedErrorMessage,"The error message verification failed");
    }
}
