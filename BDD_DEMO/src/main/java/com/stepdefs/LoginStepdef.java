package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepdef {






WebDriver driver;

@Given("^User should be on login page$")
public void user_should_be_on_login_page() throws Throwable {
  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
  driver= new ChromeDriver();
  driver.get("file:///C:/Users/hp/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
  
}

@When("^User enters valid credentials$")
public void user_enters_valid_credentials() throws Throwable {
  driver.findElement(By.id("email")).sendKeys("kiran@gamil.com");
  driver.findElement(By.id("password")).sendKeys("123456");
  driver.findElement(By.id("//button")).click();;
}

@Then("^User will be on Home page$")
public void user_will_be_on_Home_page() throws Throwable {
Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
  
}

@Then("^User should see JBK logo$")
public void user_should_see_JBK_logo() throws Throwable {
	WebElement logo = driver.findElement(By.tagName("img"));
	Assert.assertTrue(logo.isDisplayed());
  
}


}
