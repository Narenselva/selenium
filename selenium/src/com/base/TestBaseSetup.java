package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import pages.ToolsQAHomePage;
import testcases.HomePageValidation;

public class TestBaseSetup {
	private static WebDriver driver;
	String broType;
	static String driverPath = "C:/Users/Narendiran/Downloads/chromedriver_win321/";

	// *[@id="primary-menu"]/li[2]/ul/li[2]/a/span[1]/span/span
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(String browserType, String appUrl) {
		broType = browserType;
		switch (broType) {

		case "chrome":
			// System.setProperty("WebDriver.chrome.driver",
			// driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(appUrl);

		case "firefox":
			System.out.println("fire fox initiation.");

		}

	}

	public WebDriver initChromeDriver() {
		System.out.println("Initializing chromebrowser");
		System.setProperty("webdriver.chrome.driver", driverPath + "/chromedriver.exe");
		setDriver("chrome", "https://www.toolsqa.com");
		return driver;
	}

	public void launchBrowser() {
		driver = initChromeDriver();
	}

	public static void main(String[] args) {
		TestBaseSetup obj = new TestBaseSetup();
		obj.launchBrowser();
		HomePageValidation hp = new HomePageValidation();
		hp.navigateToTutorail(driver);

	}

}
