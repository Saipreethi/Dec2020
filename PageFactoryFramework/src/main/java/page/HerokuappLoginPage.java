package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HerokuappLoginPage {
 WebDriver driver;
 
 public HerokuappLoginPage(WebDriver driver) {
	 this.driver =  driver;
 }
 
 //Locators
 @FindBy(how=How.ID,id ="username") WebElement usrname;
 @FindBy(how=How.ID,id ="password") WebElement pwd;
 @FindBy(how=How.XPATH,using ="//button[@class='radius']") WebElement login;

 public void setUsrName(String str) {
	 usrname.sendKeys(str);
 }
 
 public void setPassword(String str) {
	 pwd.sendKeys(str);
 }
 
 public void clickLoginButton() {
	 login.click();
	 Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed(), "Login Successful");
 }
 
 }
