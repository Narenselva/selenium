package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestConfiguration {
	
	WebDriver driver;
	
public void launchChrome(){
	//System.setProperty(", value)
	driver = new ChromeDriver();
}

}
