package com.com.testworkout;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class XpathValidations {
static String driverPath = "C:/Users/Narendiran/Downloads/chromedriver_win321/";
	
	public WebDriver driver;
	WebDriverWait wait;
//  @Test
//  public void f() {
//  }
 public void initateWait(){
	 wait = new WebDriverWait(this.driver, 20);
	}
 @Test(priority = 1)
  public void launchBrowser() {
	 
	  driver.get("https://addons.mozilla.org/en-us/firefox/addon/firepath/");
	  
	
  }
 @Test(priority = 2,enabled=false)
  public void verfyHomrPage(){
	 //Assert.assertEquals("toolsqa", driver.getTitle());
	assertEquals("QA Automation Tools Tutorial", driver.getTitle());
	 System.out.println(driver.getTitle());
	 
  }
  @BeforeClass
  public void setDriver(){
	  System.setProperty("webdriver.chrome.driver", driverPath + "/chromedriver.exe");
	  driver = new ChromeDriver();
  }
  @Test(priority = 3)
  public void navigateToMozillaHomePage(){
	  driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/a")).click();
	  //driver.navigate().to(url);
  }
 
  @AfterClass
  public void closeBrowser(){
	  driver.quit();
	  
  }
}
