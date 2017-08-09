package com.base;

import org.openqa.selenium.WebDriver;

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
//			driver = 
		
		}
	
	}
	
	public  WebDriver initChromeDriver(){
		System.out.println("Initializing chromebrowser");
		System.setProperty("webdriver.chrome.driver",driverPath +"/chromedriver.exe");
		return driver;
		
	}
	
}
