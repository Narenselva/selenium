package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestConfiguration {
	
	WebDriver driver;
	
public void launchChrome(){
	System.setProperty("webdriver.chrome.driver","C:/Users/Narendiran/Downloads/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	
}
@BeforeTest
public void setConfiuration(){
	launchChrome();
}


}
