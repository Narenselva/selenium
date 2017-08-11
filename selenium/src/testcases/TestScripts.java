package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScripts {
	WebDriver driver =  new ChromeDriver();
	WebElement firstWebElement=  driver.findElement(By.name("username"));
	public void waitforElement(){
	WebDriverWait webWait = new WebDriverWait(driver, 10);
	webWait.until(ExpectedConditions.visibilityOf(firstWebElement));
	}
}
