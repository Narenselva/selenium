package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.ToolsQAHomePage;

public class HomePageValidation {

	public void navigateToTutorail(WebDriver driver) {
		ToolsQAHomePage tqa = new ToolsQAHomePage(driver);
		tqa.clickOnTutorialLink();
		tqa.clickOnWebAutomationTools();
		tqa.clickOnSeleniumInJava();
	}
}
