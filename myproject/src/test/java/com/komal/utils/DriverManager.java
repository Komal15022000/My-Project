package com.komal.utils;
import org.openqa.selenium.WebDriver;

public class DriverManager
{
    private WebDriver driver;

    public DriverManager()
    {
        
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public void setDriver(WebDriver driver)
    {
        this.driver = driver;

    }

}
