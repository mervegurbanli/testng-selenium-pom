package com.orangeHRM.testData;

import org.testng.annotations.DataProvider;

public class DataProviders {

@DataProvider(name = "Login Invalid Credentials")
    public Object[][] getInvalidCredentials(){
        Object[][] obj=new Object[][]{
               {"invalid","invalid",ExpectedErrorMessages.INVALID_CREDENTIAL},   //for invalid credentials
                {"","invalid",ExpectedErrorMessages.EMPTY_USERNAME},     // for empty username
                {"invalid","",ExpectedErrorMessages.EMPTY_PASSWORD}      // for empty username

        };
        return obj;
    }
}
