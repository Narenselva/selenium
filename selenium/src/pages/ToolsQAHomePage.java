package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQAHomePage {

	WebDriver driver;

	By tutorialLink = By.xpath("//*[@id='primary-menu']/li[2]/a/span[1]/span/span");
	By webAutomationtools = By.xpath("//*[@id='primary-menu']/li[2]/ul/li[2]/a/span[1]/span/span");
	By seleniumInJava = By.xpath("//*[@id='primary-menu']/li[2]/ul/li[2]/ul/li[3]/a/span[1]/span/span");
	//*[@id="primary-menu"]/li[2]/ul/li[2]/ul/li[3]/a/span[1]/span/span
	public ToolsQAHomePage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void clickOnTutorialLink() {
		driver.findElement(tutorialLink).click();

	}

	public void clickOnWebAutomationTools() {
		driver.findElement(webAutomationtools).click();
	}
	public void clickOnSeleniumInJava(){
		driver.findElement(seleniumInJava).click();
	}
}
// *[@id="primary-menu"]/li[2]/ul/li[2]/a/span[1]/span/span