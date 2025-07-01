package com.komal.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import scala.concurrent.duration.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.komal.utils.DriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrangeHRMSteps
 {
    private WebDriver driver = DriverManager.getDriver();
    //private WebDriver driver;

    /*public OrangeHRMSteps(DriverManager driverManager)
    {
        this.driver = driverManager.getDriver();
    }*/

@Given("User is on orange homepage")
public void user_is_on_orange_homepage()
 {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 }
@When("User enter {string} and {string}")
public void user_enter_and(String string, String string2)
 {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Username\"]")));
    driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Password\"]")));
    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");

    
 }
@When("click on Login button")
public void click_on_login_button() 
{
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
}
@Then("User should be navigate to dashboard")
public void user_should_be_navigate_to_dashboard()
 {
    System.out.println("Then Step");
 }
}
