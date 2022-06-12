package com.shopB.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopB.qa.baseclass.TestBase;

public class EmailVerification extends TestBase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="pssword")
	WebElement password;

public EmailVerification() {
	PageFactory.initElements(driver, this);
	}
	public String validateEmailPageTitle() {
		return driver.getTitle();
	}

	public EmailVerification emailvar(String unm, String pwd) {
		
		username.sendKeys(unm); // showing restriction so cannot proceed. 
		username.sendKeys(pwd);
		//signup.click();
		
		return new EmailVerification();
	}
}