package com.com.testworkout;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class NewTest {
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
	 
	  driver.get("http://www.toolsqa.com");
	  
	
  }
 @Test(priority = 2)
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
  public void navigateToToolsPage() throws InterruptedException{
	  //driver.findElement(By.xpath("//*[@id=primary-menu']/li[3]/a/span[1]/span/span"));
	  
	WebElement imgToolsQa;
	imgToolsQa = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/a/img")));
	imgToolsQa.click();
//	  driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/a/img")).click();
	//*[@id="page"]/div[1]/header/div[1]/a/img
  }
  @AfterClass
  public void closeBrowser(){
	  driver.quit();
	  
  }

}
