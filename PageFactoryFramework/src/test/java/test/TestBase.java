package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver ;
	
	@BeforeSuite
	public void initialize() throws IOException{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Software\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
	}
	
	@AfterMethod
	public void tearDownTest() {
		TestBase.driver.quit();
	}
	
	
}
