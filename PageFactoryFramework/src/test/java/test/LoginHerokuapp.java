package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.HerokuappLandingPage;
import page.HerokuappLoginPage;

public class LoginHerokuapp extends TestBase {
	
	@Test
	public void init() throws Exception{
		
		HerokuappLandingPage landingpage = PageFactory.initElements(driver, HerokuappLandingPage.class);
		landingpage.clickFormAuthLink();
		
		HerokuappLoginPage loginpage = PageFactory.initElements(driver, HerokuappLoginPage.class);
		loginpage.setUsrName("tomsmith");
		loginpage.setPassword("SuperSecretPassword!");
		loginpage.clickLoginButton();
		
	}

}
