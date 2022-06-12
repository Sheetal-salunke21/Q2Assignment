package com.shopB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopB.qa.baseclass.TestBase;

public class LoginPage extends TestBase{
	
	//Object repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="orgName")
	WebElement company;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\\\"content\\\"]/div/div[3]/div/section/div[1]/form/fieldset/div[4]/label/span")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\\\"content\\\"]/div/div[3]/div/section/div[1]/section/p/a")
	WebElement signup;	

	//Initializing page objects
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateloginPageTitle() {
		return driver.getTitle();
	}

	public LoginPage login(String un, String comp, String emailid) {
		
		username.sendKeys(un);
		username.sendKeys(comp);
		username.sendKeys(emailid);
		checkbox.click();
		signup.click();
		
		return new LoginPage();
	}
}
