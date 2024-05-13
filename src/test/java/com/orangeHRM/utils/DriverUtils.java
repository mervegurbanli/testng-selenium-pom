package com.orangeHRM.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverUtils {

    public static WebDriver getDriver(String browserType){
        switch (browserType) {
            case "firefox" -> {
                return new FirefoxDriver();
            }
            case "edge" -> {
                return new EdgeDriver();
            }
            case "safari" -> {
                return new SafariDriver();
            }
            default -> {
                return new ChromeDriver();
            }
        }
    }
}
