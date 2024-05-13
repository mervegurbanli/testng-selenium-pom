package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="welcome")
    private WebElement welcomeMessage;

    @FindBy(id="menu_pim_viewModule")
    private WebElement pimTab;

    public String getWelcomeMessageText(){
        return welcomeMessage.getText();
    }

    public void clickPimTab(){
        pimTab.click();
    }
}
