package com.ShopB.qa.TestCases;
import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.shopB.qa.baseclass.TestBase;
import com.shopB.qa.pages.EmailVerification;
import com.shopB.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	//Global variable initialization
	LoginPage loginpage;
	EmailVerification emailver;
	
	public LoginPageTest() {
		
		//Calling super class construction
		super();
		
	}
	
	@BeforeMethod
	public void  setUp() {
		initialization();
		loginpage =new LoginPage();
		}
	
		@Test(priority=1)
		public void loginPageTitleTest() {
			
		//Checking the title of login page
		String title=loginpage.validateloginPageTitle();
		Assert.assertEquals(title, "Jabatalks");
		}
		
		@Test(priority=2)
		public void loginTest() {
			loginpage.login(prop.getProperty("username"), prop.getProperty("company"), prop.getProperty("email"));
		}
		@Test(priority=3)
		public void verificationTest() {
			emailver.emailvar(prop.getProperty("email"),  prop.getProperty("password"));
		}
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	
	}

}
