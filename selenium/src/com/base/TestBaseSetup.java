package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class TestBaseSetup {
	private WebDriver driver;
	String broType;
	static String driverPath= "C:/Users/Narendiran/Downloads/chromedriver_win32/";
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(String browserType,String appUrl){
		broType=browserType;
		switch(broType){
		
		case "chrome":
			System.setProperty("WebDriver.chrome.driver", driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			
		case "firefox":
			System.out.println("fire fox initiation.");
		
		}
	
	}
	
	public  WebDriver initChromeDriver(){
		System.out.println("Initializing chromebrowser");
		System.setProperty("webdriver.chrome.driver",driverPath +"/chromedriver.exe");
		setDriver("chrome","http://toolsqa.com/");
		return driver;
			}
	
	public void launchBrowser(){
		initChromeDriver();
	}
	public static void main(String[] args) {
		TestBaseSetup obj =  new TestBaseSetup();
		obj.launchBrowser();
		obj.driver.quit();
 	}
	
	
	
}
