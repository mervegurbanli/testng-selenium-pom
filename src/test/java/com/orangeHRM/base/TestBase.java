package com.orangeHRM.base;

import com.orangeHRM.utils.DriverUtils;
import com.orangeHRM.utils.PropertiesUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBase {

    protected WebDriver driver;

    @Parameters("browserType")
    @BeforeMethod
    public void setUp(String browserType) {

        driver= DriverUtils.getDriver(browserType);

        //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(PropertiesUtils.getBaseURL());

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
