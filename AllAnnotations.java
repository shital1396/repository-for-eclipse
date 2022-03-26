package testngex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {
  @Test
  public void T1() {
	  System.out.println("I m in T1");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I m in beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I m in aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I m in beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I m in Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	  System.out.println("I m in beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I m in afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I m in Beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I m in aftersuite");
  }

}
