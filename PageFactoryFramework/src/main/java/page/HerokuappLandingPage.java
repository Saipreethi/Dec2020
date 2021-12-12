package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HerokuappLandingPage {
	WebDriver driver;
	 
	 public HerokuappLandingPage(WebDriver driver) {
		 this.driver =  driver;
	 }
	 
	//Locators
	 @FindBy(how=How.XPATH,using ="//a[@href='/login']") WebElement formauth;
	 
	 public void clickFormAuthLink() {
		 formauth.click();
	 }
}
