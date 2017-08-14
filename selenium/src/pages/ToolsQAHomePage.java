package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQAHomePage {

	WebDriver driver;
	
	By tutorialLink = By.xpath("//*[@id='primary-menu']/li[2]/a/span[1]/span/span");
	
	public ToolsQAHomePage(WebDriver driver) {
		this.driver  = driver;
		// TODO Auto-generated constructor stub
	} 
	
	public void clicOnTutorialLink(){
		driver.findElement(tutorialLink);
		
	}
}
