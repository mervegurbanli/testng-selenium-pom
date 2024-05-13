package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // we create the constructor. The constructor itself will take a webdriver element,then we initialize the pageFactory.
    //This PageFactory will help me to connect or initialize the webElements the FindBy annotations
    // we make elements private bacause we want strict the usage of it. After making them private we create a public
    // method to be able to use those private elements

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
        @FindBy(id = "txtUsername")
        private WebElement usernameInputBox;

        @FindBy(id = "txtPassword")
        private WebElement passwordInputBox;

        @FindBy(id = "btnLogin")
        private WebElement loginButton;

        @FindBy(id = "spanMessage")
        private WebElement errorMessage;


        public void login (String username, String password){
                usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();

        }

        public String getErrorMessage(){
            return errorMessage.getText();
        }
}